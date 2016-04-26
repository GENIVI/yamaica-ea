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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.sparx.Attribute;
import org.sparx.AttributeTag;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.ConnectorTag;
import org.sparx.Diagram;
import org.sparx.DiagramObject;
import org.sparx.Element;
import org.sparx.Method;
import org.sparx.MethodTag;
import org.sparx.Package;
import org.sparx.Parameter;
import org.sparx.Repository;
import org.sparx.TaggedValue;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.EAObjectType;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.ParentElementNotFoundException;
import de.bmw.yamaica.ea.core.exceptions.ReferencedElementNotFoundException;
import de.bmw.yamaica.franca.common.core.FrancaUtils;

public abstract class EAContainerImpl implements EAContainer
{
    public final int                      CACHED_NAME                   = 1;
    public final int                      CACHED_NOTES                  = 2;
    public final int                      CACHED_PARENT_ID              = 3;
    public final int                      CACHED_STEREOTYPE             = 4;
    public final int                      CACHED_POSITION               = 5;
    public final int                      CACHED_KIND                   = 6;
    public final int                      CACHED_TYPE                   = 7;
    public final int                      CACHED_TYPE_ELEMENT_ID        = 8;
    public final int                      CACHED_DEFAULT                = 9;
    public final int                      CACHED_ELEMENT                = 10;
    public final int                      CACHED_VERSION                = 11;
    public final int                      CACHED_FLAGS                  = 12;
    public final int                      CACHED_IS_MODEL               = 13;
    public final int                      CACHED_IS_NAMESPACE_ROOT      = 14;
    public final int                      CACHED_PACKAGES               = 15;
    public final int                      CACHED_ELEMENTS               = 16;
    public final int                      CACHED_CONNECTORS             = 17;
    public final int                      CACHED_PACKAGE_ID             = 18;
    public final int                      CACHED_TAGGED_VALUES          = 19;
    public final int                      CACHED_AUTHOR                 = 20;
    public final int                      CACHED_GEN_LINKS              = 21;
    public final int                      CACHED_ATTRIBUTES             = 22;
    public final int                      CACHED_METHODS                = 23;
    public final int                      CACHED_BASE_CLASSES           = 24;
    public final int                      CACHED_IS_COLLECTION          = 25;
    public final int                      CACHED_TYPE_STRING            = 26;
    public final int                      CACHED_SUB_TYPE_STRING        = 27;
    public final int                      CACHED_CLIENT_ID              = 28;
    public final int                      CACHED_SUPPLIER_ID            = 29;
    public final int                      CACHED_DIRECTION              = 30;
    public final int                      CACHED_RETURN_TYPE            = 31;
    public final int                      CACHED_RETURN_TYPE_ELEMENT_ID = 32;
    public final int                      CACHED_IS_RETURN_TYPE_ARRAY   = 33;
    public final int                      CACHED_PARAMETERS             = 34;
    public final int                      CACHED_VALUE                  = 35;
    public final int                      CACHED_ELEMENT_ID             = 36;
    public final int                      CACHED_METHOD_ID              = 37;
    public final int                      CACHED_ATTRIBUTE_ID           = 38;
    public final int                      CACHED_CONNECTOR_ID           = 39;
    public final int                      CACHED_MODELS                 = 40;
    public final int                      CACHED_DIAGRAMS               = 41;
    public final int                      CACHED_DIAGRAM_OBJECTS        = 42;
    public final int                      CACHED_DIAGRAM_ID             = 43;
    public final int                      CACHED_CLASSIFIER             = 44;

    protected static final String         REFERENCE_ERROR_MESSAGE       = "An Enterprise Architect error occurred (\"%s\") while "
                                                                                + "accessing the %s \"%s\". This is probably due the "
                                                                                + "fact that the database of Enterprise Architect is "
                                                                                + "inconsistent. A possible solution is to reset all "
                                                                                + " references to other UML elements of this element.";

    protected static final String         PARENT_ERROR_MESSAGE          = "An Enterprise Architect error occurred (\"%s\") while "
                                                                                + "accessing the %s \"%s\". This is probably due the "
                                                                                + "fact that the element was deleted. A possible solution "
                                                                                + "is to reload the Enterprise Architect project.";

    protected final EAInstance            eaInstance;
    protected final int                   eaObjectId;
    protected final EARepositoryContainer eaRepository;
    protected final Map<Object, Object>   cache                         = new HashMap<Object, Object>(100);
    protected boolean                     isDisposed                    = false;

