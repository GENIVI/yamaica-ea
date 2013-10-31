/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.sparx.Attribute;
import org.sparx.AttributeTag;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.ConnectorTag;
import org.sparx.Element;
import org.sparx.Method;
import org.sparx.MethodTag;
import org.sparx.Package;
import org.sparx.Parameter;
import org.sparx.Repository;
import org.sparx.TaggedValue;

import de.bmw.yamaica.ea.core.EAException;
import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.EAObjectType;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;

public class EARepositoryContainerImpl extends EAContainerImpl implements EARepositoryContainer
{
    protected static final String       ERROR_MESSAGE = "An Enterprise Architect error occurred (\"%s\") while transforming "
                                                              + "the %s \"%s\". This is probably due the fact that the database "
                                                              + "of Enterprise Architect is inconsistent. A possible solution is "
                                                              + "to reset all references to other UML elements of this element.";

    protected final Repository          eaRepository;
    protected Map<Integer, EAContainer> allAttributes = new HashMap<Integer, EAContainer>();
    protected Map<Integer, EAContainer> allConnectors = new HashMap<Integer, EAContainer>();
    protected Map<Integer, EAContainer> allElements   = new HashMap<Integer, EAContainer>();
    protected Map<Integer, EAContainer> allMethods    = new HashMap<Integer, EAContainer>();
    protected Map<Integer, EAContainer> allPackages   = new HashMap<Integer, EAContainer>();

    public EARepositoryContainerImpl(EAInstance eaInstance, Repository eaRepository)
    {
        super(eaInstance, 0);

        Assert.isNotNull(eaRepository);

        this.eaRepository = eaRepository;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaRepository;
    }

    @Override
    public String getName()
    {
        return "Repository";
    }

    @Override
    public String getNotes()
    {
        return "";
    }

