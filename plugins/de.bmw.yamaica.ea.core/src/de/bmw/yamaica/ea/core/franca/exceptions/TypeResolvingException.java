/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca.exceptions;

public class TypeResolvingException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = 813146441623079117L;

    public TypeResolvingException()
    {
        super();
    }

    public TypeResolvingException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public TypeResolvingException(String message)
    {
        super(message);
    }

    public TypeResolvingException(Throwable cause)
    {
        super(cause);
    }
}