    protected EAContainerImpl(final EAInstance eaInstance, final int eaObjectId)
    {
        Assert.isNotNull(eaInstance);
        Assert.isNotNull(eaObjectId);

        this.eaInstance = eaInstance;
        this.eaObjectId = eaObjectId;
        this.eaRepository = (this instanceof EARepositoryContainer) ? (EARepositoryContainer) this : eaInstance.getRepository();
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public EAInstance getEAInstance()
    {
        return eaInstance;
    }

    @Override
    public EARepositoryContainer getRepository()
    {
        return eaRepository;
    }

    @Override
    public EAObjectType getEAObjectType()
    {
        return EAObjectType.getEAContainerType(this.getClass());
    }

    @Override
    public int getEAObjectId()
    {
        return eaObjectId;
    }

    @Override
    public void dispose()
    {
        clearCache();
        isDisposed = true;

        if (null != eaRepository)
        {
            eaRepository.disposeContainer(this);
        }
    }

    @Override
    public boolean isDisposed()
    {
        return isDisposed;
    }

    // END Implementation of interface EAContainer //

    @Override
    public boolean equals(final Object obj)
    {
        if (obj instanceof EAContainer)
        {
            final EAContainer eaContainer = (EAContainer) obj;

            return getEAObjectId() == eaContainer.getEAObjectId() && getEAObjectType().equals(eaContainer.getEAObjectType());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + getEAObjectId();
        hashCode = prime * hashCode + getEAObjectType().hashCode();

        return hashCode;
    }

    @Override
    public String toString()
    {
        String name = getName();

        name = (null == name) ? "" : " " + name;

        return getEAObjectType().getName() + name;
    }

    protected boolean hasStereotype(final String stereotype, final List<String> allStereotypes)
    {
        for (final String singleStereotype : allStereotypes)
        {
            if (singleStereotype.trim().equalsIgnoreCase(stereotype.trim()))
            {
                return true;
            }
        }

        return false;
    }

    protected List<String> getStereotypes(final String stereotypes)
    {
        final List<String> list = new ArrayList<String>();

        for (final String stereotype : stereotypes.split(","))
        {
            if (stereotype.length() > 0)
            {
                list.add(stereotype);
            }
        }

        return list;
    }

    protected String getStereotypeEx(final String... stereotypes)
    {
        if (null == stereotypes || stereotypes.length == 0)
        {
            return "";
        }

        String stereotypeEx = "";

        for (String stereotype : stereotypes)
        {
            if (null != stereotype)
            {
                stereotypeEx += "," + stereotype;
            }
        }

        if (stereotypeEx.startsWith(","))
        {
            stereotypeEx = stereotypeEx.replaceFirst(",", "");
        }

        return stereotypeEx;
    }

    protected EATagContainer getTaggedValueByName(final String name, final List<EATagContainer> allTaggedValues)
    {
        for (final EATagContainer taggedValue : allTaggedValues)
        {
            if (taggedValue.getName().equals(name))
            {
                return taggedValue;
            }
        }

        return null;
    }

    protected IPath getNamespaceAsPath(final EAContainerWithNamespace parent)
    {
        final String name = getName();

        return (null == parent) ? new Path(name) : parent.getNamespaceAsPath().append(name);
    }

    protected String getNamespace(final EAContainerWithNamespace parent)
    {
        return FrancaUtils.path2NamespaceString(getNamespaceAsPath(parent).toString());
    }

    protected List<EAConnectorContainer> getFilteredEAConnectors(final List<EAConnectorContainer> connectorContainers,
            final EAConnectorContainer.Type... types)
    {
        final List<EAConnectorContainer> list = new ArrayList<EAConnectorContainer>(connectorContainers.size());

        for (final EAConnectorContainer connector : connectorContainers)
        {
            for (final EAConnectorContainer.Type type : types)
            {
                if (connector.getType().equals(type))
                {
                    list.add(connector);

                    break;
                }
            }
        }

        return list;
    }

    protected void deleteEAObjects(final Collection<?> eaObjects)
    {
        for (short i = (short) (eaObjects.GetCount() - 1); i >= 0; i--)
        {
            final EAContainer eaContainer = getRepository().getEAObjectContainer(eaObjects.GetAt(i), EAContainer.class);

            if (null != eaContainer)
            {
                eaContainer.dispose();
            }

            eaObjects.Delete(i);
        }

        eaObjects.Refresh();
    }

    protected void deleteEAObject(final Collection<?> eaObjects, final Object eaObject)
    {
        final EAObjectType eaObjectType = EAObjectType.getEAObjectType(eaObject.getClass());
        final int eaObjectId = getEAObjectId(eaObject, eaObjectType);

        for (short i = 0; i < eaObjects.GetCount(); i++)
        {
            final Object eaObjectOfCollection = eaObjects.GetAt(i);
            final EAObjectType eaObjectTypeOfCollection = EAObjectType.getEAObjectType(eaObjectOfCollection.getClass());
            final int eaObjectIdOfCollection = getEAObjectId(eaObjectOfCollection, eaObjectTypeOfCollection);

            if ((eaObjectType == eaObjectTypeOfCollection) && (eaObjectId == eaObjectIdOfCollection))
            {
                final EAContainer eaContainer = getRepository().getEAObjectContainer(eaObject, EAContainer.class);

                if (null != eaContainer)
                {
                    eaContainer.dispose();
                }

                eaObjects.Delete(i);

                break;
            }
        }

        eaObjects.Refresh();
    }

    protected <T extends EAContainer> T getEAObjectContainerByName(final List<T> eaObjectContainers, final String name, final Class<T> type)
    {
        if (null == name)
        {
            return null;
        }

        for (EAContainer eaContainer : eaObjectContainers)
        {
            if (name.equals(eaContainer.getName()))
            {
                return type.cast(eaContainer);
            }
        }

        return null;
    }

    public <T extends EAContainer> List<T> getOrCreateEAObjectContainers(final Collection<?> eaObjects, final Class<T> type)
    {
        // It is not possible to access a org.sparx.Collection outside of the EAInstance thread.
        // Thus we copy the collection into a java.util.List.
        @SuppressWarnings("unchecked")
        final List<T> eaObjectList = (List<T>) getOrCreateCachedValue(Arrays.<Object> asList(eaObjects, type), new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<?> eaObjects = (Collection<?>) arguments[0];
                final Class<T> type = (Class<T>) arguments[1];
                final List<T> list = new ArrayList<T>(eaObjects.GetCount());

                for (final Object eaObject : eaObjects)
                {
                    list.add(getRepository().getOrCreateEAObjectContainer(eaObject, type));
                }

                return list;
            }
        }, eaObjects, type);

        return eaObjectList;
    }

