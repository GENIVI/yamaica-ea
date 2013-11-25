/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.utils;

import de.bmw.yamaica.ea.core.YamaicaEAConstants;

public interface EATestConstants extends YamaicaEAConstants
{
    String TESTS_PLUGIN_ID           = "de.bmw.yamaica.ea.tests";
    String GEN_PATH                  = "models/ea/gen/";
    String REF_PATH                  = "models/ea/ref/";
    String INPUT_PATH                = "models/ea/input/";
    String ERROR_TEST_INPUT_FILENAME = "UML_HowTo_Example.eap";
    String ERROR_TEST_INPUT_PATH     = INPUT_PATH + ERROR_TEST_INPUT_FILENAME;
}
