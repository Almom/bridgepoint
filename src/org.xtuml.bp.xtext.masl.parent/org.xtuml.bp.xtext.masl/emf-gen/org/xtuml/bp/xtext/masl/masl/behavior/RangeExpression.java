/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.RangeExpression#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.RangeExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.RangeExpression#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getRangeExpression()
 * @model
 * @generated
 */
public interface RangeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getRangeExpression_From()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.RangeExpression#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getRangeExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.RangeExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getRangeExpression_To()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTo();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.RangeExpression#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Expression value);

} // RangeExpression
