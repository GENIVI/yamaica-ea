/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.sparx.AttributeTag;
import org.sparx.Collection;
import org.sparx.Connector;

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;

public class EAConnectorContainerImpl extends EAContainerImpl implements EAConnectorContainer
{
    public static final int   UNKNOWN        = 0x1;
    public static final int   ASSOCIATION    = 0x2;
    public static final int   AGGREGATION    = 0x4;
    public static final int   COMPOSITION    = 0x8;
    public static final int   GENERALIZATION = 0x10;
    public static final int   PACKAGE        = 0x20;
    public static final int   ALL_TYPES      = 0xFFFFFFFF;

    protected final Connector eaConnector;

    protected EAConnectorContainerImpl(EAInstance eaInstance, Connector eaConnector)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaConnector));

        Assert.isNotNull(eaConnector);

        this.eaConnector = eaConnector;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaConnector;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetName();
            }
        });
    }

    @Override
    public String getNotes()
    {
        return (String) getOrCreateCachedValue(CACHED_NOTES, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetNotes();
            }
        });
    }

    @Override
    public boolean update()
    {
        clearCache();

        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.Update();
            }
        });
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EAContainerWithStereotypes //

    @Override
    public List<String> getStereotypes()
    {
        String stereotype = (String) getOrCreateCachedValue(CACHED_STEREOTYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetStereotypeEx();
            }
        });

        return getStereotypes(stereotype);
    }

    @Override
    public boolean hasStereotype(String stereotype)
    {
        return super.hasStereotype(stereotype, getStereotypes());
    }

    // END Implementation of interface EAContainerWithStereotypes //

    // BEGIN Implementation of interface EAContainerWithTaggedValues //

    @Override
    public List<EATagContainer> getTaggedValues()
    {
        @SuppressWarnings("unchecked")
        Collection<AttributeTag> taggedValues = (Collection<AttributeTag>) getOrCreateCachedValue(CACHED_TAGGED_VALUES,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(Object... arguments)
                    {
                        return eaConnector.GetTaggedValues();
                    }
                });

        return getRepository().getOrCreateEAObjectContainers(taggedValues, EATagContainer.class);
    }

    @Override
    public EATagContainer getTaggedValueByName(String name)
    {
        return getTaggedValueByName(name, getTaggedValues());
    }

    // END Implementation of interface EAContainerWithTaggedValues //

    // BEGIN Implementation of interface EAConnectorContainer //

    @Override
    public int getType()
    {
        int connectorType = UNKNOWN;
        String typeString = (String) getOrCreateCachedValue(CACHED_TYPE_STRING, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetType();
            }
        });

        if (typeString.equals(EAConstants.CONNECTOR_TYPE_ASSOCIATION))
        {
            connectorType = EAConnectorContainer.ASSOCIATION;
        }
        else if (typeString.equals(EAConstants.CONNECTOR_TYPE_AGGREGATION))
        {
            String subtypeString = (String) getOrCreateCachedValue(CACHED_SUB_TYPE_STRING, new IRunnableWithArguments()
            {
                @Override
                public Object run(Object... arguments)
                {
                    return eaConnector.GetSubtype();
                }
            });

            if (subtypeString.equals(EAConstants.CONNECTOR_SUBTYPE_WEAK))
            {
                connectorType = EAConnectorContainer.AGGREGATION;
            }
            else if (subtypeString.equals(EAConstants.CONNECTOR_SUBTYPE_STRONG))
            {
                connectorType = EAConnectorContainer.COMPOSITION;
            }
        }
        else if (typeString.equals(EAConstants.CONNECTOR_TYPE_GENERALIZATION))
        {
            connectorType = EAConnectorContainer.GENERALIZATION;
        }
        else if (typeString.equals(EAConstants.CONNECTOR_TYPE_PACKAGE))
        {
            connectorType = EAConnectorContainer.PACKAGE;
        }

        return connectorType;
    }

    @Override
    public EAElementContainer getSupplier()
    {
        int supplierId = (Integer) getOrCreateCachedValue(CACHED_SUPPLIER_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetSupplierID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(supplierId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
        }
    }

    @Override
    public EAElementContainer getClient()
    {
        int clientId = (Integer) getOrCreateCachedValue(CACHED_CLIENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetClientID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(clientId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
        }
    }

    @Override
    public EAElementContainer getOpposite(EAElementContainer reference)
    {
        EAElementContainer client = getClient();
        EAElementContainer supplier = getSupplier();

        if (reference.equals(supplier))
        {
            return client;
        }
        else if (reference.equals(client))
        {
            return supplier;
        }
        else
        {
            return null;
        }
    }

    @Override
    public boolean isNavigable(EAElementContainer destination)
    {
        String direction = (String) getOrCreateCachedValue(CACHED_DIRECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetDirection();
            }
        });

        if (destination.equals(getSupplier())
                && (direction.equals(EAConstants.CONNECTOR_DIRECTION_SOURCE_TO_DESTINATION) || direction
                        .equals(EAConstants.CONNECTOR_DIRECTION_BI_DIRECTIONAL)))
        {
            return true;
        }
        else if (destination.equals(getClient())
                && (direction.equals(EAConstants.CONNECTOR_DIRECTION_DESTINATION_TO_SOURCE) || direction
                        .equals(EAConstants.CONNECTOR_DIRECTION_BI_DIRECTIONAL)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean isDirected()
    {
        String direction = (String) getOrCreateCachedValue(CACHED_DIRECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnector.GetDirection();
            }
        });

        return !direction.equals(EAConstants.CONNECTOR_DIRECTION_UNSPECIFIED);
    }

    // END Implementation of interface EAConnectorContainer //
}
