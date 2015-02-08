/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbCatalog <em>Db Catalog</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverx <em>Db Driverx</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriver <em>Db Driver</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteBefore <em>Db Execute Before</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteAfter <em>Db Execute After</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbIndexTypes <em>Db Index Types</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbType <em>Db Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbMetaInfo <em>Db Meta Info</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverInfo <em>Db Driver Info</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbMethodsCalls <em>Db Methods Calls</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseProperty#getDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty()
 * @model
 * @generated
 */
public interface DatabaseProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Db Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Url</em>' containment reference.
   * @see #setDbUrl(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbUrl()
   * @model containment="true"
   * @generated
   */
  ValueType getDbUrl();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbUrl <em>Db Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Url</em>' containment reference.
   * @see #getDbUrl()
   * @generated
   */
  void setDbUrl(ValueType value);

  /**
   * Returns the value of the '<em><b>Db Username</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Username</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Username</em>' containment reference.
   * @see #setDbUsername(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbUsername()
   * @model containment="true"
   * @generated
   */
  ValueType getDbUsername();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbUsername <em>Db Username</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Username</em>' containment reference.
   * @see #getDbUsername()
   * @generated
   */
  void setDbUsername(ValueType value);

  /**
   * Returns the value of the '<em><b>Db Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Password</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Password</em>' containment reference.
   * @see #setDbPassword(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbPassword()
   * @model containment="true"
   * @generated
   */
  ValueType getDbPassword();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbPassword <em>Db Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Password</em>' containment reference.
   * @see #getDbPassword()
   * @generated
   */
  void setDbPassword(ValueType value);

  /**
   * Returns the value of the '<em><b>Db Catalog</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Catalog</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Catalog</em>' containment reference.
   * @see #setDbCatalog(DatabaseCatalogAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbCatalog()
   * @model containment="true"
   * @generated
   */
  DatabaseCatalogAssignement getDbCatalog();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbCatalog <em>Db Catalog</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Catalog</em>' containment reference.
   * @see #getDbCatalog()
   * @generated
   */
  void setDbCatalog(DatabaseCatalogAssignement value);

  /**
   * Returns the value of the '<em><b>Db Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Schema</em>' containment reference.
   * @see #setDbSchema(DatabaseSchemaAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbSchema()
   * @model containment="true"
   * @generated
   */
  DatabaseSchemaAssignement getDbSchema();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbSchema <em>Db Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Schema</em>' containment reference.
   * @see #getDbSchema()
   * @generated
   */
  void setDbSchema(DatabaseSchemaAssignement value);

  /**
   * Returns the value of the '<em><b>Db Driverx</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Driverx</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Driverx</em>' reference.
   * @see #setDbDriverx(JvmType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbDriverx()
   * @model
   * @generated
   */
  JvmType getDbDriverx();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverx <em>Db Driverx</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driverx</em>' reference.
   * @see #getDbDriverx()
   * @generated
   */
  void setDbDriverx(JvmType value);

  /**
   * Returns the value of the '<em><b>Db Driver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Driver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Driver</em>' containment reference.
   * @see #setDbDriver(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbDriver()
   * @model containment="true"
   * @generated
   */
  ValueType getDbDriver();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriver <em>Db Driver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driver</em>' containment reference.
   * @see #getDbDriver()
   * @generated
   */
  void setDbDriver(ValueType value);

  /**
   * Returns the value of the '<em><b>Db Execute Before</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Execute Before</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Execute Before</em>' containment reference.
   * @see #setDbExecuteBefore(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbExecuteBefore()
   * @model containment="true"
   * @generated
   */
  ValueType getDbExecuteBefore();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteBefore <em>Db Execute Before</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Execute Before</em>' containment reference.
   * @see #getDbExecuteBefore()
   * @generated
   */
  void setDbExecuteBefore(ValueType value);

  /**
   * Returns the value of the '<em><b>Db Execute After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Execute After</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Execute After</em>' containment reference.
   * @see #setDbExecuteAfter(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbExecuteAfter()
   * @model containment="true"
   * @generated
   */
  ValueType getDbExecuteAfter();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbExecuteAfter <em>Db Execute After</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Execute After</em>' containment reference.
   * @see #getDbExecuteAfter()
   * @generated
   */
  void setDbExecuteAfter(ValueType value);

  /**
   * Returns the value of the '<em><b>Db Index Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Index Types</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Index Types</em>' containment reference.
   * @see #setDbIndexTypes(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbIndexTypes()
   * @model containment="true"
   * @generated
   */
  ValueType getDbIndexTypes();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbIndexTypes <em>Db Index Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Index Types</em>' containment reference.
   * @see #getDbIndexTypes()
   * @generated
   */
  void setDbIndexTypes(ValueType value);

  /**
   * Returns the value of the '<em><b>Db Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Type</em>' containment reference.
   * @see #setDbType(DatabaseTypeAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbType()
   * @model containment="true"
   * @generated
   */
  DatabaseTypeAssignement getDbType();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbType <em>Db Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Type</em>' containment reference.
   * @see #getDbType()
   * @generated
   */
  void setDbType(DatabaseTypeAssignement value);

  /**
   * Returns the value of the '<em><b>Db Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Meta Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Meta Info</em>' containment reference.
   * @see #setDbMetaInfo(DatabaseMetaInfoAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbMetaInfo()
   * @model containment="true"
   * @generated
   */
  DatabaseMetaInfoAssignement getDbMetaInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbMetaInfo <em>Db Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Meta Info</em>' containment reference.
   * @see #getDbMetaInfo()
   * @generated
   */
  void setDbMetaInfo(DatabaseMetaInfoAssignement value);

  /**
   * Returns the value of the '<em><b>Db Driver Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Driver Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Driver Info</em>' containment reference.
   * @see #setDbDriverInfo(DriverMetaInfoAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbDriverInfo()
   * @model containment="true"
   * @generated
   */
  DriverMetaInfoAssignement getDbDriverInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDbDriverInfo <em>Db Driver Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driver Info</em>' containment reference.
   * @see #getDbDriverInfo()
   * @generated
   */
  void setDbDriverInfo(DriverMetaInfoAssignement value);

  /**
   * Returns the value of the '<em><b>Db Methods Calls</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Methods Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Methods Calls</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_DbMethodsCalls()
   * @model containment="true"
   * @generated
   */
  EList<DriverMethodOutputAssignement> getDbMethodsCalls();

  /**
   * Returns the value of the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' containment reference.
   * @see #setDebug(DebugLevelAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseProperty_Debug()
   * @model containment="true"
   * @generated
   */
  DebugLevelAssignement getDebug();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseProperty#getDebug <em>Debug</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' containment reference.
   * @see #getDebug()
   * @generated
   */
  void setDebug(DebugLevelAssignement value);

} // DatabaseProperty
