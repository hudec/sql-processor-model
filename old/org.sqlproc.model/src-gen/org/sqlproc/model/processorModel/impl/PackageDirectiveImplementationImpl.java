/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sqlproc.model.processorModel.PackageDirectiveImplementation;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Directive Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PackageDirectiveImplementationImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageDirectiveImplementationImpl extends PackageDirectiveImpl implements PackageDirectiveImplementation
{
  /**
   * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected static final String IMPLEMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected String implementation = IMPLEMENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDirectiveImplementationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProcessorModelPackage.Literals.PACKAGE_DIRECTIVE_IMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplementation()
  {
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplementation(String newImplementation)
  {
    String oldImplementation = implementation;
    implementation = newImplementation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.PACKAGE_DIRECTIVE_IMPLEMENTATION__IMPLEMENTATION, oldImplementation, implementation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.PACKAGE_DIRECTIVE_IMPLEMENTATION__IMPLEMENTATION:
        return getImplementation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.PACKAGE_DIRECTIVE_IMPLEMENTATION__IMPLEMENTATION:
        setImplementation((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.PACKAGE_DIRECTIVE_IMPLEMENTATION__IMPLEMENTATION:
        setImplementation(IMPLEMENTATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProcessorModelPackage.PACKAGE_DIRECTIVE_IMPLEMENTATION__IMPLEMENTATION:
        return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (implementation: ");
    result.append(implementation);
    result.append(')');
    return result.toString();
  }

} //PackageDirectiveImplementationImpl
