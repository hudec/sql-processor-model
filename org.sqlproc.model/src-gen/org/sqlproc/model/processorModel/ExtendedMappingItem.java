/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Mapping Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.ExtendedMappingItem#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.ExtendedMappingItem#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getExtendedMappingItem()
 * @model
 * @generated
 */
public interface ExtendedMappingItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(MappingColumnName)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getExtendedMappingItem_Attr()
   * @model containment="true"
   * @generated
   */
  MappingColumnName getAttr();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.ExtendedMappingItem#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(MappingColumnName value);

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getExtendedMappingItem_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

} // ExtendedMappingItem
