/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.EnumEntity#getModifiers1 <em>Modifiers1</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.EnumEntity#getModifiers2 <em>Modifiers2</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.EnumEntity#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumEntity()
 * @model
 * @generated
 */
public interface EnumEntity extends Entity
{
  /**
   * Returns the value of the '<em><b>Modifiers1</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.EnumEntityModifier1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers1</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumEntity_Modifiers1()
   * @model containment="true"
   * @generated
   */
  EList<EnumEntityModifier1> getModifiers1();

  /**
   * Returns the value of the '<em><b>Modifiers2</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.EnumEntityModifier2}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers2</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumEntity_Modifiers2()
   * @model containment="true"
   * @generated
   */
  EList<EnumEntityModifier2> getModifiers2();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.EnumProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<EnumProperty> getFeatures();

} // EnumEntity
