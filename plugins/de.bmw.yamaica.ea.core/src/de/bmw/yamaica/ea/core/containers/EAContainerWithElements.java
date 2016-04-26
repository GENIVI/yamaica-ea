/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.containers;

import java.util.List;

public interface EAContainerWithElements extends EAContainerWithNamespace, EAContainerWithTaggedValues
{
    public List<EAElementContainer> getElements();

    public EAElementContainer createElement(String name, EAElementContainer.Type type);

    public EAElementContainer getOrCreateElement(String name, EAElementContainer.Type type);

    public void deleteElement(String name);

    public void deleteElement(EAElementContainer element);

    public void deleteAllElements();

    public List<EAConnectorContainer> getConnectors();

    public List<EAConnectorContainer> getConnectors(EAConnectorContainer.Type... types);

    public EAConnectorContainer createConnector(String name, EAConnectorContainer.Type type, EAElementContainer client);

    public EAConnectorContainer getOrCreateConnector(String name, EAConnectorContainer.Type type, EAElementContainer client);

    public void deleteConnector(String name);

    public void deleteConnector(EAConnectorContainer connector);

    public void deleteAllConnectors();

    public EADiagramContainer createDiagram(String name, EADiagramContainer.Type type);

    public EADiagramContainer getOrCreateDiagram(String name, EADiagramContainer.Type type);

    public List<EADiagramContainer> getDiagrams();

    public void deleteDiagram(String name);

    public void deleteDiagram(EADiagramContainer diagram);

    public void deleteAllDiagrams();

    public String getAuthor();

    public void setAuthor(String author);

    public String getVersion();

    public void setVersion(String version);
}
