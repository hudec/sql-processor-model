/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Attribute Directive Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.EnumAttributeDirectiveValues#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumAttributeDirectiveValues()
 * @model
 * @generated
 */
public interface EnumAttributeDirectiveValues extends EnumAttributeDirective
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.EnumAttributeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumAttributeDirectiveValues_Values()
   * @model containment="true"
   * @generated
   */
  EList<EnumAttributeValue> getValues();

} // EnumAttributeDirectiveValues
