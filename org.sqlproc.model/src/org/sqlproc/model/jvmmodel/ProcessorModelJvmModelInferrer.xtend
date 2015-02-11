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
   		val simpleName = entity.name
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

   			
   			val equalsList = entity.equalsAttributes
   			if (!equalsList.isEmpty) {
	   			val method = entity.toMethod('equals', typeRef(boolean)) [
   					parameters += entity.toParameter("obj", typeRef(Object))
   					body = '''
						if (this == obj)
							return true;
						if (obj == null)
							return false;
						if (getClass() != obj.getClass())
							return false;
						«simpleName» other = («simpleName») obj;
						«FOR f2:equalsList»
						«IF f2.isNative»if («f2.name» != other.«f2.name»)«ELSE»if («f2.name» == null || !«f2.name».equals(other.«f2.name»))«ENDIF»
							return false;
						«ENDFOR»
						return true;
   					'''
	   			]
	   			method.getAnnotations().add(toAnnotation(entity, Override))
	   			members += method
			}
   			
   			val hashCodeList = entity.hashCodeAttributes
   			if (!hashCodeList.isEmpty) {
	   			val method = entity.toMethod('hashCode', typeRef(int)) [
	   				body = '''
						final int prime = 31;
						int result = 1;
						«FOR f2:hashCodeList»
						result = prime * result + «IF f2.isNative»(int) («f2.name» ^ («f2.name» >>> 32))«ELSE»((«f2.name» != null) ? «f2.name».hashCode() : 0)«ENDIF»;
						«ENDFOR»
						return result;
	   				'''
	   			]
	   			method.getAnnotations().add(toAnnotation(entity, Override))
	   			members += method
			}
   			
   			val toStringList = entity.toStringAttributes
   			if (!toStringList.isEmpty) {
	   			val method = entity.toMethod('toString', typeRef(String)) [
	   				body = '''
	   					return "«simpleName» [«FOR f2:toStringList SEPARATOR " + \", "»«f2.name»=" + «f2.name»«ENDFOR»«IF entity.superType != null && entity.superType instanceof PojoEntity» + super.toString()«ENDIF» + "]";
	   				'''
	   			]
	   			method.getAnnotations().add(toAnnotation(entity, Override))
	   			members += method
			}
   			members += entity.toMethod('toStringFull', typeRef(String)) [
  				body = '''
 					return "«simpleName» [«FOR f2:entity.attributes SEPARATOR " + \", "»«f2.name»=" + «f2.name»«ENDFOR»«IF entity.superType != null && entity.superType instanceof PojoEntity» + super.toString()«ENDIF» + "]";
 				'''
   			]
			   			
   			val isDefList = entity.isDefAttributes
   			if (!isDefList.isEmpty) {
   				val isDefType = entity.toEnumerationType('Attribute') []
   				members += isDefType
	   			for (attr: isDefList)
	   				isDefType.members += entity.toEnumerationLiteral(attr.name)
				val identifierSetType = typeRef(java.util.Set, typeRef(String))
				members += entity.toField('nullValues', identifierSetType) [
 					initializer = ''' new java.util.HashSet<String>()'''
	   			]
	   			members += entity.toMethod('setNull', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(isDefType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (Attribute attribute : attributes)
							nullValues.add(attribute.name());
   					'''
   				]	
	   			members += entity.toMethod('_setNull', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(isDefType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						setNull(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('clearNull', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(isDefType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (Attribute attribute : attributes)
							nullValues.remove(attribute.name());
   					'''
   				]	
	   			members += entity.toMethod('_clearNull', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(isDefType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						clearNull(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('setNull', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (String attribute : attributes)
							nullValues.add(attribute);
   					'''
   				]	
	   			members += entity.toMethod('_setNull', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						setNull(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('clearNull', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (String attribute : attributes)
							nullValues.remove(attribute);
   					'''
   				]	
	   			members += entity.toMethod('_clearNull', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						clearNull(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('isNull', typeRef(Boolean)) [
   					parameters += entity.toParameter("attribute", typeRef(isDefType).cloneWithProxies)
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (attribute == null)
							throw new IllegalArgumentException();
						return nullValues.contains(attribute.name());
   					'''
   				]	
	   			members += entity.toMethod('isNull', typeRef(Boolean)) [
   					parameters += entity.toParameter("attrName", typeRef(String))
   					body = '''
						if (attrName == null)
							throw new IllegalArgumentException();
						return nullValues.contains(attrName);
   					'''
   				]	
	   			members += entity.toMethod('isDef', typeRef(Boolean)) [
   					parameters += entity.toParameter("attrName", typeRef(String))
   					body = '''
						if (attrName == null)
							throw new IllegalArgumentException();
						if (nullValues.contains(attrName))
							return true;
						try {
							Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
							return (result != null) ? true : false;
						} catch (NoSuchMethodException e) {
						} catch (IllegalAccessException e) {
							throw new RuntimeException(e);
						} catch (java.lang.reflect.InvocationTargetException e) {
							throw new RuntimeException(e);
						}
						try {
							Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
							return (result != null) ? true : false;
						} catch (NoSuchMethodException e) {
						} catch (IllegalAccessException e) {
							throw new RuntimeException(e);
						} catch (java.lang.reflect.InvocationTargetException e) {
							throw new RuntimeException(e);
						}
						return false;
   					'''
   				]	
	   			members += entity.toMethod('clearAllNull', typeRef(Void.TYPE)) [
   					body = '''
						nullValues = new java.util.HashSet<String>();
   					'''
   				]	
   			}
   			
   			val enumDefList = entity.enumDefAttributes
   			if (!enumDefList.isEmpty) {
   				val isDefType = entity.toEnumerationType('Attribute') []
   				members += isDefType
	   			for (attr: enumDefList)
	   				isDefType.members += entity.toEnumerationLiteral(attr.name)
	   				
	   		}

   			val toInitList = entity.toInitAttributes
   			if (!toInitList.isEmpty) {
   				val toInitType = entity.toEnumerationType('Association') []
   				members += toInitType
	   			for (attr: toInitList)
	   				toInitType.members += entity.toEnumerationLiteral(attr.name)
				val identifierSetType = typeRef(java.util.Set, typeRef(String))
				members += entity.toField('initAssociations', identifierSetType) [
 					initializer = ''' new java.util.HashSet<String>()'''
	   			]
	   			members += entity.toMethod('setInit', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("associations", typeRef(toInitType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (associations == null)
							throw new IllegalArgumentException();
						for (Association association : associations)
							initAssociations.add(association.name());
   					'''
   				]	
	   			members += entity.toMethod('_setInit', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("associations", typeRef(toInitType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						setInit(associations);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('clearInit', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("associations", typeRef(toInitType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (associations == null)
							throw new IllegalArgumentException();
						for (Association association : associations)
							initAssociations.remove(association.name());
   					'''
   				]	
	   			members += entity.toMethod('_clearInit', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("associations", typeRef(toInitType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						clearInit(associations);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('setInit', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("associations", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						if (associations == null)
							throw new IllegalArgumentException();
						for (String association : associations)
							initAssociations.add(association);
   					'''
   				]	
	   			members += entity.toMethod('_setInit', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("associations", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						setInit(associations);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('clearInit', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("associations", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						if (associations == null)
							throw new IllegalArgumentException();
						for (String association : associations)
							initAssociations.remove(association);
   					'''
   				]	
	   			members += entity.toMethod('_clearInit', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("associations", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						clearInit(associations);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('toInit', typeRef(Boolean)) [
   					parameters += entity.toParameter("association", typeRef(toInitType).cloneWithProxies)
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (association == null)
							throw new IllegalArgumentException();
						return initAssociations.contains(association.name());
   					'''
   				]	
	   			members += entity.toMethod('toInit', typeRef(Boolean)) [
   					parameters += entity.toParameter("association", typeRef(String))
   					body = '''
						if (association == null)
							throw new IllegalArgumentException();
						return initAssociations.contains(association);
   					'''
   				]	
	   			members += entity.toMethod('clearAllInit', typeRef(Void.TYPE)) [
   					body = '''
						initAssociations = new java.util.HashSet<String>();
   					'''
   				]	
   			}

   			val enumInitList = entity.enumInitAttributes
   			if (!enumInitList.isEmpty) {
   				val toInitType = entity.toEnumerationType('Association') []
   				members += toInitType
	   			for (attr: enumInitList)
	   				toInitType.members += entity.toEnumerationLiteral(attr.name)
	   		}

			if (entity.hasOperators) {
   				val opAttrType = entity.toEnumerationType('OpAttribute') []
   				members += opAttrType
	   			for (attr: entity.attributes)
	   				opAttrType.members += entity.toEnumerationLiteral(attr.name)
				val identifierMapType = typeRef(java.util.Map, typeRef(String), typeRef(String))
				members += entity.toField('operators', identifierMapType) [
 					initializer = ''' new java.util.HashMap<String, String>()'''
	   			]
	   			members += entity.toMethod('getOperators', identifierMapType) [
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						return operators;
   					'''
   				]
	   			members += entity.toMethod('setOp', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("operator", typeRef(String))
   					parameters += entity.toParameter("attributes", typeRef(opAttrType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (OpAttribute attribute : attributes)
							operators.put(attribute.name(), operator);
   					'''
   				]	
	   			members += entity.toMethod('_setOp', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("operator", typeRef(String))
   					parameters += entity.toParameter("attributes", typeRef(opAttrType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						setOp(operator, attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('clearOp', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(opAttrType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (OpAttribute attribute : attributes)
							operators.remove(attribute.name());
   					'''
   				]	
	   			members += entity.toMethod('_clearOp', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(opAttrType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						clearOp(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('setOp', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("operator", typeRef(String))
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (String attribute : attributes)
							operators.put(attribute, operator);
   					'''
   				]	
	   			members += entity.toMethod('_setOp', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("operator", typeRef(String))
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						setOp(operator, attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('clearOp', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (String attribute : attributes)
							operators.remove(attribute);
   					'''
   				]	
	   			members += entity.toMethod('_clearOp', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						clearOp(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('setNullOp', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(opAttrType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (OpAttribute attribute : attributes)
							operators.put(attribute.name(), "is null");
   					'''
   				]	
	   			members += entity.toMethod('_setNullOp', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(opAttrType).addArrayTypeDimension.cloneWithProxies)
	   				varArgs = true
	   				addAnnotations(entity.conflictAnnotations.map[a|a.annotation])
   					body = '''
						setNullOp(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('setNullOp', typeRef(Void.TYPE)) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						if (attributes == null)
							throw new IllegalArgumentException();
						for (String attribute : attributes)
							operators.put(attribute, "is null");
   					'''
   				]	
	   			members += entity.toMethod('_setNullOp', typeRef(entityType).cloneWithProxies) [
   					parameters += entity.toParameter("attributes", typeRef(String).addArrayTypeDimension)
	   				varArgs = true
   					body = '''
						setNullOp(attributes);
						return this;
   					'''
   				]	
	   			members += entity.toMethod('clearAllOps', typeRef(Void.TYPE)) [
   					body = '''
						operators = new java.util.HashMap<String, String>();
   					'''
   				]	
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
   		val entityType = entity.toClass(entity.fullyQualifiedName)
   		val simpleName = entity.name
   		val sernum = entity.sernum
   		acceptor.accept(entityType) [
   			documentation = entity.documentation
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
   			
   			members += entity.toConstructor [
   				addAnnotations(entity.constructorAnnotations.map[a|a.annotation])
   			]
//   			members += entity.toConstructor [
//	   			for (attr : entity.requiredAttributes)
//   					parameters += entity.toParameter(attr.name, attr.type)
//   				addAnnotations(entity.constructorAnnotations.map[a|a.annotation])
//   				body = '''«FOR attr : entity.requiredAttributes»
//					this.«attr.name» = «attr.name»;
//				«ENDFOR»'''
//   			]
   		]
   	}
}

