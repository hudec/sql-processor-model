/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.model.processorModel.DatabaseCatalogAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.PropertyValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Catalog Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabaseCatalogAssignementImpl#getDbCatalog <em>Db Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseCatalogAssignementImpl extends MinimalEObjectImpl.Container implements DatabaseCatalogAssignement
{
  /**
   * The cached value of the '{@link #getDbCatalog() <em>Db Catalog</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbCatalog()
   * @generated
   * @ordered
   */
  protected PropertyValue dbCatalog;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseCatalogAssignementImpl()
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
    return ProcessorModelPackage.Literals.DATABASE_CATALOG_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValue getDbCatalog()
  {
    return dbCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbCatalog(PropertyValue newDbCatalog, NotificationChain msgs)
  {
    PropertyValue oldDbCatalog = dbCatalog;
    dbCatalog = newDbCatalog;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG, oldDbCatalog, newDbCatalog);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbCatalog(PropertyValue newDbCatalog)
  {
    if (newDbCatalog != dbCatalog)
    {
      NotificationChain msgs = null;
      if (dbCatalog != null)
        msgs = ((InternalEObject)dbCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG, null, msgs);
      if (newDbCatalog != null)
        msgs = ((InternalEObject)newDbCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG, null, msgs);
      msgs = basicSetDbCatalog(newDbCatalog, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG, newDbCatalog, newDbCatalog));
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
      case ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        return basicSetDbCatalog(null, msgs);
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
      case ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        return getDbCatalog();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        setDbCatalog((PropertyValue)newValue);
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
      case ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        setDbCatalog((PropertyValue)null);
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
      case ProcessorModelPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        return dbCatalog != null;
    }
    return super.eIsSet(featureID);
  }

} //DatabaseCatalogAssignementImpl
