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
import uml.OwnedOperationType;
import uml.PackagedElementBaseType;
import uml.UmlInterfaceType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.UmlInterfaceTypeImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.impl.UmlInterfaceTypeImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.impl.UmlInterfaceTypeImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.impl.UmlInterfaceTypeImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.impl.UmlInterfaceTypeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlInterfaceTypeImpl extends PackagedElementPackageTypeImpl implements UmlInterfaceType
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
     * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedOperation()
     * @generated
     * @ordered
     */
    protected EList<OwnedOperationType> ownedOperation;

    /**
     * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNestedClassifier()
     * @generated
     * @ordered
     */
    protected EList<PackagedElementBaseType> nestedClassifier;

    /**
     * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

    /**
     * This is true if the Is Abstract attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isAbstractESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UmlInterfaceTypeImpl()
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
        return UmlPackage.Literals.UML_INTERFACE_TYPE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION, oldGeneralization, newGeneralization);
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
                msgs = ((InternalEObject)generalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION, null, msgs);
            if (newGeneralization != null)
                msgs = ((InternalEObject)newGeneralization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION, null, msgs);
            msgs = basicSetGeneralization(newGeneralization, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION, newGeneralization, newGeneralization));
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
            ownedAttribute = new EObjectContainmentEList<OwnedAttributeBaseType>(OwnedAttributeBaseType.class, this, UmlPackage.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE);
        }
        return ownedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OwnedOperationType> getOwnedOperation()
    {
        if (ownedOperation == null)
        {
            ownedOperation = new EObjectContainmentEList<OwnedOperationType>(OwnedOperationType.class, this, UmlPackage.UML_INTERFACE_TYPE__OWNED_OPERATION);
        }
        return ownedOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackagedElementBaseType> getNestedClassifier()
    {
        if (nestedClassifier == null)
        {
            nestedClassifier = new EObjectContainmentEList<PackagedElementBaseType>(PackagedElementBaseType.class, this, UmlPackage.UML_INTERFACE_TYPE__NESTED_CLASSIFIER);
        }
        return nestedClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAbstract()
    {
        return isAbstract;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsAbstract(boolean newIsAbstract)
    {
        boolean oldIsAbstract = isAbstract;
        isAbstract = newIsAbstract;
        boolean oldIsAbstractESet = isAbstractESet;
        isAbstractESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.UML_INTERFACE_TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsAbstract()
    {
        boolean oldIsAbstract = isAbstract;
        boolean oldIsAbstractESet = isAbstractESet;
        isAbstract = IS_ABSTRACT_EDEFAULT;
        isAbstractESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.UML_INTERFACE_TYPE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsAbstract()
    {
        return isAbstractESet;
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
            case UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION:
                return basicSetGeneralization(null, msgs);
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE:
                return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_OPERATION:
                return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
            case UmlPackage.UML_INTERFACE_TYPE__NESTED_CLASSIFIER:
                return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION:
                return getGeneralization();
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE:
                return getOwnedAttribute();
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_OPERATION:
                return getOwnedOperation();
            case UmlPackage.UML_INTERFACE_TYPE__NESTED_CLASSIFIER:
                return getNestedClassifier();
            case UmlPackage.UML_INTERFACE_TYPE__IS_ABSTRACT:
                return isIsAbstract();
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
            case UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION:
                setGeneralization((GeneralizationType)newValue);
                return;
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                getOwnedAttribute().addAll((Collection<? extends OwnedAttributeBaseType>)newValue);
                return;
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_OPERATION:
                getOwnedOperation().clear();
                getOwnedOperation().addAll((Collection<? extends OwnedOperationType>)newValue);
                return;
            case UmlPackage.UML_INTERFACE_TYPE__NESTED_CLASSIFIER:
                getNestedClassifier().clear();
                getNestedClassifier().addAll((Collection<? extends PackagedElementBaseType>)newValue);
                return;
            case UmlPackage.UML_INTERFACE_TYPE__IS_ABSTRACT:
                setIsAbstract((Boolean)newValue);
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
            case UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION:
                setGeneralization((GeneralizationType)null);
                return;
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                return;
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_OPERATION:
                getOwnedOperation().clear();
                return;
            case UmlPackage.UML_INTERFACE_TYPE__NESTED_CLASSIFIER:
                getNestedClassifier().clear();
                return;
            case UmlPackage.UML_INTERFACE_TYPE__IS_ABSTRACT:
                unsetIsAbstract();
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
            case UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION:
                return generalization != null;
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE:
                return ownedAttribute != null && !ownedAttribute.isEmpty();
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_OPERATION:
                return ownedOperation != null && !ownedOperation.isEmpty();
            case UmlPackage.UML_INTERFACE_TYPE__NESTED_CLASSIFIER:
                return nestedClassifier != null && !nestedClassifier.isEmpty();
            case UmlPackage.UML_INTERFACE_TYPE__IS_ABSTRACT:
                return isSetIsAbstract();
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
        result.append(" (isAbstract: ");
        if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //UmlInterfaceTypeImpl
