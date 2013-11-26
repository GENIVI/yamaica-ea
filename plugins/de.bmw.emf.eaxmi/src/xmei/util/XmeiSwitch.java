/**
 */
package xmei.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xmei.*;

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
 * @see xmei.XmeiPackage
 * @generated
 */
public class XmeiSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static XmeiPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmeiSwitch()
    {
        if (modelPackage == null)
        {
            modelPackage = XmeiPackage.eINSTANCE;
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
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE:
            {
                AttributeContainmentType attributeContainmentType = (AttributeContainmentType)theEObject;
                T result = caseAttributeContainmentType(attributeContainmentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE:
            {
                AttributeModelType attributeModelType = (AttributeModelType)theEObject;
                T result = caseAttributeModelType(attributeModelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.ATTRIBUTE_PROPERTIES_TYPE:
            {
                AttributePropertiesType attributePropertiesType = (AttributePropertiesType)theEObject;
                T result = caseAttributePropertiesType(attributePropertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.ATTRIBUTES_TYPE:
            {
                AttributesType attributesType = (AttributesType)theEObject;
                T result = caseAttributesType(attributesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.ATTRIBUTE_TYPE:
            {
                AttributeType attributeType = (AttributeType)theEObject;
                T result = caseAttributeType(attributeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.BOUNDS_TYPE:
            {
                BoundsType boundsType = (BoundsType)theEObject;
                T result = caseBoundsType(boundsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CODE_TYPE:
            {
                CodeType codeType = (CodeType)theEObject;
                T result = caseCodeType(codeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONCRETE_LINK_TYPE:
            {
                ConcreteLinkType concreteLinkType = (ConcreteLinkType)theEObject;
                T result = caseConcreteLinkType(concreteLinkType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE:
            {
                ConnectorAppearanceType connectorAppearanceType = (ConnectorAppearanceType)theEObject;
                T result = caseConnectorAppearanceType(connectorAppearanceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONNECTOR_LABELS_TYPE:
            {
                ConnectorLabelsType connectorLabelsType = (ConnectorLabelsType)theEObject;
                T result = caseConnectorLabelsType(connectorLabelsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONNECTOR_MODEL_TYPE:
            {
                ConnectorModelType connectorModelType = (ConnectorModelType)theEObject;
                T result = caseConnectorModelType(connectorModelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE:
            {
                ConnectorModifiersType connectorModifiersType = (ConnectorModifiersType)theEObject;
                T result = caseConnectorModifiersType(connectorModifiersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE:
            {
                ConnectorPropertiesType connectorPropertiesType = (ConnectorPropertiesType)theEObject;
                T result = caseConnectorPropertiesType(connectorPropertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONNECTORS_TYPE:
            {
                ConnectorsType connectorsType = (ConnectorsType)theEObject;
                T result = caseConnectorsType(connectorsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.CONNECTOR_TYPE:
            {
                ConnectorType connectorType = (ConnectorType)theEObject;
                T result = caseConnectorType(connectorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DIAGRAM_ELEMENTS_TYPE:
            {
                DiagramElementsType diagramElementsType = (DiagramElementsType)theEObject;
                T result = caseDiagramElementsType(diagramElementsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE:
            {
                DiagramElementType diagramElementType = (DiagramElementType)theEObject;
                T result = caseDiagramElementType(diagramElementType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DIAGRAM_MODEL_TYPE:
            {
                DiagramModelType diagramModelType = (DiagramModelType)theEObject;
                T result = caseDiagramModelType(diagramModelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DIAGRAM_PROPERTIES_TYPE:
            {
                DiagramPropertiesType diagramPropertiesType = (DiagramPropertiesType)theEObject;
                T result = caseDiagramPropertiesType(diagramPropertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DIAGRAMS_TYPE:
            {
                DiagramsType diagramsType = (DiagramsType)theEObject;
                T result = caseDiagramsType(diagramsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DIAGRAM_TYPE:
            {
                DiagramType diagramType = (DiagramType)theEObject;
                T result = caseDiagramType(diagramType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DOCUMENTATION:
            {
                Documentation documentation = (Documentation)theEObject;
                T result = caseDocumentation(documentation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DOCUMENTATION_TYPE:
            {
                DocumentationType documentationType = (DocumentationType)theEObject;
                T result = caseDocumentationType(documentationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.ELEMENTS_TYPE:
            {
                ElementsType elementsType = (ElementsType)theEObject;
                T result = caseElementsType(elementsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.ELEMENT_TYPE:
            {
                ElementType elementType = (ElementType)theEObject;
                T result = caseElementType(elementType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE:
            {
                ExtendedPropertiesType extendedPropertiesType = (ExtendedPropertiesType)theEObject;
                T result = caseExtendedPropertiesType(extendedPropertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.EXTENSION:
            {
                Extension extension = (Extension)theEObject;
                T result = caseExtension(extension);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.INITIAL_TYPE:
            {
                InitialType initialType = (InitialType)theEObject;
                T result = caseInitialType(initialType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.LINKS_TYPE:
            {
                LinksType linksType = (LinksType)theEObject;
                T result = caseLinksType(linksType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.MODEL_TYPE:
            {
                ModelType modelType = (ModelType)theEObject;
                T result = caseModelType(modelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.OPERATION_PARAMETERS_TYPE:
            {
                OperationParametersType operationParametersType = (OperationParametersType)theEObject;
                T result = caseOperationParametersType(operationParametersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.OPERATION_PROPERTIES_TYPE:
            {
                OperationPropertiesType operationPropertiesType = (OperationPropertiesType)theEObject;
                T result = caseOperationPropertiesType(operationPropertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.OPERATIONS_TYPE:
            {
                OperationsType operationsType = (OperationsType)theEObject;
                T result = caseOperationsType(operationsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.OPERATION_TAGS_TYPE:
            {
                OperationTagsType operationTagsType = (OperationTagsType)theEObject;
                T result = caseOperationTagsType(operationTagsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.OPERATION_TYPE:
            {
                OperationType operationType = (OperationType)theEObject;
                T result = caseOperationType(operationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.OPERATION_TYPE_TYPE:
            {
                OperationTypeType operationTypeType = (OperationTypeType)theEObject;
                T result = caseOperationTypeType(operationTypeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE:
            {
                ParameterPropertiesType parameterPropertiesType = (ParameterPropertiesType)theEObject;
                T result = caseParameterPropertiesType(parameterPropertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.PARAMETER_TYPE:
            {
                ParameterType parameterType = (ParameterType)theEObject;
                T result = caseParameterType(parameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.PRIMITIVE_TYPES_TYPE:
            {
                PrimitiveTypesType primitiveTypesType = (PrimitiveTypesType)theEObject;
                T result = casePrimitiveTypesType(primitiveTypesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.PROJECT_TYPE:
            {
                ProjectType projectType = (ProjectType)theEObject;
                T result = caseProjectType(projectType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.PROPERTIES_TYPE:
            {
                PropertiesType propertiesType = (PropertiesType)theEObject;
                T result = casePropertiesType(propertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE:
            {
                SourceAndTargetModelType sourceAndTargetModelType = (SourceAndTargetModelType)theEObject;
                T result = caseSourceAndTargetModelType(sourceAndTargetModelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE:
            {
                SourceAndTargetRoleType sourceAndTargetRoleType = (SourceAndTargetRoleType)theEObject;
                T result = caseSourceAndTargetRoleType(sourceAndTargetRoleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.SOURCE_AND_TARGET_TYPE:
            {
                SourceAndTargetType sourceAndTargetType = (SourceAndTargetType)theEObject;
                T result = caseSourceAndTargetType(sourceAndTargetType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE:
            {
                SourceAndTargetTypeType sourceAndTargetTypeType = (SourceAndTargetTypeType)theEObject;
                T result = caseSourceAndTargetTypeType(sourceAndTargetTypeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE:
            {
                StereotypeAttributeType stereotypeAttributeType = (StereotypeAttributeType)theEObject;
                T result = caseStereotypeAttributeType(stereotypeAttributeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.STYLEEX_TYPE:
            {
                StyleexType styleexType = (StyleexType)theEObject;
                T result = caseStyleexType(styleexType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.TAG_TYPE:
            {
                TagType tagType = (TagType)theEObject;
                T result = caseTagType(tagType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.DOCUMENT_ROOT:
            {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.XMI_TYPE:
            {
                XMIType xmiType = (XMIType)theEObject;
                T result = caseXMIType(xmiType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmeiPackage.XREFS_TYPE:
            {
                XrefsType xrefsType = (XrefsType)theEObject;
                T result = caseXrefsType(xrefsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Containment Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Containment Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeContainmentType(AttributeContainmentType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Model Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Model Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeModelType(AttributeModelType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributePropertiesType(AttributePropertiesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attributes Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attributes Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributesType(AttributesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeType(AttributeType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bounds Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bounds Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoundsType(BoundsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCodeType(CodeType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Concrete Link Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Concrete Link Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConcreteLinkType(ConcreteLinkType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector Appearance Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector Appearance Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectorAppearanceType(ConnectorAppearanceType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector Labels Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector Labels Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectorLabelsType(ConnectorLabelsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector Model Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector Model Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectorModelType(ConnectorModelType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector Modifiers Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector Modifiers Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectorModifiersType(ConnectorModifiersType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectorPropertiesType(ConnectorPropertiesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connectors Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connectors Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectorsType(ConnectorsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectorType(ConnectorType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Elements Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Elements Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramElementsType(DiagramElementsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Element Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Element Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramElementType(DiagramElementType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Model Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Model Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramModelType(DiagramModelType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramPropertiesType(DiagramPropertiesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagrams Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagrams Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramsType(DiagramsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramType(DiagramType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentation(Documentation object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Documentation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Documentation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentationType(DocumentationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Elements Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Elements Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElementsType(ElementsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElementType(ElementType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extended Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extended Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtendedPropertiesType(ExtendedPropertiesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtension(Extension object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Initial Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Initial Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInitialType(InitialType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Links Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Links Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinksType(LinksType object)
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
     * Returns the result of interpreting the object as an instance of '<em>Operation Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Parameters Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationParametersType(OperationParametersType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationPropertiesType(OperationPropertiesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operations Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operations Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationsType(OperationsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Tags Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Tags Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationTagsType(OperationTagsType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationType(OperationType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Type Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Type Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationTypeType(OperationTypeType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameterPropertiesType(ParameterPropertiesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameterType(ParameterType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primitive Types Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primitive Types Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimitiveTypesType(PrimitiveTypesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Project Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Project Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProjectType(ProjectType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertiesType(PropertiesType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source And Target Model Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source And Target Model Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSourceAndTargetModelType(SourceAndTargetModelType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source And Target Role Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source And Target Role Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSourceAndTargetRoleType(SourceAndTargetRoleType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source And Target Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source And Target Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSourceAndTargetType(SourceAndTargetType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source And Target Type Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source And Target Type Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSourceAndTargetTypeType(SourceAndTargetTypeType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Stereotype Attribute Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Stereotype Attribute Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStereotypeAttributeType(StereotypeAttributeType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Styleex Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Styleex Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyleexType(StyleexType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tag Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tag Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTagType(TagType object)
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
     * Returns the result of interpreting the object as an instance of '<em>XMI Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XMI Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXMIType(XMIType object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Xrefs Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xrefs Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXrefsType(XrefsType object)
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

} //XmeiSwitch
