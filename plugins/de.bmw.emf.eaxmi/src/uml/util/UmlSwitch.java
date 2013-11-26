/**
 */
package uml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public class UmlSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UmlPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlSwitch()
    {
        if (modelPackage == null)
        {
            modelPackage = UmlPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage)
    {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject)
    {
        switch (classifierID)
        {
            case UmlPackage.DEFAULT_VALUE_TYPE:
            {
                DefaultValueType defaultValueType = (DefaultValueType)theEObject;
                T result = caseDefaultValueType(defaultValueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.DOCUMENT_ROOT:
            {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.GENERALIZATION_TYPE:
            {
                GeneralizationType generalizationType = (GeneralizationType)theEObject;
                T result = caseGeneralizationType(generalizationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.MEMBER_END_TYPE:
            {
                MemberEndType memberEndType = (MemberEndType)theEObject;
                T result = caseMemberEndType(memberEndType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.MODEL_TYPE:
            {
                ModelType modelType = (ModelType)theEObject;
                T result = caseModelType(modelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.MULTIPLICITY_VALUE_TYPE:
            {
                MultiplicityValueType multiplicityValueType = (MultiplicityValueType)theEObject;
                T result = caseMultiplicityValueType(multiplicityValueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE:
            {
                OwnedAttributeBaseType ownedAttributeBaseType = (OwnedAttributeBaseType)theEObject;
                T result = caseOwnedAttributeBaseType(ownedAttributeBaseType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE:
            {
                OwnedAttributeExtendedAttributesType ownedAttributeExtendedAttributesType = (OwnedAttributeExtendedAttributesType)theEObject;
                T result = caseOwnedAttributeExtendedAttributesType(ownedAttributeExtendedAttributesType);
                if (result == null) result = caseOwnedAttributeBaseType(ownedAttributeExtendedAttributesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE:
            {
                OwnedAttributeExtendedContentType ownedAttributeExtendedContentType = (OwnedAttributeExtendedContentType)theEObject;
                T result = caseOwnedAttributeExtendedContentType(ownedAttributeExtendedContentType);
                if (result == null) result = caseOwnedAttributeExtendedAttributesType(ownedAttributeExtendedContentType);
                if (result == null) result = caseOwnedAttributeBaseType(ownedAttributeExtendedContentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.OWNED_LITERAL_TYPE:
            {
                OwnedLiteralType ownedLiteralType = (OwnedLiteralType)theEObject;
                T result = caseOwnedLiteralType(ownedLiteralType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.OWNED_OPERATION_TYPE:
            {
                OwnedOperationType ownedOperationType = (OwnedOperationType)theEObject;
                T result = caseOwnedOperationType(ownedOperationType);
                if (result == null) result = casePackagedElementBaseType(ownedOperationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.OWNED_PARAMETER_TYPE:
            {
                OwnedParameterType ownedParameterType = (OwnedParameterType)theEObject;
                T result = caseOwnedParameterType(ownedParameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE:
            {
                PackagedElementAssociationType packagedElementAssociationType = (PackagedElementAssociationType)theEObject;
                T result = casePackagedElementAssociationType(packagedElementAssociationType);
                if (result == null) result = casePackagedElementBaseType(packagedElementAssociationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.PACKAGED_ELEMENT_BASE_TYPE:
            {
                PackagedElementBaseType packagedElementBaseType = (PackagedElementBaseType)theEObject;
                T result = casePackagedElementBaseType(packagedElementBaseType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE:
            {
                PackagedElementInstanceSpecificationType packagedElementInstanceSpecificationType = (PackagedElementInstanceSpecificationType)theEObject;
                T result = casePackagedElementInstanceSpecificationType(packagedElementInstanceSpecificationType);
                if (result == null) result = casePackagedElementBaseType(packagedElementInstanceSpecificationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE:
            {
                PackagedElementPackageType packagedElementPackageType = (PackagedElementPackageType)theEObject;
                T result = casePackagedElementPackageType(packagedElementPackageType);
                if (result == null) result = casePackagedElementBaseType(packagedElementPackageType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE:
            {
                PackagedElementRelationType packagedElementRelationType = (PackagedElementRelationType)theEObject;
                T result = casePackagedElementRelationType(packagedElementRelationType);
                if (result == null) result = casePackagedElementBaseType(packagedElementRelationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.PACKAGE_IMPORT_TYPE:
            {
                PackageImportType packageImportType = (PackageImportType)theEObject;
                T result = casePackageImportType(packageImportType);
                if (result == null) result = casePackagedElementBaseType(packageImportType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.TYPE_TYPE:
            {
                TypeType typeType = (TypeType)theEObject;
                T result = caseTypeType(typeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.UML_CLASS_TYPE:
            {
                UmlClassType umlClassType = (UmlClassType)theEObject;
                T result = caseUmlClassType(umlClassType);
                if (result == null) result = casePackagedElementBaseType(umlClassType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.UML_ENUMERATION_TYPE:
            {
                UmlEnumerationType umlEnumerationType = (UmlEnumerationType)theEObject;
                T result = caseUmlEnumerationType(umlEnumerationType);
                if (result == null) result = casePackagedElementBaseType(umlEnumerationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.UML_INTERFACE_TYPE:
            {
                UmlInterfaceType umlInterfaceType = (UmlInterfaceType)theEObject;
                T result = caseUmlInterfaceType(umlInterfaceType);
                if (result == null) result = casePackagedElementPackageType(umlInterfaceType);
                if (result == null) result = casePackagedElementBaseType(umlInterfaceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefaultValueType(DefaultValueType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generalization Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generalization Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneralizationType(GeneralizationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member End Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member End Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemberEndType(MemberEndType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelType(ModelType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiplicity Value Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplicity Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplicityValueType(MultiplicityValueType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Owned Attribute Base Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Owned Attribute Base Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnedAttributeBaseType(OwnedAttributeBaseType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Owned Attribute Extended Attributes Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Owned Attribute Extended Attributes Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnedAttributeExtendedAttributesType(OwnedAttributeExtendedAttributesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Owned Attribute Extended Content Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Owned Attribute Extended Content Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnedAttributeExtendedContentType(OwnedAttributeExtendedContentType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Owned Literal Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Owned Literal Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnedLiteralType(OwnedLiteralType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Owned Operation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Owned Operation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnedOperationType(OwnedOperationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Owned Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Owned Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnedParameterType(OwnedParameterType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Packaged Element Association Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Packaged Element Association Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackagedElementAssociationType(PackagedElementAssociationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Packaged Element Base Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Packaged Element Base Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackagedElementBaseType(PackagedElementBaseType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Packaged Element Instance Specification Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Packaged Element Instance Specification Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackagedElementInstanceSpecificationType(PackagedElementInstanceSpecificationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Packaged Element Package Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Packaged Element Package Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackagedElementPackageType(PackagedElementPackageType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Packaged Element Relation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Packaged Element Relation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackagedElementRelationType(PackagedElementRelationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package Import Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package Import Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackageImportType(PackageImportType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeType(TypeType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUmlClassType(UmlClassType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUmlEnumerationType(UmlEnumerationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUmlInterfaceType(UmlInterfaceType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object)
    {
        return null;
    }

} //UmlSwitch
