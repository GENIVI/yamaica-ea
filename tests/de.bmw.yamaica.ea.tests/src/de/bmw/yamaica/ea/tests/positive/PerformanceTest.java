/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.positive;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.bmw.yamaica.ea.tests.utils.EA2FrancaTransformationAdapter;
import de.bmw.yamaica.ea.tests.utils.EATestConstants;

public class PerformanceTest
{
    private static String   eaInputFile    = EATestConstants.EA_INPUT_PATH + "minimal.eap";
    private static String[] eaPackagePaths = { "model.root.minimal" };
    private static String   genPath        = EATestConstants.GEN_PATH + "minimal/";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        EA2FrancaTransformationAdapter.setUpAdapter(eaInputFile);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        EA2FrancaTransformationAdapter.tearDownAdapter();
    }

    @Test
    public void testEA2FrancaTransformation() throws Exception
    {
        EA2FrancaTransformationAdapter.transformEAPackages(eaPackagePaths, genPath);
    }
}
