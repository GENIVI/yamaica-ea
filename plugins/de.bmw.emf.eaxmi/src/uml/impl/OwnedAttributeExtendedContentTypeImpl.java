/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.MultiplicityValueType;
import uml.OwnedAttributeExtendedContentType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Attribute Extended Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OwnedAttributeExtendedContentTypeImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedContentTypeImpl#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedAttributeExtendedContentTypeImpl extends OwnedAttributeExtendedAttributesTypeImpl implements OwnedAttributeExtendedContentType
{
    /**
     * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerValue()
     * @generated
     * @ordered
     */
    protected MultiplicityValueType lowerValue;

    /**
     * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperValue()
     * @generated
     * @ordered
     */
    protected MultiplicityValueType upperValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnedAttributeExtendedContentTypeImpl()
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
        return UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityValueType getLowerValue()
    {
        return lowerValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLowerValue(MultiplicityValueType newLowerValue, NotificationChain msgs)
    {
        MultiplicityValueType oldLowerValue = lowerValue;
        lowerValue = newLowerValue;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE, oldLowerValue, newLowerValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLowerValue(MultiplicityValueType newLowerValue)
    {
        if (newLowerValue != lowerValue)
        {
            NotificationChain msgs = null;
            if (lowerValue != null)
                msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE, null, msgs);
            if (newLowerValue != null)
                msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE, null, msgs);
            msgs = basicSetLowerValue(newLowerValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE, newLowerValue, newLowerValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityValueType getUpperValue()
    {
        return upperValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpperValue(MultiplicityValueType newUpperValue, NotificationChain msgs)
    {
        MultiplicityValueType oldUpperValue = upperValue;
        upperValue = newUpperValue;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE, oldUpperValue, newUpperValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpperValue(MultiplicityValueType newUpperValue)
    {
        if (newUpperValue != upperValue)
        {
            NotificationChain msgs = null;
            if (upperValue != null)
                msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE, null, msgs);
            if (newUpperValue != null)
                msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE, null, msgs);
            msgs = basicSetUpperValue(newUpperValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE, newUpperValue, newUpperValue));
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE:
                return basicSetLowerValue(null, msgs);
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE:
                return basicSetUpperValue(null, msgs);
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE:
                return getLowerValue();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE:
                return getUpperValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE:
                setLowerValue((MultiplicityValueType)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE:
                setUpperValue((MultiplicityValueType)newValue);
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE:
                setLowerValue((MultiplicityValueType)null);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE:
                setUpperValue((MultiplicityValueType)null);
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE:
                return lowerValue != null;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE:
                return upperValue != null;
        }
        return super.eIsSet(featureID);
    }

} //OwnedAttributeExtendedContentTypeImpl
