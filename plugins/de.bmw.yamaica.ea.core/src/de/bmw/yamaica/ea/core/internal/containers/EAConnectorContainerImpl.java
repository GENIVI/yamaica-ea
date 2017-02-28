/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.Assert;
import org.sparx.AttributeTag;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.ConnectorTag;

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorTagContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.exceptions.ReferencedElementNotFoundException;

public class EAConnectorContainerImpl extends EAContainerImpl implements EAConnectorContainer
{
    private static final Logger LOGGER = Logger.getLogger(EAConnectorContainerImpl.class.getName());

    protected final Connector eaConnector;

    protected EAConnectorContainerImpl(final EAInstance eaInstance, final Connector eaConnector)
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
            public Object run(final Object... arguments)
            {
                return eaConnector.GetName();
            }
        });
    }

    @Override
    public void setName(final String name)
    {
        clearCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaConnector.SetName((String) arguments[0]);
                eaConnector.Update();

                return null;
            }
        }, name);
    }

    @Override
    public String getNotes()
    {
        return (String) getOrCreateCachedValue(CACHED_NOTES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaConnector.GetNotes();
            }
        });
    }

    @Override
    public void setNotes(final String notes)
    {
        clearCachedValue(CACHED_NOTES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaConnector.SetNotes((String) arguments[0]);
                eaConnector.Update();

                return null;
            }
        }, notes);
    }

    @Override
    public boolean update()
    {
        clearCache();

        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaConnector.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAElementContainer element = getSupplier();

        if (null != element)
        {
            element.deleteConnector(this);
        }
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EAContainerWithStereotypes //

    @Override
    public List<String> getStereotypes()
    {
        final String stereotype = (String) getOrCreateCachedValue(CACHED_STEREOTYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaConnector.GetStereotypeEx();
            }
        });

        return getStereotypes(stereotype);
    }

    @Override
    public boolean hasStereotype(final String stereotype)
    {
        return super.hasStereotype(stereotype, getStereotypes());
    }

    @Override
    public void setStereotypes(final String... stereotypes)
    {
        getRepository().registerStereotypes(stereotypes);

        clearCachedValue(CACHED_STEREOTYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaConnector.SetStereotypeEx((String) arguments[0]);
                eaConnector.Update();

                return null;
            }
        }, getStereotypeEx(stereotypes));
    }

    // END Implementation of interface EAContainerWithStereotypes //

    // BEGIN Implementation of interface EAContainerWithTaggedValues //

    @Override
    public List<EATagContainer> getTaggedValues()
    {
        @SuppressWarnings("unchecked")
        final Collection<AttributeTag> taggedValues = (Collection<AttributeTag>) getOrCreateCachedValue(CACHED_TAGGED_VALUES,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        return eaConnector.GetTaggedValues();
                    }
                });

        return getOrCreateEAObjectContainers(taggedValues, EATagContainer.class);
    }

    @Override
    public EATagContainer createTaggedValue(final String name)
    {
        return (EATagContainer) clearCachedValue(CACHED_TAGGED_VALUES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<ConnectorTag> eaConnectorTags = eaConnector.GetTaggedValues();
                final ConnectorTag newEAConnectorTag = eaConnectorTags.AddNew((String) arguments[0], "");

                if (!newEAConnectorTag.Update())
                {
                    return null;
                }

                eaConnectorTags.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAConnectorTag, EAConnectorTagContainer.class);
            }
        }, name);
    }

    @Override
    public EATagContainer getOrCreateTaggedValue(final String name)
    {
        final EATagContainer eaTag = getTaggedValueByName(name);

        return (null != eaTag) ? eaTag : createTaggedValue(name);
    }

    @Override
    public EATagContainer getTaggedValueByName(final String name)
    {
        return getTaggedValueByName(name, getTaggedValues());
    }

    @Override
    public void deleteTaggedValue(final String name)
    {
        deleteTaggedValue(getEAObjectContainerByName(getTaggedValues(), name, EATagContainer.class));
    }

    @Override
    public void deleteTaggedValue(final EATagContainer taggedValue)
    {
        clearCachedValue(CACHED_TAGGED_VALUES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaConnector.GetTaggedValues(), arguments[0]);

                return null;
            }
        }, taggedValue.getEAObject());
    }

    @Override
    public void deleteAllTaggedValues()
    {
        clearCachedValue(CACHED_TAGGED_VALUES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaConnector.GetTaggedValues());

                return null;
            }
        });
    }

    // END Implementation of interface EAContainerWithTaggedValues //

    // BEGIN Implementation of interface EAConnectorContainer //

    @Override
    public Type getType()
    {
        final String typeString = (String) getOrCreateCachedValue(CACHED_TYPE_STRING, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaConnector.GetType();
            }
        });

        final String subtypeString = (String) getOrCreateCachedValue(CACHED_SUB_TYPE_STRING, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaConnector.GetSubtype();
            }
        });

        return Type.getByType(typeString, subtypeString);
    }

    @Override
    public void setType(final Type type)
    {
        clearCachedValue(CACHED_TYPE_STRING, CACHED_SUB_TYPE_STRING, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaConnector.SetType((String) arguments[0]);
                eaConnector.SetSubtype((String) arguments[1]);
                eaConnector.Update();

                return null;
            }
        }, type.getType(), type.getSubtype());
    }

    @Override
    public EAElementContainer getSupplier()
    {
        final int supplierId = (Integer) getOrCreateCachedValue(CACHED_SUPPLIER_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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
            final ReferencedElementNotFoundException referencedElementNotFoundException = createReferencedElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, referencedElementNotFoundException.getMessage());
            throw referencedElementNotFoundException;
        }
    }

    @Override
    public void setSupplier(final EAElementContainer supplier)
    {
        clearCachedValue(CACHED_SUPPLIER_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaConnector.SetSupplierID((Integer) arguments[0]);
                eaConnector.Update();

                return null;
            }
        }, supplier.getEAObjectId());
    }

    @Override
    public EAElementContainer getClient()
    {
        final int clientId = (Integer) getOrCreateCachedValue(CACHED_CLIENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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
            final ReferencedElementNotFoundException referencedElementNotFoundException = createReferencedElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, referencedElementNotFoundException.getMessage());
            throw referencedElementNotFoundException;
        }
    }

    @Override
    public void setClient(final EAElementContainer client)
    {
        clearCachedValue(CACHED_CLIENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaConnector.SetClientID((Integer) arguments[0]);
                eaConnector.Update();

                return null;
            }
        }, client.getEAObjectId());
    }

    @Override
    public EAElementContainer getOpposite(final EAElementContainer reference)
    {
        final EAElementContainer client = getClient();
        final EAElementContainer supplier = getSupplier();

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
    public boolean isNavigable(final EAElementContainer destination)
    {
        final String direction = (String) getOrCreateCachedValue(CACHED_DIRECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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
        return !getDirection().equals(EAConnectorContainer.Direction.UNSPECIFIED);
    }

    @Override
    public Direction getDirection()
    {
        final String direction = (String) getOrCreateCachedValue(CACHED_DIRECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaConnector.GetDirection();
            }
        });

        return EAConnectorContainer.Direction.getByName(direction);
    }

    @Override
    public void setDirection(final Direction direction)
    {
        clearCachedValue(CACHED_DIRECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaConnector.SetDirection((String) arguments[0]);
                eaConnector.Update();

                return null;
            }
        }, direction.getName());
    }

    // END Implementation of interface EAConnectorContainer //
}
