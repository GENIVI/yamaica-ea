/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core;

import java.util.Iterator;

import org.sparx.Attribute;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.ConnectorTag;
import org.sparx.Constraint;
import org.sparx.CustomProperty;
import org.sparx.Element;
import org.sparx.EnumRelationSetType;
import org.sparx.Method;
import org.sparx.Package;
import org.sparx.Parameter;
import org.sparx.Property;
import org.sparx.Repository;
import org.sparx.Requirement;
import org.sparx.Resource;
import org.sparx.RoleTag;
import org.sparx.TaggedValue;

import de.bmw.yamaica.ea.core.containers.EAPackageContainer;

public class EAParser
{
    protected static EAInstance eaInstance = null;

    public static void parsePackage(EAPackageContainer container)
    {
        eaInstance = container.getEAInstance();

        Package p = (Package) container.getEAObject();

        System.out.println("Package: " + container.getNamespace());
        System.out.println("Package Name: " + p.GetName());
        System.out.println("Package Notes: " + p.GetNotes());
        System.out.println("Package Version: " + p.GetVersion());
        System.out.println("Package Package ID: " + p.GetPackageID());
        System.out.println("Package Parent ID: " + p.GetParentID());
        System.out.println("Package Stereotypes: " + p.GetStereotypeEx());
        System.out.println("Package Stereotypes (Ex): " + p.GetStereotypeEx());

        Element element = p.GetElement();

        if (null != element)
        {
            System.out.println("Element: " + container.getElement().getNamespace());
            System.out.println("Element Name: " + element.GetName());
            System.out.println("Element Notes: " + element.GetNotes());
            System.out.println("Element Version: " + element.GetVersion());
            System.out.println("Element Package ID: " + element.GetPackageID());
            System.out.println("Element Element ID: " + element.GetElementID());
            System.out.println("Element Parent ID: " + element.GetParentID());
            System.out.println("Element Stereotypes: " + element.GetStereotypeEx());
            System.out.println();

            // for (TaggedValue tv : element.GetTaggedValuesEx())
            // {
            // System.out.println("############# TAGGED VALUE -> name: " + tv.GetName() + " -> value: " + tv.GetValue());
            // }
        }
        else
        {
            System.out.println("Package " + p.GetName() + " does not have an element.");
            System.out.println();
        }

        Collection<Element> elements = p.GetElements();

        for (Element e : elements)
        {
            parseElement(e);
        }
    }

    public static void parseElement(Element element)
    {
        String type = element.GetType();
        System.out.println("  " + element.GetName() + " -> " + type);

        if (type.equals("Interface"))
        {
            parseInterface(element);
        }
        else if (type.equals("Class"))
        {
            parseClass(element);
        }

        for (Element e : element.GetElements())
        {
            parseElement(e);
        }
    }

    public static void parseInterface(Element element)
    {
        Collection<Method> methods = element.GetMethods();

        for (Method m : methods)
        {
            System.out.println("    Method: " + m.GetName() + " -> " + m.GetVisibility());

            parseMethod(m);
        }

        Collection<Attribute> attributes = element.GetAttributes();

        for (Attribute a : attributes)
        {
            System.out.println("    Attribute: " + a.GetName() + " -> " + a.GetType());
        }
    }

    public static void parseMethod(Method method)
    {
        Collection<Parameter> parameters = method.GetParameters();

        for (Parameter p : parameters)
        {
            System.out.println("      Parameter: " + p.GetName() + " -> " + p.GetKind() + " -> " + p.GetType() + " -> " + p.GetStyle()
                    + " -> " + p.GetNotes() + " -> " + p.GetClassifierID());

            if (Integer.parseInt(p.GetClassifierID()) != 0)
            {
                Repository repository = (Repository) eaInstance.getRepository().getEAObject();
                Element e = repository.GetElementByID(Integer.parseInt(p.GetClassifierID()));

                System.out.println("        *** " + e.GetName());
            }
            else
            {
                System.out.println("        *** NOT FOUND");
            }

            // e = eaInstance.getRepository().getEARepository().GetElementByID(p.GetClassifierID());
            //
            // if(null != e)
            // {
            // System.out.println("        *** " + e.GetName());
            // }
            // else
            // {
            // System.out.println("        *** NOT FOUND");
            // }
        }
    }

