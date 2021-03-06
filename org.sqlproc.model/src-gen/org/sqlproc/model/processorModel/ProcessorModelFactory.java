/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage
 * @generated
 */
public interface ProcessorModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProcessorModelFactory eINSTANCE = org.sqlproc.model.processorModel.impl.ProcessorModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifacts</em>'.
   * @generated
   */
  Artifacts createArtifacts();

  /**
   * Returns a new object of class '<em>Value Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Type</em>'.
   * @generated
   */
  ValueType createValueType();

  /**
   * Returns a new object of class '<em>Database Catalog Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Catalog Assignement</em>'.
   * @generated
   */
  DatabaseCatalogAssignement createDatabaseCatalogAssignement();

  /**
   * Returns a new object of class '<em>Database Schema Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Schema Assignement</em>'.
   * @generated
   */
  DatabaseSchemaAssignement createDatabaseSchemaAssignement();

  /**
   * Returns a new object of class '<em>Database Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Type Assignement</em>'.
   * @generated
   */
  DatabaseTypeAssignement createDatabaseTypeAssignement();

  /**
   * Returns a new object of class '<em>Database Meta Info Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Meta Info Assignement</em>'.
   * @generated
   */
  DatabaseMetaInfoAssignement createDatabaseMetaInfoAssignement();

  /**
   * Returns a new object of class '<em>Driver Meta Info Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Driver Meta Info Assignement</em>'.
   * @generated
   */
  DriverMetaInfoAssignement createDriverMetaInfoAssignement();

  /**
   * Returns a new object of class '<em>Driver Method Output Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Driver Method Output Assignement</em>'.
   * @generated
   */
  DriverMethodOutputAssignement createDriverMethodOutputAssignement();

  /**
   * Returns a new object of class '<em>Sql Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sql Type Assignement</em>'.
   * @generated
   */
  SqlTypeAssignement createSqlTypeAssignement();

  /**
   * Returns a new object of class '<em>Column Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Type Assignement</em>'.
   * @generated
   */
  ColumnTypeAssignement createColumnTypeAssignement();

  /**
   * Returns a new object of class '<em>Show Column Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Column Type Assignement</em>'.
   * @generated
   */
  ShowColumnTypeAssignement createShowColumnTypeAssignement();

  /**
   * Returns a new object of class '<em>Table Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Assignement</em>'.
   * @generated
   */
  TableAssignement createTableAssignement();

  /**
   * Returns a new object of class '<em>Join Table Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Table Assignement</em>'.
   * @generated
   */
  JoinTableAssignement createJoinTableAssignement();

  /**
   * Returns a new object of class '<em>Column Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Assignement</em>'.
   * @generated
   */
  ColumnAssignement createColumnAssignement();

  /**
   * Returns a new object of class '<em>Import Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Assignement</em>'.
   * @generated
   */
  ImportAssignement createImportAssignement();

  /**
   * Returns a new object of class '<em>Export Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export Assignement</em>'.
   * @generated
   */
  ExportAssignement createExportAssignement();

  /**
   * Returns a new object of class '<em>Inheritance Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance Assignement</em>'.
   * @generated
   */
  InheritanceAssignement createInheritanceAssignement();

  /**
   * Returns a new object of class '<em>Many To Many Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Many To Many Assignement</em>'.
   * @generated
   */
  ManyToManyAssignement createManyToManyAssignement();

  /**
   * Returns a new object of class '<em>Debug Level Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Debug Level Assignement</em>'.
   * @generated
   */
  DebugLevelAssignement createDebugLevelAssignement();

  /**
   * Returns a new object of class '<em>Procedure Pojo Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Pojo Assignement</em>'.
   * @generated
   */
  ProcedurePojoAssignement createProcedurePojoAssignement();

  /**
   * Returns a new object of class '<em>Function Pojo Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Pojo Assignement</em>'.
   * @generated
   */
  FunctionPojoAssignement createFunctionPojoAssignement();

  /**
   * Returns a new object of class '<em>Implements Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Assignement</em>'.
   * @generated
   */
  ImplementsAssignement createImplementsAssignement();

  /**
   * Returns a new object of class '<em>Extends Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends Assignement</em>'.
   * @generated
   */
  ExtendsAssignement createExtendsAssignement();

  /**
   * Returns a new object of class '<em>Implements Assignement Generics</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Assignement Generics</em>'.
   * @generated
   */
  ImplementsAssignementGenerics createImplementsAssignementGenerics();

  /**
   * Returns a new object of class '<em>Extends Assignement Generics</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends Assignement Generics</em>'.
   * @generated
   */
  ExtendsAssignementGenerics createExtendsAssignementGenerics();

  /**
   * Returns a new object of class '<em>Property Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Condition</em>'.
   * @generated
   */
  PropertyCondition createPropertyCondition();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Database Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Property</em>'.
   * @generated
   */
  DatabaseProperty createDatabaseProperty();

  /**
   * Returns a new object of class '<em>Pojogen Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojogen Property</em>'.
   * @generated
   */
  PojogenProperty createPojogenProperty();

  /**
   * Returns a new object of class '<em>Meta Type Assignement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Type Assignement</em>'.
   * @generated
   */
  MetaTypeAssignement createMetaTypeAssignement();

  /**
   * Returns a new object of class '<em>Metagen Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metagen Property</em>'.
   * @generated
   */
  MetagenProperty createMetagenProperty();

  /**
   * Returns a new object of class '<em>Daogen Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Daogen Property</em>'.
   * @generated
   */
  DaogenProperty createDaogenProperty();

  /**
   * Returns a new object of class '<em>Pojo Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Definition</em>'.
   * @generated
   */
  PojoDefinition createPojoDefinition();

  /**
   * Returns a new object of class '<em>Table Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Definition</em>'.
   * @generated
   */
  TableDefinition createTableDefinition();

  /**
   * Returns a new object of class '<em>Procedure Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Definition</em>'.
   * @generated
   */
  ProcedureDefinition createProcedureDefinition();

  /**
   * Returns a new object of class '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition</em>'.
   * @generated
   */
  FunctionDefinition createFunctionDefinition();

  /**
   * Returns a new object of class '<em>Package Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Directive</em>'.
   * @generated
   */
  PackageDirective createPackageDirective();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Abstract Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Entity</em>'.
   * @generated
   */
  AbstractEntity createAbstractEntity();

  /**
   * Returns a new object of class '<em>Implements Extends Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Extends Directive</em>'.
   * @generated
   */
  ImplementsExtendsDirective createImplementsExtendsDirective();

  /**
   * Returns a new object of class '<em>Implements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements</em>'.
   * @generated
   */
  Implements createImplements();

  /**
   * Returns a new object of class '<em>Extends</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends</em>'.
   * @generated
   */
  Extends createExtends();

  /**
   * Returns a new object of class '<em>Annotated Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotated Entity</em>'.
   * @generated
   */
  AnnotatedEntity createAnnotatedEntity();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Directive Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directive Properties</em>'.
   * @generated
   */
  DirectiveProperties createDirectiveProperties();

  /**
   * Returns a new object of class '<em>Pojo Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive</em>'.
   * @generated
   */
  PojoDirective createPojoDirective();

  /**
   * Returns a new object of class '<em>Pojo Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Entity</em>'.
   * @generated
   */
  PojoEntity createPojoEntity();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive</em>'.
   * @generated
   */
  PojoAttributeDirective createPojoAttributeDirective();

  /**
   * Returns a new object of class '<em>Pojo Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute</em>'.
   * @generated
   */
  PojoAttribute createPojoAttribute();

  /**
   * Returns a new object of class '<em>Pojo Procedure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Procedure</em>'.
   * @generated
   */
  PojoProcedure createPojoProcedure();

  /**
   * Returns a new object of class '<em>Enum Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Directive</em>'.
   * @generated
   */
  EnumDirective createEnumDirective();

  /**
   * Returns a new object of class '<em>Enum Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Entity</em>'.
   * @generated
   */
  EnumEntity createEnumEntity();

  /**
   * Returns a new object of class '<em>Enum Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Attribute Value</em>'.
   * @generated
   */
  EnumAttributeValue createEnumAttributeValue();

  /**
   * Returns a new object of class '<em>Enum Attribute Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Attribute Directive</em>'.
   * @generated
   */
  EnumAttributeDirective createEnumAttributeDirective();

  /**
   * Returns a new object of class '<em>Enum Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Attribute</em>'.
   * @generated
   */
  EnumAttribute createEnumAttribute();

  /**
   * Returns a new object of class '<em>Dao Directive Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Directive Parameters</em>'.
   * @generated
   */
  DaoDirectiveParameters createDaoDirectiveParameters();

  /**
   * Returns a new object of class '<em>Descendant Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Descendant Assignment</em>'.
   * @generated
   */
  DescendantAssignment createDescendantAssignment();

  /**
   * Returns a new object of class '<em>Fun Proc Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fun Proc Type</em>'.
   * @generated
   */
  FunProcType createFunProcType();

  /**
   * Returns a new object of class '<em>Dao Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Directive</em>'.
   * @generated
   */
  DaoDirective createDaoDirective();

  /**
   * Returns a new object of class '<em>Dao Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Entity</em>'.
   * @generated
   */
  DaoEntity createDaoEntity();

  /**
   * Returns a new object of class '<em>Annotation Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive</em>'.
   * @generated
   */
  AnnotationDirective createAnnotationDirective();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Package Directive Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Directive Implementation</em>'.
   * @generated
   */
  PackageDirectiveImplementation createPackageDirectiveImplementation();

  /**
   * Returns a new object of class '<em>Implements Extends Directive Generics</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Extends Directive Generics</em>'.
   * @generated
   */
  ImplementsExtendsDirectiveGenerics createImplementsExtendsDirectiveGenerics();

  /**
   * Returns a new object of class '<em>Implements Extends Directive Only Pojos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Extends Directive Only Pojos</em>'.
   * @generated
   */
  ImplementsExtendsDirectiveOnlyPojos createImplementsExtendsDirectiveOnlyPojos();

  /**
   * Returns a new object of class '<em>Implements Extends Directive Only Daos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Extends Directive Only Daos</em>'.
   * @generated
   */
  ImplementsExtendsDirectiveOnlyDaos createImplementsExtendsDirectiveOnlyDaos();

  /**
   * Returns a new object of class '<em>Implements Extends Directive Except Pojos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Extends Directive Except Pojos</em>'.
   * @generated
   */
  ImplementsExtendsDirectiveExceptPojos createImplementsExtendsDirectiveExceptPojos();

  /**
   * Returns a new object of class '<em>Implements Extends Directive Except Daos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implements Extends Directive Except Daos</em>'.
   * @generated
   */
  ImplementsExtendsDirectiveExceptDaos createImplementsExtendsDirectiveExceptDaos();

  /**
   * Returns a new object of class '<em>Pojo Directive To String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive To String</em>'.
   * @generated
   */
  PojoDirectiveToString createPojoDirectiveToString();

  /**
   * Returns a new object of class '<em>Pojo Directive Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive Index</em>'.
   * @generated
   */
  PojoDirectiveIndex createPojoDirectiveIndex();

  /**
   * Returns a new object of class '<em>Pojo Directive Operators</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive Operators</em>'.
   * @generated
   */
  PojoDirectiveOperators createPojoDirectiveOperators();

  /**
   * Returns a new object of class '<em>Pojo Directive Serializable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive Serializable</em>'.
   * @generated
   */
  PojoDirectiveSerializable createPojoDirectiveSerializable();

  /**
   * Returns a new object of class '<em>Pojo Directive Discriminator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive Discriminator</em>'.
   * @generated
   */
  PojoDirectiveDiscriminator createPojoDirectiveDiscriminator();

  /**
   * Returns a new object of class '<em>Pojo Directive Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive Equals</em>'.
   * @generated
   */
  PojoDirectiveEquals createPojoDirectiveEquals();

  /**
   * Returns a new object of class '<em>Pojo Directive Hash Code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Directive Hash Code</em>'.
   * @generated
   */
  PojoDirectiveHashCode createPojoDirectiveHashCode();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Required</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Required</em>'.
   * @generated
   */
  PojoAttributeDirectiveRequired createPojoAttributeDirectiveRequired();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Primary Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Primary Key</em>'.
   * @generated
   */
  PojoAttributeDirectivePrimaryKey createPojoAttributeDirectivePrimaryKey();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Discriminator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Discriminator</em>'.
   * @generated
   */
  PojoAttributeDirectiveDiscriminator createPojoAttributeDirectiveDiscriminator();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Index</em>'.
   * @generated
   */
  PojoAttributeDirectiveIndex createPojoAttributeDirectiveIndex();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Version</em>'.
   * @generated
   */
  PojoAttributeDirectiveVersion createPojoAttributeDirectiveVersion();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Update Col</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Update Col</em>'.
   * @generated
   */
  PojoAttributeDirectiveUpdateCol createPojoAttributeDirectiveUpdateCol();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Create Col</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Create Col</em>'.
   * @generated
   */
  PojoAttributeDirectiveCreateCol createPojoAttributeDirectiveCreateCol();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive To Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive To Init</em>'.
   * @generated
   */
  PojoAttributeDirectiveToInit createPojoAttributeDirectiveToInit();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Enum Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Enum Init</em>'.
   * @generated
   */
  PojoAttributeDirectiveEnumInit createPojoAttributeDirectiveEnumInit();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Is Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Is Def</em>'.
   * @generated
   */
  PojoAttributeDirectiveIsDef createPojoAttributeDirectiveIsDef();

  /**
   * Returns a new object of class '<em>Pojo Attribute Directive Enum Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pojo Attribute Directive Enum Def</em>'.
   * @generated
   */
  PojoAttributeDirectiveEnumDef createPojoAttributeDirectiveEnumDef();

  /**
   * Returns a new object of class '<em>Enum Directive Serializable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Directive Serializable</em>'.
   * @generated
   */
  EnumDirectiveSerializable createEnumDirectiveSerializable();

  /**
   * Returns a new object of class '<em>Enum Attribute Directive Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Attribute Directive Values</em>'.
   * @generated
   */
  EnumAttributeDirectiveValues createEnumAttributeDirectiveValues();

  /**
   * Returns a new object of class '<em>Function Call Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Query</em>'.
   * @generated
   */
  FunctionCallQuery createFunctionCallQuery();

  /**
   * Returns a new object of class '<em>Procedure Call Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Call Query</em>'.
   * @generated
   */
  ProcedureCallQuery createProcedureCallQuery();

  /**
   * Returns a new object of class '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call</em>'.
   * @generated
   */
  FunctionCall createFunctionCall();

  /**
   * Returns a new object of class '<em>Procedure Update</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Update</em>'.
   * @generated
   */
  ProcedureUpdate createProcedureUpdate();

  /**
   * Returns a new object of class '<em>Function Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Query</em>'.
   * @generated
   */
  FunctionQuery createFunctionQuery();

  /**
   * Returns a new object of class '<em>Dao Directive Serializable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Directive Serializable</em>'.
   * @generated
   */
  DaoDirectiveSerializable createDaoDirectiveSerializable();

  /**
   * Returns a new object of class '<em>Dao Directive Discriminator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Directive Discriminator</em>'.
   * @generated
   */
  DaoDirectiveDiscriminator createDaoDirectiveDiscriminator();

  /**
   * Returns a new object of class '<em>Dao Directive Crud</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Directive Crud</em>'.
   * @generated
   */
  DaoDirectiveCrud createDaoDirectiveCrud();

  /**
   * Returns a new object of class '<em>Dao Directive Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Directive Query</em>'.
   * @generated
   */
  DaoDirectiveQuery createDaoDirectiveQuery();

  /**
   * Returns a new object of class '<em>Dao Fun Proc Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Fun Proc Directive</em>'.
   * @generated
   */
  DaoFunProcDirective createDaoFunProcDirective();

  /**
   * Returns a new object of class '<em>Dao Directive Pojo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dao Directive Pojo</em>'.
   * @generated
   */
  DaoDirectivePojo createDaoDirectivePojo();

  /**
   * Returns a new object of class '<em>Annotation Directive Conflict</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive Conflict</em>'.
   * @generated
   */
  AnnotationDirectiveConflict createAnnotationDirectiveConflict();

  /**
   * Returns a new object of class '<em>Annotation Directive Static</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive Static</em>'.
   * @generated
   */
  AnnotationDirectiveStatic createAnnotationDirectiveStatic();

  /**
   * Returns a new object of class '<em>Annotation Directive Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive Constructor</em>'.
   * @generated
   */
  AnnotationDirectiveConstructor createAnnotationDirectiveConstructor();

  /**
   * Returns a new object of class '<em>Annotation Directive Standard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive Standard</em>'.
   * @generated
   */
  AnnotationDirectiveStandard createAnnotationDirectiveStandard();

  /**
   * Returns a new object of class '<em>Annotation Directive Setter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive Setter</em>'.
   * @generated
   */
  AnnotationDirectiveSetter createAnnotationDirectiveSetter();

  /**
   * Returns a new object of class '<em>Annotation Directive Getter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive Getter</em>'.
   * @generated
   */
  AnnotationDirectiveGetter createAnnotationDirectiveGetter();

  /**
   * Returns a new object of class '<em>Annotation Directive Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Directive Attribute</em>'.
   * @generated
   */
  AnnotationDirectiveAttribute createAnnotationDirectiveAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProcessorModelPackage getProcessorModelPackage();

} //ProcessorModelFactory
