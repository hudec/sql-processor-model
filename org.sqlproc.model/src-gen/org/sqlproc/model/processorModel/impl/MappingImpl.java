/**
 */
package org.sqlproc.model.processorModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.model.processorModel.Mapping;
import org.sqlproc.model.processorModel.MappingItem;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.MappingImpl#getMappingItems <em>Mapping Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping
{
  /**
   * The cached value of the '{@link #getMappingItems() <em>Mapping Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingItems()
   * @generated
   * @ordered
   */
  protected EList<MappingItem> mappingItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return ProcessorModelPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappingItem> getMappingItems()
  {
    if (mappingItems == null)
    {
      mappingItems = new EObjectContainmentEList<MappingItem>(MappingItem.class, this, ProcessorModelPackage.MAPPING__MAPPING_ITEMS);
    }
    return mappingItems;
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
      case ProcessorModelPackage.MAPPING__MAPPING_ITEMS:
        return ((InternalEList<?>)getMappingItems()).basicRemove(otherEnd, msgs);
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
      case ProcessorModelPackage.MAPPING__MAPPING_ITEMS:
        return getMappingItems();
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
      case ProcessorModelPackage.MAPPING__MAPPING_ITEMS:
        getMappingItems().clear();
        getMappingItems().addAll((Collection<? extends MappingItem>)newValue);
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
      case ProcessorModelPackage.MAPPING__MAPPING_ITEMS:
        getMappingItems().clear();
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
      case ProcessorModelPackage.MAPPING__MAPPING_ITEMS:
        return mappingItems != null && !mappingItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
