/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.model.processorModel.DriverMetaInfoAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DriverMetaInfoAssignementImpl#getDbDriverInfo <em>Db Driver Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriverMetaInfoAssignementImpl extends MinimalEObjectImpl.Container implements DriverMetaInfoAssignement
{
  /**
   * The cached value of the '{@link #getDbDriverInfo() <em>Db Driver Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriverInfo()
   * @generated
   * @ordered
   */
  protected ValueType dbDriverInfo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DriverMetaInfoAssignementImpl()
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
    return ProcessorModelPackage.Literals.DRIVER_META_INFO_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getDbDriverInfo()
  {
    return dbDriverInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbDriverInfo(ValueType newDbDriverInfo, NotificationChain msgs)
  {
    ValueType oldDbDriverInfo = dbDriverInfo;
    dbDriverInfo = newDbDriverInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO, oldDbDriverInfo, newDbDriverInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbDriverInfo(ValueType newDbDriverInfo)
  {
    if (newDbDriverInfo != dbDriverInfo)
    {
      NotificationChain msgs = null;
      if (dbDriverInfo != null)
        msgs = ((InternalEObject)dbDriverInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO, null, msgs);
      if (newDbDriverInfo != null)
        msgs = ((InternalEObject)newDbDriverInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO, null, msgs);
      msgs = basicSetDbDriverInfo(newDbDriverInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO, newDbDriverInfo, newDbDriverInfo));
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
      case ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO:
        return basicSetDbDriverInfo(null, msgs);
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
      case ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO:
        return getDbDriverInfo();
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
      case ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO:
        setDbDriverInfo((ValueType)newValue);
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
      case ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO:
        setDbDriverInfo((ValueType)null);
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
      case ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO:
        return dbDriverInfo != null;
    }
    return super.eIsSet(featureID);
  }

} //DriverMetaInfoAssignementImpl
