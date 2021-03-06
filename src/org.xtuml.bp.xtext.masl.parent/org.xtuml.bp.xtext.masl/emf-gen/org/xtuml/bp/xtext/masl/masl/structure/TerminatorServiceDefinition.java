/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure;

import org.xtuml.bp.xtext.masl.masl.behavior.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminator Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getTerminator <em>Terminator</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getTerminatorServiceDefinition()
 * @model
 * @generated
 */
public interface TerminatorServiceDefinition extends AbstractTopLevelElement, Parameterized {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtuml.bp.xtext.masl.masl.structure.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getTerminatorServiceDefinition_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(DomainDefinition)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getTerminatorServiceDefinition_Domain()
	 * @model
	 * @generated
	 */
	DomainDefinition getDomain();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainDefinition value);

	/**
	 * Returns the value of the '<em><b>Terminator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminator</em>' reference.
	 * @see #setTerminator(TerminatorDefinition)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getTerminatorServiceDefinition_Terminator()
	 * @model
	 * @generated
	 */
	TerminatorDefinition getTerminator();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getTerminator <em>Terminator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminator</em>' reference.
	 * @see #getTerminator()
	 * @generated
	 */
	void setTerminator(TerminatorDefinition value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(CodeBlock)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getTerminatorServiceDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getBody();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CodeBlock value);

} // TerminatorServiceDefinition
