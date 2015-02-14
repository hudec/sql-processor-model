/*
 * generated by Xtext
 */
package org.sqlproc.model.validation
import org.eclipse.xtext.validation.Check

import static org.sqlproc.model.util.Constants.*

import java.lang.reflect.Modifier
import java.lang.reflect.ParameterizedType
import java.util.Collection
import java.util.List

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.IScopeProvider
import org.sqlproc.model.processorModel.AbstractPojoEntity
import org.sqlproc.model.processorModel.Artifacts
import org.sqlproc.model.processorModel.EnumEntity
import org.sqlproc.model.processorModel.EnumProperty
import org.sqlproc.model.processorModel.FunctionDefinition
import org.sqlproc.model.processorModel.Package
import org.sqlproc.model.processorModel.PojoAnnotatedProperty
import org.sqlproc.model.processorModel.PojoDao
import org.sqlproc.model.processorModel.PojoDefinition
import org.sqlproc.model.processorModel.PojoEntity
import org.sqlproc.model.processorModel.PojoProperty
import org.sqlproc.model.processorModel.ProcedureDefinition
import org.sqlproc.model.processorModel.ProcessorModelPackage
import org.sqlproc.model.processorModel.Property
import org.sqlproc.model.processorModel.TableDefinition
import org.sqlproc.model.property.ModelProperty
import org.sqlproc.model.resolver.DbResolver
import org.sqlproc.model.resolver.PojoResolverFactory
import org.sqlproc.model.util.Utils

import com.google.inject.Inject

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.sqlproc.model.generator.ProcessorGeneratorUtils
import org.sqlproc.model.processorModel.DirectiveProperties
import org.sqlproc.model.processorModel.PojoDirective

