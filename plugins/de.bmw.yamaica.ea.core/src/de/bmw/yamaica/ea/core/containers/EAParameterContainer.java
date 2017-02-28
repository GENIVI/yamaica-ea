/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.YamaicaEAConstants;

public interface EAParameterContainer extends EAContainerWithNamespace
{
    public enum Kind
    {
        IN(EAConstants.PARAMETER_DIRECTION_IN, 0x1),
        OUT(EAConstants.PARAMETER_DIRECTION_OUT, 0x2),
        UNKNOWN(YamaicaEAConstants.UNKNOWN_TYPE_NAME, 0x0);

        public static final int         UNKNOWN_ID     = 0x0;
        public static final int         IN_ID          = 0x1;
        public static final int         OUT_ID         = 0x2;

        private static final Kind[]     allKinds       = new Kind[] { IN, OUT, UNKNOWN };

        private static final List<Kind> allKindsAsList = Collections.unmodifiableList(Arrays.asList(allKinds));

        public static List<Kind> getAll()
        {
            return allKindsAsList;
        }

        public static Kind getByName(final String name)
        {
            for (final Kind kind : allKinds)
            {
                if (kind.getName().equals(name))
                {
                    return kind;
                }
            }
            LOGGER.log(Level.SEVERE, String.format("Couldn't find kind by name '%s'!", name));
            // TODO: Shall Kind.UNKOWN be returned instead!?
            return null;
        }

        public static Kind getById(final int id)
        {
            switch (id)
            {
                case IN_ID:
                    return Kind.IN;
                case OUT_ID:
                    return Kind.OUT;
                default:
                    return Kind.UNKNOWN;
            }
        }

        private final String name;
        private final int    id;

        private Kind(final String name, final int id)
        {
            this.name = name;
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public int getId()
        {
            return id;
        }

        private static final Logger LOGGER = Logger.getLogger(Kind.class.getName());
    }

    public Kind getKind();

    public void setKind(Kind kind);

    public String getType();

    public void setType(String type);

    public EAElementContainer getTypeElement();

    public void setTypeElement(EAElementContainer typeElement);

    public String getDefault();

    public void setDefault(String default_);
}
