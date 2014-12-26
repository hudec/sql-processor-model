/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getValue <em>Value</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getCol <em>Col</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getCnst <em>Cnst</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getCnstOper <em>Cnst Oper</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getIdentOper <em>Ident Oper</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getDbtab <em>Dbtab</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.SqlFragment#getDbcol <em>Dbcol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment()
 * @model
 * @generated
 */
public interface SqlFragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' containment reference.
   * @see #setCol(Column)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_Col()
   * @model containment="true"
   * @generated
   */
  Column getCol();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getCol <em>Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col</em>' containment reference.
   * @see #getCol()
   * @generated
   */
  void setCol(Column value);

  /**
   * Returns the value of the '<em><b>Cnst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnst</em>' containment reference.
   * @see #setCnst(Constant)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_Cnst()
   * @model containment="true"
   * @generated
   */
  Constant getCnst();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getCnst <em>Cnst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnst</em>' containment reference.
   * @see #getCnst()
   * @generated
   */
  void setCnst(Constant value);

  /**
   * Returns the value of the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' containment reference.
   * @see #setIdent(Identifier)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_Ident()
   * @model containment="true"
   * @generated
   */
  Identifier getIdent();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getIdent <em>Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' containment reference.
   * @see #getIdent()
   * @generated
   */
  void setIdent(Identifier value);

  /**
   * Returns the value of the '<em><b>Cnst Oper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnst Oper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnst Oper</em>' containment reference.
   * @see #setCnstOper(ConstantOperator)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_CnstOper()
   * @model containment="true"
   * @generated
   */
  ConstantOperator getCnstOper();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getCnstOper <em>Cnst Oper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnst Oper</em>' containment reference.
   * @see #getCnstOper()
   * @generated
   */
  void setCnstOper(ConstantOperator value);

  /**
   * Returns the value of the '<em><b>Ident Oper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident Oper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident Oper</em>' containment reference.
   * @see #setIdentOper(IdentifierOperator)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_IdentOper()
   * @model containment="true"
   * @generated
   */
  IdentifierOperator getIdentOper();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getIdentOper <em>Ident Oper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident Oper</em>' containment reference.
   * @see #getIdentOper()
   * @generated
   */
  void setIdentOper(IdentifierOperator value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference.
   * @see #setMeta(MetaSql)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_Meta()
   * @model containment="true"
   * @generated
   */
  MetaSql getMeta();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getMeta <em>Meta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' containment reference.
   * @see #getMeta()
   * @generated
   */
  void setMeta(MetaSql value);

  /**
   * Returns the value of the '<em><b>Dbtab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dbtab</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dbtab</em>' containment reference.
   * @see #setDbtab(DatabaseTable)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_Dbtab()
   * @model containment="true"
   * @generated
   */
  DatabaseTable getDbtab();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getDbtab <em>Dbtab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dbtab</em>' containment reference.
   * @see #getDbtab()
   * @generated
   */
  void setDbtab(DatabaseTable value);

  /**
   * Returns the value of the '<em><b>Dbcol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dbcol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dbcol</em>' containment reference.
   * @see #setDbcol(DatabaseColumn)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getSqlFragment_Dbcol()
   * @model containment="true"
   * @generated
   */
  DatabaseColumn getDbcol();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.SqlFragment#getDbcol <em>Dbcol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dbcol</em>' containment reference.
   * @see #getDbcol()
   * @generated
   */
  void setDbcol(DatabaseColumn value);

} // SqlFragment
