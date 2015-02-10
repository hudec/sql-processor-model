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
import org.sqlproc.model.processorModel.EnumAttributeValue
import java.util.List
import org.eclipse.xtext.xbase.XStringLiteral
import org.eclipse.xtext.xbase.XNumberLiteral
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmMember
import org.sqlproc.model.processorModel.PojoAttribute
import org.eclipse.xtext.common.types.JvmTypeReference

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
	@Inject extension ProcessorTypesBuilder
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
   		val entityType = entity.toClass(entity.fullyQualifiedName)
   		val sernum = entity.sernum
   		acceptor.accept(entityType) [
   			documentation = entity.documentation
   			if (entity.isAbstract)
   				abstract = true
   			for (an : entity.standardAnnotations.map[a|a.annotation]) {
   				if (an.annotationType.identifier == 'java.io.Serializable') {
   					superTypes += typeRef(an.annotationType)
   				}
   				else {
   					addAnnotation(an)
   				}
   			}
   			for (impl : entity.getImplements) {
   				superTypes += impl.implements.cloneWithProxies
   			}
   			val ext = entity.getExtends
   			if (ext != null)
   				superTypes += ext.extends.cloneWithProxies
   			if (entity.superType != null)
   				superTypes += entity.superType.cloneWithProxies
   				
   			if (sernum != null) {
   				superTypes += typeRef('java.io.Serializable')
				members += entity.toField('serialVersionUID', typeRef(long)) [
 					static = true
 					final = true
 					initializer = '''«sernum»L'''
   				]
   			}
   			for (attr : entity.attributes.filter(x | x.index != null)) {
				members += entity.toField('ORDER_BY_'+attr.constName, typeRef(int)) [
 					static = true
 					final = true
 					visibility = JvmVisibility.PUBLIC
	   				addAnnotations(entity.staticAnnotations.map[a|a.annotation])
 					initializer = '''«attr.index»'''
   				]
   			}
   			for (entry : entity.index.entrySet) {
				members += entity.toField('ORDER_BY_'+constName(entry.value), typeRef(int)) [
 					static = true
 					final = true
 					visibility = JvmVisibility.PUBLIC
 					initializer = '''«entry.key»'''
	   				addAnnotations(entity.staticAnnotations.map[a|a.annotation])
   				]
   			}
   			
   			members += entity.toConstructor [
   				addAnnotations(entity.constructorAnnotations.map[a|a.annotation])
   			]
   			members += entity.toConstructor [
	   			for (attr : entity.requiredAttributes)
   					parameters += entity.toParameter(attr.name, attr.type)
   				addAnnotations(entity.constructorAnnotations.map[a|a.annotation])
   				body = '''«FOR attr : entity.requiredAttributes»
					this.«attr.name» = «attr.name»;
				«ENDFOR»'''
   			]
   			
   			for (attr : entity.attributes) {
   				val type = attr.type ?: attr.initExpr?.inferredType ?: typeRef(String)
   				members += entity.toField(attr.name, type) [
   					documentation = attr.documentation
   					addAnnotations(attr.attributeAnnotations.map[a|a.annotation])
 					initializer = attr.initExpr
   				]
   				val createColumn1 = entity.getAttribute(attr.createColumn1)
   				val typeCreateColumn1 = if (createColumn1 != null) createColumn1.type.qualifiedName
   				members += attr.toGetter(attr.name, attr.name, type) [
   					addAnnotations(attr.getterAnnotations.map[a|a.annotation])
   				]
   				members += attr.toSetterExt(attr.name, attr.name, type, typeRef(entityType), attr.updateColumn1, attr.updateColumn2, 
   								attr.createColumn1, typeCreateColumn1, attr.createColumn2) [
   					addAnnotations(attr.setterAnnotations.map[a|a.annotation])
   				]
   				members += attr._toSetterExt(attr.name, attr.name, type, typeRef(entityType), attr.updateColumn1, attr.updateColumn2, 
   								attr.createColumn1, typeCreateColumn1, attr.createColumn2)
	   			if (entity.hasOperators) {
   					val operSuffix = entity.operatorsSuffix ?: 'Op'
   					members += entity.toField(attr.name + operSuffix, typeRef(String)) []
	   				members += attr.toGetter(attr.name + operSuffix, typeRef(String))
   					members += attr.toSetter(attr.name + operSuffix, attr.name + operSuffix, typeRef(String))
   					members += attr._toSetter(attr.name + operSuffix, attr.name + operSuffix, typeRef(String), typeRef(entityType))
   				}
   			}
   		]
   	}
	
   	def dispatch void infer(EnumEntity entity, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val entityType = entity.toEnumerationType(entity.fullyQualifiedName) []
   		val simpleName = entity.name
   		acceptor.accept(entityType) [
   			documentation = entity.documentation
   			for (a : entity.annotations.map[a|a.annotation]) {
   				if (a.annotationType.identifier == 'java.io.Serializable') {
   					superTypes += typeRef(a.annotationType)
   				}
   				else {
   					addAnnotation(a)
   				}
   			}
			val List<EnumAttributeValue> values = newArrayList()
			for (dir : entity.attribute.directives) {
				if (dir instanceof EnumAttributeDirectiveValues) {
					val dv = dir as EnumAttributeDirectiveValues
					for (epv : dv.values) {
						val value = switch(epv.value) {
							XStringLiteral: '"'+(epv.value as XStringLiteral).value+'"'
							XNumberLiteral: (epv.value as XNumberLiteral).value
						}
						members += entity.toEnumerationLiteral(epv.name, [
							initializer = [
								append('('+value+')')
							]
						])
						values += epv
					}
				}
			}
			val identifierMapType = typeRef(java.util.Map, entity.attribute.type, typeRef(entityType).cloneWithProxies)
			members += entity.toField('identifierMap', identifierMapType) [
 				static = true
 				initializer = ''' identifierMapBuild()'''
   			]
   			members += entity.toMethod ('identifierMapBuild', identifierMapType) [
 				static = true
				body = '''
					Map<«entity.attribute.type», «simpleName»> _identifierMap = new java.util.HashMap<«entity.attribute.type», «simpleName»>();
					for («simpleName» value : «simpleName».values()) {
						_identifierMap.put(value.getValue(), value);
					}
					return _identifierMap;
				'''
			]
			members += entity.toField('value', entity.attribute.type)
   			members += entity.toConstructor[
   				parameters += entity.toParameter('value', entity.attribute.type)
   				visibility = JvmVisibility.PRIVATE
   				body = '''
					this.value = value;
				'''
   			]
   			members += entity.toMethod ('fromValue', typeRef(entityType).cloneWithProxies) [
				parameters += entity.toParameter('value', entity.attribute.type)
				body = '''
					«simpleName» result = identifierMap.get(value);
					if (result == null) {
						throw new IllegalArgumentException("No «simpleName» for value: " + value);
					}
					return result;
				'''
			]
   			members += entity.toMethod ('getValue', entity.attribute.type) [
				body = '''
					return value;
				'''
			]
   			members += entity.toMethod ('getName', typeRef(String)) [
				body = '''
					return name();
				'''
			]
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