    @Override
    public boolean update()
    {
        clearCache();

        boolean attributeSuccess = updateEAContainers(allAttributes.values());
        boolean connectorsSuccess = updateEAContainers(allConnectors.values());
        boolean elementsSuccess = updateEAContainers(allElements.values());
        boolean methodsSuccess = updateEAContainers(allMethods.values());
        boolean packagesSuccess = updateEAContainers(allPackages.values());

        return attributeSuccess && connectorsSuccess && elementsSuccess && methodsSuccess && packagesSuccess;
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EARepositoryContainer //

    @Override
    public void exit()
    {
        eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                eaRepository.Exit();

                return null;
            }
        });
    }

    @Override
    public boolean openFile(String filename)
    {
        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaRepository.OpenFile((String) arguments[0]);
            }
        }, filename);
    }

    @Override
    public void closeFile()
    {
        disposeContainers();

        eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                eaRepository.CloseFile();

                return null;
            }
        });
    }

    @Override
    public List<EAPackageContainer> getModels()
    {
        @SuppressWarnings("unchecked")
        Collection<Package> models = (Collection<Package>) getOrCreateCachedValue(CACHED_MODELS, new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaRepository.GetModels();
            }
        });

        return getOrCreateEAObjectContainers(models, EAPackageContainer.class);
    }

    @Override
    public int getEAObjectId(Object eaObject)
    {
        return getEAObjectId(eaObject, EAObjectType.getEAObjectType(eaObject.getClass()));
    }

    @Override
    public void disposeContainer(EAContainer eaContainer)
    {
        if (null == eaContainer)
        {
            return;
        }

        EAObjectType eaObjectType = EAObjectType.getEAContainerType(eaContainer.getClass());
        Map<Integer, EAContainer> eaContainerMap = getEAContainerMap(eaObjectType);

        if (null != eaContainerMap)
        {
            eaContainerMap.remove(eaContainer.getEAObjectId());
        }
    }

    @Override
    public void disposeContainers()
    {
        disposeEAContainers(allAttributes.values());
        disposeEAContainers(allConnectors.values());
        disposeEAContainers(allElements.values());
        disposeEAContainers(allMethods.values());
        disposeEAContainers(allPackages.values());
        dispose();
    }

    @Override
    public <T extends EAContainer> List<T> getOrCreateEAObjectContainers(Collection<?> eaObjects, Class<T> type)
    {
        // It is not possible to access a org.sparx.Collection outside of the EAInstance thread.
        // Thus we copy the collection into a java.util.List.
        @SuppressWarnings("unchecked")
        List<T> eaObjectList = (List<T>) getOrCreateCachedValue(Arrays.<Object> asList(eaObjects, type), new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                Collection<?> eaObjects = (Collection<?>) arguments[0];
                Class<T> type = (Class<T>) arguments[1];
                List<T> list = new ArrayList<T>(eaObjects.GetCount());

                for (Object eaObject : eaObjects)
                {
                    list.add(getOrCreateEAObjectContainer(eaObject, type));
                }

                return list;
            }
        }, eaObjects, type);

        return eaObjectList;
    }

    @Override
    public <T extends EAContainer> T getOrCreateEAObjectContainer(Object eaObject, Class<T> type)
    {
        if (null == eaObject || null == type)
        {
            return null;
        }

        EAObjectType eaObjectType = EAObjectType.getEAObjectType(eaObject.getClass());
        int eaObjectId = getEAObjectId(eaObject, eaObjectType);

        return getOrCreateEAObjectContainer(eaObject, eaObjectId, type, eaObjectType);
    }

    @Override
    public <T extends EAContainer> T getOrCreateEAObjectContainerById(int eaObjectId, Class<T> type, EAContainer container)
    {
        if (0 == eaObjectId || null == type)
        {
            return null;
        }

        try
        {
            EAObjectType eaObjectType = EAObjectType.getEAContainerType(type);
            Object eaObject = getEAObjectById(eaObjectId, eaObjectType);

            return getOrCreateEAObjectContainer(eaObject, eaObjectId, type, eaObjectType);
        }
        catch (EAException e)
        {
            String elementType = container.getEAObjectType().getName().toLowerCase();
            String elementName = container.getName();

            if (container instanceof EAContainerWithNamespace)
            {
                elementName = ((EAContainerWithNamespace) container).getNamespace();
            }

            Throwable cause = e.getCause();

            if (null == cause)
            {
                cause = e;
            }

            String message = String.format(ERROR_MESSAGE, cause.getMessage(), elementType, elementName);

            throw new EAException(message, cause);
        }
    }

    // END Implementation of interface EARepositoryContainer //

    protected <T extends EAContainer> T getOrCreateEAObjectContainer(Object eaObject, int eaObjectId, Class<T> type,
            EAObjectType eaObjectType)
    {
        Map<Integer, EAContainer> eaContainerMap = getEAContainerMap(eaObjectType);

        if (0 == eaObjectId || null == eaContainerMap)
        {
            return type.cast(createEAContainerInstance(eaObject, eaObjectType));
        }
        else if (eaContainerMap.containsKey(eaObjectId))
        {
            return type.cast(eaContainerMap.get(eaObjectId));
        }
        else
        {
            EAContainer eaContainer = createEAContainerInstance(eaObject, eaObjectType);

            eaContainerMap.put(eaObjectId, eaContainer);

            return type.cast(eaContainer);
        }
    }

    protected int getEAObjectId(Object eaObject, EAObjectType eaObjectType)
    {
        return (Integer) getOrCreateCachedValue(Arrays.<Object> asList(eaObject, eaObjectType), new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                switch ((EAObjectType) arguments[1])
                {
                    case ATTRIBUTE:
                        return ((Attribute) arguments[0]).GetAttributeID();

                    case ATTRIBUTE_TAG:
                        return ((AttributeTag) arguments[0]).GetTagID();

                    case CONNECTOR:
                        return ((Connector) arguments[0]).GetConnectorID();

                    case CONNECTOR_TAG:
                        return ((ConnectorTag) arguments[0]).GetTagID();

                    case ELEMENT:
                        return ((Element) arguments[0]).GetElementID();

                    case METHOD:
                        return ((Method) arguments[0]).GetMethodID();

                    case METHOD_TAG:
                        return ((MethodTag) arguments[0]).GetTagID();

                    case PACKAGE:
                        return ((Package) arguments[0]).GetPackageID();

                    case TAGGED_VALUE:
                        return ((TaggedValue) arguments[0]).GetPropertyID();

                    default:
                        return 0;
                }
            }
        }, eaObject, eaObjectType);
    }

    protected Object getEAObjectById(int id, EAObjectType eaObjectType)
    {
        return getOrCreateCachedValue(Arrays.<Object> asList(id, eaObjectType), new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                int id = (Integer) arguments[0];

                switch ((EAObjectType) arguments[1])
                {
                    case ATTRIBUTE:
                        return eaRepository.GetAttributeByID(id);

                    case CONNECTOR:
                        return eaRepository.GetConnectorByID(id);

                    case ELEMENT:
                        return eaRepository.GetElementByID(id);

                    case METHOD:
                        return eaRepository.GetMethodByID(id);

                    case PACKAGE:
                        return eaRepository.GetPackageByID(id);

                    default:
                        return null;
                }
            }
        }, id, eaObjectType);
    }

    protected Map<Integer, EAContainer> getEAContainerMap(EAObjectType eaObjectType)
    {
        switch (eaObjectType)
        {
            case ATTRIBUTE:
                return allAttributes;

            case CONNECTOR:
                return allConnectors;

            case ELEMENT:
                return allElements;

            case METHOD:
                return allMethods;

            case PACKAGE:
                return allPackages;

            default:
                return null;
        }
    }

    protected EAContainer createEAContainerInstance(Object eaObject, EAObjectType eaObjectType)
    {
        switch (eaObjectType)
        {
            case ATTRIBUTE:
                return new EAAttributeContainerImpl(eaInstance, (Attribute) eaObject);

            case ATTRIBUTE_TAG:
                return new EAAttributeTagContainerImpl(eaInstance, (AttributeTag) eaObject);

            case CONNECTOR:
                return new EAConnectorContainerImpl(eaInstance, (Connector) eaObject);

            case CONNECTOR_TAG:
                return new EAConnectorTagContainerImpl(eaInstance, (ConnectorTag) eaObject);

            case ELEMENT:
                return new EAElementContainerImpl(eaInstance, (Element) eaObject);

            case METHOD:
                return new EAMethodContainerImpl(eaInstance, (Method) eaObject);

            case METHOD_TAG:
                return new EAMethodTagContainerImpl(eaInstance, (MethodTag) eaObject);

            case PACKAGE:
                return new EAPackageContainerImpl(eaInstance, (Package) eaObject);

            case PARAMETER:
                return new EAParameterContainerImpl(eaInstance, (Parameter) eaObject);

            case REPOSITORY:
                return new EARepositoryContainerImpl(eaInstance, (Repository) eaObject);

            case TAGGED_VALUE:
                return new EATaggedValueContainerImpl(eaInstance, (TaggedValue) eaObject);

            default:
                return null;
        }
    }

    protected boolean updateEAContainers(java.util.Collection<EAContainer> eaContainers)
    {
        boolean success = true;

        for (EAContainer eaContainer : eaContainers)
        {
            boolean currentSuccess = eaContainer.update();

            success = currentSuccess && success;
        }

        return success;
    }

    protected void disposeEAContainers(java.util.Collection<EAContainer> eaContainers)
    {
        // Copy collection (which comes from the maps above) since the dispose call will
        // touch the map instance.
        java.util.Collection<EAContainer> eaContainersCopy = new ArrayList<EAContainer>(eaContainers.size());

        eaContainersCopy.addAll(eaContainers);

        for (EAContainer eaContainer : eaContainersCopy)
        {
            eaContainer.dispose();
        }
    }
}
