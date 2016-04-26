/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal;

public class OperationStatus
{
    private boolean   status;
    private int       exitResult = 0;
    private String    message;
    private Object    operationResultObj;
    private String    exceptionMessage;
    private Exception currentException;

    public final boolean getStatus()
    {
        return status;
    }

    public final void setStatus(boolean value)
    {
        status = value;
    }

    public final int getExitResult()
    {
        return exitResult;
    }

    public final void setExitResult(int value)
    {
        exitResult = value;
    }

    public final String getMessage()
    {
        return message;
    }

    public final void setMessage(String value)
    {
        message = value;
    }

    public final Object getOperationID()
    {
        return operationResultObj;
    }

    public final void setOperationID(Object value)
    {
        operationResultObj = value;
    }

    public final String getExceptionMessage()
    {
        return exceptionMessage;
    }

    public final void setExceptionMessage(String value)
    {
        exceptionMessage = value;
    }

    public final Exception getCurrentException()
    {
        return currentException;
    }

    public final void setCurrentException(Exception value)
    {
        currentException = value;
    }

    public OperationStatus()
    {
    }

    public OperationStatus(boolean status)
    {
        this(status, 0);
    }

    public OperationStatus(boolean status, int exitResult)
    {
        this(status, exitResult, null);
    }

    public OperationStatus(boolean status, int exitResult, String message)
    {
        this.status = status;
        this.exitResult = exitResult;
        this.message = message;
    }

    public static OperationStatus CreateFromException(String message, Exception ex)
    {
        OperationStatus opStatus = new OperationStatus();
        opStatus.setStatus(false);
        opStatus.setMessage(message);
        opStatus.setOperationID(null);

        if (ex != null)
        {
            opStatus.setExceptionMessage(ex.getMessage());
            opStatus.setCurrentException(ex);
        }

        return opStatus;
    }
}
