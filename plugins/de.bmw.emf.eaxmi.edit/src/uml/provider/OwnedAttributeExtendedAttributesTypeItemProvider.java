/**
 */
package uml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.OwnedAttributeExtendedAttributesType;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.OwnedAttributeExtendedAttributesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OwnedAttributeExtendedAttributesTypeItemProvider
    extends OwnedAttributeBaseTypeItemProvider
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
    public OwnedAttributeExtendedAttributesTypeItemProvider(AdapterFactory adapterFactory)
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

            addAggregationPropertyDescriptor(object);
            addAssociationPropertyDescriptor(object);
            addIsDerivedPropertyDescriptor(object);
            addIsDerivedUnionPropertyDescriptor(object);
            addIsOrderedPropertyDescriptor(object);
            addIsReadOnlyPropertyDescriptor(object);
            addIsStaticPropertyDescriptor(object);
            addIsUniquePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addVisibilityPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aggregation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAggregationPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_aggregation_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_aggregation_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Association feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssociationPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_association_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_association_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Derived feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsDerivedPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_isDerived_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_isDerived_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Derived Union feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsDerivedUnionPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_isDerivedUnion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_isDerivedUnion_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Ordered feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsOrderedPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_isOrdered_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_isOrdered_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Read Only feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsReadOnlyPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_isReadOnly_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_isReadOnly_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Static feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsStaticPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_isStatic_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_isStatic_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Unique feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsUniquePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_isUnique_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_isUnique_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_name_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Visibility feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVisibilityPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedAttributeExtendedAttributesType_visibility_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedAttributeExtendedAttributesType_visibility_feature", "_UI_OwnedAttributeExtendedAttributesType_type"),
                 UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns OwnedAttributeExtendedAttributesType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OwnedAttributeExtendedAttributesType"));
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
        String label = ((OwnedAttributeExtendedAttributesType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_OwnedAttributeExtendedAttributesType_type") :
            getString("_UI_OwnedAttributeExtendedAttributesType_type") + " " + label;
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

        switch (notification.getFeatureID(OwnedAttributeExtendedAttributesType.class))
        {
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME:
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY:
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

}
