/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.sparx.Collection;
import org.sparx.Connector;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.EAObjectType;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.ParentElementNotFoundException;
import de.bmw.yamaica.ea.core.exceptions.ReferencedElementNotFoundException;
import de.bmw.yamaica.franca.common.core.FrancaUtils;
;

public abstract class EAContainerImpl implements EAContainer
{
    protected final int                   CACHED_NAME                   = 1;
    protected final int                   CACHED_NOTES                  = 2;
    protected final int                   CACHED_PARENT_ID              = 3;
    protected final int                   CACHED_STEREOTYPE             = 4;
    protected final int                   CACHED_POSITION               = 5;
    protected final int                   CACHED_KIND                   = 6;
    protected final int                   CACHED_TYPE                   = 7;
    protected final int                   CACHED_TYPE_ELEMENT_ID        = 8;
    protected final int                   CACHED_DEFAULT                = 9;
    protected final int                   CACHED_ELEMENT                = 10;
    protected final int                   CACHED_VERSION                = 11;
    protected final int                   CACHED_FLAGS                  = 12;
    protected final int                   CACHED_IS_MODEL               = 13;
    protected final int                   CACHED_IS_NAMESPACE_ROOT      = 14;
    protected final int                   CACHED_PACKAGES               = 15;
    protected final int                   CACHED_ELEMENTS               = 16;
    protected final int                   CACHED_CONNECTORS             = 17;
    protected final int                   CACHED_PACKAGE_ID             = 18;
    protected final int                   CACHED_TAGGED_VALUES          = 19;
    protected final int                   CACHED_AUTHOR                 = 20;
    protected final int                   CACHED_GEN_LINKS              = 21;
    protected final int                   CACHED_ATTRIBUTES             = 22;
    protected final int                   CACHED_METHODS                = 23;
    protected final int                   CACHED_BASE_CLASSES           = 24;
    protected final int                   CACHED_IS_COLLECTION          = 25;
    protected final int                   CACHED_TYPE_STRING            = 26;
    protected final int                   CACHED_SUB_TYPE_STRING        = 27;
    protected final int                   CACHED_CLIENT_ID              = 28;
    protected final int                   CACHED_SUPPLIER_ID            = 29;
    protected final int                   CACHED_DIRECTION              = 30;
    protected final int                   CACHED_RETURN_TYPE            = 31;
    protected final int                   CACHED_RETURN_TYPE_ELEMENT_ID = 32;
    protected final int                   CACHED_IS_RETURN_TYPE_ARRAY   = 33;
    protected final int                   CACHED_PARAMETERS             = 34;
    protected final int                   CACHED_VALUE                  = 35;
    protected final int                   CACHED_ELEMENT_ID             = 36;
    protected final int                   CACHED_METHOD_ID              = 37;
    protected final int                   CACHED_ATTRIBUTE_ID           = 38;
    protected final int                   CACHED_CONNECTOR_ID           = 39;
    protected final int                   CACHED_MODELS                 = 40;

    protected static final String         REFERENCE_ERROR_MESSAGE       = "An Enterprise Architect error occurred (\"%s\") while "
                                                                                + "accessing the %s \"%s\". This is probably due the "
                                                                                + "fact that the database of Enterprise Architect is "
                                                                                + "inconsistent. A possible solution is to reset all "
                                                                                + " references to other UML elements of this element.";

    protected static final String         PARENT_ERROR_MESSAGE          = "An Enterprise Architect error occurred (\"%s\") while "
                                                                                + "accessing the %s \"%s\". This is probably due the "
                                                                                + "fact that the element was deleted. A possible solution "
                                                                                + "is to reload the Enterprise Architect project.";

    protected final EAInstance            eaInstance;
    protected final int                   eaObjectId;
    protected final EARepositoryContainer eaRepository;
    protected final Map<Object, Object>   cache                         = new HashMap<Object, Object>(100);
    protected boolean                     isDisposed                    = false;

