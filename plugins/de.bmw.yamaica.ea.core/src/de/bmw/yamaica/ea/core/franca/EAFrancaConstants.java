/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca;

public interface EAFrancaConstants
{
    // FIDL Tagged Value Names
    String   TAGGED_VALUE_NAME                               = "FIDL-Name";
    String   TAGGED_VALUE_NAMESPACE_PREFIX                   = "FIDL-Namespace-Prefix";

    // GLIPCI-655 related (if value is missing or false, apply to new logic).
    String   TAGGED_VALUE_ANONYMOUS_TYPECOLLECTION_PREFIX    = "FIDL-Anonymous-TypeCollection";

    // FIDL Stereotypes
    String   STEREOTYPE_ARRAY                                = "array";
    String   STEREOTYPE_ARRAF_OF                             = "arrayOf";
    String   STEREOTYPE_ATTRIBUTE                            = "attribute";
    String   STEREOTYPE_ATTRIBUTE_NO_SUBSCRIPTIONS           = "attribute nosubscriptions";
    String   STEREOTYPE_ATTRIBUTE_READ_ONLY                  = "attribute readonly";
    String   STEREOTYPE_ATTRIBUTE_READ_ONLY_NO_SUBSCRIPTIONS = "attribute readonly nosubscriptions";
    String   STEREOTYPE_BROADCAST                            = "broadcast";
    String   STEREOTYPE_BROADCAST_SELECTIVE                  = "broadcast selective";
    String   STEREOTYPE_CALLBACK                             = "callback";
    String   STEREOTYPE_ENUMERATION                          = "enumeration";
    String   STEREOTYPE_ERROR                                = "error";
    String   STEREOTYPE_FIDL                                 = "fidl";
    String   STEREOTYPE_FIRE_AND_FORGET                      = "fireandforget";
    String   STEREOTYPE_FRANCA_CLIENT_INTERFACE              = "FrancaClientInterface";
    String   STEREOTYPE_FRANCA_ENUM                          = "FrancaEnum";
    String   STEREOTYPE_FRANCA_INTERFACE                     = "FrancaInterface";
    String   STEREOTYPE_FRANCA_SERVICE_INTERFACE             = "FrancaServiceInterface";
    String   STEREOTYPE_KEY                                  = "key";
    String   STEREOTYPE_MANAGES                              = "manages";
    String   STEREOTYPE_MAP                                  = "map";
    String   STEREOTYPE_METHOD                               = "method";
    String   STEREOTYPE_METHOD_FIRE_AND_FORGET               = "method fireandforget";
    String   STEREOTYPE_NO_FIDL                              = "nofidl";
    String   STEREOTYPE_NO_SUBSCRIPTIONS                     = "nosubscriptions";
    String   STEREOTYPE_POLYMORPHIC_STRUCT                   = "struct polymorphic";
    String   STEREOTYPE_READ_ONLY                            = "readonly";
    String   STEREOTYPE_ROOT                                 = "root";
    String   STEREOTYPE_SELECTIVE                            = "selective";
    String   STEREOTYPE_STRUCT                               = "struct";
    String   STEREOTYPE_TYPEDEF                              = "typedef";
    String   STEREOTYPE_UNION                                = "union";
    String   STEREOTYPE_VALUE                                = "value";

    // Other constants used in EA for Franca
    String   CLIENT_INTERFACE_NAME_SUFFIX                    = "Client";
    String   CALLBACK_METHOD_NAME_SUFFIX                     = "OnChange";

    // Attribute names are not allowed in Franca (due to code generation). Blacklist is case sensitive.
    String[] FRANCA_ATTRIBUTE_NAME_BLACKLIST                 = new String[] { "InterfaceVersion" };
}
