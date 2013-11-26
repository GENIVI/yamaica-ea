/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAContainerWithTaggedValues;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EATagContainer;
import de.bmw.yamaica.franca.common.core.FrancaUtils;

public class EAContainerExtensions
{
    public static String getFidlName(EAContainer container)
    {
        if (container instanceof EAContainerWithTaggedValues)
        {
            EATagContainer taggedValue = ((EAContainerWithTaggedValues) container)
                    .getTaggedValueByName(EAFrancaConstants.TAGGED_VALUE_NAME);

            String virtualName = (null != taggedValue) ? taggedValue.getValue() : null;

            return (null != virtualName && virtualName.length() > 0) ? virtualName : container.getName();
        }
        else
        {
            return container.getName();
        }
    }

    public static IPath getFidlNamespaceAsPath(EAContainerWithNamespace container)
    {
        IPath virtualNamespaceAsPath = null;
        String virtualNamespacePrefix = getNamespacePrefix(container);

        if (isNamespaceRoot(container))
        {
            if (null != virtualNamespacePrefix)
            {
                virtualNamespaceAsPath = new Path(virtualNamespacePrefix).append(getFidlName(container));
            }
            else
            {
                virtualNamespaceAsPath = new Path(getFidlName(container));
            }
        }
        else
        {
            if (null != virtualNamespacePrefix)
            {
                virtualNamespaceAsPath = getFidlNamespaceAsPath(container.getParent()).append(virtualNamespacePrefix).append(
                        getFidlName(container));
            }
            else
            {
                virtualNamespaceAsPath = getFidlNamespaceAsPath(container.getParent()).append(getFidlName(container));
            }
        }

        return virtualNamespaceAsPath;
    }

    public static String getFidlNamespace(EAContainerWithNamespace container)
    {
        IPath fidlNamespaceAsPath = getFidlNamespaceAsPath(container);

        return (null != fidlNamespaceAsPath) ? FrancaUtils.path2NamespaceString(fidlNamespaceAsPath.toString()) : null;
    }

    private static boolean isNamespaceRoot(EAContainerWithNamespace container)
    {
        if (container instanceof EAPackageContainer)
        {
            EAPackageContainer p = (EAPackageContainer) container;

            if (p.hasStereotype(EAFrancaConstants.STEREOTYPE_ROOT) || p.isNamespaceRoot() || p.getParent() == null)
            {
                return true;
            }
        }

        return false;
    }

    private static String getNamespacePrefix(EAContainerWithNamespace container)
    {
        if (container instanceof EAPackageContainer)
        {
            EAPackageContainer p = (EAPackageContainer) container;
            EATagContainer taggedValue = p.getTaggedValueByName(EAFrancaConstants.TAGGED_VALUE_NAMESPACE_PREFIX);

            return (null != taggedValue) ? taggedValue.getValue().replace('.', Path.SEPARATOR) : null;
        }
        else
        {
            return null;
        }
    }

    public static EAPackageContainer getFidlPackage(EAContainerWithNamespace container)
    {
        if (container instanceof EAPackageContainer)
        {
            if (container.hasStereotype(EAFrancaConstants.STEREOTYPE_NO_FIDL))
            {
                return null;
            }
            else if (container.hasStereotype(EAFrancaConstants.STEREOTYPE_FIDL))
            {
                return (EAPackageContainer) container;
            }
            else
            {
                EAContainerWithNamespace parent = container.getParent();

                return (null != parent) ? getFidlPackage(parent) : null;
            }
        }
        else
        {
            if (null == container)
            {
                return null;
            }
            else
            {
                return getFidlPackage(container.getPackage());
            }
        }
    }
}
