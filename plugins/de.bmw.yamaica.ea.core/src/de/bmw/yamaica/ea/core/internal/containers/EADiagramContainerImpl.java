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
import org.eclipse.core.runtime.IPath;
import org.sparx.Collection;
import org.sparx.Diagram;
import org.sparx.DiagramObject;
import org.sparx.Repository;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EADiagramContainer;
import de.bmw.yamaica.ea.core.containers.EADiagramObjectContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.exceptions.ParentElementNotFoundException;
import de.bmw.yamaica.ea.core.exceptions.ReferencedElementNotFoundException;
import de.bmw.yamaica.ea.core.exceptions.UnsupportedOperationException;

public class EADiagramContainerImpl extends EAContainerImpl implements EADiagramContainer
{
    private static final Logger LOGGER = Logger.getLogger(EADiagramContainerImpl.class.getName());

    protected final Diagram eaDiagram;

    protected EADiagramContainerImpl(final EAInstance eaInstance, final Diagram eaDiagram)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaDiagram));

        Assert.isNotNull(eaDiagram);

        this.eaDiagram = eaDiagram;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaDiagram;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaDiagram.GetName();
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
                eaDiagram.SetName((String) arguments[0]);
                eaDiagram.Update();

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
                return eaDiagram.GetNotes();
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
                eaDiagram.SetNotes((String) arguments[0]);
                eaDiagram.Update();

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
                return eaDiagram.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAContainerWithNamespace parent = getParent();

        if (parent instanceof EAElementContainer)
        {
            ((EAElementContainer) parent).deleteDiagram(this);
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
                return eaDiagram.GetStereotypeEx();
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
                eaDiagram.SetStereotypeEx((String) arguments[0]);
                eaDiagram.Update();

                return null;
            }
        }, getStereotypeEx(stereotypes));
    }

    // END Implementation of interface EAContainerWithStereotypes //

    // BEGIN Implementation of interface EAContainerWithNamespace //

    @Override
    public EAContainerWithNamespace getParent()
    {
        final int parentId = (Integer) getOrCreateCachedValue(CACHED_PARENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaDiagram.GetParentID();
            }
        });

        try
        {
            // If parent ID is zero, the parent is no element but a package
            return (0 != parentId) ? getRepository().getOrCreateEAObjectContainerById(parentId, EAElementContainer.class) : getPackage();
        }
        catch (final EAException e)
        {
            final ParentElementNotFoundException parentElementNotFoundException = createParentElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, parentElementNotFoundException.getMessage());
            throw parentElementNotFoundException;
        }
    }

    @Override
    public EAElementContainer getElement()
    {
        return null;
    }

    @Override
    public EAPackageContainer getPackage()
    {
        final int packageId = (Integer) getOrCreateCachedValue(CACHED_PACKAGE_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaDiagram.GetPackageID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(packageId, EAPackageContainer.class);
        }
        catch (final EAException e)
        {
            final ReferencedElementNotFoundException referencedElementNotFoundException = createReferencedElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, referencedElementNotFoundException.getMessage());
            throw referencedElementNotFoundException;
        }
    }

    @Override
    public IPath getNamespaceAsPath()
    {
        return getNamespaceAsPath(getParent());
    }

    @Override
    public String getNamespace()
    {
        return getNamespace(getParent());
    }

    @Override
    public int getPosition()
    {
        // Not supported! Diagrams are always the top elements within a package.
        return 0;
    }

    @Override
    public void setPosition(int position)
    {
        throw new UnsupportedOperationException();
    }

    // END Implementation of interface EAContainerWithNamespace //

    // BEGIN Implementation of interface EADiagramContainer //

    @Override
    public Type getType()
    {
        final String typeString = (String) getOrCreateCachedValue(CACHED_TYPE_STRING, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaDiagram.GetType();
            }
        });

        return Type.getByName(typeString);
    }

    @Override
    public List<EADiagramObjectContainer> getDiagramObjects()
    {
        @SuppressWarnings("unchecked")
        final Collection<DiagramObject> diagramObjects = (Collection<DiagramObject>) getOrCreateCachedValue(CACHED_DIAGRAM_OBJECTS,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        return eaDiagram.GetDiagramObjects();
                    }
                });

        return getOrCreateEAObjectContainers(diagramObjects, EADiagramObjectContainer.class);
    }

    @Override
    public EADiagramObjectContainer createDiagramObject(final EAElementContainer element)
    {
        if (null == element)
        {
            return null;
        }

        return (EADiagramObjectContainer) clearCachedValue(CACHED_DIAGRAM_OBJECTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<DiagramObject> eaDiagramObjects = eaDiagram.GetDiagramObjects();
                final DiagramObject newEADiagramObject = eaDiagramObjects.AddNew("", "");
                newEADiagramObject.SetElementID((Integer) arguments[0]);

                if (!newEADiagramObject.Update())
                {
                    return null;
                }

                eaDiagramObjects.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEADiagramObject, EADiagramObjectContainer.class);
            }
        }, element.getEAObjectId());
    }

    @Override
    public EADiagramObjectContainer getOrCreateDiagramObject(final EAElementContainer element)
    {
        if (null == element)
        {
            return null;
        }

        for (final EADiagramObjectContainer diagramObjectContainer : getDiagramObjects())
        {
            if (element.equals(diagramObjectContainer.getElement()))
            {
                return diagramObjectContainer;
            }
        }

        return createDiagramObject(element);
    }

    @Override
    public void deleteDiagramObject(final EADiagramObjectContainer diagramObject)
    {
        clearCachedValue(CACHED_DIAGRAM_OBJECTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaDiagram.GetDiagramObjects(), arguments[0]);

                return null;
            }
        }, diagramObject.getEAObject());
    }

    @Override
    public void deleteAllDiagramObjects()
    {
        clearCachedValue(CACHED_DIAGRAM_OBJECTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaDiagram.GetDiagramObjects());

                return null;
            }
        });
    }

    @Override
    public void layout()
    {
        eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                String guid = eaDiagram.GetDiagramGUID();

                ((Repository) getRepository().getEAObject()).GetProjectInterface().LayoutDiagramEx(guid, 0, 4, 20, 20, true);

                return null;
            }
        });
    }

    // END Implementation of interface EADiagramContainer //
}