enum ValidationResult {
	OK, WARNING, ERROR
}

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ProcessorModelValidator extends AbstractProcessorModelValidator {

    @Inject
    PojoResolverFactory pojoResolverFactory

    @Inject
    DbResolver dbResolver

    @Inject
    IScopeProvider scopeProvider

    @Inject
    IQualifiedNameConverter qualifiedNameConverter

    @Inject
    ModelProperty modelProperty

	@Inject extension ProcessorGeneratorUtils

    @Check
    def checkUniquePojoDefinition(PojoDefinition pojoDefinition) {
        if (isResolvePojo(pojoDefinition) && !checkClass(getClass(pojoDefinition)))
            error("Class name : " + getClass(pojoDefinition) + " not exists",
                    ProcessorModelPackage.Literals.POJO_DEFINITION__NAME)
        if (!(pojoDefinition.rootContainer instanceof Artifacts))
            return
        val artifacts = pojoDefinition.rootContainer as Artifacts
        for (PojoDefinition definition : artifacts.getPojos()) {
            if (definition != null && definition !== pojoDefinition) {
	            if (pojoDefinition.getName().equals(definition.getName())) {
	                error("Duplicate name : " + pojoDefinition.getName(),
	                        ProcessorModelPackage.Literals.POJO_DEFINITION__NAME)
	                return
	            }
            }
        }
    }
    def checkClass(String className) {
        if (className == null || pojoResolverFactory.getPojoResolver() == null)
            return true

        val clazz = pojoResolverFactory.getPojoResolver().loadClass(className)
        return clazz != null
    }

    def isResolvePojo(EObject model) {
        if (pojoResolverFactory.getPojoResolver() == null
                || !pojoResolverFactory.getPojoResolver().isResolvePojo(model))
            return false
        return true

    }

    def isResolveDb(EObject model) {
        return dbResolver.isResolveDb(model)
    }

    def String getClass(PojoDefinition pojo) {
        if (pojo.getClassx() != null)
            return pojo.getClassx().getQualifiedName()
        return pojo.getClass_()
    }

    def isNumber(String param) {
        if (param == null)
            return false
        var i = param.length() - 1
        while(i >= 0) {
            if (!Character.isDigit(param.charAt(i)))
                return false
            i = i - 1
        }
        return true
    }

    def isPrimitive(Class<?> clazz) {
        if (clazz == null)
            return true
        if (clazz == typeof(String))
            return true
        if (clazz == typeof(java.util.Date))
            return true
        if (clazz == typeof(java.sql.Date))
            return true
        if (clazz == typeof(java.sql.Time))
            return true
        if (clazz == typeof(java.sql.Timestamp))
            return true
        if (clazz == typeof(java.sql.Blob))
            return true
        if (clazz == typeof(java.sql.Clob))
            return true
        if (clazz == typeof(java.math.BigDecimal))
            return true
        if (clazz == typeof(java.math.BigInteger))
            return true
        return false
    }

    def ValidationResult checkClassProperty(String className, String property) {
        if (property == null || isNumber(property) || pojoResolverFactory.getPojoResolver() == null)
            return ValidationResult.OK
        if (className == null)
            return ValidationResult.ERROR
        var descriptors = pojoResolverFactory.getPojoResolver().getPropertyDescriptors(className)
        if (descriptors == null) {
            return ValidationResult.WARNING
        }
        var checkProperty = property
        var pos1 = checkProperty.indexOf('=')
        if (pos1 > 0) {
            var pos2 = checkProperty.indexOf('.', pos1)
            if (pos2 > pos1)
                checkProperty = checkProperty.substring(0, pos1) + checkProperty.substring(pos2)
        }
        var innerProperty = null as String
        pos1 = checkProperty.indexOf('.')
        if (pos1 > 0) {
            innerProperty = checkProperty.substring(pos1 + 1)
            checkProperty = checkProperty.substring(0, pos1)
        }
        val _checkProperty = checkProperty
        var innerDesriptor = descriptors.findFirst[descriptor |
            descriptor.name == _checkProperty
        ]
        if (innerDesriptor == null) {
            val clazz = pojoResolverFactory.getPojoResolver().loadClass(className)
            if (clazz != null && Modifier.isAbstract(clazz.getModifiers()))
                return ValidationResult.WARNING
            return ValidationResult.ERROR
        }
        if (innerProperty != null) {
            var innerClass = innerDesriptor.getPropertyType()
            if (innerClass.isArray()) {
                val type = innerDesriptor.getReadMethod().getGenericReturnType() as ParameterizedType
                if (type.getActualTypeArguments() == null || type.getActualTypeArguments().length == 0)
                    return ValidationResult.WARNING
                innerClass = type.getActualTypeArguments().head as Class<?>
                if (isPrimitive(innerClass))
                    return ValidationResult.ERROR
                return checkClassProperty(innerClass.getName(), innerProperty)
            } else if (typeof(Collection).isAssignableFrom(innerClass)) {
                val type = innerDesriptor.getReadMethod().getGenericReturnType() as ParameterizedType
                if (type.getActualTypeArguments() == null || type.getActualTypeArguments().length == 0)
                    return ValidationResult.WARNING
                innerClass = type.getActualTypeArguments().head as Class<?>
                if (isPrimitive(innerClass))
                    return ValidationResult.ERROR
                return checkClassProperty(innerClass.getName(), innerProperty)
            } else {
                if (isPrimitive(innerClass))
                    return ValidationResult.ERROR
                return checkClassProperty(innerClass.getName(), innerProperty)
            }
        }
        return ValidationResult.OK
    }

    def ValidationResult checkEntityProperty(PojoEntity entity, String property) {
        if (property == null || isNumber(property))
            return ValidationResult.OK
        var checkProperty = property
        var pos1 = checkProperty.indexOf('=')
        if (pos1 > 0) {
            var pos2 = checkProperty.indexOf('.', pos1)
            if (pos2 > pos1)
                checkProperty = checkProperty.substring(0, pos1) + checkProperty.substring(pos2)
        }
        var innerProperty = null as String
        pos1 = checkProperty.indexOf('.')
        if (pos1 > 0) {
            innerProperty = checkProperty.substring(pos1 + 1)
            checkProperty = checkProperty.substring(0, pos1)
        }

        for (PojoAnnotatedProperty apojoProperty : entity.getFeatures()) {
            var pojoProperty = apojoProperty.getFeature()
            if (pojoProperty.getName().equals(checkProperty)) {
                if (innerProperty == null)
                    return ValidationResult.OK
                if (pojoProperty.getRef() != null) {
                    if (pojoProperty.getRef() instanceof PojoEntity) {
                        return checkEntityProperty(pojoProperty.getRef() as PojoEntity, innerProperty)
                    }
                    return ValidationResult.OK
                }
                if (pojoProperty.getGref() != null)
                    return checkEntityProperty(pojoProperty.getGref(), innerProperty)
                return ValidationResult.ERROR
            }
        }
        var superType = getSuperType(entity)
        if (superType != null) {
            var result = checkEntityProperty(superType, property)
            if (result == ValidationResult.WARNING || result == ValidationResult.OK)
                return result
        }
        if (isAbstract(entity)) {
            return ValidationResult.WARNING
        }
        else {
            val suppressedAbstracts = modelProperty.getNotAbstractTables(entity)
            if (suppressedAbstracts != null && suppressedAbstracts.contains(Utils.dbName(entity))) {
                return ValidationResult.WARNING
            }
            else {
                return ValidationResult.ERROR
            }
        }
    }

    @Check
    def checkUniqueProperty(Property property) {
        if (!(property.rootContainer instanceof Artifacts))
            return
        val artifacts = property.rootContainer as Artifacts
        for (Property prop : artifacts.getProperties()) {
            if (prop != null && prop !== property) {
	            if (prop.getName().equals(property.getName()) && !prop.getName().startsWith("pojogen")
	                    && !prop.getName().startsWith("database") && !prop.getName().startsWith("metagen")
	                    && !prop.getName().startsWith("daogen") && !prop.getName().startsWith("replace-all")) {
	                error("Duplicate name : " + property.getName(), ProcessorModelPackage.Literals.PROPERTY__NAME)
	                return
	            }
            }
        }
    }

    @Check
    def checkTableDefinition(TableDefinition tableDefinition) {
        if (!(tableDefinition.rootContainer instanceof Artifacts))
            return
        val artifacts = tableDefinition.rootContainer as Artifacts
        for (TableDefinition table : artifacts.getTables()) {
            if (table != null && table !== tableDefinition) {
	            if (tableDefinition.getName().equals(table.getName())) {
	                error("Duplicate name : " + tableDefinition.getName() + "[table]",
	                        ProcessorModelPackage.Literals.TABLE_DEFINITION__NAME)
	                return
				}
	           }
        }
        if (isResolveDb(tableDefinition) && !dbResolver.checkTable(tableDefinition, tableDefinition.getTable())) {
            error("Cannot find table in DB : " + tableDefinition.getTable(),
                    ProcessorModelPackage.Literals.TABLE_DEFINITION__TABLE)
        }
    }

    @Check
    def checkProcedureDefinition(ProcedureDefinition procedureDefinition) {
        if (!(procedureDefinition.rootContainer instanceof Artifacts))
            return
        val artifacts = procedureDefinition.rootContainer as Artifacts
        for (ProcedureDefinition procedure : artifacts.getProcedures()) {
            if (procedure != null && procedure !== procedureDefinition) {
	            if (procedureDefinition.getName().equals(procedure.getName())) {
	                error("Duplicate name : " + procedureDefinition.getName() + "[procedure]",
	                        ProcessorModelPackage.Literals.PROCEDURE_DEFINITION__NAME)
	                return
	            }
	        }
        }
        if (isResolveDb(procedureDefinition)
                && !dbResolver.checkProcedure(procedureDefinition, procedureDefinition.getTable())) {
            error("Cannot find procedure in DB : " + procedureDefinition.getTable(),
                    ProcessorModelPackage.Literals.PROCEDURE_DEFINITION__NAME)
        }
    }

    @Check
    def checkFunctionDefinition(FunctionDefinition functionDefinition) {
        if (!(functionDefinition.rootContainer instanceof Artifacts))
            return
        val artifacts = functionDefinition.rootContainer as Artifacts
        for (FunctionDefinition function : artifacts.getFunctions()) {
            if (function != null && function !== functionDefinition) {
	            if (functionDefinition.getName().equals(function.getName())) {
	                error("Duplicate name : " + functionDefinition.getName() + "[function]",
	                        ProcessorModelPackage.Literals.FUNCTION_DEFINITION__NAME)
	                return
	            }
	    	}
        }
    }

    @Check
    def checkUniquePojoEntity(PojoEntity pojoEntity) {
        if (!(pojoEntity.rootContainer instanceof Artifacts))
            return
        val artifacts = pojoEntity.rootContainer as Artifacts
        for (Package pkg : artifacts.getPackages()) {
            if (pkg != null) {
	            for (AbstractPojoEntity entity : pkg.getElements()) {
	                if (entity != null && (entity instanceof PojoEntity)) {
		                val pentity = entity as PojoEntity
		                if (pentity !== pojoEntity) {
			                if (pojoEntity.getName().equals(pentity.getName())) {
			                    error("Duplicate name : " + pojoEntity.getName(), ProcessorModelPackage.Literals.ENTITY__NAME)
			                    return
			                }
		                }
					}
	            }
            }
        }
    }

    @Check
    def checkUniquePojoProperty(PojoProperty pojoProperty) {
        val entity = pojoProperty.getContainerOfType(typeof(PojoEntity))
        for (PojoAnnotatedProperty aproperty : entity.getFeatures()) {
            val property = aproperty.getFeature()
            if (property != null && property !== pojoProperty) {
	            if (pojoProperty.getName().equals(property.getName())) {
	                error("Duplicate name : " + pojoProperty.getName(), ProcessorModelPackage.Literals.POJO_PROPERTY__NAME)
	                return
	            }
            }
        }
    }

    @Check
    def checkUniqueEnumEntity(EnumEntity enumEntity) {
        if (!(enumEntity.rootContainer instanceof Artifacts))
            return
        val artifacts = enumEntity.rootContainer as Artifacts
        for (Package pkg : artifacts.getPackages()) {
            if (pkg != null) {
	            for (AbstractPojoEntity entity : pkg.getElements()) {
	                if (entity != null && (entity instanceof EnumEntity)) {
		                val pentity = entity as EnumEntity
		                if (pentity != enumEntity) {
			                if (enumEntity.getName().equals(pentity.getName())) {
			                    error("Duplicate name : " + enumEntity.getName(), ProcessorModelPackage.Literals.ENTITY__NAME)
			                    return
			                }
						}
					}
	            }
            }
        }
    }

    @Check
    def checkUniqueEnumProperty(EnumProperty enumProperty) {
        val entity = enumProperty.getContainerOfType(typeof(EnumEntity))
        for (EnumProperty property : entity.getFeatures()) {
            if (property != null && property !== enumProperty) {
	            if (enumProperty.getName().equals(property.getName())) {
	                error("Duplicate name : " + enumProperty.getName(), ProcessorModelPackage.Literals.ENUM_PROPERTY__NAME)
	                return
	            }
            }
        }
    }

    @Check
    def checkUniquePojoDao(PojoDao pojoDao) {
        if (!(pojoDao.rootContainer instanceof Artifacts))
            return
        val artifacts = pojoDao.rootContainer as Artifacts
        for (Package pkg : artifacts.getPackages()) {
            if (pkg != null) {
	            for (AbstractPojoEntity dao : pkg.getElements()) {
	                if (dao != null && (dao instanceof PojoDao)) {
		                val pdao = dao as PojoDao
		                if (pdao != pojoDao) {
			                if (pojoDao.getName().equals(pdao.getName())) {
			                    error("Duplicate name : " + pojoDao.getName(), ProcessorModelPackage.Literals.POJO_DAO__NAME)
			                    return
			                }
		                }
	                }
	            }
            }
        }
    }


	// see ProcessorDslScopeProvider
//	@Check
//	def checkDirectiveProperties(DirectiveProperties directiveProperties) {
//		if (directiveProperties.features == null || directiveProperties.features.empty)
//			return;
//        val directive = directiveProperties.getContainerOfType(typeof(PojoDirective))
//        val entity = directive.getContainerOfType(typeof(PojoEntity))
//		val attributes = attributesAsMap(entity)
//        for (PojoProperty prop : directiveProperties.features) {
//        	if (!attributes.containsKey(prop.name)) {
//                error("Cannot find property : " + prop.name + "[" + entity.name + "]",
//                        ProcessorModelPackage.Literals.DIRECTIVE_PROPERTIES__FEATURES)
//                return
//        	}
//        }
//		return
//	}
}
