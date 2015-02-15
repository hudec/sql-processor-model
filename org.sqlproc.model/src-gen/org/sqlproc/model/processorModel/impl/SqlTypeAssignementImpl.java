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

import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.SqlTypeAssignement;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Type Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.SqlTypeAssignementImpl#getSqlType <em>Sql Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.SqlTypeAssignementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlTypeAssignementImpl extends MinimalEObjectImpl.Container implements SqlTypeAssignement
{
  /**
   * The cached value of the '{@link #getSqlType() <em>Sql Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSqlType()
   * @generated
   * @ordered
   */
  protected ValueType sqlType;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SqlTypeAssignementImpl()
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
    return ProcessorModelPackage.Literals.SQL_TYPE_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getSqlType()
  {
    return sqlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSqlType(ValueType newSqlType, NotificationChain msgs)
  {
    ValueType oldSqlType = sqlType;
    sqlType = newSqlType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE, oldSqlType, newSqlType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSqlType(ValueType newSqlType)
  {
    if (newSqlType != sqlType)
    {
      NotificationChain msgs = null;
      if (sqlType != null)
        msgs = ((InternalEObject)sqlType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE, null, msgs);
      if (newSqlType != null)
        msgs = ((InternalEObject)newSqlType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE, null, msgs);
      msgs = basicSetSqlType(newSqlType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE, newSqlType, newSqlType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmParameterizedTypeReference newType, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmParameterizedTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE, newType, newType));
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
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE:
        return basicSetSqlType(null, msgs);
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE:
        return basicSetType(null, msgs);
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
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE:
        return getSqlType();
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE:
        return getType();
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
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE:
        setSqlType((ValueType)newValue);
        return;
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE:
        setType((JvmParameterizedTypeReference)newValue);
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
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE:
        setSqlType((ValueType)null);
        return;
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE:
        setType((JvmParameterizedTypeReference)null);
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
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__SQL_TYPE:
        return sqlType != null;
      case ProcessorModelPackage.SQL_TYPE_ASSIGNEMENT__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //SqlTypeAssignementImpl
