/**
 */
package edu.kit.ipd.sdq.vitruvius.domains.java.change.feature.attribute.impl;

import edu.kit.ipd.sdq.vitruvius.framework.changes.echange.feature.attribute.impl.ReplaceSingleValuedEAttributeImpl;

import edu.kit.ipd.sdq.vitruvius.domains.java.change.feature.FeaturePackage;
import edu.kit.ipd.sdq.vitruvius.domains.java.change.feature.JavaFeatureEChange;
import edu.kit.ipd.sdq.vitruvius.domains.java.change.feature.attribute.AttributePackage;
import edu.kit.ipd.sdq.vitruvius.domains.java.change.feature.attribute.JavaReplaceSingleValuedEAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Replace Single Valued EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.domains.java.change.feature.attribute.impl.JavaReplaceSingleValuedEAttributeImpl#getOldAffectedEObject <em>Old Affected EObject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaReplaceSingleValuedEAttributeImpl<A extends EObject, T extends Object> extends ReplaceSingleValuedEAttributeImpl<A, T> implements JavaReplaceSingleValuedEAttribute<A, T> {
	/**
	 * The cached value of the '{@link #getOldAffectedEObject() <em>Old Affected EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldAffectedEObject()
	 * @generated
	 * @ordered
	 */
	protected A oldAffectedEObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaReplaceSingleValuedEAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributePackage.Literals.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public A getOldAffectedEObject() {
		if (oldAffectedEObject != null && oldAffectedEObject.eIsProxy()) {
			InternalEObject oldOldAffectedEObject = (InternalEObject)oldAffectedEObject;
			oldAffectedEObject = (A)eResolveProxy(oldOldAffectedEObject);
			if (oldAffectedEObject != oldOldAffectedEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT, oldOldAffectedEObject, oldAffectedEObject));
			}
		}
		return oldAffectedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetOldAffectedEObject() {
		return oldAffectedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldAffectedEObject(A newOldAffectedEObject) {
		A oldOldAffectedEObject = oldAffectedEObject;
		oldAffectedEObject = newOldAffectedEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT, oldOldAffectedEObject, oldAffectedEObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT:
				if (resolve) return getOldAffectedEObject();
				return basicGetOldAffectedEObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT:
				setOldAffectedEObject((A)newValue);
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
			case AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT:
				setOldAffectedEObject((A)null);
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
			case AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT:
				return oldAffectedEObject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == JavaFeatureEChange.class) {
			switch (derivedFeatureID) {
				case AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT: return FeaturePackage.JAVA_FEATURE_ECHANGE__OLD_AFFECTED_EOBJECT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == JavaFeatureEChange.class) {
			switch (baseFeatureID) {
				case FeaturePackage.JAVA_FEATURE_ECHANGE__OLD_AFFECTED_EOBJECT: return AttributePackage.JAVA_REPLACE_SINGLE_VALUED_EATTRIBUTE__OLD_AFFECTED_EOBJECT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JavaReplaceSingleValuedEAttributeImpl