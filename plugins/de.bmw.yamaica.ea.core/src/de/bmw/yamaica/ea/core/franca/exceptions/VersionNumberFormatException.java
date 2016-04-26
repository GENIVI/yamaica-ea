/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca.exceptions;

public class VersionNumberFormatException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = 4811273583232819346L;

    public VersionNumberFormatException()
    {
        super();
    }

    public VersionNumberFormatException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public VersionNumberFormatException(String message)
    {
        super(message);
    }

    public VersionNumberFormatException(Throwable cause)
    {
        super(cause);
    }
}
