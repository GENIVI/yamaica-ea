/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.PackagedElementRelationType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Element Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PackagedElementRelationTypeImpl#getClient <em>Client</em>}</li>
 *   <li>{@link uml.impl.PackagedElementRelationTypeImpl#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackagedElementRelationTypeImpl extends PackagedElementBaseTypeImpl implements PackagedElementRelationType
{
    /**
     * The default value of the '{@link #getClient() <em>Client</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClient()
     * @generated
     * @ordered
     */
    protected static final String CLIENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClient() <em>Client</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClient()
     * @generated
     * @ordered
     */
    protected String client = CLIENT_EDEFAULT;

    /**
     * The default value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupplier()
     * @generated
     * @ordered
     */
    protected static final String SUPPLIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupplier()
     * @generated
     * @ordered
     */
    protected String supplier = SUPPLIER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackagedElementRelationTypeImpl()
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
        return UmlPackage.Literals.PACKAGED_ELEMENT_RELATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClient()
    {
        return client;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClient(String newClient)
    {
        String oldClient = client;
        client = newClient;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__CLIENT, oldClient, client));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSupplier()
    {
        return supplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSupplier(String newSupplier)
    {
        String oldSupplier = supplier;
        supplier = newSupplier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER, oldSupplier, supplier));
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
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__CLIENT:
                return getClient();
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER:
                return getSupplier();
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
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__CLIENT:
                setClient((String)newValue);
                return;
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER:
                setSupplier((String)newValue);
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
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__CLIENT:
                setClient(CLIENT_EDEFAULT);
                return;
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER:
                setSupplier(SUPPLIER_EDEFAULT);
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
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__CLIENT:
                return CLIENT_EDEFAULT == null ? client != null : !CLIENT_EDEFAULT.equals(client);
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER:
                return SUPPLIER_EDEFAULT == null ? supplier != null : !SUPPLIER_EDEFAULT.equals(supplier);
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
        result.append(" (client: ");
        result.append(client);
        result.append(", supplier: ");
        result.append(supplier);
        result.append(')');
        return result.toString();
    }

} //PackagedElementRelationTypeImpl
