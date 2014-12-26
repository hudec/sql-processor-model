/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojo Annotated Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.PojoAnnotatedProperty#getSetterAnnotations <em>Setter Annotations</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoAnnotatedProperty#getGetterAnnotations <em>Getter Annotations</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoAnnotatedProperty#getAttributeAnnotations <em>Attribute Annotations</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoAnnotatedProperty#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoAnnotatedProperty()
 * @model
 * @generated
 */
public interface PojoAnnotatedProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Setter Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setter Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setter Annotations</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoAnnotatedProperty_SetterAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getSetterAnnotations();

  /**
   * Returns the value of the '<em><b>Getter Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getter Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getter Annotations</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoAnnotatedProperty_GetterAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getGetterAnnotations();

  /**
   * Returns the value of the '<em><b>Attribute Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Annotations</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoAnnotatedProperty_AttributeAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAttributeAnnotations();

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(PojoProperty)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoAnnotatedProperty_Feature()
   * @model containment="true"
   * @generated
   */
  PojoProperty getFeature();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoAnnotatedProperty#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(PojoProperty value);

} // PojoAnnotatedProperty
