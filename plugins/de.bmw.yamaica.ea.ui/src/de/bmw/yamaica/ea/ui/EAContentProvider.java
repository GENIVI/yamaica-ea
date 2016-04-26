/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;

public class EAContentProvider implements ITreeContentProvider
{
    public EAContentProvider()
    {

    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
    {

    }

    @Override
    public Object[] getElements(Object inputElement)
    {
        if (inputElement instanceof EARepositoryContainer)
        {
            List<EAPackageContainer> models = ((EARepositoryContainer) inputElement).getModels();

            return models.toArray(new EAPackageContainer[models.size()]);
        }
        else if (inputElement instanceof EAPackageContainer)
        {
            List<EAPackageContainer> packages = ((EAPackageContainer) inputElement).getPackages();

            return packages.toArray(new EAPackageContainer[packages.size()]);
        }
        else
        {
            return new Object[0];
        }
    }

    @Override
    public Object[] getChildren(Object parentElement)
    {
        if (parentElement instanceof EARepositoryContainer)
        {
            List<EAPackageContainer> models = ((EARepositoryContainer) parentElement).getModels();

            return models.toArray(new EAPackageContainer[models.size()]);
        }
        else if (parentElement instanceof EAPackageContainer)
        {
            List<EAPackageContainer> packages = ((EAPackageContainer) parentElement).getPackages();

            return packages.toArray(new EAPackageContainer[packages.size()]);
        }
        else
        {
            return new Object[0];
        }
    }

    @Override
    public Object getParent(Object element)
    {
        if (!(element instanceof EAContainerWithNamespace))
        {
            return null;
        }

        EAContainerWithNamespace container = (EAContainerWithNamespace) element;
        EAContainerWithNamespace parent = container.getParent();

        return (null != parent) ? parent : container.getRepository();
    }

    @Override
    public boolean hasChildren(Object element)
    {
        if (element instanceof EAPackageContainer)
        {
            EAPackageContainer p = ((EAPackageContainer) element);
            return !p.getPackages().isEmpty();
        }
        return false;
    }

    @Override
    public void dispose()
    {

    }
}
