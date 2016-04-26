/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.bmw.yamaica.ea.core.EAConstants;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAContainerWithElements;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.franca.common.core.YamaicaFrancaConstants;

public class EAExplorer
{
    public static final String  STEREOTYPE_MERGE          = "merge";
    public static final String  STEREOTYPE_MEMBEROF       = "memberOf";
    public static final String  STEREOTYPE_CATALOG_MASTER = "Catalog Master";
    public static final String  STEREOTYPE_DOMAIN_CATALOG = "Domain Catalog";

    private static final Logger LOGGER                    = Logger.getLogger(EAExplorer.class.getName());

    public static void searchInPackage(EAPackageContainer container)
    {
        List<EAPackageContainer> packages = container.getPackages();
        List<EAElementContainer> elements = container.getElements();
        for (EAElementContainer e : elements)
        {
            System.out.println(" Element  " + e.getName() + " -> " + e.getType());
            for (String s : e.getStereotypes())
            {
                System.out.println("Element Stereotypes: " + s);
            }
        }

        for (EAPackageContainer e : packages)
        {
            System.out.println("Package :  " + e.getName());
            for (String s : e.getStereotypes())
            {
                System.out.println("Element Stereotypes: " + s);
            }
            searchInPackage(e);

        }
    }

    /**
     * Searches all elements with given stereotype and returns list of them :
     * List<EAContainerWithElements> allElements = new ArrayList<EAContainerWithElements>();
     * EAExplorer.findeStereotypes(eaPackageContainer, "Catalog Master",allElements);
     */
    public static void findStereotypes(EAPackageContainer container, String stereotypeName, List<EAContainerWithElements> result)
    {
        List<EAPackageContainer> packages = container.getPackages();
        List<EAElementContainer> elements = container.getElements();
        for (EAElementContainer e : elements)
        {
            for (String s : e.getStereotypes())
            {
                if (s.equals(stereotypeName))
                {
                    System.out.println("Element is found :  " + e.getName() + " -> " + e.getType());
                    System.out.println("Stereotype: " + s);
                    result.add(e);
                }
            }
        }
        for (EAPackageContainer p : packages)
        {
            for (String s : p.getStereotypes())
            {
                if (p.equals(stereotypeName))
                {
                    System.out.println("Package is found :  " + p.getName());
                    System.out.println("Stereotype: " + s);
                    result.add(p);
                }
            }
            findStereotypes(p, stereotypeName, result);
        }
    }

    public static EAContainerWithElements findOneStereotype(List<EAPackageContainer> eaPackageContainers, String stereotypeName)
    {
        EAContainerWithElements result = null;
        for (EAPackageContainer eaPackageContainer : eaPackageContainers)
        {
            result = findOneStereotype(eaPackageContainer, stereotypeName);
            if (result != null)
            {
                break;
            }
        }
        return result;
    }

    public static EAContainerWithElements findOneStereotype(EAPackageContainer container, String stereotypeName)
    {
        EAContainerWithElements result = null;

        List<EAPackageContainer> packages = container.getPackages();
        List<EAElementContainer> elements = container.getElements();
        for (EAElementContainer e : elements)
        {
            for (String s : e.getStereotypes())
            {
                if (s.equals(stereotypeName))
                {
                    result = e;
                    return result;
                }
            }
        }
        for (EAPackageContainer p : packages)
        {
            for (String s : p.getStereotypes())
            {
                if (s.equals(stereotypeName))
                {

                    result = p;
                    return result;
                }
            }
            EAContainerWithElements findElement = findOneStereotype(p, stereotypeName);
            if (findElement != null)
            {
                result = findElement;

                return result;
            }
        }

        return result;
    }

    public static List<EAElementContainer> getImportedCatalogSection(final EAContainerWithElements eaContainer)
    {
        final List<EAElementContainer> result = new ArrayList<>();

        if (eaContainer != null)
        {
            // Stores all skipped connectors.
            final List<EAConnectorContainer> skippedConnectors = new ArrayList<>();
            for (EAConnectorContainer connector : eaContainer.getConnectors())
            {
                if (connector.hasStereotype(STEREOTYPE_MERGE))
                {
                    EAElementContainer client = connector.getClient();
                    if (client != null)
                    {
                        LOGGER.log(Level.INFO,
                                String.format("Connector Source with stereotype [%s] : %s", STEREOTYPE_MERGE, client.getName()));
                        result.add(client);
                    }
                }
                else
                {
                    // Memorize all other connectors (will be skipped).
                    skippedConnectors.add(connector);
                }
            }

            // Printing all other connectors via WARNING.
            if (!skippedConnectors.isEmpty())
            {
                StringBuilder skippedConnectorsMsg = new StringBuilder("[ ");
                final int startLength = skippedConnectorsMsg.length();
                for (EAConnectorContainer otherConnector : skippedConnectors)
                {
                    // In case of more than one elements.
                    if (skippedConnectorsMsg.length() > startLength)
                    {
                        skippedConnectorsMsg.append(", ");
                    }
                    EAElementContainer client = otherConnector.getClient();
                    skippedConnectorsMsg.append(String.format("Client: '%s', Sterotypes: '%s'", client != null ? client.getName() : "null",
                            otherConnector.getStereotypes()));
                }
                skippedConnectorsMsg.append(" ]");
                LOGGER.log(Level.WARNING,
                        String.format("Skipping connectors except with stereotype '%s': %s", STEREOTYPE_MERGE, skippedConnectorsMsg));
            }
        }
        return result;
    }

