/**
 */
package xmei.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xmei.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage
 * @generated
 */
public class XmeiAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static XmeiPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmeiAdapterFactory()
    {
        if (modelPackage == null)
        {
            modelPackage = XmeiPackage.eINSTANCE;
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
    protected XmeiSwitch<Adapter> modelSwitch =
        new XmeiSwitch<Adapter>()
        {
            @Override
            public Adapter caseAttributeContainmentType(AttributeContainmentType object)
            {
                return createAttributeContainmentTypeAdapter();
            }
            @Override
            public Adapter caseAttributeModelType(AttributeModelType object)
            {
                return createAttributeModelTypeAdapter();
            }
            @Override
            public Adapter caseAttributePropertiesType(AttributePropertiesType object)
            {
                return createAttributePropertiesTypeAdapter();
            }
            @Override
            public Adapter caseAttributesType(AttributesType object)
            {
                return createAttributesTypeAdapter();
            }
            @Override
            public Adapter caseAttributeType(AttributeType object)
            {
                return createAttributeTypeAdapter();
            }
            @Override
            public Adapter caseBoundsType(BoundsType object)
            {
                return createBoundsTypeAdapter();
            }
            @Override
            public Adapter caseCodeType(CodeType object)
            {
                return createCodeTypeAdapter();
            }
            @Override
            public Adapter caseConcreteLinkType(ConcreteLinkType object)
            {
                return createConcreteLinkTypeAdapter();
            }
            @Override
            public Adapter caseConnectorAppearanceType(ConnectorAppearanceType object)
            {
                return createConnectorAppearanceTypeAdapter();
            }
            @Override
            public Adapter caseConnectorLabelsType(ConnectorLabelsType object)
            {
                return createConnectorLabelsTypeAdapter();
            }
            @Override
            public Adapter caseConnectorModelType(ConnectorModelType object)
            {
                return createConnectorModelTypeAdapter();
            }
            @Override
            public Adapter caseConnectorModifiersType(ConnectorModifiersType object)
            {
                return createConnectorModifiersTypeAdapter();
            }
            @Override
            public Adapter caseConnectorPropertiesType(ConnectorPropertiesType object)
            {
                return createConnectorPropertiesTypeAdapter();
            }
            @Override
            public Adapter caseConnectorsType(ConnectorsType object)
            {
                return createConnectorsTypeAdapter();
            }
            @Override
            public Adapter caseConnectorType(ConnectorType object)
            {
                return createConnectorTypeAdapter();
            }
            @Override
            public Adapter caseDiagramElementsType(DiagramElementsType object)
            {
                return createDiagramElementsTypeAdapter();
            }
            @Override
            public Adapter caseDiagramElementType(DiagramElementType object)
            {
                return createDiagramElementTypeAdapter();
            }
            @Override
            public Adapter caseDiagramModelType(DiagramModelType object)
            {
                return createDiagramModelTypeAdapter();
            }
            @Override
            public Adapter caseDiagramPropertiesType(DiagramPropertiesType object)
            {
                return createDiagramPropertiesTypeAdapter();
            }
            @Override
            public Adapter caseDiagramsType(DiagramsType object)
            {
                return createDiagramsTypeAdapter();
            }
            @Override
            public Adapter caseDiagramType(DiagramType object)
            {
                return createDiagramTypeAdapter();
            }
            @Override
            public Adapter caseDocumentation(Documentation object)
            {
                return createDocumentationAdapter();
            }
            @Override
            public Adapter caseDocumentationType(DocumentationType object)
            {
                return createDocumentationTypeAdapter();
            }
            @Override
            public Adapter caseElementsType(ElementsType object)
            {
                return createElementsTypeAdapter();
            }
            @Override
            public Adapter caseElementType(ElementType object)
            {
                return createElementTypeAdapter();
            }
            @Override
            public Adapter caseExtendedPropertiesType(ExtendedPropertiesType object)
            {
                return createExtendedPropertiesTypeAdapter();
            }
            @Override
            public Adapter caseExtension(Extension object)
            {
                return createExtensionAdapter();
            }
            @Override
            public Adapter caseInitialType(InitialType object)
            {
                return createInitialTypeAdapter();
            }
            @Override
            public Adapter caseLinksType(LinksType object)
            {
                return createLinksTypeAdapter();
            }
            @Override
            public Adapter caseModelType(ModelType object)
            {
                return createModelTypeAdapter();
            }
            @Override
            public Adapter caseOperationParametersType(OperationParametersType object)
            {
                return createOperationParametersTypeAdapter();
            }
            @Override
            public Adapter caseOperationPropertiesType(OperationPropertiesType object)
            {
                return createOperationPropertiesTypeAdapter();
            }
            @Override
            public Adapter caseOperationsType(OperationsType object)
            {
                return createOperationsTypeAdapter();
            }
            @Override
            public Adapter caseOperationTagsType(OperationTagsType object)
            {
                return createOperationTagsTypeAdapter();
            }
            @Override
            public Adapter caseOperationType(OperationType object)
            {
                return createOperationTypeAdapter();
            }
            @Override
            public Adapter caseOperationTypeType(OperationTypeType object)
            {
                return createOperationTypeTypeAdapter();
            }
            @Override
            public Adapter caseParameterPropertiesType(ParameterPropertiesType object)
            {
                return createParameterPropertiesTypeAdapter();
            }
            @Override
            public Adapter caseParameterType(ParameterType object)
            {
                return createParameterTypeAdapter();
            }
            @Override
            public Adapter casePrimitiveTypesType(PrimitiveTypesType object)
            {
                return createPrimitiveTypesTypeAdapter();
            }
            @Override
            public Adapter caseProjectType(ProjectType object)
            {
                return createProjectTypeAdapter();
            }
            @Override
            public Adapter casePropertiesType(PropertiesType object)
            {
                return createPropertiesTypeAdapter();
            }
            @Override
            public Adapter caseSourceAndTargetModelType(SourceAndTargetModelType object)
            {
                return createSourceAndTargetModelTypeAdapter();
            }
            @Override
            public Adapter caseSourceAndTargetRoleType(SourceAndTargetRoleType object)
            {
                return createSourceAndTargetRoleTypeAdapter();
            }
            @Override
            public Adapter caseSourceAndTargetType(SourceAndTargetType object)
            {
                return createSourceAndTargetTypeAdapter();
            }
            @Override
            public Adapter caseSourceAndTargetTypeType(SourceAndTargetTypeType object)
            {
                return createSourceAndTargetTypeTypeAdapter();
            }
            @Override
            public Adapter caseStereotypeAttributeType(StereotypeAttributeType object)
            {
                return createStereotypeAttributeTypeAdapter();
            }
            @Override
            public Adapter caseStyleexType(StyleexType object)
            {
                return createStyleexTypeAdapter();
            }
            @Override
            public Adapter caseTagType(TagType object)
            {
                return createTagTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object)
            {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseXMIType(XMIType object)
            {
                return createXMITypeAdapter();
            }
            @Override
            public Adapter caseXrefsType(XrefsType object)
            {
                return createXrefsTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link xmei.AttributeContainmentType <em>Attribute Containment Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.AttributeContainmentType
     * @generated
     */
    public Adapter createAttributeContainmentTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.AttributeModelType <em>Attribute Model Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.AttributeModelType
     * @generated
     */
    public Adapter createAttributeModelTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.AttributePropertiesType <em>Attribute Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.AttributePropertiesType
     * @generated
     */
    public Adapter createAttributePropertiesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.AttributesType <em>Attributes Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.AttributesType
     * @generated
     */
    public Adapter createAttributesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.AttributeType <em>Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.AttributeType
     * @generated
     */
    public Adapter createAttributeTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.BoundsType <em>Bounds Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.BoundsType
     * @generated
     */
    public Adapter createBoundsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.CodeType <em>Code Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.CodeType
     * @generated
     */
    public Adapter createCodeTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConcreteLinkType <em>Concrete Link Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConcreteLinkType
     * @generated
     */
    public Adapter createConcreteLinkTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConnectorAppearanceType <em>Connector Appearance Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConnectorAppearanceType
     * @generated
     */
    public Adapter createConnectorAppearanceTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConnectorLabelsType <em>Connector Labels Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConnectorLabelsType
     * @generated
     */
    public Adapter createConnectorLabelsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConnectorModelType <em>Connector Model Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConnectorModelType
     * @generated
     */
    public Adapter createConnectorModelTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConnectorModifiersType <em>Connector Modifiers Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConnectorModifiersType
     * @generated
     */
    public Adapter createConnectorModifiersTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConnectorPropertiesType <em>Connector Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConnectorPropertiesType
     * @generated
     */
    public Adapter createConnectorPropertiesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConnectorsType <em>Connectors Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConnectorsType
     * @generated
     */
    public Adapter createConnectorsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ConnectorType <em>Connector Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ConnectorType
     * @generated
     */
    public Adapter createConnectorTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DiagramElementsType <em>Diagram Elements Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DiagramElementsType
     * @generated
     */
    public Adapter createDiagramElementsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DiagramElementType <em>Diagram Element Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DiagramElementType
     * @generated
     */
    public Adapter createDiagramElementTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DiagramModelType <em>Diagram Model Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DiagramModelType
     * @generated
     */
    public Adapter createDiagramModelTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DiagramPropertiesType <em>Diagram Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DiagramPropertiesType
     * @generated
     */
    public Adapter createDiagramPropertiesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DiagramsType <em>Diagrams Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DiagramsType
     * @generated
     */
    public Adapter createDiagramsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DiagramType <em>Diagram Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DiagramType
     * @generated
     */
    public Adapter createDiagramTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.Documentation
     * @generated
     */
    public Adapter createDocumentationAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DocumentationType <em>Documentation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DocumentationType
     * @generated
     */
    public Adapter createDocumentationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ElementsType <em>Elements Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ElementsType
     * @generated
     */
    public Adapter createElementsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ElementType <em>Element Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ElementType
     * @generated
     */
    public Adapter createElementTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ExtendedPropertiesType <em>Extended Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ExtendedPropertiesType
     * @generated
     */
    public Adapter createExtendedPropertiesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.Extension
     * @generated
     */
    public Adapter createExtensionAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.InitialType <em>Initial Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.InitialType
     * @generated
     */
    public Adapter createInitialTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.LinksType <em>Links Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.LinksType
     * @generated
     */
    public Adapter createLinksTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ModelType <em>Model Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ModelType
     * @generated
     */
    public Adapter createModelTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.OperationParametersType <em>Operation Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.OperationParametersType
     * @generated
     */
    public Adapter createOperationParametersTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.OperationPropertiesType <em>Operation Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.OperationPropertiesType
     * @generated
     */
    public Adapter createOperationPropertiesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.OperationsType <em>Operations Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.OperationsType
     * @generated
     */
    public Adapter createOperationsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.OperationTagsType <em>Operation Tags Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.OperationTagsType
     * @generated
     */
    public Adapter createOperationTagsTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.OperationType <em>Operation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.OperationType
     * @generated
     */
    public Adapter createOperationTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.OperationTypeType <em>Operation Type Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.OperationTypeType
     * @generated
     */
    public Adapter createOperationTypeTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ParameterPropertiesType <em>Parameter Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ParameterPropertiesType
     * @generated
     */
    public Adapter createParameterPropertiesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ParameterType <em>Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ParameterType
     * @generated
     */
    public Adapter createParameterTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.PrimitiveTypesType <em>Primitive Types Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.PrimitiveTypesType
     * @generated
     */
    public Adapter createPrimitiveTypesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.ProjectType <em>Project Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.ProjectType
     * @generated
     */
    public Adapter createProjectTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.PropertiesType
     * @generated
     */
    public Adapter createPropertiesTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.SourceAndTargetModelType <em>Source And Target Model Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.SourceAndTargetModelType
     * @generated
     */
    public Adapter createSourceAndTargetModelTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.SourceAndTargetRoleType <em>Source And Target Role Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.SourceAndTargetRoleType
     * @generated
     */
    public Adapter createSourceAndTargetRoleTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.SourceAndTargetType <em>Source And Target Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.SourceAndTargetType
     * @generated
     */
    public Adapter createSourceAndTargetTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.SourceAndTargetTypeType <em>Source And Target Type Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.SourceAndTargetTypeType
     * @generated
     */
    public Adapter createSourceAndTargetTypeTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.StereotypeAttributeType <em>Stereotype Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.StereotypeAttributeType
     * @generated
     */
    public Adapter createStereotypeAttributeTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.StyleexType <em>Styleex Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.StyleexType
     * @generated
     */
    public Adapter createStyleexTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.TagType <em>Tag Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.TagType
     * @generated
     */
    public Adapter createTagTypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.XMIType <em>XMI Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.XMIType
     * @generated
     */
    public Adapter createXMITypeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link xmei.XrefsType <em>Xrefs Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see xmei.XrefsType
     * @generated
     */
    public Adapter createXrefsTypeAdapter()
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

} //XmeiAdapterFactory
