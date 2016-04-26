/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.utils;

import de.bmw.yamaica.ea.core.YamaicaEAConstants;

public interface TestConstants extends YamaicaEAConstants
{
    String TESTS_PLUGIN_ID       = "de.bmw.yamaica.ea.tests";
    String FRANCA2EA_INPUT_PATH  = "models/franca/input/";
    String FRANCA2EA_REF_PATH    = "models/franca/ref/";
    String EA2FRANCA_OUTPUT_PATH = "models/franca/output/";
    String EA_PROJECT_FILENAME   = "generated_test_file.eap";
    String EA_PROJECT_PATH       = "models/ea/" + EA_PROJECT_FILENAME;
    String EA_NAMESPACE_PREFIX   = "Generated Model";
}
