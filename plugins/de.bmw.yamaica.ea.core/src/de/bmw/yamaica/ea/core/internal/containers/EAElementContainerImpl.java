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
import org.sparx.Connector;
import org.sparx.Diagram;
import org.sparx.Element;
import org.sparx.Method;
import org.sparx.TaggedValue;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EADiagramContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.containers.EATaggedValueContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;

public class EAElementContainerImpl extends EAContainerImpl implements EAElementContainer
{
    protected final Element eaElement;

    protected EAElementContainerImpl(final EAInstance eaInstance, final Element eaElement)
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
            public Object run(final Object... arguments)
            {
                return eaElement.GetName();
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
                eaElement.SetName((String) arguments[0]);
                eaElement.Update();

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
                return eaElement.GetNotes();
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
                eaElement.SetNotes((String) arguments[0]);
                eaElement.Update();

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
                return eaElement.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAContainerWithNamespace parent = getParent();

        if (parent instanceof EAElementContainer)
        {
            ((EAElementContainer) parent).deleteElement(this);
        }
        else if (parent instanceof EAPackageContainer)
        {
            ((EAPackageContainer) parent).deleteElement(this);
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
                        eaElement.GetConnectors().Refresh();

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
                return eaElement.GetStereotypeEx();
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
                eaElement.SetStereotypeEx((String) arguments[0]);
                eaElement.Update();

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
                return eaElement.GetParentID();
            }
        });

        try
        {
            // If parent ID is zero, the parent is no element but a package
            return (0 != parentId) ? getRepository().getOrCreateEAObjectContainerById(parentId, EAElementContainer.class) : getPackage();
        }
        catch (EAException e)
        {
            throw createParentElementNotFoundException(e, this);
        }
    }

    @Override
    public EAElementContainer getElement()
    {
        return this;
    }

    @Override
    public EAPackageContainer getPackage()
    {
        final int packageId = (Integer) getOrCreateCachedValue(CACHED_PACKAGE_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaElement.GetPackageID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(packageId, EAPackageContainer.class);
        }
        catch (EAException e)
        {
            throw createReferencedElementNotFoundException(e, this);
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
        return (Integer) getOrCreateCachedValue(CACHED_POSITION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaElement.GetTreePos();
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
                eaElement.SetTreePos((Integer) arguments[0]);
                eaElement.Update();

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
                        return eaElement.GetTaggedValues();
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
                final Collection<TaggedValue> eaTaggedValues = eaElement.GetTaggedValues();
                final TaggedValue newEATaggedValue = eaTaggedValues.AddNew((String) arguments[0], "");

                if (!newEATaggedValue.Update())
                {
                    return null;
                }

                eaTaggedValues.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEATaggedValue, EATaggedValueContainer.class);
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
                deleteEAObject(eaElement.GetTaggedValues(), arguments[0]);

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
                deleteEAObjects(eaElement.GetTaggedValues());

                return null;
            }
        });
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
                return eaElement.GetElements();
            }
        });

        return getOrCreateEAObjectContainers(elements, EAElementContainer.class);
    }

    @Override
    public List<EAConnectorContainer> getConnectors()
    {
        @SuppressWarnings("unchecked")
        final Collection<Connector> connectors = (Collection<Connector>) getOrCreateCachedValue(CACHED_CONNECTORS,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        return eaElement.GetConnectors();
                    }
                });

        return getOrCreateEAObjectContainers(connectors, EAConnectorContainer.class);
    }

    @Override
    public List<EAConnectorContainer> getConnectors(final EAConnectorContainer.Type... types)
    {
        return getFilteredEAConnectors(getConnectors(), types);
    }

    @Override
    public String getAuthor()
    {
        return (String) getOrCreateCachedValue(CACHED_AUTHOR, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaElement.GetAuthor();
            }
        });
    }

    @Override
    public void setAuthor(final String author)
    {
        clearCachedValue(CACHED_AUTHOR, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaElement.SetAuthor((String) arguments[0]);
                eaElement.Update();

                return null;
            }
        }, author);
    }

    @Override
    public String getVersion()
    {
        return (String) getOrCreateCachedValue(CACHED_VERSION, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaElement.GetVersion();
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
                eaElement.SetVersion((String) arguments[0]);
                eaElement.Update();

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
                final Collection<Element> eaElements = eaElement.GetElements();
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
                deleteEAObject(eaElement.GetElements(), arguments[0]);

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
                deleteEAObjects(eaElement.GetElements());

                return null;
            }
        });
    }

    @Override
    public EAConnectorContainer createConnector(final String name, final EAConnectorContainer.Type type, final EAElementContainer client)
    {
        final EAConnectorContainer connector = (EAConnectorContainer) clearCachedValue(CACHED_CONNECTORS, CACHED_BASE_CLASSES,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        final EAConnectorContainer.Type type = (EAConnectorContainer.Type) arguments[1];
                        final int clientId = (Integer) arguments[2];
                        final Collection<Connector> eaConnectors = eaElement.GetConnectors();
                        final Connector newEAConnector = eaConnectors.AddNew((String) arguments[0], type.getType());
                        newEAConnector.SetSubtype(type.getSubtype());
                        newEAConnector.SetClientID(clientId);
                        newEAConnector.SetSupplierID(getEAObjectId());

                        if (!newEAConnector.Update())
                        {
                            return null;
                        }

                        eaConnectors.Refresh();

                        return getRepository().getOrCreateEAObjectContainer(newEAConnector, EAConnectorContainer.class);
                    }
                }, name, type, client.getEAObjectId());

        client.clearCachedValues(CACHED_CONNECTORS, CACHED_BASE_CLASSES);

        return connector;
    }

    @Override
    public EAConnectorContainer getOrCreateConnector(final String name, final EAConnectorContainer.Type type,
            final EAElementContainer client)
    {
        if (null == name || null == type || null == client)
        {
            return null;
        }

        for (final EAConnectorContainer connectorContainer : getConnectors(type))
        {
            if (name.equals(connectorContainer.getName()) && type.equals(connectorContainer.getType())
                    && client.equals(connectorContainer.getClient()))
            {
                return connectorContainer;
            }
        }

        return createConnector(name, type, client);
    }

    @Override
    public void deleteConnector(final String name)
    {
        deleteConnector(getEAObjectContainerByName(getConnectors(), name, EAConnectorContainer.class));
    }

    @Override
    public void deleteConnector(final EAConnectorContainer connector)
    {
        clearCachedValue(CACHED_CONNECTORS, CACHED_BASE_CLASSES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaElement.GetConnectors(), arguments[0]);

                return null;
            }
        }, connector.getEAObject());

        // clear cache on the other side of the connector
        connector.getClient().clearCachedValues(CACHED_CONNECTORS, CACHED_BASE_CLASSES);
    }

    @Override
    public void deleteAllConnectors()
    {
        clearCachedValue(CACHED_CONNECTORS, CACHED_BASE_CLASSES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Connector> eaConnectors = eaElement.GetConnectors();

                for (Connector eaConnector : eaConnectors)
                {
                    EAConnectorContainer connectorContainer = getRepository().getEAObjectContainer(eaConnector, EAConnectorContainer.class);

                    if (null != connectorContainer)
                    {
                        // clear cache on the other side of the connector
                        connectorContainer.getClient().clearCachedValues(CACHED_CONNECTORS, CACHED_BASE_CLASSES);
                    }
                }

                deleteEAObjects(eaConnectors);

                return null;
            }
        });
    }

    @Override
    public EADiagramContainer createDiagram(final String name, final EADiagramContainer.Type type)
    {
        return (EADiagramContainer) clearCachedValue(CACHED_DIAGRAMS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Diagram> eaDiagrams = eaElement.GetDiagrams();
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
    public List<EADiagramContainer> getDiagrams()
    {
        @SuppressWarnings("unchecked")
        final Collection<Diagram> diagrams = (Collection<Diagram>) getOrCreateCachedValue(CACHED_DIAGRAMS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaElement.GetDiagrams();
            }
        });

        return getOrCreateEAObjectContainers(diagrams, EADiagramContainer.class);
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
                deleteEAObject(eaElement.GetDiagrams(), arguments[0]);

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
                deleteEAObjects(eaElement.GetDiagrams());

                return null;
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
            public Object run(final Object... arguments)
            {
                return eaElement.GetGenlinks();
            }
        });
    }

    @Override
    public void setGenlinks(final String genlinks)
    {
        clearCachedValue(CACHED_GEN_LINKS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaElement.SetGenlinks((String) arguments[0]);
                eaElement.Update();

                return null;
            }
        }, genlinks);
    }

    @Override
    public Type getType()
    {
        final String type = (String) getOrCreateCachedValue(CACHED_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaElement.GetType();
            }
        });

        return Type.getByName(type);
    }

    @Override
    public void setType(final Type type)
    {
        clearCachedValue(CACHED_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaElement.SetType((String) arguments[0]);
                eaElement.Update();

                return null;
            }
        }, type.getName());
    }

    @Override
    public List<EAAttributeContainer> getAttributes()
    {
        @SuppressWarnings("unchecked")
        final Collection<Attribute> attributes = (Collection<Attribute>) getOrCreateCachedValue(CACHED_ATTRIBUTES,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        return eaElement.GetAttributes();
                    }
                });

        return getOrCreateEAObjectContainers(attributes, EAAttributeContainer.class);
    }

    @Override
    public List<EAMethodContainer> getMethods()
    {
        @SuppressWarnings("unchecked")
        final Collection<Method> methods = (Collection<Method>) getOrCreateCachedValue(CACHED_METHODS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaElement.GetMethods();
            }
        });

        return getOrCreateEAObjectContainers(methods, EAMethodContainer.class);
    }

    @Override
    public List<EAElementContainer> getBaseClasses()
    {
        @SuppressWarnings("unchecked")
        final Collection<Element> baseClasses = (Collection<Element>) getOrCreateCachedValue(CACHED_BASE_CLASSES,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        return eaElement.GetBaseClasses();
                    }
                });

        return getOrCreateEAObjectContainers(baseClasses, EAElementContainer.class);
    }

    @Override
    public EAElementContainer getClassifier()
    {
        int classifierId = (Integer) getOrCreateCachedValue(CACHED_CLASSIFIER, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaElement.GetClassifierID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(classifierId, EAElementContainer.class);
    }

    public EAAttributeContainer createAttribute(final String name)
    {
        return (EAAttributeContainer) clearCachedValue(CACHED_ATTRIBUTES, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Attribute> eaAttributes = eaElement.GetAttributes();
                final Attribute newEAAttribute = eaAttributes.AddNew((String) arguments[0], "");
                newEAAttribute.SetPos(eaAttributes.GetCount() - 1);

                if (!newEAAttribute.Update())
                {
                    return null;
                }

                eaAttributes.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAAttribute, EAAttributeContainer.class);
            }
        }, name);
    }

    @Override
    public EAAttributeContainer getOrCreateAttribute(final String name)
    {
        if (null == name)
        {
            return null;
        }

        for (final EAAttributeContainer attributeContainer : getAttributes())
        {
            if (name.equals(attributeContainer.getName()))
            {
                return attributeContainer;
            }
        }

        return createAttribute(name);
    }

    @Override
    public void deleteAttribute(final String name)
    {
        deleteAttribute(getEAObjectContainerByName(getAttributes(), name, EAAttributeContainer.class));
    }

    @Override
    public void deleteAttribute(final EAAttributeContainer attribute)
    {
        clearCachedValue(CACHED_ELEMENTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaElement.GetAttributes(), arguments[0]);

                return null;
            }
        }, attribute.getEAObject());
    }

    @Override
    public void deleteAllAttributes()
    {
        clearCachedValue(CACHED_ELEMENTS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaElement.GetAttributes());

                return null;
            }
        });
    }

    @Override
    public EAMethodContainer createMethod(final String name)
    {
        return (EAMethodContainer) clearCachedValue(CACHED_METHODS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Method> eaMethods = eaElement.GetMethods();
                final Method newEAMethod = eaMethods.AddNew((String) arguments[0], "");
                newEAMethod.SetPos(eaMethods.GetCount() - 1);

                if (!newEAMethod.Update())
                {
                    return null;
                }

                eaMethods.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAMethod, EAMethodContainer.class);
            }
        }, name);
    }

    @Override
    public EAMethodContainer getOrCreateMethod(final String name)
    {
        if (null == name)
        {
            return null;
        }

        for (final EAMethodContainer methodContainer : getMethods())
        {
            if (name.equals(methodContainer.getName()))
            {
                return methodContainer;
            }
        }

        return createMethod(name);
    }

    @Override
    public void deleteMethod(final String name)
    {
        deleteMethod(getEAObjectContainerByName(getMethods(), name, EAMethodContainer.class));
    }

    @Override
    public void deleteMethod(final EAMethodContainer method)
    {
        clearCachedValue(CACHED_METHODS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaElement.GetMethods(), arguments[0]);

                return null;
            }
        }, method.getEAObject());
    }

    @Override
    public void deleteAllMethods()
    {
        clearCachedValue(CACHED_METHODS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaElement.GetMethods());

                return null;
            }
        });

    }

    // END Implementation of interface EAElementContainer //
}
