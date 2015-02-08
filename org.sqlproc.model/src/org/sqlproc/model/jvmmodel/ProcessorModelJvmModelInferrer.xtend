package org.sqlproc.model.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.sqlproc.model.processorModel.Package
import org.eclipse.xtext.naming.IQualifiedNameProvider
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.sqlproc.model.processorModel.PojoEntity
import org.sqlproc.model.processorModel.AnnotatedEntity
import org.sqlproc.model.processorModel.EnumEntity
import org.sqlproc.model.processorModel.EnumAttributeDirectiveValues
import org.sqlproc.model.processorModel.DaoEntity

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class ProcessorModelJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ProcessorGeneratorUtils

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	 
   	def dispatch void infer(PojoEntity entity, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(entity.toClass(entity.fullyQualifiedName)) [
   			documentation = entity.documentation
   			addAnnotations(entity.annotations.map[a|a.annotation])
   			if (entity.superType != null)
   				superTypes += entity.superType.cloneWithProxies
   				
   			for (attr : entity.attributes) {
   				val type = attr.type ?: attr.initExpr?.inferredType ?: typeRef(String)
   				members += attr.toField(attr.name, type) [
   					documentation = attr.documentation
   					addAnnotations(attr.annotations.map[a|a.annotation])
 					initializer = attr.initExpr
   				]
   			}
   		]
   	}

   	def dispatch void infer(EnumEntity entity, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(entity.toEnumerationType(entity.fullyQualifiedName) []) [
   			documentation = entity.documentation
   			addAnnotations(entity.annotations.map[a|a.annotation])

			for (dir : entity.attribute.directives) {
				if (dir instanceof EnumAttributeDirectiveValues) {
					val dv = dir as EnumAttributeDirectiveValues
					for (epv : dv.values)
						members += entity.toEnumerationLiteral(epv.name)
				}
			}   				
   		]
   	}

	 
   	def dispatch void infer(DaoEntity entity, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(entity.toClass(entity.fullyQualifiedName)) [
   			documentation = entity.documentation
   			addAnnotations(entity.annotations.map[a|a.annotation])
   			if (entity.superType != null)
   				superTypes += entity.superType.cloneWithProxies
   		]
   	}
}

