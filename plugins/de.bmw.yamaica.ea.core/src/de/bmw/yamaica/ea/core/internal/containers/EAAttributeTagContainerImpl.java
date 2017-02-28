/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.Assert;
import org.sparx.AttributeTag;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer;
import de.bmw.yamaica.ea.core.containers.EAAttributeTagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.exceptions.ReferencedElementNotFoundException;

public class EAAttributeTagContainerImpl extends EAContainerImpl implements EAAttributeTagContainer
{
    private static final Logger LOGGER = Logger.getLogger(EAAttributeTagContainerImpl.class.getName());

    protected final AttributeTag eaAttributeTag;

    protected EAAttributeTagContainerImpl(final EAInstance eaInstance, final AttributeTag eaAttributeTag)
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
            public Object run(final Object... arguments)
            {
                return eaAttributeTag.GetName();
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
                eaAttributeTag.SetName((String) arguments[0]);
                eaAttributeTag.Update();

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
                return eaAttributeTag.GetNotes();
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
                eaAttributeTag.SetNotes((String) arguments[0]);
                eaAttributeTag.Update();

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
                return eaAttributeTag.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAAttributeContainer attribute = getAttribute();

        if (null != attribute)
        {
            attribute.deleteTaggedValue(this);
        }
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EAAttributeTagContainer //

    @Override
    public String getValue()
    {
        return (String) getOrCreateCachedValue(CACHED_VALUE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaAttributeTag.GetValue();
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
                eaAttributeTag.SetValue((String) arguments[0]);
                eaAttributeTag.Update();

                return null;
            }
        }, value);
    }

    @Override
    public EAAttributeContainer getAttribute()
    {
        final int attributeId = (Integer) getOrCreateCachedValue(CACHED_ATTRIBUTE_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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
            ReferencedElementNotFoundException referencedElementNotFoundException = createReferencedElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, referencedElementNotFoundException.getMessage());
            throw referencedElementNotFoundException;
        }
    }

    // END Implementation of interface EAAttributeTagContainer //
}
