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

import uml.PackageImportType;
import uml.PackagedElementBaseType;
import uml.PackagedElementPackageType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Element Package Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PackagedElementPackageTypeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.impl.PackagedElementPackageTypeImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.impl.PackagedElementPackageTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackagedElementPackageTypeImpl extends PackagedElementBaseTypeImpl implements PackagedElementPackageType
{
    /**
     * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageImport()
     * @generated
     * @ordered
     */
    protected EList<PackageImportType> packageImport;

    /**
     * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackagedElement()
     * @generated
     * @ordered
     */
    protected EList<PackagedElementBaseType> packagedElement;

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
    protected PackagedElementPackageTypeImpl()
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
        return UmlPackage.Literals.PACKAGED_ELEMENT_PACKAGE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageImportType> getPackageImport()
    {
        if (packageImport == null)
        {
            packageImport = new EObjectContainmentEList<PackageImportType>(PackageImportType.class, this, UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT);
        }
        return packageImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackagedElementBaseType> getPackagedElement()
    {
        if (packagedElement == null)
        {
            packagedElement = new EObjectContainmentEList<PackagedElementBaseType>(PackagedElementBaseType.class, this, UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT);
        }
        return packagedElement;
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__NAME, oldName, name));
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
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT:
                return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT:
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
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT:
                return getPackageImport();
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT:
                return getPackagedElement();
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__NAME:
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
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT:
                getPackageImport().clear();
                getPackageImport().addAll((Collection<? extends PackageImportType>)newValue);
                return;
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT:
                getPackagedElement().clear();
                getPackagedElement().addAll((Collection<? extends PackagedElementBaseType>)newValue);
                return;
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__NAME:
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
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT:
                getPackageImport().clear();
                return;
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT:
                getPackagedElement().clear();
                return;
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__NAME:
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
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT:
                return packageImport != null && !packageImport.isEmpty();
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT:
                return packagedElement != null && !packagedElement.isEmpty();
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE__NAME:
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

} //PackagedElementPackageTypeImpl
