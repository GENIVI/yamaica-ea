/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.containers.EAAttributeContainer
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace
import de.bmw.yamaica.ea.core.containers.EAElementContainer
import de.bmw.yamaica.ea.core.containers.EAMethodContainer
import de.bmw.yamaica.ea.core.franca.exceptions.ArrayTypeCountException
import de.bmw.yamaica.ea.core.franca.exceptions.BaseTypeCountException
import de.bmw.yamaica.ea.core.franca.exceptions.BaseTypeDataTypeException
import de.bmw.yamaica.ea.core.franca.exceptions.ClientInterfaceCountException
import de.bmw.yamaica.ea.core.franca.exceptions.NameNormalizationException
import de.bmw.yamaica.franca.common.core.FrancaUtils
import java.util.LinkedHashMap
import java.util.Map
import java.util.logging.Level
import java.util.logging.Logger
import org.eclipse.core.runtime.IPath

import static extension de.bmw.yamaica.ea.core.franca.EAContainerExtensions.*

class EA2FrancaUtils
{
    static val ARRAY_OF_ASSOCIATION_COUNT_MESSAGE = "The element has more than one «" + EAFrancaConstants.STEREOTYPE_ARRAF_OF +
        "» association!"
    static val BASE_TYPE_COUNT_MESSAGE = "The element has more than one base type!"
    static val CLIENT_INTERFACE_COUNT_MESSAGE = "The element has more than one client interface!"
    static val BASE_TYPE_WRONG_DATA_TYPE_MESSAGE = "The declared base element \"%s\" is of a different data type!"

    private val static Logger LOGGER = Logger.getLogger(typeof(EA2FrancaUtils).name)

    extension EAIssueLogger logger

    new(EAIssueLogger logger)
    {
        this.logger = logger
    }

    def EAElementContainer getBaseElement(EAElementContainer element)
    {
        val baseClasses = element.baseClasses

        if(baseClasses.size > 1)
        {
            addIssue(typeof(BaseTypeCountException), element, BASE_TYPE_COUNT_MESSAGE)
        }
        val baseClass = baseClasses.head
        val francaDataType = element.francaDataType

        if(null != baseClass && !francaDataType.equals(EAFrancaDataType.TYPEDEF) && !francaDataType.equals(baseClass.francaDataType))
        {
            addIssue(typeof(BaseTypeDataTypeException), element, BASE_TYPE_WRONG_DATA_TYPE_MESSAGE, baseClass.namespace)
        }
        return baseClass
    }

    /**
     * Searches for the "opposite" Franca interface. An opposite interface must be connected
     * with an undirected association with stereotype "FrancaInterface" with the referred
     * interface element. Further more its name must end with "Client" if the name of the
     * referred interface does not end with "Client" or vice versa. The rest of the name must
     * be identically.
     */
    def EAElementContainer getOppositeFrancaInterfaceElement(EAElementContainer element)
    {
        val elementName = element.fidlName
        val oppositeFrancaInterfaceElements = element.getConnectors(EAConnectorContainer.Type.ASSOCIATION).filter [ connector |
            connector.hasStereotype(EAFrancaConstants.STEREOTYPE_FRANCA_INTERFACE) && !connector.directed
        ].map[getOpposite(element)].filter [ oppositeElement |
            val oppositeElementName = oppositeElement.fidlName
            val isInterfaceType = oppositeElement.type.equals(EAElementContainer.Type.INTERFACE)
            val isOppositeByName = elementName.equals(oppositeElementName + EAFrancaConstants.CLIENT_INTERFACE_NAME_SUFFIX) ||
                oppositeElementName.equals(elementName + EAFrancaConstants.CLIENT_INTERFACE_NAME_SUFFIX)
            val isOppositeByStereotype = oppositeElement.hasStereotype(EAFrancaConstants.STEREOTYPE_FRANCA_SERVICE_INTERFACE) &&
                element.hasStereotype(EAFrancaConstants.STEREOTYPE_FRANCA_CLIENT_INTERFACE) || element.hasStereotype(
                EAFrancaConstants.STEREOTYPE_FRANCA_SERVICE_INTERFACE) &&
                oppositeElement.hasStereotype(EAFrancaConstants.STEREOTYPE_FRANCA_CLIENT_INTERFACE)
            return (isInterfaceType && (isOppositeByName || isOppositeByStereotype))
        ].toList
        if(oppositeFrancaInterfaceElements.size > 1)
        {
            // Details information in case of more than one FrancaInterface elements.
            val StringBuilder severalFrancaInterfaceDetailsMsg = new StringBuilder("[ ")
            val int initialLength = severalFrancaInterfaceDetailsMsg.length
            for(EAElementContainer francaInterfaceElement : oppositeFrancaInterfaceElements) {
                // In case of more than one element.
                if(severalFrancaInterfaceDetailsMsg.length > initialLength) {
                    severalFrancaInterfaceDetailsMsg.append(", ")
                }
                severalFrancaInterfaceDetailsMsg.append(String.format("Name: '%s', Namespace: '%s', Notes: '%s'", francaInterfaceElement.name, francaInterfaceElement.namespace, francaInterfaceElement.notes))
            }
            severalFrancaInterfaceDetailsMsg.append(" ]")
            // The element has more than one client interface! Details using FINEST.
            LOGGER.log(Level.FINEST, String.format("More than one client interface found: EAElementContainer element name: '%s'. Details: '%s'", elementName, severalFrancaInterfaceDetailsMsg.toString()))
            addIssue(typeof(ClientInterfaceCountException), element, CLIENT_INTERFACE_COUNT_MESSAGE)
        }
        return oppositeFrancaInterfaceElements.head
    }

