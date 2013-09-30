/* Copyright (C) 2013 BMW Group
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

public class EATaggedValueContainerImpl extends EAContainerImpl implements EATaggedValueContainer
{
    protected final TaggedValue eaTaggedValue;

    protected EATaggedValueContainerImpl(EAInstance eaInstance, TaggedValue eaTaggedValue)
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
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaTaggedValue.GetName();
            }
        });
    }

    @Override
    public String getNotes()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaTaggedValue.GetNotes();
            }
        });
    }

    @Override
    public boolean update()
    {
        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaTaggedValue.Update();
            }
        });
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EATaggedValueContainer //

    @Override
    public String getValue()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaTaggedValue.GetValue();
            }
        });
    }

    @Override
    public EAElementContainer getElement()
    {
        int elementId = (Integer) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaTaggedValue.GetElementID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(elementId, EAElementContainer.class, this);
    }

    // END Implementation of interface EATaggedValueContainer //
}
