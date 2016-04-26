/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.sparx.Collection;
import org.sparx.Diagram;
import org.sparx.Element;
import org.sparx.Package;

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer.Type;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EADiagramContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.exceptions.UnsupportedOperationException;
import de.bmw.yamaica.ea.core.franca.EAFrancaConstants;

public class EAPackageContainerImpl extends EAContainerImpl implements EAPackageContainer
{
    protected final Package eaPackage;

    protected EAPackageContainerImpl(final EAInstance eaInstance, final Package eaPackage)
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
            public Object run(final Object... arguments)
            {
                return eaPackage.GetName();
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
                eaPackage.SetName((String) arguments[0]);
                eaPackage.Update();

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
                return eaPackage.GetNotes();
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
                eaPackage.SetNotes((String) arguments[0]);
                eaPackage.Update();

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
                return eaPackage.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        if (isModel())
        {
            getRepository().deleteModel(this);
        }
        else
        {
            final EAContainer parent = getParent();

            if (parent instanceof EAPackageContainer)
            {
                ((EAPackageContainer) parent).deletePackage(this);
            }
        }
    }

    @Override
    public void clearCachedValues(final Object... keys)
    {
        for (final Object key : keys)
        {
            if (null != key && (key.equals(CACHED_CONNECTORS) || key.equals(CACHED_BASE_CLASSES)))
            {
                clearCachedValue(CACHED_CONNECTORS, CACHED_BASE_CLASSES, new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        eaPackage.GetConnectors().Refresh();

                        return null;
                    }
                });

                return;
            }
        }

        super.clearCachedValues(keys);
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
                return eaPackage.GetStereotypeEx();
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
                eaPackage.SetStereotypeEx((String) arguments[0]);
                eaPackage.Update();

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
                return eaPackage.GetParentID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(parentId, EAPackageContainer.class);
        }
        catch (EAException e)
        {
            throw createParentElementNotFoundException(e, this);
        }
    }

    @Override
    public EAElementContainer getElement()
    {
        final Element element = (Element) getOrCreateCachedValue(CACHED_ELEMENT, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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
            public Object run(final Object... arguments)
            {
                return eaPackage.GetTreePos();
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
                eaPackage.SetTreePos((Integer) arguments[0]);
                eaPackage.Update();

                return null;
            }
        }, position);
    }

    // END Implementation of interface EAContainerWithNamespace //

    // BEGIN Implementation of interface EAContainerWithTaggedValues //

    @Override
    public List<EATagContainer> getTaggedValues()
    {
        checkForModelRestrictions();

        return getElement().getTaggedValues();
    }

    @Override
    public EATagContainer createTaggedValue(final String name)
    {
        checkForModelRestrictions();

        return getElement().createTaggedValue(name);
    }

    @Override
    public EATagContainer getOrCreateTaggedValue(final String name)
    {
        checkForModelRestrictions();

        return getElement().getOrCreateTaggedValue(name);
    }

    @Override
    public EATagContainer getTaggedValueByName(final String name)
    {
        checkForModelRestrictions();

        return getElement().getTaggedValueByName(name);
    }

    @Override
    public void deleteTaggedValue(final String name)
    {
        checkForModelRestrictions();

        getElement().deleteTaggedValue(name);
    }

    @Override
    public void deleteTaggedValue(final EATagContainer taggedValue)
    {
        checkForModelRestrictions();

        getElement().deleteTaggedValue(taggedValue);
    }

    @Override
    public void deleteAllTaggedValues()
    {
        checkForModelRestrictions();

        getElement().deleteAllTaggedValues();
    }

    // END Implementation of interface EAContainerWithTaggedValues //

    // BEGIN Implementation of interface EAContainerWithElements //

    @Override
    public List<EAElementContainer> getElements()
    {
        @SuppressWarnings("unchecked")
        final Collection<Element> elements = (Collection<Element>) getOrCreateCachedValue(CACHED_ELEMENTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaPackage.GetElements();
            }
        });

        return getOrCreateEAObjectContainers(elements, EAElementContainer.class);
    }

    @Override
    public List<EAConnectorContainer> getConnectors()
    {
        checkForModelRestrictions();

        return getElement().getConnectors();
    }

    @Override
    public List<EAConnectorContainer> getConnectors(final Type... types)
    {
        checkForModelRestrictions();

        return getElement().getConnectors(types);
    }

    @Override
    public List<EADiagramContainer> getDiagrams()
    {
        @SuppressWarnings("unchecked")
        final Collection<Diagram> diagrams = (Collection<Diagram>) getOrCreateCachedValue(CACHED_DIAGRAMS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaPackage.GetDiagrams();
            }
        });

        return getOrCreateEAObjectContainers(diagrams, EADiagramContainer.class);
    }

    @Override
    public String getAuthor()
    {
        checkForModelRestrictions();

        return getElement().getAuthor();
    }

    @Override
    public void setAuthor(final String author)
    {
        checkForModelRestrictions();

        getElement().setAuthor(author);
    }

    @Override
    public String getVersion()
    {
        return (String) getOrCreateCachedValue(CACHED_VERSION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaPackage.GetVersion();
            }
        });
    }

    @Override
    public void setVersion(final String version)
    {
        clearCachedValue(CACHED_VERSION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaPackage.SetVersion((String) arguments[0]);
                eaPackage.Update();

                return null;
            }
        }, version);
    }

    @Override
    public EAElementContainer createElement(final String name, final EAElementContainer.Type type)
    {
        return (EAElementContainer) clearCachedValue(CACHED_ELEMENTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Element> eaElements = eaPackage.GetElements();
                final Element newEAElement = eaElements.AddNew((String) arguments[0], (String) arguments[1]);
                newEAElement.SetTreePos(eaElements.GetCount() - 1);

                if (!newEAElement.Update())
                {
                    return null;
                }

                eaElements.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAElement, EAElementContainer.class);
            }
        }, name, type.getName());
    }

    @Override
    public EAElementContainer getOrCreateElement(final String name, final EAElementContainer.Type type)
    {
        if (null == name)
        {
            return null;
        }

        for (final EAElementContainer elementContainer : getElements())
        {
            if (name.equals(elementContainer.getName()) && type.equals(elementContainer.getType()))
            {
                return elementContainer;
            }
        }

        return createElement(name, type);
    }

    @Override
    public void deleteElement(final String name)
    {
        deleteElement(getEAObjectContainerByName(getElements(), name, EAElementContainer.class));
    }

    @Override
    public void deleteElement(final EAElementContainer element)
    {
        clearCachedValue(CACHED_ELEMENTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaPackage.GetElements(), arguments[0]);

                return null;
            }
        }, element.getEAObject());
    }

    @Override
    public void deleteAllElements()
    {
        clearCachedValue(CACHED_ELEMENTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaPackage.GetElements());

                return null;
            }
        });
    }

    @Override
    public EAConnectorContainer createConnector(final String name, final EAConnectorContainer.Type type, final EAElementContainer client)
    {
        checkForModelRestrictions();

        return getElement().createConnector(name, type, client);
    }

    @Override
    public EAConnectorContainer getOrCreateConnector(final String name, final EAConnectorContainer.Type type,
            final EAElementContainer client)
    {
        checkForModelRestrictions();

        return getElement().getOrCreateConnector(name, type, client);
    }

    @Override
    public void deleteConnector(final String name)
    {
        checkForModelRestrictions();

        getElement().deleteConnector(name);
    }

    @Override
    public void deleteConnector(final EAConnectorContainer connector)
    {
        checkForModelRestrictions();

        getElement().deleteConnector(connector);
    }

    @Override
    public void deleteAllConnectors()
    {
        checkForModelRestrictions();

        getElement().deleteAllConnectors();
    }

    @Override
    public EADiagramContainer createDiagram(final String name, final EADiagramContainer.Type type)
    {
        return (EADiagramContainer) clearCachedValue(CACHED_DIAGRAMS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Diagram> eaDiagrams = eaPackage.GetDiagrams();
                final Diagram newEADiagram = eaDiagrams.AddNew((String) arguments[0], (String) arguments[1]);

                if (!newEADiagram.Update())
                {
                    return null;
                }

                eaDiagrams.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEADiagram, EADiagramContainer.class);
            }
        }, name, type.getName());
    }

    @Override
    public EADiagramContainer getOrCreateDiagram(final String name, final EADiagramContainer.Type type)
    {
        if (null == name)
        {
            return null;
        }

        for (final EADiagramContainer diagramContainer : getDiagrams())
        {
            if (name.equals(diagramContainer.getName()) && type.equals(diagramContainer.getType()))
            {
                return diagramContainer;
            }
        }

        return createDiagram(name, type);
    }

    @Override
    public void deleteDiagram(final String name)
    {
        deleteDiagram(getEAObjectContainerByName(getDiagrams(), name, EADiagramContainer.class));
    }

    @Override
    public void deleteDiagram(final EADiagramContainer diagram)
    {
        clearCachedValue(CACHED_DIAGRAMS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaPackage.GetDiagrams(), arguments[0]);

                return null;
            }
        }, diagram.getEAObject());
    }

    @Override
    public void deleteAllDiagrams()
    {
        clearCachedValue(CACHED_DIAGRAMS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaPackage.GetDiagrams());

                return null;
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
            public Object run(final Object... arguments)
            {
                return eaPackage.GetFlags();
            }
        });
    }

    @Override
    public void setFlags(String flags)
    {
        clearCachedValue(CACHED_FLAGS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                eaPackage.SetFlags((String) arguments[0]);

                return null;
            }
        }, flags);
    }

    @Override
    public boolean isModel()
    {
        return (Boolean) getOrCreateCachedValue(CACHED_IS_MODEL, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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
            public Object run(final Object... arguments)
            {
                return eaPackage.GetIsNamespace();
            }
        });
    }

    @Override
    public void setIsNamespaceRoot(final boolean isNamespaceRoot)
    {
        clearCachedValue(CACHED_IS_NAMESPACE_ROOT, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaPackage.SetIsNamespace((Boolean) arguments[0]);
                eaPackage.Update();

                return null;
            }
        }, isNamespaceRoot);
    }

    @Override
    public List<EAPackageContainer> getPackages()
    {
        @SuppressWarnings("unchecked")
        final Collection<Package> packages = (Collection<Package>) getOrCreateCachedValue(CACHED_PACKAGES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaPackage.GetPackages();
            }
        });

        return getOrCreateEAObjectContainers(packages, EAPackageContainer.class);
    }

    @Override
    public List<EAPackageContainer> getImportedPackages()
    {
        final List<EAPackageContainer> list = new ArrayList<>();
        final List<EAConnectorContainer> connectors = new ArrayList<>();
        connectors.addAll(getConnectors(EAConnectorContainer.Type.PACKAGE));
        connectors.addAll(getConnectors(EAConnectorContainer.Type.DEPENDENCY));

        for (final EAConnectorContainer connector : connectors)
        {
            if (connector.hasStereotype(EAConstants.STEREOTYPE_IMPORT))
            {
                final EAElementContainer supplier = connector.getSupplier();
                final EAElementContainer client = connector.getClient();

                if (supplier.getName().equals(getName()) && connector.isNavigable(client) && !connector.isNavigable(supplier))
                {
                    final EAPackageContainer clientPackage = getPackageOfPackageElement(client);

                    if (null != clientPackage)
                    {
                        list.add(clientPackage);
                    }
                }
                else if (client.getName().equals(getName()) && connector.isNavigable(supplier) && !connector.isNavigable(client))
                {
                    final EAPackageContainer supplierPackage = getPackageOfPackageElement(supplier);

                    if (null != supplierPackage)
                    {
                        list.add(supplierPackage);
                    }
                }
            }
        }

        return list;
    }

    // Related to GLIPCI-36 (the 'managed service' franca feature).
    @Override
    public Map<EAElementContainer, List<EAElementContainer>> getManagedServices()
    {
        // In case no managed services are available, the list is empty (not null!).
        final Map<EAElementContainer, List<EAElementContainer>> map = new HashMap<>();

        for (final EAElementContainer currElement : getElements())
        {
            // Search for elements with Type: 'INTERFACE', Sterotypes: 'FrancaServiceInterface'
            if (EAElementContainer.Type.INTERFACE.equals(currElement.getType())
                    && currElement.hasStereotype(EAFrancaConstants.STEREOTYPE_FRANCA_SERVICE_INTERFACE))
            {
                final List<EAElementContainer> innerList = new ArrayList<>();
                map.put(currElement, innerList);

                for (final EAConnectorContainer conn : currElement.getConnectors(EAConnectorContainer.Type.ASSOCIATION))
                {
                    if (conn.hasStereotype(EAFrancaConstants.STEREOTYPE_MANAGES))
                    {
                        final EAElementContainer client = conn.getClient();
                        final EAElementContainer supplier = conn.getSupplier();

                        // Filter by client:
                        // Interface1 (client) ---- manages ----> Interface2 (supplier)
                        if (currElement.getName().equals(client.getName()))
                        {
                            innerList.add(supplier);
                        }
                    }
                }
            }
        }
        return map;
    }

    @Override
    public EAPackageContainer createPackage(final String name)
    {
        return (EAPackageContainer) clearCachedValue(CACHED_PACKAGES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Package> eaPackages = eaPackage.GetPackages();
                final Package newEAPackage = eaPackages.AddNew((String) arguments[0], "");
                newEAPackage.SetTreePos(eaPackages.GetCount() - 1);

                if (!newEAPackage.Update())
                {
                    return null;
                }

                eaPackages.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAPackage, EAPackageContainer.class);
            }
        }, name);
    }

    @Override
    public EAPackageContainer getOrCreatePackage(final String name)
    {
        if (null == name)
        {
            return null;
        }

        for (final EAPackageContainer packageContainer : getPackages())
        {
            if (name.equals(packageContainer.getName()))
            {
                return packageContainer;
            }
        }

        return createPackage(name);
    }

    @Override
    public void deletePackage(final String name)
    {
        deletePackage(getEAObjectContainerByName(getPackages(), name, EAPackageContainer.class));
    }

    @Override
    public void deletePackage(final EAPackageContainer package_)
    {
        clearCachedValue(CACHED_PACKAGES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaPackage.GetPackages(), arguments[0]);

                return null;
            }
        }, package_.getEAObject());
    }

    @Override
    public void deleteAllPackages()
    {
        clearCachedValue(CACHED_PACKAGES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaPackage.GetPackages());

                return null;
            }
        });
    }

    // END Implementation of interface EAPackageContainer //

    protected static EAPackageContainer getPackageOfPackageElement(final EAElementContainer packageElement)
    {
        if (null == packageElement)
        {
            return null;
        }

        final EAPackageContainer packageOfPackageElement = packageElement.getPackage();

        if (null == packageOfPackageElement)
        {
            return null;
        }

        for (final EAPackageContainer p : packageOfPackageElement.getPackages())
        {
            if (packageElement.equals(p.getElement()))
            {
                return p;
            }
        }

        return null;
    }

    protected void checkForModelRestrictions()
    {
        if (isModel())
        {
            throw new UnsupportedOperationException();
        }
    }
}
