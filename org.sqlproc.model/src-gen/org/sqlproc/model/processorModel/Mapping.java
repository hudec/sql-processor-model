/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.Mapping#getMappingItems <em>Mapping Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapping Items</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.MappingItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Items</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMapping_MappingItems()
   * @model containment="true"
   * @generated
   */
  EList<MappingItem> getMappingItems();

} // Mapping
