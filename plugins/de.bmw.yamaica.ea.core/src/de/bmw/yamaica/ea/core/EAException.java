/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core;

public class EAException extends RuntimeException
{
    private static final long serialVersionUID = 9197878902791818618L;

    public EAException()
    {
        super();
    }

    public EAException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public EAException(String message)
    {
        super(message);
    }

    public EAException(Throwable cause)
    {
        super(cause);
    }
}