    protected EAContainerImpl(EAInstance eaInstance, int eaObjectId)
    {
        Assert.isNotNull(eaInstance);
        Assert.isNotNull(eaObjectId);

        this.eaInstance = eaInstance;
        this.eaObjectId = eaObjectId;
        this.eaRepository = eaInstance.getRepository();
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public EAInstance getEAInstance()
    {
        return eaInstance;
    }

    @Override
    public EARepositoryContainer getRepository()
    {
        return eaRepository;
    }

    @Override
    public EAObjectType getEAObjectType()
    {
        return EAObjectType.getEAContainerType(this.getClass());
    }

    @Override
    public int getEAObjectId()
    {
        return eaObjectId;
    }

    @Override
    public void dispose()
    {
        clearCache();
        isDisposed = true;

        if (null != eaRepository)
        {
            eaRepository.disposeContainer(this);
        }
    }

    @Override
    public boolean isDisposed()
    {
        return isDisposed;
    }

    // END Implementation of interface EAContainer //

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof EAContainer)
        {
            EAContainer eaContainer = (EAContainer) obj;

            return getEAObjectId() == eaContainer.getEAObjectId() && getEAObjectType().equals(eaContainer.getEAObjectType());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + getEAObjectId();
        hashCode = prime * hashCode + getEAObjectType().hashCode();

        return hashCode;
    }

    @Override
    public String toString()
    {
        String name = getName();

        name = (null == name) ? "" : " " + name;

        return getEAObjectType().getName() + name;
    }

    protected boolean hasStereotype(String stereotype, List<String> allStereotypes)
    {
        for (String singleStereotype : allStereotypes)
        {
            if (singleStereotype.trim().equalsIgnoreCase(stereotype.trim()))
            {
                return true;
            }
        }

        return false;
    }

    protected List<String> getStereotypes(String stereotypes)
    {
        List<String> list = new ArrayList<String>();

        for (String stereotype : stereotypes.split(","))
        {
            if (stereotype.length() > 0)
            {
                list.add(stereotype);
            }
        }

        return list;
    }

    protected EATagContainer getTaggedValueByName(String name, List<EATagContainer> allTaggedValues)
    {
        for (EATagContainer taggedValue : allTaggedValues)
        {
            if (taggedValue.getName().equals(name))
            {
                return taggedValue;
            }
        }

        return null;
    }

    protected IPath getNamespaceAsPath(EAContainerWithNamespace parent)
    {
        String name = getName();

        return (null == parent) ? new Path(name) : parent.getNamespaceAsPath().append(name);
    }

    protected String getNamespace(EAContainerWithNamespace parent)
    {
        return FrancaUtils.path2NamespaceString(getNamespaceAsPath(parent).toString());
    }

    protected List<EAConnectorContainer> getFilteredEAConnectors(Collection<Connector> connectors, int type)
    {
        List<EAConnectorContainer> list = new ArrayList<EAConnectorContainer>(connectors.GetCount());

        for (EAConnectorContainer connector : getRepository().getOrCreateEAObjectContainers(connectors, EAConnectorContainer.class))
        {
            if ((connector.getType() & type) == type)
            {
                list.add(connector);
            }
        }

        return list;
    }

    protected void clearCache()
    {
        cache.clear();
    }

    protected Object getOrCreateCachedValue(Object key, IRunnableWithArguments runnable, Object... arguments)
    {
        if (cache.containsKey(key))
        {
            return cache.get(key);
        }
        else
        {
            Object value = eaInstance.syncExecution(runnable, arguments);

            cache.put(key, value);

            return value;
        }
    }

    protected ReferencedElementNotFoundException createReferencedElementNotFoundException(Throwable throwable, EAContainer container)
    {
        Throwable cause = getCause(throwable);
        String message = getErrorMessage(REFERENCE_ERROR_MESSAGE, cause, container, true);

        return new ReferencedElementNotFoundException(message, cause);
    }

    protected ParentElementNotFoundException createParentElementNotFoundException(Throwable throwable, EAContainer container)
    {
        Throwable cause = getCause(throwable);
        String message = getErrorMessage(PARENT_ERROR_MESSAGE, cause, container, false);

        return new ParentElementNotFoundException(message, cause);
    }

    private String getErrorMessage(String messageTemplate, Throwable throwable, EAContainer container, boolean fullyQualifiedName)
    {
        String elementType = container.getEAObjectType().getName().toLowerCase();
        String elementName = getContainerName(container, fullyQualifiedName);

        return String.format(messageTemplate, throwable.getMessage(), elementType, elementName);
    }

    private String getContainerName(EAContainer container, boolean fullyQualifiedName)
    {
        if (container instanceof EAContainerWithNamespace && true == fullyQualifiedName)
        {
            return ((EAContainerWithNamespace) container).getNamespace();
        }
        else
        {
            return container.getName();
        }
    }

    private Throwable getCause(Throwable throwable)
    {
        Throwable cause = throwable.getCause();

        return (null != cause) ? cause : throwable;
    }
}
