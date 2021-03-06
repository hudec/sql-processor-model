/**
 */
package org.sqlproc.model.processorModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.sqlproc.model.processorModel.DatabaseCatalogAssignement;
import org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement;
import org.sqlproc.model.processorModel.DatabaseProperty;
import org.sqlproc.model.processorModel.DatabaseSchemaAssignement;
import org.sqlproc.model.processorModel.DatabaseTypeAssignement;
import org.sqlproc.model.processorModel.DebugLevelAssignement;
import org.sqlproc.model.processorModel.DriverMetaInfoAssignement;
import org.sqlproc.model.processorModel.DriverMethodOutputAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbCatalog <em>Db Catalog</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbDriverx <em>Db Driverx</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbDriver <em>Db Driver</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbExecuteBefore <em>Db Execute Before</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbExecuteAfter <em>Db Execute After</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbIndexTypes <em>Db Index Types</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbMetaInfo <em>Db Meta Info</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbDriverInfo <em>Db Driver Info</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDbMethodsCalls <em>Db Methods Calls</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabasePropertyImpl#getDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabasePropertyImpl extends MinimalEObjectImpl.Container implements DatabaseProperty
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDbUrl() <em>Db Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbUrl()
   * @generated
   * @ordered
   */
  protected ValueType dbUrl;

  /**
   * The cached value of the '{@link #getDbUsername() <em>Db Username</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbUsername()
   * @generated
   * @ordered
   */
  protected ValueType dbUsername;

  /**
   * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbPassword()
   * @generated
   * @ordered
   */
  protected ValueType dbPassword;

  /**
   * The cached value of the '{@link #getDbCatalog() <em>Db Catalog</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbCatalog()
   * @generated
   * @ordered
   */
  protected DatabaseCatalogAssignement dbCatalog;

  /**
   * The cached value of the '{@link #getDbSchema() <em>Db Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSchema()
   * @generated
   * @ordered
   */
  protected DatabaseSchemaAssignement dbSchema;

  /**
   * The cached value of the '{@link #getDbDriverx() <em>Db Driverx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriverx()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference dbDriverx;

  /**
   * The cached value of the '{@link #getDbDriver() <em>Db Driver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriver()
   * @generated
   * @ordered
   */
  protected ValueType dbDriver;

  /**
   * The cached value of the '{@link #getDbExecuteBefore() <em>Db Execute Before</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbExecuteBefore()
   * @generated
   * @ordered
   */
  protected ValueType dbExecuteBefore;

  /**
   * The cached value of the '{@link #getDbExecuteAfter() <em>Db Execute After</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbExecuteAfter()
   * @generated
   * @ordered
   */
  protected ValueType dbExecuteAfter;

  /**
   * The cached value of the '{@link #getDbIndexTypes() <em>Db Index Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbIndexTypes()
   * @generated
   * @ordered
   */
  protected ValueType dbIndexTypes;

  /**
   * The cached value of the '{@link #getDbType() <em>Db Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbType()
   * @generated
   * @ordered
   */
  protected DatabaseTypeAssignement dbType;

  /**
   * The cached value of the '{@link #getDbMetaInfo() <em>Db Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbMetaInfo()
   * @generated
   * @ordered
   */
  protected DatabaseMetaInfoAssignement dbMetaInfo;

  /**
   * The cached value of the '{@link #getDbDriverInfo() <em>Db Driver Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriverInfo()
   * @generated
   * @ordered
   */
  protected DriverMetaInfoAssignement dbDriverInfo;

  /**
   * The cached value of the '{@link #getDbMethodsCalls() <em>Db Methods Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbMethodsCalls()
   * @generated
   * @ordered
   */
  protected EList<DriverMethodOutputAssignement> dbMethodsCalls;

  /**
   * The cached value of the '{@link #getDebug() <em>Debug</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected DebugLevelAssignement debug;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabasePropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProcessorModelPackage.Literals.DATABASE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbUrl()
  {
    return dbUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbUrl(ValueType newDbUrl, NotificationChain msgs)
  {
    ValueType oldDbUrl = dbUrl;
    dbUrl = newDbUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_URL, oldDbUrl, newDbUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbUrl(ValueType newDbUrl)
  {
    if (newDbUrl != dbUrl)
    {
      NotificationChain msgs = null;
      if (dbUrl != null)
        msgs = ((InternalEObject)dbUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_URL, null, msgs);
      if (newDbUrl != null)
        msgs = ((InternalEObject)newDbUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_URL, null, msgs);
      msgs = basicSetDbUrl(newDbUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_URL, newDbUrl, newDbUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbUsername()
  {
    return dbUsername;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbUsername(ValueType newDbUsername, NotificationChain msgs)
  {
    ValueType oldDbUsername = dbUsername;
    dbUsername = newDbUsername;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME, oldDbUsername, newDbUsername);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbUsername(ValueType newDbUsername)
  {
    if (newDbUsername != dbUsername)
    {
      NotificationChain msgs = null;
      if (dbUsername != null)
        msgs = ((InternalEObject)dbUsername).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME, null, msgs);
      if (newDbUsername != null)
        msgs = ((InternalEObject)newDbUsername).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME, null, msgs);
      msgs = basicSetDbUsername(newDbUsername, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME, newDbUsername, newDbUsername));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbPassword()
  {
    return dbPassword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbPassword(ValueType newDbPassword, NotificationChain msgs)
  {
    ValueType oldDbPassword = dbPassword;
    dbPassword = newDbPassword;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD, oldDbPassword, newDbPassword);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbPassword(ValueType newDbPassword)
  {
    if (newDbPassword != dbPassword)
    {
      NotificationChain msgs = null;
      if (dbPassword != null)
        msgs = ((InternalEObject)dbPassword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD, null, msgs);
      if (newDbPassword != null)
        msgs = ((InternalEObject)newDbPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD, null, msgs);
      msgs = basicSetDbPassword(newDbPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD, newDbPassword, newDbPassword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseCatalogAssignement getDbCatalog()
  {
    return dbCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbCatalog(DatabaseCatalogAssignement newDbCatalog, NotificationChain msgs)
  {
    DatabaseCatalogAssignement oldDbCatalog = dbCatalog;
    dbCatalog = newDbCatalog;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG, oldDbCatalog, newDbCatalog);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbCatalog(DatabaseCatalogAssignement newDbCatalog)
  {
    if (newDbCatalog != dbCatalog)
    {
      NotificationChain msgs = null;
      if (dbCatalog != null)
        msgs = ((InternalEObject)dbCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG, null, msgs);
      if (newDbCatalog != null)
        msgs = ((InternalEObject)newDbCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG, null, msgs);
      msgs = basicSetDbCatalog(newDbCatalog, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG, newDbCatalog, newDbCatalog));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseSchemaAssignement getDbSchema()
  {
    return dbSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbSchema(DatabaseSchemaAssignement newDbSchema, NotificationChain msgs)
  {
    DatabaseSchemaAssignement oldDbSchema = dbSchema;
    dbSchema = newDbSchema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA, oldDbSchema, newDbSchema);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbSchema(DatabaseSchemaAssignement newDbSchema)
  {
    if (newDbSchema != dbSchema)
    {
      NotificationChain msgs = null;
      if (dbSchema != null)
        msgs = ((InternalEObject)dbSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA, null, msgs);
      if (newDbSchema != null)
        msgs = ((InternalEObject)newDbSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA, null, msgs);
      msgs = basicSetDbSchema(newDbSchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA, newDbSchema, newDbSchema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getDbDriverx()
  {
    return dbDriverx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbDriverx(JvmParameterizedTypeReference newDbDriverx, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldDbDriverx = dbDriverx;
    dbDriverx = newDbDriverx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX, oldDbDriverx, newDbDriverx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbDriverx(JvmParameterizedTypeReference newDbDriverx)
  {
    if (newDbDriverx != dbDriverx)
    {
      NotificationChain msgs = null;
      if (dbDriverx != null)
        msgs = ((InternalEObject)dbDriverx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX, null, msgs);
      if (newDbDriverx != null)
        msgs = ((InternalEObject)newDbDriverx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX, null, msgs);
      msgs = basicSetDbDriverx(newDbDriverx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX, newDbDriverx, newDbDriverx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbDriver()
  {
    return dbDriver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbDriver(ValueType newDbDriver, NotificationChain msgs)
  {
    ValueType oldDbDriver = dbDriver;
    dbDriver = newDbDriver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER, oldDbDriver, newDbDriver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbDriver(ValueType newDbDriver)
  {
    if (newDbDriver != dbDriver)
    {
      NotificationChain msgs = null;
      if (dbDriver != null)
        msgs = ((InternalEObject)dbDriver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER, null, msgs);
      if (newDbDriver != null)
        msgs = ((InternalEObject)newDbDriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER, null, msgs);
      msgs = basicSetDbDriver(newDbDriver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER, newDbDriver, newDbDriver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbExecuteBefore()
  {
    return dbExecuteBefore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbExecuteBefore(ValueType newDbExecuteBefore, NotificationChain msgs)
  {
    ValueType oldDbExecuteBefore = dbExecuteBefore;
    dbExecuteBefore = newDbExecuteBefore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE, oldDbExecuteBefore, newDbExecuteBefore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbExecuteBefore(ValueType newDbExecuteBefore)
  {
    if (newDbExecuteBefore != dbExecuteBefore)
    {
      NotificationChain msgs = null;
      if (dbExecuteBefore != null)
        msgs = ((InternalEObject)dbExecuteBefore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE, null, msgs);
      if (newDbExecuteBefore != null)
        msgs = ((InternalEObject)newDbExecuteBefore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE, null, msgs);
      msgs = basicSetDbExecuteBefore(newDbExecuteBefore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE, newDbExecuteBefore, newDbExecuteBefore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbExecuteAfter()
  {
    return dbExecuteAfter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbExecuteAfter(ValueType newDbExecuteAfter, NotificationChain msgs)
  {
    ValueType oldDbExecuteAfter = dbExecuteAfter;
    dbExecuteAfter = newDbExecuteAfter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER, oldDbExecuteAfter, newDbExecuteAfter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbExecuteAfter(ValueType newDbExecuteAfter)
  {
    if (newDbExecuteAfter != dbExecuteAfter)
    {
      NotificationChain msgs = null;
      if (dbExecuteAfter != null)
        msgs = ((InternalEObject)dbExecuteAfter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER, null, msgs);
      if (newDbExecuteAfter != null)
        msgs = ((InternalEObject)newDbExecuteAfter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER, null, msgs);
      msgs = basicSetDbExecuteAfter(newDbExecuteAfter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER, newDbExecuteAfter, newDbExecuteAfter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbIndexTypes()
  {
    return dbIndexTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbIndexTypes(ValueType newDbIndexTypes, NotificationChain msgs)
  {
    ValueType oldDbIndexTypes = dbIndexTypes;
    dbIndexTypes = newDbIndexTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES, oldDbIndexTypes, newDbIndexTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbIndexTypes(ValueType newDbIndexTypes)
  {
    if (newDbIndexTypes != dbIndexTypes)
    {
      NotificationChain msgs = null;
      if (dbIndexTypes != null)
        msgs = ((InternalEObject)dbIndexTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES, null, msgs);
      if (newDbIndexTypes != null)
        msgs = ((InternalEObject)newDbIndexTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES, null, msgs);
      msgs = basicSetDbIndexTypes(newDbIndexTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES, newDbIndexTypes, newDbIndexTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTypeAssignement getDbType()
  {
    return dbType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbType(DatabaseTypeAssignement newDbType, NotificationChain msgs)
  {
    DatabaseTypeAssignement oldDbType = dbType;
    dbType = newDbType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE, oldDbType, newDbType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbType(DatabaseTypeAssignement newDbType)
  {
    if (newDbType != dbType)
    {
      NotificationChain msgs = null;
      if (dbType != null)
        msgs = ((InternalEObject)dbType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE, null, msgs);
      if (newDbType != null)
        msgs = ((InternalEObject)newDbType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE, null, msgs);
      msgs = basicSetDbType(newDbType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE, newDbType, newDbType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseMetaInfoAssignement getDbMetaInfo()
  {
    return dbMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbMetaInfo(DatabaseMetaInfoAssignement newDbMetaInfo, NotificationChain msgs)
  {
    DatabaseMetaInfoAssignement oldDbMetaInfo = dbMetaInfo;
    dbMetaInfo = newDbMetaInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO, oldDbMetaInfo, newDbMetaInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbMetaInfo(DatabaseMetaInfoAssignement newDbMetaInfo)
  {
    if (newDbMetaInfo != dbMetaInfo)
    {
      NotificationChain msgs = null;
      if (dbMetaInfo != null)
        msgs = ((InternalEObject)dbMetaInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO, null, msgs);
      if (newDbMetaInfo != null)
        msgs = ((InternalEObject)newDbMetaInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO, null, msgs);
      msgs = basicSetDbMetaInfo(newDbMetaInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO, newDbMetaInfo, newDbMetaInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DriverMetaInfoAssignement getDbDriverInfo()
  {
    return dbDriverInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbDriverInfo(DriverMetaInfoAssignement newDbDriverInfo, NotificationChain msgs)
  {
    DriverMetaInfoAssignement oldDbDriverInfo = dbDriverInfo;
    dbDriverInfo = newDbDriverInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, oldDbDriverInfo, newDbDriverInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbDriverInfo(DriverMetaInfoAssignement newDbDriverInfo)
  {
    if (newDbDriverInfo != dbDriverInfo)
    {
      NotificationChain msgs = null;
      if (dbDriverInfo != null)
        msgs = ((InternalEObject)dbDriverInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, null, msgs);
      if (newDbDriverInfo != null)
        msgs = ((InternalEObject)newDbDriverInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, null, msgs);
      msgs = basicSetDbDriverInfo(newDbDriverInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, newDbDriverInfo, newDbDriverInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DriverMethodOutputAssignement> getDbMethodsCalls()
  {
    if (dbMethodsCalls == null)
    {
      dbMethodsCalls = new EObjectContainmentEList<DriverMethodOutputAssignement>(DriverMethodOutputAssignement.class, this, ProcessorModelPackage.DATABASE_PROPERTY__DB_METHODS_CALLS);
    }
    return dbMethodsCalls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugLevelAssignement getDebug()
  {
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDebug(DebugLevelAssignement newDebug, NotificationChain msgs)
  {
    DebugLevelAssignement oldDebug = debug;
    debug = newDebug;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DEBUG, oldDebug, newDebug);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDebug(DebugLevelAssignement newDebug)
  {
    if (newDebug != debug)
    {
      NotificationChain msgs = null;
      if (debug != null)
        msgs = ((InternalEObject)debug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DEBUG, null, msgs);
      if (newDebug != null)
        msgs = ((InternalEObject)newDebug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_PROPERTY__DEBUG, null, msgs);
      msgs = basicSetDebug(newDebug, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_PROPERTY__DEBUG, newDebug, newDebug));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_URL:
        return basicSetDbUrl(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME:
        return basicSetDbUsername(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD:
        return basicSetDbPassword(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG:
        return basicSetDbCatalog(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA:
        return basicSetDbSchema(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX:
        return basicSetDbDriverx(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER:
        return basicSetDbDriver(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        return basicSetDbExecuteBefore(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        return basicSetDbExecuteAfter(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        return basicSetDbIndexTypes(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE:
        return basicSetDbType(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO:
        return basicSetDbMetaInfo(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        return basicSetDbDriverInfo(null, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        return ((InternalEList<?>)getDbMethodsCalls()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.DATABASE_PROPERTY__DEBUG:
        return basicSetDebug(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.DATABASE_PROPERTY__NAME:
        return getName();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_URL:
        return getDbUrl();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME:
        return getDbUsername();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD:
        return getDbPassword();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG:
        return getDbCatalog();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA:
        return getDbSchema();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX:
        return getDbDriverx();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER:
        return getDbDriver();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        return getDbExecuteBefore();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        return getDbExecuteAfter();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        return getDbIndexTypes();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE:
        return getDbType();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO:
        return getDbMetaInfo();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        return getDbDriverInfo();
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        return getDbMethodsCalls();
      case ProcessorModelPackage.DATABASE_PROPERTY__DEBUG:
        return getDebug();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.DATABASE_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_URL:
        setDbUrl((ValueType)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME:
        setDbUsername((ValueType)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD:
        setDbPassword((ValueType)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG:
        setDbCatalog((DatabaseCatalogAssignement)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA:
        setDbSchema((DatabaseSchemaAssignement)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX:
        setDbDriverx((JvmParameterizedTypeReference)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER:
        setDbDriver((ValueType)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        setDbExecuteBefore((ValueType)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        setDbExecuteAfter((ValueType)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        setDbIndexTypes((ValueType)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE:
        setDbType((DatabaseTypeAssignement)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO:
        setDbMetaInfo((DatabaseMetaInfoAssignement)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        setDbDriverInfo((DriverMetaInfoAssignement)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        getDbMethodsCalls().clear();
        getDbMethodsCalls().addAll((Collection<? extends DriverMethodOutputAssignement>)newValue);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DEBUG:
        setDebug((DebugLevelAssignement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.DATABASE_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_URL:
        setDbUrl((ValueType)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME:
        setDbUsername((ValueType)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD:
        setDbPassword((ValueType)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG:
        setDbCatalog((DatabaseCatalogAssignement)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA:
        setDbSchema((DatabaseSchemaAssignement)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX:
        setDbDriverx((JvmParameterizedTypeReference)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER:
        setDbDriver((ValueType)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        setDbExecuteBefore((ValueType)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        setDbExecuteAfter((ValueType)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        setDbIndexTypes((ValueType)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE:
        setDbType((DatabaseTypeAssignement)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO:
        setDbMetaInfo((DatabaseMetaInfoAssignement)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        setDbDriverInfo((DriverMetaInfoAssignement)null);
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        getDbMethodsCalls().clear();
        return;
      case ProcessorModelPackage.DATABASE_PROPERTY__DEBUG:
        setDebug((DebugLevelAssignement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.DATABASE_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_URL:
        return dbUrl != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_USERNAME:
        return dbUsername != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_PASSWORD:
        return dbPassword != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_CATALOG:
        return dbCatalog != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_SCHEMA:
        return dbSchema != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVERX:
        return dbDriverx != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER:
        return dbDriver != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        return dbExecuteBefore != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        return dbExecuteAfter != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        return dbIndexTypes != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_TYPE:
        return dbType != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_META_INFO:
        return dbMetaInfo != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        return dbDriverInfo != null;
      case ProcessorModelPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        return dbMethodsCalls != null && !dbMethodsCalls.isEmpty();
      case ProcessorModelPackage.DATABASE_PROPERTY__DEBUG:
        return debug != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DatabasePropertyImpl
