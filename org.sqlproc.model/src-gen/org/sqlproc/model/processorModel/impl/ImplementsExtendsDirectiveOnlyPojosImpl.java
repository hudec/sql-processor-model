/**
 */
package org.sqlproc.model.processorModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implements Extends Directive Only Pojos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ImplementsExtendsDirectiveOnlyPojosImpl#getOnlyPojos <em>Only Pojos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementsExtendsDirectiveOnlyPojosImpl extends ImplementsExtendsDirectiveImpl implements ImplementsExtendsDirectiveOnlyPojos
{
  /**
   * The cached value of the '{@link #getOnlyPojos() <em>Only Pojos</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnlyPojos()
   * @generated
   * @ordered
   */
  protected EList<PojoEntity> onlyPojos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementsExtendsDirectiveOnlyPojosImpl()
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
    return ProcessorModelPackage.Literals.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoEntity> getOnlyPojos()
  {
    if (onlyPojos == null)
    {
      onlyPojos = new EObjectResolvingEList<PojoEntity>(PojoEntity.class, this, ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS__ONLY_POJOS);
    }
    return onlyPojos;
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS__ONLY_POJOS:
        return getOnlyPojos();
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS__ONLY_POJOS:
        getOnlyPojos().clear();
        getOnlyPojos().addAll((Collection<? extends PojoEntity>)newValue);
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS__ONLY_POJOS:
        getOnlyPojos().clear();
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
      case ProcessorModelPackage.IMPLEMENTS_EXTENDS_DIRECTIVE_ONLY_POJOS__ONLY_POJOS:
        return onlyPojos != null && !onlyPojos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImplementsExtendsDirectiveOnlyPojosImpl
