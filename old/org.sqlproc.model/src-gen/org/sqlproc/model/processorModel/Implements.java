/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.Implements#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Implements#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplements()
 * @model
 * @generated
 */
public interface Implements extends AbstractEntity
{
  /**
   * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ImplementsExtendsDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directives</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplements_Directives()
   * @model containment="true"
   * @generated
   */
  EList<ImplementsExtendsDirective> getDirectives();

  /**
   * Returns the value of the '<em><b>Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' containment reference.
   * @see #setImplements(JvmParameterizedTypeReference)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplements_Implements()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getImplements();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.Implements#getImplements <em>Implements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implements</em>' containment reference.
   * @see #getImplements()
   * @generated
   */
  void setImplements(JvmParameterizedTypeReference value);

} // Implements
