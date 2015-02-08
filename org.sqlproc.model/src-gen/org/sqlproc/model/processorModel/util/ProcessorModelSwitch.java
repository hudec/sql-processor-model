/**
 */
package org.sqlproc.model.processorModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.sqlproc.model.processorModel.AbstractEntity;
import org.sqlproc.model.processorModel.AnnotatedEntity;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.AnnotationDirective;
import org.sqlproc.model.processorModel.AnnotationDirectiveAttribute;
import org.sqlproc.model.processorModel.AnnotationDirectiveConflict;
import org.sqlproc.model.processorModel.AnnotationDirectiveConstructor;
import org.sqlproc.model.processorModel.AnnotationDirectiveGetter;
import org.sqlproc.model.processorModel.AnnotationDirectiveSetter;
import org.sqlproc.model.processorModel.AnnotationDirectiveStandard;
import org.sqlproc.model.processorModel.AnnotationDirectiveStatic;
import org.sqlproc.model.processorModel.Artifacts;
import org.sqlproc.model.processorModel.ColumnAssignement;
import org.sqlproc.model.processorModel.ColumnTypeAssignement;
import org.sqlproc.model.processorModel.DaoDirective;
import org.sqlproc.model.processorModel.DaoDirectiveCrud;
import org.sqlproc.model.processorModel.DaoDirectiveDiscriminator;
import org.sqlproc.model.processorModel.DaoDirectiveParameters;
import org.sqlproc.model.processorModel.DaoDirectiveQuery;
import org.sqlproc.model.processorModel.DaoDirectiveSerializable;
import org.sqlproc.model.processorModel.DaoEntity;
import org.sqlproc.model.processorModel.DaogenProperty;
import org.sqlproc.model.processorModel.DatabaseCatalogAssignement;
import org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement;
import org.sqlproc.model.processorModel.DatabaseProperty;
import org.sqlproc.model.processorModel.DatabaseSchemaAssignement;
import org.sqlproc.model.processorModel.DatabaseTypeAssignement;
import org.sqlproc.model.processorModel.DebugLevelAssignement;
import org.sqlproc.model.processorModel.DescendantAssignment;
import org.sqlproc.model.processorModel.DirectiveProperties;
import org.sqlproc.model.processorModel.DriverMetaInfoAssignement;
import org.sqlproc.model.processorModel.DriverMethodOutputAssignement;
import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.EnumDirective;
import org.sqlproc.model.processorModel.EnumDirectiveSerializable;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumProperty;
import org.sqlproc.model.processorModel.EnumPropertyDirective;
import org.sqlproc.model.processorModel.EnumPropertyDirectiveValues;
import org.sqlproc.model.processorModel.EnumPropertyValue;
import org.sqlproc.model.processorModel.ExportAssignement;
import org.sqlproc.model.processorModel.Extends;
import org.sqlproc.model.processorModel.ExtendsAssignement;
import org.sqlproc.model.processorModel.ExtendsAssignementGenerics;
import org.sqlproc.model.processorModel.FunProcDirective;
import org.sqlproc.model.processorModel.FunProcType;
import org.sqlproc.model.processorModel.FunctionCall;
import org.sqlproc.model.processorModel.FunctionCallQuery;
import org.sqlproc.model.processorModel.FunctionDefinition;
import org.sqlproc.model.processorModel.FunctionPojoAssignement;
import org.sqlproc.model.processorModel.FunctionQuery;
import org.sqlproc.model.processorModel.Implements;
import org.sqlproc.model.processorModel.ImplementsAssignement;
import org.sqlproc.model.processorModel.ImplementsAssignementGenerics;
import org.sqlproc.model.processorModel.ImplementsExtendsDirective;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveGenerics;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos;
import org.sqlproc.model.processorModel.ImportAssignement;
import org.sqlproc.model.processorModel.InheritanceAssignement;
import org.sqlproc.model.processorModel.JoinTableAssignement;
import org.sqlproc.model.processorModel.ManyToManyAssignement;
import org.sqlproc.model.processorModel.MetaTypeAssignement;
import org.sqlproc.model.processorModel.MetagenProperty;
import org.sqlproc.model.processorModel.PojoAttribute;
import org.sqlproc.model.processorModel.PojoAttributeDirective;
import org.sqlproc.model.processorModel.PojoDefinition;
import org.sqlproc.model.processorModel.PojoDirective;
import org.sqlproc.model.processorModel.PojoDirectiveDiscriminator;
import org.sqlproc.model.processorModel.PojoDirectiveEquals;
import org.sqlproc.model.processorModel.PojoDirectiveHashCode;
import org.sqlproc.model.processorModel.PojoDirectiveIndex;
import org.sqlproc.model.processorModel.PojoDirectiveOperators;
import org.sqlproc.model.processorModel.PojoDirectiveSerializable;
import org.sqlproc.model.processorModel.PojoDirectiveToString;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveCreateCol;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveDiscriminator;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumDef;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumInit;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveIndex;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveIsDef;
import org.sqlproc.model.processorModel.PojoPropertyDirectivePrimaryKey;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveRequired;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveToInit;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveUpdateCol;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveVersion;
import org.sqlproc.model.processorModel.PojogenProperty;
import org.sqlproc.model.processorModel.ProcedureCallQuery;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.ProcedurePojoAssignement;
import org.sqlproc.model.processorModel.ProcedureUpdate;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.Property;
import org.sqlproc.model.processorModel.PropertyCondition;
import org.sqlproc.model.processorModel.ShowColumnTypeAssignement;
import org.sqlproc.model.processorModel.SqlTypeAssignement;
import org.sqlproc.model.processorModel.TableAssignement;
import org.sqlproc.model.processorModel.TableDefinition;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage
 * @generated
 */
