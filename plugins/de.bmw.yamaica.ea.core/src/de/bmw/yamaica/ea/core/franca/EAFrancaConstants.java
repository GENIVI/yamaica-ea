/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca;

public class EAFrancaConstants
{
    // FIDL Tagged Value Names
    public static final String TAGGED_VALUE_NAME                               = "FIDL-Name";
    public static final String TAGGED_VALUE_NAMESPACE_PREFIX                   = "FIDL-Namespace-Prefix";

    // FIDL Stereotypes
    public static final String STEREOTYPE_ARRAY                                = "array";
    public static final String STEREOTYPE_ARRAF_OF                             = "arrayOf";
    public static final String STEREOTYPE_ATTRIBUTE                            = "attribute";
    public static final String STEREOTYPE_ATTRIBUTE_READ_ONLY                  = "attribute readonly";
    public static final String STEREOTYPE_ATTRIBUTE_NO_SUBSCRIPTIONS           = "attribute nosubscriptions";
    public static final String STEREOTYPE_ATTRIBUTE_READ_ONLY_NO_SUBSCRIPTIONS = "attribute readonly nosubscriptions";
    public static final String STEREOTYPE_BROADCAST                            = "broadcast";
    public static final String STEREOTYPE_BROADCAST_SELECTIVE                  = "broadcast selective";
    public static final String STEREOTYPE_ENUMERATION                          = "enumeration";
    public static final String STEREOTYPE_ERROR                                = "error";
    public static final String STEREOTYPE_FIDL                                 = "fidl";
    public static final String STEREOTYPE_FIRE_AND_FORGET                      = "fireandforget";
    public static final String STEREOTYPE_FRANCA_INTERFACE                     = "FrancaInterface";
    public static final String STEREOTYPE_KEY                                  = "key";
    public static final String STEREOTYPE_MAP                                  = "map";
    public static final String STEREOTYPE_METHOD                               = "method";
    public static final String STEREOTYPE_METHOD_FIRE_AND_FORGET               = "method fireandforget";
    public static final String STEREOTYPE_NO_FIDL                              = "nofidl";
    public static final String STEREOTYPE_NO_SUBSCRIPTIONS                     = "nosubscriptions";
    public static final String STEREOTYPE_READ_ONLY                            = "readonly";
    public static final String STEREOTYPE_ROOT                                 = "root";
    public static final String STEREOTYPE_SELECTIVE                            = "selective";
    public static final String STEREOTYPE_STRUCT                               = "struct";
    public static final String STEREOTYPE_TYPEDEF                              = "typedef";
    public static final String STEREOTYPE_UNION                                = "union";
    public static final String STEREOTYPE_VALUE                                = "value";

    // Other constants used in EA for Franca
    public static final String CLIENT_INTERFACE_NAME_SUFFIX                    = "Client";
}