    def boolean isClientFrancaInterfaceElement(EAElementContainer element)
    {
        val oppositeFrancaInterfaceElement = element.oppositeFrancaInterfaceElement

        if(null == oppositeFrancaInterfaceElement || !element.type.equals(EAElementContainer.Type.INTERFACE))
        {
            return false
        }
        else if(element.fidlName.equals(oppositeFrancaInterfaceElement.fidlName + EAFrancaConstants.CLIENT_INTERFACE_NAME_SUFFIX))
        {
            return true
        }
        else if(element.hasStereotype(EAFrancaConstants.STEREOTYPE_FRANCA_CLIENT_INTERFACE))
        {
            return true
        }
        else
        {
            return false
        }
    }

    def boolean isTransformableInterfaceElement(EAElementContainer element)
    {
        return element.type.equals(EAElementContainer.Type.INTERFACE) && !element.isClientFrancaInterfaceElement
    }

    def EAElementContainer getArrayTypeElement(EAElementContainer element)
    {

        // find all directed association with stereotype "arrayOf" and get the opposite element of this association
        val arrayOfAssociations = element.getConnectors(EAConnectorContainer.Type.ASSOCIATION).filter [ connector |
            connector.hasStereotype(EAFrancaConstants.STEREOTYPE_ARRAF_OF) && connector.isNavigable(connector.getOpposite(element)) &&
                !connector.isNavigable(element)
        ]
        if(arrayOfAssociations.size > 1)
        {
            addIssue(typeof(ArrayTypeCountException), element, ARRAY_OF_ASSOCIATION_COUNT_MESSAGE)
        }
        val oppositeElement = arrayOfAssociations.head?.getOpposite(element)

        if(null != oppositeElement && oppositeElement.type == EAElementContainer.Type.CLASS)
        {
            return oppositeElement
        }
        else
        {
            return null
        }
    }

