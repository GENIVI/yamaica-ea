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

public interface EAConnectorContainer extends EAContainerWithTaggedValues
{
    public enum Type
    {
        ASSOCIATION(EAConstants.CONNECTOR_TYPE_ASSOCIATION, EAConstants.CONNECTOR_TYPE_ASSOCIATION, "", 0x1),
        AGGREGATION(EAConstants.CONNECTOR_TYPE_AGGREGATION, EAConstants.CONNECTOR_TYPE_AGGREGATION, EAConstants.CONNECTOR_SUBTYPE_WEAK, 0x2),
        COMPOSITION(EAConstants.CONNECTOR_TYPE_AGGREGATION, EAConstants.CONNECTOR_TYPE_AGGREGATION, EAConstants.CONNECTOR_SUBTYPE_STRONG, 0x4),
        GENERALIZATION(EAConstants.CONNECTOR_TYPE_GENERALIZATION, EAConstants.CONNECTOR_TYPE_GENERALIZATION, "", 0x8),
        PACKAGE(EAConstants.CONNECTOR_TYPE_PACKAGE, EAConstants.CONNECTOR_TYPE_PACKAGE, "", 0x10),
        DEPENDENCY(EAConstants.CONNECTOR_TYPE_DEPENDENCY, EAConstants.CONNECTOR_TYPE_DEPENDENCY, "", 0x20),
        UNKNOWN(YamaicaEAConstants.UNKNOWN_TYPE_NAME, "", "", 0x0);

        public static final int         UNKNOWN_ID        = 0x0;
        public static final int         ASSOCIATION_ID    = 0x1;
        public static final int         AGGREGATION_ID    = 0x2;
        public static final int         COMPOSITION_ID    = 0x4;
        public static final int         GENERALIZATION_ID = 0x8;
        public static final int         PACKAGE_ID        = 0x10;
        public static final int         DEPENDENCY_ID     = 0x20;

        private static final Type[]     allTypes          = new Type[] { ASSOCIATION, AGGREGATION, COMPOSITION, GENERALIZATION, PACKAGE,
                                                                  DEPENDENCY, UNKNOWN };

        private static final List<Type> allTypesAsList    = Collections.unmodifiableList(Arrays.asList(allTypes));

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

        public static Type getByType(final String typeAsString)
        {
            return getByType(typeAsString, "");
        }

        public static Type getByType(final String typeAsString, final String subtypeAsString)
        {
            for (final Type type : allTypes)
            {
                if (type.getType().equals(typeAsString) && type.getSubtype().equals(subtypeAsString))
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
                case ASSOCIATION_ID:
                    return Type.ASSOCIATION;
                case AGGREGATION_ID:
                    return Type.AGGREGATION;
                case COMPOSITION_ID:
                    return Type.COMPOSITION;
                case GENERALIZATION_ID:
                    return Type.GENERALIZATION;
                case PACKAGE_ID:
                    return Type.PACKAGE;
                case DEPENDENCY_ID:
                    return Type.DEPENDENCY;
                default:
                    return Type.UNKNOWN;
            }
        }

        private final String name;
        private final String type;
        private final String subtype;
        private final int    id;

        private Type(final String name, final String type, final String subtype, final int id)
        {
            this.name = name;
            this.type = type;
            this.subtype = subtype;
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public String getType()
        {
            return type;
        }

        public String getSubtype()
        {
            return subtype;
        }

        public int getId()
        {
            return id;
        }
    }

    public enum Direction
    {
        UNSPECIFIED(EAConstants.CONNECTOR_DIRECTION_UNSPECIFIED, 0x0),
        SOURCE_TO_DESTINATION(EAConstants.CONNECTOR_DIRECTION_SOURCE_TO_DESTINATION, 0x1),
        DESTINATION_TO_SOURCE(EAConstants.CONNECTOR_DIRECTION_DESTINATION_TO_SOURCE, 0x2),
        BI_DIRECTIONAL(EAConstants.CONNECTOR_DIRECTION_BI_DIRECTIONAL, 0x3);

        public static final int              UNSPECIFIED_ID           = 0x0;
        public static final int              SOURCE_TO_DESTINATION_ID = 0x1;
        public static final int              DESTINATION_TO_SOURCE_ID = 0x2;
        public static final int              BI_DIRECTIONAL_ID        = 0x3;

        private static final Direction[]     allDirections            = new Direction[] { UNSPECIFIED, SOURCE_TO_DESTINATION,
                                                                              DESTINATION_TO_SOURCE, BI_DIRECTIONAL };

        private static final List<Direction> allDirectionsAsList      = Collections.unmodifiableList(Arrays.asList(allDirections));

        public static List<Direction> getAll()
        {
            return allDirectionsAsList;
        }

        public static Direction getByName(final String name)
        {
            for (final Direction direction : allDirections)
            {
                if (direction.getName().equals(name))
                {
                    return direction;
                }
            }

            return null;
        }

        public static Direction getById(final int id)
        {
            switch (id)
            {
                case UNSPECIFIED_ID:
                    return Direction.UNSPECIFIED;
                case SOURCE_TO_DESTINATION_ID:
                    return Direction.SOURCE_TO_DESTINATION;
                case DESTINATION_TO_SOURCE_ID:
                    return Direction.DESTINATION_TO_SOURCE;
                case BI_DIRECTIONAL_ID:
                    return Direction.BI_DIRECTIONAL;
                default:
                    return Direction.UNSPECIFIED;
            }
        }

        private final String name;
        private final int    id;

        private Direction(final String name, final int id)
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

    public void setType(Type type);

    public EAElementContainer getSupplier();

    public void setSupplier(EAElementContainer supplier);

    public EAElementContainer getClient();

    public void setClient(EAElementContainer client);

    public EAElementContainer getOpposite(EAElementContainer reference);

    public boolean isNavigable(EAElementContainer destination);

    public boolean isDirected();

    public Direction getDirection();

    public void setDirection(Direction direction);
}
