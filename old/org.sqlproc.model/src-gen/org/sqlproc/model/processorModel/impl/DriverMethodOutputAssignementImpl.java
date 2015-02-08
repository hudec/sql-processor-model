/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.model.processorModel.DriverMethodOutputAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Method Output Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DriverMethodOutputAssignementImpl#getDriverMethod <em>Driver Method</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DriverMethodOutputAssignementImpl#getCallOutput <em>Call Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriverMethodOutputAssignementImpl extends MinimalEObjectImpl.Container implements DriverMethodOutputAssignement
{
  /**
   * The default value of the '{@link #getDriverMethod() <em>Driver Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriverMethod()
   * @generated
   * @ordered
   */
  protected static final String DRIVER_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDriverMethod() <em>Driver Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriverMethod()
   * @generated
   * @ordered
   */
  protected String driverMethod = DRIVER_METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getCallOutput() <em>Call Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallOutput()
   * @generated
   * @ordered
   */
  protected ValueType callOutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DriverMethodOutputAssignementImpl()
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
    return ProcessorModelPackage.Literals.DRIVER_METHOD_OUTPUT_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDriverMethod()
  {
    return driverMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDriverMethod(String newDriverMethod)
  {
    String oldDriverMethod = driverMethod;
    driverMethod = newDriverMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD, oldDriverMethod, driverMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getCallOutput()
  {
    return callOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCallOutput(ValueType newCallOutput, NotificationChain msgs)
  {
    ValueType oldCallOutput = callOutput;
    callOutput = newCallOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT, oldCallOutput, newCallOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallOutput(ValueType newCallOutput)
  {
    if (newCallOutput != callOutput)
    {
      NotificationChain msgs = null;
      if (callOutput != null)
        msgs = ((InternalEObject)callOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT, null, msgs);
      if (newCallOutput != null)
        msgs = ((InternalEObject)newCallOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT, null, msgs);
      msgs = basicSetCallOutput(newCallOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT, newCallOutput, newCallOutput));
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
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        return basicSetCallOutput(null, msgs);
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
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        return getDriverMethod();
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        return getCallOutput();
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
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        setDriverMethod((String)newValue);
        return;
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        setCallOutput((ValueType)newValue);
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
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        setDriverMethod(DRIVER_METHOD_EDEFAULT);
        return;
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        setCallOutput((ValueType)null);
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
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        return DRIVER_METHOD_EDEFAULT == null ? driverMethod != null : !DRIVER_METHOD_EDEFAULT.equals(driverMethod);
      case ProcessorModelPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        return callOutput != null;
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
    result.append(" (driverMethod: ");
    result.append(driverMethod);
    result.append(')');
    return result.toString();
  }

} //DriverMethodOutputAssignementImpl
