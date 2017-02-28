/* Copyright (C) 2013-2016 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal;

import org.apache.commons.cli.CommandLine;

public class EAAuthenticationHandler
{
    private final static String CLI_USERNAME = "u";
    private final static String CLI_PASSWORD = "pw";

    private String              username     = null;
    private String              password     = null;

    public void setOptionValues(CommandLine line)
    {

        if (line.hasOption(CLI_USERNAME))
        {
            username = line.getOptionValue(CLI_USERNAME);
        }

        if (line.hasOption(CLI_PASSWORD))
        {
            password = line.getOptionValue(CLI_PASSWORD);
        }
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    /**
     * May be appropriate to check if either all (username AND password) or nothing is set. Probably using username without any password is
     * valid. This is why we return always true at the moment.
     * 
     * @return true always.
     */
    public boolean validate()
    {
        return true;
    }
}
