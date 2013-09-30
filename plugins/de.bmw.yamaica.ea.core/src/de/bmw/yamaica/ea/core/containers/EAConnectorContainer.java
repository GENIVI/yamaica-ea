/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

public interface EAConnectorContainer extends EAContainerWithTaggedValues
{
    public final int UNKNOWN        = 0x1;
    public final int ASSOCIATION    = 0x2;
    public final int AGGREGATION    = 0x4;
    public final int COMPOSITION    = 0x8;
    public final int GENERALIZATION = 0x10;
    public final int PACKAGE        = 0x20;
    public final int ALL_TYPES      = 0xFFFFFFFF;

    public int getType();

    public EAElementContainer getSupplier();

    public EAElementContainer getClient();

    public EAElementContainer getOpposite(EAElementContainer reference);

    public boolean isNavigable(EAElementContainer destination);

    public boolean isDirected();
}
