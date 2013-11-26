/**
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.GeneralizationType;
import uml.OwnedAttributeBaseType;
import uml.UmlClassType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.UmlClassTypeImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.impl.UmlClassTypeImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.impl.UmlClassTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlClassTypeImpl extends PackagedElementBaseTypeImpl implements UmlClassType
{
    /**
     * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralization()
     * @generated
     * @ordered
     */
    protected GeneralizationType generalization;

    /**
     * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedAttribute()
     * @generated
     * @ordered
     */
    protected EList<OwnedAttributeBaseType> ownedAttribute;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UmlClassTypeImpl()
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
        return UmlPackage.Literals.UML_CLASS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralizationType getGeneralization()
    {
        return generalization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneralization(GeneralizationType newGeneralization, NotificationChain msgs)
    {
        GeneralizationType oldGeneralization = generalization;
        generalization = newGeneralization;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.UML_CLASS_TYPE__GENERALIZATION, oldGeneralization, newGeneralization);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneralization(GeneralizationType newGeneralization)
    {
        if (newGeneralization != generalization)
        {
            NotificationChain msgs = null;
            if (generalization != null)
                msgs = ((InternalEObject)generalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.UML_CLASS_TYPE__GENERALIZATION, null, msgs);
            if (newGeneralization != null)
                msgs = ((InternalEObject)newGeneralization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.UML_CLASS_TYPE__GENERALIZATION, null, msgs);
            msgs = basicSetGeneralization(newGeneralization, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.UML_CLASS_TYPE__GENERALIZATION, newGeneralization, newGeneralization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OwnedAttributeBaseType> getOwnedAttribute()
    {
        if (ownedAttribute == null)
        {
            ownedAttribute = new EObjectContainmentEList<OwnedAttributeBaseType>(OwnedAttributeBaseType.class, this, UmlPackage.UML_CLASS_TYPE__OWNED_ATTRIBUTE);
        }
        return ownedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName()
    {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName)
    {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.UML_CLASS_TYPE__NAME, oldName, name));
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
            case UmlPackage.UML_CLASS_TYPE__GENERALIZATION:
                return basicSetGeneralization(null, msgs);
            case UmlPackage.UML_CLASS_TYPE__OWNED_ATTRIBUTE:
                return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.UML_CLASS_TYPE__GENERALIZATION:
                return getGeneralization();
            case UmlPackage.UML_CLASS_TYPE__OWNED_ATTRIBUTE:
                return getOwnedAttribute();
            case UmlPackage.UML_CLASS_TYPE__NAME:
                return getName();
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
            case UmlPackage.UML_CLASS_TYPE__GENERALIZATION:
                setGeneralization((GeneralizationType)newValue);
                return;
            case UmlPackage.UML_CLASS_TYPE__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                getOwnedAttribute().addAll((Collection<? extends OwnedAttributeBaseType>)newValue);
                return;
            case UmlPackage.UML_CLASS_TYPE__NAME:
                setName((String)newValue);
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
            case UmlPackage.UML_CLASS_TYPE__GENERALIZATION:
                setGeneralization((GeneralizationType)null);
                return;
            case UmlPackage.UML_CLASS_TYPE__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                return;
            case UmlPackage.UML_CLASS_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case UmlPackage.UML_CLASS_TYPE__GENERALIZATION:
                return generalization != null;
            case UmlPackage.UML_CLASS_TYPE__OWNED_ATTRIBUTE:
                return ownedAttribute != null && !ownedAttribute.isEmpty();
            case UmlPackage.UML_CLASS_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //UmlClassTypeImpl
