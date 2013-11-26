/**
 */
package xmei.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.provider.Franca2EA_XMI_SchemaEditPlugin;

import xmei.ConnectorType;
import xmei.XmeiFactory;
import xmei.XmeiPackage;

/**
 * This is the item provider adapter for a {@link xmei.ConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorTypeItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorTypeItemProvider(AdapterFactory adapterFactory)
    {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
    {
        if (itemPropertyDescriptors == null)
        {
            super.getPropertyDescriptors(object);

            addIdrefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Idref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdrefPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorType_idref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_idref_feature", "_UI_ConnectorType_type"),
                 XmeiPackage.Literals.CONNECTOR_TYPE__IDREF,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
    {
        if (childrenFeatures == null)
        {
            super.getChildrenFeatures(object);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__SOURCE);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__TARGET);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__MODEL);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__PROPERTIES);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__MODIFIERS);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__DOCUMENTATION);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__APPEARANCE);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__LABELS);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__EXTENDED_PROPERTIES);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__STYLE);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__XREFS);
            childrenFeatures.add(XmeiPackage.Literals.CONNECTOR_TYPE__TAGS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child)
    {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ConnectorType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectorType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object)
    {
        String label = ((ConnectorType)object).getIdref();
        return label == null || label.length() == 0 ?
            getString("_UI_ConnectorType_type") :
            getString("_UI_ConnectorType_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification)
    {
        updateChildren(notification);

        switch (notification.getFeatureID(ConnectorType.class))
        {
            case XmeiPackage.CONNECTOR_TYPE__IDREF:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case XmeiPackage.CONNECTOR_TYPE__SOURCE:
            case XmeiPackage.CONNECTOR_TYPE__TARGET:
            case XmeiPackage.CONNECTOR_TYPE__MODEL:
            case XmeiPackage.CONNECTOR_TYPE__PROPERTIES:
            case XmeiPackage.CONNECTOR_TYPE__MODIFIERS:
            case XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION:
            case XmeiPackage.CONNECTOR_TYPE__APPEARANCE:
            case XmeiPackage.CONNECTOR_TYPE__LABELS:
            case XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES:
            case XmeiPackage.CONNECTOR_TYPE__STYLE:
            case XmeiPackage.CONNECTOR_TYPE__XREFS:
            case XmeiPackage.CONNECTOR_TYPE__TAGS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
    {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__SOURCE,
                 XmeiFactory.eINSTANCE.createSourceAndTargetType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__TARGET,
                 XmeiFactory.eINSTANCE.createSourceAndTargetType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__MODEL,
                 XmeiFactory.eINSTANCE.createConnectorModelType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__PROPERTIES,
                 XmeiFactory.eINSTANCE.createConnectorPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__MODIFIERS,
                 XmeiFactory.eINSTANCE.createConnectorModifiersType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__DOCUMENTATION,
                 XmeiFactory.eINSTANCE.createDocumentationType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__APPEARANCE,
                 XmeiFactory.eINSTANCE.createConnectorAppearanceType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__LABELS,
                 XmeiFactory.eINSTANCE.createConnectorLabelsType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__EXTENDED_PROPERTIES,
                 XmeiFactory.eINSTANCE.createExtendedPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__STYLE,
                 XmeiFactory.eINSTANCE.createDocumentationType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__XREFS,
                 XmeiFactory.eINSTANCE.createXrefsType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.CONNECTOR_TYPE__TAGS,
                 XmeiFactory.eINSTANCE.createOperationTagsType()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
    {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == XmeiPackage.Literals.CONNECTOR_TYPE__SOURCE ||
            childFeature == XmeiPackage.Literals.CONNECTOR_TYPE__TARGET ||
            childFeature == XmeiPackage.Literals.CONNECTOR_TYPE__DOCUMENTATION ||
            childFeature == XmeiPackage.Literals.CONNECTOR_TYPE__STYLE;

        if (qualify)
        {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator()
    {
        return Franca2EA_XMI_SchemaEditPlugin.INSTANCE;
    }

}
