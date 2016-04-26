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

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.YamaicaEAConstants;

public interface EADiagramContainer extends EAContainerWithNamespace
{
    public enum Type
    {
        CLASS(EAConstants.DIAGRAM_TYPE_CLASS, 0x1), UNKNOWN(YamaicaEAConstants.UNKNOWN_TYPE_NAME, 0x0);

        public static final int         UNKNOWN_ID     = 0x0;
        public static final int         CLASS_ID       = 0x1;

        private static final Type[]     allTypes       = new Type[] { CLASS, UNKNOWN };

        private static final List<Type> allTypesAsList = Collections.unmodifiableList(Arrays.asList(allTypes));

        public static List<Type> getAll()
        {
            return allTypesAsList;
        }

        public static Type getByName(final String name)
        {
            for (final Type type : allTypes)
            {
                if (type.getName().equals(name))
                {
                    return type;
                }
            }

            return Type.UNKNOWN;
        }

        public static Type getById(final int id)
        {
            switch (id)
            {
                case CLASS_ID:
                    return Type.CLASS;
                default:
                    return Type.UNKNOWN;
            }
        }

        private final String name;
        private final int    id;

        private Type(final String name, final int id)
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
    }

    public Type getType();

    public List<EADiagramObjectContainer> getDiagramObjects();

    public EADiagramObjectContainer createDiagramObject(EAElementContainer element);

    public EADiagramObjectContainer getOrCreateDiagramObject(EAElementContainer element);

    public void deleteDiagramObject(EADiagramObjectContainer diagramObject);

    public void deleteAllDiagramObjects();

    public void layout();
}
