/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.EAObjectType;

public interface EAContainer
{
    public EAInstance getEAInstance();

    public EARepositoryContainer getRepository();

    public String getName();

    public void setName(String name);

    public String getNotes();

    public void setNotes(String notes);

    public Object getEAObject();

    public EAObjectType getEAObjectType();

    public int getEAObjectId();

    public boolean update();

    public void delete();

    public void dispose();

    public boolean isDisposed();

    public void clearCache();

    public void clearCachedValues(final Object... keys);
}
