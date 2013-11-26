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

import xmei.OperationTypeType;
import xmei.XmeiPackage;

/**
 * This is the item provider adapter for a {@link xmei.OperationTypeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationTypeTypeItemProvider
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
    public OperationTypeTypeItemProvider(AdapterFactory adapterFactory)
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

            addConcurrencyPropertyDescriptor(object);
            addConstPropertyDescriptor(object);
            addIsAbstractPropertyDescriptor(object);
            addIsQueryPropertyDescriptor(object);
            addPurePropertyDescriptor(object);
            addReturnarrayPropertyDescriptor(object);
            addStaticPropertyDescriptor(object);
            addStereotypePropertyDescriptor(object);
            addSynchronisedPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Concurrency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConcurrencyPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_concurrency_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_concurrency_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__CONCURRENCY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Const feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConstPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_const_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_const_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__CONST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Abstract feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsAbstractPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_isAbstract_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_isAbstract_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__IS_ABSTRACT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Query feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsQueryPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_isQuery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_isQuery_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__IS_QUERY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pure feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPurePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_pure_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_pure_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__PURE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Returnarray feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReturnarrayPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_returnarray_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_returnarray_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__RETURNARRAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Static feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStaticPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_static_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_static_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__STATIC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Stereotype feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStereotypePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_stereotype_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_stereotype_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__STEREOTYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Synchronised feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchronisedPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OperationTypeType_synchronised_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OperationTypeType_synchronised_feature", "_UI_OperationTypeType_type"),
                 XmeiPackage.Literals.OPERATION_TYPE_TYPE__SYNCHRONISED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns OperationTypeType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationTypeType"));
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
        String label = ((OperationTypeType)object).getConcurrency();
        return label == null || label.length() == 0 ?
            getString("_UI_OperationTypeType_type") :
            getString("_UI_OperationTypeType_type") + " " + label;
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

        switch (notification.getFeatureID(OperationTypeType.class))
        {
            case XmeiPackage.OPERATION_TYPE_TYPE__CONCURRENCY:
            case XmeiPackage.OPERATION_TYPE_TYPE__CONST:
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_ABSTRACT:
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_QUERY:
            case XmeiPackage.OPERATION_TYPE_TYPE__PURE:
            case XmeiPackage.OPERATION_TYPE_TYPE__RETURNARRAY:
            case XmeiPackage.OPERATION_TYPE_TYPE__STATIC:
            case XmeiPackage.OPERATION_TYPE_TYPE__STEREOTYPE:
            case XmeiPackage.OPERATION_TYPE_TYPE__SYNCHRONISED:
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
