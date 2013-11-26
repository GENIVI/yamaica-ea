/**
 */
package xmei.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import xmei.ConnectorAppearanceType;
import xmei.XmeiPackage;

/**
 * This is the item provider adapter for a {@link xmei.ConnectorAppearanceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorAppearanceTypeItemProvider
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
    public ConnectorAppearanceTypeItemProvider(AdapterFactory adapterFactory)
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

            addHeadStylePropertyDescriptor(object);
            addLinecolorPropertyDescriptor(object);
            addLinemodePropertyDescriptor(object);
            addLineStylePropertyDescriptor(object);
            addLinewidthPropertyDescriptor(object);
            addSeqnoPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Head Style feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeadStylePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorAppearanceType_headStyle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorAppearanceType_headStyle_feature", "_UI_ConnectorAppearanceType_type"),
                 XmeiPackage.Literals.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Linecolor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLinecolorPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorAppearanceType_linecolor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorAppearanceType_linecolor_feature", "_UI_ConnectorAppearanceType_type"),
                 XmeiPackage.Literals.CONNECTOR_APPEARANCE_TYPE__LINECOLOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Linemode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLinemodePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorAppearanceType_linemode_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorAppearanceType_linemode_feature", "_UI_ConnectorAppearanceType_type"),
                 XmeiPackage.Literals.CONNECTOR_APPEARANCE_TYPE__LINEMODE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Line Style feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLineStylePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorAppearanceType_lineStyle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorAppearanceType_lineStyle_feature", "_UI_ConnectorAppearanceType_type"),
                 XmeiPackage.Literals.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Linewidth feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLinewidthPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorAppearanceType_linewidth_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorAppearanceType_linewidth_feature", "_UI_ConnectorAppearanceType_type"),
                 XmeiPackage.Literals.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Seqno feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeqnoPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConnectorAppearanceType_seqno_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorAppearanceType_seqno_feature", "_UI_ConnectorAppearanceType_type"),
                 XmeiPackage.Literals.CONNECTOR_APPEARANCE_TYPE__SEQNO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ConnectorAppearanceType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectorAppearanceType"));
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
        ConnectorAppearanceType connectorAppearanceType = (ConnectorAppearanceType)object;
        return getString("_UI_ConnectorAppearanceType_type") + " " + connectorAppearanceType.getHeadStyle();
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

        switch (notification.getFeatureID(ConnectorAppearanceType.class))
        {
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE:
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINECOLOR:
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEMODE:
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE:
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH:
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__SEQNO:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
