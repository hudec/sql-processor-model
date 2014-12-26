/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DriverMetaInfoAssignement#getDbDriverInfo <em>Db Driver Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDriverMetaInfoAssignement()
 * @model
 * @generated
 */
public interface DriverMetaInfoAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Driver Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Driver Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Driver Info</em>' attribute.
   * @see #setDbDriverInfo(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDriverMetaInfoAssignement_DbDriverInfo()
   * @model
   * @generated
   */
  String getDbDriverInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DriverMetaInfoAssignement#getDbDriverInfo <em>Db Driver Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driver Info</em>' attribute.
   * @see #getDbDriverInfo()
   * @generated
   */
  void setDbDriverInfo(String value);

} // DriverMetaInfoAssignement
