/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Property Directive Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.EnumPropertyDirectiveValues#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumPropertyDirectiveValues()
 * @model
 * @generated
 */
public interface EnumPropertyDirectiveValues extends EnumPropertyDirective
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.EnumPropertyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumPropertyDirectiveValues_Values()
   * @model containment="true"
   * @generated
   */
  EList<EnumPropertyValue> getValues();

} // EnumPropertyDirectiveValues