    def boolean isReadOnlyAttribute(EAAttributeContainer attribute)
    {
        return attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_READ_ONLY) ||
            attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_ATTRIBUTE_READ_ONLY) ||
            attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_ATTRIBUTE_READ_ONLY_NO_SUBSCRIPTIONS)
    }

    def boolean isNoSubscriptionsAttribute(EAAttributeContainer attribute)
    {
        return attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_NO_SUBSCRIPTIONS) ||
            attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_ATTRIBUTE_NO_SUBSCRIPTIONS) ||
            attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_ATTRIBUTE_READ_ONLY_NO_SUBSCRIPTIONS)
    }

    def boolean isFireAndForgetMethod(EAMethodContainer method)
    {
        return method.hasStereotype(EAFrancaConstants.STEREOTYPE_FIRE_AND_FORGET) ||
            method.hasStereotype(EAFrancaConstants.STEREOTYPE_METHOD_FIRE_AND_FORGET)
    }

    def boolean isMethod(EAMethodContainer method)
    {
        return method.hasStereotype(EAFrancaConstants.STEREOTYPE_METHOD) ||
            method.hasStereotype(EAFrancaConstants.STEREOTYPE_METHOD_FIRE_AND_FORGET)
    }

    // Identically to isBroadcast (below)!
    def boolean isSelectiveBroadcast(EAMethodContainer method)
    {
        return method.hasStereotype(EAFrancaConstants.STEREOTYPE_SELECTIVE) ||
            method.hasStereotype(EAFrancaConstants.STEREOTYPE_BROADCAST_SELECTIVE)
    }

    // Identically to isSelectiveBroadcast (above)!
    def boolean isBroadcast(EAMethodContainer method)
    {
        return method.hasStereotype(EAFrancaConstants.STEREOTYPE_BROADCAST) ||
            method.hasStereotype(EAFrancaConstants.STEREOTYPE_BROADCAST_SELECTIVE)
    }

    def Map<String, String> parseGenlinks(EAElementContainer element)
    {
        val map = new LinkedHashMap<String, String>
        element.genlinks.split(";").forEach [ genlink |
            val keyValueArray = genlink.split("=")
            switch (keyValueArray.size)
            {
                case 2: map.put(keyValueArray.get(0), keyValueArray.get(1))
                case 1: map.put(keyValueArray.get(0), null)
            }
        ]
        return map
    }

    def String normalizeName(String name, boolean allowKeywords, EAContainerWithNamespace container)
    {
        try
        {
            if(allowKeywords)
            {
                return FrancaUtils.normalizeName(name, FrancaUtils.SPACES, FrancaUtils.KEYWORDS)
            }
            else
            {
                val normalizationMask = FrancaUtils.SPACES.bitwiseOr(FrancaUtils.INTERFACE_DEFINITION_KEYWORDS)

                return FrancaUtils.normalizeName(name, normalizationMask, FrancaUtils.NONE)
            }
        }
        catch(Exception e)
        {
            addIssue(typeof(NameNormalizationException), container, e.message)
            return null
        }
    }

    def IPath normalizeNamespacePath(IPath path, EAContainerWithNamespace container)
    {
        try
        {
            val normalizationMask = FrancaUtils.SPACES.bitwiseOr(FrancaUtils.INTERFACE_DEFINITION_KEYWORDS)

            return FrancaUtils.normalizeNamespacePath(path, normalizationMask, FrancaUtils.DEPLOYMENT_DEFINITION_KEYWORDS)
        }
        catch(Exception e)
        {
            addIssue(typeof(NameNormalizationException), container, e.message)
            return null
        }
    }

    def String path2Namespace(IPath namespaceAsPath)
    {
        return FrancaUtils.path2NamespaceString(namespaceAsPath.toString)
    }

    def EAFrancaDataType getFrancaDataType(EAElementContainer element)
    {
        switch element
        {
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_ARRAY): return EAFrancaDataType.ARRAY
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_ENUMERATION): return EAFrancaDataType.ENUMERATION
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_FRANCA_ENUM): return EAFrancaDataType.ENUMERATION
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_MAP): return EAFrancaDataType.MAP
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_STRUCT): return EAFrancaDataType.STRUCT
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_POLYMORPHIC_STRUCT): return EAFrancaDataType.STRUCT
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_TYPEDEF): return EAFrancaDataType.TYPEDEF
            case element.hasStereotype(EAFrancaConstants.STEREOTYPE_UNION): return EAFrancaDataType.UNION
            default: return EAFrancaDataType.UNDEFINED
        }
    }

    //
    //    Restores the origin file name and places it on the last package segment.
    //
    def static String lastNamespaceSegmentNaming(Map<String, String> fileNameCache, IPath namespace)
    {
        // First segment of the namespace (namespace will be truncated in front each call).
        val firstSegment = namespace.segment(0)

        if(namespace.lastSegment.equals(firstSegment) && fileNameCache.containsKey(firstSegment))
        {
            return fileNameCache.get(firstSegment)
        }
        return firstSegment
    }
}
