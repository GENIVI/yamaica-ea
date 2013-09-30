/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import org.eclipse.core.runtime.IPath;

public interface EAContainerWithNamespace extends EAContainerWithStereotypes
{
    public EAContainerWithNamespace getParent();

    public EAElementContainer getElement();

    public EAPackageContainer getPackage();

    public IPath getNamespaceAsPath();

    public String getNamespace();

    public int getPosition();
}
