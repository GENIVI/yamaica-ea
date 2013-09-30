/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core;

public class EAConstants
{
    // EA API Names and default EA Stereotypes
    public static final String TYPE_CLASS                                = "Class";
    public static final String TYPE_INTERFACE                            = "Interface";
    public static final String GENLINK_PARENT                            = "Parent";
    public static final String PARAMETER_DIRECTION_OUT                   = "out";
    public static final String PARAMETER_DIRECTION_IN                    = "in";
    public static final String CONNECTOR_DIRECTION_BI_DIRECTIONAL        = "Bi-Directional";
    public static final String CONNECTOR_DIRECTION_DESTINATION_TO_SOURCE = "Destination -> Source";
    public static final String CONNECTOR_DIRECTION_SOURCE_TO_DESTINATION = "Source -> Destination";
    public static final String CONNECTOR_DIRECTION_UNSPECIFIED           = "Unspecified";
    public static final String CONNECTOR_SUBTYPE_STRONG                  = "Strong";
    public static final String CONNECTOR_SUBTYPE_WEAK                    = "Weak";
    public static final String CONNECTOR_TYPE_ASSOCIATION                = "Association";
    public static final String CONNECTOR_TYPE_AGGREGATION                = "Aggregation";
    public static final String CONNECTOR_TYPE_GENERALIZATION             = "Generalization";
    public static final String CONNECTOR_TYPE_PACKAGE                    = "Package";
    public static final String STEREOTYPE_IMPORT                         = "import";
    public static final String FLAG_IS_MODEL                             = "isModel";
    public static final String FLAG_VICON                                = "VICON";
}
