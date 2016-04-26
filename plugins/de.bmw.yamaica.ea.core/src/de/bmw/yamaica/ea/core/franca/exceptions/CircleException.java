/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca.exceptions;

/**
 * Circle detected exception.
 *
 * Sample ('->' meaning import):
 *
 * A.fidl -> B.fidl
 * B.fidl -> C.fidl
 * C.fidl -> A.fidl
 */
public class CircleException extends EA2FrancaTransformationException
{

    private static final long serialVersionUID = -1622878677230209895L;

    public CircleException()
    {
    }

    public CircleException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public CircleException(String message)
    {
        super(message);
    }

    public CircleException(Throwable cause)
    {
        super(cause);
    }
}
