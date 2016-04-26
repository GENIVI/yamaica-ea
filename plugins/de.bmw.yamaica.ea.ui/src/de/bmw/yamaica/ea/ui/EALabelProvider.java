/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui;

import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Image;

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.ui.internal.Activator;

public class EALabelProvider extends ColumnLabelProvider
{
    public EALabelProvider()
    {

    }

    @Override
    public Image getImage(Object element)
    {
        if (!(element instanceof EAContainerWithNamespace))
        {
            return null;
        }

        ImageRegistry imageRegistry = Activator.getDefault().getImageRegistry();
        EAPackageContainer p = (EAPackageContainer) element;

        if (p.isModel())
        {
            return imageRegistry.get("MODEL_PACKAGE");
        }
        else
        {
            Image image;
            Flags flags = new Flags(p.getFlags());

            if (flags.isModel())
            {
                String iconName;

                switch (flags.getPackageType())
                {
                    case Flags.SIMPLE:
                        iconName = "SIMPLE_PACKAGE";
                        break;

                    case Flags.USE_CASE:
                        iconName = "USE_CASE_PACKAGE";
                        break;

                    case Flags.DYNAMIC:
                        iconName = "DYNAMIC_PACKAGE";
                        break;

                    case Flags.CLASS_VIEW:
                        iconName = "CLASS_VIEW_PACKAGE";
                        break;

                    case Flags.COMPONENT:
                        iconName = "COMPONENT_PACKAGE";
                        break;

                    case Flags.DEPLOYMENT:
                        iconName = "DEPLOYMENT_PACKAGE";
                        break;

                    default:
                        iconName = "PACKAGE";
                        break;
                }

                image = imageRegistry.get(iconName);
            }
            else
            {
                image = imageRegistry.get("PACKAGE");
            }

            if (p.isNamespaceRoot())
            {
                ImageDescriptor imageDescriptor = imageRegistry.getDescriptor("NS_ROOT_OVERLAY");

                image = new DecorationOverlayIcon(image, imageDescriptor, IDecoration.BOTTOM_RIGHT).createImage();
            }

            return image;
        }
    }

    @Override
    public String getText(Object element)
    {
        if (!(element instanceof EAPackageContainer))
        {
            return null;
        }

        EAPackageContainer p = (EAPackageContainer) element;

        // System.out.println(p.GetName() + " - Stereotype " + p.GetStereotypeEx() + " Flags=" + p.GetFlags() + " Notes="
        // + p.GetNotes() + " XMLPath=" + p.GetXMLPath() + " Owner=" + p.GetOwner() + " type=" + p.GetObjectType().toString()
        // + " isModel=" + p.GetIsModel() + " isNS=" + p.GetIsNamespace());

        List<String> stereotypes = p.getStereotypes();
        String joinedStereotype = "";

        for (String stereotype : stereotypes)
        {
            joinedStereotype += ", " + stereotype;
        }

        joinedStereotype = (joinedStereotype.length() > 0) ? "«" + joinedStereotype.substring(2) + "» " : joinedStereotype;

        return joinedStereotype + p.getName();
    }

    public class Flags
    {
        public static final int           SIMPLE     = 0;
        public static final int           USE_CASE   = 1;
        public static final int           DYNAMIC    = 2;
        public static final int           CLASS_VIEW = 3;
        public static final int           COMPONENT  = 4;
        public static final int           DEPLOYMENT = 5;

        protected HashMap<String, String> flags      = new HashMap<String, String>();

        public Flags(String flagString)
        {
            String[] keyValuePairs = flagString.split(";");

            for (String keyValuePair : keyValuePairs)
            {
                String[] keyValuePairArray = keyValuePair.split("=");

                if (keyValuePairArray.length > 1)
                {
                    flags.put(keyValuePairArray[0], keyValuePairArray[1]);
                }
            }
        }

        public boolean isModel()
        {
            String value = flags.get(EAConstants.FLAG_IS_MODEL);

            if (null != value && value.equals("1"))
            {
                return true;
            }

            return false;
        }

        public int getPackageType()
        {
            String value = flags.get(EAConstants.FLAG_VICON);

            if (null != value)
            {
                return new Integer(value);
            }

            return SIMPLE;
        }
    }
}
