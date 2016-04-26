/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import java.util.List;

public interface EARepositoryContainer extends EAContainer
{
    public void exit();

    public boolean openFile(String filename);

    public void closeFile();

    public boolean createFile(String filename);

    public List<EAPackageContainer> getModels();

    public EAPackageContainer createModel(String name);

    public EAPackageContainer getOrCreateModel(String name);

    public void deleteModel(String name);

    public void deleteModel(EAPackageContainer package_);

    public void deleteAllModels();

    public int getEAObjectId(Object eaObject);

    public void disposeContainer(EAContainer container);

    public void disposeContainers();

    public void registerStereotypes(String... stereotypes);

    public <T extends EAContainer> T getOrCreateEAObjectContainer(Object eaObject, Class<T> type);

    public <T extends EAContainer> T getEAObjectContainer(Object eaObject, Class<T> type);

    public <T extends EAContainer> T getOrCreateEAObjectContainerById(int id, Class<T> type);
}
