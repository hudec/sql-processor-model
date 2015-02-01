/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debug Level Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DebugLevelAssignement#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DebugLevelAssignement#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDebugLevelAssignement()
 * @model
 * @generated
 */
public interface DebugLevelAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' attribute.
   * @see #setDebug(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDebugLevelAssignement_Debug()
   * @model
   * @generated
   */
  String getDebug();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DebugLevelAssignement#getDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' attribute.
   * @see #getDebug()
   * @generated
   */
  void setDebug(String value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' containment reference.
   * @see #setScope(PropertyValue)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDebugLevelAssignement_Scope()
   * @model containment="true"
   * @generated
   */
  PropertyValue getScope();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DebugLevelAssignement#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(PropertyValue value);

} // DebugLevelAssignement
