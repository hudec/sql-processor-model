/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.AnnotatedEntity#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.AnnotatedEntity#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getAnnotatedEntity()
 * @model
 * @generated
 */
public interface AnnotatedEntity extends AbstractPojoEntity
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getAnnotatedEntity_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(Entity)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getAnnotatedEntity_Entity()
   * @model containment="true"
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.AnnotatedEntity#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

} // AnnotatedEntity
