/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import org.eclipse.core.runtime.Assert;
import org.sparx.DiagramObject;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EADiagramContainer;
import de.bmw.yamaica.ea.core.containers.EADiagramObjectContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.exceptions.UnsupportedOperationException;

public class EADiagramObjectContainerImpl extends EAContainerImpl implements EADiagramObjectContainer
{
    protected final DiagramObject eaDiagramObject;

    protected EADiagramObjectContainerImpl(final EAInstance eaInstance, final DiagramObject eaDiagramObject)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaDiagramObject));

        Assert.isNotNull(eaDiagramObject);

        this.eaDiagramObject = eaDiagramObject;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public String getName()
    {
        return "";
    }

    @Override
    public void setName(final String name)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getNotes()
    {
        return "";
    }

    @Override
    public void setNotes(final String notes)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getEAObject()
    {
        return eaDiagramObject;
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
                return eaDiagramObject.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EADiagramContainer diagram = getDiagram();

        if (diagram instanceof EADiagramContainer)
        {
            ((EADiagramContainer) diagram).deleteDiagramObject(this);
        }
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EADiagramObjectContainer //

    @Override
    public EAElementContainer getElement()
    {
        final int elementId = (Integer) getOrCreateCachedValue(CACHED_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaDiagramObject.GetElementID();
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

    @Override
    public void setElement(final EAElementContainer element)
    {
        clearCachedValue(CACHED_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaDiagramObject.SetElementID((Integer) arguments[0]);
                eaDiagramObject.Update();

                return null;
            }
        }, element.getEAObjectId());
    }

    @Override
    public EADiagramContainer getDiagram()
    {
        final int diagramId = (Integer) getOrCreateCachedValue(CACHED_DIAGRAM_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaDiagramObject.GetDiagramID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(diagramId, EADiagramContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
        }
    }

    @Override
    public void setDiagram(EADiagramContainer diagram)
    {
        clearCachedValue(CACHED_DIAGRAM_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaDiagramObject.SetDiagramID((Integer) arguments[0]);
                eaDiagramObject.Update();

                return null;
            }
        }, diagram.getEAObjectId());
    }

    // END Implementation of interface EADiagramObjectContainer //
}
