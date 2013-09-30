/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import java.util.List;

import org.sparx.Collection;

public interface EARepositoryContainer extends EAContainer
{
    public void exit();

    public boolean openFile(String filename);

    public void closeFile();

    public List<EAPackageContainer> getModels();

    public int getEAObjectId(Object eaObject);

    public void disposeContainer(EAContainer eaContainer);

    public void disposeContainers();

    public <T extends EAContainer> List<T> getOrCreateEAObjectContainers(Collection<?> eaObjects, Class<T> type);

    public <T extends EAContainer> T getOrCreateEAObjectContainer(Object eaObject, Class<T> type);

    public <T extends EAContainer> T getOrCreateEAObjectContainerById(int id, Class<T> type, EAContainer container);
}
