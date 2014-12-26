/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sqlproc.model.processorModel.*;

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
      case ProcessorModelPackage.META_STATEMENT: return createMetaStatement();
      case ProcessorModelPackage.SQL: return createSql();
      case ProcessorModelPackage.SQL_FRAGMENT: return createSqlFragment();
      case ProcessorModelPackage.META_SQL: return createMetaSql();
      case ProcessorModelPackage.IF_SQL: return createIfSql();
      case ProcessorModelPackage.IF_SQL_FRAGMENT: return createIfSqlFragment();
      case ProcessorModelPackage.IF_META_SQL: return createIfMetaSql();
      case ProcessorModelPackage.IF_SQL_COND: return createIfSqlCond();
      case ProcessorModelPackage.IF_SQL_BOOL: return createIfSqlBool();
      case ProcessorModelPackage.ORD_SQL: return createOrdSql();
      case ProcessorModelPackage.ORD_SQL2: return createOrdSql2();
      case ProcessorModelPackage.COLUMN: return createColumn();
      case ProcessorModelPackage.EXTENDED_COLUMN: return createExtendedColumn();
      case ProcessorModelPackage.EXTENDED_COLUMN_NAME: return createExtendedColumnName();
      case ProcessorModelPackage.CONSTANT: return createConstant();
      case ProcessorModelPackage.IDENTIFIER: return createIdentifier();
      case ProcessorModelPackage.CONSTANT_OPERATOR: return createConstantOperator();
      case ProcessorModelPackage.IDENTIFIER_OPERATOR: return createIdentifierOperator();
      case ProcessorModelPackage.DATABASE_COLUMN: return createDatabaseColumn();
      case ProcessorModelPackage.DATABASE_TABLE: return createDatabaseTable();
      case ProcessorModelPackage.MAPPING_RULE: return createMappingRule();
      case ProcessorModelPackage.MAPPING: return createMapping();
      case ProcessorModelPackage.MAPPING_ITEM: return createMappingItem();
      case ProcessorModelPackage.MAPPING_COLUMN: return createMappingColumn();
      case ProcessorModelPackage.EXTENDED_MAPPING_ITEM: return createExtendedMappingItem();
      case ProcessorModelPackage.MAPPING_COLUMN_NAME: return createMappingColumnName();
      case ProcessorModelPackage.OPTIONAL_FEATURE: return createOptionalFeature();
      case ProcessorModelPackage.POJO_TYPE: return createPojoType();
      case ProcessorModelPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case ProcessorModelPackage.ANNOTATION: return createAnnotation();
      case ProcessorModelPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
      case ProcessorModelPackage.ENTITY: return createEntity();
      case ProcessorModelPackage.ANNOTATED_ENTITY: return createAnnotatedEntity();
      case ProcessorModelPackage.ABSTRACT_POJO_ENTITY: return createAbstractPojoEntity();
      case ProcessorModelPackage.IMPORT: return createImport();
      case ProcessorModelPackage.IMPLEMENTS: return createImplements();
      case ProcessorModelPackage.EXTENDS: return createExtends();
      case ProcessorModelPackage.IMPL_PACKAGE: return createImplPackage();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER1: return createPojoEntityModifier1();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2: return createPojoEntityModifier2();
      case ProcessorModelPackage.POJO_ENTITY: return createPojoEntity();
      case ProcessorModelPackage.POJO_ANNOTATED_PROPERTY: return createPojoAnnotatedProperty();
      case ProcessorModelPackage.POJO_PROPERTY_MODIFIER: return createPojoPropertyModifier();
      case ProcessorModelPackage.POJO_PROPERTY: return createPojoProperty();
      case ProcessorModelPackage.ENUM_ENTITY_MODIFIER1: return createEnumEntityModifier1();
      case ProcessorModelPackage.ENUM_ENTITY_MODIFIER2: return createEnumEntityModifier2();
      case ProcessorModelPackage.ENUM_ENTITY: return createEnumEntity();
      case ProcessorModelPackage.ENUM_PROPERTY: return createEnumProperty();
      case ProcessorModelPackage.POJO_DAO_MODIFIER: return createPojoDaoModifier();
      case ProcessorModelPackage.POJO_DAO: return createPojoDao();
      case ProcessorModelPackage.POJO_METHOD_MODIFIER: return createPojoMethodModifier();
      case ProcessorModelPackage.POJO_METHOD: return createPojoMethod();
      case ProcessorModelPackage.TO_INIT_METHOD: return createToInitMethod();
      case ProcessorModelPackage.POJO_METHOD_ARG: return createPojoMethodArg();
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
  public MetaStatement createMetaStatement()
  {
    MetaStatementImpl metaStatement = new MetaStatementImpl();
    return metaStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sql createSql()
  {
    SqlImpl sql = new SqlImpl();
    return sql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlFragment createSqlFragment()
  {
    SqlFragmentImpl sqlFragment = new SqlFragmentImpl();
    return sqlFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaSql createMetaSql()
  {
    MetaSqlImpl metaSql = new MetaSqlImpl();
    return metaSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSql createIfSql()
  {
    IfSqlImpl ifSql = new IfSqlImpl();
    return ifSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlFragment createIfSqlFragment()
  {
    IfSqlFragmentImpl ifSqlFragment = new IfSqlFragmentImpl();
    return ifSqlFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfMetaSql createIfMetaSql()
  {
    IfMetaSqlImpl ifMetaSql = new IfMetaSqlImpl();
    return ifMetaSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlCond createIfSqlCond()
  {
    IfSqlCondImpl ifSqlCond = new IfSqlCondImpl();
    return ifSqlCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlBool createIfSqlBool()
  {
    IfSqlBoolImpl ifSqlBool = new IfSqlBoolImpl();
    return ifSqlBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdSql createOrdSql()
  {
    OrdSqlImpl ordSql = new OrdSqlImpl();
    return ordSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdSql2 createOrdSql2()
  {
    OrdSql2Impl ordSql2 = new OrdSql2Impl();
    return ordSql2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedColumn createExtendedColumn()
  {
    ExtendedColumnImpl extendedColumn = new ExtendedColumnImpl();
    return extendedColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedColumnName createExtendedColumnName()
  {
    ExtendedColumnNameImpl extendedColumnName = new ExtendedColumnNameImpl();
    return extendedColumnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantOperator createConstantOperator()
  {
    ConstantOperatorImpl constantOperator = new ConstantOperatorImpl();
    return constantOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierOperator createIdentifierOperator()
  {
    IdentifierOperatorImpl identifierOperator = new IdentifierOperatorImpl();
    return identifierOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseColumn createDatabaseColumn()
  {
    DatabaseColumnImpl databaseColumn = new DatabaseColumnImpl();
    return databaseColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTable createDatabaseTable()
  {
    DatabaseTableImpl databaseTable = new DatabaseTableImpl();
    return databaseTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingRule createMappingRule()
  {
    MappingRuleImpl mappingRule = new MappingRuleImpl();
    return mappingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingItem createMappingItem()
  {
    MappingItemImpl mappingItem = new MappingItemImpl();
    return mappingItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingColumn createMappingColumn()
  {
    MappingColumnImpl mappingColumn = new MappingColumnImpl();
    return mappingColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedMappingItem createExtendedMappingItem()
  {
    ExtendedMappingItemImpl extendedMappingItem = new ExtendedMappingItemImpl();
    return extendedMappingItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingColumnName createMappingColumnName()
  {
    MappingColumnNameImpl mappingColumnName = new MappingColumnNameImpl();
    return mappingColumnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalFeature createOptionalFeature()
  {
    OptionalFeatureImpl optionalFeature = new OptionalFeatureImpl();
    return optionalFeature;
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
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
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
  public ImplPackage createImplPackage()
  {
    ImplPackageImpl implPackage = new ImplPackageImpl();
    return implPackage;
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
  public PojoPropertyModifier createPojoPropertyModifier()
  {
    PojoPropertyModifierImpl pojoPropertyModifier = new PojoPropertyModifierImpl();
    return pojoPropertyModifier;
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
  public PojoMethodModifier createPojoMethodModifier()
  {
    PojoMethodModifierImpl pojoMethodModifier = new PojoMethodModifierImpl();
    return pojoMethodModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoMethod createPojoMethod()
  {
    PojoMethodImpl pojoMethod = new PojoMethodImpl();
    return pojoMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToInitMethod createToInitMethod()
  {
    ToInitMethodImpl toInitMethod = new ToInitMethodImpl();
    return toInitMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoMethodArg createPojoMethodArg()
  {
    PojoMethodArgImpl pojoMethodArg = new PojoMethodArgImpl();
    return pojoMethodArg;
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
