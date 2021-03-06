/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.WhileStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.WhileStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getWhileStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.WhileStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtuml.bp.xtext.masl.masl.behavior.AbstractStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getWhileStatement_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStatement> getStatements();

} // WhileStatement
