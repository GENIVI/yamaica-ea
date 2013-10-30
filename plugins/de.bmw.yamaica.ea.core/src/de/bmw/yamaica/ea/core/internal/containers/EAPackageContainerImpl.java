/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.Element;
import org.sparx.Package;

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;

public class EAPackageContainerImpl extends EAContainerImpl implements EAPackageContainer
{
    protected final Package eaPackage;

    protected EAPackageContainerImpl(EAInstance eaInstance, Package eaPackage)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaPackage));

        Assert.isNotNull(eaPackage);

        this.eaPackage = eaPackage;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaPackage;
    }

    @Override
    public String getName()
    {
        return (String) getOrCreateCachedValue(CACHED_NAME, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaPackage.GetName();
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
                return eaPackage.GetNotes();
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
                return eaPackage.Update();
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
                return eaPackage.GetStereotypeEx();
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
                return eaPackage.GetParentID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(parentId, EAPackageContainer.class, this);
    }

    @Override
    public EAElementContainer getElement()
    {
        Element element = (Element) getOrCreateCachedValue(CACHED_ELEMENT, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaPackage.GetElement();
            }
        });

        return getRepository().getOrCreateEAObjectContainer(element, EAElementContainer.class);
    }

    @Override
    public EAPackageContainerImpl getPackage()
    {
        return this;
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
                return eaPackage.GetTreePos();
            }
        });
    }

    // END Implementation of interface EAContainerWithNamespace //

    // BEGIN Implementation of interface EAContainerWithTaggedValues //

    @Override
    public List<EATagContainer> getTaggedValues()
    {
        EAElementContainer elementContainer = getElement();

        return (null != elementContainer) ? elementContainer.getTaggedValues() : Collections.<EATagContainer> emptyList();
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
                return eaPackage.GetElements();
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
                return eaPackage.GetConnectors();
            }
        });

        return getFilteredEAConnectors(connectors, type);
    }

    @Override
    public String getAuthor()
    {
        return getElement().getAuthor();
    }

    @Override
    public String getVersion()
    {
        return (String) getOrCreateCachedValue(CACHED_VERSION, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaPackage.GetVersion();
            }
        });
    }

    // END Implementation of interface EAContainerWithElements //

    // BEGIN Implementation of interface EAPackageContainer //

    @Override
    public String getFlags()
    {
        return (String) getOrCreateCachedValue(CACHED_FLAGS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaPackage.GetFlags();
            }
        });
    }

    @Override
    public boolean isModel()
    {
        return (Boolean) getOrCreateCachedValue(CACHED_IS_MODEL, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaPackage.GetIsModel();
            }
        });
    }

    @Override
    public boolean isNamespaceRoot()
    {
        return (Boolean) getOrCreateCachedValue(CACHED_IS_NAMESPACE_ROOT, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaPackage.GetIsNamespace();
            }
        });
    }

    @Override
    public List<EAPackageContainer> getPackages()
    {
        @SuppressWarnings("unchecked")
        Collection<Package> packages = (Collection<Package>) getOrCreateCachedValue(CACHED_PACKAGES, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaPackage.GetPackages();
            }
        });

        return getRepository().getOrCreateEAObjectContainers(packages, EAPackageContainer.class);
    }

    @Override
    public List<EAPackageContainer> getImportedPackages()
    {
        List<EAPackageContainer> list = new ArrayList<EAPackageContainer>();

        for (EAConnectorContainer connector : getConnectors(EAConnectorContainer.PACKAGE))
        {
            if (connector.hasStereotype(EAConstants.STEREOTYPE_IMPORT))
            {
                EAElementContainer supplier = connector.getSupplier();
                EAElementContainer client = connector.getClient();

                if (supplier.getName().equals(getName()) && connector.isNavigable(client) && !connector.isNavigable(supplier))
                {
                    EAPackageContainer clientPackage = getPackageOfPackageElement(client);

                    if (null != clientPackage)
                    {
                        list.add(clientPackage);
                    }
                }
                else if (client.getName().equals(getName()) && connector.isNavigable(supplier) && !connector.isNavigable(client))
                {
                    EAPackageContainer supplierPackage = getPackageOfPackageElement(supplier);

                    if (null != supplierPackage)
                    {
                        list.add(supplierPackage);
                    }
                }
            }
        }

        return list;
    }

    // END Implementation of interface EAPackageContainer //

    protected static EAPackageContainer getPackageOfPackageElement(EAElementContainer packageElement)
    {
        if (null == packageElement)
        {
            return null;
        }

        EAPackageContainer packageOfPackageElement = packageElement.getPackage();

        if (null == packageOfPackageElement)
        {
            return null;
        }

        for (EAPackageContainer p : packageOfPackageElement.getPackages())
        {
            if (packageElement.equals(p.getElement()))
            {
                return p;
            }
        }

        return null;
    }
}
