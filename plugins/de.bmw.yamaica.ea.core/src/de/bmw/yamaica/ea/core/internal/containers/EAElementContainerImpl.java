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
import org.sparx.Connector;
import org.sparx.Element;
import org.sparx.Method;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;

public class EAElementContainerImpl extends EAContainerImpl implements EAElementContainer
{
    protected final Element eaElement;

    protected EAElementContainerImpl(EAInstance eaInstance, Element eaElement)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaElement));

        Assert.isNotNull(eaElement);

        this.eaElement = eaElement;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaElement;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetName();
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
                return eaElement.GetNotes();
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
                return eaElement.Update();
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
                return eaElement.GetStereotypeEx();
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
        int parentId = (Integer) getOrCreateCachedValue(CACHED_PARENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetParentID();
            }
        });

        // If parent ID is zero, the parent is no element but a package
        return (0 != parentId) ? getRepository().getOrCreateEAObjectContainerById(parentId, EAElementContainer.class, this) : getPackage();
    }

    @Override
    public EAElementContainer getElement()
    {
        return this;
    }

    @Override
    public EAPackageContainer getPackage()
    {
        int packageId = (Integer) getOrCreateCachedValue(CACHED_PACKAGE_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetPackageID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(packageId, EAPackageContainer.class, this);
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
                return eaElement.GetTreePos();
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
                        return eaElement.GetTaggedValues();
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

    // BEGIN Implementation of interface EAContainerWithElements //

    @Override
    public List<EAElementContainer> getElements()
    {
        @SuppressWarnings("unchecked")
        Collection<Element> elements = (Collection<Element>) getOrCreateCachedValue(CACHED_ELEMENTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetElements();
            }
        });

        return getRepository().getOrCreateEAObjectContainers(elements, EAElementContainer.class);
    }

    @Override
    public List<EAConnectorContainer> getConnectors(int type)
    {
        @SuppressWarnings("unchecked")
        Collection<Connector> connectors = (Collection<Connector>) getOrCreateCachedValue(CACHED_CONNECTORS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetConnectors();
            }
        });

        return getFilteredEAConnectors(connectors, type);
    }

    @Override
    public String getAuthor()
    {
        return (String) getOrCreateCachedValue(CACHED_AUTHOR, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetAuthor();
            }
        });
    }

    @Override
    public String getVersion()
    {
        return (String) getOrCreateCachedValue(CACHED_VERSION, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetVersion();
            }
        });
    }

    // END Implementation of interface EAContainerWithElements //

    // BEGIN Implementation of interface EAElementContainer //

    @Override
    public String getGenlinks()
    {
        return (String) getOrCreateCachedValue(CACHED_GEN_LINKS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetGenlinks();
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
                return eaElement.GetType();
            }
        });
    }

    @Override
    public List<EAAttributeContainer> getAttributes()
    {
        @SuppressWarnings("unchecked")
        Collection<Attribute> attributes = (Collection<Attribute>) getOrCreateCachedValue(CACHED_ATTRIBUTES, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetAttributes();
            }
        });

        return getRepository().getOrCreateEAObjectContainers(attributes, EAAttributeContainer.class);
    }

    @Override
    public List<EAMethodContainer> getMethods()
    {
        @SuppressWarnings("unchecked")
        Collection<Method> methods = (Collection<Method>) getOrCreateCachedValue(CACHED_METHODS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetMethods();
            }
        });

        return getRepository().getOrCreateEAObjectContainers(methods, EAMethodContainer.class);
    }

    @Override
    public List<EAElementContainer> getBaseClasses()
    {
        @SuppressWarnings("unchecked")
        Collection<Element> baseClasses = (Collection<Element>) getOrCreateCachedValue(CACHED_BASE_CLASSES, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetBaseClasses();
            }
        });

        return getRepository().getOrCreateEAObjectContainers(baseClasses, EAElementContainer.class);
    }

    // END Implementation of interface EAElementContainer //
}
