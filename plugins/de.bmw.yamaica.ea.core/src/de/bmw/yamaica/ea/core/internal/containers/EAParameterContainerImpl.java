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
import org.sparx.Parameter;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EAParameterContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.exceptions.ParentElementNotFoundException;
import de.bmw.yamaica.ea.core.exceptions.ReferencedElementNotFoundException;

public class EAParameterContainerImpl extends EAContainerImpl implements EAParameterContainer
{
    private static final Logger LOGGER = Logger.getLogger(EAParameterContainerImpl.class.getName());

    protected final Parameter eaParameter;

    protected EAParameterContainerImpl(final EAInstance eaInstance, final Parameter eaParameter)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaParameter));

        Assert.isNotNull(eaParameter);

        this.eaParameter = eaParameter;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaParameter;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaParameter.GetName();
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
                eaParameter.SetName((String) arguments[0]);
                eaParameter.Update();

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
                return eaParameter.GetNotes();
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
                eaParameter.SetNotes((String) arguments[0]);
                eaParameter.Update();

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
                return eaParameter.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAContainerWithNamespace parent = getParent();

        if (parent instanceof EAMethodContainer)
        {
            ((EAMethodContainer) parent).deleteParameter(this);
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
                return eaParameter.GetStereotypeEx();
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
                eaParameter.SetStereotypeEx((String) arguments[0]);
                eaParameter.Update();

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
                return eaParameter.GetOperationID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(parentId, EAMethodContainer.class);
        }
        catch (EAException e)
        {
            final ParentElementNotFoundException parentElementNotFoundException = createParentElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, parentElementNotFoundException.getMessage());
            throw parentElementNotFoundException;
        }
    }

    @Override
    public EAElementContainer getElement()
    {
        final EAMethodContainer method = (EAMethodContainer) getParent();

        return (null != method) ? method.getElement() : null;
    }

    @Override
    public EAPackageContainer getPackage()
    {
        final EAElementContainer element = getElement();

        return (null != element) ? element.getPackage() : null;
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
        return (Integer) getOrCreateCachedValue(CACHED_POSITION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaParameter.GetPosition();
            }
        });
    }

    @Override
    public void setPosition(int position)
    {
        clearCachedValue(CACHED_POSITION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaParameter.SetPosition((Integer) arguments[0]);
                eaParameter.Update();

                return null;
            }
        }, position);
    }

    // END Implementation of interface EAContainerWithNamespace //

    // BEGIN Implementation of interface EAParameterContainer //

    @Override
    public Kind getKind()
    {
        final String kindString = (String) getOrCreateCachedValue(CACHED_KIND, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaParameter.GetKind();
            }
        });

        return Kind.getByName(kindString);
    }

    @Override
    public void setKind(final Kind kind)
    {
        clearCachedValue(CACHED_KIND, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaParameter.SetKind((String) arguments[0]);
                eaParameter.Update();

                return null;
            }
        }, kind.getName());
    }

    @Override
    public String getType()
    {
        return (String) getOrCreateCachedValue(CACHED_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaParameter.GetType();
            }
        });
    }

    @Override
    public void setType(final String type)
    {
        clearCachedValue(CACHED_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaParameter.SetType((String) arguments[0]);
                eaParameter.Update();

                return null;
            }
        }, type);
    }

    @Override
    public EAElementContainer getTypeElement()
    {
        final int typeElementId = (Integer) getOrCreateCachedValue(CACHED_TYPE_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                try
                {
                    return Integer.parseInt(eaParameter.GetClassifierID());
                }
                catch (NumberFormatException e)
                {
                    return 0;
                }
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(typeElementId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            final ReferencedElementNotFoundException referencedElementNotFoundException = createReferencedElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, referencedElementNotFoundException.getMessage());
            throw referencedElementNotFoundException;
        }
    }

    @Override
    public void setTypeElement(final EAElementContainer typeElement)
    {
        String id = (null == typeElement) ? "0" : new Integer(typeElement.getEAObjectId()).toString();

        clearCachedValue(CACHED_TYPE_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaParameter.SetClassifierID((String) arguments[0]);
                eaParameter.Update();

                return null;
            }
        }, id);
    }

    @Override
    public String getDefault()
    {
        return (String) getOrCreateCachedValue(CACHED_DEFAULT, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaParameter.GetDefault();
            }
        });
    }

    @Override
    public void setDefault(final String default_)
    {
        clearCachedValue(CACHED_DEFAULT, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaParameter.SetDefault((String) arguments[0]);
                eaParameter.Update();

                return null;
            }
        }, default_);
    }

    // END Implementation of interface EAParameterContainer //

    // The equals implementation of EAContainerImpl uses the ID of the EA object. Since parameters do not have an ID
    // we have to overwrite this method. Elsewhere every parameter would be equal any other parameter.
    @Override
    public boolean equals(final Object obj)
    {
        if (obj instanceof EAParameterContainer)
        {
            final EAParameterContainer parameter = (EAParameterContainer) obj;

            // true if both parameters belong to the same method and have the same name
            if (parameter.getParent().equals(getParent()) && parameter.getName().equals(getName()))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 37;
        int hashCode = 1;
        hashCode = prime * hashCode + getParent().hashCode();
        hashCode = prime * hashCode + getName().hashCode();

        return hashCode;
    }
}
