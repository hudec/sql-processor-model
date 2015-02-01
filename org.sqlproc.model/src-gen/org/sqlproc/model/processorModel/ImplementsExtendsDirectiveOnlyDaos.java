/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements Extends Directive Only Daos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos#getOnlyDaos <em>Only Daos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplementsExtendsDirectiveOnlyDaos()
 * @model
 * @generated
 */
public interface ImplementsExtendsDirectiveOnlyDaos extends ImplementsExtendsDirective
{
  /**
   * Returns the value of the '<em><b>Only Daos</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoDao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only Daos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only Daos</em>' reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getImplementsExtendsDirectiveOnlyDaos_OnlyDaos()
   * @model
   * @generated
   */
  EList<PojoDao> getOnlyDaos();

} // ImplementsExtendsDirectiveOnlyDaos
