/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.sqlproc.model.processorModel.FunctionPojoAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Pojo Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.FunctionPojoAssignementImpl#getDbFunction <em>Db Function</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.FunctionPojoAssignementImpl#getPojo <em>Pojo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionPojoAssignementImpl extends MinimalEObjectImpl.Container implements FunctionPojoAssignement
{
  /**
   * The default value of the '{@link #getDbFunction() <em>Db Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbFunction()
   * @generated
   * @ordered
   */
  protected static final String DB_FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbFunction() <em>Db Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbFunction()
   * @generated
   * @ordered
   */
  protected String dbFunction = DB_FUNCTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPojo() <em>Pojo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPojo()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference pojo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionPojoAssignementImpl()
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
    return ProcessorModelPackage.Literals.FUNCTION_POJO_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbFunction()
  {
    return dbFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbFunction(String newDbFunction)
  {
    String oldDbFunction = dbFunction;
    dbFunction = newDbFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION, oldDbFunction, dbFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getPojo()
  {
    return pojo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPojo(JvmParameterizedTypeReference newPojo, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldPojo = pojo;
    pojo = newPojo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO, oldPojo, newPojo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPojo(JvmParameterizedTypeReference newPojo)
  {
    if (newPojo != pojo)
    {
      NotificationChain msgs = null;
      if (pojo != null)
        msgs = ((InternalEObject)pojo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO, null, msgs);
      if (newPojo != null)
        msgs = ((InternalEObject)newPojo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO, null, msgs);
      msgs = basicSetPojo(newPojo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO, newPojo, newPojo));
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
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO:
        return basicSetPojo(null, msgs);
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
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION:
        return getDbFunction();
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO:
        return getPojo();
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
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION:
        setDbFunction((String)newValue);
        return;
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO:
        setPojo((JvmParameterizedTypeReference)newValue);
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
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION:
        setDbFunction(DB_FUNCTION_EDEFAULT);
        return;
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO:
        setPojo((JvmParameterizedTypeReference)null);
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
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__DB_FUNCTION:
        return DB_FUNCTION_EDEFAULT == null ? dbFunction != null : !DB_FUNCTION_EDEFAULT.equals(dbFunction);
      case ProcessorModelPackage.FUNCTION_POJO_ASSIGNEMENT__POJO:
        return pojo != null;
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
    result.append(" (dbFunction: ");
    result.append(dbFunction);
    result.append(')');
    return result.toString();
  }

} //FunctionPojoAssignementImpl
