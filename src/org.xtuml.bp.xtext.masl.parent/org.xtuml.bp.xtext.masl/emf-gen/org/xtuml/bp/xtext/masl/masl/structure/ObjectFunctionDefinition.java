/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure;

import org.xtuml.bp.xtext.masl.masl.behavior.CodeBlock;

import org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#isInstance <em>Instance</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getObject <em>Object</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition()
 * @model
 * @generated
 */
public interface ObjectFunctionDefinition extends AbstractTopLevelElement, Parameterized {
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
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(boolean)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Instance()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInstance();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#isInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #isInstance()
	 * @generated
	 */
	void setInstance(boolean value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(RelationshipDefinition)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Relationship()
	 * @model
	 * @generated
	 */
	RelationshipDefinition getRelationship();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipDefinition value);

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
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Domain()
	 * @model
	 * @generated
	 */
	DomainDefinition getDomain();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainDefinition value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(ObjectDeclaration)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Object()
	 * @model
	 * @generated
	 */
	ObjectDeclaration getObject();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectDeclaration value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(AbstractTypeReference)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	AbstractTypeReference getReturnType();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(AbstractTypeReference value);

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
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getBody();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CodeBlock value);

} // ObjectFunctionDefinition