    @Override
    public void clearCache()
    {
        cache.clear();
    }

    protected Object clearCachedValue(final Object key, final IRunnableWithArguments runnable, final Object... arguments)
    {
        return clearCachedValue(key, null, runnable, arguments);
    }

    protected Object clearCachedValue(final Object key1, final Object key2, final IRunnableWithArguments runnable,
            final Object... arguments)
    {
        final Object value = eaInstance.syncExecution(runnable, arguments);

        cache.remove(key1);
        cache.remove(key2);

        return value;
    }

    @Override
    public void clearCachedValues(final Object... keys)
    {
        for (final Object key : keys)
        {
            cache.remove(key);
        }
    }

    protected Object getOrCreateCachedValue(final Object key, final IRunnableWithArguments runnable, final Object... arguments)
    {
        if (cache.containsKey(key))
        {
            return cache.get(key);
        }
        else
        {
            final Object value = eaInstance.syncExecution(runnable, arguments);

            cache.put(key, value);

            return value;
        }
    }

    protected ReferencedElementNotFoundException createReferencedElementNotFoundException(final Throwable throwable,
            final EAContainer container)
    {
        final Throwable cause = getCause(throwable);
        final String message = getErrorMessage(REFERENCE_ERROR_MESSAGE, cause, container, true);

        return new ReferencedElementNotFoundException(message, cause);
    }

    protected ParentElementNotFoundException createParentElementNotFoundException(final Throwable throwable, final EAContainer container)
    {
        final Throwable cause = getCause(throwable);
        final String message = getErrorMessage(PARENT_ERROR_MESSAGE, cause, container, false);

        return new ParentElementNotFoundException(message, cause);
    }

    private String getErrorMessage(final String messageTemplate, final Throwable throwable, final EAContainer container,
            final boolean fullyQualifiedName)
    {
        final String elementType = container.getEAObjectType().getName().toLowerCase();
        final String elementName = getContainerName(container, fullyQualifiedName);

        return String.format(messageTemplate, throwable.getMessage(), elementType, elementName);
    }

    private String getContainerName(final EAContainer container, final boolean fullyQualifiedName)
    {
        if (container instanceof EAContainerWithNamespace && true == fullyQualifiedName)
        {
            return ((EAContainerWithNamespace) container).getNamespace();
        }
        else
        {
            return container.getName();
        }
    }

    private Throwable getCause(final Throwable throwable)
    {
        final Throwable cause = throwable.getCause();

        return (null != cause) ? cause : throwable;
    }

    protected int getEAObjectId(final Object eaObject, final EAObjectType eaObjectType)
    {
        return (Integer) getOrCreateCachedValue(Arrays.<Object> asList(eaObject, eaObjectType), new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
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

                    case DIAGRAM:
                        return ((Diagram) arguments[0]).GetDiagramID();

                    case DIAGRAM_OBJECT:
                        return ((DiagramObject) arguments[0]).GetDiagramID();

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

    protected EAContainer createEAContainerInstance(final Object eaObject, final EAObjectType eaObjectType)
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

            case DIAGRAM:
                return new EADiagramContainerImpl(eaInstance, (Diagram) eaObject);

            case DIAGRAM_OBJECT:
                return new EADiagramObjectContainerImpl(eaInstance, (DiagramObject) eaObject);

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
}
