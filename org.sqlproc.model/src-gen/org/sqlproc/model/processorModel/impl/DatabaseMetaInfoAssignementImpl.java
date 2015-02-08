/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DatabaseMetaInfoAssignementImpl#getDbMetaInfo <em>Db Meta Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseMetaInfoAssignementImpl extends MinimalEObjectImpl.Container implements DatabaseMetaInfoAssignement
{
  /**
   * The cached value of the '{@link #getDbMetaInfo() <em>Db Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbMetaInfo()
   * @generated
   * @ordered
   */
  protected ValueType dbMetaInfo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseMetaInfoAssignementImpl()
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
    return ProcessorModelPackage.Literals.DATABASE_META_INFO_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbMetaInfo()
  {
    return dbMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbMetaInfo(ValueType newDbMetaInfo, NotificationChain msgs)
  {
    ValueType oldDbMetaInfo = dbMetaInfo;
    dbMetaInfo = newDbMetaInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO, oldDbMetaInfo, newDbMetaInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbMetaInfo(ValueType newDbMetaInfo)
  {
    if (newDbMetaInfo != dbMetaInfo)
    {
      NotificationChain msgs = null;
      if (dbMetaInfo != null)
        msgs = ((InternalEObject)dbMetaInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO, null, msgs);
      if (newDbMetaInfo != null)
        msgs = ((InternalEObject)newDbMetaInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO, null, msgs);
      msgs = basicSetDbMetaInfo(newDbMetaInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO, newDbMetaInfo, newDbMetaInfo));
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
      case ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        return basicSetDbMetaInfo(null, msgs);
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
      case ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        return getDbMetaInfo();
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
      case ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        setDbMetaInfo((ValueType)newValue);
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
      case ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        setDbMetaInfo((ValueType)null);
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
      case ProcessorModelPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        return dbMetaInfo != null;
    }
    return super.eIsSet(featureID);
  }

} //DatabaseMetaInfoAssignementImpl
