/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.sqlproc.model.processorModel.AbstractPojoEntity;
import org.sqlproc.model.processorModel.AnnotatedEntity;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.AnnotationProperty;
import org.sqlproc.model.processorModel.Artifacts;
import org.sqlproc.model.processorModel.Column;
import org.sqlproc.model.processorModel.ColumnAssignement;
import org.sqlproc.model.processorModel.ColumnTypeAssignement;
import org.sqlproc.model.processorModel.Constant;
import org.sqlproc.model.processorModel.ConstantOperator;
import org.sqlproc.model.processorModel.DaogenProperty;
import org.sqlproc.model.processorModel.DatabaseCatalogAssignement;
import org.sqlproc.model.processorModel.DatabaseColumn;
import org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement;
import org.sqlproc.model.processorModel.DatabaseProperty;
import org.sqlproc.model.processorModel.DatabaseSchemaAssignement;
import org.sqlproc.model.processorModel.DatabaseTable;
import org.sqlproc.model.processorModel.DatabaseTypeAssignement;
import org.sqlproc.model.processorModel.DebugLevelAssignement;
import org.sqlproc.model.processorModel.DriverMetaInfoAssignement;
import org.sqlproc.model.processorModel.DriverMethodOutputAssignement;
import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumEntityModifier1;
import org.sqlproc.model.processorModel.EnumEntityModifier2;
import org.sqlproc.model.processorModel.EnumProperty;
import org.sqlproc.model.processorModel.ExportAssignement;
import org.sqlproc.model.processorModel.ExtendedColumn;
import org.sqlproc.model.processorModel.ExtendedColumnName;
import org.sqlproc.model.processorModel.ExtendedMappingItem;
import org.sqlproc.model.processorModel.Extends;
import org.sqlproc.model.processorModel.ExtendsAssignement;
import org.sqlproc.model.processorModel.ExtendsAssignementGenerics;
import org.sqlproc.model.processorModel.FunctionDefinition;
import org.sqlproc.model.processorModel.FunctionPojoAssignement;
import org.sqlproc.model.processorModel.Identifier;
import org.sqlproc.model.processorModel.IdentifierOperator;
import org.sqlproc.model.processorModel.IfMetaSql;
import org.sqlproc.model.processorModel.IfSql;
import org.sqlproc.model.processorModel.IfSqlBool;
import org.sqlproc.model.processorModel.IfSqlCond;
import org.sqlproc.model.processorModel.IfSqlFragment;
import org.sqlproc.model.processorModel.ImplPackage;
import org.sqlproc.model.processorModel.Implements;
import org.sqlproc.model.processorModel.ImplementsAssignement;
import org.sqlproc.model.processorModel.ImplementsAssignementGenerics;
import org.sqlproc.model.processorModel.Import;
import org.sqlproc.model.processorModel.ImportAssignement;
import org.sqlproc.model.processorModel.InheritanceAssignement;
import org.sqlproc.model.processorModel.JoinTableAssignement;
import org.sqlproc.model.processorModel.ManyToManyAssignement;
import org.sqlproc.model.processorModel.Mapping;
import org.sqlproc.model.processorModel.MappingColumn;
import org.sqlproc.model.processorModel.MappingColumnName;
import org.sqlproc.model.processorModel.MappingItem;
import org.sqlproc.model.processorModel.MappingRule;
import org.sqlproc.model.processorModel.MetaSql;
import org.sqlproc.model.processorModel.MetaStatement;
import org.sqlproc.model.processorModel.MetaTypeAssignement;
import org.sqlproc.model.processorModel.MetagenProperty;
import org.sqlproc.model.processorModel.OptionalFeature;
import org.sqlproc.model.processorModel.OrdSql;
import org.sqlproc.model.processorModel.OrdSql2;
import org.sqlproc.model.processorModel.PackageDeclaration;
import org.sqlproc.model.processorModel.PojoAnnotatedProperty;
import org.sqlproc.model.processorModel.PojoDao;
import org.sqlproc.model.processorModel.PojoDaoModifier;
import org.sqlproc.model.processorModel.PojoDefinition;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoEntityModifier1;
import org.sqlproc.model.processorModel.PojoEntityModifier2;
import org.sqlproc.model.processorModel.PojoMethod;
import org.sqlproc.model.processorModel.PojoMethodArg;
import org.sqlproc.model.processorModel.PojoMethodModifier;
import org.sqlproc.model.processorModel.PojoProperty;
import org.sqlproc.model.processorModel.PojoPropertyModifier;
import org.sqlproc.model.processorModel.PojoType;
import org.sqlproc.model.processorModel.PojogenProperty;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.ProcedurePojoAssignement;
import org.sqlproc.model.processorModel.ProcessorModelFactory;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.Property;
import org.sqlproc.model.processorModel.ShowColumnTypeAssignement;
import org.sqlproc.model.processorModel.Sql;
import org.sqlproc.model.processorModel.SqlFragment;
import org.sqlproc.model.processorModel.SqlTypeAssignement;
import org.sqlproc.model.processorModel.TableAssignement;
import org.sqlproc.model.processorModel.TableDefinition;
import org.sqlproc.model.processorModel.ToInitMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorModelPackageImpl extends EPackageImpl implements ProcessorModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseCatalogAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseSchemaAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseMetaInfoAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass driverMetaInfoAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass driverMethodOutputAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sqlTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showColumnTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinTableAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manyToManyAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass debugLevelAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedurePojoAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionPojoAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementsAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendsAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementsAssignementGenericsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendsAssignementGenericsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databasePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojogenPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metagenPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daogenPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sqlFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifMetaSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlCondEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlBoolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ordSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ordSql2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendedColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendedColumnNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendedMappingItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingColumnNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotatedEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractPojoEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoEntityModifier1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoEntityModifier2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoAnnotatedPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoPropertyModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEntityModifier1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEntityModifier2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoDaoModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoDaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoMethodModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toInitMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoMethodArgEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProcessorModelPackageImpl()
  {
    super(eNS_URI, ProcessorModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProcessorModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProcessorModelPackage init()
  {
    if (isInited) return (ProcessorModelPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorModelPackage.eNS_URI);

    // Obtain or create and register package
    ProcessorModelPackageImpl theProcessorModelPackage = (ProcessorModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessorModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessorModelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theProcessorModelPackage.createPackageContents();

    // Initialize created meta-data
    theProcessorModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProcessorModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProcessorModelPackage.eNS_URI, theProcessorModelPackage);
    return theProcessorModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifacts()
  {
    return artifactsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Properties()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Pojos()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Tables()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Procedures()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Functions()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Statements()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Mappings()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Features()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_PojoPackages()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseCatalogAssignement()
  {
    return databaseCatalogAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseCatalogAssignement_DbCatalog()
  {
    return (EAttribute)databaseCatalogAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseSchemaAssignement()
  {
    return databaseSchemaAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseSchemaAssignement_DbSchema()
  {
    return (EAttribute)databaseSchemaAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseTypeAssignement()
  {
    return databaseTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseTypeAssignement_DbType()
  {
    return (EAttribute)databaseTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseMetaInfoAssignement()
  {
    return databaseMetaInfoAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseMetaInfoAssignement_DbMetaInfo()
  {
    return (EAttribute)databaseMetaInfoAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDriverMetaInfoAssignement()
  {
    return driverMetaInfoAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriverMetaInfoAssignement_DbDriverInfo()
  {
    return (EAttribute)driverMetaInfoAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDriverMethodOutputAssignement()
  {
    return driverMethodOutputAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriverMethodOutputAssignement_DriverMethod()
  {
    return (EAttribute)driverMethodOutputAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriverMethodOutputAssignement_CallOutput()
  {
    return (EAttribute)driverMethodOutputAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSqlTypeAssignement()
  {
    return sqlTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSqlTypeAssignement_TypeName()
  {
    return (EAttribute)sqlTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSqlTypeAssignement_Size()
  {
    return (EAttribute)sqlTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlTypeAssignement_Type()
  {
    return (EReference)sqlTypeAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnTypeAssignement()
  {
    return columnTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnTypeAssignement_DbColumn()
  {
    return (EAttribute)columnTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnTypeAssignement_Type()
  {
    return (EReference)columnTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowColumnTypeAssignement()
  {
    return showColumnTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowColumnTypeAssignement_DbColumn()
  {
    return (EAttribute)showColumnTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowColumnTypeAssignement_Type()
  {
    return (EAttribute)showColumnTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableAssignement()
  {
    return tableAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableAssignement_DbTable()
  {
    return (EAttribute)tableAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableAssignement_NewName()
  {
    return (EAttribute)tableAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinTableAssignement()
  {
    return joinTableAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinTableAssignement_DbTable()
  {
    return (EAttribute)joinTableAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinTableAssignement_DbTables()
  {
    return (EAttribute)joinTableAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnAssignement()
  {
    return columnAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnAssignement_DbColumn()
  {
    return (EAttribute)columnAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnAssignement_NewName()
  {
    return (EAttribute)columnAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportAssignement()
  {
    return importAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportAssignement_DbColumn()
  {
    return (EAttribute)importAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportAssignement_PkTable()
  {
    return (EAttribute)importAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportAssignement_PkColumn()
  {
    return (EAttribute)importAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportAssignement()
  {
    return exportAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportAssignement_DbColumn()
  {
    return (EAttribute)exportAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportAssignement_FkTable()
  {
    return (EAttribute)exportAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportAssignement_FkColumn()
  {
    return (EAttribute)exportAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritanceAssignement()
  {
    return inheritanceAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceAssignement_Discriminator()
  {
    return (EAttribute)inheritanceAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceAssignement_DbTable()
  {
    return (EAttribute)inheritanceAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceAssignement_DbColumns()
  {
    return (EAttribute)inheritanceAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManyToManyAssignement()
  {
    return manyToManyAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAssignement_PkColumn()
  {
    return (EAttribute)manyToManyAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAssignement_PkTable()
  {
    return (EAttribute)manyToManyAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAssignement_FkColumn()
  {
    return (EAttribute)manyToManyAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDebugLevelAssignement()
  {
    return debugLevelAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDebugLevelAssignement_Debug()
  {
    return (EAttribute)debugLevelAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDebugLevelAssignement_Scope()
  {
    return (EAttribute)debugLevelAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedurePojoAssignement()
  {
    return procedurePojoAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedurePojoAssignement_DbProcedure()
  {
    return (EAttribute)procedurePojoAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedurePojoAssignement_Pojo()
  {
    return (EReference)procedurePojoAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionPojoAssignement()
  {
    return functionPojoAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionPojoAssignement_DbFunction()
  {
    return (EAttribute)functionPojoAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionPojoAssignement_Pojo()
  {
    return (EReference)functionPojoAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementsAssignement()
  {
    return implementsAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementsAssignement_ToImplement()
  {
    return (EReference)implementsAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplementsAssignement_DbTables()
  {
    return (EAttribute)implementsAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplementsAssignement_DbNotTables()
  {
    return (EAttribute)implementsAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendsAssignement()
  {
    return extendsAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendsAssignement_ToExtends()
  {
    return (EReference)extendsAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendsAssignement_DbTables()
  {
    return (EAttribute)extendsAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendsAssignement_DbNotTables()
  {
    return (EAttribute)extendsAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementsAssignementGenerics()
  {
    return implementsAssignementGenericsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementsAssignementGenerics_ToImplement()
  {
    return (EReference)implementsAssignementGenericsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplementsAssignementGenerics_DbTables()
  {
    return (EAttribute)implementsAssignementGenericsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplementsAssignementGenerics_DbNotTables()
  {
    return (EAttribute)implementsAssignementGenericsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendsAssignementGenerics()
  {
    return extendsAssignementGenericsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendsAssignementGenerics_ToExtends()
  {
    return (EReference)extendsAssignementGenericsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendsAssignementGenerics_DbTables()
  {
    return (EAttribute)extendsAssignementGenericsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendsAssignementGenerics_DbNotTables()
  {
    return (EAttribute)extendsAssignementGenericsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Database()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Pojogen()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Metagen()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Daogen()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_ReplaceId()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Regex()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Replacement()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseProperty()
  {
    return databasePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_Name()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbUrl()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbUsername()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbPassword()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_DbCatalog()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_DbSchema()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_DbDriverx()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbDriver()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbExecuteBefore()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbExecuteAfter()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbIndexTypes()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_DbType()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_DbMetaInfo()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_DbDriverInfo()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_DbMethodsCalls()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseProperty_Debug()
  {
    return (EReference)databasePropertyEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojogenProperty()
  {
    return pojogenPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_Name()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_SqlTypes()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbTable()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ColumnTypes()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbProcedure()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbFunction()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ColumnType()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbTables()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_JoinTables()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbColumns()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Tables()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Columns()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Exports()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Imports()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Many2s()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbColumn()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Inheritance()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_Methods()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_OperatorsSuffix()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ToImplements()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ToExtends()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ToImplementsGenerics()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ToExtendsGenerics()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_ImplPackage()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_Version()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbNotTables()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Debug()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ProcPojos()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_FunPojos()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_ActiveFilter()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_Pckg()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_EnumName()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbCheckConstraints()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaTypeAssignement()
  {
    return metaTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaTypeAssignement_DbColumn()
  {
    return (EAttribute)metaTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaTypeAssignement_Type()
  {
    return (EAttribute)metaTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaTypeAssignement_Extension()
  {
    return (EAttribute)metaTypeAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetagenProperty()
  {
    return metagenPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Name()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Sequence()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Type()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbTables()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbNotTables()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbTable()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Identity()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetagenProperty_MetaTypes()
  {
    return (EReference)metagenPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbStatement()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbColumns()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbFunction()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbProcedure()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetagenProperty_Debug()
  {
    return (EReference)metagenPropertyEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_OptionalFeatures()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_ActiveFilter()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDaogenProperty()
  {
    return daogenPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaogenProperty_Name()
  {
    return (EAttribute)daogenPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaogenProperty_DbTables()
  {
    return (EAttribute)daogenPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaogenProperty_ImplPackage()
  {
    return (EAttribute)daogenPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDaogenProperty_ToImplements()
  {
    return (EReference)daogenPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDaogenProperty_ToExtends()
  {
    return (EReference)daogenPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDaogenProperty_ToImplementsGenerics()
  {
    return (EReference)daogenPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDaogenProperty_ToExtendsGenerics()
  {
    return (EReference)daogenPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaogenProperty_DbFunction()
  {
    return (EAttribute)daogenPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDaogenProperty_ResultType()
  {
    return (EReference)daogenPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDaogenProperty_Debug()
  {
    return (EReference)daogenPropertyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaogenProperty_ActiveFilter()
  {
    return (EAttribute)daogenPropertyEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaogenProperty_Pckg()
  {
    return (EAttribute)daogenPropertyEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoDefinition()
  {
    return pojoDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoDefinition_Name()
  {
    return (EAttribute)pojoDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoDefinition_Class()
  {
    return (EAttribute)pojoDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoDefinition_Classx()
  {
    return (EReference)pojoDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableDefinition()
  {
    return tableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableDefinition_Name()
  {
    return (EAttribute)tableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableDefinition_Table()
  {
    return (EAttribute)tableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureDefinition()
  {
    return procedureDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedureDefinition_Name()
  {
    return (EAttribute)procedureDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedureDefinition_Table()
  {
    return (EAttribute)procedureDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDefinition()
  {
    return functionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionDefinition_Name()
  {
    return (EAttribute)functionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionDefinition_Table()
  {
    return (EAttribute)functionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaStatement()
  {
    return metaStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaStatement_Name()
  {
    return (EAttribute)metaStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaStatement_Type()
  {
    return (EAttribute)metaStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaStatement_Modifiers()
  {
    return (EAttribute)metaStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaStatement_Statement()
  {
    return (EReference)metaStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSql()
  {
    return sqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSql_Sqls()
  {
    return (EReference)sqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSqlFragment()
  {
    return sqlFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSqlFragment_Value()
  {
    return (EAttribute)sqlFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Col()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Cnst()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Ident()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_CnstOper()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_IdentOper()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Meta()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Dbtab()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Dbcol()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaSql()
  {
    return metaSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaSql_Ifs()
  {
    return (EReference)metaSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaSql_Type()
  {
    return (EAttribute)metaSqlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaSql_Cond()
  {
    return (EReference)metaSqlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaSql_Ftype()
  {
    return (EAttribute)metaSqlEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaSql_Ord()
  {
    return (EReference)metaSqlEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSql()
  {
    return ifSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSql_Sqls()
  {
    return (EReference)ifSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSqlFragment()
  {
    return ifSqlFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfSqlFragment_Value()
  {
    return (EAttribute)ifSqlFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Col()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Cnst()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Ident()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_CnstOper()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_IdentOper()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Dbtab()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Dbcol()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Meta()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfMetaSql()
  {
    return ifMetaSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfMetaSql_Ifs()
  {
    return (EReference)ifMetaSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfMetaSql_Type()
  {
    return (EAttribute)ifMetaSqlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfMetaSql_Cond()
  {
    return (EReference)ifMetaSqlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSqlCond()
  {
    return ifSqlCondEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlCond_Bool1()
  {
    return (EReference)ifSqlCondEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfSqlCond_Oper()
  {
    return (EAttribute)ifSqlCondEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlCond_Bool2()
  {
    return (EReference)ifSqlCondEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSqlBool()
  {
    return ifSqlBoolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfSqlBool_Not()
  {
    return (EAttribute)ifSqlBoolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlBool_Cnst()
  {
    return (EReference)ifSqlBoolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlBool_Ident()
  {
    return (EReference)ifSqlBoolEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlBool_Cond()
  {
    return (EReference)ifSqlBoolEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrdSql()
  {
    return ordSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql_Sqls()
  {
    return (EReference)ordSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrdSql2()
  {
    return ordSql2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrdSql2_Value()
  {
    return (EAttribute)ordSql2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql2_Cnst()
  {
    return (EReference)ordSql2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql2_Ident()
  {
    return (EReference)ordSql2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql2_Dbcol()
  {
    return (EReference)ordSql2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumn()
  {
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumn_Columns()
  {
    return (EReference)columnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendedColumn()
  {
    return extendedColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendedColumn_Col()
  {
    return (EReference)extendedColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedColumn_Modifiers()
  {
    return (EAttribute)extendedColumnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendedColumnName()
  {
    return extendedColumnNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedColumnName_Name()
  {
    return (EAttribute)extendedColumnNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Case()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Modifiers()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifier()
  {
    return identifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Mode()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Case()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Name()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Modifiers()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantOperator()
  {
    return constantOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantOperator_Name()
  {
    return (EAttribute)constantOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifierOperator()
  {
    return identifierOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifierOperator_Name()
  {
    return (EAttribute)identifierOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseColumn()
  {
    return databaseColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseColumn_Name()
  {
    return (EAttribute)databaseColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseTable()
  {
    return databaseTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseTable_Name()
  {
    return (EAttribute)databaseTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingRule()
  {
    return mappingRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingRule_Name()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingRule_Type()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingRule_Modifiers()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingRule_Mapping()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_MappingItems()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingItem()
  {
    return mappingItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingItem_Name()
  {
    return (EAttribute)mappingItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingItem_Attr()
  {
    return (EReference)mappingItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingColumn()
  {
    return mappingColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingColumn_Items()
  {
    return (EReference)mappingColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendedMappingItem()
  {
    return extendedMappingItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendedMappingItem_Attr()
  {
    return (EReference)extendedMappingItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedMappingItem_Modifiers()
  {
    return (EAttribute)extendedMappingItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingColumnName()
  {
    return mappingColumnNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingColumnName_Name()
  {
    return (EAttribute)mappingColumnNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalFeature()
  {
    return optionalFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Name()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Type()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Modifiers()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Option()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoType()
  {
    return pojoTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoType_Native()
  {
    return (EAttribute)pojoTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Ref()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Type()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Gref()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Gtype()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoType_Array()
  {
    return (EAttribute)pojoTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Suffix()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_Type()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_Features()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationProperty()
  {
    return annotationPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationProperty_Name()
  {
    return (EAttribute)annotationPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationProperty_Ref()
  {
    return (EReference)annotationPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationProperty_Type()
  {
    return (EReference)annotationPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationProperty_Number()
  {
    return (EAttribute)annotationPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationProperty_Value()
  {
    return (EAttribute)annotationPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationProperty_Constant()
  {
    return (EAttribute)annotationPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotatedEntity()
  {
    return annotatedEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotatedEntity_ConflictAnnotations()
  {
    return (EReference)annotatedEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotatedEntity_StaticAnnotations()
  {
    return (EReference)annotatedEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotatedEntity_ConstructorAnnotations()
  {
    return (EReference)annotatedEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotatedEntity_Annotations()
  {
    return (EReference)annotatedEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotatedEntity_Entity()
  {
    return (EReference)annotatedEntityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractPojoEntity()
  {
    return abstractPojoEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplements()
  {
    return implementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplements_Implements()
  {
    return (EReference)implementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplements_Generics()
  {
    return (EAttribute)implementsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplements_OnlyPojos()
  {
    return (EReference)implementsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplements_OnlyDaos()
  {
    return (EReference)implementsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplements_ExceptPojos()
  {
    return (EReference)implementsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplements_ExceptDaos()
  {
    return (EReference)implementsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtends()
  {
    return extendsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtends_Extends()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtends_Generics()
  {
    return (EAttribute)extendsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtends_OnlyPojos()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtends_OnlyDaos()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtends_ExceptPojos()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtends_ExceptDaos()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplPackage()
  {
    return implPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplPackage_Name()
  {
    return (EAttribute)implPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoEntityModifier1()
  {
    return pojoEntityModifier1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier1_Final()
  {
    return (EAttribute)pojoEntityModifier1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier1_Abstract()
  {
    return (EAttribute)pojoEntityModifier1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoEntityModifier2()
  {
    return pojoEntityModifier2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntityModifier2_SuperType()
  {
    return (EReference)pojoEntityModifier2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier2_Discriminator()
  {
    return (EAttribute)pojoEntityModifier2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier2_Operators()
  {
    return (EAttribute)pojoEntityModifier2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier2_OperatorsSuffix()
  {
    return (EAttribute)pojoEntityModifier2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier2_Sernum()
  {
    return (EAttribute)pojoEntityModifier2EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoEntity()
  {
    return pojoEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntity_Modifiers1()
  {
    return (EReference)pojoEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntity_Modifiers2()
  {
    return (EReference)pojoEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntity_Features()
  {
    return (EReference)pojoEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoAnnotatedProperty()
  {
    return pojoAnnotatedPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoAnnotatedProperty_SetterAnnotations()
  {
    return (EReference)pojoAnnotatedPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoAnnotatedProperty_GetterAnnotations()
  {
    return (EReference)pojoAnnotatedPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoAnnotatedProperty_AttributeAnnotations()
  {
    return (EReference)pojoAnnotatedPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoAnnotatedProperty_Feature()
  {
    return (EReference)pojoAnnotatedPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoPropertyModifier()
  {
    return pojoPropertyModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_Required()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_Discriminator()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_PrimaryKey()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_Index()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_Version()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_UpdateColumn1()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_UpdateColumn2()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_CreateColumn1()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_CreateColumn2()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoProperty()
  {
    return pojoPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoProperty_Name()
  {
    return (EAttribute)pojoPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoProperty_Native()
  {
    return (EAttribute)pojoPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Attrs()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Ref()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Type()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Gref()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Gtype()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoProperty_Array()
  {
    return (EAttribute)pojoPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Modifiers()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumEntityModifier1()
  {
    return enumEntityModifier1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumEntityModifier1_Final()
  {
    return (EAttribute)enumEntityModifier1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumEntityModifier2()
  {
    return enumEntityModifier2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumEntityModifier2_SuperType()
  {
    return (EReference)enumEntityModifier2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumEntityModifier2_Sernum()
  {
    return (EAttribute)enumEntityModifier2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumEntity()
  {
    return enumEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumEntity_Modifiers1()
  {
    return (EReference)enumEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumEntity_Modifiers2()
  {
    return (EReference)enumEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumEntity_Features()
  {
    return (EReference)enumEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumProperty()
  {
    return enumPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumProperty_Name()
  {
    return (EAttribute)enumPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumProperty_Native()
  {
    return (EAttribute)enumPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumProperty_Value()
  {
    return (EAttribute)enumPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumProperty_Type()
  {
    return (EReference)enumPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoDaoModifier()
  {
    return pojoDaoModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoDaoModifier_SuperType()
  {
    return (EReference)pojoDaoModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoDaoModifier_Sernum()
  {
    return (EAttribute)pojoDaoModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoDao()
  {
    return pojoDaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoDao_Modifiers1()
  {
    return (EReference)pojoDaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoDao_Name()
  {
    return (EAttribute)pojoDaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoDao_PojoGenerics()
  {
    return (EAttribute)pojoDaoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoDao_Pojo()
  {
    return (EReference)pojoDaoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoDao_Modifiers2()
  {
    return (EReference)pojoDaoEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoDao_Methods()
  {
    return (EReference)pojoDaoEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoDao_ToInits()
  {
    return (EReference)pojoDaoEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoMethodModifier()
  {
    return pojoMethodModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoMethodModifier_CallFunction()
  {
    return (EAttribute)pojoMethodModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoMethodModifier_CallUpdate()
  {
    return (EAttribute)pojoMethodModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoMethodModifier_CallQuery()
  {
    return (EAttribute)pojoMethodModifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoMethodModifier_CallQueryFunction()
  {
    return (EAttribute)pojoMethodModifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoMethodModifier_CallSelectFunction()
  {
    return (EAttribute)pojoMethodModifierEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoMethod()
  {
    return pojoMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoMethod_Modifiers1()
  {
    return (EReference)pojoMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoMethod_Name()
  {
    return (EAttribute)pojoMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoMethod_Type()
  {
    return (EReference)pojoMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoMethod_Args()
  {
    return (EReference)pojoMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToInitMethod()
  {
    return toInitMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToInitMethod_Name()
  {
    return (EAttribute)toInitMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToInitMethod_Args()
  {
    return (EReference)toInitMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoMethodArg()
  {
    return pojoMethodArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoMethodArg_Name()
  {
    return (EAttribute)pojoMethodArgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoMethodArg_Type()
  {
    return (EReference)pojoMethodArgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorModelFactory getProcessorModelFactory()
  {
    return (ProcessorModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    artifactsEClass = createEClass(ARTIFACTS);
    createEReference(artifactsEClass, ARTIFACTS__PROPERTIES);
    createEReference(artifactsEClass, ARTIFACTS__POJOS);
    createEReference(artifactsEClass, ARTIFACTS__TABLES);
    createEReference(artifactsEClass, ARTIFACTS__PROCEDURES);
    createEReference(artifactsEClass, ARTIFACTS__FUNCTIONS);
    createEReference(artifactsEClass, ARTIFACTS__STATEMENTS);
    createEReference(artifactsEClass, ARTIFACTS__MAPPINGS);
    createEReference(artifactsEClass, ARTIFACTS__FEATURES);
    createEReference(artifactsEClass, ARTIFACTS__POJO_PACKAGES);

    databaseCatalogAssignementEClass = createEClass(DATABASE_CATALOG_ASSIGNEMENT);
    createEAttribute(databaseCatalogAssignementEClass, DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG);

    databaseSchemaAssignementEClass = createEClass(DATABASE_SCHEMA_ASSIGNEMENT);
    createEAttribute(databaseSchemaAssignementEClass, DATABASE_SCHEMA_ASSIGNEMENT__DB_SCHEMA);

    databaseTypeAssignementEClass = createEClass(DATABASE_TYPE_ASSIGNEMENT);
    createEAttribute(databaseTypeAssignementEClass, DATABASE_TYPE_ASSIGNEMENT__DB_TYPE);

    databaseMetaInfoAssignementEClass = createEClass(DATABASE_META_INFO_ASSIGNEMENT);
    createEAttribute(databaseMetaInfoAssignementEClass, DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO);

    driverMetaInfoAssignementEClass = createEClass(DRIVER_META_INFO_ASSIGNEMENT);
    createEAttribute(driverMetaInfoAssignementEClass, DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO);

    driverMethodOutputAssignementEClass = createEClass(DRIVER_METHOD_OUTPUT_ASSIGNEMENT);
    createEAttribute(driverMethodOutputAssignementEClass, DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD);
    createEAttribute(driverMethodOutputAssignementEClass, DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT);

    sqlTypeAssignementEClass = createEClass(SQL_TYPE_ASSIGNEMENT);
    createEAttribute(sqlTypeAssignementEClass, SQL_TYPE_ASSIGNEMENT__TYPE_NAME);
    createEAttribute(sqlTypeAssignementEClass, SQL_TYPE_ASSIGNEMENT__SIZE);
    createEReference(sqlTypeAssignementEClass, SQL_TYPE_ASSIGNEMENT__TYPE);

    columnTypeAssignementEClass = createEClass(COLUMN_TYPE_ASSIGNEMENT);
    createEAttribute(columnTypeAssignementEClass, COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN);
    createEReference(columnTypeAssignementEClass, COLUMN_TYPE_ASSIGNEMENT__TYPE);

    showColumnTypeAssignementEClass = createEClass(SHOW_COLUMN_TYPE_ASSIGNEMENT);
    createEAttribute(showColumnTypeAssignementEClass, SHOW_COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(showColumnTypeAssignementEClass, SHOW_COLUMN_TYPE_ASSIGNEMENT__TYPE);

    tableAssignementEClass = createEClass(TABLE_ASSIGNEMENT);
    createEAttribute(tableAssignementEClass, TABLE_ASSIGNEMENT__DB_TABLE);
    createEAttribute(tableAssignementEClass, TABLE_ASSIGNEMENT__NEW_NAME);

    joinTableAssignementEClass = createEClass(JOIN_TABLE_ASSIGNEMENT);
    createEAttribute(joinTableAssignementEClass, JOIN_TABLE_ASSIGNEMENT__DB_TABLE);
    createEAttribute(joinTableAssignementEClass, JOIN_TABLE_ASSIGNEMENT__DB_TABLES);

    columnAssignementEClass = createEClass(COLUMN_ASSIGNEMENT);
    createEAttribute(columnAssignementEClass, COLUMN_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(columnAssignementEClass, COLUMN_ASSIGNEMENT__NEW_NAME);

    importAssignementEClass = createEClass(IMPORT_ASSIGNEMENT);
    createEAttribute(importAssignementEClass, IMPORT_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(importAssignementEClass, IMPORT_ASSIGNEMENT__PK_TABLE);
    createEAttribute(importAssignementEClass, IMPORT_ASSIGNEMENT__PK_COLUMN);

    exportAssignementEClass = createEClass(EXPORT_ASSIGNEMENT);
    createEAttribute(exportAssignementEClass, EXPORT_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(exportAssignementEClass, EXPORT_ASSIGNEMENT__FK_TABLE);
    createEAttribute(exportAssignementEClass, EXPORT_ASSIGNEMENT__FK_COLUMN);

    inheritanceAssignementEClass = createEClass(INHERITANCE_ASSIGNEMENT);
    createEAttribute(inheritanceAssignementEClass, INHERITANCE_ASSIGNEMENT__DISCRIMINATOR);
    createEAttribute(inheritanceAssignementEClass, INHERITANCE_ASSIGNEMENT__DB_TABLE);
    createEAttribute(inheritanceAssignementEClass, INHERITANCE_ASSIGNEMENT__DB_COLUMNS);

    manyToManyAssignementEClass = createEClass(MANY_TO_MANY_ASSIGNEMENT);
    createEAttribute(manyToManyAssignementEClass, MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN);
    createEAttribute(manyToManyAssignementEClass, MANY_TO_MANY_ASSIGNEMENT__PK_TABLE);
    createEAttribute(manyToManyAssignementEClass, MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN);

    debugLevelAssignementEClass = createEClass(DEBUG_LEVEL_ASSIGNEMENT);
    createEAttribute(debugLevelAssignementEClass, DEBUG_LEVEL_ASSIGNEMENT__DEBUG);
    createEAttribute(debugLevelAssignementEClass, DEBUG_LEVEL_ASSIGNEMENT__SCOPE);

    procedurePojoAssignementEClass = createEClass(PROCEDURE_POJO_ASSIGNEMENT);
    createEAttribute(procedurePojoAssignementEClass, PROCEDURE_POJO_ASSIGNEMENT__DB_PROCEDURE);
    createEReference(procedurePojoAssignementEClass, PROCEDURE_POJO_ASSIGNEMENT__POJO);

    functionPojoAssignementEClass = createEClass(FUNCTION_POJO_ASSIGNEMENT);
    createEAttribute(functionPojoAssignementEClass, FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION);
    createEReference(functionPojoAssignementEClass, FUNCTION_POJO_ASSIGNEMENT__POJO);

    implementsAssignementEClass = createEClass(IMPLEMENTS_ASSIGNEMENT);
    createEReference(implementsAssignementEClass, IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT);
    createEAttribute(implementsAssignementEClass, IMPLEMENTS_ASSIGNEMENT__DB_TABLES);
    createEAttribute(implementsAssignementEClass, IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES);

    extendsAssignementEClass = createEClass(EXTENDS_ASSIGNEMENT);
    createEReference(extendsAssignementEClass, EXTENDS_ASSIGNEMENT__TO_EXTENDS);
    createEAttribute(extendsAssignementEClass, EXTENDS_ASSIGNEMENT__DB_TABLES);
    createEAttribute(extendsAssignementEClass, EXTENDS_ASSIGNEMENT__DB_NOT_TABLES);

    implementsAssignementGenericsEClass = createEClass(IMPLEMENTS_ASSIGNEMENT_GENERICS);
    createEReference(implementsAssignementGenericsEClass, IMPLEMENTS_ASSIGNEMENT_GENERICS__TO_IMPLEMENT);
    createEAttribute(implementsAssignementGenericsEClass, IMPLEMENTS_ASSIGNEMENT_GENERICS__DB_TABLES);
    createEAttribute(implementsAssignementGenericsEClass, IMPLEMENTS_ASSIGNEMENT_GENERICS__DB_NOT_TABLES);

    extendsAssignementGenericsEClass = createEClass(EXTENDS_ASSIGNEMENT_GENERICS);
    createEReference(extendsAssignementGenericsEClass, EXTENDS_ASSIGNEMENT_GENERICS__TO_EXTENDS);
    createEAttribute(extendsAssignementGenericsEClass, EXTENDS_ASSIGNEMENT_GENERICS__DB_TABLES);
    createEAttribute(extendsAssignementGenericsEClass, EXTENDS_ASSIGNEMENT_GENERICS__DB_NOT_TABLES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__DATABASE);
    createEReference(propertyEClass, PROPERTY__POJOGEN);
    createEReference(propertyEClass, PROPERTY__METAGEN);
    createEReference(propertyEClass, PROPERTY__DAOGEN);
    createEAttribute(propertyEClass, PROPERTY__REPLACE_ID);
    createEAttribute(propertyEClass, PROPERTY__REGEX);
    createEAttribute(propertyEClass, PROPERTY__REPLACEMENT);

    databasePropertyEClass = createEClass(DATABASE_PROPERTY);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__NAME);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_URL);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_USERNAME);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_PASSWORD);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DB_CATALOG);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DB_SCHEMA);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DB_DRIVERX);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_DRIVER);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_EXECUTE_BEFORE);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_EXECUTE_AFTER);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_INDEX_TYPES);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DB_TYPE);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DB_META_INFO);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DB_DRIVER_INFO);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DB_METHODS_CALLS);
    createEReference(databasePropertyEClass, DATABASE_PROPERTY__DEBUG);

    pojogenPropertyEClass = createEClass(POJOGEN_PROPERTY);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__NAME);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__SQL_TYPES);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_TABLE);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__COLUMN_TYPES);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_PROCEDURE);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_FUNCTION);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__COLUMN_TYPE);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_TABLES);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__JOIN_TABLES);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_COLUMNS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TABLES);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__COLUMNS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__EXPORTS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__IMPORTS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__MANY2S);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_COLUMN);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__INHERITANCE);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__METHODS);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__OPERATORS_SUFFIX);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TO_IMPLEMENTS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TO_EXTENDS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TO_EXTENDS_GENERICS);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__IMPL_PACKAGE);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__VERSION);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_NOT_TABLES);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__DEBUG);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__PROC_POJOS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__FUN_POJOS);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__ACTIVE_FILTER);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__PCKG);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__ENUM_NAME);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_CHECK_CONSTRAINTS);

    metaTypeAssignementEClass = createEClass(META_TYPE_ASSIGNEMENT);
    createEAttribute(metaTypeAssignementEClass, META_TYPE_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(metaTypeAssignementEClass, META_TYPE_ASSIGNEMENT__TYPE);
    createEAttribute(metaTypeAssignementEClass, META_TYPE_ASSIGNEMENT__EXTENSION);

    metagenPropertyEClass = createEClass(METAGEN_PROPERTY);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__NAME);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__SEQUENCE);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__TYPE);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_TABLES);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_NOT_TABLES);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_TABLE);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__IDENTITY);
    createEReference(metagenPropertyEClass, METAGEN_PROPERTY__META_TYPES);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_STATEMENT);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_COLUMNS);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_FUNCTION);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_PROCEDURE);
    createEReference(metagenPropertyEClass, METAGEN_PROPERTY__DEBUG);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__OPTIONAL_FEATURES);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__ACTIVE_FILTER);

    daogenPropertyEClass = createEClass(DAOGEN_PROPERTY);
    createEAttribute(daogenPropertyEClass, DAOGEN_PROPERTY__NAME);
    createEAttribute(daogenPropertyEClass, DAOGEN_PROPERTY__DB_TABLES);
    createEAttribute(daogenPropertyEClass, DAOGEN_PROPERTY__IMPL_PACKAGE);
    createEReference(daogenPropertyEClass, DAOGEN_PROPERTY__TO_IMPLEMENTS);
    createEReference(daogenPropertyEClass, DAOGEN_PROPERTY__TO_EXTENDS);
    createEReference(daogenPropertyEClass, DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS);
    createEReference(daogenPropertyEClass, DAOGEN_PROPERTY__TO_EXTENDS_GENERICS);
    createEAttribute(daogenPropertyEClass, DAOGEN_PROPERTY__DB_FUNCTION);
    createEReference(daogenPropertyEClass, DAOGEN_PROPERTY__RESULT_TYPE);
    createEReference(daogenPropertyEClass, DAOGEN_PROPERTY__DEBUG);
    createEAttribute(daogenPropertyEClass, DAOGEN_PROPERTY__ACTIVE_FILTER);
    createEAttribute(daogenPropertyEClass, DAOGEN_PROPERTY__PCKG);

    pojoDefinitionEClass = createEClass(POJO_DEFINITION);
    createEAttribute(pojoDefinitionEClass, POJO_DEFINITION__NAME);
    createEAttribute(pojoDefinitionEClass, POJO_DEFINITION__CLASS);
    createEReference(pojoDefinitionEClass, POJO_DEFINITION__CLASSX);

    tableDefinitionEClass = createEClass(TABLE_DEFINITION);
    createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__NAME);
    createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__TABLE);

    procedureDefinitionEClass = createEClass(PROCEDURE_DEFINITION);
    createEAttribute(procedureDefinitionEClass, PROCEDURE_DEFINITION__NAME);
    createEAttribute(procedureDefinitionEClass, PROCEDURE_DEFINITION__TABLE);

    functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
    createEAttribute(functionDefinitionEClass, FUNCTION_DEFINITION__NAME);
    createEAttribute(functionDefinitionEClass, FUNCTION_DEFINITION__TABLE);

    metaStatementEClass = createEClass(META_STATEMENT);
    createEAttribute(metaStatementEClass, META_STATEMENT__NAME);
    createEAttribute(metaStatementEClass, META_STATEMENT__TYPE);
    createEAttribute(metaStatementEClass, META_STATEMENT__MODIFIERS);
    createEReference(metaStatementEClass, META_STATEMENT__STATEMENT);

    sqlEClass = createEClass(SQL);
    createEReference(sqlEClass, SQL__SQLS);

    sqlFragmentEClass = createEClass(SQL_FRAGMENT);
    createEAttribute(sqlFragmentEClass, SQL_FRAGMENT__VALUE);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__COL);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__CNST);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__IDENT);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__CNST_OPER);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__IDENT_OPER);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__META);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__DBTAB);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__DBCOL);

    metaSqlEClass = createEClass(META_SQL);
    createEReference(metaSqlEClass, META_SQL__IFS);
    createEAttribute(metaSqlEClass, META_SQL__TYPE);
    createEReference(metaSqlEClass, META_SQL__COND);
    createEAttribute(metaSqlEClass, META_SQL__FTYPE);
    createEReference(metaSqlEClass, META_SQL__ORD);

    ifSqlEClass = createEClass(IF_SQL);
    createEReference(ifSqlEClass, IF_SQL__SQLS);

    ifSqlFragmentEClass = createEClass(IF_SQL_FRAGMENT);
    createEAttribute(ifSqlFragmentEClass, IF_SQL_FRAGMENT__VALUE);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__COL);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__CNST);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__IDENT);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__CNST_OPER);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__IDENT_OPER);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__DBTAB);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__DBCOL);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__META);

    ifMetaSqlEClass = createEClass(IF_META_SQL);
    createEReference(ifMetaSqlEClass, IF_META_SQL__IFS);
    createEAttribute(ifMetaSqlEClass, IF_META_SQL__TYPE);
    createEReference(ifMetaSqlEClass, IF_META_SQL__COND);

    ifSqlCondEClass = createEClass(IF_SQL_COND);
    createEReference(ifSqlCondEClass, IF_SQL_COND__BOOL1);
    createEAttribute(ifSqlCondEClass, IF_SQL_COND__OPER);
    createEReference(ifSqlCondEClass, IF_SQL_COND__BOOL2);

    ifSqlBoolEClass = createEClass(IF_SQL_BOOL);
    createEAttribute(ifSqlBoolEClass, IF_SQL_BOOL__NOT);
    createEReference(ifSqlBoolEClass, IF_SQL_BOOL__CNST);
    createEReference(ifSqlBoolEClass, IF_SQL_BOOL__IDENT);
    createEReference(ifSqlBoolEClass, IF_SQL_BOOL__COND);

    ordSqlEClass = createEClass(ORD_SQL);
    createEReference(ordSqlEClass, ORD_SQL__SQLS);

    ordSql2EClass = createEClass(ORD_SQL2);
    createEAttribute(ordSql2EClass, ORD_SQL2__VALUE);
    createEReference(ordSql2EClass, ORD_SQL2__CNST);
    createEReference(ordSql2EClass, ORD_SQL2__IDENT);
    createEReference(ordSql2EClass, ORD_SQL2__DBCOL);

    columnEClass = createEClass(COLUMN);
    createEReference(columnEClass, COLUMN__COLUMNS);

    extendedColumnEClass = createEClass(EXTENDED_COLUMN);
    createEReference(extendedColumnEClass, EXTENDED_COLUMN__COL);
    createEAttribute(extendedColumnEClass, EXTENDED_COLUMN__MODIFIERS);

    extendedColumnNameEClass = createEClass(EXTENDED_COLUMN_NAME);
    createEAttribute(extendedColumnNameEClass, EXTENDED_COLUMN_NAME__NAME);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__CASE);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEAttribute(constantEClass, CONSTANT__MODIFIERS);

    identifierEClass = createEClass(IDENTIFIER);
    createEAttribute(identifierEClass, IDENTIFIER__MODE);
    createEAttribute(identifierEClass, IDENTIFIER__CASE);
    createEAttribute(identifierEClass, IDENTIFIER__NAME);
    createEAttribute(identifierEClass, IDENTIFIER__MODIFIERS);

    constantOperatorEClass = createEClass(CONSTANT_OPERATOR);
    createEAttribute(constantOperatorEClass, CONSTANT_OPERATOR__NAME);

    identifierOperatorEClass = createEClass(IDENTIFIER_OPERATOR);
    createEAttribute(identifierOperatorEClass, IDENTIFIER_OPERATOR__NAME);

    databaseColumnEClass = createEClass(DATABASE_COLUMN);
    createEAttribute(databaseColumnEClass, DATABASE_COLUMN__NAME);

    databaseTableEClass = createEClass(DATABASE_TABLE);
    createEAttribute(databaseTableEClass, DATABASE_TABLE__NAME);

    mappingRuleEClass = createEClass(MAPPING_RULE);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__NAME);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__TYPE);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__MODIFIERS);
    createEReference(mappingRuleEClass, MAPPING_RULE__MAPPING);

    mappingEClass = createEClass(MAPPING);
    createEReference(mappingEClass, MAPPING__MAPPING_ITEMS);

    mappingItemEClass = createEClass(MAPPING_ITEM);
    createEAttribute(mappingItemEClass, MAPPING_ITEM__NAME);
    createEReference(mappingItemEClass, MAPPING_ITEM__ATTR);

    mappingColumnEClass = createEClass(MAPPING_COLUMN);
    createEReference(mappingColumnEClass, MAPPING_COLUMN__ITEMS);

    extendedMappingItemEClass = createEClass(EXTENDED_MAPPING_ITEM);
    createEReference(extendedMappingItemEClass, EXTENDED_MAPPING_ITEM__ATTR);
    createEAttribute(extendedMappingItemEClass, EXTENDED_MAPPING_ITEM__MODIFIERS);

    mappingColumnNameEClass = createEClass(MAPPING_COLUMN_NAME);
    createEAttribute(mappingColumnNameEClass, MAPPING_COLUMN_NAME__NAME);

    optionalFeatureEClass = createEClass(OPTIONAL_FEATURE);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__NAME);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__TYPE);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__MODIFIERS);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__OPTION);

    pojoTypeEClass = createEClass(POJO_TYPE);
    createEAttribute(pojoTypeEClass, POJO_TYPE__NATIVE);
    createEReference(pojoTypeEClass, POJO_TYPE__REF);
    createEReference(pojoTypeEClass, POJO_TYPE__TYPE);
    createEReference(pojoTypeEClass, POJO_TYPE__GREF);
    createEReference(pojoTypeEClass, POJO_TYPE__GTYPE);
    createEAttribute(pojoTypeEClass, POJO_TYPE__ARRAY);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__SUFFIX);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    annotationEClass = createEClass(ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__TYPE);
    createEReference(annotationEClass, ANNOTATION__FEATURES);

    annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);
    createEAttribute(annotationPropertyEClass, ANNOTATION_PROPERTY__NAME);
    createEReference(annotationPropertyEClass, ANNOTATION_PROPERTY__REF);
    createEReference(annotationPropertyEClass, ANNOTATION_PROPERTY__TYPE);
    createEAttribute(annotationPropertyEClass, ANNOTATION_PROPERTY__NUMBER);
    createEAttribute(annotationPropertyEClass, ANNOTATION_PROPERTY__VALUE);
    createEAttribute(annotationPropertyEClass, ANNOTATION_PROPERTY__CONSTANT);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);

    annotatedEntityEClass = createEClass(ANNOTATED_ENTITY);
    createEReference(annotatedEntityEClass, ANNOTATED_ENTITY__CONFLICT_ANNOTATIONS);
    createEReference(annotatedEntityEClass, ANNOTATED_ENTITY__STATIC_ANNOTATIONS);
    createEReference(annotatedEntityEClass, ANNOTATED_ENTITY__CONSTRUCTOR_ANNOTATIONS);
    createEReference(annotatedEntityEClass, ANNOTATED_ENTITY__ANNOTATIONS);
    createEReference(annotatedEntityEClass, ANNOTATED_ENTITY__ENTITY);

    abstractPojoEntityEClass = createEClass(ABSTRACT_POJO_ENTITY);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    implementsEClass = createEClass(IMPLEMENTS);
    createEReference(implementsEClass, IMPLEMENTS__IMPLEMENTS);
    createEAttribute(implementsEClass, IMPLEMENTS__GENERICS);
    createEReference(implementsEClass, IMPLEMENTS__ONLY_POJOS);
    createEReference(implementsEClass, IMPLEMENTS__ONLY_DAOS);
    createEReference(implementsEClass, IMPLEMENTS__EXCEPT_POJOS);
    createEReference(implementsEClass, IMPLEMENTS__EXCEPT_DAOS);

    extendsEClass = createEClass(EXTENDS);
    createEReference(extendsEClass, EXTENDS__EXTENDS);
    createEAttribute(extendsEClass, EXTENDS__GENERICS);
    createEReference(extendsEClass, EXTENDS__ONLY_POJOS);
    createEReference(extendsEClass, EXTENDS__ONLY_DAOS);
    createEReference(extendsEClass, EXTENDS__EXCEPT_POJOS);
    createEReference(extendsEClass, EXTENDS__EXCEPT_DAOS);

    implPackageEClass = createEClass(IMPL_PACKAGE);
    createEAttribute(implPackageEClass, IMPL_PACKAGE__NAME);

    pojoEntityModifier1EClass = createEClass(POJO_ENTITY_MODIFIER1);
    createEAttribute(pojoEntityModifier1EClass, POJO_ENTITY_MODIFIER1__FINAL);
    createEAttribute(pojoEntityModifier1EClass, POJO_ENTITY_MODIFIER1__ABSTRACT);

    pojoEntityModifier2EClass = createEClass(POJO_ENTITY_MODIFIER2);
    createEReference(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__SUPER_TYPE);
    createEAttribute(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__DISCRIMINATOR);
    createEAttribute(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__OPERATORS);
    createEAttribute(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__OPERATORS_SUFFIX);
    createEAttribute(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__SERNUM);

    pojoEntityEClass = createEClass(POJO_ENTITY);
    createEReference(pojoEntityEClass, POJO_ENTITY__MODIFIERS1);
    createEReference(pojoEntityEClass, POJO_ENTITY__MODIFIERS2);
    createEReference(pojoEntityEClass, POJO_ENTITY__FEATURES);

    pojoAnnotatedPropertyEClass = createEClass(POJO_ANNOTATED_PROPERTY);
    createEReference(pojoAnnotatedPropertyEClass, POJO_ANNOTATED_PROPERTY__SETTER_ANNOTATIONS);
    createEReference(pojoAnnotatedPropertyEClass, POJO_ANNOTATED_PROPERTY__GETTER_ANNOTATIONS);
    createEReference(pojoAnnotatedPropertyEClass, POJO_ANNOTATED_PROPERTY__ATTRIBUTE_ANNOTATIONS);
    createEReference(pojoAnnotatedPropertyEClass, POJO_ANNOTATED_PROPERTY__FEATURE);

    pojoPropertyModifierEClass = createEClass(POJO_PROPERTY_MODIFIER);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__REQUIRED);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__DISCRIMINATOR);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__PRIMARY_KEY);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__INDEX);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__VERSION);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__UPDATE_COLUMN1);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__UPDATE_COLUMN2);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__CREATE_COLUMN1);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__CREATE_COLUMN2);

    pojoPropertyEClass = createEClass(POJO_PROPERTY);
    createEAttribute(pojoPropertyEClass, POJO_PROPERTY__NAME);
    createEAttribute(pojoPropertyEClass, POJO_PROPERTY__NATIVE);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__ATTRS);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__REF);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__TYPE);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__GREF);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__GTYPE);
    createEAttribute(pojoPropertyEClass, POJO_PROPERTY__ARRAY);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__MODIFIERS);

    enumEntityModifier1EClass = createEClass(ENUM_ENTITY_MODIFIER1);
    createEAttribute(enumEntityModifier1EClass, ENUM_ENTITY_MODIFIER1__FINAL);

    enumEntityModifier2EClass = createEClass(ENUM_ENTITY_MODIFIER2);
    createEReference(enumEntityModifier2EClass, ENUM_ENTITY_MODIFIER2__SUPER_TYPE);
    createEAttribute(enumEntityModifier2EClass, ENUM_ENTITY_MODIFIER2__SERNUM);

    enumEntityEClass = createEClass(ENUM_ENTITY);
    createEReference(enumEntityEClass, ENUM_ENTITY__MODIFIERS1);
    createEReference(enumEntityEClass, ENUM_ENTITY__MODIFIERS2);
    createEReference(enumEntityEClass, ENUM_ENTITY__FEATURES);

    enumPropertyEClass = createEClass(ENUM_PROPERTY);
    createEAttribute(enumPropertyEClass, ENUM_PROPERTY__NAME);
    createEAttribute(enumPropertyEClass, ENUM_PROPERTY__NATIVE);
    createEAttribute(enumPropertyEClass, ENUM_PROPERTY__VALUE);
    createEReference(enumPropertyEClass, ENUM_PROPERTY__TYPE);

    pojoDaoModifierEClass = createEClass(POJO_DAO_MODIFIER);
    createEReference(pojoDaoModifierEClass, POJO_DAO_MODIFIER__SUPER_TYPE);
    createEAttribute(pojoDaoModifierEClass, POJO_DAO_MODIFIER__SERNUM);

    pojoDaoEClass = createEClass(POJO_DAO);
    createEReference(pojoDaoEClass, POJO_DAO__MODIFIERS1);
    createEAttribute(pojoDaoEClass, POJO_DAO__NAME);
    createEAttribute(pojoDaoEClass, POJO_DAO__POJO_GENERICS);
    createEReference(pojoDaoEClass, POJO_DAO__POJO);
    createEReference(pojoDaoEClass, POJO_DAO__MODIFIERS2);
    createEReference(pojoDaoEClass, POJO_DAO__METHODS);
    createEReference(pojoDaoEClass, POJO_DAO__TO_INITS);

    pojoMethodModifierEClass = createEClass(POJO_METHOD_MODIFIER);
    createEAttribute(pojoMethodModifierEClass, POJO_METHOD_MODIFIER__CALL_FUNCTION);
    createEAttribute(pojoMethodModifierEClass, POJO_METHOD_MODIFIER__CALL_UPDATE);
    createEAttribute(pojoMethodModifierEClass, POJO_METHOD_MODIFIER__CALL_QUERY);
    createEAttribute(pojoMethodModifierEClass, POJO_METHOD_MODIFIER__CALL_QUERY_FUNCTION);
    createEAttribute(pojoMethodModifierEClass, POJO_METHOD_MODIFIER__CALL_SELECT_FUNCTION);

    pojoMethodEClass = createEClass(POJO_METHOD);
    createEReference(pojoMethodEClass, POJO_METHOD__MODIFIERS1);
    createEAttribute(pojoMethodEClass, POJO_METHOD__NAME);
    createEReference(pojoMethodEClass, POJO_METHOD__TYPE);
    createEReference(pojoMethodEClass, POJO_METHOD__ARGS);

    toInitMethodEClass = createEClass(TO_INIT_METHOD);
    createEAttribute(toInitMethodEClass, TO_INIT_METHOD__NAME);
    createEReference(toInitMethodEClass, TO_INIT_METHOD__ARGS);

    pojoMethodArgEClass = createEClass(POJO_METHOD_ARG);
    createEAttribute(pojoMethodArgEClass, POJO_METHOD_ARG__NAME);
    createEReference(pojoMethodArgEClass, POJO_METHOD_ARG__TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageDeclarationEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    annotatedEntityEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    importEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    implementsEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    extendsEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    implPackageEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    pojoEntityEClass.getESuperTypes().add(this.getEntity());
    enumEntityEClass.getESuperTypes().add(this.getEntity());
    pojoDaoEClass.getESuperTypes().add(this.getAbstractPojoEntity());

    // Initialize classes and features; add operations and parameters
    initEClass(artifactsEClass, Artifacts.class, "Artifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArtifacts_Properties(), this.getProperty(), null, "properties", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Pojos(), this.getPojoDefinition(), null, "pojos", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Tables(), this.getTableDefinition(), null, "tables", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Procedures(), this.getProcedureDefinition(), null, "procedures", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Functions(), this.getFunctionDefinition(), null, "functions", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Statements(), this.getMetaStatement(), null, "statements", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Mappings(), this.getMappingRule(), null, "mappings", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Features(), this.getOptionalFeature(), null, "features", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_PojoPackages(), this.getPackageDeclaration(), null, "pojoPackages", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseCatalogAssignementEClass, DatabaseCatalogAssignement.class, "DatabaseCatalogAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseCatalogAssignement_DbCatalog(), ecorePackage.getEString(), "dbCatalog", null, 0, 1, DatabaseCatalogAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseSchemaAssignementEClass, DatabaseSchemaAssignement.class, "DatabaseSchemaAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseSchemaAssignement_DbSchema(), ecorePackage.getEString(), "dbSchema", null, 0, 1, DatabaseSchemaAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseTypeAssignementEClass, DatabaseTypeAssignement.class, "DatabaseTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseTypeAssignement_DbType(), ecorePackage.getEString(), "dbType", null, 0, 1, DatabaseTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseMetaInfoAssignementEClass, DatabaseMetaInfoAssignement.class, "DatabaseMetaInfoAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseMetaInfoAssignement_DbMetaInfo(), ecorePackage.getEString(), "dbMetaInfo", null, 0, 1, DatabaseMetaInfoAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(driverMetaInfoAssignementEClass, DriverMetaInfoAssignement.class, "DriverMetaInfoAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDriverMetaInfoAssignement_DbDriverInfo(), ecorePackage.getEString(), "dbDriverInfo", null, 0, 1, DriverMetaInfoAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(driverMethodOutputAssignementEClass, DriverMethodOutputAssignement.class, "DriverMethodOutputAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDriverMethodOutputAssignement_DriverMethod(), ecorePackage.getEString(), "driverMethod", null, 0, 1, DriverMethodOutputAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDriverMethodOutputAssignement_CallOutput(), ecorePackage.getEString(), "callOutput", null, 0, 1, DriverMethodOutputAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlTypeAssignementEClass, SqlTypeAssignement.class, "SqlTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSqlTypeAssignement_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, SqlTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSqlTypeAssignement_Size(), ecorePackage.getEString(), "size", null, 0, 1, SqlTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlTypeAssignement_Type(), this.getPojoType(), null, "type", null, 0, 1, SqlTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnTypeAssignementEClass, ColumnTypeAssignement.class, "ColumnTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnTypeAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnTypeAssignement_Type(), this.getPojoType(), null, "type", null, 0, 1, ColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showColumnTypeAssignementEClass, ShowColumnTypeAssignement.class, "ShowColumnTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShowColumnTypeAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ShowColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getShowColumnTypeAssignement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ShowColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableAssignementEClass, TableAssignement.class, "TableAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableAssignement_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, TableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableAssignement_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, TableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinTableAssignementEClass, JoinTableAssignement.class, "JoinTableAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinTableAssignement_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, JoinTableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinTableAssignement_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, JoinTableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnAssignementEClass, ColumnAssignement.class, "ColumnAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ColumnAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnAssignement_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ColumnAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importAssignementEClass, ImportAssignement.class, "ImportAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ImportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportAssignement_PkTable(), ecorePackage.getEString(), "pkTable", null, 0, 1, ImportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportAssignement_PkColumn(), ecorePackage.getEString(), "pkColumn", null, 0, 1, ImportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exportAssignementEClass, ExportAssignement.class, "ExportAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExportAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ExportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExportAssignement_FkTable(), ecorePackage.getEString(), "fkTable", null, 0, 1, ExportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExportAssignement_FkColumn(), ecorePackage.getEString(), "fkColumn", null, 0, 1, ExportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inheritanceAssignementEClass, InheritanceAssignement.class, "InheritanceAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInheritanceAssignement_Discriminator(), ecorePackage.getEString(), "discriminator", null, 0, 1, InheritanceAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceAssignement_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, InheritanceAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceAssignement_DbColumns(), ecorePackage.getEString(), "dbColumns", null, 0, -1, InheritanceAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manyToManyAssignementEClass, ManyToManyAssignement.class, "ManyToManyAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManyToManyAssignement_PkColumn(), ecorePackage.getEString(), "pkColumn", null, 0, 1, ManyToManyAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAssignement_PkTable(), ecorePackage.getEString(), "pkTable", null, 0, 1, ManyToManyAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAssignement_FkColumn(), ecorePackage.getEString(), "fkColumn", null, 0, 1, ManyToManyAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(debugLevelAssignementEClass, DebugLevelAssignement.class, "DebugLevelAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDebugLevelAssignement_Debug(), ecorePackage.getEString(), "debug", null, 0, 1, DebugLevelAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDebugLevelAssignement_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, DebugLevelAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedurePojoAssignementEClass, ProcedurePojoAssignement.class, "ProcedurePojoAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedurePojoAssignement_DbProcedure(), ecorePackage.getEString(), "dbProcedure", null, 0, 1, ProcedurePojoAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedurePojoAssignement_Pojo(), this.getPojoType(), null, "pojo", null, 0, 1, ProcedurePojoAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionPojoAssignementEClass, FunctionPojoAssignement.class, "FunctionPojoAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionPojoAssignement_DbFunction(), ecorePackage.getEString(), "dbFunction", null, 0, 1, FunctionPojoAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionPojoAssignement_Pojo(), this.getPojoType(), null, "pojo", null, 0, 1, FunctionPojoAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implementsAssignementEClass, ImplementsAssignement.class, "ImplementsAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplementsAssignement_ToImplement(), theTypesPackage.getJvmType(), null, "toImplement", null, 0, 1, ImplementsAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplementsAssignement_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, ImplementsAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplementsAssignement_DbNotTables(), ecorePackage.getEString(), "dbNotTables", null, 0, -1, ImplementsAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendsAssignementEClass, ExtendsAssignement.class, "ExtendsAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtendsAssignement_ToExtends(), theTypesPackage.getJvmType(), null, "toExtends", null, 0, 1, ExtendsAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendsAssignement_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, ExtendsAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendsAssignement_DbNotTables(), ecorePackage.getEString(), "dbNotTables", null, 0, -1, ExtendsAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implementsAssignementGenericsEClass, ImplementsAssignementGenerics.class, "ImplementsAssignementGenerics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplementsAssignementGenerics_ToImplement(), theTypesPackage.getJvmType(), null, "toImplement", null, 0, 1, ImplementsAssignementGenerics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplementsAssignementGenerics_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, ImplementsAssignementGenerics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplementsAssignementGenerics_DbNotTables(), ecorePackage.getEString(), "dbNotTables", null, 0, -1, ImplementsAssignementGenerics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendsAssignementGenericsEClass, ExtendsAssignementGenerics.class, "ExtendsAssignementGenerics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtendsAssignementGenerics_ToExtends(), theTypesPackage.getJvmType(), null, "toExtends", null, 0, 1, ExtendsAssignementGenerics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendsAssignementGenerics_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, ExtendsAssignementGenerics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendsAssignementGenerics_DbNotTables(), ecorePackage.getEString(), "dbNotTables", null, 0, -1, ExtendsAssignementGenerics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Database(), this.getDatabaseProperty(), null, "database", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Pojogen(), this.getPojogenProperty(), null, "pojogen", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Metagen(), this.getMetagenProperty(), null, "metagen", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Daogen(), this.getDaogenProperty(), null, "daogen", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_ReplaceId(), ecorePackage.getEString(), "replaceId", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Replacement(), ecorePackage.getEString(), "replacement", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databasePropertyEClass, DatabaseProperty.class, "DatabaseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbUrl(), ecorePackage.getEString(), "dbUrl", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbUsername(), ecorePackage.getEString(), "dbUsername", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbPassword(), ecorePackage.getEString(), "dbPassword", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_DbCatalog(), this.getDatabaseCatalogAssignement(), null, "dbCatalog", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_DbSchema(), this.getDatabaseSchemaAssignement(), null, "dbSchema", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_DbDriverx(), theTypesPackage.getJvmType(), null, "dbDriverx", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbDriver(), ecorePackage.getEString(), "dbDriver", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbExecuteBefore(), ecorePackage.getEString(), "dbExecuteBefore", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbExecuteAfter(), ecorePackage.getEString(), "dbExecuteAfter", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbIndexTypes(), ecorePackage.getEString(), "dbIndexTypes", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_DbType(), this.getDatabaseTypeAssignement(), null, "dbType", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_DbMetaInfo(), this.getDatabaseMetaInfoAssignement(), null, "dbMetaInfo", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_DbDriverInfo(), this.getDriverMetaInfoAssignement(), null, "dbDriverInfo", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_DbMethodsCalls(), this.getDriverMethodOutputAssignement(), null, "dbMethodsCalls", null, 0, -1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseProperty_Debug(), this.getDebugLevelAssignement(), null, "debug", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojogenPropertyEClass, PojogenProperty.class, "PojogenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojogenProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_SqlTypes(), this.getSqlTypeAssignement(), null, "sqlTypes", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ColumnTypes(), this.getColumnTypeAssignement(), null, "columnTypes", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbProcedure(), ecorePackage.getEString(), "dbProcedure", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbFunction(), ecorePackage.getEString(), "dbFunction", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ColumnType(), this.getShowColumnTypeAssignement(), null, "columnType", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_JoinTables(), this.getJoinTableAssignement(), null, "joinTables", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbColumns(), ecorePackage.getEString(), "dbColumns", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Tables(), this.getTableAssignement(), null, "tables", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Columns(), this.getColumnAssignement(), null, "columns", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Exports(), this.getExportAssignement(), null, "exports", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Imports(), this.getImportAssignement(), null, "imports", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Many2s(), this.getManyToManyAssignement(), null, "many2s", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Inheritance(), this.getInheritanceAssignement(), null, "inheritance", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_Methods(), ecorePackage.getEString(), "methods", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_OperatorsSuffix(), ecorePackage.getEString(), "operatorsSuffix", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ToImplements(), this.getImplementsAssignement(), null, "toImplements", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ToExtends(), this.getExtendsAssignement(), null, "toExtends", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ToImplementsGenerics(), this.getImplementsAssignementGenerics(), null, "toImplementsGenerics", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ToExtendsGenerics(), this.getExtendsAssignementGenerics(), null, "toExtendsGenerics", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_ImplPackage(), ecorePackage.getEString(), "implPackage", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_Version(), ecorePackage.getEString(), "version", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbNotTables(), ecorePackage.getEString(), "dbNotTables", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Debug(), this.getDebugLevelAssignement(), null, "debug", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ProcPojos(), this.getProcedurePojoAssignement(), null, "procPojos", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_FunPojos(), this.getFunctionPojoAssignement(), null, "funPojos", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_ActiveFilter(), ecorePackage.getEString(), "activeFilter", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_Pckg(), ecorePackage.getEString(), "pckg", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_EnumName(), ecorePackage.getEString(), "enumName", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbCheckConstraints(), ecorePackage.getEString(), "dbCheckConstraints", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaTypeAssignementEClass, MetaTypeAssignement.class, "MetaTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaTypeAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, MetaTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaTypeAssignement_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetaTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaTypeAssignement_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, MetaTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metagenPropertyEClass, MetagenProperty.class, "MetagenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetagenProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_Sequence(), ecorePackage.getEString(), "sequence", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbNotTables(), ecorePackage.getEString(), "dbNotTables", null, 0, -1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetagenProperty_MetaTypes(), this.getMetaTypeAssignement(), null, "metaTypes", null, 0, -1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbStatement(), ecorePackage.getEString(), "dbStatement", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbColumns(), ecorePackage.getEString(), "dbColumns", null, 0, -1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbFunction(), ecorePackage.getEString(), "dbFunction", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbProcedure(), ecorePackage.getEString(), "dbProcedure", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetagenProperty_Debug(), this.getDebugLevelAssignement(), null, "debug", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_OptionalFeatures(), ecorePackage.getEString(), "optionalFeatures", null, 0, -1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_ActiveFilter(), ecorePackage.getEString(), "activeFilter", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(daogenPropertyEClass, DaogenProperty.class, "DaogenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDaogenProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDaogenProperty_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDaogenProperty_ImplPackage(), ecorePackage.getEString(), "implPackage", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDaogenProperty_ToImplements(), this.getImplementsAssignement(), null, "toImplements", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDaogenProperty_ToExtends(), this.getExtendsAssignement(), null, "toExtends", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDaogenProperty_ToImplementsGenerics(), this.getImplementsAssignementGenerics(), null, "toImplementsGenerics", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDaogenProperty_ToExtendsGenerics(), this.getExtendsAssignementGenerics(), null, "toExtendsGenerics", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDaogenProperty_DbFunction(), ecorePackage.getEString(), "dbFunction", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDaogenProperty_ResultType(), this.getPojoType(), null, "resultType", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDaogenProperty_Debug(), this.getDebugLevelAssignement(), null, "debug", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDaogenProperty_ActiveFilter(), ecorePackage.getEString(), "activeFilter", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDaogenProperty_Pckg(), ecorePackage.getEString(), "pckg", null, 0, 1, DaogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoDefinitionEClass, PojoDefinition.class, "PojoDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoDefinition_Class(), ecorePackage.getEString(), "class", null, 0, 1, PojoDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoDefinition_Classx(), theTypesPackage.getJvmType(), null, "classx", null, 0, 1, PojoDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableDefinitionEClass, TableDefinition.class, "TableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableDefinition_Table(), ecorePackage.getEString(), "table", null, 0, 1, TableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureDefinitionEClass, ProcedureDefinition.class, "ProcedureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedureDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcedureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcedureDefinition_Table(), ecorePackage.getEString(), "table", null, 0, 1, ProcedureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionDefinition_Table(), ecorePackage.getEString(), "table", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaStatementEClass, MetaStatement.class, "MetaStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaStatement_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaStatement_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaStatement_Statement(), this.getSql(), null, "statement", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlEClass, Sql.class, "Sql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSql_Sqls(), this.getSqlFragment(), null, "sqls", null, 0, -1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlFragmentEClass, SqlFragment.class, "SqlFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSqlFragment_Value(), ecorePackage.getEString(), "value", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Col(), this.getColumn(), null, "col", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_CnstOper(), this.getConstantOperator(), null, "cnstOper", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_IdentOper(), this.getIdentifierOperator(), null, "identOper", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Meta(), this.getMetaSql(), null, "meta", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Dbtab(), this.getDatabaseTable(), null, "dbtab", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Dbcol(), this.getDatabaseColumn(), null, "dbcol", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaSqlEClass, MetaSql.class, "MetaSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaSql_Ifs(), this.getIfSql(), null, "ifs", null, 0, -1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaSql_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaSql_Cond(), this.getIfSqlCond(), null, "cond", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaSql_Ftype(), ecorePackage.getEString(), "ftype", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaSql_Ord(), this.getOrdSql(), null, "ord", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlEClass, IfSql.class, "IfSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfSql_Sqls(), this.getIfSqlFragment(), null, "sqls", null, 0, -1, IfSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlFragmentEClass, IfSqlFragment.class, "IfSqlFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIfSqlFragment_Value(), ecorePackage.getEString(), "value", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Col(), this.getColumn(), null, "col", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_CnstOper(), this.getConstantOperator(), null, "cnstOper", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_IdentOper(), this.getIdentifierOperator(), null, "identOper", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Dbtab(), this.getDatabaseTable(), null, "dbtab", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Dbcol(), this.getDatabaseColumn(), null, "dbcol", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Meta(), this.getIfMetaSql(), null, "meta", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifMetaSqlEClass, IfMetaSql.class, "IfMetaSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfMetaSql_Ifs(), this.getIfSql(), null, "ifs", null, 0, -1, IfMetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfMetaSql_Type(), ecorePackage.getEString(), "type", null, 0, 1, IfMetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfMetaSql_Cond(), this.getIfSqlCond(), null, "cond", null, 0, 1, IfMetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlCondEClass, IfSqlCond.class, "IfSqlCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfSqlCond_Bool1(), this.getIfSqlBool(), null, "bool1", null, 0, 1, IfSqlCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfSqlCond_Oper(), ecorePackage.getEString(), "oper", null, 0, -1, IfSqlCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlCond_Bool2(), this.getIfSqlBool(), null, "bool2", null, 0, -1, IfSqlCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlBoolEClass, IfSqlBool.class, "IfSqlBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIfSqlBool_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlBool_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlBool_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlBool_Cond(), this.getIfSqlCond(), null, "cond", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ordSqlEClass, OrdSql.class, "OrdSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrdSql_Sqls(), this.getOrdSql2(), null, "sqls", null, 0, -1, OrdSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ordSql2EClass, OrdSql2.class, "OrdSql2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrdSql2_Value(), ecorePackage.getEString(), "value", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrdSql2_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrdSql2_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrdSql2_Dbcol(), this.getDatabaseColumn(), null, "dbcol", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumn_Columns(), this.getExtendedColumn(), null, "columns", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendedColumnEClass, ExtendedColumn.class, "ExtendedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtendedColumn_Col(), this.getExtendedColumnName(), null, "col", null, 0, 1, ExtendedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendedColumn_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, ExtendedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendedColumnNameEClass, ExtendedColumnName.class, "ExtendedColumnName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtendedColumnName_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExtendedColumnName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Case(), ecorePackage.getEString(), "case", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentifier_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentifier_Case(), ecorePackage.getEString(), "case", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentifier_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantOperatorEClass, ConstantOperator.class, "ConstantOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantOperator_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConstantOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierOperatorEClass, IdentifierOperator.class, "IdentifierOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentifierOperator_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentifierOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseColumnEClass, DatabaseColumn.class, "DatabaseColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseTableEClass, DatabaseTable.class, "DatabaseTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingRuleEClass, MappingRule.class, "MappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Type(), ecorePackage.getEString(), "type", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapping_MappingItems(), this.getMappingItem(), null, "mappingItems", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingItemEClass, MappingItem.class, "MappingItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingItem_Attr(), this.getMappingColumn(), null, "attr", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingColumnEClass, MappingColumn.class, "MappingColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingColumn_Items(), this.getExtendedMappingItem(), null, "items", null, 0, -1, MappingColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendedMappingItemEClass, ExtendedMappingItem.class, "ExtendedMappingItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtendedMappingItem_Attr(), this.getMappingColumnName(), null, "attr", null, 0, 1, ExtendedMappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendedMappingItem_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, ExtendedMappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingColumnNameEClass, MappingColumnName.class, "MappingColumnName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingColumnName_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingColumnName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalFeatureEClass, OptionalFeature.class, "OptionalFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOptionalFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Type(), ecorePackage.getEString(), "type", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Option(), ecorePackage.getEString(), "option", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoTypeEClass, PojoType.class, "PojoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoType_Native(), ecorePackage.getEString(), "native", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Ref(), this.getPojoEntity(), null, "ref", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Gref(), this.getPojoEntity(), null, "gref", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Gtype(), theTypesPackage.getJvmType(), null, "gtype", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoType_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDeclaration_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDeclaration_Elements(), this.getAbstractPojoEntity(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotation_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotation_Features(), this.getAnnotationProperty(), null, "features", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotationProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationProperty_Ref(), this.getPojoEntity(), null, "ref", null, 0, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationProperty_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnnotationProperty_Number(), ecorePackage.getEString(), "number", null, 0, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnnotationProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnnotationProperty_Constant(), ecorePackage.getEString(), "constant", null, 0, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotatedEntityEClass, AnnotatedEntity.class, "AnnotatedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotatedEntity_ConflictAnnotations(), this.getAnnotation(), null, "conflictAnnotations", null, 0, -1, AnnotatedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotatedEntity_StaticAnnotations(), this.getAnnotation(), null, "staticAnnotations", null, 0, -1, AnnotatedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotatedEntity_ConstructorAnnotations(), this.getAnnotation(), null, "constructorAnnotations", null, 0, -1, AnnotatedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotatedEntity_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, AnnotatedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotatedEntity_Entity(), this.getEntity(), null, "entity", null, 0, 1, AnnotatedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractPojoEntityEClass, AbstractPojoEntity.class, "AbstractPojoEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplements_Implements(), theTypesPackage.getJvmType(), null, "implements", null, 0, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplements_Generics(), ecorePackage.getEBoolean(), "generics", null, 0, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplements_OnlyPojos(), this.getPojoEntity(), null, "onlyPojos", null, 0, -1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplements_OnlyDaos(), this.getPojoDao(), null, "onlyDaos", null, 0, -1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplements_ExceptPojos(), this.getPojoEntity(), null, "exceptPojos", null, 0, -1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplements_ExceptDaos(), this.getPojoDao(), null, "exceptDaos", null, 0, -1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendsEClass, Extends.class, "Extends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtends_Extends(), theTypesPackage.getJvmType(), null, "extends", null, 0, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtends_Generics(), ecorePackage.getEBoolean(), "generics", null, 0, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtends_OnlyPojos(), this.getPojoEntity(), null, "onlyPojos", null, 0, -1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtends_OnlyDaos(), this.getPojoDao(), null, "onlyDaos", null, 0, -1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtends_ExceptPojos(), this.getPojoEntity(), null, "exceptPojos", null, 0, -1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtends_ExceptDaos(), this.getPojoDao(), null, "exceptDaos", null, 0, -1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implPackageEClass, ImplPackage.class, "ImplPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImplPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoEntityModifier1EClass, PojoEntityModifier1.class, "PojoEntityModifier1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoEntityModifier1_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, PojoEntityModifier1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier1_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, PojoEntityModifier1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoEntityModifier2EClass, PojoEntityModifier2.class, "PojoEntityModifier2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoEntityModifier2_SuperType(), this.getPojoEntity(), null, "superType", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier2_Discriminator(), ecorePackage.getEString(), "discriminator", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier2_Operators(), ecorePackage.getEString(), "operators", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier2_OperatorsSuffix(), ecorePackage.getEString(), "operatorsSuffix", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier2_Sernum(), ecorePackage.getEString(), "sernum", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoEntityEClass, PojoEntity.class, "PojoEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoEntity_Modifiers1(), this.getPojoEntityModifier1(), null, "modifiers1", null, 0, -1, PojoEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoEntity_Modifiers2(), this.getPojoEntityModifier2(), null, "modifiers2", null, 0, -1, PojoEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoEntity_Features(), this.getPojoAnnotatedProperty(), null, "features", null, 0, -1, PojoEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoAnnotatedPropertyEClass, PojoAnnotatedProperty.class, "PojoAnnotatedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoAnnotatedProperty_SetterAnnotations(), this.getAnnotation(), null, "setterAnnotations", null, 0, -1, PojoAnnotatedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoAnnotatedProperty_GetterAnnotations(), this.getAnnotation(), null, "getterAnnotations", null, 0, -1, PojoAnnotatedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoAnnotatedProperty_AttributeAnnotations(), this.getAnnotation(), null, "attributeAnnotations", null, 0, -1, PojoAnnotatedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoAnnotatedProperty_Feature(), this.getPojoProperty(), null, "feature", null, 0, 1, PojoAnnotatedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoPropertyModifierEClass, PojoPropertyModifier.class, "PojoPropertyModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoPropertyModifier_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_Discriminator(), ecorePackage.getEBoolean(), "discriminator", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_Index(), ecorePackage.getEString(), "index", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_Version(), ecorePackage.getEBoolean(), "version", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_UpdateColumn1(), ecorePackage.getEString(), "updateColumn1", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_UpdateColumn2(), ecorePackage.getEString(), "updateColumn2", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_CreateColumn1(), ecorePackage.getEString(), "createColumn1", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_CreateColumn2(), ecorePackage.getEString(), "createColumn2", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoPropertyEClass, PojoProperty.class, "PojoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoProperty_Native(), ecorePackage.getEString(), "native", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Attrs(), this.getPojoProperty(), null, "attrs", null, 0, -1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Ref(), this.getEntity(), null, "ref", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Gref(), this.getPojoEntity(), null, "gref", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Gtype(), theTypesPackage.getJvmType(), null, "gtype", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoProperty_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Modifiers(), this.getPojoPropertyModifier(), null, "modifiers", null, 0, -1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEntityModifier1EClass, EnumEntityModifier1.class, "EnumEntityModifier1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumEntityModifier1_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, EnumEntityModifier1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEntityModifier2EClass, EnumEntityModifier2.class, "EnumEntityModifier2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumEntityModifier2_SuperType(), this.getPojoEntity(), null, "superType", null, 0, 1, EnumEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumEntityModifier2_Sernum(), ecorePackage.getEString(), "sernum", null, 0, 1, EnumEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEntityEClass, EnumEntity.class, "EnumEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumEntity_Modifiers1(), this.getEnumEntityModifier1(), null, "modifiers1", null, 0, -1, EnumEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumEntity_Modifiers2(), this.getEnumEntityModifier2(), null, "modifiers2", null, 0, -1, EnumEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumEntity_Features(), this.getEnumProperty(), null, "features", null, 0, -1, EnumEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumPropertyEClass, EnumProperty.class, "EnumProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumProperty_Native(), ecorePackage.getEString(), "native", null, 0, 1, EnumProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumProperty_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, EnumProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoDaoModifierEClass, PojoDaoModifier.class, "PojoDaoModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoDaoModifier_SuperType(), this.getPojoDao(), null, "superType", null, 0, 1, PojoDaoModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoDaoModifier_Sernum(), ecorePackage.getEString(), "sernum", null, 0, 1, PojoDaoModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoDaoEClass, PojoDao.class, "PojoDao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoDao_Modifiers1(), this.getPojoEntityModifier1(), null, "modifiers1", null, 0, -1, PojoDao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoDao_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoDao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoDao_PojoGenerics(), ecorePackage.getEBoolean(), "pojoGenerics", null, 0, 1, PojoDao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoDao_Pojo(), this.getPojoEntity(), null, "pojo", null, 0, 1, PojoDao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoDao_Modifiers2(), this.getPojoDaoModifier(), null, "modifiers2", null, 0, -1, PojoDao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoDao_Methods(), this.getPojoMethod(), null, "methods", null, 0, -1, PojoDao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoDao_ToInits(), this.getToInitMethod(), null, "toInits", null, 0, -1, PojoDao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoMethodModifierEClass, PojoMethodModifier.class, "PojoMethodModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoMethodModifier_CallFunction(), ecorePackage.getEBoolean(), "callFunction", null, 0, 1, PojoMethodModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoMethodModifier_CallUpdate(), ecorePackage.getEBoolean(), "callUpdate", null, 0, 1, PojoMethodModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoMethodModifier_CallQuery(), ecorePackage.getEBoolean(), "callQuery", null, 0, 1, PojoMethodModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoMethodModifier_CallQueryFunction(), ecorePackage.getEBoolean(), "callQueryFunction", null, 0, 1, PojoMethodModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoMethodModifier_CallSelectFunction(), ecorePackage.getEBoolean(), "callSelectFunction", null, 0, 1, PojoMethodModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoMethodEClass, PojoMethod.class, "PojoMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoMethod_Modifiers1(), this.getPojoMethodModifier(), null, "modifiers1", null, 0, -1, PojoMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoMethod_Type(), this.getPojoType(), null, "type", null, 0, 1, PojoMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoMethod_Args(), this.getPojoMethodArg(), null, "args", null, 0, -1, PojoMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toInitMethodEClass, ToInitMethod.class, "ToInitMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getToInitMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ToInitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getToInitMethod_Args(), this.getPojoMethodArg(), null, "args", null, 0, -1, ToInitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoMethodArgEClass, PojoMethodArg.class, "PojoMethodArg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoMethodArg_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoMethodArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoMethodArg_Type(), this.getPojoType(), null, "type", null, 0, 1, PojoMethodArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ProcessorModelPackageImpl
