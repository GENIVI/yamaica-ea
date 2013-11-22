/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core;

import org.eclipse.emf.ecore.EObject;
import org.franca.core.franca.FModelElement;

public class EquivalentElementContainer
{

    private FModelElement fidlElement;
    private EObject       umlModelElement;
    private EObject       extensionElement;

    public FModelElement getFidlElement()
    {
        return fidlElement;
    }

    public void setFidlElement(FModelElement fModelElement)
    {
        this.fidlElement = fModelElement;
    }

    public EObject getUmlModelElement()
    {
        return umlModelElement;
    }

    public void setUmlModelElement(EObject umlModelElement)
    {
        this.umlModelElement = umlModelElement;
    }

    public EObject getExtensionElement()
    {
        return extensionElement;
    }

    public void setExtensionElement(EObject extensionElement)
    {
        this.extensionElement = extensionElement;
    }

}
