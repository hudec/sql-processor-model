/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.Entity#isFinal <em>Final</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Entity#getProcedures <em>Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEntity_Final()
   * @model
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.Entity#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoProcedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEntity_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<PojoProcedure> getProcedures();

} // Entity
