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

public interface EAElementContainer extends EAContainerWithElements
{
    public enum Type
    {
        CLASS(EAConstants.TYPE_CLASS, 0x1),
        INTERFACE(EAConstants.TYPE_INTERFACE, 0x2),
        ENUMERATION(EAConstants.TYPE_ENUMERATION, 0x3),
        OBJECT(EAConstants.TYPE_OBJECT, 0x4),
        PACKAGE(EAConstants.CONNECTOR_TYPE_PACKAGE, 0x5),
        UNKNOWN(YamaicaEAConstants.UNKNOWN_TYPE_NAME, 0x0);

        public static final int         UNKNOWN_ID     = 0x0;
        public static final int         CLASS_ID       = 0x1;
        public static final int         INTERFACE_ID   = 0x2;
        public static final int         ENUMERATION_ID = 0x3;
        public static final int         OBJECT_ID      = 0x4;
        public static final int         PACKAGE_ID     = 0x5;

        private static final Type[]     allTypes       = new Type[] { CLASS, INTERFACE, ENUMERATION, OBJECT, PACKAGE, UNKNOWN };

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
                case INTERFACE_ID:
                    return Type.INTERFACE;
                case ENUMERATION_ID:
                    return Type.ENUMERATION;
                case OBJECT_ID:
                    return Type.OBJECT;
                case PACKAGE_ID:
                    return Type.PACKAGE;
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

    public String getGenlinks();

    public void setGenlinks(String genlinks);

    public Type getType();

    public void setType(Type type);

    public List<EAAttributeContainer> getAttributes();

    public EAAttributeContainer createAttribute(String name);

    public EAAttributeContainer getOrCreateAttribute(String name);

    public void deleteAttribute(String name);

    public void deleteAttribute(EAAttributeContainer attribute);

    public void deleteAllAttributes();

    public List<EAMethodContainer> getMethods();

    public EAMethodContainer createMethod(String name);

    public EAMethodContainer getOrCreateMethod(String name);

    public void deleteMethod(String name);

    public void deleteMethod(EAMethodContainer method);

    public void deleteAllMethods();

    public List<EAElementContainer> getBaseClasses();

    public EAElementContainer getClassifier();
}
