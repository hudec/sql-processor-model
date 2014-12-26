/*
 * generated by Xtext
 */
package org.sqlproc.model.generator

import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.sqlproc.model.processorModel.PojoProperty
import org.sqlproc.model.ImportManager

import static org.sqlproc.model.util.Utils.*;
import org.sqlproc.model.processorModel.PojoType
import org.sqlproc.model.processorModel.EnumProperty
import org.sqlproc.model.processorModel.PojoEntity
import com.google.inject.Inject

class ProcessorGeneratorUtils {

	@Inject extension IQualifiedNameProvider
	
	def compileType(EnumProperty f, ImportManager im) '''
	  «IF f.getNative != null»«f.getNative.substring(1)»«ELSEIF f.getType != null»«im.serialize(f.getType)»«ENDIF»'''
	  
	def compileType(PojoProperty f, ImportManager im) '''
	  «IF f.getNative != null»«f.getNative.substring(1)»«ELSEIF f.getRef != null»«f.getRef.fullyQualifiedName»«ELSEIF f.getType != null»«im.serialize(f.getType)»«ENDIF»«IF f.getGtype != null»<«im.serialize(f.getGtype)»>«ENDIF»«IF f.getGref != null»<«f.getGref.fullyQualifiedName»>«ENDIF»«IF f.array»[]«ENDIF»'''
	  
	def compileType(PojoType f, ImportManager im) '''
	  «IF f.getNative != null»«f.getNative.substring(1)»«ELSEIF f.getRef != null»«im.serialize(pojoMethod2jvmType(f.getRef))»«ELSEIF f.getType != null»«im.serialize(f.getType)»«ENDIF»«IF f.getGtype != null»<«im.serialize(f.getGtype)»>«ENDIF»«IF f.getGref != null»<«im.serialize(pojoMethod2jvmType(f.getGref))»>«ENDIF»«IF f.array»[]«ENDIF»'''

	def completeName(PojoEntity e) {
		return getPackage(e)+"."+e.name;
	}
}