/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.sparx.AttributeTag;
import org.sparx.Collection;
import org.sparx.Method;
import org.sparx.Parameter;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EAParameterContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;

public class EAMethodContainerImpl extends EAContainerImpl implements EAMethodContainer
{
    protected final Method eaMethod;

    protected EAMethodContainerImpl(EAInstance eaInstance, Method eaMethod)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaMethod));

        Assert.isNotNull(eaMethod);

        this.eaMethod = eaMethod;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaMethod;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaMethod.GetName();
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
                return eaMethod.GetNotes();
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
                return eaMethod.Update();
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
                return eaMethod.GetStereotypeEx();
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

    // BEGIN Implementation of interface EAContainerWithNamespace //

    @Override
    public EAContainerWithNamespace getParent()
    {
        return getElement();
    }

    @Override
    public EAElementContainer getElement()
    {
        int parentId = (Integer) getOrCreateCachedValue(CACHED_PARENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaMethod.GetParentID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(parentId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            throw createParentElementNotFoundException(e, this);
        }
    }

    @Override
    public EAPackageContainer getPackage()
    {
        EAElementContainer element = getElement();

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
            public Object run(Object... arguments)
            {
                return eaMethod.GetPos();
            }
        });
    }

    // END Implementation of interface EAContainerWithNamespace //

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
                        return eaMethod.GetTaggedValues();
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

    // BEGIN Implementation of interface EAMethodContainer //

    @Override
    public String getReturnType()
    {
        return (String) getOrCreateCachedValue(CACHED_RETURN_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaMethod.GetReturnType();
            }
        });
    }

    @Override
    public EAElementContainer getReturnTypeElement()
    {
        int returnTypeElementId = (Integer) getOrCreateCachedValue(CACHED_RETURN_TYPE_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return Integer.parseInt(eaMethod.GetClassifierID());
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(returnTypeElementId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
        }
    }

    @Override
    public boolean isReturnTypeArray()
    {
        return (Boolean) getOrCreateCachedValue(CACHED_IS_RETURN_TYPE_ARRAY, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaMethod.GetReturnIsArray();
            }
        });
    }

    @Override
    public List<EAParameterContainer> getParameters()
    {
        @SuppressWarnings("unchecked")
        Collection<Parameter> parameters = (Collection<Parameter>) getOrCreateCachedValue(CACHED_PARAMETERS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaMethod.GetParameters();
            }
        });

        return getRepository().getOrCreateEAObjectContainers(parameters, EAParameterContainer.class);
    }

    // END Implementation of interface EAMethodContainer //
}
