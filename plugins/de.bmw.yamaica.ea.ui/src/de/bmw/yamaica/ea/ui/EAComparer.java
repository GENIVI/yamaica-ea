/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.containers.EAContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;

public class EAComparer extends ViewerComparator
{
    public EAComparer()
    {

    }

    @Override
    public int compare(Viewer viewer, Object e1, Object e2)
    {
        if (!(e1 instanceof EAContainer) || !(e2 instanceof EAContainer))
        {
            return 0;
        }

        EAInstance eaInstance = ((EAContainer) e1).getEAInstance();

        if (!eaInstance.equals(((EAContainer) e2).getEAInstance()))
        {
            return 0;
        }

        return ((EAPackageContainer) e1).getPosition() - ((EAPackageContainer) e2).getPosition();
    }
}