    public static void parseClass(Element element)
    {
        // System.out.println("  Tag: " + element.GetTag());

        for (TaggedValue tv : element.GetTaggedValuesEx())
        {
            System.out.println("    TaggedValue: " + tv.GetName() + " -> " + tv.GetValue());
        }

        String genLinks = element.GetGenlinks();

        if (genLinks.length() > 0)
        {
            System.out.println("    GenLinks: " + genLinks);
        }

        for (Element e : element.GetElements())
        {
            System.out.println("    Element: " + e.GetName());
        }

        for (Element e : element.GetEmbeddedElements())
        {
            System.out.println("    Embedded Element: " + e.GetName());
        }

        String dependStart = element.GetRelationSet(EnumRelationSetType.rsDependStart);

        if (dependStart.length() > 0)
        {
            System.out.println("    Depend Start: " + dependStart);
        }

        String dependEnd = element.GetRelationSet(EnumRelationSetType.rsDependEnd);

        if (dependEnd.length() > 0)
        {
            System.out.println("    Depend End: " + dependEnd);
        }

        String generalizeStart = element.GetRelationSet(EnumRelationSetType.rsGeneralizeStart);

        if (generalizeStart.length() > 0)
        {
            System.out.println("    Generalize Start: " + generalizeStart);
        }

        String generalizeEnd = element.GetRelationSet(EnumRelationSetType.rsGeneralizeEnd);

        if (generalizeEnd.length() > 0)
        {
            System.out.println("    Generalize End: " + generalizeEnd);
        }

        String realizeStart = element.GetRelationSet(EnumRelationSetType.rsRealizeStart);

        if (realizeStart.length() > 0)
        {
            System.out.println("    Realize Start: " + realizeStart);
        }

        String realizeEnd = element.GetRelationSet(EnumRelationSetType.rsRealizeEnd);

        if (realizeEnd.length() > 0)
        {
            System.out.println("    Realize End: " + realizeEnd);
        }

        String parents = element.GetRelationSet(EnumRelationSetType.rsParents);

        if (parents.length() > 0)
        {
            System.out.println("    Parents: " + parents);
        }

        for (Constraint c : element.GetConstraints())
        {
            System.out.println("    Constraint: " + c.GetName());
        }

        for (Connector c : element.GetConnectors())
        {
            Repository repository = (Repository) eaInstance.getRepository().getEAObject();

            System.out.println("    Connector: <<" + c.GetStereotypeEx() + ">> " + c.GetSupplierEnd().GetCardinality() + " : "
                    + repository.GetElementByID(c.GetSupplierID()).GetName() + " -> "
                    + repository.GetElementByID(c.GetClientID()).GetName());

            System.out.println("      Direction: " + c.GetDirection());
            System.out.println("      Type: " + c.GetType());
            System.out.println("      Subtype: " + c.GetSubtype());
            System.out.println("      Meta Type: " + c.GetMetaType());
            System.out.println("      State Flags: " + c.GetStateFlags());
            System.out.println("      Alias: " + c.GetAlias());

            Iterator<Property> iterator = c.GetProperties().iterator();

            while (iterator.hasNext())
            {
                Property property = iterator.next();

                System.out.println("      Property: " + property.GetName() + " -> " + property.GetValue());
            }

            for (ConnectorTag ct : c.GetTaggedValues())
            {
                System.out.println("      TaggedValue: " + ct.GetName() + " -> " + ct.GetValue());
            }
        }

        for (Element e : element.GetBaseClasses())
        {
            System.out.println("    Base Class: " + e.GetName());
        }

        for (Element e : element.GetRealizes())
        {
            System.out.println("    Realizes: " + e.GetName());
        }

        for (Attribute a : element.GetAttributesEx())
        {
            System.out.println("    Attribute: " + a.GetName() + ":" + a.GetType() + " -> " + a.GetDefault());
        }

        for (Requirement r : element.GetRequirementsEx())
        {
            System.out.println("    Requirement: " + r.GetName());
        }

        for (Resource r : element.GetResources())
        {
            System.out.println("    Resource: " + r.GetName());
        }

        System.out.println("    Classfier ID: " + element.GetClassfierID());
        System.out.println("    Classifier ID: " + element.GetClassifierID());
        System.out.println("    Classifier Name: " + element.GetClassifierName());
        System.out.println("    Classifier Type: " + element.GetClassifierType());

        System.out.println("    Element GUID: " + element.GetElementGUID());
        System.out.println("    Element ID: " + element.GetElementID());
        System.out.println("    Package ID: " + element.GetPackageID());
        System.out.println("    Parent ID: " + element.GetParentID());

        System.out.println("    Type: " + element.GetType());

        // Iterator<Property> iterator = element.GetProperties().iterator();
        //
        // while (iterator.hasNext())
        // {
        // Property property = iterator.next();
        //
        // System.out.println("    Property: " + property.GetName() + " -> " + property.GetValue());
        // }
    }

    public static void parseConnector(Connector connector)
    {
        Iterator<Property> iter = connector.GetProperties().iterator();

        while (iter.hasNext())
        {
            Property p = iter.next();

            System.out.println(p.GetName() + " -> " + p.GetValue());
        }

        for (ConnectorTag tag : connector.GetTaggedValues())
        {
            System.out.println(tag.GetName() + " -> " + tag.GetValue());
        }

        for (CustomProperty cp : connector.GetCustomProperties())
        {
            System.out.println(cp.GetName() + " -> " + cp.GetValue());
        }

        for (RoleTag rt : connector.GetSupplierEnd().GetTaggedValues())
        {
            System.out.println(rt.GetTag() + " -> " + rt.GetValue());
        }
    }
}
