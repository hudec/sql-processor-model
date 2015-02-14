/**
 */
package org.sqlproc.model.processorModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implements Extends Directive Except Pojos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveExceptPojosImpl#getExceptPojos <em>Except Pojos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementsExtendsDirectiveExceptPojosImpl extends ImplementsExtendsDirectiveImpl implements ImplementsExtendsDirectiveExceptPojos
{
  /**
   * The cached value of the '{@link #getExceptPojos() <em>Except Pojos</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptPojos()
   * @generated
   * @ordered
   */
  protected EList<PojoEntity> exceptPojos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementsExtendsDirectiveExceptPojosImpl()
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
    return ProcessorModelPackage.Literals.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoEntity> getExceptPojos()
  {
    if (exceptPojos == null)
    {
      exceptPojos = new EObjectResolvingEList<PojoEntity>(PojoEntity.class, this, ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS__EXCEPT_POJOS);
    }
    return exceptPojos;
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS__EXCEPT_POJOS:
        return getExceptPojos();
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS__EXCEPT_POJOS:
        getExceptPojos().clear();
        getExceptPojos().addAll((Collection<? extends PojoEntity>)newValue);
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS__EXCEPT_POJOS:
        getExceptPojos().clear();
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_EXCEPT_POJOS__EXCEPT_POJOS:
        return exceptPojos != null && !exceptPojos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImplementsExtendsDirectiveExceptPojosImpl
