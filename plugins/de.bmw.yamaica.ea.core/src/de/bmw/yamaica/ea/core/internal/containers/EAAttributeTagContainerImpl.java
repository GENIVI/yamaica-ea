/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import org.eclipse.core.runtime.Assert;
import org.sparx.AttributeTag;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer;
import de.bmw.yamaica.ea.core.containers.EAAttributeTagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;

public class EAAttributeTagContainerImpl extends EAContainerImpl implements EAAttributeTagContainer
{
    protected final AttributeTag eaAttributeTag;

    protected EAAttributeTagContainerImpl(EAInstance eaInstance, AttributeTag eaAttributeTag)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaAttributeTag));

        Assert.isNotNull(eaAttributeTag);

        this.eaAttributeTag = eaAttributeTag;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaAttributeTag;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttributeTag.GetName();
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
                return eaAttributeTag.GetNotes();
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
                return eaAttributeTag.Update();
            }
        });
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EAAttributeTagContainer //

    @Override
    public String getValue()
    {
        return (String) getOrCreateCachedValue(CACHED_VALUE, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttributeTag.GetValue();
            }
        });
    }

    @Override
    public EAAttributeContainer getAttribute()
    {
        int attributeId = (Integer) getOrCreateCachedValue(CACHED_ATTRIBUTE_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttributeTag.GetAttributeID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(attributeId, EAAttributeContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
        }
    }

    // END Implementation of interface EAAttributeTagContainer //
}
