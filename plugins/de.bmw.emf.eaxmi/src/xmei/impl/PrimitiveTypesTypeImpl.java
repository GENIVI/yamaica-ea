/**
 */
package xmei.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.PackagedElementPackageType;

import xmei.PrimitiveTypesType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.PrimitiveTypesTypeImpl#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypesTypeImpl extends MinimalEObjectImpl.Container implements PrimitiveTypesType
{
    /**
     * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackagedElement()
     * @generated
     * @ordered
     */
    protected EList<PackagedElementPackageType> packagedElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrimitiveTypesTypeImpl()
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
        return XmeiPackage.Literals.PRIMITIVE_TYPES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackagedElementPackageType> getPackagedElement()
    {
        if (packagedElement == null)
        {
            packagedElement = new EObjectContainmentEList<PackagedElementPackageType>(PackagedElementPackageType.class, this, XmeiPackage.PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT);
        }
        return packagedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case XmeiPackage.PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT:
                return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case XmeiPackage.PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT:
                return getPackagedElement();
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
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case XmeiPackage.PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT:
                getPackagedElement().clear();
                getPackagedElement().addAll((Collection<? extends PackagedElementPackageType>)newValue);
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
            case XmeiPackage.PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT:
                getPackagedElement().clear();
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
            case XmeiPackage.PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT:
                return packagedElement != null && !packagedElement.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PrimitiveTypesTypeImpl
