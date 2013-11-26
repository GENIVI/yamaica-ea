/**
 */
package uml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.UmlFactory;
import uml.UmlInterfaceType;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.UmlInterfaceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlInterfaceTypeItemProvider
    extends PackagedElementPackageTypeItemProvider
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
    public UmlInterfaceTypeItemProvider(AdapterFactory adapterFactory)
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

            addIsAbstractPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_UmlInterfaceType_isAbstract_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UmlInterfaceType_isAbstract_feature", "_UI_UmlInterfaceType_type"),
                 UmlPackage.Literals.UML_INTERFACE_TYPE__IS_ABSTRACT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
            childrenFeatures.add(UmlPackage.Literals.UML_INTERFACE_TYPE__GENERALIZATION);
            childrenFeatures.add(UmlPackage.Literals.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE);
            childrenFeatures.add(UmlPackage.Literals.UML_INTERFACE_TYPE__OWNED_OPERATION);
            childrenFeatures.add(UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER);
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
     * This returns UmlInterfaceType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/UmlInterfaceType"));
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
        String label = ((UmlInterfaceType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_UmlInterfaceType_type") :
            getString("_UI_UmlInterfaceType_type") + " " + label;
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

        switch (notification.getFeatureID(UmlInterfaceType.class))
        {
            case UmlPackage.UML_INTERFACE_TYPE__IS_ABSTRACT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case UmlPackage.UML_INTERFACE_TYPE__GENERALIZATION:
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE:
            case UmlPackage.UML_INTERFACE_TYPE__OWNED_OPERATION:
            case UmlPackage.UML_INTERFACE_TYPE__NESTED_CLASSIFIER:
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
                (UmlPackage.Literals.UML_INTERFACE_TYPE__GENERALIZATION,
                 UmlFactory.eINSTANCE.createGeneralizationType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE,
                 UmlFactory.eINSTANCE.createOwnedAttributeBaseType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE,
                 UmlFactory.eINSTANCE.createOwnedAttributeExtendedAttributesType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__OWNED_ATTRIBUTE,
                 UmlFactory.eINSTANCE.createOwnedAttributeExtendedContentType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__OWNED_OPERATION,
                 UmlFactory.eINSTANCE.createOwnedOperationType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createPackagedElementBaseType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createOwnedOperationType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createPackagedElementAssociationType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createPackagedElementInstanceSpecificationType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createPackagedElementPackageType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createPackagedElementRelationType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createPackageImportType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createUmlClassType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createUmlEnumerationType()));

        newChildDescriptors.add
            (createChildParameter
                (UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER,
                 UmlFactory.eINSTANCE.createUmlInterfaceType()));
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
            childFeature == UmlPackage.Literals.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT ||
            childFeature == UmlPackage.Literals.PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT ||
            childFeature == UmlPackage.Literals.UML_INTERFACE_TYPE__NESTED_CLASSIFIER ||
            childFeature == UmlPackage.Literals.UML_INTERFACE_TYPE__OWNED_OPERATION;

        if (qualify)
        {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
