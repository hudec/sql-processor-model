/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directive Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DirectiveProperties#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDirectiveProperties()
 * @model
 * @generated
 */
public interface DirectiveProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDirectiveProperties_Features()
   * @model
   * @generated
   */
  EList<PojoAttribute> getFeatures();

} // DirectiveProperties
