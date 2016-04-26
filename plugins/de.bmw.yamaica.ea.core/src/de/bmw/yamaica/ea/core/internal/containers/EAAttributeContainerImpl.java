/* Copyright (C) 2013-2015 BMW Group
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
import de.bmw.yamaica.ea.core.containers.EAAttributeTagContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;

public class EAAttributeContainerImpl extends EAContainerImpl implements EAAttributeContainer
{
    protected final Attribute eaAttribute;

    protected EAAttributeContainerImpl(final EAInstance eaInstance, final Attribute eaAttribute)
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
            public Object run(final Object... arguments)
            {
                return eaAttribute.GetName();
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
                eaAttribute.SetName((String) arguments[0]);
                eaAttribute.Update();

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
                return eaAttribute.GetNotes();
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
                eaAttribute.SetNotes((String) arguments[0]);
                eaAttribute.Update();

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
                return eaAttribute.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAContainerWithNamespace parent = getParent();

        if (parent instanceof EAElementContainer)
        {
            ((EAElementContainer) parent).deleteAttribute(this);
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
                return eaAttribute.GetStereotypeEx();
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
                eaAttribute.SetStereotypeEx((String) arguments[0]);
                eaAttribute.Update();

                return null;
            }
        }, getStereotypeEx(stereotypes));
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
        final int parentId = (Integer) getOrCreateCachedValue(CACHED_PARENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaAttribute.GetParentID();
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
                return eaAttribute.GetPos();
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
                eaAttribute.SetPos((Integer) arguments[0]);
                eaAttribute.Update();

                return null;
            }
        }, position);
    }

    // END Implementation of interface EAContainerWithNamespace //

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
                        return eaAttribute.GetTaggedValues();
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
                final Collection<AttributeTag> eaAttributeTags = eaAttribute.GetTaggedValues();
                final AttributeTag newEAAttributeTag = eaAttributeTags.AddNew((String) arguments[0], "");

                if (!newEAAttributeTag.Update())
                {
                    return null;
                }

                eaAttributeTags.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAAttributeTag, EAAttributeTagContainer.class);
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
                deleteEAObject(eaAttribute.GetTaggedValues(), arguments[0]);

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
                deleteEAObjects(eaAttribute.GetTaggedValues());

                return null;
            }
        });
    }

    // END Implementation of interface EAContainerWithTaggedValues //

    // BEGIN Implementation of interface EAAttributeContainer //

    @Override
    public String getDefault()
    {
        return (String) getOrCreateCachedValue(CACHED_DEFAULT, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaAttribute.GetDefault();
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
                eaAttribute.SetDefault((String) arguments[0]);
                eaAttribute.Update();

                return null;
            }
        }, default_);
    }

    @Override
    public String getType()
    {
        return (String) getOrCreateCachedValue(CACHED_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaAttribute.GetType();
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
                eaAttribute.SetType((String) arguments[0]);
                eaAttribute.Update();

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
                return eaAttribute.GetClassifierID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(typeElementId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
        }
    }

    @Override
    public void setTypeElement(final EAElementContainer typeElement)
    {
        int id = (null == typeElement) ? 0 : typeElement.getEAObjectId();

        clearCachedValue(CACHED_TYPE_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaAttribute.SetClassifierID((Integer) arguments[0]);
                eaAttribute.Update();

                return null;
            }
        }, id);
    }

    @Override
    public boolean isCollection()
    {
        return (Boolean) getOrCreateCachedValue(CACHED_IS_COLLECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaAttribute.GetIsCollection();
            }
        });
    }

    @Override
    public void setIsCollection(final boolean isCollection)
    {
        clearCachedValue(CACHED_IS_COLLECTION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaAttribute.SetIsCollection((Boolean) arguments[0]);
                eaAttribute.Update();

                return null;
            }
        }, isCollection);
    }

    // END Implementation of interface EAAttributeContainer //
}
