/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.sparx.Collection;
import org.sparx.Connector;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.EAObjectType;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.franca.base.core.FrancaUtils;

public abstract class EAContainerImpl implements EAContainer
{
    protected final EAInstance            eaInstance;
    protected final int                   eaObjectId;
    protected final EARepositoryContainer eaRepository;
    protected boolean                     isDisposed = false;

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
        isDisposed = true;

        eaRepository.disposeContainer(this);
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
            if (singleStereotype.trim().equals(stereotype.trim()))
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
}