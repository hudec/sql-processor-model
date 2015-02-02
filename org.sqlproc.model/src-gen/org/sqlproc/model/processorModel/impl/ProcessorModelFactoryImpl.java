/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sqlproc.model.processorModel.AbstractPojoEntity;
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
import org.sqlproc.model.processorModel.AnnotationProperty;
import org.sqlproc.model.processorModel.Artifacts;
import org.sqlproc.model.processorModel.ColumnAssignement;
import org.sqlproc.model.processorModel.ColumnTypeAssignement;
import org.sqlproc.model.processorModel.DaoDirective;
import org.sqlproc.model.processorModel.DaoDirectiveCrud;
import org.sqlproc.model.processorModel.DaoDirectiveDiscriminator;
import org.sqlproc.model.processorModel.DaoDirectiveParameters;
import org.sqlproc.model.processorModel.DaoDirectiveQuery;
import org.sqlproc.model.processorModel.DaoDirectiveSerializable;
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
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumEntityModifier1;
import org.sqlproc.model.processorModel.EnumEntityModifier2;
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
import org.sqlproc.model.processorModel.Import;
import org.sqlproc.model.processorModel.ImportAssignement;
import org.sqlproc.model.processorModel.InheritanceAssignement;
import org.sqlproc.model.processorModel.JoinTableAssignement;
import org.sqlproc.model.processorModel.ManyToManyAssignement;
import org.sqlproc.model.processorModel.MetaTypeAssignement;
import org.sqlproc.model.processorModel.MetagenProperty;
import org.sqlproc.model.processorModel.PackageDirective;
import org.sqlproc.model.processorModel.PackageDirectiveImplementation;
import org.sqlproc.model.processorModel.PackageDirectiveSuffix;
import org.sqlproc.model.processorModel.PojoAnnotatedProperty;
import org.sqlproc.model.processorModel.PojoDao;
import org.sqlproc.model.processorModel.PojoDaoModifier;
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
import org.sqlproc.model.processorModel.PojoEntityModifier1;
import org.sqlproc.model.processorModel.PojoEntityModifier2;
import org.sqlproc.model.processorModel.PojoProperty;
import org.sqlproc.model.processorModel.PojoPropertyDirective;
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
import org.sqlproc.model.processorModel.PojoType;
import org.sqlproc.model.processorModel.PojogenProperty;
import org.sqlproc.model.processorModel.ProcedureCallQuery;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.ProcedurePojoAssignement;
import org.sqlproc.model.processorModel.ProcedureUpdate;
import org.sqlproc.model.processorModel.ProcessorModelFactory;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.Property;
import org.sqlproc.model.processorModel.ShowColumnTypeAssignement;
import org.sqlproc.model.processorModel.SqlTypeAssignement;
import org.sqlproc.model.processorModel.TableAssignement;
import org.sqlproc.model.processorModel.TableDefinition;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorModelFactoryImpl extends EFactoryImpl implements ProcessorModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProcessorModelFactory init()
  {
    try
    {
      ProcessorModelFactory theProcessorModelFactory = (ProcessorModelFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessorModelPackage.eNS_URI);
      if (theProcessorModelFactory != null)
      {
        return theProcessorModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProcessorModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProcessorModelPackage.ARTIFACTS: return createArtifacts();
      case ProcessorModelPackage.VALUE_TYPE: return createValueType();
      case ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT: return createDatabaseCatalogAssignement();
      case ProcessorModelPackage.DATABASE_SCHEMA_ASSIGNEMENT: return createDatabaseSchemaAssignement();
      case ProcessorModelPackage.DATABASE_TYPE_ASSIGNEMENT: return createDatabaseTypeAssignement();
      case ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT: return createDatabaseMetaInfoAssignement();
      case ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT: return createDriverMetaInfoAssignement();
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT: return createDriverMethodOutputAssignement();
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT: return createSqlTypeAssignement();
      case ProcessorModelPackage.COLUMN_TYPE_ASSIGNEMENT: return createColumnTypeAssignement();
      case ProcessorModelPackage.SHOW_COLUMN_TYPE_ASSIGNEMENT: return createShowColumnTypeAssignement();
      case ProcessorModelPackage.TABLE_ASSIGNEMENT: return createTableAssignement();
      case ProcessorModelPackage.JOIN_TABLE_ASSIGNEMENT: return createJoinTableAssignement();
      case ProcessorModelPackage.COLUMN_ASSIGNEMENT: return createColumnAssignement();
      case ProcessorModelPackage.IMPORT_ASSIGNEMENT: return createImportAssignement();
      case ProcessorModelPackage.EXPORT_ASSIGNEMENT: return createExportAssignement();
      case ProcessorModelPackage.INHERITANCE_ASSIGNEMENT: return createInheritanceAssignement();
      case ProcessorModelPackage.MANY_TO_MANY_ASSIGNEMENT: return createManyToManyAssignement();
      case ProcessorModelPackage.DEBUG_LEVEL_ASSIGNEMENT: return createDebugLevelAssignement();
      case ProcessorModelPackage.PROCEDURE_POJO_ASSIGNEMENT: return createProcedurePojoAssignement();
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT: return createFunctionPojoAssignement();
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT: return createImplementsAssignement();
      case ProcessorModelPackage.EXTENDS_ASSIGNEMENT: return createExtendsAssignement();
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT_GENERICS: return createImplementsAssignementGenerics();
      case ProcessorModelPackage.EXTENDS_ASSIGNEMENT_GENERICS: return createExtendsAssignementGenerics();
      case ProcessorModelPackage.PROPERTY: return createProperty();
      case ProcessorModelPackage.DATABASE_PROPERTY: return createDatabaseProperty();
      case ProcessorModelPackage.POJOGEN_PROPERTY: return createPojogenProperty();
      case ProcessorModelPackage.META_TYPE_ASSIGNEMENT: return createMetaTypeAssignement();
      case ProcessorModelPackage.METAGEN_PROPERTY: return createMetagenProperty();
      case ProcessorModelPackage.DAOGEN_PROPERTY: return createDaogenProperty();
      case ProcessorModelPackage.POJO_DEFINITION: return createPojoDefinition();
      case ProcessorModelPackage.TABLE_DEFINITION: return createTableDefinition();
      case ProcessorModelPackage.PROCEDURE_DEFINITION: return createProcedureDefinition();
      case ProcessorModelPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case ProcessorModelPackage.POJO_TYPE: return createPojoType();
      case ProcessorModelPackage.PACKAGE_DIRECTIVE: return createPackageDirective();
      case ProcessorModelPackage.PACKAGE: return createPackage();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE: return createAnnotationDirective();
      case ProcessorModelPackage.ANNOTATION: return createAnnotation();
      case ProcessorModelPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
      case ProcessorModelPackage.ENTITY: return createEntity();
      case ProcessorModelPackage.ANNOTATED_ENTITY: return createAnnotatedEntity();
      case ProcessorModelPackage.ABSTRACT_POJO_ENTITY: return createAbstractPojoEntity();
      case ProcessorModelPackage.IMPORT: return createImport();
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE: return createImplementsExtendsDirective();
      case ProcessorModelPackage.IMPLEMENTS: return createImplements();
      case ProcessorModelPackage.EXTENDS: return createExtends();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER1: return createPojoEntityModifier1();
      case ProcessorModelPackage.DIRECTIVE_PROPERTIES: return createDirectiveProperties();
      case ProcessorModelPackage.POJO_DIRECTIVE: return createPojoDirective();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2: return createPojoEntityModifier2();
      case ProcessorModelPackage.POJO_ENTITY: return createPojoEntity();
      case ProcessorModelPackage.POJO_ANNOTATED_PROPERTY: return createPojoAnnotatedProperty();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE: return createPojoPropertyDirective();
      case ProcessorModelPackage.POJO_PROPERTY: return createPojoProperty();
      case ProcessorModelPackage.ENUM_ENTITY_MODIFIER1: return createEnumEntityModifier1();
      case ProcessorModelPackage.ENUM_ENTITY_MODIFIER2: return createEnumEntityModifier2();
      case ProcessorModelPackage.ENUM_ENTITY: return createEnumEntity();
      case ProcessorModelPackage.ENUM_PROPERTY_VALUE: return createEnumPropertyValue();
      case ProcessorModelPackage.ENUM_PROPERTY_DIRECTIVE: return createEnumPropertyDirective();
      case ProcessorModelPackage.ENUM_PROPERTY: return createEnumProperty();
      case ProcessorModelPackage.DAO_DIRECTIVE_PARAMETERS: return createDaoDirectiveParameters();
      case ProcessorModelPackage.DESCENDANT_ASSIGNMENT: return createDescendantAssignment();
      case ProcessorModelPackage.FUN_PROC_TYPE: return createFunProcType();
      case ProcessorModelPackage.DAO_DIRECTIVE: return createDaoDirective();
      case ProcessorModelPackage.POJO_DAO_MODIFIER: return createPojoDaoModifier();
      case ProcessorModelPackage.POJO_DAO: return createPojoDao();
      case ProcessorModelPackage.PACKAGE_DIRECTIVE_SUFFIX: return createPackageDirectiveSuffix();
      case ProcessorModelPackage.PACKAGE_DIRECTIVE_IMPLEMENTATION: return createPackageDirectiveImplementation();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_CONFLICT: return createAnnotationDirectiveConflict();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_STATIC: return createAnnotationDirectiveStatic();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_CONSTRUCTOR: return createAnnotationDirectiveConstructor();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_STANDARD: return createAnnotationDirectiveStandard();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_SETTER: return createAnnotationDirectiveSetter();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_GETTER: return createAnnotationDirectiveGetter();
      case ProcessorModelPackage.ANNOTATION_DIRECTIVE_ATTRIBUTE: return createAnnotationDirectiveAttribute();
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_GENERICS: return createImplementsExtendsDirectiveGenerics();
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS: return createImplementsExtendsDirectiveOnlyPojos();
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_DAOS: return createImplementsExtendsDirectiveOnlyDaos();
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS: return createImplementsExtendsDirectiveExceptPojos();
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_DAOS: return createImplementsExtendsDirectiveExceptDaos();
      case ProcessorModelPackage.POJO_DIRECTIVE_TO_STRING: return createPojoDirectiveToString();
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX: return createPojoDirectiveIndex();
      case ProcessorModelPackage.POJO_DIRECTIVE_OPERATORS: return createPojoDirectiveOperators();
      case ProcessorModelPackage.POJO_DIRECTIVE_SERIALIZABLE: return createPojoDirectiveSerializable();
      case ProcessorModelPackage.POJO_DIRECTIVE_DISCRIMINATOR: return createPojoDirectiveDiscriminator();
      case ProcessorModelPackage.POJO_DIRECTIVE_EQUALS: return createPojoDirectiveEquals();
      case ProcessorModelPackage.POJO_DIRECTIVE_HASH_CODE: return createPojoDirectiveHashCode();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_REQUIRED: return createPojoPropertyDirectiveRequired();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_PRIMARY_KEY: return createPojoPropertyDirectivePrimaryKey();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_DISCRIMINATOR: return createPojoPropertyDirectiveDiscriminator();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_INDEX: return createPojoPropertyDirectiveIndex();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_VERSION: return createPojoPropertyDirectiveVersion();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_UPDATE_COL: return createPojoPropertyDirectiveUpdateCol();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_CREATE_COL: return createPojoPropertyDirectiveCreateCol();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_TO_INIT: return createPojoPropertyDirectiveToInit();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_ENUM_INIT: return createPojoPropertyDirectiveEnumInit();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_IS_DEF: return createPojoPropertyDirectiveIsDef();
      case ProcessorModelPackage.POJO_PROPERTY_DIRECTIVE_ENUM_DEF: return createPojoPropertyDirectiveEnumDef();
      case ProcessorModelPackage.ENUM_PROPERTY_DIRECTIVE_VALUES: return createEnumPropertyDirectiveValues();
      case ProcessorModelPackage.FUNCTION_CALL_QUERY: return createFunctionCallQuery();
      case ProcessorModelPackage.PROCEDURE_CALL_QUERY: return createProcedureCallQuery();
      case ProcessorModelPackage.FUNCTION_CALL: return createFunctionCall();
      case ProcessorModelPackage.PROCEDURE_UPDATE: return createProcedureUpdate();
      case ProcessorModelPackage.FUNCTION_QUERY: return createFunctionQuery();
      case ProcessorModelPackage.DAO_DIRECTIVE_SERIALIZABLE: return createDaoDirectiveSerializable();
      case ProcessorModelPackage.DAO_DIRECTIVE_DISCRIMINATOR: return createDaoDirectiveDiscriminator();
      case ProcessorModelPackage.DAO_DIRECTIVE_CRUD: return createDaoDirectiveCrud();
      case ProcessorModelPackage.DAO_DIRECTIVE_QUERY: return createDaoDirectiveQuery();
      case ProcessorModelPackage.FUN_PROC_DIRECTIVE: return createFunProcDirective();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifacts createArtifacts()
  {
    ArtifactsImpl artifacts = new ArtifactsImpl();
    return artifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType createValueType()
  {
    ValueTypeImpl valueType = new ValueTypeImpl();
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseCatalogAssignement createDatabaseCatalogAssignement()
  {
    DatabaseCatalogAssignementImpl databaseCatalogAssignement = new DatabaseCatalogAssignementImpl();
    return databaseCatalogAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseSchemaAssignement createDatabaseSchemaAssignement()
  {
    DatabaseSchemaAssignementImpl databaseSchemaAssignement = new DatabaseSchemaAssignementImpl();
    return databaseSchemaAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTypeAssignement createDatabaseTypeAssignement()
  {
    DatabaseTypeAssignementImpl databaseTypeAssignement = new DatabaseTypeAssignementImpl();
    return databaseTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseMetaInfoAssignement createDatabaseMetaInfoAssignement()
  {
    DatabaseMetaInfoAssignementImpl databaseMetaInfoAssignement = new DatabaseMetaInfoAssignementImpl();
    return databaseMetaInfoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DriverMetaInfoAssignement createDriverMetaInfoAssignement()
  {
    DriverMetaInfoAssignementImpl driverMetaInfoAssignement = new DriverMetaInfoAssignementImpl();
    return driverMetaInfoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DriverMethodOutputAssignement createDriverMethodOutputAssignement()
  {
    DriverMethodOutputAssignementImpl driverMethodOutputAssignement = new DriverMethodOutputAssignementImpl();
    return driverMethodOutputAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlTypeAssignement createSqlTypeAssignement()
  {
    SqlTypeAssignementImpl sqlTypeAssignement = new SqlTypeAssignementImpl();
    return sqlTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnTypeAssignement createColumnTypeAssignement()
  {
    ColumnTypeAssignementImpl columnTypeAssignement = new ColumnTypeAssignementImpl();
    return columnTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowColumnTypeAssignement createShowColumnTypeAssignement()
  {
    ShowColumnTypeAssignementImpl showColumnTypeAssignement = new ShowColumnTypeAssignementImpl();
    return showColumnTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableAssignement createTableAssignement()
  {
    TableAssignementImpl tableAssignement = new TableAssignementImpl();
    return tableAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinTableAssignement createJoinTableAssignement()
  {
    JoinTableAssignementImpl joinTableAssignement = new JoinTableAssignementImpl();
    return joinTableAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnAssignement createColumnAssignement()
  {
    ColumnAssignementImpl columnAssignement = new ColumnAssignementImpl();
    return columnAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportAssignement createImportAssignement()
  {
    ImportAssignementImpl importAssignement = new ImportAssignementImpl();
    return importAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportAssignement createExportAssignement()
  {
    ExportAssignementImpl exportAssignement = new ExportAssignementImpl();
    return exportAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InheritanceAssignement createInheritanceAssignement()
  {
    InheritanceAssignementImpl inheritanceAssignement = new InheritanceAssignementImpl();
    return inheritanceAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManyToManyAssignement createManyToManyAssignement()
  {
    ManyToManyAssignementImpl manyToManyAssignement = new ManyToManyAssignementImpl();
    return manyToManyAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugLevelAssignement createDebugLevelAssignement()
  {
    DebugLevelAssignementImpl debugLevelAssignement = new DebugLevelAssignementImpl();
    return debugLevelAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedurePojoAssignement createProcedurePojoAssignement()
  {
    ProcedurePojoAssignementImpl procedurePojoAssignement = new ProcedurePojoAssignementImpl();
    return procedurePojoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionPojoAssignement createFunctionPojoAssignement()
  {
    FunctionPojoAssignementImpl functionPojoAssignement = new FunctionPojoAssignementImpl();
    return functionPojoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsAssignement createImplementsAssignement()
  {
    ImplementsAssignementImpl implementsAssignement = new ImplementsAssignementImpl();
    return implementsAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsAssignement createExtendsAssignement()
  {
    ExtendsAssignementImpl extendsAssignement = new ExtendsAssignementImpl();
    return extendsAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsAssignementGenerics createImplementsAssignementGenerics()
  {
    ImplementsAssignementGenericsImpl implementsAssignementGenerics = new ImplementsAssignementGenericsImpl();
    return implementsAssignementGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsAssignementGenerics createExtendsAssignementGenerics()
  {
    ExtendsAssignementGenericsImpl extendsAssignementGenerics = new ExtendsAssignementGenericsImpl();
    return extendsAssignementGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseProperty createDatabaseProperty()
  {
    DatabasePropertyImpl databaseProperty = new DatabasePropertyImpl();
    return databaseProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojogenProperty createPojogenProperty()
  {
    PojogenPropertyImpl pojogenProperty = new PojogenPropertyImpl();
    return pojogenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaTypeAssignement createMetaTypeAssignement()
  {
    MetaTypeAssignementImpl metaTypeAssignement = new MetaTypeAssignementImpl();
    return metaTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetagenProperty createMetagenProperty()
  {
    MetagenPropertyImpl metagenProperty = new MetagenPropertyImpl();
    return metagenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaogenProperty createDaogenProperty()
  {
    DaogenPropertyImpl daogenProperty = new DaogenPropertyImpl();
    return daogenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDefinition createPojoDefinition()
  {
    PojoDefinitionImpl pojoDefinition = new PojoDefinitionImpl();
    return pojoDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition createTableDefinition()
  {
    TableDefinitionImpl tableDefinition = new TableDefinitionImpl();
    return tableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureDefinition createProcedureDefinition()
  {
    ProcedureDefinitionImpl procedureDefinition = new ProcedureDefinitionImpl();
    return procedureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoType createPojoType()
  {
    PojoTypeImpl pojoType = new PojoTypeImpl();
    return pojoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDirective createPackageDirective()
  {
    PackageDirectiveImpl packageDirective = new PackageDirectiveImpl();
    return packageDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.sqlproc.model.processorModel.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirective createAnnotationDirective()
  {
    AnnotationDirectiveImpl annotationDirective = new AnnotationDirectiveImpl();
    return annotationDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty createAnnotationProperty()
  {
    AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
    return annotationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedEntity createAnnotatedEntity()
  {
    AnnotatedEntityImpl annotatedEntity = new AnnotatedEntityImpl();
    return annotatedEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPojoEntity createAbstractPojoEntity()
  {
    AbstractPojoEntityImpl abstractPojoEntity = new AbstractPojoEntityImpl();
    return abstractPojoEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsExtendsDirective createImplementsExtendsDirective()
  {
    ImplementsExtendsDirectiveImpl implementsExtendsDirective = new ImplementsExtendsDirectiveImpl();
    return implementsExtendsDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implements createImplements()
  {
    ImplementsImpl implements_ = new ImplementsImpl();
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extends createExtends()
  {
    ExtendsImpl extends_ = new ExtendsImpl();
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntityModifier1 createPojoEntityModifier1()
  {
    PojoEntityModifier1Impl pojoEntityModifier1 = new PojoEntityModifier1Impl();
    return pojoEntityModifier1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectiveProperties createDirectiveProperties()
  {
    DirectivePropertiesImpl directiveProperties = new DirectivePropertiesImpl();
    return directiveProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirective createPojoDirective()
  {
    PojoDirectiveImpl pojoDirective = new PojoDirectiveImpl();
    return pojoDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntityModifier2 createPojoEntityModifier2()
  {
    PojoEntityModifier2Impl pojoEntityModifier2 = new PojoEntityModifier2Impl();
    return pojoEntityModifier2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity createPojoEntity()
  {
    PojoEntityImpl pojoEntity = new PojoEntityImpl();
    return pojoEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoAnnotatedProperty createPojoAnnotatedProperty()
  {
    PojoAnnotatedPropertyImpl pojoAnnotatedProperty = new PojoAnnotatedPropertyImpl();
    return pojoAnnotatedProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirective createPojoPropertyDirective()
  {
    PojoPropertyDirectiveImpl pojoPropertyDirective = new PojoPropertyDirectiveImpl();
    return pojoPropertyDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoProperty createPojoProperty()
  {
    PojoPropertyImpl pojoProperty = new PojoPropertyImpl();
    return pojoProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumEntityModifier1 createEnumEntityModifier1()
  {
    EnumEntityModifier1Impl enumEntityModifier1 = new EnumEntityModifier1Impl();
    return enumEntityModifier1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumEntityModifier2 createEnumEntityModifier2()
  {
    EnumEntityModifier2Impl enumEntityModifier2 = new EnumEntityModifier2Impl();
    return enumEntityModifier2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumEntity createEnumEntity()
  {
    EnumEntityImpl enumEntity = new EnumEntityImpl();
    return enumEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumPropertyValue createEnumPropertyValue()
  {
    EnumPropertyValueImpl enumPropertyValue = new EnumPropertyValueImpl();
    return enumPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumPropertyDirective createEnumPropertyDirective()
  {
    EnumPropertyDirectiveImpl enumPropertyDirective = new EnumPropertyDirectiveImpl();
    return enumPropertyDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumProperty createEnumProperty()
  {
    EnumPropertyImpl enumProperty = new EnumPropertyImpl();
    return enumProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaoDirectiveParameters createDaoDirectiveParameters()
  {
    DaoDirectiveParametersImpl daoDirectiveParameters = new DaoDirectiveParametersImpl();
    return daoDirectiveParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescendantAssignment createDescendantAssignment()
  {
    DescendantAssignmentImpl descendantAssignment = new DescendantAssignmentImpl();
    return descendantAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunProcType createFunProcType()
  {
    FunProcTypeImpl funProcType = new FunProcTypeImpl();
    return funProcType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaoDirective createDaoDirective()
  {
    DaoDirectiveImpl daoDirective = new DaoDirectiveImpl();
    return daoDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDaoModifier createPojoDaoModifier()
  {
    PojoDaoModifierImpl pojoDaoModifier = new PojoDaoModifierImpl();
    return pojoDaoModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDao createPojoDao()
  {
    PojoDaoImpl pojoDao = new PojoDaoImpl();
    return pojoDao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDirectiveSuffix createPackageDirectiveSuffix()
  {
    PackageDirectiveSuffixImpl packageDirectiveSuffix = new PackageDirectiveSuffixImpl();
    return packageDirectiveSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDirectiveImplementation createPackageDirectiveImplementation()
  {
    PackageDirectiveImplementationImpl packageDirectiveImplementation = new PackageDirectiveImplementationImpl();
    return packageDirectiveImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirectiveConflict createAnnotationDirectiveConflict()
  {
    AnnotationDirectiveConflictImpl annotationDirectiveConflict = new AnnotationDirectiveConflictImpl();
    return annotationDirectiveConflict;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirectiveStatic createAnnotationDirectiveStatic()
  {
    AnnotationDirectiveStaticImpl annotationDirectiveStatic = new AnnotationDirectiveStaticImpl();
    return annotationDirectiveStatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirectiveConstructor createAnnotationDirectiveConstructor()
  {
    AnnotationDirectiveConstructorImpl annotationDirectiveConstructor = new AnnotationDirectiveConstructorImpl();
    return annotationDirectiveConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirectiveStandard createAnnotationDirectiveStandard()
  {
    AnnotationDirectiveStandardImpl annotationDirectiveStandard = new AnnotationDirectiveStandardImpl();
    return annotationDirectiveStandard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirectiveSetter createAnnotationDirectiveSetter()
  {
    AnnotationDirectiveSetterImpl annotationDirectiveSetter = new AnnotationDirectiveSetterImpl();
    return annotationDirectiveSetter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirectiveGetter createAnnotationDirectiveGetter()
  {
    AnnotationDirectiveGetterImpl annotationDirectiveGetter = new AnnotationDirectiveGetterImpl();
    return annotationDirectiveGetter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDirectiveAttribute createAnnotationDirectiveAttribute()
  {
    AnnotationDirectiveAttributeImpl annotationDirectiveAttribute = new AnnotationDirectiveAttributeImpl();
    return annotationDirectiveAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsExtendsDirectiveGenerics createImplementsExtendsDirectiveGenerics()
  {
    ImplementsExtendsDirectiveGenericsImpl implementsExtendsDirectiveGenerics = new ImplementsExtendsDirectiveGenericsImpl();
    return implementsExtendsDirectiveGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsExtendsDirectiveOnlyPojos createImplementsExtendsDirectiveOnlyPojos()
  {
    ImplementsExtendsDirectiveOnlyPojosImpl implementsExtendsDirectiveOnlyPojos = new ImplementsExtendsDirectiveOnlyPojosImpl();
    return implementsExtendsDirectiveOnlyPojos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsExtendsDirectiveOnlyDaos createImplementsExtendsDirectiveOnlyDaos()
  {
    ImplementsExtendsDirectiveOnlyDaosImpl implementsExtendsDirectiveOnlyDaos = new ImplementsExtendsDirectiveOnlyDaosImpl();
    return implementsExtendsDirectiveOnlyDaos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsExtendsDirectiveExceptPojos createImplementsExtendsDirectiveExceptPojos()
  {
    ImplementsExtendsDirectiveExceptPojosImpl implementsExtendsDirectiveExceptPojos = new ImplementsExtendsDirectiveExceptPojosImpl();
    return implementsExtendsDirectiveExceptPojos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsExtendsDirectiveExceptDaos createImplementsExtendsDirectiveExceptDaos()
  {
    ImplementsExtendsDirectiveExceptDaosImpl implementsExtendsDirectiveExceptDaos = new ImplementsExtendsDirectiveExceptDaosImpl();
    return implementsExtendsDirectiveExceptDaos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirectiveToString createPojoDirectiveToString()
  {
    PojoDirectiveToStringImpl pojoDirectiveToString = new PojoDirectiveToStringImpl();
    return pojoDirectiveToString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirectiveIndex createPojoDirectiveIndex()
  {
    PojoDirectiveIndexImpl pojoDirectiveIndex = new PojoDirectiveIndexImpl();
    return pojoDirectiveIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirectiveOperators createPojoDirectiveOperators()
  {
    PojoDirectiveOperatorsImpl pojoDirectiveOperators = new PojoDirectiveOperatorsImpl();
    return pojoDirectiveOperators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirectiveSerializable createPojoDirectiveSerializable()
  {
    PojoDirectiveSerializableImpl pojoDirectiveSerializable = new PojoDirectiveSerializableImpl();
    return pojoDirectiveSerializable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirectiveDiscriminator createPojoDirectiveDiscriminator()
  {
    PojoDirectiveDiscriminatorImpl pojoDirectiveDiscriminator = new PojoDirectiveDiscriminatorImpl();
    return pojoDirectiveDiscriminator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirectiveEquals createPojoDirectiveEquals()
  {
    PojoDirectiveEqualsImpl pojoDirectiveEquals = new PojoDirectiveEqualsImpl();
    return pojoDirectiveEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDirectiveHashCode createPojoDirectiveHashCode()
  {
    PojoDirectiveHashCodeImpl pojoDirectiveHashCode = new PojoDirectiveHashCodeImpl();
    return pojoDirectiveHashCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveRequired createPojoPropertyDirectiveRequired()
  {
    PojoPropertyDirectiveRequiredImpl pojoPropertyDirectiveRequired = new PojoPropertyDirectiveRequiredImpl();
    return pojoPropertyDirectiveRequired;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectivePrimaryKey createPojoPropertyDirectivePrimaryKey()
  {
    PojoPropertyDirectivePrimaryKeyImpl pojoPropertyDirectivePrimaryKey = new PojoPropertyDirectivePrimaryKeyImpl();
    return pojoPropertyDirectivePrimaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveDiscriminator createPojoPropertyDirectiveDiscriminator()
  {
    PojoPropertyDirectiveDiscriminatorImpl pojoPropertyDirectiveDiscriminator = new PojoPropertyDirectiveDiscriminatorImpl();
    return pojoPropertyDirectiveDiscriminator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveIndex createPojoPropertyDirectiveIndex()
  {
    PojoPropertyDirectiveIndexImpl pojoPropertyDirectiveIndex = new PojoPropertyDirectiveIndexImpl();
    return pojoPropertyDirectiveIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveVersion createPojoPropertyDirectiveVersion()
  {
    PojoPropertyDirectiveVersionImpl pojoPropertyDirectiveVersion = new PojoPropertyDirectiveVersionImpl();
    return pojoPropertyDirectiveVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveUpdateCol createPojoPropertyDirectiveUpdateCol()
  {
    PojoPropertyDirectiveUpdateColImpl pojoPropertyDirectiveUpdateCol = new PojoPropertyDirectiveUpdateColImpl();
    return pojoPropertyDirectiveUpdateCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveCreateCol createPojoPropertyDirectiveCreateCol()
  {
    PojoPropertyDirectiveCreateColImpl pojoPropertyDirectiveCreateCol = new PojoPropertyDirectiveCreateColImpl();
    return pojoPropertyDirectiveCreateCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveToInit createPojoPropertyDirectiveToInit()
  {
    PojoPropertyDirectiveToInitImpl pojoPropertyDirectiveToInit = new PojoPropertyDirectiveToInitImpl();
    return pojoPropertyDirectiveToInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveEnumInit createPojoPropertyDirectiveEnumInit()
  {
    PojoPropertyDirectiveEnumInitImpl pojoPropertyDirectiveEnumInit = new PojoPropertyDirectiveEnumInitImpl();
    return pojoPropertyDirectiveEnumInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveIsDef createPojoPropertyDirectiveIsDef()
  {
    PojoPropertyDirectiveIsDefImpl pojoPropertyDirectiveIsDef = new PojoPropertyDirectiveIsDefImpl();
    return pojoPropertyDirectiveIsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoPropertyDirectiveEnumDef createPojoPropertyDirectiveEnumDef()
  {
    PojoPropertyDirectiveEnumDefImpl pojoPropertyDirectiveEnumDef = new PojoPropertyDirectiveEnumDefImpl();
    return pojoPropertyDirectiveEnumDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumPropertyDirectiveValues createEnumPropertyDirectiveValues()
  {
    EnumPropertyDirectiveValuesImpl enumPropertyDirectiveValues = new EnumPropertyDirectiveValuesImpl();
    return enumPropertyDirectiveValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCallQuery createFunctionCallQuery()
  {
    FunctionCallQueryImpl functionCallQuery = new FunctionCallQueryImpl();
    return functionCallQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureCallQuery createProcedureCallQuery()
  {
    ProcedureCallQueryImpl procedureCallQuery = new ProcedureCallQueryImpl();
    return procedureCallQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureUpdate createProcedureUpdate()
  {
    ProcedureUpdateImpl procedureUpdate = new ProcedureUpdateImpl();
    return procedureUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionQuery createFunctionQuery()
  {
    FunctionQueryImpl functionQuery = new FunctionQueryImpl();
    return functionQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaoDirectiveSerializable createDaoDirectiveSerializable()
  {
    DaoDirectiveSerializableImpl daoDirectiveSerializable = new DaoDirectiveSerializableImpl();
    return daoDirectiveSerializable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaoDirectiveDiscriminator createDaoDirectiveDiscriminator()
  {
    DaoDirectiveDiscriminatorImpl daoDirectiveDiscriminator = new DaoDirectiveDiscriminatorImpl();
    return daoDirectiveDiscriminator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaoDirectiveCrud createDaoDirectiveCrud()
  {
    DaoDirectiveCrudImpl daoDirectiveCrud = new DaoDirectiveCrudImpl();
    return daoDirectiveCrud;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaoDirectiveQuery createDaoDirectiveQuery()
  {
    DaoDirectiveQueryImpl daoDirectiveQuery = new DaoDirectiveQueryImpl();
    return daoDirectiveQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunProcDirective createFunProcDirective()
  {
    FunProcDirectiveImpl funProcDirective = new FunProcDirectiveImpl();
    return funProcDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorModelPackage getProcessorModelPackage()
  {
    return (ProcessorModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProcessorModelPackage getPackage()
  {
    return ProcessorModelPackage.eINSTANCE;
  }

} //ProcessorModelFactoryImpl
