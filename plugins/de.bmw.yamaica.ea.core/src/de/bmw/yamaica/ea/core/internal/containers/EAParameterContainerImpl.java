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
import org.sparx.Parameter;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EAParameterContainer;

public class EAParameterContainerImpl extends EAContainerImpl implements EAParameterContainer
{
    protected final Parameter eaParameter;

    protected EAParameterContainerImpl(EAInstance eaInstance, Parameter eaParameter)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaParameter));

        Assert.isNotNull(eaParameter);

        this.eaParameter = eaParameter;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaParameter;
    }

    @Override
    public String getName()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetName();
            }
        });
    }

    @Override
    public String getNotes()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetNotes();
            }
        });
    }

    @Override
    public boolean update()
    {
        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.Update();
            }
        });
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EAContainerWithStereotypes //

    @Override
    public List<String> getStereotypes()
    {
        String stereotype = (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetStereotypeEx();
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
        int parentId = (Integer) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetOperationID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(parentId, EAMethodContainer.class, this);
    }

    @Override
    public EAElementContainer getElement()
    {
        EAMethodContainer method = (EAMethodContainer) getParent();

        return (null != method) ? method.getElement() : null;
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
        return (Integer) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetPosition();
            }
        });
    }

    // END Implementation of interface EAContainerWithNamespace //

    // BEGIN Implementation of interface EAParameterContainer //

    @Override
    public String getKind()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetKind();
            }
        });
    }

    @Override
    public String getType()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetType();
            }
        });
    }

    @Override
    public EAElementContainer getTypeElement()
    {
        int typeElementId = (Integer) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return Integer.parseInt(eaParameter.GetClassifierID());
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(typeElementId, EAElementContainer.class, this);
    }

    @Override
    public String getDefault()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaParameter.GetDefault();
            }
        });
    }

    // END Implementation of interface EAParameterContainer //

    // The equals implementation of EAContainerImpl uses the ID of the EA object. Since parameters do not have an ID
    // we have to overwrite this method. Elsewhere every parameter would be equal any other parameter.
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof EAParameterContainer)
        {
            EAParameterContainer parameter = (EAParameterContainer) obj;

            // true if both parameters belong to the same method and have the same name
            if (parameter.getParent().equals(getParent()) && parameter.getName().equals(getName()))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 37;
        int hashCode = 1;
        hashCode = prime * hashCode + getParent().hashCode();
        hashCode = prime * hashCode + getName().hashCode();

        return hashCode;
    }
}
