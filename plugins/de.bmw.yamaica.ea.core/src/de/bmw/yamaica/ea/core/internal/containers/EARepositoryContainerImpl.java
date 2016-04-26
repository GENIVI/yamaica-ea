/* Copyright (C) 2013-2015 BMW Group
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
import org.sparx.Collection;
import org.sparx.CreateModelType;
import org.sparx.Package;
import org.sparx.Repository;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.EAObjectType;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.exceptions.UnsupportedOperationException;

public class EARepositoryContainerImpl extends EAContainerImpl implements EARepositoryContainer
{
    protected final Repository                eaRepository;
    protected final Map<Integer, EAContainer> allAttributes = new HashMap<Integer, EAContainer>();
    protected final Map<Integer, EAContainer> allConnectors = new HashMap<Integer, EAContainer>();
    protected final Map<Integer, EAContainer> allDiagrams   = new HashMap<Integer, EAContainer>();
    protected final Map<Integer, EAContainer> allElements   = new HashMap<Integer, EAContainer>();
    protected final Map<Integer, EAContainer> allMethods    = new HashMap<Integer, EAContainer>();
    protected final Map<Integer, EAContainer> allPackages   = new HashMap<Integer, EAContainer>();

    public EARepositoryContainerImpl(final EAInstance eaInstance, final Repository eaRepository)
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
    public void setName(final String name)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getNotes()
    {
        return "";
    }

    @Override
    public void setNotes(final String notes)
    {
        throw new UnsupportedOperationException();
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

    @Override
    public void delete()
    {
        dispose();
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EARepositoryContainer //

    @Override
    public void exit()
    {
        eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaRepository.Exit();

                return null;
            }
        });
    }

    @Override
    public boolean openFile(final String filename)
    {
        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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
            public Object run(final Object... arguments)
            {
                eaRepository.CloseFile();

                return null;
            }
        });
    }

    @Override
    public boolean createFile(final String filename)
    {
        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaRepository.CreateModel(CreateModelType.cmEAPFromBase, (String) arguments[0], 0);
            }
        }, filename);
    }

    @Override
    public List<EAPackageContainer> getModels()
    {
        @SuppressWarnings("unchecked")
        final Collection<Package> models = (Collection<Package>) getOrCreateCachedValue(CACHED_MODELS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaRepository.GetModels();
            }
        });

        return getOrCreateEAObjectContainers(models, EAPackageContainer.class);
    }

    @Override
    public EAPackageContainer createModel(final String name)
    {
        return (EAPackageContainer) clearCachedValue(CACHED_MODELS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Package> eaPackages = eaRepository.GetModels();
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
    public EAPackageContainer getOrCreateModel(final String name)
    {
        if (null == name)
        {
            return null;
        }

        for (final EAPackageContainer packageContainer : getModels())
        {
            if (name.equals(packageContainer.getName()))
            {
                return packageContainer;
            }
        }

        return createModel(name);
    }

    @Override
    public void deleteModel(final String name)
    {
        deleteModel(getEAObjectContainerByName(getModels(), name, EAPackageContainer.class));
    }

    @Override
    public void deleteModel(final EAPackageContainer package_)
    {
        clearCachedValue(CACHED_MODELS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaRepository.GetModels(), arguments[0]);

                return null;
            }
        }, package_.getEAObject());
    }

    @Override
    public void deleteAllModels()
    {
        clearCachedValue(CACHED_MODELS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaRepository.GetModels());

                return null;
            }
        });
    }

    @Override
    public int getEAObjectId(final Object eaObject)
    {
        return getEAObjectId(eaObject, EAObjectType.getEAObjectType(eaObject.getClass()));
    }

    @Override
    public void disposeContainer(final EAContainer container)
    {
        if (null == container)
        {
            return;
        }

        final EAObjectType eaObjectType = EAObjectType.getEAContainerType(container.getClass());
        final int eaObjectId = container.getEAObjectId();
        final Map<Integer, EAContainer> eaContainerMap = getEAContainerMap(eaObjectType);

        if (null != eaContainerMap)
        {
            eaContainerMap.remove(eaObjectId);
        }

        clearCachedValues(Arrays.<Object> asList(eaObjectId, eaObjectType));
    }

    @Override
    public void disposeContainers()
    {
        disposeEAContainers(allAttributes.values());
        disposeEAContainers(allConnectors.values());
        disposeEAContainers(allDiagrams.values());
        disposeEAContainers(allElements.values());
        disposeEAContainers(allMethods.values());
        disposeEAContainers(allPackages.values());
        clearCache();
    }

    @Override
    public void registerStereotypes(final String... stereotypes)
    {
        if (null == stereotypes)
        {
            return;
        }

        for (final String stereotype : stereotypes)
        {
            if (null != stereotype)
            {
                eaInstance.syncExecution(new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        eaRepository.GetStereotypes().AddNew((String) arguments[0], "");

                        return null;
                    }
                }, stereotype);
            }
        }
    }

    @Override
    public <T extends EAContainer> T getOrCreateEAObjectContainer(final Object eaObject, final Class<T> type)
    {
        if (null == eaObject || null == type)
        {
            return null;
        }

        final EAObjectType eaObjectType = EAObjectType.getEAObjectType(eaObject.getClass());
        final int eaObjectId = getEAObjectId(eaObject, eaObjectType);

        return getEAObjectContainer(eaObject, eaObjectId, type, eaObjectType, true);
    }

    @Override
    public <T extends EAContainer> T getEAObjectContainer(final Object eaObject, final Class<T> type)
    {
        if (null == eaObject || null == type)
        {
            return null;
        }

        final EAObjectType eaObjectType = EAObjectType.getEAObjectType(eaObject.getClass());
        final int eaObjectId = getEAObjectId(eaObject, eaObjectType);

        return getEAObjectContainer(eaObject, eaObjectId, type, eaObjectType, false);
    }

    @Override
    public <T extends EAContainer> T getOrCreateEAObjectContainerById(final int eaObjectId, final Class<T> type)
    {
        if (0 == eaObjectId || null == type)
        {
            return null;
        }

        final EAObjectType eaObjectType = EAObjectType.getEAContainerType(type);
        final Object eaObject = getEAObjectById(eaObjectId, eaObjectType);

        return getEAObjectContainer(eaObject, eaObjectId, type, eaObjectType, true);
    }

    // END Implementation of interface EARepositoryContainer //

    protected <T extends EAContainer> T getEAObjectContainer(final Object eaObject, final int eaObjectId, final Class<T> type,
            final EAObjectType eaObjectType, final boolean create)
    {
        final Map<Integer, EAContainer> eaContainerMap = getEAContainerMap(eaObjectType);

        if ((0 == eaObjectId || null == eaContainerMap) && (true == create))
        {
            return type.cast(createEAContainerInstance(eaObject, eaObjectType));
        }
        else if (eaContainerMap.containsKey(eaObjectId))
        {
            return type.cast(eaContainerMap.get(eaObjectId));
        }
        else if (true == create)
        {
            final EAContainer eaContainer = createEAContainerInstance(eaObject, eaObjectType);

            eaContainerMap.put(eaObjectId, eaContainer);

            return type.cast(eaContainer);
        }
        else
        {
            return null;
        }
    }

    protected Object getEAObjectById(final int id, final EAObjectType eaObjectType)
    {
        return getOrCreateCachedValue(Arrays.<Object> asList(id, eaObjectType), new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final int id = (Integer) arguments[0];

                switch ((EAObjectType) arguments[1])
                {
                    case ATTRIBUTE:
                        return eaRepository.GetAttributeByID(id);

                    case CONNECTOR:
                        return eaRepository.GetConnectorByID(id);

                    case DIAGRAM:
                        return eaRepository.GetDiagramByID(id);

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

    protected Map<Integer, EAContainer> getEAContainerMap(final EAObjectType eaObjectType)
    {
        switch (eaObjectType)
        {
            case ATTRIBUTE:
                return allAttributes;

            case CONNECTOR:
                return allConnectors;

            case DIAGRAM:
                return allDiagrams;

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

    protected boolean updateEAContainers(final java.util.Collection<EAContainer> eaContainers)
    {
        boolean success = true;

        for (final EAContainer eaContainer : eaContainers)
        {
            final boolean currentSuccess = eaContainer.update();

            success = currentSuccess && success;
        }

        return success;
    }

    protected void disposeEAContainers(final java.util.Collection<EAContainer> eaContainers)
    {
        // Copy collection (which comes from the maps above) since the dispose call will
        // touch the map instance.
        final java.util.Collection<EAContainer> eaContainersCopy = new ArrayList<EAContainer>(eaContainers.size());

        eaContainersCopy.addAll(eaContainers);

        for (final EAContainer eaContainer : eaContainersCopy)
        {
            eaContainer.dispose();
        }
    }
}
