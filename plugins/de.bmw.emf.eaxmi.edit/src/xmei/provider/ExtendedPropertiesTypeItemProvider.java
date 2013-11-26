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

import xmei.ExtendedPropertiesType;
import xmei.XmeiPackage;

/**
 * This is the item provider adapter for a {@link xmei.ExtendedPropertiesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedPropertiesTypeItemProvider
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
    public ExtendedPropertiesTypeItemProvider(AdapterFactory adapterFactory)
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

            addConditionalPropertyDescriptor(object);
            addDiagramPropertyDescriptor(object);
            addPrivatedata1PropertyDescriptor(object);
            addPrivatedata2PropertyDescriptor(object);
            addPrivatedata3PropertyDescriptor(object);
            addPrivatedata4PropertyDescriptor(object);
            addPrivatedata5PropertyDescriptor(object);
            addSequencePointsPropertyDescriptor(object);
            addStateflagsPropertyDescriptor(object);
            addVirtualInheritancePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Conditional feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConditionalPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_conditional_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_conditional_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__CONDITIONAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Diagram feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiagramPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_diagram_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_diagram_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__DIAGRAM,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Privatedata1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivatedata1PropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_privatedata1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_privatedata1_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Privatedata2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivatedata2PropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_privatedata2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_privatedata2_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Privatedata3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivatedata3PropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_privatedata3_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_privatedata3_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Privatedata4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivatedata4PropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_privatedata4_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_privatedata4_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Privatedata5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivatedata5PropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_privatedata5_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_privatedata5_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sequence Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSequencePointsPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_sequencePoints_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_sequencePoints_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Stateflags feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStateflagsPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_stateflags_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_stateflags_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__STATEFLAGS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Virtual Inheritance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVirtualInheritancePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtendedPropertiesType_virtualInheritance_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedPropertiesType_virtualInheritance_feature", "_UI_ExtendedPropertiesType_type"),
                 XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ExtendedPropertiesType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtendedPropertiesType"));
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
        String label = ((ExtendedPropertiesType)object).getConditional();
        return label == null || label.length() == 0 ?
            getString("_UI_ExtendedPropertiesType_type") :
            getString("_UI_ExtendedPropertiesType_type") + " " + label;
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

        switch (notification.getFeatureID(ExtendedPropertiesType.class))
        {
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__CONDITIONAL:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__DIAGRAM:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__STATEFLAGS:
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE:
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
