/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.DefaultExceptionHandler#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getDefaultExceptionHandler()
 * @model
 * @generated
 */
public interface DefaultExceptionHandler extends EObject {
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
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getDefaultExceptionHandler_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStatement> getStatements();

} // DefaultExceptionHandler
