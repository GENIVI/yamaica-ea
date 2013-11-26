/**
 */
package uml.provider;


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

import uml.OwnedParameterType;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.OwnedParameterType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OwnedParameterTypeItemProvider
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
    public OwnedParameterTypeItemProvider(AdapterFactory adapterFactory)
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

            addDirectionPropertyDescriptor(object);
            addIdPropertyDescriptor(object);
            addIsExceptionPropertyDescriptor(object);
            addIsOrderedPropertyDescriptor(object);
            addIsStreamPropertyDescriptor(object);
            addIsUniquePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Direction feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectionPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedParameterType_direction_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_direction_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__DIRECTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedParameterType_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_id_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Exception feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsExceptionPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedParameterType_isException_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_isException_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__IS_EXCEPTION,
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
                 getString("_UI_OwnedParameterType_isOrdered_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_isOrdered_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__IS_ORDERED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Stream feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsStreamPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedParameterType_isStream_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_isStream_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__IS_STREAM,
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
                 getString("_UI_OwnedParameterType_isUnique_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_isUnique_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__IS_UNIQUE,
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
                 getString("_UI_OwnedParameterType_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_name_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OwnedParameterType_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OwnedParameterType_type_feature", "_UI_OwnedParameterType_type"),
                 UmlPackage.Literals.OWNED_PARAMETER_TYPE__TYPE,
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
            childrenFeatures.add(UmlPackage.Literals.OWNED_PARAMETER_TYPE__DEFAULT_VALUE);
            childrenFeatures.add(UmlPackage.Literals.OWNED_PARAMETER_TYPE__LOWER_VALUE);
            childrenFeatures.add(UmlPackage.Literals.OWNED_PARAMETER_TYPE__UPPER_VALUE);
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
     * This returns OwnedParameterType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OwnedParameterType"));
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
        String label = ((OwnedParameterType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_OwnedParameterType_type") :
            getString("_UI_OwnedParameterType_type") + " " + label;
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

        switch (notification.getFeatureID(OwnedParameterType.class))
        {
            case UmlPackage.OWNED_PARAMETER_TYPE__DIRECTION:
            case UmlPackage.OWNED_PARAMETER_TYPE__ID:
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_EXCEPTION:
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_ORDERED:
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_STREAM:
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_UNIQUE:
            case UmlPackage.OWNED_PARAMETER_TYPE__NAME:
            case UmlPackage.OWNED_PARAMETER_TYPE__TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE:
            case UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE:
            case UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE:
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
                (UmlPackage.Literals.OWNED_PARAMETER_TYPE__DEFAULT_VALUE,
                 UmlFactory.eINSTANCE.createDefaultValueType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.OWNED_PARAMETER_TYPE__LOWER_VALUE,
                 UmlFactory.eINSTANCE.createMultiplicityValueType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.OWNED_PARAMETER_TYPE__UPPER_VALUE,
                 UmlFactory.eINSTANCE.createMultiplicityValueType()));
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
            childFeature == UmlPackage.Literals.OWNED_PARAMETER_TYPE__LOWER_VALUE ||
            childFeature == UmlPackage.Literals.OWNED_PARAMETER_TYPE__UPPER_VALUE;

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
