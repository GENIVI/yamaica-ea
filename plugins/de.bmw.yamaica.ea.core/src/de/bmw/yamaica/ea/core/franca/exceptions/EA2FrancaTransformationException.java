/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca.exceptions;

public class EA2FrancaTransformationException extends RuntimeException
{
    private static final long serialVersionUID = -4983132121357312262L;

    public EA2FrancaTransformationException()
    {
        super();
    }

    public EA2FrancaTransformationException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public EA2FrancaTransformationException(String message)
    {
        super(message);
    }

    public EA2FrancaTransformationException(Throwable cause)
    {
        super(cause);
    }
}
