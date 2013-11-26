/**
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.MemberEndType;
import uml.OwnedAttributeExtendedAttributesType;
import uml.PackagedElementAssociationType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Element Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PackagedElementAssociationTypeImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.impl.PackagedElementAssociationTypeImpl#getOwnedEnd <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackagedElementAssociationTypeImpl extends PackagedElementBaseTypeImpl implements PackagedElementAssociationType
{
    /**
     * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMemberEnd()
     * @generated
     * @ordered
     */
    protected EList<MemberEndType> memberEnd;

    /**
     * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedEnd()
     * @generated
     * @ordered
     */
    protected EList<OwnedAttributeExtendedAttributesType> ownedEnd;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackagedElementAssociationTypeImpl()
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
        return UmlPackage.Literals.PACKAGED_ELEMENT_ASSOCIATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MemberEndType> getMemberEnd()
    {
        if (memberEnd == null)
        {
            memberEnd = new EObjectContainmentEList<MemberEndType>(MemberEndType.class, this, UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END);
        }
        return memberEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OwnedAttributeExtendedAttributesType> getOwnedEnd()
    {
        if (ownedEnd == null)
        {
            ownedEnd = new EObjectContainmentEList<OwnedAttributeExtendedAttributesType>(OwnedAttributeExtendedAttributesType.class, this, UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END);
        }
        return ownedEnd;
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
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END:
                return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END:
                return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END:
                return getMemberEnd();
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END:
                return getOwnedEnd();
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
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END:
                getMemberEnd().clear();
                getMemberEnd().addAll((Collection<? extends MemberEndType>)newValue);
                return;
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END:
                getOwnedEnd().clear();
                getOwnedEnd().addAll((Collection<? extends OwnedAttributeExtendedAttributesType>)newValue);
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
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END:
                getMemberEnd().clear();
                return;
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END:
                getOwnedEnd().clear();
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
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END:
                return memberEnd != null && !memberEnd.isEmpty();
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END:
                return ownedEnd != null && !ownedEnd.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PackagedElementAssociationTypeImpl
