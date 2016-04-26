/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import java.util.List;

public interface EAContainerWithTaggedValues extends EAContainerWithStereotypes
{
    public List<EATagContainer> getTaggedValues();

    public EATagContainer createTaggedValue(String name);

    public EATagContainer getOrCreateTaggedValue(String name);

    public EATagContainer getTaggedValueByName(String name);

    public void deleteTaggedValue(String name);

    public void deleteTaggedValue(EATagContainer taggedValue);

    public void deleteAllTaggedValues();
}
