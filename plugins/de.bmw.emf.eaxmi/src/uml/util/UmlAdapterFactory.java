/**
 */
package uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public class UmlAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UmlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlAdapterFactory()
    {
        if (modelPackage == null)
        {
            modelPackage = UmlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object)
    {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UmlSwitch<Adapter> modelSwitch =
        new UmlSwitch<Adapter>()
        {
            @Override
            public Adapter caseDefaultValueType(DefaultValueType object)
            {
                return createDefaultValueTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object)
            {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseGeneralizationType(GeneralizationType object)
            {
                return createGeneralizationTypeAdapter();
            }
            @Override
            public Adapter caseMemberEndType(MemberEndType object)
            {
                return createMemberEndTypeAdapter();
            }
            @Override
            public Adapter caseModelType(ModelType object)
            {
                return createModelTypeAdapter();
            }
            @Override
            public Adapter caseMultiplicityValueType(MultiplicityValueType object)
            {
                return createMultiplicityValueTypeAdapter();
            }
            @Override
            public Adapter caseOwnedAttributeBaseType(OwnedAttributeBaseType object)
            {
                return createOwnedAttributeBaseTypeAdapter();
            }
            @Override
            public Adapter caseOwnedAttributeExtendedAttributesType(OwnedAttributeExtendedAttributesType object)
            {
                return createOwnedAttributeExtendedAttributesTypeAdapter();
            }
            @Override
            public Adapter caseOwnedAttributeExtendedContentType(OwnedAttributeExtendedContentType object)
            {
                return createOwnedAttributeExtendedContentTypeAdapter();
            }
            @Override
            public Adapter caseOwnedLiteralType(OwnedLiteralType object)
            {
                return createOwnedLiteralTypeAdapter();
            }
            @Override
            public Adapter caseOwnedOperationType(OwnedOperationType object)
            {
                return createOwnedOperationTypeAdapter();
            }
            @Override
            public Adapter caseOwnedParameterType(OwnedParameterType object)
            {
                return createOwnedParameterTypeAdapter();
            }
            @Override
            public Adapter casePackagedElementAssociationType(PackagedElementAssociationType object)
            {
                return createPackagedElementAssociationTypeAdapter();
            }
            @Override
            public Adapter casePackagedElementBaseType(PackagedElementBaseType object)
            {
                return createPackagedElementBaseTypeAdapter();
            }
            @Override
            public Adapter casePackagedElementInstanceSpecificationType(PackagedElementInstanceSpecificationType object)
            {
                return createPackagedElementInstanceSpecificationTypeAdapter();
            }
            @Override
            public Adapter casePackagedElementPackageType(PackagedElementPackageType object)
            {
                return createPackagedElementPackageTypeAdapter();
            }
            @Override
            public Adapter casePackagedElementRelationType(PackagedElementRelationType object)
            {
                return createPackagedElementRelationTypeAdapter();
            }
            @Override
            public Adapter casePackageImportType(PackageImportType object)
            {
                return createPackageImportTypeAdapter();
            }
            @Override
            public Adapter caseTypeType(TypeType object)
            {
                return createTypeTypeAdapter();
            }
            @Override
            public Adapter caseUmlClassType(UmlClassType object)
            {
                return createUmlClassTypeAdapter();
            }
            @Override
            public Adapter caseUmlEnumerationType(UmlEnumerationType object)
            {
                return createUmlEnumerationTypeAdapter();
            }
            @Override
            public Adapter caseUmlInterfaceType(UmlInterfaceType object)
            {
                return createUmlInterfaceTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object)
            {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target)
    {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link uml.DefaultValueType <em>Default Value Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DefaultValueType
     * @generated
     */
    public Adapter createDefaultValueTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.GeneralizationType <em>Generalization Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.GeneralizationType
     * @generated
     */
    public Adapter createGeneralizationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.MemberEndType <em>Member End Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.MemberEndType
     * @generated
     */
    public Adapter createMemberEndTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ModelType <em>Model Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ModelType
     * @generated
     */
    public Adapter createModelTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.MultiplicityValueType <em>Multiplicity Value Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.MultiplicityValueType
     * @generated
     */
    public Adapter createMultiplicityValueTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OwnedAttributeBaseType <em>Owned Attribute Base Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OwnedAttributeBaseType
     * @generated
     */
    public Adapter createOwnedAttributeBaseTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OwnedAttributeExtendedAttributesType <em>Owned Attribute Extended Attributes Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OwnedAttributeExtendedAttributesType
     * @generated
     */
    public Adapter createOwnedAttributeExtendedAttributesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OwnedAttributeExtendedContentType <em>Owned Attribute Extended Content Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OwnedAttributeExtendedContentType
     * @generated
     */
    public Adapter createOwnedAttributeExtendedContentTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OwnedLiteralType <em>Owned Literal Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OwnedLiteralType
     * @generated
     */
    public Adapter createOwnedLiteralTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OwnedOperationType <em>Owned Operation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OwnedOperationType
     * @generated
     */
    public Adapter createOwnedOperationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OwnedParameterType <em>Owned Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OwnedParameterType
     * @generated
     */
    public Adapter createOwnedParameterTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackagedElementAssociationType <em>Packaged Element Association Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackagedElementAssociationType
     * @generated
     */
    public Adapter createPackagedElementAssociationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackagedElementBaseType <em>Packaged Element Base Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackagedElementBaseType
     * @generated
     */
    public Adapter createPackagedElementBaseTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackagedElementInstanceSpecificationType <em>Packaged Element Instance Specification Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackagedElementInstanceSpecificationType
     * @generated
     */
    public Adapter createPackagedElementInstanceSpecificationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackagedElementPackageType <em>Packaged Element Package Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackagedElementPackageType
     * @generated
     */
    public Adapter createPackagedElementPackageTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackagedElementRelationType <em>Packaged Element Relation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackagedElementRelationType
     * @generated
     */
    public Adapter createPackagedElementRelationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackageImportType <em>Package Import Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackageImportType
     * @generated
     */
    public Adapter createPackageImportTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TypeType <em>Type Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TypeType
     * @generated
     */
    public Adapter createTypeTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.UmlClassType <em>Class Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.UmlClassType
     * @generated
     */
    public Adapter createUmlClassTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.UmlEnumerationType <em>Enumeration Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.UmlEnumerationType
     * @generated
     */
    public Adapter createUmlEnumerationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.UmlInterfaceType <em>Interface Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.UmlInterfaceType
     * @generated
     */
    public Adapter createUmlInterfaceTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter()
    {
        return null;
    }

} //UmlAdapterFactory
