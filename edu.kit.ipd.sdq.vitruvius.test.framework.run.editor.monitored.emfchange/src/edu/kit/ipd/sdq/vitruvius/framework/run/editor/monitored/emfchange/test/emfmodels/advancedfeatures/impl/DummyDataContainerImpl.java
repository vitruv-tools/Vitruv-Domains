/**
 */
package edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.emfmodels.advancedfeatures.impl;

import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.emfmodels.advancedfeatures.AdvancedFeaturesPackage;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.emfmodels.advancedfeatures.DummyData;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.emfmodels.advancedfeatures.DummyDataContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy Data Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.emfmodels.advancedfeatures.impl.DummyDataContainerImpl#getDummyDataObjs <em>Dummy Data Objs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DummyDataContainerImpl extends MinimalEObjectImpl.Container implements DummyDataContainer {
    /**
     * The cached value of the '{@link #getDummyDataObjs() <em>Dummy Data Objs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDummyDataObjs()
     * @generated
     * @ordered
     */
    protected EList<DummyData> dummyDataObjs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DummyDataContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdvancedFeaturesPackage.Literals.DUMMY_DATA_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DummyData> getDummyDataObjs() {
        if (dummyDataObjs == null) {
            dummyDataObjs = new EObjectContainmentEList<DummyData>(DummyData.class, this, AdvancedFeaturesPackage.DUMMY_DATA_CONTAINER__DUMMY_DATA_OBJS);
        }
        return dummyDataObjs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AdvancedFeaturesPackage.DUMMY_DATA_CONTAINER__DUMMY_DATA_OBJS:
                return ((InternalEList<?>)getDummyDataObjs()).basicRemove(otherEnd, msgs);
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
            case AdvancedFeaturesPackage.DUMMY_DATA_CONTAINER__DUMMY_DATA_OBJS:
                return getDummyDataObjs();
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
            case AdvancedFeaturesPackage.DUMMY_DATA_CONTAINER__DUMMY_DATA_OBJS:
                getDummyDataObjs().clear();
                getDummyDataObjs().addAll((Collection<? extends DummyData>)newValue);
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
            case AdvancedFeaturesPackage.DUMMY_DATA_CONTAINER__DUMMY_DATA_OBJS:
                getDummyDataObjs().clear();
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
            case AdvancedFeaturesPackage.DUMMY_DATA_CONTAINER__DUMMY_DATA_OBJS:
                return dummyDataObjs != null && !dummyDataObjs.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DummyDataContainerImpl