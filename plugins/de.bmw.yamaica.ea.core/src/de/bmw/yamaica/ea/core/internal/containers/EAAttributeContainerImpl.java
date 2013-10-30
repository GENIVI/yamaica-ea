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
import org.sparx.Attribute;
import org.sparx.AttributeTag;
import org.sparx.Collection;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;

public class EAAttributeContainerImpl extends EAContainerImpl implements EAAttributeContainer
{
    protected final Attribute eaAttribute;

    protected EAAttributeContainerImpl(EAInstance eaInstance, Attribute eaAttribute)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaAttribute));

        Assert.isNotNull(eaAttribute);

        this.eaAttribute = eaAttribute;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaAttribute;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttribute.GetName();
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
                return eaAttribute.GetNotes();
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
                return eaAttribute.Update();
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
                return eaAttribute.GetStereotypeEx();
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
                return eaAttribute.GetParentID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(parentId, EAElementContainer.class, this);
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
                return eaAttribute.GetPos();
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
                        return eaAttribute.GetTaggedValues();
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

    // BEGIN Implementation of interface EAAttributeContainer //

    @Override
    public String getDefault()
    {
        return (String) getOrCreateCachedValue(CACHED_DEFAULT, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttribute.GetDefault();
            }
        });
    }

    @Override
    public String getType()
    {
        return (String) getOrCreateCachedValue(CACHED_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttribute.GetType();
            }
        });
    }

    @Override
    public EAElementContainer getTypeElement()
    {
        int typeElementId = (Integer) getOrCreateCachedValue(CACHED_TYPE_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttribute.GetClassifierID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(typeElementId, EAElementContainer.class, this);
    }

    @Override
    public boolean isCollection()
    {
        return (Boolean) getOrCreateCachedValue(CACHED_IS_COLLECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaAttribute.GetIsCollection();
            }
        });
    }

    // END Implementation of interface EAAttributeContainer //
}
