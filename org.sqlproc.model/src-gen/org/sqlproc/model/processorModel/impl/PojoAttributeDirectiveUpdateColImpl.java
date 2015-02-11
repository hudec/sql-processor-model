/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sqlproc.model.processorModel.PojoAttribute;
import org.sqlproc.model.processorModel.PojoAttributeDirectiveUpdateCol;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Attribute Directive Update Col</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveUpdateColImpl#getUpdateColumn1 <em>Update Column1</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoAttributeDirectiveUpdateColImpl#getUpdateColumn2 <em>Update Column2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoAttributeDirectiveUpdateColImpl extends PojoAttributeDirectiveImpl implements PojoAttributeDirectiveUpdateCol
{
  /**
   * The cached value of the '{@link #getUpdateColumn1() <em>Update Column1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateColumn1()
   * @generated
   * @ordered
   */
  protected PojoAttribute updateColumn1;

  /**
   * The cached value of the '{@link #getUpdateColumn2() <em>Update Column2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateColumn2()
   * @generated
   * @ordered
   */
  protected PojoAttribute updateColumn2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoAttributeDirectiveUpdateColImpl()
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
    return ProcessorModelPackage.Literals.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoAttribute getUpdateColumn1()
  {
    if (updateColumn1 != null && updateColumn1.eIsProxy())
    {
      InternalEObject oldUpdateColumn1 = (InternalEObject)updateColumn1;
      updateColumn1 = (PojoAttribute)eResolveProxy(oldUpdateColumn1);
      if (updateColumn1 != oldUpdateColumn1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1, oldUpdateColumn1, updateColumn1));
      }
    }
    return updateColumn1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoAttribute basicGetUpdateColumn1()
  {
    return updateColumn1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateColumn1(PojoAttribute newUpdateColumn1)
  {
    PojoAttribute oldUpdateColumn1 = updateColumn1;
    updateColumn1 = newUpdateColumn1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1, oldUpdateColumn1, updateColumn1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoAttribute getUpdateColumn2()
  {
    if (updateColumn2 != null && updateColumn2.eIsProxy())
    {
      InternalEObject oldUpdateColumn2 = (InternalEObject)updateColumn2;
      updateColumn2 = (PojoAttribute)eResolveProxy(oldUpdateColumn2);
      if (updateColumn2 != oldUpdateColumn2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2, oldUpdateColumn2, updateColumn2));
      }
    }
    return updateColumn2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoAttribute basicGetUpdateColumn2()
  {
    return updateColumn2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateColumn2(PojoAttribute newUpdateColumn2)
  {
    PojoAttribute oldUpdateColumn2 = updateColumn2;
    updateColumn2 = newUpdateColumn2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2, oldUpdateColumn2, updateColumn2));
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
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1:
        if (resolve) return getUpdateColumn1();
        return basicGetUpdateColumn1();
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2:
        if (resolve) return getUpdateColumn2();
        return basicGetUpdateColumn2();
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
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1:
        setUpdateColumn1((PojoAttribute)newValue);
        return;
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2:
        setUpdateColumn2((PojoAttribute)newValue);
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
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1:
        setUpdateColumn1((PojoAttribute)null);
        return;
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2:
        setUpdateColumn2((PojoAttribute)null);
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
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN1:
        return updateColumn1 != null;
      case ProcessorModelPackage.POJO_ATTRIBUTE_DIRECTIVE_UPDATE_COL__UPDATE_COLUMN2:
        return updateColumn2 != null;
    }
    return super.eIsSet(featureID);
  }

} //PojoAttributeDirectiveUpdateColImpl
