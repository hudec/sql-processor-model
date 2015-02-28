/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sqlproc.model.processorModel.ProcessorModelFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessorModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "processorModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sqlproc.org/model/ProcessorModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "processorModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProcessorModelPackage eINSTANCE = org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ArtifactsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getArtifacts()
   * @generated
   */
  int ARTIFACTS = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Pojos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__POJOS = 1;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__TABLES = 2;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__PROCEDURES = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__FUNCTIONS = 4;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__PACKAGES = 5;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ValueTypeImpl <em>Value Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ValueTypeImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getValueType()
   * @generated
   */
  int VALUE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__NUMBER = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__ID = 2;

  /**
   * The number of structural features of the '<em>Value Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DatabaseCatalogAssignementImpl <em>Database Catalog Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DatabaseCatalogAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseCatalogAssignement()
   * @generated
   */
  int DATABASE_CATALOG_ASSIGNEMENT = 2;

  /**
   * The feature id for the '<em><b>Db Catalog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG = 0;

  /**
   * The number of structural features of the '<em>Database Catalog Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_CATALOG_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DatabaseSchemaAssignementImpl <em>Database Schema Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DatabaseSchemaAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseSchemaAssignement()
   * @generated
   */
  int DATABASE_SCHEMA_ASSIGNEMENT = 3;

  /**
   * The feature id for the '<em><b>Db Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_SCHEMA_ASSIGNEMENT__DB_SCHEMA = 0;

  /**
   * The number of structural features of the '<em>Database Schema Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_SCHEMA_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DatabaseTypeAssignementImpl <em>Database Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DatabaseTypeAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseTypeAssignement()
   * @generated
   */
  int DATABASE_TYPE_ASSIGNEMENT = 4;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_TYPE_ASSIGNEMENT__DB_TYPE = 0;

  /**
   * The number of structural features of the '<em>Database Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_TYPE_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DatabaseMetaInfoAssignementImpl <em>Database Meta Info Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DatabaseMetaInfoAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseMetaInfoAssignement()
   * @generated
   */
  int DATABASE_META_INFO_ASSIGNEMENT = 5;

  /**
   * The feature id for the '<em><b>Db Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO = 0;

  /**
   * The number of structural features of the '<em>Database Meta Info Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_META_INFO_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DriverMetaInfoAssignementImpl <em>Driver Meta Info Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DriverMetaInfoAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDriverMetaInfoAssignement()
   * @generated
   */
  int DRIVER_META_INFO_ASSIGNEMENT = 6;

  /**
   * The feature id for the '<em><b>Db Driver Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO = 0;

  /**
   * The number of structural features of the '<em>Driver Meta Info Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_META_INFO_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DriverMethodOutputAssignementImpl <em>Driver Method Output Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DriverMethodOutputAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDriverMethodOutputAssignement()
   * @generated
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT = 7;

  /**
   * The feature id for the '<em><b>Driver Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD = 0;

  /**
   * The feature id for the '<em><b>Call Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT = 1;

  /**
   * The number of structural features of the '<em>Driver Method Output Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.SqlTypeAssignementImpl <em>Sql Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.SqlTypeAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getSqlTypeAssignement()
   * @generated
   */
  int SQL_TYPE_ASSIGNEMENT = 8;

  /**
   * The feature id for the '<em><b>Sql Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_ASSIGNEMENT__SQL_TYPE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_ASSIGNEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Sql Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ColumnTypeAssignementImpl <em>Column Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ColumnTypeAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getColumnTypeAssignement()
   * @generated
   */
  int COLUMN_TYPE_ASSIGNEMENT = 9;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_ASSIGNEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Column Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ShowColumnTypeAssignementImpl <em>Show Column Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ShowColumnTypeAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getShowColumnTypeAssignement()
   * @generated
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT = 10;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Show Column Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.TableAssignementImpl <em>Table Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.TableAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getTableAssignement()
   * @generated
   */
  int TABLE_ASSIGNEMENT = 11;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ASSIGNEMENT__DB_TABLE = 0;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ASSIGNEMENT__NEW_NAME = 1;

  /**
   * The number of structural features of the '<em>Table Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.JoinTableAssignementImpl <em>Join Table Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.JoinTableAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getJoinTableAssignement()
   * @generated
   */
  int JOIN_TABLE_ASSIGNEMENT = 12;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_ASSIGNEMENT__DB_TABLE = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_ASSIGNEMENT__DB_TABLES = 1;

  /**
   * The number of structural features of the '<em>Join Table Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ColumnAssignementImpl <em>Column Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ColumnAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getColumnAssignement()
   * @generated
   */
  int COLUMN_ASSIGNEMENT = 13;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ASSIGNEMENT__NEW_NAME = 1;

  /**
   * The number of structural features of the '<em>Column Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImportAssignementImpl <em>Import Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImportAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImportAssignement()
   * @generated
   */
  int IMPORT_ASSIGNEMENT = 14;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Pk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT__PK_TABLE = 1;

  /**
   * The feature id for the '<em><b>Pk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT__PK_COLUMN = 2;

  /**
   * The number of structural features of the '<em>Import Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ExportAssignementImpl <em>Export Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ExportAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExportAssignement()
   * @generated
   */
  int EXPORT_ASSIGNEMENT = 15;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Fk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT__FK_TABLE = 1;

  /**
   * The feature id for the '<em><b>Fk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT__FK_COLUMN = 2;

  /**
   * The number of structural features of the '<em>Export Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.InheritanceAssignementImpl <em>Inheritance Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.InheritanceAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getInheritanceAssignement()
   * @generated
   */
  int INHERITANCE_ASSIGNEMENT = 16;

  /**
   * The feature id for the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT__DISCRIMINATOR = 0;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT__DB_TABLE = 1;

  /**
   * The feature id for the '<em><b>Db Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT__DB_COLUMNS = 2;

  /**
   * The number of structural features of the '<em>Inheritance Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ManyToManyAssignementImpl <em>Many To Many Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ManyToManyAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getManyToManyAssignement()
   * @generated
   */
  int MANY_TO_MANY_ASSIGNEMENT = 17;

  /**
   * The feature id for the '<em><b>Pk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Pk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT__PK_TABLE = 1;

  /**
   * The feature id for the '<em><b>Fk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN = 2;

  /**
   * The number of structural features of the '<em>Many To Many Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DebugLevelAssignementImpl <em>Debug Level Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DebugLevelAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDebugLevelAssignement()
   * @generated
   */
  int DEBUG_LEVEL_ASSIGNEMENT = 18;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBUG_LEVEL_ASSIGNEMENT__DEBUG = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBUG_LEVEL_ASSIGNEMENT__SCOPE = 1;

  /**
   * The number of structural features of the '<em>Debug Level Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBUG_LEVEL_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ProcedurePojoAssignementImpl <em>Procedure Pojo Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ProcedurePojoAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedurePojoAssignement()
   * @generated
   */
  int PROCEDURE_POJO_ASSIGNEMENT = 19;

  /**
   * The feature id for the '<em><b>Db Procedure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_POJO_ASSIGNEMENT__DB_PROCEDURE = 0;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_POJO_ASSIGNEMENT__POJO = 1;

  /**
   * The number of structural features of the '<em>Procedure Pojo Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_POJO_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.FunctionPojoAssignementImpl <em>Function Pojo Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.FunctionPojoAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionPojoAssignement()
   * @generated
   */
  int FUNCTION_POJO_ASSIGNEMENT = 20;

  /**
   * The feature id for the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION = 0;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_POJO_ASSIGNEMENT__POJO = 1;

  /**
   * The number of structural features of the '<em>Function Pojo Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_POJO_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsAssignementImpl <em>Implements Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsAssignement()
   * @generated
   */
  int IMPLEMENTS_ASSIGNEMENT = 21;

  /**
   * The feature id for the '<em><b>To Implement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT__DB_TABLES = 1;

  /**
   * The feature id for the '<em><b>Db Not Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES = 2;

  /**
   * The number of structural features of the '<em>Implements Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ExtendsAssignementImpl <em>Extends Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ExtendsAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExtendsAssignement()
   * @generated
   */
  int EXTENDS_ASSIGNEMENT = 22;

  /**
   * The feature id for the '<em><b>To Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT__TO_EXTENDS = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT__DB_TABLES = 1;

  /**
   * The feature id for the '<em><b>Db Not Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT__DB_NOT_TABLES = 2;

  /**
   * The number of structural features of the '<em>Extends Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsAssignementGenericsImpl <em>Implements Assignement Generics</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsAssignementGenericsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsAssignementGenerics()
   * @generated
   */
  int IMPLEMENTS_ASSIGNEMENT_GENERICS = 23;

  /**
   * The feature id for the '<em><b>To Implement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT_GENERICS__TO_IMPLEMENT = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT_GENERICS__DB_TABLES = 1;

  /**
   * The feature id for the '<em><b>Db Not Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT_GENERICS__DB_NOT_TABLES = 2;

  /**
   * The number of structural features of the '<em>Implements Assignement Generics</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_ASSIGNEMENT_GENERICS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ExtendsAssignementGenericsImpl <em>Extends Assignement Generics</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ExtendsAssignementGenericsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExtendsAssignementGenerics()
   * @generated
   */
  int EXTENDS_ASSIGNEMENT_GENERICS = 24;

  /**
   * The feature id for the '<em><b>To Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT_GENERICS__TO_EXTENDS = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT_GENERICS__DB_TABLES = 1;

  /**
   * The feature id for the '<em><b>Db Not Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT_GENERICS__DB_NOT_TABLES = 2;

  /**
   * The number of structural features of the '<em>Extends Assignement Generics</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_ASSIGNEMENT_GENERICS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PropertyConditionImpl <em>Property Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PropertyConditionImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPropertyCondition()
   * @generated
   */
  int PROPERTY_CONDITION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PropertyImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 26;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DATABASE = 2;

  /**
   * The feature id for the '<em><b>Pojogen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__POJOGEN = 3;

  /**
   * The feature id for the '<em><b>Metagen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__METAGEN = 4;

  /**
   * The feature id for the '<em><b>Daogen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DAOGEN = 5;

  /**
   * The feature id for the '<em><b>Replace Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__REPLACE_ID = 6;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__REGEX = 7;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__REPLACEMENT = 8;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl <em>Database Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DatabasePropertyImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseProperty()
   * @generated
   */
  int DATABASE_PROPERTY = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Db Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_URL = 1;

  /**
   * The feature id for the '<em><b>Db Username</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_USERNAME = 2;

  /**
   * The feature id for the '<em><b>Db Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_PASSWORD = 3;

  /**
   * The feature id for the '<em><b>Db Catalog</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_CATALOG = 4;

  /**
   * The feature id for the '<em><b>Db Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_SCHEMA = 5;

  /**
   * The feature id for the '<em><b>Db Driverx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_DRIVERX = 6;

  /**
   * The feature id for the '<em><b>Db Driver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_DRIVER = 7;

  /**
   * The feature id for the '<em><b>Db Execute Before</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_EXECUTE_BEFORE = 8;

  /**
   * The feature id for the '<em><b>Db Execute After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_EXECUTE_AFTER = 9;

  /**
   * The feature id for the '<em><b>Db Index Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_INDEX_TYPES = 10;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_TYPE = 11;

  /**
   * The feature id for the '<em><b>Db Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_META_INFO = 12;

  /**
   * The feature id for the '<em><b>Db Driver Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_DRIVER_INFO = 13;

  /**
   * The feature id for the '<em><b>Db Methods Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_METHODS_CALLS = 14;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DEBUG = 15;

  /**
   * The number of structural features of the '<em>Database Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojogenPropertyImpl <em>Pojogen Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojogenPropertyImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojogenProperty()
   * @generated
   */
  int POJOGEN_PROPERTY = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sql Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__SQL_TYPES = 1;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_TABLE = 2;

  /**
   * The feature id for the '<em><b>Column Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__COLUMN_TYPES = 3;

  /**
   * The feature id for the '<em><b>Db Procedure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_PROCEDURE = 4;

  /**
   * The feature id for the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_FUNCTION = 5;

  /**
   * The feature id for the '<em><b>Column Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__COLUMN_TYPE = 6;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_TABLES = 7;

  /**
   * The feature id for the '<em><b>Join Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__JOIN_TABLES = 8;

  /**
   * The feature id for the '<em><b>Db Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_COLUMNS = 9;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TABLES = 10;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__COLUMNS = 11;

  /**
   * The feature id for the '<em><b>Exports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__EXPORTS = 12;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__IMPORTS = 13;

  /**
   * The feature id for the '<em><b>Many2s</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__MANY2S = 14;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_COLUMN = 15;

  /**
   * The feature id for the '<em><b>Inheritance</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__INHERITANCE = 16;

  /**
   * The feature id for the '<em><b>Methods</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__METHODS = 17;

  /**
   * The feature id for the '<em><b>Operators Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__OPERATORS_SUFFIX = 18;

  /**
   * The feature id for the '<em><b>To Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TO_IMPLEMENTS = 19;

  /**
   * The feature id for the '<em><b>To Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TO_EXTENDS = 20;

  /**
   * The feature id for the '<em><b>To Implements Generics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS = 21;

  /**
   * The feature id for the '<em><b>To Extends Generics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TO_EXTENDS_GENERICS = 22;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__VERSION = 23;

  /**
   * The feature id for the '<em><b>Db Not Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_NOT_TABLES = 24;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DEBUG = 25;

  /**
   * The feature id for the '<em><b>Proc Pojos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__PROC_POJOS = 26;

  /**
   * The feature id for the '<em><b>Fun Pojos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__FUN_POJOS = 27;

  /**
   * The feature id for the '<em><b>Active Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__ACTIVE_FILTER = 28;

  /**
   * The feature id for the '<em><b>Pckg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__PCKG = 29;

  /**
   * The feature id for the '<em><b>Enum Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__ENUM_NAME = 30;

  /**
   * The feature id for the '<em><b>Db Check Constraints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_CHECK_CONSTRAINTS = 31;

  /**
   * The number of structural features of the '<em>Pojogen Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY_FEATURE_COUNT = 32;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.MetaTypeAssignementImpl <em>Meta Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.MetaTypeAssignementImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getMetaTypeAssignement()
   * @generated
   */
  int META_TYPE_ASSIGNEMENT = 29;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT__EXTENSION = 2;

  /**
   * The number of structural features of the '<em>Meta Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.MetagenPropertyImpl <em>Metagen Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.MetagenPropertyImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getMetagenProperty()
   * @generated
   */
  int METAGEN_PROPERTY = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__SEQUENCE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_TABLES = 3;

  /**
   * The feature id for the '<em><b>Db Not Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_NOT_TABLES = 4;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_TABLE = 5;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__IDENTITY = 6;

  /**
   * The feature id for the '<em><b>Meta Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__META_TYPES = 7;

  /**
   * The feature id for the '<em><b>Db Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Db Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_COLUMNS = 9;

  /**
   * The feature id for the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_FUNCTION = 10;

  /**
   * The feature id for the '<em><b>Db Procedure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_PROCEDURE = 11;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DEBUG = 12;

  /**
   * The feature id for the '<em><b>Optional Features</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__OPTIONAL_FEATURES = 13;

  /**
   * The feature id for the '<em><b>Active Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__ACTIVE_FILTER = 14;

  /**
   * The number of structural features of the '<em>Metagen Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl <em>Daogen Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaogenPropertyImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaogenProperty()
   * @generated
   */
  int DAOGEN_PROPERTY = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__DB_TABLES = 1;

  /**
   * The feature id for the '<em><b>To Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__TO_IMPLEMENTS = 2;

  /**
   * The feature id for the '<em><b>To Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__TO_EXTENDS = 3;

  /**
   * The feature id for the '<em><b>To Implements Generics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS = 4;

  /**
   * The feature id for the '<em><b>To Extends Generics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__TO_EXTENDS_GENERICS = 5;

  /**
   * The feature id for the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__DB_FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Result Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__RESULT_TYPE = 7;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__DEBUG = 8;

  /**
   * The feature id for the '<em><b>Active Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__ACTIVE_FILTER = 9;

  /**
   * The feature id for the '<em><b>Pckg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__PCKG = 10;

  /**
   * The number of structural features of the '<em>Daogen Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDefinitionImpl <em>Pojo Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDefinitionImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDefinition()
   * @generated
   */
  int POJO_DEFINITION = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DEFINITION__CLASS = 1;

  /**
   * The feature id for the '<em><b>Classx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DEFINITION__CLASSX = 2;

  /**
   * The number of structural features of the '<em>Pojo Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.TableDefinitionImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getTableDefinition()
   * @generated
   */
  int TABLE_DEFINITION = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__TABLE = 1;

  /**
   * The number of structural features of the '<em>Table Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ProcedureDefinitionImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedureDefinition()
   * @generated
   */
  int PROCEDURE_DEFINITION = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION__TABLE = 1;

  /**
   * The number of structural features of the '<em>Procedure Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.FunctionDefinitionImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__TABLE = 1;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PackageImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AbstractEntityImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAbstractEntity()
   * @generated
   */
  int ABSTRACT_ENTITY = 37;

  /**
   * The number of structural features of the '<em>Abstract Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveImpl <em>Implements Extends Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirective()
   * @generated
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE = 38;

  /**
   * The number of structural features of the '<em>Implements Extends Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsImpl <em>Implements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplements()
   * @generated
   */
  int IMPLEMENTS = 39;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS__DIRECTIVES = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS__IMPLEMENTS = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Implements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ExtendsImpl <em>Extends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ExtendsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExtends()
   * @generated
   */
  int EXTENDS = 40;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__DIRECTIVES = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__EXTENDS = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotatedEntityImpl <em>Annotated Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotatedEntityImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotatedEntity()
   * @generated
   */
  int ANNOTATED_ENTITY = 41;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_ENTITY__ANNOTATIONS = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_ENTITY__ENTITY = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotated Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_ENTITY_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EntityImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 42;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FINAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 1;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROCEDURES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DirectivePropertiesImpl <em>Directive Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DirectivePropertiesImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDirectiveProperties()
   * @generated
   */
  int DIRECTIVE_PROPERTIES = 43;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE_PROPERTIES__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Directive Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE_PROPERTIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveImpl <em>Pojo Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirective()
   * @generated
   */
  int POJO_DIRECTIVE = 44;

  /**
   * The number of structural features of the '<em>Pojo Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoEntityImpl <em>Pojo Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoEntityImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoEntity()
   * @generated
   */
  int POJO_ENTITY = 45;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__FINAL = ENTITY__FINAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__PROCEDURES = ENTITY__PROCEDURES;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__DIRECTIVES = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__ABSTRACT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__SUPER_TYPE = ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__ATTRIBUTES = ENTITY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Pojo Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveImpl <em>Pojo Attribute Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirective()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE = 46;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeImpl <em>Pojo Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttribute()
   * @generated
   */
  int POJO_ATTRIBUTE = 47;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__DIRECTIVES = 1;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__FINAL = 2;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__STATIC = 3;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__KIND = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__NAME = 6;

  /**
   * The feature id for the '<em><b>Init Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE__INIT_EXPR = 7;

  /**
   * The number of structural features of the '<em>Pojo Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoProcedureImpl <em>Pojo Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoProcedureImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoProcedure()
   * @generated
   */
  int POJO_PROCEDURE = 48;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE__FINAL = 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE__STATIC = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE__TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE__NAME = 4;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE__PARAMS = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE__BODY = 6;

  /**
   * The number of structural features of the '<em>Pojo Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROCEDURE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EnumDirectiveImpl <em>Enum Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EnumDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumDirective()
   * @generated
   */
  int ENUM_DIRECTIVE = 49;

  /**
   * The number of structural features of the '<em>Enum Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EnumEntityImpl <em>Enum Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EnumEntityImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumEntity()
   * @generated
   */
  int ENUM_ENTITY = 50;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTITY__FINAL = ENTITY__FINAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTITY__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTITY__PROCEDURES = ENTITY__PROCEDURES;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTITY__DIRECTIVES = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTITY__ATTRIBUTE = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeValueImpl <em>Enum Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EnumAttributeValueImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttributeValue()
   * @generated
   */
  int ENUM_ATTRIBUTE_VALUE = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_VALUE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveImpl <em>Enum Attribute Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttributeDirective()
   * @generated
   */
  int ENUM_ATTRIBUTE_DIRECTIVE = 52;

  /**
   * The number of structural features of the '<em>Enum Attribute Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EnumAttributeImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttribute()
   * @generated
   */
  int ENUM_ATTRIBUTE = 53;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__DIRECTIVES = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__FINAL = 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__STATIC = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__NAME = 4;

  /**
   * The number of structural features of the '<em>Enum Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveParametersImpl <em>Dao Directive Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoDirectiveParametersImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveParameters()
   * @generated
   */
  int DAO_DIRECTIVE_PARAMETERS = 54;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_PARAMETERS__OUT = 0;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_PARAMETERS__INS = 1;

  /**
   * The number of structural features of the '<em>Dao Directive Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_PARAMETERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DescendantAssignmentImpl <em>Descendant Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DescendantAssignmentImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDescendantAssignment()
   * @generated
   */
  int DESCENDANT_ASSIGNMENT = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_ASSIGNMENT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Descendant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_ASSIGNMENT__DESCENDANT = 1;

  /**
   * The number of structural features of the '<em>Descendant Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.FunProcTypeImpl <em>Fun Proc Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.FunProcTypeImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunProcType()
   * @generated
   */
  int FUN_PROC_TYPE = 56;

  /**
   * The number of structural features of the '<em>Fun Proc Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_PROC_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveImpl <em>Dao Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirective()
   * @generated
   */
  int DAO_DIRECTIVE = 57;

  /**
   * The number of structural features of the '<em>Dao Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoEntityImpl <em>Dao Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoEntityImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoEntity()
   * @generated
   */
  int DAO_ENTITY = 58;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY__FINAL = ENTITY__FINAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY__PROCEDURES = ENTITY__PROCEDURES;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY__DIRECTIVES = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY__ABSTRACT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY__SUPER_TYPE = ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY__ATTRIBUTES = ENTITY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Dao Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveImpl <em>Annotation Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirective()
   * @generated
   */
  int ANNOTATION_DIRECTIVE = 59;

  /**
   * The number of structural features of the '<em>Annotation Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 60;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__DIRECTIVES = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveGenericsImpl <em>Implements Extends Directive Generics</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveGenericsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveGenerics()
   * @generated
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_GENERICS = 61;

  /**
   * The number of structural features of the '<em>Implements Extends Directive Generics</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_GENERICS_FEATURE_COUNT = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyPojosImpl <em>Implements Extends Directive Only Pojos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyPojosImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveOnlyPojos()
   * @generated
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS = 62;

  /**
   * The feature id for the '<em><b>Only Pojos</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS__ONLY_POJOS = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implements Extends Directive Only Pojos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS_FEATURE_COUNT = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyDaosImpl <em>Implements Extends Directive Only Daos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyDaosImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveOnlyDaos()
   * @generated
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_DAOS = 63;

  /**
   * The feature id for the '<em><b>Only Daos</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_DAOS__ONLY_DAOS = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implements Extends Directive Only Daos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_DAOS_FEATURE_COUNT = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptPojosImpl <em>Implements Extends Directive Except Pojos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptPojosImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveExceptPojos()
   * @generated
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS = 64;

  /**
   * The feature id for the '<em><b>Except Pojos</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS__EXCEPT_POJOS = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implements Extends Directive Except Pojos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS_FEATURE_COUNT = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptDaosImpl <em>Implements Extends Directive Except Daos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptDaosImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveExceptDaos()
   * @generated
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_DAOS = 65;

  /**
   * The feature id for the '<em><b>Except Daos</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_DAOS__EXCEPT_DAOS = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implements Extends Directive Except Daos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_DAOS_FEATURE_COUNT = IMPLEMENTS_EXTENDS_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveToStringImpl <em>Pojo Directive To String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveToStringImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveToString()
   * @generated
   */
  int POJO_DIRECTIVE_TO_STRING = 66;

  /**
   * The feature id for the '<em><b>Proplist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_TO_STRING__PROPLIST = POJO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pojo Directive To String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_TO_STRING_FEATURE_COUNT = POJO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveIndexImpl <em>Pojo Directive Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveIndexImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveIndex()
   * @generated
   */
  int POJO_DIRECTIVE_INDEX = 67;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_INDEX__INDEX = POJO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Proplist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_INDEX__PROPLIST = POJO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pojo Directive Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_INDEX_FEATURE_COUNT = POJO_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveOperatorsImpl <em>Pojo Directive Operators</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveOperatorsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveOperators()
   * @generated
   */
  int POJO_DIRECTIVE_OPERATORS = 68;

  /**
   * The feature id for the '<em><b>Operators Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_OPERATORS__OPERATORS_SUFFIX = POJO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pojo Directive Operators</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_OPERATORS_FEATURE_COUNT = POJO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveSerializableImpl <em>Pojo Directive Serializable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveSerializableImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveSerializable()
   * @generated
   */
  int POJO_DIRECTIVE_SERIALIZABLE = 69;

  /**
   * The feature id for the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_SERIALIZABLE__SERNUM = POJO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pojo Directive Serializable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_SERIALIZABLE_FEATURE_COUNT = POJO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveDiscriminatorImpl <em>Pojo Directive Discriminator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveDiscriminatorImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveDiscriminator()
   * @generated
   */
  int POJO_DIRECTIVE_DISCRIMINATOR = 70;

  /**
   * The feature id for the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_DISCRIMINATOR__DISCRIMINATOR = POJO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pojo Directive Discriminator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_DISCRIMINATOR_FEATURE_COUNT = POJO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveEqualsImpl <em>Pojo Directive Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveEqualsImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveEquals()
   * @generated
   */
  int POJO_DIRECTIVE_EQUALS = 71;

  /**
   * The feature id for the '<em><b>Proplist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_EQUALS__PROPLIST = POJO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pojo Directive Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_EQUALS_FEATURE_COUNT = POJO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveHashCodeImpl <em>Pojo Directive Hash Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoDirectiveHashCodeImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveHashCode()
   * @generated
   */
  int POJO_DIRECTIVE_HASH_CODE = 72;

  /**
   * The feature id for the '<em><b>Proplist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_HASH_CODE__PROPLIST = POJO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pojo Directive Hash Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DIRECTIVE_HASH_CODE_FEATURE_COUNT = POJO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveRequiredImpl <em>Pojo Attribute Directive Required</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveRequiredImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveRequired()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_REQUIRED = 73;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Required</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_REQUIRED_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectivePrimaryKeyImpl <em>Pojo Attribute Directive Primary Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectivePrimaryKeyImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectivePrimaryKey()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_PRIMARY_KEY = 74;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Primary Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_PRIMARY_KEY_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveDiscriminatorImpl <em>Pojo Attribute Directive Discriminator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveDiscriminatorImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveDiscriminator()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_DISCRIMINATOR = 75;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Discriminator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_DISCRIMINATOR_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIndexImpl <em>Pojo Attribute Directive Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIndexImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveIndex()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_INDEX = 76;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_INDEX__INDEX = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_INDEX_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveVersionImpl <em>Pojo Attribute Directive Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveVersionImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveVersion()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_VERSION = 77;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_VERSION_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveUpdateColImpl <em>Pojo Attribute Directive Update Col</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveUpdateColImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveUpdateCol()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL = 78;

  /**
   * The feature id for the '<em><b>Update Column1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1 = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Update Column2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2 = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Update Col</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveCreateColImpl <em>Pojo Attribute Directive Create Col</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveCreateColImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveCreateCol()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_CREATE_COL = 79;

  /**
   * The feature id for the '<em><b>Create Column1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_CREATE_COL__CREATE_COLUMN1 = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Create Column2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_CREATE_COL__CREATE_COLUMN2 = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Create Col</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_CREATE_COL_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveToInitImpl <em>Pojo Attribute Directive To Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveToInitImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveToInit()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_TO_INIT = 80;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive To Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_TO_INIT_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumInitImpl <em>Pojo Attribute Directive Enum Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumInitImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveEnumInit()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_ENUM_INIT = 81;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Enum Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_ENUM_INIT_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIsDefImpl <em>Pojo Attribute Directive Is Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIsDefImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveIsDef()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_IS_DEF = 82;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Is Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_IS_DEF_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumDefImpl <em>Pojo Attribute Directive Enum Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumDefImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveEnumDef()
   * @generated
   */
  int POJO_ATTRIBUTE_DIRECTIVE_ENUM_DEF = 83;

  /**
   * The number of structural features of the '<em>Pojo Attribute Directive Enum Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ATTRIBUTE_DIRECTIVE_ENUM_DEF_FEATURE_COUNT = POJO_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EnumDirectiveSerializableImpl <em>Enum Directive Serializable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EnumDirectiveSerializableImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumDirectiveSerializable()
   * @generated
   */
  int ENUM_DIRECTIVE_SERIALIZABLE = 84;

  /**
   * The feature id for the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DIRECTIVE_SERIALIZABLE__SERNUM = ENUM_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Directive Serializable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DIRECTIVE_SERIALIZABLE_FEATURE_COUNT = ENUM_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveValuesImpl <em>Enum Attribute Directive Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveValuesImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttributeDirectiveValues()
   * @generated
   */
  int ENUM_ATTRIBUTE_DIRECTIVE_VALUES = 85;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_DIRECTIVE_VALUES__VALUES = ENUM_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Attribute Directive Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_DIRECTIVE_VALUES_FEATURE_COUNT = ENUM_ATTRIBUTE_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.FunctionCallQueryImpl <em>Function Call Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.FunctionCallQueryImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionCallQuery()
   * @generated
   */
  int FUNCTION_CALL_QUERY = 86;

  /**
   * The number of structural features of the '<em>Function Call Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_QUERY_FEATURE_COUNT = FUN_PROC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ProcedureCallQueryImpl <em>Procedure Call Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ProcedureCallQueryImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedureCallQuery()
   * @generated
   */
  int PROCEDURE_CALL_QUERY = 87;

  /**
   * The number of structural features of the '<em>Procedure Call Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL_QUERY_FEATURE_COUNT = FUN_PROC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.FunctionCallImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 88;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = FUN_PROC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.ProcedureUpdateImpl <em>Procedure Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.ProcedureUpdateImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedureUpdate()
   * @generated
   */
  int PROCEDURE_UPDATE = 89;

  /**
   * The number of structural features of the '<em>Procedure Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_UPDATE_FEATURE_COUNT = FUN_PROC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.FunctionQueryImpl <em>Function Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.FunctionQueryImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionQuery()
   * @generated
   */
  int FUNCTION_QUERY = 90;

  /**
   * The number of structural features of the '<em>Function Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_QUERY_FEATURE_COUNT = FUN_PROC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveSerializableImpl <em>Dao Directive Serializable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoDirectiveSerializableImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveSerializable()
   * @generated
   */
  int DAO_DIRECTIVE_SERIALIZABLE = 91;

  /**
   * The feature id for the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_SERIALIZABLE__SERNUM = DAO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dao Directive Serializable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_SERIALIZABLE_FEATURE_COUNT = DAO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveDiscriminatorImpl <em>Dao Directive Discriminator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoDirectiveDiscriminatorImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveDiscriminator()
   * @generated
   */
  int DAO_DIRECTIVE_DISCRIMINATOR = 92;

  /**
   * The feature id for the '<em><b>Ancestor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_DISCRIMINATOR__ANCESTOR = DAO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Descendants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_DISCRIMINATOR__DESCENDANTS = DAO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dao Directive Discriminator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_DISCRIMINATOR_FEATURE_COUNT = DAO_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveCrudImpl <em>Dao Directive Crud</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoDirectiveCrudImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveCrud()
   * @generated
   */
  int DAO_DIRECTIVE_CRUD = 93;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_CRUD__POJO = DAO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dao Directive Crud</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_CRUD_FEATURE_COUNT = DAO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveQueryImpl <em>Dao Directive Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoDirectiveQueryImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveQuery()
   * @generated
   */
  int DAO_DIRECTIVE_QUERY = 94;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_QUERY__POJO = DAO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dao Directive Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_QUERY_FEATURE_COUNT = DAO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoFunProcDirectiveImpl <em>Dao Fun Proc Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoFunProcDirectiveImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoFunProcDirective()
   * @generated
   */
  int DAO_FUN_PROC_DIRECTIVE = 95;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_FUN_PROC_DIRECTIVE__TYPE = DAO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_FUN_PROC_DIRECTIVE__PARAMLIST = DAO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dao Fun Proc Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_FUN_PROC_DIRECTIVE_FEATURE_COUNT = DAO_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectivePojoImpl <em>Dao Directive Pojo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.DaoDirectivePojoImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectivePojo()
   * @generated
   */
  int DAO_DIRECTIVE_POJO = 96;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_POJO__POJO = DAO_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dao Directive Pojo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAO_DIRECTIVE_POJO_FEATURE_COUNT = DAO_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveConflictImpl <em>Annotation Directive Conflict</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveConflictImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveConflict()
   * @generated
   */
  int ANNOTATION_DIRECTIVE_CONFLICT = 97;

  /**
   * The number of structural features of the '<em>Annotation Directive Conflict</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_CONFLICT_FEATURE_COUNT = ANNOTATION_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveStaticImpl <em>Annotation Directive Static</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveStaticImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveStatic()
   * @generated
   */
  int ANNOTATION_DIRECTIVE_STATIC = 98;

  /**
   * The number of structural features of the '<em>Annotation Directive Static</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_STATIC_FEATURE_COUNT = ANNOTATION_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveConstructorImpl <em>Annotation Directive Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveConstructorImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveConstructor()
   * @generated
   */
  int ANNOTATION_DIRECTIVE_CONSTRUCTOR = 99;

  /**
   * The number of structural features of the '<em>Annotation Directive Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_CONSTRUCTOR_FEATURE_COUNT = ANNOTATION_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveStandardImpl <em>Annotation Directive Standard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveStandardImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveStandard()
   * @generated
   */
  int ANNOTATION_DIRECTIVE_STANDARD = 100;

  /**
   * The number of structural features of the '<em>Annotation Directive Standard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_STANDARD_FEATURE_COUNT = ANNOTATION_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveSetterImpl <em>Annotation Directive Setter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveSetterImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveSetter()
   * @generated
   */
  int ANNOTATION_DIRECTIVE_SETTER = 101;

  /**
   * The number of structural features of the '<em>Annotation Directive Setter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_SETTER_FEATURE_COUNT = ANNOTATION_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveGetterImpl <em>Annotation Directive Getter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveGetterImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveGetter()
   * @generated
   */
  int ANNOTATION_DIRECTIVE_GETTER = 102;

  /**
   * The number of structural features of the '<em>Annotation Directive Getter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_GETTER_FEATURE_COUNT = ANNOTATION_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveAttributeImpl <em>Annotation Directive Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveAttributeImpl
   * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveAttribute()
   * @generated
   */
  int ANNOTATION_DIRECTIVE_ATTRIBUTE = 103;

  /**
   * The number of structural features of the '<em>Annotation Directive Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DIRECTIVE_ATTRIBUTE_FEATURE_COUNT = ANNOTATION_DIRECTIVE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.Artifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifacts</em>'.
   * @see org.sqlproc.model.processorModel.Artifacts
   * @generated
   */
  EClass getArtifacts();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Artifacts#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.sqlproc.model.processorModel.Artifacts#getProperties()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Artifacts#getPojos <em>Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pojos</em>'.
   * @see org.sqlproc.model.processorModel.Artifacts#getPojos()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Pojos();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Artifacts#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see org.sqlproc.model.processorModel.Artifacts#getTables()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Tables();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Artifacts#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see org.sqlproc.model.processorModel.Artifacts#getProcedures()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Procedures();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Artifacts#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.sqlproc.model.processorModel.Artifacts#getFunctions()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Artifacts#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see org.sqlproc.model.processorModel.Artifacts#getPackages()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Packages();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Type</em>'.
   * @see org.sqlproc.model.processorModel.ValueType
   * @generated
   */
  EClass getValueType();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ValueType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.sqlproc.model.processorModel.ValueType#getValue()
   * @see #getValueType()
   * @generated
   */
  EAttribute getValueType_Value();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ValueType#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.sqlproc.model.processorModel.ValueType#getNumber()
   * @see #getValueType()
   * @generated
   */
  EAttribute getValueType_Number();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ValueType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.sqlproc.model.processorModel.ValueType#getId()
   * @see #getValueType()
   * @generated
   */
  EAttribute getValueType_Id();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DatabaseCatalogAssignement <em>Database Catalog Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Catalog Assignement</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseCatalogAssignement
   * @generated
   */
  EClass getDatabaseCatalogAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DatabaseCatalogAssignement#getDbCatalog <em>Db Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Catalog</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseCatalogAssignement#getDbCatalog()
   * @see #getDatabaseCatalogAssignement()
   * @generated
   */
  EAttribute getDatabaseCatalogAssignement_DbCatalog();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DatabaseSchemaAssignement <em>Database Schema Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Schema Assignement</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseSchemaAssignement
   * @generated
   */
  EClass getDatabaseSchemaAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DatabaseSchemaAssignement#getDbSchema <em>Db Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Schema</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseSchemaAssignement#getDbSchema()
   * @see #getDatabaseSchemaAssignement()
   * @generated
   */
  EAttribute getDatabaseSchemaAssignement_DbSchema();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DatabaseTypeAssignement <em>Database Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Type Assignement</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseTypeAssignement
   * @generated
   */
  EClass getDatabaseTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DatabaseTypeAssignement#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Type</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseTypeAssignement#getDbType()
   * @see #getDatabaseTypeAssignement()
   * @generated
   */
  EAttribute getDatabaseTypeAssignement_DbType();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement <em>Database Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Meta Info Assignement</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement
   * @generated
   */
  EClass getDatabaseMetaInfoAssignement();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement#getDbMetaInfo <em>Db Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Meta Info</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement#getDbMetaInfo()
   * @see #getDatabaseMetaInfoAssignement()
   * @generated
   */
  EReference getDatabaseMetaInfoAssignement_DbMetaInfo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DriverMetaInfoAssignement <em>Driver Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Driver Meta Info Assignement</em>'.
   * @see org.sqlproc.model.processorModel.DriverMetaInfoAssignement
   * @generated
   */
  EClass getDriverMetaInfoAssignement();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DriverMetaInfoAssignement#getDbDriverInfo <em>Db Driver Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Driver Info</em>'.
   * @see org.sqlproc.model.processorModel.DriverMetaInfoAssignement#getDbDriverInfo()
   * @see #getDriverMetaInfoAssignement()
   * @generated
   */
  EReference getDriverMetaInfoAssignement_DbDriverInfo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement <em>Driver Method Output Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Driver Method Output Assignement</em>'.
   * @see org.sqlproc.model.processorModel.DriverMethodOutputAssignement
   * @generated
   */
  EClass getDriverMethodOutputAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getDriverMethod <em>Driver Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Driver Method</em>'.
   * @see org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getDriverMethod()
   * @see #getDriverMethodOutputAssignement()
   * @generated
   */
  EAttribute getDriverMethodOutputAssignement_DriverMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getCallOutput <em>Call Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call Output</em>'.
   * @see org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getCallOutput()
   * @see #getDriverMethodOutputAssignement()
   * @generated
   */
  EReference getDriverMethodOutputAssignement_CallOutput();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.SqlTypeAssignement <em>Sql Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sql Type Assignement</em>'.
   * @see org.sqlproc.model.processorModel.SqlTypeAssignement
   * @generated
   */
  EClass getSqlTypeAssignement();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.SqlTypeAssignement#getSqlType <em>Sql Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sql Type</em>'.
   * @see org.sqlproc.model.processorModel.SqlTypeAssignement#getSqlType()
   * @see #getSqlTypeAssignement()
   * @generated
   */
  EReference getSqlTypeAssignement_SqlType();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.SqlTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.SqlTypeAssignement#getType()
   * @see #getSqlTypeAssignement()
   * @generated
   */
  EReference getSqlTypeAssignement_Type();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ColumnTypeAssignement <em>Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Type Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ColumnTypeAssignement
   * @generated
   */
  EClass getColumnTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ColumnTypeAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.model.processorModel.ColumnTypeAssignement#getDbColumn()
   * @see #getColumnTypeAssignement()
   * @generated
   */
  EAttribute getColumnTypeAssignement_DbColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.ColumnTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.ColumnTypeAssignement#getType()
   * @see #getColumnTypeAssignement()
   * @generated
   */
  EReference getColumnTypeAssignement_Type();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ShowColumnTypeAssignement <em>Show Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Column Type Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ShowColumnTypeAssignement
   * @generated
   */
  EClass getShowColumnTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ShowColumnTypeAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.model.processorModel.ShowColumnTypeAssignement#getDbColumn()
   * @see #getShowColumnTypeAssignement()
   * @generated
   */
  EAttribute getShowColumnTypeAssignement_DbColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.ShowColumnTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.ShowColumnTypeAssignement#getType()
   * @see #getShowColumnTypeAssignement()
   * @generated
   */
  EReference getShowColumnTypeAssignement_Type();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.TableAssignement <em>Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Assignement</em>'.
   * @see org.sqlproc.model.processorModel.TableAssignement
   * @generated
   */
  EClass getTableAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.TableAssignement#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.model.processorModel.TableAssignement#getDbTable()
   * @see #getTableAssignement()
   * @generated
   */
  EAttribute getTableAssignement_DbTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.TableAssignement#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see org.sqlproc.model.processorModel.TableAssignement#getNewName()
   * @see #getTableAssignement()
   * @generated
   */
  EAttribute getTableAssignement_NewName();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.JoinTableAssignement <em>Join Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Table Assignement</em>'.
   * @see org.sqlproc.model.processorModel.JoinTableAssignement
   * @generated
   */
  EClass getJoinTableAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.JoinTableAssignement#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.model.processorModel.JoinTableAssignement#getDbTable()
   * @see #getJoinTableAssignement()
   * @generated
   */
  EAttribute getJoinTableAssignement_DbTable();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.JoinTableAssignement#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.JoinTableAssignement#getDbTables()
   * @see #getJoinTableAssignement()
   * @generated
   */
  EAttribute getJoinTableAssignement_DbTables();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ColumnAssignement <em>Column Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ColumnAssignement
   * @generated
   */
  EClass getColumnAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ColumnAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.model.processorModel.ColumnAssignement#getDbColumn()
   * @see #getColumnAssignement()
   * @generated
   */
  EAttribute getColumnAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ColumnAssignement#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see org.sqlproc.model.processorModel.ColumnAssignement#getNewName()
   * @see #getColumnAssignement()
   * @generated
   */
  EAttribute getColumnAssignement_NewName();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImportAssignement <em>Import Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ImportAssignement
   * @generated
   */
  EClass getImportAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ImportAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.model.processorModel.ImportAssignement#getDbColumn()
   * @see #getImportAssignement()
   * @generated
   */
  EAttribute getImportAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ImportAssignement#getPkTable <em>Pk Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Table</em>'.
   * @see org.sqlproc.model.processorModel.ImportAssignement#getPkTable()
   * @see #getImportAssignement()
   * @generated
   */
  EAttribute getImportAssignement_PkTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ImportAssignement#getPkColumn <em>Pk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Column</em>'.
   * @see org.sqlproc.model.processorModel.ImportAssignement#getPkColumn()
   * @see #getImportAssignement()
   * @generated
   */
  EAttribute getImportAssignement_PkColumn();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ExportAssignement <em>Export Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ExportAssignement
   * @generated
   */
  EClass getExportAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ExportAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.model.processorModel.ExportAssignement#getDbColumn()
   * @see #getExportAssignement()
   * @generated
   */
  EAttribute getExportAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ExportAssignement#getFkTable <em>Fk Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fk Table</em>'.
   * @see org.sqlproc.model.processorModel.ExportAssignement#getFkTable()
   * @see #getExportAssignement()
   * @generated
   */
  EAttribute getExportAssignement_FkTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ExportAssignement#getFkColumn <em>Fk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fk Column</em>'.
   * @see org.sqlproc.model.processorModel.ExportAssignement#getFkColumn()
   * @see #getExportAssignement()
   * @generated
   */
  EAttribute getExportAssignement_FkColumn();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.InheritanceAssignement <em>Inheritance Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance Assignement</em>'.
   * @see org.sqlproc.model.processorModel.InheritanceAssignement
   * @generated
   */
  EClass getInheritanceAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.InheritanceAssignement#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator</em>'.
   * @see org.sqlproc.model.processorModel.InheritanceAssignement#getDiscriminator()
   * @see #getInheritanceAssignement()
   * @generated
   */
  EAttribute getInheritanceAssignement_Discriminator();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.InheritanceAssignement#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.model.processorModel.InheritanceAssignement#getDbTable()
   * @see #getInheritanceAssignement()
   * @generated
   */
  EAttribute getInheritanceAssignement_DbTable();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.InheritanceAssignement#getDbColumns <em>Db Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Columns</em>'.
   * @see org.sqlproc.model.processorModel.InheritanceAssignement#getDbColumns()
   * @see #getInheritanceAssignement()
   * @generated
   */
  EAttribute getInheritanceAssignement_DbColumns();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ManyToManyAssignement <em>Many To Many Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many To Many Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ManyToManyAssignement
   * @generated
   */
  EClass getManyToManyAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ManyToManyAssignement#getPkColumn <em>Pk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Column</em>'.
   * @see org.sqlproc.model.processorModel.ManyToManyAssignement#getPkColumn()
   * @see #getManyToManyAssignement()
   * @generated
   */
  EAttribute getManyToManyAssignement_PkColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ManyToManyAssignement#getPkTable <em>Pk Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Table</em>'.
   * @see org.sqlproc.model.processorModel.ManyToManyAssignement#getPkTable()
   * @see #getManyToManyAssignement()
   * @generated
   */
  EAttribute getManyToManyAssignement_PkTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ManyToManyAssignement#getFkColumn <em>Fk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fk Column</em>'.
   * @see org.sqlproc.model.processorModel.ManyToManyAssignement#getFkColumn()
   * @see #getManyToManyAssignement()
   * @generated
   */
  EAttribute getManyToManyAssignement_FkColumn();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DebugLevelAssignement <em>Debug Level Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Debug Level Assignement</em>'.
   * @see org.sqlproc.model.processorModel.DebugLevelAssignement
   * @generated
   */
  EClass getDebugLevelAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DebugLevelAssignement#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see org.sqlproc.model.processorModel.DebugLevelAssignement#getDebug()
   * @see #getDebugLevelAssignement()
   * @generated
   */
  EAttribute getDebugLevelAssignement_Debug();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DebugLevelAssignement#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see org.sqlproc.model.processorModel.DebugLevelAssignement#getScope()
   * @see #getDebugLevelAssignement()
   * @generated
   */
  EAttribute getDebugLevelAssignement_Scope();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ProcedurePojoAssignement <em>Procedure Pojo Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Pojo Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ProcedurePojoAssignement
   * @generated
   */
  EClass getProcedurePojoAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ProcedurePojoAssignement#getDbProcedure <em>Db Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Procedure</em>'.
   * @see org.sqlproc.model.processorModel.ProcedurePojoAssignement#getDbProcedure()
   * @see #getProcedurePojoAssignement()
   * @generated
   */
  EAttribute getProcedurePojoAssignement_DbProcedure();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.ProcedurePojoAssignement#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pojo</em>'.
   * @see org.sqlproc.model.processorModel.ProcedurePojoAssignement#getPojo()
   * @see #getProcedurePojoAssignement()
   * @generated
   */
  EReference getProcedurePojoAssignement_Pojo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.FunctionPojoAssignement <em>Function Pojo Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Pojo Assignement</em>'.
   * @see org.sqlproc.model.processorModel.FunctionPojoAssignement
   * @generated
   */
  EClass getFunctionPojoAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.FunctionPojoAssignement#getDbFunction <em>Db Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Function</em>'.
   * @see org.sqlproc.model.processorModel.FunctionPojoAssignement#getDbFunction()
   * @see #getFunctionPojoAssignement()
   * @generated
   */
  EAttribute getFunctionPojoAssignement_DbFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.FunctionPojoAssignement#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pojo</em>'.
   * @see org.sqlproc.model.processorModel.FunctionPojoAssignement#getPojo()
   * @see #getFunctionPojoAssignement()
   * @generated
   */
  EReference getFunctionPojoAssignement_Pojo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsAssignement <em>Implements Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignement
   * @generated
   */
  EClass getImplementsAssignement();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.ImplementsAssignement#getToImplement <em>To Implement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Implement</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignement#getToImplement()
   * @see #getImplementsAssignement()
   * @generated
   */
  EReference getImplementsAssignement_ToImplement();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ImplementsAssignement#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignement#getDbTables()
   * @see #getImplementsAssignement()
   * @generated
   */
  EAttribute getImplementsAssignement_DbTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ImplementsAssignement#getDbNotTables <em>Db Not Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Not Tables</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignement#getDbNotTables()
   * @see #getImplementsAssignement()
   * @generated
   */
  EAttribute getImplementsAssignement_DbNotTables();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ExtendsAssignement <em>Extends Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends Assignement</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignement
   * @generated
   */
  EClass getExtendsAssignement();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.ExtendsAssignement#getToExtends <em>To Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Extends</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignement#getToExtends()
   * @see #getExtendsAssignement()
   * @generated
   */
  EReference getExtendsAssignement_ToExtends();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ExtendsAssignement#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignement#getDbTables()
   * @see #getExtendsAssignement()
   * @generated
   */
  EAttribute getExtendsAssignement_DbTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ExtendsAssignement#getDbNotTables <em>Db Not Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Not Tables</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignement#getDbNotTables()
   * @see #getExtendsAssignement()
   * @generated
   */
  EAttribute getExtendsAssignement_DbNotTables();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsAssignementGenerics <em>Implements Assignement Generics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Assignement Generics</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignementGenerics
   * @generated
   */
  EClass getImplementsAssignementGenerics();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.ImplementsAssignementGenerics#getToImplement <em>To Implement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Implement</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignementGenerics#getToImplement()
   * @see #getImplementsAssignementGenerics()
   * @generated
   */
  EReference getImplementsAssignementGenerics_ToImplement();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ImplementsAssignementGenerics#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignementGenerics#getDbTables()
   * @see #getImplementsAssignementGenerics()
   * @generated
   */
  EAttribute getImplementsAssignementGenerics_DbTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ImplementsAssignementGenerics#getDbNotTables <em>Db Not Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Not Tables</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsAssignementGenerics#getDbNotTables()
   * @see #getImplementsAssignementGenerics()
   * @generated
   */
  EAttribute getImplementsAssignementGenerics_DbNotTables();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ExtendsAssignementGenerics <em>Extends Assignement Generics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends Assignement Generics</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignementGenerics
   * @generated
   */
  EClass getExtendsAssignementGenerics();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.ExtendsAssignementGenerics#getToExtends <em>To Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Extends</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignementGenerics#getToExtends()
   * @see #getExtendsAssignementGenerics()
   * @generated
   */
  EReference getExtendsAssignementGenerics_ToExtends();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ExtendsAssignementGenerics#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignementGenerics#getDbTables()
   * @see #getExtendsAssignementGenerics()
   * @generated
   */
  EAttribute getExtendsAssignementGenerics_DbTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.ExtendsAssignementGenerics#getDbNotTables <em>Db Not Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Not Tables</em>'.
   * @see org.sqlproc.model.processorModel.ExtendsAssignementGenerics#getDbNotTables()
   * @see #getExtendsAssignementGenerics()
   * @generated
   */
  EAttribute getExtendsAssignementGenerics_DbNotTables();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PropertyCondition <em>Property Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Condition</em>'.
   * @see org.sqlproc.model.processorModel.PropertyCondition
   * @generated
   */
  EClass getPropertyCondition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PropertyCondition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.PropertyCondition#getName()
   * @see #getPropertyCondition()
   * @generated
   */
  EAttribute getPropertyCondition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PropertyCondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.sqlproc.model.processorModel.PropertyCondition#getValue()
   * @see #getPropertyCondition()
   * @generated
   */
  EReference getPropertyCondition_Value();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.sqlproc.model.processorModel.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Property#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.sqlproc.model.processorModel.Property#getCondition()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Property#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see org.sqlproc.model.processorModel.Property#getDatabase()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Database();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Property#getPojogen <em>Pojogen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pojogen</em>'.
   * @see org.sqlproc.model.processorModel.Property#getPojogen()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Pojogen();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Property#getMetagen <em>Metagen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metagen</em>'.
   * @see org.sqlproc.model.processorModel.Property#getMetagen()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Metagen();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Property#getDaogen <em>Daogen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Daogen</em>'.
   * @see org.sqlproc.model.processorModel.Property#getDaogen()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Daogen();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.Property#getReplaceId <em>Replace Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replace Id</em>'.
   * @see org.sqlproc.model.processorModel.Property#getReplaceId()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_ReplaceId();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Property#getRegex <em>Regex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Regex</em>'.
   * @see org.sqlproc.model.processorModel.Property#getRegex()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Regex();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Property#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see org.sqlproc.model.processorModel.Property#getReplacement()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Replacement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DatabaseProperty <em>Database Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Property</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty
   * @generated
   */
  EClass getDatabaseProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DatabaseProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getName()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbUrl <em>Db Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Url</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbUrl()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbUrl();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbUsername <em>Db Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Username</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbUsername()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbUsername();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbPassword <em>Db Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Password</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbPassword()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbPassword();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbCatalog <em>Db Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Catalog</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbCatalog()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbCatalog();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbSchema <em>Db Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Schema</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbSchema()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbSchema();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverx <em>Db Driverx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Driverx</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverx()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbDriverx();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriver <em>Db Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Driver</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbDriver()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbDriver();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteBefore <em>Db Execute Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Execute Before</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteBefore()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbExecuteBefore();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteAfter <em>Db Execute After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Execute After</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteAfter()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbExecuteAfter();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbIndexTypes <em>Db Index Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Index Types</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbIndexTypes()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbIndexTypes();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Type</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbType()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbType();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbMetaInfo <em>Db Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Meta Info</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbMetaInfo()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbMetaInfo();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverInfo <em>Db Driver Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Driver Info</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverInfo()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbDriverInfo();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbMethodsCalls <em>Db Methods Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Db Methods Calls</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDbMethodsCalls()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbMethodsCalls();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.model.processorModel.DatabaseProperty#getDebug()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_Debug();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojogenProperty <em>Pojogen Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojogen Property</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty
   * @generated
   */
  EClass getPojogenProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getName()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getSqlTypes <em>Sql Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sql Types</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getSqlTypes()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_SqlTypes();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbTable()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbTable();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getColumnTypes <em>Column Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column Types</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getColumnTypes()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ColumnTypes();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbProcedure <em>Db Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Procedure</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbProcedure()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbProcedure();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbFunction <em>Db Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Function</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbFunction()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojogenProperty#getColumnType <em>Column Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Type</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getColumnType()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ColumnType();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbTables()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbTables();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getJoinTables <em>Join Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Tables</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getJoinTables()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_JoinTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbColumns <em>Db Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Columns</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbColumns()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbColumns();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getTables()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Tables();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getColumns()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getExports <em>Exports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exports</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getExports()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Exports();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getImports()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getMany2s <em>Many2s</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Many2s</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getMany2s()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Many2s();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbColumn()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getInheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inheritance</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getInheritance()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Inheritance();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.PojogenProperty#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Methods</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getMethods()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_Methods();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getOperatorsSuffix <em>Operators Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operators Suffix</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getOperatorsSuffix()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_OperatorsSuffix();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojogenProperty#getToImplements <em>To Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Implements</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getToImplements()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ToImplements();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojogenProperty#getToExtends <em>To Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Extends</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getToExtends()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ToExtends();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojogenProperty#getToImplementsGenerics <em>To Implements Generics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Implements Generics</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getToImplementsGenerics()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ToImplementsGenerics();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojogenProperty#getToExtendsGenerics <em>To Extends Generics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Extends Generics</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getToExtendsGenerics()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ToExtendsGenerics();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getVersion()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_Version();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbNotTables <em>Db Not Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Not Tables</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbNotTables()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbNotTables();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojogenProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDebug()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Debug();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getProcPojos <em>Proc Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Proc Pojos</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getProcPojos()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ProcPojos();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojogenProperty#getFunPojos <em>Fun Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fun Pojos</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getFunPojos()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_FunPojos();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojogenProperty#getActiveFilter <em>Active Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Filter</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getActiveFilter()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ActiveFilter();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getPckg <em>Pckg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pckg</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getPckg()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_Pckg();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojogenProperty#getEnumName <em>Enum Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum Name</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getEnumName()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_EnumName();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbCheckConstraints <em>Db Check Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Check Constraints</em>'.
   * @see org.sqlproc.model.processorModel.PojogenProperty#getDbCheckConstraints()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbCheckConstraints();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.MetaTypeAssignement <em>Meta Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Type Assignement</em>'.
   * @see org.sqlproc.model.processorModel.MetaTypeAssignement
   * @generated
   */
  EClass getMetaTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetaTypeAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.model.processorModel.MetaTypeAssignement#getDbColumn()
   * @see #getMetaTypeAssignement()
   * @generated
   */
  EAttribute getMetaTypeAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetaTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.MetaTypeAssignement#getType()
   * @see #getMetaTypeAssignement()
   * @generated
   */
  EAttribute getMetaTypeAssignement_Type();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetaTypeAssignement#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see org.sqlproc.model.processorModel.MetaTypeAssignement#getExtension()
   * @see #getMetaTypeAssignement()
   * @generated
   */
  EAttribute getMetaTypeAssignement_Extension();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.MetagenProperty <em>Metagen Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metagen Property</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty
   * @generated
   */
  EClass getMetagenProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getName()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequence</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getSequence()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Sequence();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getType()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDbTables()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbNotTables <em>Db Not Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Not Tables</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDbNotTables()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbNotTables();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDbTable()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getIdentity <em>Identity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identity</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getIdentity()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Identity();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.MetagenProperty#getMetaTypes <em>Meta Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Types</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getMetaTypes()
   * @see #getMetagenProperty()
   * @generated
   */
  EReference getMetagenProperty_MetaTypes();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbStatement <em>Db Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Statement</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDbStatement()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbStatement();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbColumns <em>Db Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Columns</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDbColumns()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbColumns();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbFunction <em>Db Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Function</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDbFunction()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbFunction();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbProcedure <em>Db Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Procedure</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDbProcedure()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbProcedure();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.MetagenProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getDebug()
   * @see #getMetagenProperty()
   * @generated
   */
  EReference getMetagenProperty_Debug();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.MetagenProperty#getOptionalFeatures <em>Optional Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Optional Features</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getOptionalFeatures()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_OptionalFeatures();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.MetagenProperty#getActiveFilter <em>Active Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Filter</em>'.
   * @see org.sqlproc.model.processorModel.MetagenProperty#getActiveFilter()
   * @see #getMetagenProperty()
   * @generated
   */
  EReference getMetagenProperty_ActiveFilter();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaogenProperty <em>Daogen Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daogen Property</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty
   * @generated
   */
  EClass getDaogenProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DaogenProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getName()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.model.processorModel.DaogenProperty#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getDbTables()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_DbTables();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaogenProperty#getToImplements <em>To Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Implements</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getToImplements()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ToImplements();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaogenProperty#getToExtends <em>To Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Extends</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getToExtends()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ToExtends();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaogenProperty#getToImplementsGenerics <em>To Implements Generics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Implements Generics</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getToImplementsGenerics()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ToImplementsGenerics();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaogenProperty#getToExtendsGenerics <em>To Extends Generics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Extends Generics</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getToExtendsGenerics()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ToExtendsGenerics();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DaogenProperty#getDbFunction <em>Db Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Function</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getDbFunction()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_DbFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaogenProperty#getResultType <em>Result Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Type</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getResultType()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ResultType();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaogenProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getDebug()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_Debug();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaogenProperty#getActiveFilter <em>Active Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Filter</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getActiveFilter()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ActiveFilter();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DaogenProperty#getPckg <em>Pckg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pckg</em>'.
   * @see org.sqlproc.model.processorModel.DaogenProperty#getPckg()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_Pckg();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDefinition <em>Pojo Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Definition</em>'.
   * @see org.sqlproc.model.processorModel.PojoDefinition
   * @generated
   */
  EClass getPojoDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.PojoDefinition#getName()
   * @see #getPojoDefinition()
   * @generated
   */
  EAttribute getPojoDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoDefinition#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.sqlproc.model.processorModel.PojoDefinition#getClass_()
   * @see #getPojoDefinition()
   * @generated
   */
  EAttribute getPojoDefinition_Class();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoDefinition#getClassx <em>Classx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classx</em>'.
   * @see org.sqlproc.model.processorModel.PojoDefinition#getClassx()
   * @see #getPojoDefinition()
   * @generated
   */
  EReference getPojoDefinition_Classx();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Definition</em>'.
   * @see org.sqlproc.model.processorModel.TableDefinition
   * @generated
   */
  EClass getTableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.TableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.TableDefinition#getName()
   * @see #getTableDefinition()
   * @generated
   */
  EAttribute getTableDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.TableDefinition#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.sqlproc.model.processorModel.TableDefinition#getTable()
   * @see #getTableDefinition()
   * @generated
   */
  EAttribute getTableDefinition_Table();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ProcedureDefinition <em>Procedure Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Definition</em>'.
   * @see org.sqlproc.model.processorModel.ProcedureDefinition
   * @generated
   */
  EClass getProcedureDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ProcedureDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.ProcedureDefinition#getName()
   * @see #getProcedureDefinition()
   * @generated
   */
  EAttribute getProcedureDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.ProcedureDefinition#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.sqlproc.model.processorModel.ProcedureDefinition#getTable()
   * @see #getProcedureDefinition()
   * @generated
   */
  EAttribute getProcedureDefinition_Table();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see org.sqlproc.model.processorModel.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.FunctionDefinition#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.sqlproc.model.processorModel.FunctionDefinition#getTable()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Table();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.sqlproc.model.processorModel.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Package#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see org.sqlproc.model.processorModel.Package#getImportSection()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Package#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.sqlproc.model.processorModel.Package#getElements()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Elements();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AbstractEntity <em>Abstract Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Entity</em>'.
   * @see org.sqlproc.model.processorModel.AbstractEntity
   * @generated
   */
  EClass getAbstractEntity();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirective <em>Implements Extends Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Extends Directive</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirective
   * @generated
   */
  EClass getImplementsExtendsDirective();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.Implements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements</em>'.
   * @see org.sqlproc.model.processorModel.Implements
   * @generated
   */
  EClass getImplements();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Implements#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.Implements#getDirectives()
   * @see #getImplements()
   * @generated
   */
  EReference getImplements_Directives();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Implements#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implements</em>'.
   * @see org.sqlproc.model.processorModel.Implements#getImplements()
   * @see #getImplements()
   * @generated
   */
  EReference getImplements_Implements();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.Extends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends</em>'.
   * @see org.sqlproc.model.processorModel.Extends
   * @generated
   */
  EClass getExtends();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Extends#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.Extends#getDirectives()
   * @see #getExtends()
   * @generated
   */
  EReference getExtends_Directives();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Extends#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see org.sqlproc.model.processorModel.Extends#getExtends()
   * @see #getExtends()
   * @generated
   */
  EReference getExtends_Extends();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotatedEntity <em>Annotated Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Entity</em>'.
   * @see org.sqlproc.model.processorModel.AnnotatedEntity
   * @generated
   */
  EClass getAnnotatedEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.AnnotatedEntity#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.sqlproc.model.processorModel.AnnotatedEntity#getAnnotations()
   * @see #getAnnotatedEntity()
   * @generated
   */
  EReference getAnnotatedEntity_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.AnnotatedEntity#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see org.sqlproc.model.processorModel.AnnotatedEntity#getEntity()
   * @see #getAnnotatedEntity()
   * @generated
   */
  EReference getAnnotatedEntity_Entity();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.sqlproc.model.processorModel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.Entity#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.sqlproc.model.processorModel.Entity#isFinal()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Final();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Entity#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see org.sqlproc.model.processorModel.Entity#getProcedures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Procedures();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DirectiveProperties <em>Directive Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directive Properties</em>'.
   * @see org.sqlproc.model.processorModel.DirectiveProperties
   * @generated
   */
  EClass getDirectiveProperties();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.model.processorModel.DirectiveProperties#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Features</em>'.
   * @see org.sqlproc.model.processorModel.DirectiveProperties#getFeatures()
   * @see #getDirectiveProperties()
   * @generated
   */
  EReference getDirectiveProperties_Features();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirective <em>Pojo Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirective
   * @generated
   */
  EClass getPojoDirective();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoEntity <em>Pojo Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Entity</em>'.
   * @see org.sqlproc.model.processorModel.PojoEntity
   * @generated
   */
  EClass getPojoEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojoEntity#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.PojoEntity#getDirectives()
   * @see #getPojoEntity()
   * @generated
   */
  EReference getPojoEntity_Directives();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoEntity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.sqlproc.model.processorModel.PojoEntity#isAbstract()
   * @see #getPojoEntity()
   * @generated
   */
  EAttribute getPojoEntity_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoEntity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.sqlproc.model.processorModel.PojoEntity#getSuperType()
   * @see #getPojoEntity()
   * @generated
   */
  EReference getPojoEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojoEntity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.sqlproc.model.processorModel.PojoEntity#getAttributes()
   * @see #getPojoEntity()
   * @generated
   */
  EReference getPojoEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirective <em>Pojo Attribute Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirective
   * @generated
   */
  EClass getPojoAttributeDirective();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttribute <em>Pojo Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute
   * @generated
   */
  EClass getPojoAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojoAttribute#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#getAnnotations()
   * @see #getPojoAttribute()
   * @generated
   */
  EReference getPojoAttribute_Annotations();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojoAttribute#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#getDirectives()
   * @see #getPojoAttribute()
   * @generated
   */
  EReference getPojoAttribute_Directives();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoAttribute#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#isFinal()
   * @see #getPojoAttribute()
   * @generated
   */
  EAttribute getPojoAttribute_Final();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoAttribute#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#isStatic()
   * @see #getPojoAttribute()
   * @generated
   */
  EAttribute getPojoAttribute_Static();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoAttribute#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#getKind()
   * @see #getPojoAttribute()
   * @generated
   */
  EAttribute getPojoAttribute_Kind();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#getType()
   * @see #getPojoAttribute()
   * @generated
   */
  EReference getPojoAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#getName()
   * @see #getPojoAttribute()
   * @generated
   */
  EAttribute getPojoAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoAttribute#getInitExpr <em>Init Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init Expr</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttribute#getInitExpr()
   * @see #getPojoAttribute()
   * @generated
   */
  EReference getPojoAttribute_InitExpr();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoProcedure <em>Pojo Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Procedure</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure
   * @generated
   */
  EClass getPojoProcedure();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojoProcedure#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure#getAnnotations()
   * @see #getPojoProcedure()
   * @generated
   */
  EReference getPojoProcedure_Annotations();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoProcedure#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure#isFinal()
   * @see #getPojoProcedure()
   * @generated
   */
  EAttribute getPojoProcedure_Final();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoProcedure#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure#isStatic()
   * @see #getPojoProcedure()
   * @generated
   */
  EAttribute getPojoProcedure_Static();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoProcedure#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure#getType()
   * @see #getPojoProcedure()
   * @generated
   */
  EReference getPojoProcedure_Type();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoProcedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure#getName()
   * @see #getPojoProcedure()
   * @generated
   */
  EAttribute getPojoProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.PojoProcedure#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure#getParams()
   * @see #getPojoProcedure()
   * @generated
   */
  EReference getPojoProcedure_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoProcedure#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.sqlproc.model.processorModel.PojoProcedure#getBody()
   * @see #getPojoProcedure()
   * @generated
   */
  EReference getPojoProcedure_Body();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.EnumDirective <em>Enum Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Directive</em>'.
   * @see org.sqlproc.model.processorModel.EnumDirective
   * @generated
   */
  EClass getEnumDirective();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.EnumEntity <em>Enum Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Entity</em>'.
   * @see org.sqlproc.model.processorModel.EnumEntity
   * @generated
   */
  EClass getEnumEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.EnumEntity#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.EnumEntity#getDirectives()
   * @see #getEnumEntity()
   * @generated
   */
  EReference getEnumEntity_Directives();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.EnumEntity#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see org.sqlproc.model.processorModel.EnumEntity#getAttribute()
   * @see #getEnumEntity()
   * @generated
   */
  EReference getEnumEntity_Attribute();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.EnumAttributeValue <em>Enum Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attribute Value</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttributeValue
   * @generated
   */
  EClass getEnumAttributeValue();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.EnumAttributeValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttributeValue#getName()
   * @see #getEnumAttributeValue()
   * @generated
   */
  EAttribute getEnumAttributeValue_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.EnumAttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttributeValue#getValue()
   * @see #getEnumAttributeValue()
   * @generated
   */
  EReference getEnumAttributeValue_Value();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.EnumAttributeDirective <em>Enum Attribute Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attribute Directive</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttributeDirective
   * @generated
   */
  EClass getEnumAttributeDirective();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.EnumAttribute <em>Enum Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attribute</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttribute
   * @generated
   */
  EClass getEnumAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.EnumAttribute#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttribute#getDirectives()
   * @see #getEnumAttribute()
   * @generated
   */
  EReference getEnumAttribute_Directives();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.EnumAttribute#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttribute#isFinal()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Final();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.EnumAttribute#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttribute#isStatic()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Static();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.EnumAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttribute#getType()
   * @see #getEnumAttribute()
   * @generated
   */
  EReference getEnumAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.EnumAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttribute#getName()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoDirectiveParameters <em>Dao Directive Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Directive Parameters</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveParameters
   * @generated
   */
  EClass getDaoDirectiveParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaoDirectiveParameters#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveParameters#getOut()
   * @see #getDaoDirectiveParameters()
   * @generated
   */
  EReference getDaoDirectiveParameters_Out();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.DaoDirectiveParameters#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveParameters#getIns()
   * @see #getDaoDirectiveParameters()
   * @generated
   */
  EReference getDaoDirectiveParameters_Ins();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DescendantAssignment <em>Descendant Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descendant Assignment</em>'.
   * @see org.sqlproc.model.processorModel.DescendantAssignment
   * @generated
   */
  EClass getDescendantAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DescendantAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.sqlproc.model.processorModel.DescendantAssignment#getValue()
   * @see #getDescendantAssignment()
   * @generated
   */
  EReference getDescendantAssignment_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DescendantAssignment#getDescendant <em>Descendant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Descendant</em>'.
   * @see org.sqlproc.model.processorModel.DescendantAssignment#getDescendant()
   * @see #getDescendantAssignment()
   * @generated
   */
  EReference getDescendantAssignment_Descendant();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.FunProcType <em>Fun Proc Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fun Proc Type</em>'.
   * @see org.sqlproc.model.processorModel.FunProcType
   * @generated
   */
  EClass getFunProcType();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoDirective <em>Dao Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Directive</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirective
   * @generated
   */
  EClass getDaoDirective();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoEntity <em>Dao Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Entity</em>'.
   * @see org.sqlproc.model.processorModel.DaoEntity
   * @generated
   */
  EClass getDaoEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.DaoEntity#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.DaoEntity#getDirectives()
   * @see #getDaoEntity()
   * @generated
   */
  EReference getDaoEntity_Directives();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DaoEntity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.sqlproc.model.processorModel.DaoEntity#isAbstract()
   * @see #getDaoEntity()
   * @generated
   */
  EAttribute getDaoEntity_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaoEntity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.sqlproc.model.processorModel.DaoEntity#getSuperType()
   * @see #getDaoEntity()
   * @generated
   */
  EReference getDaoEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.DaoEntity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.sqlproc.model.processorModel.DaoEntity#getAttributes()
   * @see #getDaoEntity()
   * @generated
   */
  EReference getDaoEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirective <em>Annotation Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirective
   * @generated
   */
  EClass getAnnotationDirective();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.sqlproc.model.processorModel.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.Annotation#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see org.sqlproc.model.processorModel.Annotation#getDirectives()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Directives();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.Annotation#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see org.sqlproc.model.processorModel.Annotation#getAnnotation()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Annotation();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveGenerics <em>Implements Extends Directive Generics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Extends Directive Generics</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveGenerics
   * @generated
   */
  EClass getImplementsExtendsDirectiveGenerics();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos <em>Implements Extends Directive Only Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Extends Directive Only Pojos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos
   * @generated
   */
  EClass getImplementsExtendsDirectiveOnlyPojos();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos#getOnlyPojos <em>Only Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Only Pojos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos#getOnlyPojos()
   * @see #getImplementsExtendsDirectiveOnlyPojos()
   * @generated
   */
  EReference getImplementsExtendsDirectiveOnlyPojos_OnlyPojos();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos <em>Implements Extends Directive Only Daos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Extends Directive Only Daos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos
   * @generated
   */
  EClass getImplementsExtendsDirectiveOnlyDaos();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos#getOnlyDaos <em>Only Daos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Only Daos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos#getOnlyDaos()
   * @see #getImplementsExtendsDirectiveOnlyDaos()
   * @generated
   */
  EReference getImplementsExtendsDirectiveOnlyDaos_OnlyDaos();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos <em>Implements Extends Directive Except Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Extends Directive Except Pojos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos
   * @generated
   */
  EClass getImplementsExtendsDirectiveExceptPojos();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos#getExceptPojos <em>Except Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Except Pojos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos#getExceptPojos()
   * @see #getImplementsExtendsDirectiveExceptPojos()
   * @generated
   */
  EReference getImplementsExtendsDirectiveExceptPojos_ExceptPojos();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos <em>Implements Extends Directive Except Daos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Extends Directive Except Daos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos
   * @generated
   */
  EClass getImplementsExtendsDirectiveExceptDaos();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos#getExceptDaos <em>Except Daos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Except Daos</em>'.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos#getExceptDaos()
   * @see #getImplementsExtendsDirectiveExceptDaos()
   * @generated
   */
  EReference getImplementsExtendsDirectiveExceptDaos_ExceptDaos();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirectiveToString <em>Pojo Directive To String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive To String</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveToString
   * @generated
   */
  EClass getPojoDirectiveToString();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoDirectiveToString#getProplist <em>Proplist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Proplist</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveToString#getProplist()
   * @see #getPojoDirectiveToString()
   * @generated
   */
  EReference getPojoDirectiveToString_Proplist();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirectiveIndex <em>Pojo Directive Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive Index</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveIndex
   * @generated
   */
  EClass getPojoDirectiveIndex();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoDirectiveIndex#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveIndex#getIndex()
   * @see #getPojoDirectiveIndex()
   * @generated
   */
  EAttribute getPojoDirectiveIndex_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoDirectiveIndex#getProplist <em>Proplist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Proplist</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveIndex#getProplist()
   * @see #getPojoDirectiveIndex()
   * @generated
   */
  EReference getPojoDirectiveIndex_Proplist();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirectiveOperators <em>Pojo Directive Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive Operators</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveOperators
   * @generated
   */
  EClass getPojoDirectiveOperators();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoDirectiveOperators#getOperatorsSuffix <em>Operators Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operators Suffix</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveOperators#getOperatorsSuffix()
   * @see #getPojoDirectiveOperators()
   * @generated
   */
  EAttribute getPojoDirectiveOperators_OperatorsSuffix();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirectiveSerializable <em>Pojo Directive Serializable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive Serializable</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveSerializable
   * @generated
   */
  EClass getPojoDirectiveSerializable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoDirectiveSerializable#getSernum <em>Sernum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sernum</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveSerializable#getSernum()
   * @see #getPojoDirectiveSerializable()
   * @generated
   */
  EAttribute getPojoDirectiveSerializable_Sernum();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirectiveDiscriminator <em>Pojo Directive Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive Discriminator</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveDiscriminator
   * @generated
   */
  EClass getPojoDirectiveDiscriminator();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoDirectiveDiscriminator#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveDiscriminator#getDiscriminator()
   * @see #getPojoDirectiveDiscriminator()
   * @generated
   */
  EAttribute getPojoDirectiveDiscriminator_Discriminator();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirectiveEquals <em>Pojo Directive Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive Equals</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveEquals
   * @generated
   */
  EClass getPojoDirectiveEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoDirectiveEquals#getProplist <em>Proplist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Proplist</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveEquals#getProplist()
   * @see #getPojoDirectiveEquals()
   * @generated
   */
  EReference getPojoDirectiveEquals_Proplist();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoDirectiveHashCode <em>Pojo Directive Hash Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Directive Hash Code</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveHashCode
   * @generated
   */
  EClass getPojoDirectiveHashCode();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.PojoDirectiveHashCode#getProplist <em>Proplist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Proplist</em>'.
   * @see org.sqlproc.model.processorModel.PojoDirectiveHashCode#getProplist()
   * @see #getPojoDirectiveHashCode()
   * @generated
   */
  EReference getPojoDirectiveHashCode_Proplist();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveRequired <em>Pojo Attribute Directive Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Required</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveRequired
   * @generated
   */
  EClass getPojoAttributeDirectiveRequired();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectivePrimaryKey <em>Pojo Attribute Directive Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Primary Key</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectivePrimaryKey
   * @generated
   */
  EClass getPojoAttributeDirectivePrimaryKey();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveDiscriminator <em>Pojo Attribute Directive Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Discriminator</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveDiscriminator
   * @generated
   */
  EClass getPojoAttributeDirectiveDiscriminator();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveIndex <em>Pojo Attribute Directive Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Index</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveIndex
   * @generated
   */
  EClass getPojoAttributeDirectiveIndex();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveIndex#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveIndex#getIndex()
   * @see #getPojoAttributeDirectiveIndex()
   * @generated
   */
  EAttribute getPojoAttributeDirectiveIndex_Index();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveVersion <em>Pojo Attribute Directive Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Version</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveVersion
   * @generated
   */
  EClass getPojoAttributeDirectiveVersion();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveUpdateCol <em>Pojo Attribute Directive Update Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Update Col</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveUpdateCol
   * @generated
   */
  EClass getPojoAttributeDirectiveUpdateCol();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveUpdateCol#getUpdateColumn1 <em>Update Column1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Update Column1</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveUpdateCol#getUpdateColumn1()
   * @see #getPojoAttributeDirectiveUpdateCol()
   * @generated
   */
  EReference getPojoAttributeDirectiveUpdateCol_UpdateColumn1();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveUpdateCol#getUpdateColumn2 <em>Update Column2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Update Column2</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveUpdateCol#getUpdateColumn2()
   * @see #getPojoAttributeDirectiveUpdateCol()
   * @generated
   */
  EReference getPojoAttributeDirectiveUpdateCol_UpdateColumn2();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveCreateCol <em>Pojo Attribute Directive Create Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Create Col</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveCreateCol
   * @generated
   */
  EClass getPojoAttributeDirectiveCreateCol();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveCreateCol#getCreateColumn1 <em>Create Column1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Create Column1</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveCreateCol#getCreateColumn1()
   * @see #getPojoAttributeDirectiveCreateCol()
   * @generated
   */
  EReference getPojoAttributeDirectiveCreateCol_CreateColumn1();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveCreateCol#getCreateColumn2 <em>Create Column2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Create Column2</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveCreateCol#getCreateColumn2()
   * @see #getPojoAttributeDirectiveCreateCol()
   * @generated
   */
  EReference getPojoAttributeDirectiveCreateCol_CreateColumn2();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveToInit <em>Pojo Attribute Directive To Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive To Init</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveToInit
   * @generated
   */
  EClass getPojoAttributeDirectiveToInit();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveEnumInit <em>Pojo Attribute Directive Enum Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Enum Init</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveEnumInit
   * @generated
   */
  EClass getPojoAttributeDirectiveEnumInit();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveIsDef <em>Pojo Attribute Directive Is Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Is Def</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveIsDef
   * @generated
   */
  EClass getPojoAttributeDirectiveIsDef();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.PojoAttributeDirectiveEnumDef <em>Pojo Attribute Directive Enum Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Attribute Directive Enum Def</em>'.
   * @see org.sqlproc.model.processorModel.PojoAttributeDirectiveEnumDef
   * @generated
   */
  EClass getPojoAttributeDirectiveEnumDef();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.EnumDirectiveSerializable <em>Enum Directive Serializable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Directive Serializable</em>'.
   * @see org.sqlproc.model.processorModel.EnumDirectiveSerializable
   * @generated
   */
  EClass getEnumDirectiveSerializable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.EnumDirectiveSerializable#getSernum <em>Sernum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sernum</em>'.
   * @see org.sqlproc.model.processorModel.EnumDirectiveSerializable#getSernum()
   * @see #getEnumDirectiveSerializable()
   * @generated
   */
  EAttribute getEnumDirectiveSerializable_Sernum();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.EnumAttributeDirectiveValues <em>Enum Attribute Directive Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attribute Directive Values</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttributeDirectiveValues
   * @generated
   */
  EClass getEnumAttributeDirectiveValues();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.EnumAttributeDirectiveValues#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.sqlproc.model.processorModel.EnumAttributeDirectiveValues#getValues()
   * @see #getEnumAttributeDirectiveValues()
   * @generated
   */
  EReference getEnumAttributeDirectiveValues_Values();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.FunctionCallQuery <em>Function Call Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call Query</em>'.
   * @see org.sqlproc.model.processorModel.FunctionCallQuery
   * @generated
   */
  EClass getFunctionCallQuery();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ProcedureCallQuery <em>Procedure Call Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Call Query</em>'.
   * @see org.sqlproc.model.processorModel.ProcedureCallQuery
   * @generated
   */
  EClass getProcedureCallQuery();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.sqlproc.model.processorModel.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.ProcedureUpdate <em>Procedure Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Update</em>'.
   * @see org.sqlproc.model.processorModel.ProcedureUpdate
   * @generated
   */
  EClass getProcedureUpdate();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.FunctionQuery <em>Function Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Query</em>'.
   * @see org.sqlproc.model.processorModel.FunctionQuery
   * @generated
   */
  EClass getFunctionQuery();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoDirectiveSerializable <em>Dao Directive Serializable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Directive Serializable</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveSerializable
   * @generated
   */
  EClass getDaoDirectiveSerializable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.model.processorModel.DaoDirectiveSerializable#getSernum <em>Sernum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sernum</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveSerializable#getSernum()
   * @see #getDaoDirectiveSerializable()
   * @generated
   */
  EAttribute getDaoDirectiveSerializable_Sernum();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoDirectiveDiscriminator <em>Dao Directive Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Directive Discriminator</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveDiscriminator
   * @generated
   */
  EClass getDaoDirectiveDiscriminator();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.DaoDirectiveDiscriminator#getAncestor <em>Ancestor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ancestor</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveDiscriminator#getAncestor()
   * @see #getDaoDirectiveDiscriminator()
   * @generated
   */
  EReference getDaoDirectiveDiscriminator_Ancestor();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.model.processorModel.DaoDirectiveDiscriminator#getDescendants <em>Descendants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Descendants</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveDiscriminator#getDescendants()
   * @see #getDaoDirectiveDiscriminator()
   * @generated
   */
  EReference getDaoDirectiveDiscriminator_Descendants();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoDirectiveCrud <em>Dao Directive Crud</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Directive Crud</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveCrud
   * @generated
   */
  EClass getDaoDirectiveCrud();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.DaoDirectiveCrud#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pojo</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveCrud#getPojo()
   * @see #getDaoDirectiveCrud()
   * @generated
   */
  EReference getDaoDirectiveCrud_Pojo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoDirectiveQuery <em>Dao Directive Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Directive Query</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveQuery
   * @generated
   */
  EClass getDaoDirectiveQuery();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.DaoDirectiveQuery#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pojo</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectiveQuery#getPojo()
   * @see #getDaoDirectiveQuery()
   * @generated
   */
  EReference getDaoDirectiveQuery_Pojo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoFunProcDirective <em>Dao Fun Proc Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Fun Proc Directive</em>'.
   * @see org.sqlproc.model.processorModel.DaoFunProcDirective
   * @generated
   */
  EClass getDaoFunProcDirective();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaoFunProcDirective#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.model.processorModel.DaoFunProcDirective#getType()
   * @see #getDaoFunProcDirective()
   * @generated
   */
  EReference getDaoFunProcDirective_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.model.processorModel.DaoFunProcDirective#getParamlist <em>Paramlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paramlist</em>'.
   * @see org.sqlproc.model.processorModel.DaoFunProcDirective#getParamlist()
   * @see #getDaoFunProcDirective()
   * @generated
   */
  EReference getDaoFunProcDirective_Paramlist();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.DaoDirectivePojo <em>Dao Directive Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dao Directive Pojo</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectivePojo
   * @generated
   */
  EClass getDaoDirectivePojo();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.model.processorModel.DaoDirectivePojo#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pojo</em>'.
   * @see org.sqlproc.model.processorModel.DaoDirectivePojo#getPojo()
   * @see #getDaoDirectivePojo()
   * @generated
   */
  EReference getDaoDirectivePojo_Pojo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveConflict <em>Annotation Directive Conflict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive Conflict</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveConflict
   * @generated
   */
  EClass getAnnotationDirectiveConflict();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveStatic <em>Annotation Directive Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive Static</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveStatic
   * @generated
   */
  EClass getAnnotationDirectiveStatic();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveConstructor <em>Annotation Directive Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive Constructor</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveConstructor
   * @generated
   */
  EClass getAnnotationDirectiveConstructor();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveStandard <em>Annotation Directive Standard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive Standard</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveStandard
   * @generated
   */
  EClass getAnnotationDirectiveStandard();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveSetter <em>Annotation Directive Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive Setter</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveSetter
   * @generated
   */
  EClass getAnnotationDirectiveSetter();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveGetter <em>Annotation Directive Getter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive Getter</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveGetter
   * @generated
   */
  EClass getAnnotationDirectiveGetter();

  /**
   * Returns the meta object for class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveAttribute <em>Annotation Directive Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Directive Attribute</em>'.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveAttribute
   * @generated
   */
  EClass getAnnotationDirectiveAttribute();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProcessorModelFactory getProcessorModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl <em>Artifacts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ArtifactsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getArtifacts()
     * @generated
     */
    EClass ARTIFACTS = eINSTANCE.getArtifacts();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__PROPERTIES = eINSTANCE.getArtifacts_Properties();

    /**
     * The meta object literal for the '<em><b>Pojos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__POJOS = eINSTANCE.getArtifacts_Pojos();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__TABLES = eINSTANCE.getArtifacts_Tables();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__PROCEDURES = eINSTANCE.getArtifacts_Procedures();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__FUNCTIONS = eINSTANCE.getArtifacts_Functions();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__PACKAGES = eINSTANCE.getArtifacts_Packages();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ValueTypeImpl <em>Value Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ValueTypeImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getValueType()
     * @generated
     */
    EClass VALUE_TYPE = eINSTANCE.getValueType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_TYPE__VALUE = eINSTANCE.getValueType_Value();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_TYPE__NUMBER = eINSTANCE.getValueType_Number();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_TYPE__ID = eINSTANCE.getValueType_Id();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DatabaseCatalogAssignementImpl <em>Database Catalog Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DatabaseCatalogAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseCatalogAssignement()
     * @generated
     */
    EClass DATABASE_CATALOG_ASSIGNEMENT = eINSTANCE.getDatabaseCatalogAssignement();

    /**
     * The meta object literal for the '<em><b>Db Catalog</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG = eINSTANCE.getDatabaseCatalogAssignement_DbCatalog();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DatabaseSchemaAssignementImpl <em>Database Schema Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DatabaseSchemaAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseSchemaAssignement()
     * @generated
     */
    EClass DATABASE_SCHEMA_ASSIGNEMENT = eINSTANCE.getDatabaseSchemaAssignement();

    /**
     * The meta object literal for the '<em><b>Db Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_SCHEMA_ASSIGNEMENT__DB_SCHEMA = eINSTANCE.getDatabaseSchemaAssignement_DbSchema();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DatabaseTypeAssignementImpl <em>Database Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DatabaseTypeAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseTypeAssignement()
     * @generated
     */
    EClass DATABASE_TYPE_ASSIGNEMENT = eINSTANCE.getDatabaseTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_TYPE_ASSIGNEMENT__DB_TYPE = eINSTANCE.getDatabaseTypeAssignement_DbType();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DatabaseMetaInfoAssignementImpl <em>Database Meta Info Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DatabaseMetaInfoAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseMetaInfoAssignement()
     * @generated
     */
    EClass DATABASE_META_INFO_ASSIGNEMENT = eINSTANCE.getDatabaseMetaInfoAssignement();

    /**
     * The meta object literal for the '<em><b>Db Meta Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO = eINSTANCE.getDatabaseMetaInfoAssignement_DbMetaInfo();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DriverMetaInfoAssignementImpl <em>Driver Meta Info Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DriverMetaInfoAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDriverMetaInfoAssignement()
     * @generated
     */
    EClass DRIVER_META_INFO_ASSIGNEMENT = eINSTANCE.getDriverMetaInfoAssignement();

    /**
     * The meta object literal for the '<em><b>Db Driver Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO = eINSTANCE.getDriverMetaInfoAssignement_DbDriverInfo();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DriverMethodOutputAssignementImpl <em>Driver Method Output Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DriverMethodOutputAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDriverMethodOutputAssignement()
     * @generated
     */
    EClass DRIVER_METHOD_OUTPUT_ASSIGNEMENT = eINSTANCE.getDriverMethodOutputAssignement();

    /**
     * The meta object literal for the '<em><b>Driver Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD = eINSTANCE.getDriverMethodOutputAssignement_DriverMethod();

    /**
     * The meta object literal for the '<em><b>Call Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT = eINSTANCE.getDriverMethodOutputAssignement_CallOutput();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.SqlTypeAssignementImpl <em>Sql Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.SqlTypeAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getSqlTypeAssignement()
     * @generated
     */
    EClass SQL_TYPE_ASSIGNEMENT = eINSTANCE.getSqlTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Sql Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_TYPE_ASSIGNEMENT__SQL_TYPE = eINSTANCE.getSqlTypeAssignement_SqlType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getSqlTypeAssignement_Type();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ColumnTypeAssignementImpl <em>Column Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ColumnTypeAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getColumnTypeAssignement()
     * @generated
     */
    EClass COLUMN_TYPE_ASSIGNEMENT = eINSTANCE.getColumnTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getColumnTypeAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getColumnTypeAssignement_Type();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ShowColumnTypeAssignementImpl <em>Show Column Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ShowColumnTypeAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getShowColumnTypeAssignement()
     * @generated
     */
    EClass SHOW_COLUMN_TYPE_ASSIGNEMENT = eINSTANCE.getShowColumnTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getShowColumnTypeAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW_COLUMN_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getShowColumnTypeAssignement_Type();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.TableAssignementImpl <em>Table Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.TableAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getTableAssignement()
     * @generated
     */
    EClass TABLE_ASSIGNEMENT = eINSTANCE.getTableAssignement();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ASSIGNEMENT__DB_TABLE = eINSTANCE.getTableAssignement_DbTable();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ASSIGNEMENT__NEW_NAME = eINSTANCE.getTableAssignement_NewName();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.JoinTableAssignementImpl <em>Join Table Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.JoinTableAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getJoinTableAssignement()
     * @generated
     */
    EClass JOIN_TABLE_ASSIGNEMENT = eINSTANCE.getJoinTableAssignement();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_TABLE_ASSIGNEMENT__DB_TABLE = eINSTANCE.getJoinTableAssignement_DbTable();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_TABLE_ASSIGNEMENT__DB_TABLES = eINSTANCE.getJoinTableAssignement_DbTables();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ColumnAssignementImpl <em>Column Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ColumnAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getColumnAssignement()
     * @generated
     */
    EClass COLUMN_ASSIGNEMENT = eINSTANCE.getColumnAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getColumnAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ASSIGNEMENT__NEW_NAME = eINSTANCE.getColumnAssignement_NewName();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImportAssignementImpl <em>Import Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImportAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImportAssignement()
     * @generated
     */
    EClass IMPORT_ASSIGNEMENT = eINSTANCE.getImportAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getImportAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Pk Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_ASSIGNEMENT__PK_TABLE = eINSTANCE.getImportAssignement_PkTable();

    /**
     * The meta object literal for the '<em><b>Pk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_ASSIGNEMENT__PK_COLUMN = eINSTANCE.getImportAssignement_PkColumn();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ExportAssignementImpl <em>Export Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ExportAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExportAssignement()
     * @generated
     */
    EClass EXPORT_ASSIGNEMENT = eINSTANCE.getExportAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getExportAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Fk Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_ASSIGNEMENT__FK_TABLE = eINSTANCE.getExportAssignement_FkTable();

    /**
     * The meta object literal for the '<em><b>Fk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_ASSIGNEMENT__FK_COLUMN = eINSTANCE.getExportAssignement_FkColumn();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.InheritanceAssignementImpl <em>Inheritance Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.InheritanceAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getInheritanceAssignement()
     * @generated
     */
    EClass INHERITANCE_ASSIGNEMENT = eINSTANCE.getInheritanceAssignement();

    /**
     * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_ASSIGNEMENT__DISCRIMINATOR = eINSTANCE.getInheritanceAssignement_Discriminator();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_ASSIGNEMENT__DB_TABLE = eINSTANCE.getInheritanceAssignement_DbTable();

    /**
     * The meta object literal for the '<em><b>Db Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_ASSIGNEMENT__DB_COLUMNS = eINSTANCE.getInheritanceAssignement_DbColumns();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ManyToManyAssignementImpl <em>Many To Many Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ManyToManyAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getManyToManyAssignement()
     * @generated
     */
    EClass MANY_TO_MANY_ASSIGNEMENT = eINSTANCE.getManyToManyAssignement();

    /**
     * The meta object literal for the '<em><b>Pk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN = eINSTANCE.getManyToManyAssignement_PkColumn();

    /**
     * The meta object literal for the '<em><b>Pk Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ASSIGNEMENT__PK_TABLE = eINSTANCE.getManyToManyAssignement_PkTable();

    /**
     * The meta object literal for the '<em><b>Fk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN = eINSTANCE.getManyToManyAssignement_FkColumn();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DebugLevelAssignementImpl <em>Debug Level Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DebugLevelAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDebugLevelAssignement()
     * @generated
     */
    EClass DEBUG_LEVEL_ASSIGNEMENT = eINSTANCE.getDebugLevelAssignement();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEBUG_LEVEL_ASSIGNEMENT__DEBUG = eINSTANCE.getDebugLevelAssignement_Debug();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEBUG_LEVEL_ASSIGNEMENT__SCOPE = eINSTANCE.getDebugLevelAssignement_Scope();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ProcedurePojoAssignementImpl <em>Procedure Pojo Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ProcedurePojoAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedurePojoAssignement()
     * @generated
     */
    EClass PROCEDURE_POJO_ASSIGNEMENT = eINSTANCE.getProcedurePojoAssignement();

    /**
     * The meta object literal for the '<em><b>Db Procedure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_POJO_ASSIGNEMENT__DB_PROCEDURE = eINSTANCE.getProcedurePojoAssignement_DbProcedure();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_POJO_ASSIGNEMENT__POJO = eINSTANCE.getProcedurePojoAssignement_Pojo();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.FunctionPojoAssignementImpl <em>Function Pojo Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.FunctionPojoAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionPojoAssignement()
     * @generated
     */
    EClass FUNCTION_POJO_ASSIGNEMENT = eINSTANCE.getFunctionPojoAssignement();

    /**
     * The meta object literal for the '<em><b>Db Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION = eINSTANCE.getFunctionPojoAssignement_DbFunction();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_POJO_ASSIGNEMENT__POJO = eINSTANCE.getFunctionPojoAssignement_Pojo();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsAssignementImpl <em>Implements Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsAssignement()
     * @generated
     */
    EClass IMPLEMENTS_ASSIGNEMENT = eINSTANCE.getImplementsAssignement();

    /**
     * The meta object literal for the '<em><b>To Implement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT = eINSTANCE.getImplementsAssignement_ToImplement();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTS_ASSIGNEMENT__DB_TABLES = eINSTANCE.getImplementsAssignement_DbTables();

    /**
     * The meta object literal for the '<em><b>Db Not Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES = eINSTANCE.getImplementsAssignement_DbNotTables();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ExtendsAssignementImpl <em>Extends Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ExtendsAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExtendsAssignement()
     * @generated
     */
    EClass EXTENDS_ASSIGNEMENT = eINSTANCE.getExtendsAssignement();

    /**
     * The meta object literal for the '<em><b>To Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS_ASSIGNEMENT__TO_EXTENDS = eINSTANCE.getExtendsAssignement_ToExtends();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS_ASSIGNEMENT__DB_TABLES = eINSTANCE.getExtendsAssignement_DbTables();

    /**
     * The meta object literal for the '<em><b>Db Not Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS_ASSIGNEMENT__DB_NOT_TABLES = eINSTANCE.getExtendsAssignement_DbNotTables();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsAssignementGenericsImpl <em>Implements Assignement Generics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsAssignementGenericsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsAssignementGenerics()
     * @generated
     */
    EClass IMPLEMENTS_ASSIGNEMENT_GENERICS = eINSTANCE.getImplementsAssignementGenerics();

    /**
     * The meta object literal for the '<em><b>To Implement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS_ASSIGNEMENT_GENERICS__TO_IMPLEMENT = eINSTANCE.getImplementsAssignementGenerics_ToImplement();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTS_ASSIGNEMENT_GENERICS__DB_TABLES = eINSTANCE.getImplementsAssignementGenerics_DbTables();

    /**
     * The meta object literal for the '<em><b>Db Not Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTS_ASSIGNEMENT_GENERICS__DB_NOT_TABLES = eINSTANCE.getImplementsAssignementGenerics_DbNotTables();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ExtendsAssignementGenericsImpl <em>Extends Assignement Generics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ExtendsAssignementGenericsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExtendsAssignementGenerics()
     * @generated
     */
    EClass EXTENDS_ASSIGNEMENT_GENERICS = eINSTANCE.getExtendsAssignementGenerics();

    /**
     * The meta object literal for the '<em><b>To Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS_ASSIGNEMENT_GENERICS__TO_EXTENDS = eINSTANCE.getExtendsAssignementGenerics_ToExtends();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS_ASSIGNEMENT_GENERICS__DB_TABLES = eINSTANCE.getExtendsAssignementGenerics_DbTables();

    /**
     * The meta object literal for the '<em><b>Db Not Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS_ASSIGNEMENT_GENERICS__DB_NOT_TABLES = eINSTANCE.getExtendsAssignementGenerics_DbNotTables();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PropertyConditionImpl <em>Property Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PropertyConditionImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPropertyCondition()
     * @generated
     */
    EClass PROPERTY_CONDITION = eINSTANCE.getPropertyCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CONDITION__NAME = eINSTANCE.getPropertyCondition_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONDITION__VALUE = eINSTANCE.getPropertyCondition_Value();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PropertyImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__CONDITION = eINSTANCE.getProperty_Condition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DATABASE = eINSTANCE.getProperty_Database();

    /**
     * The meta object literal for the '<em><b>Pojogen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__POJOGEN = eINSTANCE.getProperty_Pojogen();

    /**
     * The meta object literal for the '<em><b>Metagen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__METAGEN = eINSTANCE.getProperty_Metagen();

    /**
     * The meta object literal for the '<em><b>Daogen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DAOGEN = eINSTANCE.getProperty_Daogen();

    /**
     * The meta object literal for the '<em><b>Replace Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__REPLACE_ID = eINSTANCE.getProperty_ReplaceId();

    /**
     * The meta object literal for the '<em><b>Regex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__REGEX = eINSTANCE.getProperty_Regex();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__REPLACEMENT = eINSTANCE.getProperty_Replacement();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl <em>Database Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DatabasePropertyImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDatabaseProperty()
     * @generated
     */
    EClass DATABASE_PROPERTY = eINSTANCE.getDatabaseProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__NAME = eINSTANCE.getDatabaseProperty_Name();

    /**
     * The meta object literal for the '<em><b>Db Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_URL = eINSTANCE.getDatabaseProperty_DbUrl();

    /**
     * The meta object literal for the '<em><b>Db Username</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_USERNAME = eINSTANCE.getDatabaseProperty_DbUsername();

    /**
     * The meta object literal for the '<em><b>Db Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_PASSWORD = eINSTANCE.getDatabaseProperty_DbPassword();

    /**
     * The meta object literal for the '<em><b>Db Catalog</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_CATALOG = eINSTANCE.getDatabaseProperty_DbCatalog();

    /**
     * The meta object literal for the '<em><b>Db Schema</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_SCHEMA = eINSTANCE.getDatabaseProperty_DbSchema();

    /**
     * The meta object literal for the '<em><b>Db Driverx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_DRIVERX = eINSTANCE.getDatabaseProperty_DbDriverx();

    /**
     * The meta object literal for the '<em><b>Db Driver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_DRIVER = eINSTANCE.getDatabaseProperty_DbDriver();

    /**
     * The meta object literal for the '<em><b>Db Execute Before</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_EXECUTE_BEFORE = eINSTANCE.getDatabaseProperty_DbExecuteBefore();

    /**
     * The meta object literal for the '<em><b>Db Execute After</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_EXECUTE_AFTER = eINSTANCE.getDatabaseProperty_DbExecuteAfter();

    /**
     * The meta object literal for the '<em><b>Db Index Types</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_INDEX_TYPES = eINSTANCE.getDatabaseProperty_DbIndexTypes();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_TYPE = eINSTANCE.getDatabaseProperty_DbType();

    /**
     * The meta object literal for the '<em><b>Db Meta Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_META_INFO = eINSTANCE.getDatabaseProperty_DbMetaInfo();

    /**
     * The meta object literal for the '<em><b>Db Driver Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_DRIVER_INFO = eINSTANCE.getDatabaseProperty_DbDriverInfo();

    /**
     * The meta object literal for the '<em><b>Db Methods Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_METHODS_CALLS = eINSTANCE.getDatabaseProperty_DbMethodsCalls();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DEBUG = eINSTANCE.getDatabaseProperty_Debug();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojogenPropertyImpl <em>Pojogen Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojogenPropertyImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojogenProperty()
     * @generated
     */
    EClass POJOGEN_PROPERTY = eINSTANCE.getPojogenProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__NAME = eINSTANCE.getPojogenProperty_Name();

    /**
     * The meta object literal for the '<em><b>Sql Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__SQL_TYPES = eINSTANCE.getPojogenProperty_SqlTypes();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_TABLE = eINSTANCE.getPojogenProperty_DbTable();

    /**
     * The meta object literal for the '<em><b>Column Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__COLUMN_TYPES = eINSTANCE.getPojogenProperty_ColumnTypes();

    /**
     * The meta object literal for the '<em><b>Db Procedure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_PROCEDURE = eINSTANCE.getPojogenProperty_DbProcedure();

    /**
     * The meta object literal for the '<em><b>Db Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_FUNCTION = eINSTANCE.getPojogenProperty_DbFunction();

    /**
     * The meta object literal for the '<em><b>Column Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__COLUMN_TYPE = eINSTANCE.getPojogenProperty_ColumnType();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_TABLES = eINSTANCE.getPojogenProperty_DbTables();

    /**
     * The meta object literal for the '<em><b>Join Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__JOIN_TABLES = eINSTANCE.getPojogenProperty_JoinTables();

    /**
     * The meta object literal for the '<em><b>Db Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_COLUMNS = eINSTANCE.getPojogenProperty_DbColumns();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TABLES = eINSTANCE.getPojogenProperty_Tables();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__COLUMNS = eINSTANCE.getPojogenProperty_Columns();

    /**
     * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__EXPORTS = eINSTANCE.getPojogenProperty_Exports();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__IMPORTS = eINSTANCE.getPojogenProperty_Imports();

    /**
     * The meta object literal for the '<em><b>Many2s</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__MANY2S = eINSTANCE.getPojogenProperty_Many2s();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_COLUMN = eINSTANCE.getPojogenProperty_DbColumn();

    /**
     * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__INHERITANCE = eINSTANCE.getPojogenProperty_Inheritance();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__METHODS = eINSTANCE.getPojogenProperty_Methods();

    /**
     * The meta object literal for the '<em><b>Operators Suffix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__OPERATORS_SUFFIX = eINSTANCE.getPojogenProperty_OperatorsSuffix();

    /**
     * The meta object literal for the '<em><b>To Implements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TO_IMPLEMENTS = eINSTANCE.getPojogenProperty_ToImplements();

    /**
     * The meta object literal for the '<em><b>To Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TO_EXTENDS = eINSTANCE.getPojogenProperty_ToExtends();

    /**
     * The meta object literal for the '<em><b>To Implements Generics</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS = eINSTANCE.getPojogenProperty_ToImplementsGenerics();

    /**
     * The meta object literal for the '<em><b>To Extends Generics</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TO_EXTENDS_GENERICS = eINSTANCE.getPojogenProperty_ToExtendsGenerics();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__VERSION = eINSTANCE.getPojogenProperty_Version();

    /**
     * The meta object literal for the '<em><b>Db Not Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_NOT_TABLES = eINSTANCE.getPojogenProperty_DbNotTables();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__DEBUG = eINSTANCE.getPojogenProperty_Debug();

    /**
     * The meta object literal for the '<em><b>Proc Pojos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__PROC_POJOS = eINSTANCE.getPojogenProperty_ProcPojos();

    /**
     * The meta object literal for the '<em><b>Fun Pojos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__FUN_POJOS = eINSTANCE.getPojogenProperty_FunPojos();

    /**
     * The meta object literal for the '<em><b>Active Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__ACTIVE_FILTER = eINSTANCE.getPojogenProperty_ActiveFilter();

    /**
     * The meta object literal for the '<em><b>Pckg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__PCKG = eINSTANCE.getPojogenProperty_Pckg();

    /**
     * The meta object literal for the '<em><b>Enum Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__ENUM_NAME = eINSTANCE.getPojogenProperty_EnumName();

    /**
     * The meta object literal for the '<em><b>Db Check Constraints</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_CHECK_CONSTRAINTS = eINSTANCE.getPojogenProperty_DbCheckConstraints();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.MetaTypeAssignementImpl <em>Meta Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.MetaTypeAssignementImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getMetaTypeAssignement()
     * @generated
     */
    EClass META_TYPE_ASSIGNEMENT = eINSTANCE.getMetaTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_TYPE_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getMetaTypeAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getMetaTypeAssignement_Type();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_TYPE_ASSIGNEMENT__EXTENSION = eINSTANCE.getMetaTypeAssignement_Extension();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.MetagenPropertyImpl <em>Metagen Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.MetagenPropertyImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getMetagenProperty()
     * @generated
     */
    EClass METAGEN_PROPERTY = eINSTANCE.getMetagenProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__NAME = eINSTANCE.getMetagenProperty_Name();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__SEQUENCE = eINSTANCE.getMetagenProperty_Sequence();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__TYPE = eINSTANCE.getMetagenProperty_Type();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_TABLES = eINSTANCE.getMetagenProperty_DbTables();

    /**
     * The meta object literal for the '<em><b>Db Not Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_NOT_TABLES = eINSTANCE.getMetagenProperty_DbNotTables();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_TABLE = eINSTANCE.getMetagenProperty_DbTable();

    /**
     * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__IDENTITY = eINSTANCE.getMetagenProperty_Identity();

    /**
     * The meta object literal for the '<em><b>Meta Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAGEN_PROPERTY__META_TYPES = eINSTANCE.getMetagenProperty_MetaTypes();

    /**
     * The meta object literal for the '<em><b>Db Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_STATEMENT = eINSTANCE.getMetagenProperty_DbStatement();

    /**
     * The meta object literal for the '<em><b>Db Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_COLUMNS = eINSTANCE.getMetagenProperty_DbColumns();

    /**
     * The meta object literal for the '<em><b>Db Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_FUNCTION = eINSTANCE.getMetagenProperty_DbFunction();

    /**
     * The meta object literal for the '<em><b>Db Procedure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_PROCEDURE = eINSTANCE.getMetagenProperty_DbProcedure();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAGEN_PROPERTY__DEBUG = eINSTANCE.getMetagenProperty_Debug();

    /**
     * The meta object literal for the '<em><b>Optional Features</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__OPTIONAL_FEATURES = eINSTANCE.getMetagenProperty_OptionalFeatures();

    /**
     * The meta object literal for the '<em><b>Active Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAGEN_PROPERTY__ACTIVE_FILTER = eINSTANCE.getMetagenProperty_ActiveFilter();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl <em>Daogen Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaogenPropertyImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaogenProperty()
     * @generated
     */
    EClass DAOGEN_PROPERTY = eINSTANCE.getDaogenProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__NAME = eINSTANCE.getDaogenProperty_Name();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__DB_TABLES = eINSTANCE.getDaogenProperty_DbTables();

    /**
     * The meta object literal for the '<em><b>To Implements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__TO_IMPLEMENTS = eINSTANCE.getDaogenProperty_ToImplements();

    /**
     * The meta object literal for the '<em><b>To Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__TO_EXTENDS = eINSTANCE.getDaogenProperty_ToExtends();

    /**
     * The meta object literal for the '<em><b>To Implements Generics</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS = eINSTANCE.getDaogenProperty_ToImplementsGenerics();

    /**
     * The meta object literal for the '<em><b>To Extends Generics</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__TO_EXTENDS_GENERICS = eINSTANCE.getDaogenProperty_ToExtendsGenerics();

    /**
     * The meta object literal for the '<em><b>Db Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__DB_FUNCTION = eINSTANCE.getDaogenProperty_DbFunction();

    /**
     * The meta object literal for the '<em><b>Result Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__RESULT_TYPE = eINSTANCE.getDaogenProperty_ResultType();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__DEBUG = eINSTANCE.getDaogenProperty_Debug();

    /**
     * The meta object literal for the '<em><b>Active Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__ACTIVE_FILTER = eINSTANCE.getDaogenProperty_ActiveFilter();

    /**
     * The meta object literal for the '<em><b>Pckg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__PCKG = eINSTANCE.getDaogenProperty_Pckg();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDefinitionImpl <em>Pojo Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDefinitionImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDefinition()
     * @generated
     */
    EClass POJO_DEFINITION = eINSTANCE.getPojoDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DEFINITION__NAME = eINSTANCE.getPojoDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DEFINITION__CLASS = eINSTANCE.getPojoDefinition_Class();

    /**
     * The meta object literal for the '<em><b>Classx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DEFINITION__CLASSX = eINSTANCE.getPojoDefinition_Classx();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.TableDefinitionImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getTableDefinition()
     * @generated
     */
    EClass TABLE_DEFINITION = eINSTANCE.getTableDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DEFINITION__NAME = eINSTANCE.getTableDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DEFINITION__TABLE = eINSTANCE.getTableDefinition_Table();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ProcedureDefinitionImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedureDefinition()
     * @generated
     */
    EClass PROCEDURE_DEFINITION = eINSTANCE.getProcedureDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_DEFINITION__NAME = eINSTANCE.getProcedureDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_DEFINITION__TABLE = eINSTANCE.getProcedureDefinition_Table();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.FunctionDefinitionImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__TABLE = eINSTANCE.getFunctionDefinition_Table();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PackageImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__IMPORT_SECTION = eINSTANCE.getPackage_ImportSection();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AbstractEntityImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAbstractEntity()
     * @generated
     */
    EClass ABSTRACT_ENTITY = eINSTANCE.getAbstractEntity();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveImpl <em>Implements Extends Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirective()
     * @generated
     */
    EClass IMPLEMENTS_EXTENDS_DIRECTIVE = eINSTANCE.getImplementsExtendsDirective();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsImpl <em>Implements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplements()
     * @generated
     */
    EClass IMPLEMENTS = eINSTANCE.getImplements();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS__DIRECTIVES = eINSTANCE.getImplements_Directives();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS__IMPLEMENTS = eINSTANCE.getImplements_Implements();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ExtendsImpl <em>Extends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ExtendsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getExtends()
     * @generated
     */
    EClass EXTENDS = eINSTANCE.getExtends();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS__DIRECTIVES = eINSTANCE.getExtends_Directives();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS__EXTENDS = eINSTANCE.getExtends_Extends();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotatedEntityImpl <em>Annotated Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotatedEntityImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotatedEntity()
     * @generated
     */
    EClass ANNOTATED_ENTITY = eINSTANCE.getAnnotatedEntity();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_ENTITY__ANNOTATIONS = eINSTANCE.getAnnotatedEntity_Annotations();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_ENTITY__ENTITY = eINSTANCE.getAnnotatedEntity_Entity();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EntityImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__FINAL = eINSTANCE.getEntity_Final();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROCEDURES = eINSTANCE.getEntity_Procedures();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DirectivePropertiesImpl <em>Directive Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DirectivePropertiesImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDirectiveProperties()
     * @generated
     */
    EClass DIRECTIVE_PROPERTIES = eINSTANCE.getDirectiveProperties();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTIVE_PROPERTIES__FEATURES = eINSTANCE.getDirectiveProperties_Features();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveImpl <em>Pojo Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirective()
     * @generated
     */
    EClass POJO_DIRECTIVE = eINSTANCE.getPojoDirective();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoEntityImpl <em>Pojo Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoEntityImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoEntity()
     * @generated
     */
    EClass POJO_ENTITY = eINSTANCE.getPojoEntity();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__DIRECTIVES = eINSTANCE.getPojoEntity_Directives();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY__ABSTRACT = eINSTANCE.getPojoEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__SUPER_TYPE = eINSTANCE.getPojoEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__ATTRIBUTES = eINSTANCE.getPojoEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveImpl <em>Pojo Attribute Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirective()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE = eINSTANCE.getPojoAttributeDirective();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeImpl <em>Pojo Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttribute()
     * @generated
     */
    EClass POJO_ATTRIBUTE = eINSTANCE.getPojoAttribute();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE__ANNOTATIONS = eINSTANCE.getPojoAttribute_Annotations();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE__DIRECTIVES = eINSTANCE.getPojoAttribute_Directives();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ATTRIBUTE__FINAL = eINSTANCE.getPojoAttribute_Final();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ATTRIBUTE__STATIC = eINSTANCE.getPojoAttribute_Static();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ATTRIBUTE__KIND = eINSTANCE.getPojoAttribute_Kind();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE__TYPE = eINSTANCE.getPojoAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ATTRIBUTE__NAME = eINSTANCE.getPojoAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Init Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE__INIT_EXPR = eINSTANCE.getPojoAttribute_InitExpr();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoProcedureImpl <em>Pojo Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoProcedureImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoProcedure()
     * @generated
     */
    EClass POJO_PROCEDURE = eINSTANCE.getPojoProcedure();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROCEDURE__ANNOTATIONS = eINSTANCE.getPojoProcedure_Annotations();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROCEDURE__FINAL = eINSTANCE.getPojoProcedure_Final();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROCEDURE__STATIC = eINSTANCE.getPojoProcedure_Static();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROCEDURE__TYPE = eINSTANCE.getPojoProcedure_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROCEDURE__NAME = eINSTANCE.getPojoProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROCEDURE__PARAMS = eINSTANCE.getPojoProcedure_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROCEDURE__BODY = eINSTANCE.getPojoProcedure_Body();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EnumDirectiveImpl <em>Enum Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EnumDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumDirective()
     * @generated
     */
    EClass ENUM_DIRECTIVE = eINSTANCE.getEnumDirective();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EnumEntityImpl <em>Enum Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EnumEntityImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumEntity()
     * @generated
     */
    EClass ENUM_ENTITY = eINSTANCE.getEnumEntity();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ENTITY__DIRECTIVES = eINSTANCE.getEnumEntity_Directives();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ENTITY__ATTRIBUTE = eINSTANCE.getEnumEntity_Attribute();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeValueImpl <em>Enum Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EnumAttributeValueImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttributeValue()
     * @generated
     */
    EClass ENUM_ATTRIBUTE_VALUE = eINSTANCE.getEnumAttributeValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTRIBUTE_VALUE__NAME = eINSTANCE.getEnumAttributeValue_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ATTRIBUTE_VALUE__VALUE = eINSTANCE.getEnumAttributeValue_Value();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveImpl <em>Enum Attribute Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttributeDirective()
     * @generated
     */
    EClass ENUM_ATTRIBUTE_DIRECTIVE = eINSTANCE.getEnumAttributeDirective();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EnumAttributeImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttribute()
     * @generated
     */
    EClass ENUM_ATTRIBUTE = eINSTANCE.getEnumAttribute();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ATTRIBUTE__DIRECTIVES = eINSTANCE.getEnumAttribute_Directives();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTRIBUTE__FINAL = eINSTANCE.getEnumAttribute_Final();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTRIBUTE__STATIC = eINSTANCE.getEnumAttribute_Static();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ATTRIBUTE__TYPE = eINSTANCE.getEnumAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTRIBUTE__NAME = eINSTANCE.getEnumAttribute_Name();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveParametersImpl <em>Dao Directive Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoDirectiveParametersImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveParameters()
     * @generated
     */
    EClass DAO_DIRECTIVE_PARAMETERS = eINSTANCE.getDaoDirectiveParameters();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_DIRECTIVE_PARAMETERS__OUT = eINSTANCE.getDaoDirectiveParameters_Out();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_DIRECTIVE_PARAMETERS__INS = eINSTANCE.getDaoDirectiveParameters_Ins();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DescendantAssignmentImpl <em>Descendant Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DescendantAssignmentImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDescendantAssignment()
     * @generated
     */
    EClass DESCENDANT_ASSIGNMENT = eINSTANCE.getDescendantAssignment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_ASSIGNMENT__VALUE = eINSTANCE.getDescendantAssignment_Value();

    /**
     * The meta object literal for the '<em><b>Descendant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_ASSIGNMENT__DESCENDANT = eINSTANCE.getDescendantAssignment_Descendant();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.FunProcTypeImpl <em>Fun Proc Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.FunProcTypeImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunProcType()
     * @generated
     */
    EClass FUN_PROC_TYPE = eINSTANCE.getFunProcType();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveImpl <em>Dao Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirective()
     * @generated
     */
    EClass DAO_DIRECTIVE = eINSTANCE.getDaoDirective();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoEntityImpl <em>Dao Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoEntityImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoEntity()
     * @generated
     */
    EClass DAO_ENTITY = eINSTANCE.getDaoEntity();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_ENTITY__DIRECTIVES = eINSTANCE.getDaoEntity_Directives();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAO_ENTITY__ABSTRACT = eINSTANCE.getDaoEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_ENTITY__SUPER_TYPE = eINSTANCE.getDaoEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_ENTITY__ATTRIBUTES = eINSTANCE.getDaoEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveImpl <em>Annotation Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirective()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE = eINSTANCE.getAnnotationDirective();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__DIRECTIVES = eINSTANCE.getAnnotation_Directives();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION = eINSTANCE.getAnnotation_Annotation();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveGenericsImpl <em>Implements Extends Directive Generics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveGenericsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveGenerics()
     * @generated
     */
    EClass IMPLEMENTS_EXTENDS_DIRECTIVE_GENERICS = eINSTANCE.getImplementsExtendsDirectiveGenerics();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyPojosImpl <em>Implements Extends Directive Only Pojos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyPojosImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveOnlyPojos()
     * @generated
     */
    EClass IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS = eINSTANCE.getImplementsExtendsDirectiveOnlyPojos();

    /**
     * The meta object literal for the '<em><b>Only Pojos</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS__ONLY_POJOS = eINSTANCE.getImplementsExtendsDirectiveOnlyPojos_OnlyPojos();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyDaosImpl <em>Implements Extends Directive Only Daos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyDaosImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveOnlyDaos()
     * @generated
     */
    EClass IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_DAOS = eINSTANCE.getImplementsExtendsDirectiveOnlyDaos();

    /**
     * The meta object literal for the '<em><b>Only Daos</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_DAOS__ONLY_DAOS = eINSTANCE.getImplementsExtendsDirectiveOnlyDaos_OnlyDaos();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptPojosImpl <em>Implements Extends Directive Except Pojos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptPojosImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveExceptPojos()
     * @generated
     */
    EClass IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS = eINSTANCE.getImplementsExtendsDirectiveExceptPojos();

    /**
     * The meta object literal for the '<em><b>Except Pojos</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS__EXCEPT_POJOS = eINSTANCE.getImplementsExtendsDirectiveExceptPojos_ExceptPojos();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptDaosImpl <em>Implements Extends Directive Except Daos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptDaosImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getImplementsExtendsDirectiveExceptDaos()
     * @generated
     */
    EClass IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_DAOS = eINSTANCE.getImplementsExtendsDirectiveExceptDaos();

    /**
     * The meta object literal for the '<em><b>Except Daos</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_DAOS__EXCEPT_DAOS = eINSTANCE.getImplementsExtendsDirectiveExceptDaos_ExceptDaos();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveToStringImpl <em>Pojo Directive To String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveToStringImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveToString()
     * @generated
     */
    EClass POJO_DIRECTIVE_TO_STRING = eINSTANCE.getPojoDirectiveToString();

    /**
     * The meta object literal for the '<em><b>Proplist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DIRECTIVE_TO_STRING__PROPLIST = eINSTANCE.getPojoDirectiveToString_Proplist();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveIndexImpl <em>Pojo Directive Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveIndexImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveIndex()
     * @generated
     */
    EClass POJO_DIRECTIVE_INDEX = eINSTANCE.getPojoDirectiveIndex();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DIRECTIVE_INDEX__INDEX = eINSTANCE.getPojoDirectiveIndex_Index();

    /**
     * The meta object literal for the '<em><b>Proplist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DIRECTIVE_INDEX__PROPLIST = eINSTANCE.getPojoDirectiveIndex_Proplist();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveOperatorsImpl <em>Pojo Directive Operators</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveOperatorsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveOperators()
     * @generated
     */
    EClass POJO_DIRECTIVE_OPERATORS = eINSTANCE.getPojoDirectiveOperators();

    /**
     * The meta object literal for the '<em><b>Operators Suffix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DIRECTIVE_OPERATORS__OPERATORS_SUFFIX = eINSTANCE.getPojoDirectiveOperators_OperatorsSuffix();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveSerializableImpl <em>Pojo Directive Serializable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveSerializableImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveSerializable()
     * @generated
     */
    EClass POJO_DIRECTIVE_SERIALIZABLE = eINSTANCE.getPojoDirectiveSerializable();

    /**
     * The meta object literal for the '<em><b>Sernum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DIRECTIVE_SERIALIZABLE__SERNUM = eINSTANCE.getPojoDirectiveSerializable_Sernum();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveDiscriminatorImpl <em>Pojo Directive Discriminator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveDiscriminatorImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveDiscriminator()
     * @generated
     */
    EClass POJO_DIRECTIVE_DISCRIMINATOR = eINSTANCE.getPojoDirectiveDiscriminator();

    /**
     * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DIRECTIVE_DISCRIMINATOR__DISCRIMINATOR = eINSTANCE.getPojoDirectiveDiscriminator_Discriminator();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveEqualsImpl <em>Pojo Directive Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveEqualsImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveEquals()
     * @generated
     */
    EClass POJO_DIRECTIVE_EQUALS = eINSTANCE.getPojoDirectiveEquals();

    /**
     * The meta object literal for the '<em><b>Proplist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DIRECTIVE_EQUALS__PROPLIST = eINSTANCE.getPojoDirectiveEquals_Proplist();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoDirectiveHashCodeImpl <em>Pojo Directive Hash Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoDirectiveHashCodeImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoDirectiveHashCode()
     * @generated
     */
    EClass POJO_DIRECTIVE_HASH_CODE = eINSTANCE.getPojoDirectiveHashCode();

    /**
     * The meta object literal for the '<em><b>Proplist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DIRECTIVE_HASH_CODE__PROPLIST = eINSTANCE.getPojoDirectiveHashCode_Proplist();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveRequiredImpl <em>Pojo Attribute Directive Required</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveRequiredImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveRequired()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_REQUIRED = eINSTANCE.getPojoAttributeDirectiveRequired();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectivePrimaryKeyImpl <em>Pojo Attribute Directive Primary Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectivePrimaryKeyImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectivePrimaryKey()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_PRIMARY_KEY = eINSTANCE.getPojoAttributeDirectivePrimaryKey();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveDiscriminatorImpl <em>Pojo Attribute Directive Discriminator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveDiscriminatorImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveDiscriminator()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_DISCRIMINATOR = eINSTANCE.getPojoAttributeDirectiveDiscriminator();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIndexImpl <em>Pojo Attribute Directive Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIndexImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveIndex()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_INDEX = eINSTANCE.getPojoAttributeDirectiveIndex();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ATTRIBUTE_DIRECTIVE_INDEX__INDEX = eINSTANCE.getPojoAttributeDirectiveIndex_Index();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveVersionImpl <em>Pojo Attribute Directive Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveVersionImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveVersion()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_VERSION = eINSTANCE.getPojoAttributeDirectiveVersion();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveUpdateColImpl <em>Pojo Attribute Directive Update Col</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveUpdateColImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveUpdateCol()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL = eINSTANCE.getPojoAttributeDirectiveUpdateCol();

    /**
     * The meta object literal for the '<em><b>Update Column1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1 = eINSTANCE.getPojoAttributeDirectiveUpdateCol_UpdateColumn1();

    /**
     * The meta object literal for the '<em><b>Update Column2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2 = eINSTANCE.getPojoAttributeDirectiveUpdateCol_UpdateColumn2();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveCreateColImpl <em>Pojo Attribute Directive Create Col</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveCreateColImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveCreateCol()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_CREATE_COL = eINSTANCE.getPojoAttributeDirectiveCreateCol();

    /**
     * The meta object literal for the '<em><b>Create Column1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE_DIRECTIVE_CREATE_COL__CREATE_COLUMN1 = eINSTANCE.getPojoAttributeDirectiveCreateCol_CreateColumn1();

    /**
     * The meta object literal for the '<em><b>Create Column2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ATTRIBUTE_DIRECTIVE_CREATE_COL__CREATE_COLUMN2 = eINSTANCE.getPojoAttributeDirectiveCreateCol_CreateColumn2();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveToInitImpl <em>Pojo Attribute Directive To Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveToInitImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveToInit()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_TO_INIT = eINSTANCE.getPojoAttributeDirectiveToInit();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumInitImpl <em>Pojo Attribute Directive Enum Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumInitImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveEnumInit()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_ENUM_INIT = eINSTANCE.getPojoAttributeDirectiveEnumInit();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIsDefImpl <em>Pojo Attribute Directive Is Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveIsDefImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveIsDef()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_IS_DEF = eINSTANCE.getPojoAttributeDirectiveIsDef();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumDefImpl <em>Pojo Attribute Directive Enum Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveEnumDefImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getPojoAttributeDirectiveEnumDef()
     * @generated
     */
    EClass POJO_ATTRIBUTE_DIRECTIVE_ENUM_DEF = eINSTANCE.getPojoAttributeDirectiveEnumDef();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EnumDirectiveSerializableImpl <em>Enum Directive Serializable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EnumDirectiveSerializableImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumDirectiveSerializable()
     * @generated
     */
    EClass ENUM_DIRECTIVE_SERIALIZABLE = eINSTANCE.getEnumDirectiveSerializable();

    /**
     * The meta object literal for the '<em><b>Sernum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_DIRECTIVE_SERIALIZABLE__SERNUM = eINSTANCE.getEnumDirectiveSerializable_Sernum();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveValuesImpl <em>Enum Attribute Directive Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.EnumAttributeDirectiveValuesImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getEnumAttributeDirectiveValues()
     * @generated
     */
    EClass ENUM_ATTRIBUTE_DIRECTIVE_VALUES = eINSTANCE.getEnumAttributeDirectiveValues();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ATTRIBUTE_DIRECTIVE_VALUES__VALUES = eINSTANCE.getEnumAttributeDirectiveValues_Values();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.FunctionCallQueryImpl <em>Function Call Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.FunctionCallQueryImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionCallQuery()
     * @generated
     */
    EClass FUNCTION_CALL_QUERY = eINSTANCE.getFunctionCallQuery();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ProcedureCallQueryImpl <em>Procedure Call Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ProcedureCallQueryImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedureCallQuery()
     * @generated
     */
    EClass PROCEDURE_CALL_QUERY = eINSTANCE.getProcedureCallQuery();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.FunctionCallImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.ProcedureUpdateImpl <em>Procedure Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.ProcedureUpdateImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getProcedureUpdate()
     * @generated
     */
    EClass PROCEDURE_UPDATE = eINSTANCE.getProcedureUpdate();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.FunctionQueryImpl <em>Function Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.FunctionQueryImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getFunctionQuery()
     * @generated
     */
    EClass FUNCTION_QUERY = eINSTANCE.getFunctionQuery();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveSerializableImpl <em>Dao Directive Serializable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoDirectiveSerializableImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveSerializable()
     * @generated
     */
    EClass DAO_DIRECTIVE_SERIALIZABLE = eINSTANCE.getDaoDirectiveSerializable();

    /**
     * The meta object literal for the '<em><b>Sernum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAO_DIRECTIVE_SERIALIZABLE__SERNUM = eINSTANCE.getDaoDirectiveSerializable_Sernum();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveDiscriminatorImpl <em>Dao Directive Discriminator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoDirectiveDiscriminatorImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveDiscriminator()
     * @generated
     */
    EClass DAO_DIRECTIVE_DISCRIMINATOR = eINSTANCE.getDaoDirectiveDiscriminator();

    /**
     * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_DIRECTIVE_DISCRIMINATOR__ANCESTOR = eINSTANCE.getDaoDirectiveDiscriminator_Ancestor();

    /**
     * The meta object literal for the '<em><b>Descendants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_DIRECTIVE_DISCRIMINATOR__DESCENDANTS = eINSTANCE.getDaoDirectiveDiscriminator_Descendants();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveCrudImpl <em>Dao Directive Crud</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoDirectiveCrudImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveCrud()
     * @generated
     */
    EClass DAO_DIRECTIVE_CRUD = eINSTANCE.getDaoDirectiveCrud();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_DIRECTIVE_CRUD__POJO = eINSTANCE.getDaoDirectiveCrud_Pojo();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectiveQueryImpl <em>Dao Directive Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoDirectiveQueryImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectiveQuery()
     * @generated
     */
    EClass DAO_DIRECTIVE_QUERY = eINSTANCE.getDaoDirectiveQuery();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_DIRECTIVE_QUERY__POJO = eINSTANCE.getDaoDirectiveQuery_Pojo();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoFunProcDirectiveImpl <em>Dao Fun Proc Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoFunProcDirectiveImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoFunProcDirective()
     * @generated
     */
    EClass DAO_FUN_PROC_DIRECTIVE = eINSTANCE.getDaoFunProcDirective();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_FUN_PROC_DIRECTIVE__TYPE = eINSTANCE.getDaoFunProcDirective_Type();

    /**
     * The meta object literal for the '<em><b>Paramlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_FUN_PROC_DIRECTIVE__PARAMLIST = eINSTANCE.getDaoFunProcDirective_Paramlist();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.DaoDirectivePojoImpl <em>Dao Directive Pojo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.DaoDirectivePojoImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getDaoDirectivePojo()
     * @generated
     */
    EClass DAO_DIRECTIVE_POJO = eINSTANCE.getDaoDirectivePojo();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAO_DIRECTIVE_POJO__POJO = eINSTANCE.getDaoDirectivePojo_Pojo();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveConflictImpl <em>Annotation Directive Conflict</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveConflictImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveConflict()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE_CONFLICT = eINSTANCE.getAnnotationDirectiveConflict();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveStaticImpl <em>Annotation Directive Static</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveStaticImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveStatic()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE_STATIC = eINSTANCE.getAnnotationDirectiveStatic();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveConstructorImpl <em>Annotation Directive Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveConstructorImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveConstructor()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE_CONSTRUCTOR = eINSTANCE.getAnnotationDirectiveConstructor();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveStandardImpl <em>Annotation Directive Standard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveStandardImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveStandard()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE_STANDARD = eINSTANCE.getAnnotationDirectiveStandard();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveSetterImpl <em>Annotation Directive Setter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveSetterImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveSetter()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE_SETTER = eINSTANCE.getAnnotationDirectiveSetter();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveGetterImpl <em>Annotation Directive Getter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveGetterImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveGetter()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE_GETTER = eINSTANCE.getAnnotationDirectiveGetter();

    /**
     * The meta object literal for the '{@link org.sqlproc.model.processorModel.impl.AnnotationDirectiveAttributeImpl <em>Annotation Directive Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.model.processorModel.impl.AnnotationDirectiveAttributeImpl
     * @see org.sqlproc.model.processorModel.impl.ProcessorModelPackageImpl#getAnnotationDirectiveAttribute()
     * @generated
     */
    EClass ANNOTATION_DIRECTIVE_ATTRIBUTE = eINSTANCE.getAnnotationDirectiveAttribute();

  }

} //ProcessorModelPackage
