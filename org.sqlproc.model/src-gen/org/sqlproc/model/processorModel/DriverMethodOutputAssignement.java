/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Method Output Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getDriverMethod <em>Driver Method</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getCallOutput <em>Call Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDriverMethodOutputAssignement()
 * @model
 * @generated
 */
public interface DriverMethodOutputAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Driver Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Driver Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver Method</em>' attribute.
   * @see #setDriverMethod(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDriverMethodOutputAssignement_DriverMethod()
   * @model
   * @generated
   */
  String getDriverMethod();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getDriverMethod <em>Driver Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver Method</em>' attribute.
   * @see #getDriverMethod()
   * @generated
   */
  void setDriverMethod(String value);

  /**
   * Returns the value of the '<em><b>Call Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Output</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Output</em>' containment reference.
   * @see #setCallOutput(PropertyValue)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDriverMethodOutputAssignement_CallOutput()
   * @model containment="true"
   * @generated
   */
  PropertyValue getCallOutput();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement#getCallOutput <em>Call Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Output</em>' containment reference.
   * @see #getCallOutput()
   * @generated
   */
  void setCallOutput(PropertyValue value);

} // DriverMethodOutputAssignement
