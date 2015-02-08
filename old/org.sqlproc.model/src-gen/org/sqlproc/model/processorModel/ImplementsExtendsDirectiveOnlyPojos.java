/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements Extends Directive Only Pojos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos#getOnlyPojos <em>Only Pojos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplementsExtendsDirectiveOnlyPojos()
 * @model
 * @generated
 */
public interface ImplementsExtendsDirectiveOnlyPojos extends ImplementsExtendsDirective
{
  /**
   * Returns the value of the '<em><b>Only Pojos</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only Pojos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only Pojos</em>' reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplementsExtendsDirectiveOnlyPojos_OnlyPojos()
   * @model
   * @generated
   */
  EList<PojoEntity> getOnlyPojos();

} // ImplementsExtendsDirectiveOnlyPojos
