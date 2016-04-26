/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import org.eclipse.core.runtime.Assert;
import org.sparx.TaggedValue;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EATaggedValueContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;

public class EATaggedValueContainerImpl extends EAContainerImpl implements EATaggedValueContainer
{
    protected final TaggedValue eaTaggedValue;

    protected EATaggedValueContainerImpl(final EAInstance eaInstance, final TaggedValue eaTaggedValue)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaTaggedValue));

        Assert.isNotNull(eaTaggedValue);

        this.eaTaggedValue = eaTaggedValue;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaTaggedValue;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaTaggedValue.GetName();
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
                eaTaggedValue.SetName((String) arguments[0]);
                eaTaggedValue.Update();

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
                return eaTaggedValue.GetNotes();
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
                eaTaggedValue.SetNotes((String) arguments[0]);
                eaTaggedValue.Update();

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
                return eaTaggedValue.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAElementContainer element = getElement();

        if (null != element)
        {
            element.deleteTaggedValue(this);
        }
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EATaggedValueContainer //

    @Override
    public String getValue()
    {
        return (String) getOrCreateCachedValue(CACHED_VALUE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaTaggedValue.GetValue();
            }
        });
    }

    @Override
    public void setValue(final String value)
    {
        clearCachedValue(CACHED_VALUE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaTaggedValue.SetValue((String) arguments[0]);
                eaTaggedValue.Update();

                return null;
            }
        }, value);
    }

    @Override
    public EAElementContainer getElement()
    {
        final int elementId = (Integer) getOrCreateCachedValue(CACHED_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaTaggedValue.GetElementID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(elementId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
        }
    }

    // END Implementation of interface EATaggedValueContainer //
}
