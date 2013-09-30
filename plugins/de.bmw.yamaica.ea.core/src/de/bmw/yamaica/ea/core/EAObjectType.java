/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core;

import org.sparx.Attribute;
import org.sparx.AttributeTag;
import org.sparx.Connector;
import org.sparx.ConnectorTag;
import org.sparx.Element;
import org.sparx.Method;
import org.sparx.MethodTag;
import org.sparx.Package;
import org.sparx.Parameter;
import org.sparx.Repository;
import org.sparx.TaggedValue;

import de.bmw.yamaica.ea.core.containers.EAAttributeContainer;
import de.bmw.yamaica.ea.core.containers.EAAttributeTagContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorTagContainer;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodTagContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EAParameterContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;

public enum EAObjectType
{
    ATTRIBUTE("Attribute"), ATTRIBUTE_TAG("Attribute Tag"), CONNECTOR("Connector"), CONNECTOR_TAG("Connector Tag"), ELEMENT("Element"), METHOD(
            "Method"), METHOD_TAG("Method Tag"), PACKAGE("Package"), PARAMETER("Parameter"), REPOSITORY("Repository"), TAGGED_VALUE(
            "Tagged Value"), UNDEFINED("Undefined");

    private final String name;

    private EAObjectType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name.toLowerCase();
    }

    public static EAObjectType getEAObjectType(Class<?> eaObjectClass)
    {
        if (Attribute.class.isAssignableFrom(eaObjectClass))
        {
            return ATTRIBUTE;
        }

        if (AttributeTag.class.isAssignableFrom(eaObjectClass))
        {
            return ATTRIBUTE_TAG;
        }

        if (Connector.class.isAssignableFrom(eaObjectClass))
        {
            return CONNECTOR;
        }

        if (ConnectorTag.class.isAssignableFrom(eaObjectClass))
        {
            return CONNECTOR_TAG;
        }

        if (Element.class.isAssignableFrom(eaObjectClass))
        {
            return ELEMENT;
        }

        if (Method.class.isAssignableFrom(eaObjectClass))
        {
            return METHOD;
        }

        if (MethodTag.class.isAssignableFrom(eaObjectClass))
        {
            return METHOD_TAG;
        }

        if (Package.class.isAssignableFrom(eaObjectClass))
        {
            return PACKAGE;
        }

        if (Parameter.class.isAssignableFrom(eaObjectClass))
        {
            return PARAMETER;
        }

        if (Repository.class.isAssignableFrom(eaObjectClass))
        {
            return REPOSITORY;
        }

        if (TaggedValue.class.isAssignableFrom(eaObjectClass))
        {
            return TAGGED_VALUE;
        }

        return UNDEFINED;
    }

    public static EAObjectType getEAContainerType(Class<? extends EAContainer> eaContainerClass)
    {
        if (EAAttributeContainer.class.isAssignableFrom(eaContainerClass))
        {
            return ATTRIBUTE;
        }

        if (EAAttributeTagContainer.class.isAssignableFrom(eaContainerClass))
        {
            return ATTRIBUTE_TAG;
        }

        if (EAConnectorContainer.class.isAssignableFrom(eaContainerClass))
        {
            return CONNECTOR;
        }

        if (EAConnectorTagContainer.class.isAssignableFrom(eaContainerClass))
        {
            return CONNECTOR_TAG;
        }

        if (EAElementContainer.class.isAssignableFrom(eaContainerClass))
        {
            return ELEMENT;
        }

        if (EAMethodContainer.class.isAssignableFrom(eaContainerClass))
        {
            return METHOD;
        }

        if (EAMethodTagContainer.class.isAssignableFrom(eaContainerClass))
        {
            return METHOD_TAG;
        }

        if (EAPackageContainer.class.isAssignableFrom(eaContainerClass))
        {
            return PACKAGE;
        }

        if (EAParameterContainer.class.isAssignableFrom(eaContainerClass))
        {
            return PARAMETER;
        }

        if (EARepositoryContainer.class.isAssignableFrom(eaContainerClass))
        {
            return REPOSITORY;
        }

        if (EATagContainer.class.isAssignableFrom(eaContainerClass))
        {
            return TAGGED_VALUE;
        }

        return UNDEFINED;
    }
}
