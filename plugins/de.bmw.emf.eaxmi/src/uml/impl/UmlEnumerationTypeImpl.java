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
import uml.OwnedLiteralType;
import uml.UmlEnumerationType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.UmlEnumerationTypeImpl#getOwnedLiteral <em>Owned Literal</em>}</li>
 *   <li>{@link uml.impl.UmlEnumerationTypeImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.impl.UmlEnumerationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlEnumerationTypeImpl extends PackagedElementBaseTypeImpl implements UmlEnumerationType
{
    /**
     * The cached value of the '{@link #getOwnedLiteral() <em>Owned Literal</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedLiteral()
     * @generated
     * @ordered
     */
    protected EList<OwnedLiteralType> ownedLiteral;

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
    protected UmlEnumerationTypeImpl()
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
        return UmlPackage.Literals.UML_ENUMERATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OwnedLiteralType> getOwnedLiteral()
    {
        if (ownedLiteral == null)
        {
            ownedLiteral = new EObjectContainmentEList<OwnedLiteralType>(OwnedLiteralType.class, this, UmlPackage.UML_ENUMERATION_TYPE__OWNED_LITERAL);
        }
        return ownedLiteral;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION, oldGeneralization, newGeneralization);
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
                msgs = ((InternalEObject)generalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION, null, msgs);
            if (newGeneralization != null)
                msgs = ((InternalEObject)newGeneralization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION, null, msgs);
            msgs = basicSetGeneralization(newGeneralization, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION, newGeneralization, newGeneralization));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.UML_ENUMERATION_TYPE__NAME, oldName, name));
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
            case UmlPackage.UML_ENUMERATION_TYPE__OWNED_LITERAL:
                return ((InternalEList<?>)getOwnedLiteral()).basicRemove(otherEnd, msgs);
            case UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION:
                return basicSetGeneralization(null, msgs);
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
            case UmlPackage.UML_ENUMERATION_TYPE__OWNED_LITERAL:
                return getOwnedLiteral();
            case UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION:
                return getGeneralization();
            case UmlPackage.UML_ENUMERATION_TYPE__NAME:
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
            case UmlPackage.UML_ENUMERATION_TYPE__OWNED_LITERAL:
                getOwnedLiteral().clear();
                getOwnedLiteral().addAll((Collection<? extends OwnedLiteralType>)newValue);
                return;
            case UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION:
                setGeneralization((GeneralizationType)newValue);
                return;
            case UmlPackage.UML_ENUMERATION_TYPE__NAME:
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
            case UmlPackage.UML_ENUMERATION_TYPE__OWNED_LITERAL:
                getOwnedLiteral().clear();
                return;
            case UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION:
                setGeneralization((GeneralizationType)null);
                return;
            case UmlPackage.UML_ENUMERATION_TYPE__NAME:
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
            case UmlPackage.UML_ENUMERATION_TYPE__OWNED_LITERAL:
                return ownedLiteral != null && !ownedLiteral.isEmpty();
            case UmlPackage.UML_ENUMERATION_TYPE__GENERALIZATION:
                return generalization != null;
            case UmlPackage.UML_ENUMERATION_TYPE__NAME:
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

} //UmlEnumerationTypeImpl
