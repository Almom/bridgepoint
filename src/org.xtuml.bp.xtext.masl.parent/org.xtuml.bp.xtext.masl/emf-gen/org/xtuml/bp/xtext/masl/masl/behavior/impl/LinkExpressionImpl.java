/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage;
import org.xtuml.bp.xtext.masl.masl.behavior.Expression;
import org.xtuml.bp.xtext.masl.masl.behavior.LinkExpression;
import org.xtuml.bp.xtext.masl.masl.behavior.LinkType;

import org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.LinkExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.LinkExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.LinkExpressionImpl#getNavigation <em>Navigation</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.LinkExpressionImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.LinkExpressionImpl#getAssoc <em>Assoc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkExpressionImpl extends ExpressionImpl implements LinkExpression {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LinkType TYPE_EDEFAULT = LinkType.LINK;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LinkType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected Expression lhs;

	/**
	 * The cached value of the '{@link #getNavigation() <em>Navigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigation()
	 * @generated
	 * @ordered
	 */
	protected RelationshipNavigation navigation;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected Expression rhs;

	/**
	 * The cached value of the '{@link #getAssoc() <em>Assoc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssoc()
	 * @generated
	 * @ordered
	 */
	protected Expression assoc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.LINK_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LinkType newType) {
		LinkType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(Expression newLhs, NotificationChain msgs) {
		Expression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(Expression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipNavigation getNavigation() {
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigation(RelationshipNavigation newNavigation, NotificationChain msgs) {
		RelationshipNavigation oldNavigation = navigation;
		navigation = newNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__NAVIGATION, oldNavigation, newNavigation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigation(RelationshipNavigation newNavigation) {
		if (newNavigation != navigation) {
			NotificationChain msgs = null;
			if (navigation != null)
				msgs = ((InternalEObject)navigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__NAVIGATION, null, msgs);
			if (newNavigation != null)
				msgs = ((InternalEObject)newNavigation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__NAVIGATION, null, msgs);
			msgs = basicSetNavigation(newNavigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__NAVIGATION, newNavigation, newNavigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(Expression newRhs, NotificationChain msgs) {
		Expression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(Expression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAssoc() {
		return assoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssoc(Expression newAssoc, NotificationChain msgs) {
		Expression oldAssoc = assoc;
		assoc = newAssoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__ASSOC, oldAssoc, newAssoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssoc(Expression newAssoc) {
		if (newAssoc != assoc) {
			NotificationChain msgs = null;
			if (assoc != null)
				msgs = ((InternalEObject)assoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__ASSOC, null, msgs);
			if (newAssoc != null)
				msgs = ((InternalEObject)newAssoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LINK_EXPRESSION__ASSOC, null, msgs);
			msgs = basicSetAssoc(newAssoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LINK_EXPRESSION__ASSOC, newAssoc, newAssoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.LINK_EXPRESSION__LHS:
				return basicSetLhs(null, msgs);
			case BehaviorPackage.LINK_EXPRESSION__NAVIGATION:
				return basicSetNavigation(null, msgs);
			case BehaviorPackage.LINK_EXPRESSION__RHS:
				return basicSetRhs(null, msgs);
			case BehaviorPackage.LINK_EXPRESSION__ASSOC:
				return basicSetAssoc(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.LINK_EXPRESSION__TYPE:
				return getType();
			case BehaviorPackage.LINK_EXPRESSION__LHS:
				return getLhs();
			case BehaviorPackage.LINK_EXPRESSION__NAVIGATION:
				return getNavigation();
			case BehaviorPackage.LINK_EXPRESSION__RHS:
				return getRhs();
			case BehaviorPackage.LINK_EXPRESSION__ASSOC:
				return getAssoc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.LINK_EXPRESSION__TYPE:
				setType((LinkType)newValue);
				return;
			case BehaviorPackage.LINK_EXPRESSION__LHS:
				setLhs((Expression)newValue);
				return;
			case BehaviorPackage.LINK_EXPRESSION__NAVIGATION:
				setNavigation((RelationshipNavigation)newValue);
				return;
			case BehaviorPackage.LINK_EXPRESSION__RHS:
				setRhs((Expression)newValue);
				return;
			case BehaviorPackage.LINK_EXPRESSION__ASSOC:
				setAssoc((Expression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorPackage.LINK_EXPRESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BehaviorPackage.LINK_EXPRESSION__LHS:
				setLhs((Expression)null);
				return;
			case BehaviorPackage.LINK_EXPRESSION__NAVIGATION:
				setNavigation((RelationshipNavigation)null);
				return;
			case BehaviorPackage.LINK_EXPRESSION__RHS:
				setRhs((Expression)null);
				return;
			case BehaviorPackage.LINK_EXPRESSION__ASSOC:
				setAssoc((Expression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorPackage.LINK_EXPRESSION__TYPE:
				return type != TYPE_EDEFAULT;
			case BehaviorPackage.LINK_EXPRESSION__LHS:
				return lhs != null;
			case BehaviorPackage.LINK_EXPRESSION__NAVIGATION:
				return navigation != null;
			case BehaviorPackage.LINK_EXPRESSION__RHS:
				return rhs != null;
			case BehaviorPackage.LINK_EXPRESSION__ASSOC:
				return assoc != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LinkExpressionImpl
