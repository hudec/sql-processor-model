/*
 * generated by Xtext
 */
package org.sqlproc.model.generator

import org.sqlproc.model.processorModel.PojoEntity
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.sqlproc.model.processorModel.PojoProperty
import org.sqlproc.model.ImportManager

import static org.sqlproc.model.util.Utils.*;
import java.util.ArrayList
import org.sqlproc.model.processorModel.Implements
import org.sqlproc.model.processorModel.Extends
import java.util.List
import org.sqlproc.model.processorModel.EnumEntity
import org.sqlproc.model.processorModel.EnumProperty
import org.sqlproc.model.processorModel.PojoAnnotatedProperty
import org.sqlproc.model.processorModel.AnnotatedEntity
import org.sqlproc.model.processorModel.Annotation
import org.sqlproc.model.processorModel.AnnotationProperty
import org.sqlproc.model.processorModel.EnumPropertyDirectiveValues

//import static extension org.sqlproc.dsl.generator.ProcessorGeneratorUtils.*

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ProcessorPojoGenerator {
	
	@Inject extension IQualifiedNameProvider
	@Inject extension ProcessorGeneratorUtils
	
	def compile(AnnotatedEntity e) '''
	«IF e.entity instanceof EnumEntity»«enumEntity(e).compile»«ENDIF»«IF e.entity instanceof PojoEntity»«compile(pojoEntity(e), e)»«ENDIF»
	'''
	
	def compile(EnumEntity e) '''
	«val im = new ImportManager(true)»
	«val eattr = getEnumAttr(e)»
	«addImplements(e, im)»
	«addExtends(e, im)»
	«val classBody = compile(e, im, eattr)»
	«IF e.eContainer != null»package «e.eContainer.eContainer.fullyQualifiedName»;«ENDIF»
	«IF !im.imports.empty»
	
	«FOR i : im.imports»
	import «i»;
	«ENDFOR»
	«ENDIF»
	«IF getSernum(e) != null»
	
	import java.io.Serializable;
	«ENDIF»
	«IF !e.features.empty»
	import java.util.HashMap;
	import java.util.Map;
	«ENDIF»
	
	«classBody»
	'''
	
	def compile(EnumEntity e, ImportManager im, EnumProperty ea) '''
	public enum «e.name» «compileImplements(e)»{
	
		«FOR fe:e.features SEPARATOR ", "»
		«FOR f:fe.directives.filter(x| x instanceof EnumPropertyDirectiveValues) SEPARATOR ", "»«FOR v:(f as EnumPropertyDirectiveValues).values SEPARATOR ", "»«v.name»(«value(v.value)»)«ENDFOR»«ENDFOR»;
		«ENDFOR»
		«IF getSernum(e) != null»
			
		private static final long serialVersionUID = «getSernum(e)»L;
		«ENDIF»
		
		private static Map<«ea.compileType(im)», «e.name»> identifierMap = new HashMap<«ea.compileType(im)», «e.name»>();
	
		static {
			for («e.name» value : «e.name».values()) {
				identifierMap.put(value.getValue(), value);
			}
		}
	
		private «ea.compileType(im)» «ea.name»;
	
		private «e.name»(«ea.compileType(im)» value) {
			this.«ea.name» = value;
		}
	
		public static «e.name» fromValue(«ea.compileType(im)» value) {
			«e.name» result = identifierMap.get(value);
			if (result == null) {
				throw new IllegalArgumentException("No «e.name» for value: " + value);
			}
			return result;
		}
	
		public «ea.compileType(im)» getValue() {
			return «ea.name»;
		}
	
		public String getName() {
			return name();
		}
	}
	'''
	
	def compile(PojoEntity e, AnnotatedEntity ae) '''
	«val im = new ImportManager(true)»
	«addImplements(e, im)»
	«addExtends(e, im)»
	«val classBody = compile(e, ae, im)»
	«IF e.eContainer != null»package «e.eContainer.eContainer.fullyQualifiedName»;«ENDIF»
	«IF !im.imports.empty»
		
	«FOR i : im.imports»
	import «i»;
	«ENDFOR»
	«ENDIF»
	«IF getSernum(e) != null»
	
	import java.io.Serializable;
	«ENDIF»
	«IF !e.listFeatures.empty»
	import java.util.ArrayList;
	«ENDIF»
	«IF e.hasIsDef || e.hasToInit»
	import java.util.Set;
	import java.util.HashSet;
	import java.lang.reflect.InvocationTargetException;
	import org.apache.commons.beanutils.MethodUtils;
	«ENDIF»
	«IF hasOperators(e) && getOperatorsSuffix(e) == null»
	import java.util.Map;
	import java.util.HashMap;
	«ENDIF»
	import org.sqlproc.engine.annotation.Pojo;
	
	«classBody»
	'''
	
	def compile(PojoEntity e, AnnotatedEntity ae, ImportManager im) '''
	«FOR a:ae.standardAnnotations»
	@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR f:a.features SEPARATOR ", "»«compileAnnotationProperty(f, im)»«ENDFOR»)«ENDIF»
	«ENDFOR»
	@Pojo
	public «IF isAbstract(e)»abstract «ENDIF»class «e.name» «compileExtends(e, im)»«compileImplements(e)»{
		«IF getSernum(e) != null»
		
		private static final long serialVersionUID = «getSernum(e)»L;
		«ENDIF»
		«FOR f:e.features.filter(x| getIndex(x.feature)!=null)»
		«FOR a:ae.staticAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public static final int ORDER_BY_«constName(f.feature)» = «getIndex(f.feature)»;
		«ENDFOR»
		«FOR f:getIndex(e).entrySet»
		«FOR a:ae.staticAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public static final int ORDER_BY_«constName(f.value)» = «f.key»;
		«ENDFOR»
		
		«FOR a:ae.constructorAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR f:a.features SEPARATOR ", "»«compileAnnotationProperty(f, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name»() {
		}
		«IF !e.requiredFeatures.empty»
			
		«FOR a:ae.constructorAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR f:a.features SEPARATOR ", "»«compileAnnotationProperty(f, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name»(«FOR f:e.requiredFeatures SEPARATOR ", "»«getFullName(e, f, f.feature.compileType(im), im)» «f.feature.name»«ENDFOR») {
			«FOR f:e.requiredSuperFeatures BEFORE "super(" SEPARATOR ", " AFTER ");"»«f.feature.name»«ENDFOR»
			«FOR f:e.requiredFeatures1»
			this.«f.feature.name» = «f.feature.name»;
			«ENDFOR»
		}
		«ENDIF»
	«FOR f:e.features.filter(x| isAttribute(x.feature))»
		«f.feature.compile(f, im, e, ae, getOperatorsSuffix(e))»
	«ENDFOR»
	«val toInit = e.toInitFeatures»«IF !toInit.empty»«compileToInit(toInit, im, e, ae)»«ENDIF»
	«val enumInit = e.enumInitFeatures»«IF !enumInit.empty»«compileEnumInit(enumInit, im, e, ae)»«ENDIF»
	«val isDef = e.isDefFeatures»«IF !isDef.empty»«compileIsDef(isDef, im, e, ae)»«ENDIF»
	«val enumDef = e.enumDefFeatures»«IF !enumDef.empty»«compileEnumDef(enumDef, im, e, ae)»«ENDIF»
	«val equals = e.equalsFeatures»«IF !equals.empty»«compileEquals(equals, im, e, ae)»«ENDIF»
	«val hashCode = e.hashCodeFeatures»«IF !hashCode.empty»«compileHashCode(hashCode, im, e, ae)»«ENDIF»
	«val toString = e.toStringFeatures»«IF !toString.empty»«compileToString(toString, im, e, ae)»«ENDIF»
	«IF hasOperators(e) && getOperatorsSuffix(e) == null»«compileOperators(im, e, ae)»«ENDIF»
	}
	'''
	
	def compileAnnotationProperty(AnnotationProperty f, ImportManager im) '''
		«f.name» = «IF f.getType != null»«im.serialize(f.getType)»«ELSEIF f.getRef != null»«f.getRef.fullyQualifiedName»«ENDIF»«getAnnotationValue(f)»'''
	
	def compile(PojoProperty f, PojoAnnotatedProperty aaf, ImportManager im, PojoEntity e, AnnotatedEntity ae, String operatorSuffix) '''
	
		«FOR a:aaf.attributeAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR af:a.features SEPARATOR ", "»«compileAnnotationProperty(af, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		private «f.compileType(im)» «f.name»«IF isList(f)» = new Array«f.compileType(im)»()«ELSEIF isOptLock(f)» = 0«ENDIF»;
	
		«FOR a:aaf.getterAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR af:a.features SEPARATOR ", "»«compileAnnotationProperty(af, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «f.compileType(im)» get«_toFirstUpper(f.name)»() {
			return «f.name»;
		}
	
		«FOR a:aaf.setterAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR af:a.features SEPARATOR ", "»«compileAnnotationProperty(af, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void set«_toFirstUpper(f.name)»(«f.compileType(im)» «f.name») {
			this.«f.name» = «f.name»;
			«IF getUpdateColumn1(f) != null»
			if (this.«f.name» != null)
				this.«getUpdateColumn2(f)» = this.«f.name».get«_toFirstUpper(getUpdateColumn1(f))»();
			«ENDIF»
			«IF getCreateColumn1(f) != null»
			if (this.«getCreateColumn1(f)» == null)
				this.«getCreateColumn1(f)» = new «getAttribute(e, getCreateColumn1(f)).compileType(im)»();
			this.«getCreateColumn1(f)».set«_toFirstUpper(getCreateColumn2(f))»(«f.name»);
			«ENDIF»
		}
	
		public «e.name» _set«_toFirstUpper(f.name)»(«f.compileType(im)» «f.name») {
			this.«f.name» = «f.name»;
			«IF getUpdateColumn1(f) != null»
			if (this.«f.name» != null)
				this.«getUpdateColumn2(f)» = this.«f.name».get«_toFirstUpper(getUpdateColumn1(f))»();
			«ENDIF»
			«IF getCreateColumn1(f) != null»
			if (this.«getCreateColumn1(f)» == null)
				this.«getCreateColumn1(f)» = new «getAttribute(e, getCreateColumn1(f)).compileType(im)»();
			this.«getCreateColumn1(f)».set«_toFirstUpper(getCreateColumn2(f))»(«f.name»);
			«ENDIF»
			return this;
		}«IF hasOperators(e) && operatorSuffix != null»
			
		private String «f.name»«operatorSuffix»;
			
		public String get«_toFirstUpper(f.name)»«operatorSuffix»() {
			return «f.name»«operatorSuffix»;
		}
			
		public void set«_toFirstUpper(f.name)»«operatorSuffix»(String «f.name»«operatorSuffix») {
			this.«f.name»«operatorSuffix» = «f.name»«operatorSuffix»;
		}
			
		public «e.name» _set«_toFirstUpper(f.name)»«operatorSuffix»(String «f.name»«operatorSuffix») {
			this.«f.name»«operatorSuffix» = «f.name»«operatorSuffix»;
			return this;
		}«ENDIF»
	'''
	
	def compileHashCode(List<PojoProperty> l, ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			«FOR f2:l»
			result = prime * result + «IF f2.isNative»(int) («f2.name» ^ («f2.name» >>> 32))«ELSE»((«f2.name» != null) ? «f2.name».hashCode() : 0)«ENDIF»;
			«ENDFOR»
			return result;
		}	
	'''
	
	def compileEquals(List<PojoProperty> l, ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			«e.name» other = («e.name») obj;
			«FOR f2:l»
			«IF f2.isNative»if («f2.name» != other.«f2.name»)«ELSE»if («f2.name» == null || !«f2.name».equals(other.«f2.name»))«ENDIF»
			return false;
			«ENDFOR»
			return true;
		}	
	'''
	
	def compileToString(List<PojoProperty> l, ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		@Override
		public String toString() {
			return "«e.name» [«FOR f2:l SEPARATOR " + \", "»«f2.name»=" + «f2.name»«ENDFOR»«IF getSuperType(e) != null» + super.toString()«ENDIF» + "]";
		}
	
		public String toStringFull() {
			return "«e.name» [«FOR f2:e.features.filter(x| isAttribute(x.feature)) SEPARATOR " + \", "»«f2.feature.name»=" + «f2.feature.name»«ENDFOR»«IF getSuperType(e) != null» + super.toString()«ENDIF» + "]";
		}
	'''
	
	def compileIsDef(List<PojoProperty> l, ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		public enum Attribute {
			«FOR f2:l SEPARATOR ", "»«f2.name»«ENDFOR»
		}
	
		private Set<String> nullValues = new HashSet<String>();
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void setNull(Attribute... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (Attribute attribute : attributes)
				nullValues.add(attribute.name());
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name» _setNull(Attribute... attributes) {
			setNull(attributes);
			return this;
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void clearNull(Attribute... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (Attribute attribute : attributes)
				nullValues.remove(attribute.name());
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name» _clearNull(Attribute... attributes) {
			clearNull(attributes);
			return this;
		}
	
		public void setNull(String... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (String attribute : attributes)
				nullValues.add(attribute);
		}
	
		public «e.name» _setNull(String... attributes) {
			setNull(attributes);
			return this;
		}
	
		public void clearNull(String... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (String attribute : attributes)
				nullValues.remove(attribute);
		}
	
		public «e.name» _clearNull(String... attributes) {
			clearNull(attributes);
			return this;
		}
	
		public Boolean isNull(String attrName) {
			if (attrName == null)
				throw new IllegalArgumentException();
			return nullValues.contains(attrName);
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public Boolean isNull(Attribute attribute) {
			if (attribute == null)
				throw new IllegalArgumentException();
			return nullValues.contains(attribute.name());
		}
	
		public Boolean isDef(String attrName) {
			if (attrName == null)
				throw new IllegalArgumentException();
			if (nullValues.contains(attrName))
				return true;
			try {
				Object result = MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
				return (result != null) ? true : false;
			} catch (NoSuchMethodException e) {
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
			try {
				Object result = MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
				return (result != null) ? true : false;
			} catch (NoSuchMethodException e) {
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
			return false;
		}
	
		public void clearAllNull() {
			nullValues = new HashSet<String>();
		}
	'''
	
	def compileEnumDef(List<PojoProperty> l, ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		public enum Attribute {
			«FOR f2:l SEPARATOR ", "»«f2.name»«ENDFOR»
		}
	'''
	
	def compileToInit(List<PojoProperty> l, ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		public enum Association {
			«FOR f2:l SEPARATOR ", "»«f2.name»«ENDFOR»
		}
	
		private Set<String> initAssociations = new HashSet<String>();
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void setInit(Association... associations) {
			if (associations == null)
				throw new IllegalArgumentException();
			for (Association association : associations)
				initAssociations.add(association.name());
		}
		
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name»	_setInit(Association... associations) {
			setInit(associations);
			return this;
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void clearInit(Association... associations) {
			if (associations == null)
				throw new IllegalArgumentException();
			for (Association association : associations)
				initAssociations.remove(association.name());
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name» _clearInit(Association... associations) {
			clearInit(associations);
			return this;
		}
	
		public void setInit(String... associations) {
			if (associations == null)
				throw new IllegalArgumentException();
			for (String association : associations)
				initAssociations.add(association);
		}
	
		public «e.name» _setInit(String... associations) {
			setInit(associations);
			return this;
		}
	
		public void clearInit(String... associations) {
			if (associations == null)
				throw new IllegalArgumentException();
			for (String association : associations)
				initAssociations.remove(association);
		}
	
		public «e.name» _clearInit(String... associations) {
			clearInit(associations);
			return this;
		}
	
		public Boolean toInit(String association) {
			if (association == null)
				throw new IllegalArgumentException();
			return initAssociations.contains(association);
		}
	
		public void clearAllInit() {
			initAssociations = new HashSet<String>();
		}
	'''
	
	def compileEnumInit(List<PojoProperty> l, ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		public enum Association {
			«FOR f2:l SEPARATOR ", "»«f2.name»«ENDFOR»
		}
	'''
	
	def compileOperators(ImportManager im, PojoEntity e, AnnotatedEntity ae) '''
	
		public enum OpAttribute {
			«FOR f:e.features.filter(x| isAttribute(x.feature)) SEPARATOR ", "»«f.feature.name»«ENDFOR»
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		private Map<String, String> operators = new HashMap<String, String>();
	
		public Map<String, String> getOperators() {
			return operators;
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void setOp(String operator, OpAttribute... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (OpAttribute attribute : attributes)
				operators.put(attribute.name(), operator);
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name» _setOp(String operator, OpAttribute... attributes) {
			setOp(operator, attributes);
			return this;
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void clearOp(OpAttribute... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (OpAttribute attribute : attributes)
				operators.remove(attribute.name());
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name» _clearOp(OpAttribute... attributes) {
			clearOp(attributes);
			return this;
		}
	
		public void setOp(String operator, String... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (String attribute : attributes)
				operators.put(attribute, operator);
		}
	
		public «e.name» _setOp(String operator, String... attributes) {
			setOp(operator, attributes);
			return this;
		}
	
		public void clearOp(String... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (String attribute : attributes)
				operators.remove(attribute);
		}
	
		public «e.name» _clearOp(String... attributes) {
			clearOp(attributes);
			return this;
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public void setNullOp(OpAttribute... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (OpAttribute attribute : attributes)
				operators.put(attribute.name(), "is null");
		}
	
		«FOR a:ae.conflictAnnotations»
		@«im.serialize(a.getType)»«IF !a.features.isEmpty»(«FOR ff:a.features SEPARATOR ", "»«compileAnnotationProperty(ff, im)»«ENDFOR»)«ENDIF»
		«ENDFOR»
		public «e.name» _setNullOp(OpAttribute... attributes) {
			setNullOp(attributes);
			return this;
		}
	
		public void setNullOp(String... attributes) {
			if (attributes == null)
				throw new IllegalArgumentException();
			for (String attribute : attributes)
				operators.put(attribute, "is null");
		}
	
		public «e.name» _setNullOp(String... attributes) {
			setNullOp(attributes);
			return this;
		}
	
		public void clearAllOps() {
			operators = new HashMap<String, String>();
		}
	'''
	
	def List<PojoAnnotatedProperty> listFeatures(PojoEntity e) {
		
	 	val list = new ArrayList<PojoAnnotatedProperty>()
		if (getSuperType(e) != null)
			list.addAll(getSuperType(e).listFeatures)
		list.addAll(e.listFeatures1)
		return list
	}
	
	def listFeatures1(PojoEntity e) {
		return e.features.filter(f|isList(f.feature)).toList
	}
		
	def List<PojoAnnotatedProperty> requiredFeatures(PojoEntity e) {
		
	 	val list = new ArrayList<PojoAnnotatedProperty>()
		if (getSuperType(e) != null)
			list.addAll(getSuperType(e).requiredFeatures)
		list.addAll(e.requiredFeatures1)
		return list
	}
	
	def requiredSuperFeatures(PojoEntity e) {
		
	 	val list = new ArrayList<PojoAnnotatedProperty>()
		if (getSuperType(e) != null)
			list.addAll(getSuperType(e).requiredFeatures)
		return list
	}
	
	def requiredFeatures1(PojoEntity e) {
		return e.features.filter(f|isRequired(f.feature)).toList
	}
	
	def isAttribute(PojoProperty f) {
		return f.getRef != null || f.getType != null
	}
	
//	def simplAttrs(PojoProperty f) {
//		return f.attrs.filter(f2| f2.getType != null).toList
//	}
	
	def compileImplements(EnumEntity e) '''
		«IF getSernum(e) != null»implements Serializable«ENDIF» '''
	
	def compileExtends(PojoEntity e, ImportManager im) '''
		«IF getSuperType(e) != null»extends «getFullName(e, getSuperType(e), getSuperType(e).fullyQualifiedName, im)» «ELSEIF getExtends(e) != ""»extends «getExtends(e)» «ENDIF»'''
	
	def compileImplements(PojoEntity e) '''
		«IF isImplements(e) || getSernum(e) != null»implements «FOR f:getImplements(e) SEPARATOR ", " »«f.getImplements().simpleName»«ENDFOR»«IF getSernum(e) != null»«IF isImplements(e)», «ENDIF»Serializable«ENDIF» «ENDIF»'''
	
	def compile(Extends e, ImportManager im) {
		im.addImportFor(e.getExtends())
	}
	
	def addImplements(EnumEntity e, ImportManager im) {
		for(impl: e.eContainer.eContainer.eContents.filter(typeof(Implements))) {
			im.addImportFor(impl.getImplements())
		}
	}
	
	def addExtends(EnumEntity e, ImportManager im) {
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Extends))) {
			im.addImportFor(ext.getExtends())
		}
	}
	
	def addImplements(PojoEntity e, ImportManager im) {
		for(impl: e.eContainer.eContainer.eContents.filter(typeof(Implements))) {
			im.addImportFor(impl.getImplements())
		}
	}
	
	def addExtends(PojoEntity e, ImportManager im) {
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Extends))) {
			im.addImportFor(ext.getExtends())
		}
	}
	
	def addAnnotations(List<Annotation> annotations, ImportManager im) {
		for(a: annotations) {
			im.serialize(a.getType)
		}
	}
	
	def getExtends(EnumEntity e) {
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Extends))) {
			return ext.getExtends().simpleName
		}
		return ""
	}
	
	def isImplements(EnumEntity e) {
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Implements))) {
			return true
		}
		return false
	}
	
	def isExtends(PojoEntity e) {
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Extends))) {
			if (!ext.onlyPojos.empty) {
				for (ee : ext.onlyPojos) {
					if (ee.name == e.name)
						return true
				}
				return false
			}
			for (ee : ext.exceptPojos) {
				if (ee.name == e.name)
					return false
			}
			return true
		}
		return false
	}
	
	def isExtends(PojoEntity e, Extends ext) {
		if (!ext.onlyPojos.empty) {
			for (ee : ext.onlyPojos) {
				if (ee.name == e.name)
				return true
			}
			return false
		}
		for (ee : ext.exceptPojos) {
			if (ee.name == e.name)
				return false;
		}
		return true
	}
	
	def getExtends(PojoEntity e) {
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Extends))) {
			if (isExtends(e, ext))
				return ext.getExtends().simpleName
		}
		return ""
	}
	
	def isImplements(PojoEntity e) {
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Implements))) {
			for (ee : ext.exceptPojos) {
				if (ee.name == e.name)
					return false
			}
			if (!ext.onlyPojos.empty) {
				for (ee : ext.onlyPojos) {
					if (ee.name == e.name)
						return true
				}
			}
			else {
				return true
			}
		}
		return false
	}
	
	def isImplements(PojoEntity e, Implements ext) {
		if (!ext.onlyPojos.empty) {
			for (ee : ext.onlyPojos) {
				if (ee.name == e.name)
				return true
			}
			return false
		}
		for (ee : ext.exceptPojos) {
			if (ee.name == e.name)
				return false;
		}
		return true
	}
	
	def getImplements(PojoEntity e) {
		val list = new ArrayList<Implements>()
		
		for(ext: e.eContainer.eContainer.eContents.filter(typeof(Implements))) {
			if (isImplements(e, ext))
				list.add(ext)
		}
		return list
	}
}
