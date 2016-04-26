/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core;

public interface EAConstants
{
    // EA API Names and default EA Stereotypes
    String TYPE_CLASS                                = "Class";
    String TYPE_INTERFACE                            = "Interface";
    String TYPE_ENUMERATION                          = "Enumeration";
    String TYPE_OBJECT                               = "Object";
    String GENLINK_PARENT                            = "Parent";
    String PARAMETER_DIRECTION_OUT                   = "out";
    String PARAMETER_DIRECTION_IN                    = "in";
    String CONNECTOR_DIRECTION_BI_DIRECTIONAL        = "Bi-Directional";
    String CONNECTOR_DIRECTION_DESTINATION_TO_SOURCE = "Destination -> Source";
    String CONNECTOR_DIRECTION_SOURCE_TO_DESTINATION = "Source -> Destination";
    String CONNECTOR_DIRECTION_UNSPECIFIED           = "Unspecified";
    String CONNECTOR_SUBTYPE_STRONG                  = "Strong";
    String CONNECTOR_SUBTYPE_WEAK                    = "Weak";
    String CONNECTOR_TYPE_ASSOCIATION                = "Association";
    String CONNECTOR_TYPE_AGGREGATION                = "Aggregation";
    String CONNECTOR_TYPE_DEPENDENCY                 = "Dependency";
    String CONNECTOR_TYPE_GENERALIZATION             = "Generalization";
    String CONNECTOR_TYPE_PACKAGE                    = "Package";
    String DIAGRAM_TYPE_CLASS                        = "Class";
    String STEREOTYPE_IMPORT                         = "import";
    String FLAG_IS_MODEL                             = "isModel";
    String FLAG_VICON                                = "VICON";

    // Number of spaces of a tab.
    // Replace me! Use Eclipse's 'Preferences -> General -> Editors -> Text Editors -> Displayed tab width' instead
    int    DISPLAYED_TAB_WIDTH                       = 4;
}
