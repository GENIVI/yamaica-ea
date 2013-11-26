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

import uml.OwnedOperationType;
import uml.OwnedParameterType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OwnedOperationTypeImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.impl.OwnedOperationTypeImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link uml.impl.OwnedOperationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedOperationTypeImpl extends PackagedElementBaseTypeImpl implements OwnedOperationType
{
    /**
     * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedParameter()
     * @generated
     * @ordered
     */
    protected EList<OwnedParameterType> ownedParameter;

    /**
     * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrency()
     * @generated
     * @ordered
     */
    protected static final String CONCURRENCY_EDEFAULT = "sequential";

    /**
     * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrency()
     * @generated
     * @ordered
     */
    protected String concurrency = CONCURRENCY_EDEFAULT;

    /**
     * This is true if the Concurrency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean concurrencyESet;

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
    protected OwnedOperationTypeImpl()
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
        return UmlPackage.Literals.OWNED_OPERATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OwnedParameterType> getOwnedParameter()
    {
        if (ownedParameter == null)
        {
            ownedParameter = new EObjectContainmentEList<OwnedParameterType>(OwnedParameterType.class, this, UmlPackage.OWNED_OPERATION_TYPE__OWNED_PARAMETER);
        }
        return ownedParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConcurrency()
    {
        return concurrency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcurrency(String newConcurrency)
    {
        String oldConcurrency = concurrency;
        concurrency = newConcurrency;
        boolean oldConcurrencyESet = concurrencyESet;
        concurrencyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_OPERATION_TYPE__CONCURRENCY, oldConcurrency, concurrency, !oldConcurrencyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConcurrency()
    {
        String oldConcurrency = concurrency;
        boolean oldConcurrencyESet = concurrencyESet;
        concurrency = CONCURRENCY_EDEFAULT;
        concurrencyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_OPERATION_TYPE__CONCURRENCY, oldConcurrency, CONCURRENCY_EDEFAULT, oldConcurrencyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConcurrency()
    {
        return concurrencyESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_OPERATION_TYPE__NAME, oldName, name));
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
            case UmlPackage.OWNED_OPERATION_TYPE__OWNED_PARAMETER:
                return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.OWNED_OPERATION_TYPE__OWNED_PARAMETER:
                return getOwnedParameter();
            case UmlPackage.OWNED_OPERATION_TYPE__CONCURRENCY:
                return getConcurrency();
            case UmlPackage.OWNED_OPERATION_TYPE__NAME:
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
            case UmlPackage.OWNED_OPERATION_TYPE__OWNED_PARAMETER:
                getOwnedParameter().clear();
                getOwnedParameter().addAll((Collection<? extends OwnedParameterType>)newValue);
                return;
            case UmlPackage.OWNED_OPERATION_TYPE__CONCURRENCY:
                setConcurrency((String)newValue);
                return;
            case UmlPackage.OWNED_OPERATION_TYPE__NAME:
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
            case UmlPackage.OWNED_OPERATION_TYPE__OWNED_PARAMETER:
                getOwnedParameter().clear();
                return;
            case UmlPackage.OWNED_OPERATION_TYPE__CONCURRENCY:
                unsetConcurrency();
                return;
            case UmlPackage.OWNED_OPERATION_TYPE__NAME:
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
            case UmlPackage.OWNED_OPERATION_TYPE__OWNED_PARAMETER:
                return ownedParameter != null && !ownedParameter.isEmpty();
            case UmlPackage.OWNED_OPERATION_TYPE__CONCURRENCY:
                return isSetConcurrency();
            case UmlPackage.OWNED_OPERATION_TYPE__NAME:
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
        result.append(" (concurrency: ");
        if (concurrencyESet) result.append(concurrency); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //OwnedOperationTypeImpl
