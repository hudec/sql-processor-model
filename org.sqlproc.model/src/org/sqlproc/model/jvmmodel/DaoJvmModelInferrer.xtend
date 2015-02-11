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
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.sqlproc.model.processorModel.DaoDirectiveCrud
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.sqlproc.model.processorModel.DaoDirectiveQuery
import java.util.Map

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class DaoJvmModelInferrer extends AbstractModelInferrer {

	public extension JvmAnnotationReferenceBuilder _annotationTypesBuilder
	public extension JvmTypeReferenceBuilder _typeReferenceBuilder

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension ProcessorTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ProcessorGeneratorUtils

   	val SERIALIZABLE = 'java.io.Serializable'
   	val ENGINE_FACTORY = 'org.sqlproc.engine.SqlEngineFactory'
   	val SESSION_FACTORY = 'org.sqlproc.engine.SqlSessionFactory'
   	val SQL_SESSION = 'org.sqlproc.engine.SqlSession'
   	val SQL_CONTROL = 'org.sqlproc.engine.SqlControl'
   	val LOGGER = 'org.slf4j.Logger'
   	val LOGGER_FACTORY = 'org.slf4j.LoggerFactory'
   	val CRUD_ENGINE = 'org.sqlproc.engine.SqlCrudEngine'
   	val QUERY_ENGINE = 'org.sqlproc.engine.SqlQueryEngine'
   	val PROCEDURE_ENGINE = 'org.sqlproc.engine.SqlProcedureEngine'
   	val MAP = 'java.util.Map'
   	val HASH_MAP = 'java.util.HashMap'
   	val LIST = 'java.util.List'

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
   	def void inferDao(DaoEntity entity, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val pojo = entity.pojo
   		if (pojo == null) {
   			println("Missing POJO for "+entity)
   			return
   		}

   		val entityType = entity.toClass(entity.fullyQualifiedName)
   		val pojoType = pojo.toClass(pojo.fullyQualifiedName)
   		val simpleName = entity.name
   		val sernum = entity.sernum
   		val moreResultClasses = entity.getMoreResultClasses
   		
   		acceptor.accept(entityType) [
   			documentation = entity.documentation
   			for (an : entity.standardAnnotations.map[a|a.annotation]) {
   				if (an.annotationType.identifier == SERIALIZABLE) {
   					superTypes += typeRef(an.annotationType)
   				}
   				else {
   					addAnnotation(an)
   				}
   			}
   			for (impl : entity.getImplements) {
   				if (impl.isGenerics) {
   					val genericType = typeRef(impl.implements, typeRef(pojoType))
   					println(genericType)
   					superTypes += genericType
   				}
   				else {
   					superTypes += impl.implements.cloneWithProxies
   				}
   			}
   			val ext = entity.getExtends
   			if (ext != null)
   				superTypes += ext.extends.cloneWithProxies
   			if (entity.superType != null)
   				superTypes += entity.superType.cloneWithProxies
   				
   			if (sernum != null) {
   				superTypes += typeRef(SERIALIZABLE)
				members += entity.toField('serialVersionUID', typeRef(long)) [
 					static = true
 					final = true
 					initializer = '''«sernum»L'''
   				]
   			}

   			members += entity.toField('logger', typeRef(LOGGER)) [
   				visibility = JvmVisibility.PROTECTED
   				final = true
   				initializer = '''«LOGGER_FACTORY».getLogger(getClass())'''
   			]
   			
   			members += entity.toConstructor [
   				addAnnotations(entity.constructorAnnotations.map[a|a.annotation])
   			]
   			members += entity.toConstructor [
				parameters += entity.toParameter('sqlEngineFactory', typeRef(ENGINE_FACTORY))
   				addAnnotations(entity.constructorAnnotations.map[a|a.annotation])
   				body = '''
   					this.sqlEngineFactory = sqlEngineFactory;
   				'''
   			]
   			members += entity.toConstructor [
				parameters += entity.toParameter('sqlEngineFactory', typeRef(ENGINE_FACTORY))
				parameters += entity.toParameter('sqlSessionFactory', typeRef(SESSION_FACTORY))
   				addAnnotations(entity.constructorAnnotations.map[a|a.annotation])
   				body = '''
   					this.sqlEngineFactory = sqlEngineFactory;
   					this.sqlSessionFactory = sqlSessionFactory;
   				'''
   			]
   			
   			members += entity.toField('sqlEngineFactory', typeRef(ENGINE_FACTORY)) [
   				visibility = JvmVisibility.PROTECTED
   			]
   			members += entity.toField('sqlSessionFactory', typeRef(SESSION_FACTORY)) [
   				visibility = JvmVisibility.PROTECTED
   			]
   			
   			for (dir : entity.directives) {
   				if (dir instanceof DaoDirectiveCrud) {
   					inferInsert(entity, dir as DaoDirectiveCrud, entityType, simpleName, pojo, pojoType, members)
   					inferGet(entity, dir as DaoDirectiveCrud, entityType, simpleName, pojo, pojoType, members, moreResultClasses)
   					inferUpdate(entity, dir as DaoDirectiveCrud, entityType, simpleName, pojo, pojoType, members)
   				}			
   			}
   		]
   	}
   	
   	def void inferInsert(DaoEntity entity, DaoDirectiveCrud dir, JvmGenericType entityType, String simpleName, 
   		PojoEntity pojo, JvmGenericType pojoType, List<JvmMember> members
   	) {
   		val pojoAttrName = pojo.name.toFirstLower
   		val parent = pojo.parent
   		
		members += entity.toMethod('insert', typeRef(pojoType)) [
			parameters += entity.toParameter("sqlSession", typeRef(SQL_SESSION))
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			parameters += entity.toParameter("sqlControl", typeRef(SQL_CONTROL))
			body = '''
				if (logger.isTraceEnabled()) {
					logger.trace("sql insert «pojoAttrName»: " + «pojoAttrName» + " " + sqlControl);
				}
				«CRUD_ENGINE» sqlInsert«pojo.name» = sqlEngineFactory.getCheckedCrudEngine("INSERT_«dbName(pojo.name)»");«IF parent != null»
				«CRUD_ENGINE» sqlInsert«parent.name» = sqlEngineFactory.getCheckedCrudEngine("INSERT_«dbName(parent.name)»");
				int count = sqlInsert«parent.name».insert(sqlSession, «pojoAttrName», sqlControl);
				if (count > 0) {
					sqlInsert«pojo.name».insert(sqlSession, «pojoAttrName», sqlControl);
				}«ELSE»
				int count = sqlInsert«pojo.name».insert(sqlSession, «pojoAttrName», sqlControl);«ENDIF»
				if (logger.isTraceEnabled()) {
					logger.trace("sql insert «pojoAttrName» result: " + count + " " + «pojoAttrName»);
				}
				return (count > 0) ? «pojoAttrName» : null;
   			'''
   		]	
   		
		members += entity.toMethod('insert', typeRef(pojoType)) [
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			parameters += entity.toParameter("sqlControl", typeRef(SQL_CONTROL))
			body = '''
				return insert(sqlSessionFactory.getSqlSession(), «pojoAttrName», sqlControl);
			'''
   		]	
   		
		members += entity.toMethod('insert', typeRef(pojoType)) [
			parameters += entity.toParameter("sqlSession", typeRef(SQL_SESSION))
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			body = '''
				return insert(sqlSession, «pojoAttrName», null);
   			'''
   		]	
   		
		members += entity.toMethod('insert', typeRef(pojoType)) [
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			body = '''
				return insert(«pojoAttrName», null);
   			'''
   		]	
	}

   	def void inferGet(DaoEntity entity, DaoDirectiveCrud dir, JvmGenericType entityType, String simpleName, 
   		PojoEntity pojo, JvmGenericType pojoType, List<JvmMember> members, 
   		Map<String, Map<String, JvmParameterizedTypeReference>> moreResultClasses
   	) {
   		val pojoAttrName = pojo.name.toFirstLower
   		
		members += entity.toMethod('get', typeRef(pojoType)) [
			parameters += entity.toParameter("sqlSession", typeRef(SQL_SESSION))
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			parameters += entity.toParameter("sqlControl", typeRef(SQL_CONTROL))
			body = '''
				if (logger.isTraceEnabled()) {
					logger.trace("sql get: " + «pojoAttrName» + " " + sqlControl);
				}
				«CRUD_ENGINE» sqlGetEngine«pojo.name» = sqlEngineFactory.getCheckedCrudEngine("GET_«dbName(pojo.name)»");
				«IF moreResultClasses.empty»//«ENDIF»sqlControl = getMoreResultClasses(«pojoAttrName», sqlControl);
				«pojo.name» «pojoAttrName»Got = sqlGetEngine«pojo.name».get(sqlSession, «pojo.name».class, «pojoAttrName», sqlControl);
				if (logger.isTraceEnabled()) {
					logger.trace("sql get «pojoAttrName» result: " + «pojoAttrName»Got);
				}
				return «pojoAttrName»Got;
   				'''
   		]	
   		
		members += entity.toMethod('get', typeRef(pojoType)) [
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			parameters += entity.toParameter("sqlControl", typeRef(SQL_CONTROL))
			body = '''
				return get(sqlSessionFactory.getSqlSession(), «pojoAttrName», sqlControl);
			'''
   		]	
   		
		members += entity.toMethod('get', typeRef(pojoType)) [
			parameters += entity.toParameter("sqlSession", typeRef(SQL_SESSION))
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			body = '''
				return get(sqlSession, «pojoAttrName», null);
   			'''
   		]	
   		
		members += entity.toMethod('get', typeRef(pojoType)) [
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			body = '''
				return get(«pojoAttrName», null);
   			'''
   		]	
	}

   	def void inferUpdate(DaoEntity entity, DaoDirectiveCrud dir, JvmGenericType entityType, String simpleName, 
   		PojoEntity pojo, JvmGenericType pojoType, List<JvmMember> members
   	) {
   		val pojoAttrName = pojo.name.toFirstLower
   		val parent = pojo.parent
   		
		members += entity.toMethod('update', typeRef(int)) [
			parameters += entity.toParameter("sqlSession", typeRef(SQL_SESSION))
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			parameters += entity.toParameter("sqlControl", typeRef(SQL_CONTROL))
			body = '''
				if (logger.isTraceEnabled()) {
					logger.trace("sql update «pojoAttrName»: " + «pojoAttrName» + " " + sqlControl);
				}
				«CRUD_ENGINE» sqlUpdateEngine«pojo.name» = sqlEngineFactory.getCheckedCrudEngine("UPDATE_«dbName(pojo.name)»");«IF parent != null»
				«CRUD_ENGINE» sqlUpdate«parent.name» = sqlEngineFactory.getCheckedCrudEngine("UPDATE_«dbName(parent.name)»");«ENDIF»
				int count = sqlUpdateEngine«pojo.name».update(sqlSession, «pojoAttrName», sqlControl);«IF parent != null»
				if (count > 0) {
					sqlUpdate«parent.name».update(sqlSession, «pojoAttrName», sqlControl);
				}«ENDIF»«val f=getOptLock(pojo)»«IF f != null»
				if (count > 0) {
					«pojoAttrName».set«f.name.toFirstUpper»(«pojoAttrName».get«f.name.toFirstUpper»() + 1);
				}«ENDIF»
				if (logger.isTraceEnabled()) {
					logger.trace("sql update «pojoAttrName» result count: " + count);
				}
				return count;
   				'''
   		]	
   		
		members += entity.toMethod('update', typeRef(int)) [
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			parameters += entity.toParameter("sqlControl", typeRef(SQL_CONTROL))
			body = '''
				return update(sqlSessionFactory.getSqlSession(), «pojoAttrName», sqlControl);
			'''
   		]	
   		
		members += entity.toMethod('update', typeRef(int)) [
			parameters += entity.toParameter("sqlSession", typeRef(SQL_SESSION))
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			body = '''
				return update(sqlSession, «pojoAttrName», null);
   			'''
   		]	
   		
		members += entity.toMethod('update', typeRef(int)) [
			parameters += entity.toParameter(pojoAttrName, typeRef(pojoType))
			body = '''
				return update(«pojoAttrName», null);
   			'''
   		]	
	}
}

