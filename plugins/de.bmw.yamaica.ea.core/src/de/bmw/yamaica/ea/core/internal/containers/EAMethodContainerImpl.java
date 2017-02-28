/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.sparx.AttributeTag;
import org.sparx.Collection;
import org.sparx.Method;
import org.sparx.MethodTag;
import org.sparx.Parameter;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodTagContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EAParameterContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.exceptions.ParentElementNotFoundException;
import de.bmw.yamaica.ea.core.exceptions.ReferencedElementNotFoundException;

public class EAMethodContainerImpl extends EAContainerImpl implements EAMethodContainer
{
    private static final Logger LOGGER = Logger.getLogger(EAMethodContainerImpl.class.getName());

    protected final Method eaMethod;

    protected EAMethodContainerImpl(final EAInstance eaInstance, final Method eaMethod)
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
            public Object run(final Object... arguments)
            {
                return eaMethod.GetName();
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
                eaMethod.SetName((String) arguments[0]);
                eaMethod.Update();

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
                return eaMethod.GetNotes();
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
                eaMethod.SetNotes((String) arguments[0]);
                eaMethod.Update();

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
                return eaMethod.Update();
            }
        });
    }

    @Override
    public void delete()
    {
        final EAContainerWithNamespace parent = getParent();

        if (parent instanceof EAElementContainer)
        {
            ((EAElementContainer) parent).deleteMethod(this);
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
                return eaMethod.GetStereotypeEx();
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
                eaMethod.SetStereotypeEx((String) arguments[0]);
                eaMethod.Update();

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
                return eaMethod.GetParentID();
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(parentId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            final ParentElementNotFoundException parentElementNotFoundException = createParentElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, parentElementNotFoundException.getMessage());
            throw parentElementNotFoundException;
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
                return eaMethod.GetPos();
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
                eaMethod.SetPos((Integer) arguments[0]);
                eaMethod.Update();

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
                        return eaMethod.GetTaggedValues();
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
                final Collection<MethodTag> eaMethodTags = eaMethod.GetTaggedValues();
                final MethodTag newEAMethodTag = eaMethodTags.AddNew((String) arguments[0], "");

                if (!newEAMethodTag.Update())
                {
                    return null;
                }

                eaMethodTags.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAMethodTag, EAMethodTagContainer.class);
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
                deleteEAObject(eaMethod.GetTaggedValues(), arguments[0]);

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
                deleteEAObjects(eaMethod.GetTaggedValues());

                return null;
            }
        });
    }

    // END Implementation of interface EAContainerWithTaggedValues //

    // BEGIN Implementation of interface EAMethodContainer //

    @Override
    public String getReturnType()
    {
        return (String) getOrCreateCachedValue(CACHED_RETURN_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaMethod.GetReturnType();
            }
        });
    }

    @Override
    public void setReturnType(final String returnType)
    {
        clearCachedValue(CACHED_RETURN_TYPE, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaMethod.SetReturnType((String) arguments[0]);
                eaMethod.Update();

                return null;
            }
        }, getStereotypeEx(returnType));
    }

    @Override
    public EAElementContainer getReturnTypeElement()
    {
        final int returnTypeElementId = (Integer) getOrCreateCachedValue(CACHED_RETURN_TYPE_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                try
                {
                    return Integer.parseInt(eaMethod.GetClassifierID());
                }
                catch (NumberFormatException e)
                {
                    return 0;
                }
            }
        });

        try
        {
            return getRepository().getOrCreateEAObjectContainerById(returnTypeElementId, EAElementContainer.class);
        }
        catch (EAException e)
        {
            final ReferencedElementNotFoundException referencedElementNotFoundException = createReferencedElementNotFoundException(e, this);
            LOGGER.log(Level.SEVERE, referencedElementNotFoundException.getMessage());
            throw referencedElementNotFoundException;
        }
    }

    @Override
    public void setReturnTypeElement(final EAElementContainer returnTypeElement)
    {
        clearCachedValue(CACHED_RETURN_TYPE_ELEMENT_ID, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaMethod.SetClassifierID((String) arguments[0]);
                eaMethod.Update();

                return null;
            }
        }, new Integer(returnTypeElement.getEAObjectId()).toString());
    }

    @Override
    public boolean isReturnTypeArray()
    {
        return (Boolean) getOrCreateCachedValue(CACHED_IS_RETURN_TYPE_ARRAY, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                return eaMethod.GetReturnIsArray();
            }
        });
    }

    @Override
    public void setIsReturnTypeArray(final boolean isReturnTypeArray)
    {
        clearCachedValue(CACHED_IS_RETURN_TYPE_ARRAY, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                eaMethod.SetReturnIsArray((Boolean) arguments[0]);
                eaMethod.Update();

                return null;
            }
        }, isReturnTypeArray);
    }

    @Override
    public List<EAParameterContainer> getParameters()
    {
        @SuppressWarnings("unchecked")
        final Collection<Parameter> parameters = (Collection<Parameter>) getOrCreateCachedValue(CACHED_PARAMETERS,
                new IRunnableWithArguments()
                {
                    @Override
                    public Object run(final Object... arguments)
                    {
                        return eaMethod.GetParameters();
                    }
                });

        return getOrCreateEAObjectContainers(parameters, EAParameterContainer.class);
    }

    @Override
    public EAParameterContainer createParameter(final String name)
    {
        return (EAParameterContainer) clearCachedValue(CACHED_PARAMETERS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                final Collection<Parameter> eaParameters = eaMethod.GetParameters();
                final Parameter newEAParameter = eaParameters.AddNew((String) arguments[0], "");
                newEAParameter.SetPosition(eaParameters.GetCount() - 1);

                // Workaround! If the stereotype is not set to an empty string here, it won't
                // be possible to set it later on.
                newEAParameter.SetStereotypeEx("");

                if (!newEAParameter.Update())
                {
                    return null;
                }

                eaParameters.Refresh();

                return getRepository().getOrCreateEAObjectContainer(newEAParameter, EAParameterContainer.class);
            }
        }, name);
    }

    @Override
    public EAParameterContainer getOrCreateParameter(final String name)
    {
        if (null == name)
        {
            return null;
        }

        for (final EAParameterContainer parameterContainer : getParameters())
        {
            if (name.equals(parameterContainer.getName()))
            {
                return parameterContainer;
            }
        }

        return createParameter(name);
    }

    @Override
    public void deleteParameter(final String name)
    {
        deleteParameter(getEAObjectContainerByName(getParameters(), name, EAParameterContainer.class));
    }

    @Override
    public void deleteParameter(final EAParameterContainer parameter)
    {
        clearCachedValue(CACHED_PARAMETERS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObject(eaMethod.GetParameters(), arguments[0]);

                return null;
            }
        }, parameter.getEAObject());
    }

    @Override
    public void deleteAllParameters()
    {
        clearCachedValue(CACHED_PARAMETERS, new IRunnableWithArguments()
        {
            @Override
            public Object run(final Object... arguments)
            {
                deleteEAObjects(eaMethod.GetParameters());

                return null;
            }
        });
    }

    // END Implementation of interface EAMethodContainer //
}
