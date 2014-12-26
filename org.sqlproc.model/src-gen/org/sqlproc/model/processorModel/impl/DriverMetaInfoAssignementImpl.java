/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.model.processorModel.DriverMetaInfoAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

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
   * The default value of the '{@link #getDbDriverInfo() <em>Db Driver Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriverInfo()
   * @generated
   * @ordered
   */
  protected static final String DB_DRIVER_INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbDriverInfo() <em>Db Driver Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriverInfo()
   * @generated
   * @ordered
   */
  protected String dbDriverInfo = DB_DRIVER_INFO_EDEFAULT;

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
  public String getDbDriverInfo()
  {
    return dbDriverInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbDriverInfo(String newDbDriverInfo)
  {
    String oldDbDriverInfo = dbDriverInfo;
    dbDriverInfo = newDbDriverInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO, oldDbDriverInfo, dbDriverInfo));
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
        setDbDriverInfo((String)newValue);
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
        setDbDriverInfo(DB_DRIVER_INFO_EDEFAULT);
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
        return DB_DRIVER_INFO_EDEFAULT == null ? dbDriverInfo != null : !DB_DRIVER_INFO_EDEFAULT.equals(dbDriverInfo);
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
    result.append(" (dbDriverInfo: ");
    result.append(dbDriverInfo);
    result.append(')');
    return result.toString();
  }

} //DriverMetaInfoAssignementImpl
