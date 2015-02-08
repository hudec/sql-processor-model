/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements Extends Directive Except Pojos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos#getExceptPojos <em>Except Pojos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplementsExtendsDirectiveExceptPojos()
 * @model
 * @generated
 */
public interface ImplementsExtendsDirectiveExceptPojos extends ImplementsExtendsDirective
{
  /**
   * Returns the value of the '<em><b>Except Pojos</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Except Pojos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Except Pojos</em>' reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplementsExtendsDirectiveExceptPojos_ExceptPojos()
   * @model
   * @generated
   */
  EList<PojoEntity> getExceptPojos();

} // ImplementsExtendsDirectiveExceptPojos