public class ProcessorModelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProcessorModelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorModelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ProcessorModelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ProcessorModelPackage.ARTIFACTS:
      {
        Artifacts artifacts = (Artifacts)theEObject;
        T result = caseArtifacts(artifacts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.VALUE_TYPE:
      {
        ValueType valueType = (ValueType)theEObject;
        T result = caseValueType(valueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT:
      {
        DatabaseCatalogAssignement databaseCatalogAssignement = (DatabaseCatalogAssignement)theEObject;
        T result = caseDatabaseCatalogAssignement(databaseCatalogAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DATABASE_SCHEMA_ASSIGNEMENT:
      {
        DatabaseSchemaAssignement databaseSchemaAssignement = (DatabaseSchemaAssignement)theEObject;
        T result = caseDatabaseSchemaAssignement(databaseSchemaAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DATABASE_TYPE_ASSIGNEMENT:
      {
        DatabaseTypeAssignement databaseTypeAssignement = (DatabaseTypeAssignement)theEObject;
        T result = caseDatabaseTypeAssignement(databaseTypeAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT:
      {
        DatabaseMetaInfoAssignement databaseMetaInfoAssignement = (DatabaseMetaInfoAssignement)theEObject;
        T result = caseDatabaseMetaInfoAssignement(databaseMetaInfoAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT:
      {
        DriverMetaInfoAssignement driverMetaInfoAssignement = (DriverMetaInfoAssignement)theEObject;
        T result = caseDriverMetaInfoAssignement(driverMetaInfoAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT:
      {
        DriverMethodOutputAssignement driverMethodOutputAssignement = (DriverMethodOutputAssignement)theEObject;
        T result = caseDriverMethodOutputAssignement(driverMethodOutputAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT:
      {
        SqlTypeAssignement sqlTypeAssignement = (SqlTypeAssignement)theEObject;
        T result = caseSqlTypeAssignement(sqlTypeAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.COLUMN_TYPE_ASSIGNEMENT:
      {
        ColumnTypeAssignement columnTypeAssignement = (ColumnTypeAssignement)theEObject;
        T result = caseColumnTypeAssignement(columnTypeAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.SHOW_COLUMN_TYPE_ASSIGNEMENT:
      {
        ShowColumnTypeAssignement showColumnTypeAssignement = (ShowColumnTypeAssignement)theEObject;
        T result = caseShowColumnTypeAssignement(showColumnTypeAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.TABLE_ASSIGNEMENT:
      {
        TableAssignement tableAssignement = (TableAssignement)theEObject;
        T result = caseTableAssignement(tableAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.JOIN_TABLE_ASSIGNEMENT:
      {
        JoinTableAssignement joinTableAssignement = (JoinTableAssignement)theEObject;
        T result = caseJoinTableAssignement(joinTableAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.COLUMN_ASSIGNEMENT:
      {
        ColumnAssignement columnAssignement = (ColumnAssignement)theEObject;
        T result = caseColumnAssignement(columnAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPORT_ASSIGNEMENT:
      {
        ImportAssignement importAssignement = (ImportAssignement)theEObject;
        T result = caseImportAssignement(importAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.EXPORT_ASSIGNEMENT:
      {
        ExportAssignement exportAssignement = (ExportAssignement)theEObject;
        T result = caseExportAssignement(exportAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.INHERITANCE_ASSIGNEMENT:
      {
        InheritanceAssignement inheritanceAssignement = (InheritanceAssignement)theEObject;
        T result = caseInheritanceAssignement(inheritanceAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.MANY_TO_MANY_ASSIGNEMENT:
      {
        ManyToManyAssignement manyToManyAssignement = (ManyToManyAssignement)theEObject;
        T result = caseManyToManyAssignement(manyToManyAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DEBUG_LEVEL_ASSIGNEMENT:
      {
        DebugLevelAssignement debugLevelAssignement = (DebugLevelAssignement)theEObject;
        T result = caseDebugLevelAssignement(debugLevelAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.PROCEDURE_POJO_ASSIGNEMENT:
      {
        ProcedurePojoAssignement procedurePojoAssignement = (ProcedurePojoAssignement)theEObject;
        T result = caseProcedurePojoAssignement(procedurePojoAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT:
      {
        FunctionPojoAssignement functionPojoAssignement = (FunctionPojoAssignement)theEObject;
        T result = caseFunctionPojoAssignement(functionPojoAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT:
      {
        ImplementsAssignement implementsAssignement = (ImplementsAssignement)theEObject;
        T result = caseImplementsAssignement(implementsAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.EXTENDS_ASSIGNEMENT:
      {
        ExtendsAssignement extendsAssignement = (ExtendsAssignement)theEObject;
        T result = caseExtendsAssignement(extendsAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT_GENERICS:
      {
        ImplementsAssignementGenerics implementsAssignementGenerics = (ImplementsAssignementGenerics)theEObject;
        T result = caseImplementsAssignementGenerics(implementsAssignementGenerics);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.EXTENDS_ASSIGNEMENT_GENERICS:
      {
        ExtendsAssignementGenerics extendsAssignementGenerics = (ExtendsAssignementGenerics)theEObject;
        T result = caseExtendsAssignementGenerics(extendsAssignementGenerics);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.PROPERTY_CONDITION:
      {
        PropertyCondition propertyCondition = (PropertyCondition)theEObject;
        T result = casePropertyCondition(propertyCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DATABASE_PROPERTY:
      {
        DatabaseProperty databaseProperty = (DatabaseProperty)theEObject;
        T result = caseDatabaseProperty(databaseProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJOGEN_PROPERTY:
      {
        PojogenProperty pojogenProperty = (PojogenProperty)theEObject;
        T result = casePojogenProperty(pojogenProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.META_TYPE_ASSIGNEMENT:
      {
        MetaTypeAssignement metaTypeAssignement = (MetaTypeAssignement)theEObject;
        T result = caseMetaTypeAssignement(metaTypeAssignement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.METAGEN_PROPERTY:
      {
        MetagenProperty metagenProperty = (MetagenProperty)theEObject;
        T result = caseMetagenProperty(metagenProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAOGEN_PROPERTY:
      {
        DaogenProperty daogenProperty = (DaogenProperty)theEObject;
        T result = caseDaogenProperty(daogenProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DEFINITION:
      {
        PojoDefinition pojoDefinition = (PojoDefinition)theEObject;
        T result = casePojoDefinition(pojoDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.TABLE_DEFINITION:
      {
        TableDefinition tableDefinition = (TableDefinition)theEObject;
        T result = caseTableDefinition(tableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.PROCEDURE_DEFINITION:
      {
        ProcedureDefinition procedureDefinition = (ProcedureDefinition)theEObject;
        T result = caseProcedureDefinition(procedureDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.FUNCTION_DEFINITION:
      {
        FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
        T result = caseFunctionDefinition(functionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.PACKAGE:
      {
        org.sqlproc.model.processorModel.Package package_ = (org.sqlproc.model.processorModel.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ABSTRACT_ENTITY:
      {
        AbstractEntity abstractEntity = (AbstractEntity)theEObject;
        T result = caseAbstractEntity(abstractEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE:
      {
        ImplementsExtendsDirective implementsExtendsDirective = (ImplementsExtendsDirective)theEObject;
        T result = caseImplementsExtendsDirective(implementsExtendsDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS:
      {
        Implements implements_ = (Implements)theEObject;
        T result = caseImplements(implements_);
        if (result == null) result = caseAbstractEntity(implements_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.EXTENDS:
      {
        Extends extends_ = (Extends)theEObject;
        T result = caseExtends(extends_);
        if (result == null) result = caseAbstractEntity(extends_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATED_ENTITY:
      {
        AnnotatedEntity annotatedEntity = (AnnotatedEntity)theEObject;
        T result = caseAnnotatedEntity(annotatedEntity);
        if (result == null) result = caseAbstractEntity(annotatedEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DIRECTIVE_PROPERTIES:
      {
        DirectiveProperties directiveProperties = (DirectiveProperties)theEObject;
        T result = caseDirectiveProperties(directiveProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE:
      {
        PojoDirective pojoDirective = (PojoDirective)theEObject;
        T result = casePojoDirective(pojoDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_ENTITY:
      {
        PojoEntity pojoEntity = (PojoEntity)theEObject;
        T result = casePojoEntity(pojoEntity);
        if (result == null) result = caseEntity(pojoEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE:
      {
        PojoAttributeDirective pojoAttributeDirective = (PojoAttributeDirective)theEObject;
        T result = casePojoAttributeDirective(pojoAttributeDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_ATTRIBUTE:
      {
        PojoAttribute pojoAttribute = (PojoAttribute)theEObject;
        T result = casePojoAttribute(pojoAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENUM_DIRECTIVE:
      {
        EnumDirective enumDirective = (EnumDirective)theEObject;
        T result = caseEnumDirective(enumDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENUM_ENTITY:
      {
        EnumEntity enumEntity = (EnumEntity)theEObject;
        T result = caseEnumEntity(enumEntity);
        if (result == null) result = caseEntity(enumEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENUM_PROPERTY_VALUE:
      {
        EnumPropertyValue enumPropertyValue = (EnumPropertyValue)theEObject;
        T result = caseEnumPropertyValue(enumPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENUM_PROPERTY_DIRECTIVE:
      {
        EnumPropertyDirective enumPropertyDirective = (EnumPropertyDirective)theEObject;
        T result = caseEnumPropertyDirective(enumPropertyDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENUM_PROPERTY:
      {
        EnumProperty enumProperty = (EnumProperty)theEObject;
        T result = caseEnumProperty(enumProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAO_DIRECTIVE_PARAMETERS:
      {
        DaoDirectiveParameters daoDirectiveParameters = (DaoDirectiveParameters)theEObject;
        T result = caseDaoDirectiveParameters(daoDirectiveParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DESCENDANT_ASSIGNMENT:
      {
        DescendantAssignment descendantAssignment = (DescendantAssignment)theEObject;
        T result = caseDescendantAssignment(descendantAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.FUN_PROC_TYPE:
      {
        FunProcType funProcType = (FunProcType)theEObject;
        T result = caseFunProcType(funProcType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAO_DIRECTIVE:
      {
        DaoDirective daoDirective = (DaoDirective)theEObject;
        T result = caseDaoDirective(daoDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAO_ENTITY:
      {
        DaoEntity daoEntity = (DaoEntity)theEObject;
        T result = caseDaoEntity(daoEntity);
        if (result == null) result = caseEntity(daoEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE:
      {
        AnnotationDirective annotationDirective = (AnnotationDirective)theEObject;
        T result = caseAnnotationDirective(annotationDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_GENERICS:
      {
        ImplementsExtendsDirectiveGenerics implementsExtendsDirectiveGenerics = (ImplementsExtendsDirectiveGenerics)theEObject;
        T result = caseImplementsExtendsDirectiveGenerics(implementsExtendsDirectiveGenerics);
        if (result == null) result = caseImplementsExtendsDirective(implementsExtendsDirectiveGenerics);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS:
      {
        ImplementsExtendsDirectiveOnlyPojos implementsExtendsDirectiveOnlyPojos = (ImplementsExtendsDirectiveOnlyPojos)theEObject;
        T result = caseImplementsExtendsDirectiveOnlyPojos(implementsExtendsDirectiveOnlyPojos);
        if (result == null) result = caseImplementsExtendsDirective(implementsExtendsDirectiveOnlyPojos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_DAOS:
      {
        ImplementsExtendsDirectiveOnlyDaos implementsExtendsDirectiveOnlyDaos = (ImplementsExtendsDirectiveOnlyDaos)theEObject;
        T result = caseImplementsExtendsDirectiveOnlyDaos(implementsExtendsDirectiveOnlyDaos);
        if (result == null) result = caseImplementsExtendsDirective(implementsExtendsDirectiveOnlyDaos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS:
      {
        ImplementsExtendsDirectiveExceptPojos implementsExtendsDirectiveExceptPojos = (ImplementsExtendsDirectiveExceptPojos)theEObject;
        T result = caseImplementsExtendsDirectiveExceptPojos(implementsExtendsDirectiveExceptPojos);
        if (result == null) result = caseImplementsExtendsDirective(implementsExtendsDirectiveExceptPojos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_DAOS:
      {
        ImplementsExtendsDirectiveExceptDaos implementsExtendsDirectiveExceptDaos = (ImplementsExtendsDirectiveExceptDaos)theEObject;
        T result = caseImplementsExtendsDirectiveExceptDaos(implementsExtendsDirectiveExceptDaos);
        if (result == null) result = caseImplementsExtendsDirective(implementsExtendsDirectiveExceptDaos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE_TO_STRING:
      {
        PojoDirectiveToString pojoDirectiveToString = (PojoDirectiveToString)theEObject;
        T result = casePojoDirectiveToString(pojoDirectiveToString);
        if (result == null) result = casePojoDirective(pojoDirectiveToString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX:
      {
        PojoDirectiveIndex pojoDirectiveIndex = (PojoDirectiveIndex)theEObject;
        T result = casePojoDirectiveIndex(pojoDirectiveIndex);
        if (result == null) result = casePojoDirective(pojoDirectiveIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE_OPERATORS:
      {
        PojoDirectiveOperators pojoDirectiveOperators = (PojoDirectiveOperators)theEObject;
        T result = casePojoDirectiveOperators(pojoDirectiveOperators);
        if (result == null) result = casePojoDirective(pojoDirectiveOperators);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE_SERIALIZABLE:
      {
        PojoDirectiveSerializable pojoDirectiveSerializable = (PojoDirectiveSerializable)theEObject;
        T result = casePojoDirectiveSerializable(pojoDirectiveSerializable);
        if (result == null) result = casePojoDirective(pojoDirectiveSerializable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE_DISCRIMINATOR:
      {
        PojoDirectiveDiscriminator pojoDirectiveDiscriminator = (PojoDirectiveDiscriminator)theEObject;
        T result = casePojoDirectiveDiscriminator(pojoDirectiveDiscriminator);
        if (result == null) result = casePojoDirective(pojoDirectiveDiscriminator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE_EQUALS:
      {
        PojoDirectiveEquals pojoDirectiveEquals = (PojoDirectiveEquals)theEObject;
        T result = casePojoDirectiveEquals(pojoDirectiveEquals);
        if (result == null) result = casePojoDirective(pojoDirectiveEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_DIRECTIVE_HASH_CODE:
      {
        PojoDirectiveHashCode pojoDirectiveHashCode = (PojoDirectiveHashCode)theEObject;
        T result = casePojoDirectiveHashCode(pojoDirectiveHashCode);
        if (result == null) result = casePojoDirective(pojoDirectiveHashCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_REQUIRED:
      {
        PojoPropertyDirectiveRequired pojoPropertyDirectiveRequired = (PojoPropertyDirectiveRequired)theEObject;
        T result = casePojoPropertyDirectiveRequired(pojoPropertyDirectiveRequired);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveRequired);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_PRIMARY_KEY:
      {
        PojoPropertyDirectivePrimaryKey pojoPropertyDirectivePrimaryKey = (PojoPropertyDirectivePrimaryKey)theEObject;
        T result = casePojoPropertyDirectivePrimaryKey(pojoPropertyDirectivePrimaryKey);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectivePrimaryKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_DISCRIMINATOR:
      {
        PojoPropertyDirectiveDiscriminator pojoPropertyDirectiveDiscriminator = (PojoPropertyDirectiveDiscriminator)theEObject;
        T result = casePojoPropertyDirectiveDiscriminator(pojoPropertyDirectiveDiscriminator);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveDiscriminator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_INDEX:
      {
        PojoPropertyDirectiveIndex pojoPropertyDirectiveIndex = (PojoPropertyDirectiveIndex)theEObject;
        T result = casePojoPropertyDirectiveIndex(pojoPropertyDirectiveIndex);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_VERSION:
      {
        PojoPropertyDirectiveVersion pojoPropertyDirectiveVersion = (PojoPropertyDirectiveVersion)theEObject;
        T result = casePojoPropertyDirectiveVersion(pojoPropertyDirectiveVersion);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveVersion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_UPDATE_COL:
      {
        PojoPropertyDirectiveUpdateCol pojoPropertyDirectiveUpdateCol = (PojoPropertyDirectiveUpdateCol)theEObject;
        T result = casePojoPropertyDirectiveUpdateCol(pojoPropertyDirectiveUpdateCol);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveUpdateCol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_CREATE_COL:
      {
        PojoPropertyDirectiveCreateCol pojoPropertyDirectiveCreateCol = (PojoPropertyDirectiveCreateCol)theEObject;
        T result = casePojoPropertyDirectiveCreateCol(pojoPropertyDirectiveCreateCol);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveCreateCol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_TO_INIT:
      {
        PojoPropertyDirectiveToInit pojoPropertyDirectiveToInit = (PojoPropertyDirectiveToInit)theEObject;
        T result = casePojoPropertyDirectiveToInit(pojoPropertyDirectiveToInit);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveToInit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_ENUM_INIT:
      {
        PojoPropertyDirectiveEnumInit pojoPropertyDirectiveEnumInit = (PojoPropertyDirectiveEnumInit)theEObject;
        T result = casePojoPropertyDirectiveEnumInit(pojoPropertyDirectiveEnumInit);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveEnumInit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_IS_DEF:
      {
        PojoPropertyDirectiveIsDef pojoPropertyDirectiveIsDef = (PojoPropertyDirectiveIsDef)theEObject;
        T result = casePojoPropertyDirectiveIsDef(pojoPropertyDirectiveIsDef);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveIsDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_ENUM_DEF:
      {
        PojoPropertyDirectiveEnumDef pojoPropertyDirectiveEnumDef = (PojoPropertyDirectiveEnumDef)theEObject;
        T result = casePojoPropertyDirectiveEnumDef(pojoPropertyDirectiveEnumDef);
        if (result == null) result = casePojoAttributeDirective(pojoPropertyDirectiveEnumDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENUM_DIRECTIVE_SERIALIZABLE:
      {
        EnumDirectiveSerializable enumDirectiveSerializable = (EnumDirectiveSerializable)theEObject;
        T result = caseEnumDirectiveSerializable(enumDirectiveSerializable);
        if (result == null) result = caseEnumDirective(enumDirectiveSerializable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ENUM_PROPERTY_DIRECTIVE_VALUES:
      {
        EnumPropertyDirectiveValues enumPropertyDirectiveValues = (EnumPropertyDirectiveValues)theEObject;
        T result = caseEnumPropertyDirectiveValues(enumPropertyDirectiveValues);
        if (result == null) result = caseEnumPropertyDirective(enumPropertyDirectiveValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.FUNCTION_CALL_QUERY:
      {
        FunctionCallQuery functionCallQuery = (FunctionCallQuery)theEObject;
        T result = caseFunctionCallQuery(functionCallQuery);
        if (result == null) result = caseFunProcType(functionCallQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.PROCEDURE_CALL_QUERY:
      {
        ProcedureCallQuery procedureCallQuery = (ProcedureCallQuery)theEObject;
        T result = caseProcedureCallQuery(procedureCallQuery);
        if (result == null) result = caseFunProcType(procedureCallQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = caseFunProcType(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.PROCEDURE_UPDATE:
      {
        ProcedureUpdate procedureUpdate = (ProcedureUpdate)theEObject;
        T result = caseProcedureUpdate(procedureUpdate);
        if (result == null) result = caseFunProcType(procedureUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.FUNCTION_QUERY:
      {
        FunctionQuery functionQuery = (FunctionQuery)theEObject;
        T result = caseFunctionQuery(functionQuery);
        if (result == null) result = caseFunProcType(functionQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAO_DIRECTIVE_SERIALIZABLE:
      {
        DaoDirectiveSerializable daoDirectiveSerializable = (DaoDirectiveSerializable)theEObject;
        T result = caseDaoDirectiveSerializable(daoDirectiveSerializable);
        if (result == null) result = caseDaoDirective(daoDirectiveSerializable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAO_DIRECTIVE_DISCRIMINATOR:
      {
        DaoDirectiveDiscriminator daoDirectiveDiscriminator = (DaoDirectiveDiscriminator)theEObject;
        T result = caseDaoDirectiveDiscriminator(daoDirectiveDiscriminator);
        if (result == null) result = caseDaoDirective(daoDirectiveDiscriminator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAO_DIRECTIVE_CRUD:
      {
        DaoDirectiveCrud daoDirectiveCrud = (DaoDirectiveCrud)theEObject;
        T result = caseDaoDirectiveCrud(daoDirectiveCrud);
        if (result == null) result = caseDaoDirective(daoDirectiveCrud);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.DAO_DIRECTIVE_QUERY:
      {
        DaoDirectiveQuery daoDirectiveQuery = (DaoDirectiveQuery)theEObject;
        T result = caseDaoDirectiveQuery(daoDirectiveQuery);
        if (result == null) result = caseDaoDirective(daoDirectiveQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.FUN_PROC_DIRECTIVE:
      {
        FunProcDirective funProcDirective = (FunProcDirective)theEObject;
        T result = caseFunProcDirective(funProcDirective);
        if (result == null) result = caseDaoDirective(funProcDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_CONFLICT:
      {
        AnnotationDirectiveConflict annotationDirectiveConflict = (AnnotationDirectiveConflict)theEObject;
        T result = caseAnnotationDirectiveConflict(annotationDirectiveConflict);
        if (result == null) result = caseAnnotationDirective(annotationDirectiveConflict);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_STATIC:
      {
        AnnotationDirectiveStatic annotationDirectiveStatic = (AnnotationDirectiveStatic)theEObject;
        T result = caseAnnotationDirectiveStatic(annotationDirectiveStatic);
        if (result == null) result = caseAnnotationDirective(annotationDirectiveStatic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_CONSTRUCTOR:
      {
        AnnotationDirectiveConstructor annotationDirectiveConstructor = (AnnotationDirectiveConstructor)theEObject;
        T result = caseAnnotationDirectiveConstructor(annotationDirectiveConstructor);
        if (result == null) result = caseAnnotationDirective(annotationDirectiveConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_STANDARD:
      {
        AnnotationDirectiveStandard annotationDirectiveStandard = (AnnotationDirectiveStandard)theEObject;
        T result = caseAnnotationDirectiveStandard(annotationDirectiveStandard);
        if (result == null) result = caseAnnotationDirective(annotationDirectiveStandard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_SETTER:
      {
        AnnotationDirectiveSetter annotationDirectiveSetter = (AnnotationDirectiveSetter)theEObject;
        T result = caseAnnotationDirectiveSetter(annotationDirectiveSetter);
        if (result == null) result = caseAnnotationDirective(annotationDirectiveSetter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_GETTER:
      {
        AnnotationDirectiveGetter annotationDirectiveGetter = (AnnotationDirectiveGetter)theEObject;
        T result = caseAnnotationDirectiveGetter(annotationDirectiveGetter);
        if (result == null) result = caseAnnotationDirective(annotationDirectiveGetter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_ATTRIBUTE:
      {
        AnnotationDirectiveAttribute annotationDirectiveAttribute = (AnnotationDirectiveAttribute)theEObject;
        T result = caseAnnotationDirectiveAttribute(annotationDirectiveAttribute);
        if (result == null) result = caseAnnotationDirective(annotationDirectiveAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifacts(Artifacts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueType(ValueType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Catalog Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Catalog Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseCatalogAssignement(DatabaseCatalogAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Schema Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Schema Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseSchemaAssignement(DatabaseSchemaAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Type Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseTypeAssignement(DatabaseTypeAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Meta Info Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Meta Info Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseMetaInfoAssignement(DatabaseMetaInfoAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Driver Meta Info Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Driver Meta Info Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDriverMetaInfoAssignement(DriverMetaInfoAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Driver Method Output Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Driver Method Output Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDriverMethodOutputAssignement(DriverMethodOutputAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sql Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sql Type Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSqlTypeAssignement(SqlTypeAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Type Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnTypeAssignement(ColumnTypeAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Column Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Column Type Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowColumnTypeAssignement(ShowColumnTypeAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableAssignement(TableAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Table Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Table Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinTableAssignement(JoinTableAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnAssignement(ColumnAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportAssignement(ImportAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportAssignement(ExportAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inheritance Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inheritance Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInheritanceAssignement(InheritanceAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Many To Many Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Many To Many Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManyToManyAssignement(ManyToManyAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Debug Level Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Debug Level Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDebugLevelAssignement(DebugLevelAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Pojo Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Pojo Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedurePojoAssignement(ProcedurePojoAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Pojo Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Pojo Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionPojoAssignement(FunctionPojoAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsAssignement(ImplementsAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extends Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extends Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendsAssignement(ExtendsAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Assignement Generics</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Assignement Generics</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsAssignementGenerics(ImplementsAssignementGenerics object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extends Assignement Generics</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extends Assignement Generics</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendsAssignementGenerics(ExtendsAssignementGenerics object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyCondition(PropertyCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseProperty(DatabaseProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojogen Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojogen Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojogenProperty(PojogenProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Type Assignement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaTypeAssignement(MetaTypeAssignement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metagen Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metagen Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetagenProperty(MetagenProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Daogen Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Daogen Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaogenProperty(DaogenProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDefinition(PojoDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableDefinition(TableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureDefinition(ProcedureDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDefinition(FunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(org.sqlproc.model.processorModel.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractEntity(AbstractEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Extends Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Extends Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsExtendsDirective(ImplementsExtendsDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplements(Implements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extends</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extends</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtends(Extends object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedEntity(AnnotatedEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Directive Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Directive Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectiveProperties(DirectiveProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirective(PojoDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoEntity(PojoEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Attribute Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Attribute Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoAttributeDirective(PojoAttributeDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoAttribute(PojoAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDirective(EnumDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumEntity(EnumEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumPropertyValue(EnumPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Property Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Property Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumPropertyDirective(EnumPropertyDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumProperty(EnumProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Directive Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Directive Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoDirectiveParameters(DaoDirectiveParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descendant Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descendant Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescendantAssignment(DescendantAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fun Proc Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fun Proc Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunProcType(FunProcType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoDirective(DaoDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoEntity(DaoEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirective(AnnotationDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Extends Directive Generics</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Extends Directive Generics</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsExtendsDirectiveGenerics(ImplementsExtendsDirectiveGenerics object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Extends Directive Only Pojos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Extends Directive Only Pojos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsExtendsDirectiveOnlyPojos(ImplementsExtendsDirectiveOnlyPojos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Extends Directive Only Daos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Extends Directive Only Daos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsExtendsDirectiveOnlyDaos(ImplementsExtendsDirectiveOnlyDaos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Extends Directive Except Pojos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Extends Directive Except Pojos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsExtendsDirectiveExceptPojos(ImplementsExtendsDirectiveExceptPojos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Extends Directive Except Daos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Extends Directive Except Daos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementsExtendsDirectiveExceptDaos(ImplementsExtendsDirectiveExceptDaos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive To String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive To String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirectiveToString(PojoDirectiveToString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirectiveIndex(PojoDirectiveIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive Operators</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive Operators</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirectiveOperators(PojoDirectiveOperators object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive Serializable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive Serializable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirectiveSerializable(PojoDirectiveSerializable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive Discriminator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive Discriminator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirectiveDiscriminator(PojoDirectiveDiscriminator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirectiveEquals(PojoDirectiveEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Directive Hash Code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Directive Hash Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoDirectiveHashCode(PojoDirectiveHashCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Required</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Required</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveRequired(PojoPropertyDirectiveRequired object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Primary Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Primary Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectivePrimaryKey(PojoPropertyDirectivePrimaryKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Discriminator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Discriminator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveDiscriminator(PojoPropertyDirectiveDiscriminator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveIndex(PojoPropertyDirectiveIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveVersion(PojoPropertyDirectiveVersion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Update Col</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Update Col</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveUpdateCol(PojoPropertyDirectiveUpdateCol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Create Col</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Create Col</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveCreateCol(PojoPropertyDirectiveCreateCol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive To Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive To Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveToInit(PojoPropertyDirectiveToInit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Enum Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Enum Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveEnumInit(PojoPropertyDirectiveEnumInit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Is Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Is Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveIsDef(PojoPropertyDirectiveIsDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pojo Property Directive Enum Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pojo Property Directive Enum Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePojoPropertyDirectiveEnumDef(PojoPropertyDirectiveEnumDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Directive Serializable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Directive Serializable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDirectiveSerializable(EnumDirectiveSerializable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Property Directive Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Property Directive Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumPropertyDirectiveValues(EnumPropertyDirectiveValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallQuery(FunctionCallQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Call Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Call Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureCallQuery(ProcedureCallQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureUpdate(ProcedureUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionQuery(FunctionQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Directive Serializable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Directive Serializable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoDirectiveSerializable(DaoDirectiveSerializable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Directive Discriminator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Directive Discriminator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoDirectiveDiscriminator(DaoDirectiveDiscriminator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Directive Crud</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Directive Crud</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoDirectiveCrud(DaoDirectiveCrud object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dao Directive Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dao Directive Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaoDirectiveQuery(DaoDirectiveQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fun Proc Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fun Proc Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunProcDirective(FunProcDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive Conflict</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive Conflict</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirectiveConflict(AnnotationDirectiveConflict object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive Static</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive Static</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirectiveStatic(AnnotationDirectiveStatic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirectiveConstructor(AnnotationDirectiveConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive Standard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive Standard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirectiveStandard(AnnotationDirectiveStandard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive Setter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive Setter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirectiveSetter(AnnotationDirectiveSetter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive Getter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive Getter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirectiveGetter(AnnotationDirectiveGetter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Directive Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Directive Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDirectiveAttribute(AnnotationDirectiveAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ProcessorModelSwitch
