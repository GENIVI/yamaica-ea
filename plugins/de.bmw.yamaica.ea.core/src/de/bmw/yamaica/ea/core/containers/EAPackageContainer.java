/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import java.util.List;
import java.util.Map;

public interface EAPackageContainer extends EAContainerWithElements
{
    public String getFlags();

    public void setFlags(String flags);

    public boolean isModel();

    public boolean isNamespaceRoot();

    public void setIsNamespaceRoot(boolean isNamespaceRoot);

    public List<EAPackageContainer> getPackages();

    public EAPackageContainer createPackage(String name);

    public EAPackageContainer getOrCreatePackage(String name);

    public void deletePackage(String name);

    public void deletePackage(EAPackageContainer package_);

    public void deleteAllPackages();

    public List<EAPackageContainer> getImportedPackages();

    // GLIPCI-36 related: Each interface may manage any number of interfaces (managed services).
    public Map<EAElementContainer, List<EAElementContainer>> getManagedServices();
}