    public static List<EAElementContainer> getImportedMember(List<EAElementContainer> elements)
    {
        List<EAElementContainer> list = new ArrayList<>();

        for (EAElementContainer element : elements)
        {
            for (EAConnectorContainer connector : element.getConnectors(EAConnectorContainer.Type.ASSOCIATION))
            {
                if (connector.hasStereotype(STEREOTYPE_MEMBEROF))
                {
                    EAElementContainer client = connector.getClient();
                    if (client != null)
                    {
                        LOGGER.log(Level.INFO,
                                String.format("Connector Source with stereotype [%s] : %s", STEREOTYPE_MEMBEROF, client.getName()));
                        list.add(client);
                    }
                }
            }
        }
        return list;
    }

    //
    // Feature GLIPCI-322: Update catalog configuration to accept import of <<FIDL>> UML packages.
    //
    public static List<EAElementContainer> getImportPackages(List<EAElementContainer> elements)
    {
        List<EAElementContainer> list = new ArrayList<>();

        for (EAElementContainer element : elements)
        {
            // Similar to EAPackageContainerImpl's getImportedPackages.
            final List<EAConnectorContainer> connectors = new ArrayList<>();
            connectors.addAll(element.getConnectors(EAConnectorContainer.Type.PACKAGE));
            connectors.addAll(element.getConnectors(EAConnectorContainer.Type.DEPENDENCY));

            for (EAConnectorContainer connector : connectors)
            {
                if (connector.hasStereotype(EAConstants.STEREOTYPE_IMPORT))
                {
                    EAElementContainer supplier = connector.getSupplier();
                    EAElementContainer client = connector.getClient();

                    // Client's sterotype must be 'Domain Catalog' while at the same time the supplier's sterotype must be 'fidl'.
                    if (supplier != null && client != null && client.hasStereotype(STEREOTYPE_DOMAIN_CATALOG)
                            && supplier.hasStereotype(YamaicaFrancaConstants.FIDL))
                    {
                        LOGGER.log(
                                Level.INFO,
                                String.format("Connector Source with stereotype [%s] : %s", EAConstants.STEREOTYPE_IMPORT,
                                        supplier.getName()));
                        list.add(supplier);
                    }
                }
            }
        }
        return list;
    }

    public static EAElementContainer getElementClassifier(EAElementContainer member)
    {
        EAElementContainer result = member.getClassifier();

        return result;
    }

    public static List<EAPackageContainer> getEAPackageContainers(List<EAPackageContainer> eaPackageContainers, String[] namespaces)
    {
        List<EAPackageContainer> targetContainers = new ArrayList<>();

        for (String namespace : namespaces)
        {
            EAPackageContainer targetContainer = getEAPackageContainer(eaPackageContainers, namespace);

            if (null != targetContainer)
            {
                targetContainers.add(targetContainer);
            }
        }
        if (targetContainers.size() == 0)
        {
            LOGGER.log(Level.INFO, "Not all required EA packages could be found!");
        }
        return targetContainers;
    }

    public static EAPackageContainer getEAPackageContainer(List<EAPackageContainer> eaPackageContainers, String namespace)
    {
        int dotIndex = namespace.indexOf(".");
        String packageName = null;

        if (-1 == dotIndex)
        {
            packageName = namespace;
        }
        else
        {
            packageName = namespace.substring(0, dotIndex);
        }

        for (EAPackageContainer eaPackageContainer : eaPackageContainers)
        {
            if (eaPackageContainer.getName().equals(packageName))
            {
                if (-1 == dotIndex)
                {
                    return eaPackageContainer;
                }
                else
                {
                    return getEAPackageContainer(eaPackageContainer.getPackages(), namespace.substring(dotIndex + 1));
                }
            }
        }

        return null;
    }

}
