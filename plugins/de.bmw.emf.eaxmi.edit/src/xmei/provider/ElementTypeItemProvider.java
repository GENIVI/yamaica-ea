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

import xmei.ElementType;
import xmei.XmeiFactory;
import xmei.XmeiPackage;

/**
 * This is the item provider adapter for a {@link xmei.ElementType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementTypeItemProvider
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
    public ElementTypeItemProvider(AdapterFactory adapterFactory)
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
            addNamePropertyDescriptor(object);
            addScopePropertyDescriptor(object);
            addTypePropertyDescriptor(object);
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
                 getString("_UI_ElementType_idref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ElementType_idref_feature", "_UI_ElementType_type"),
                 XmeiPackage.Literals.ELEMENT_TYPE__IDREF,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_ElementType_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ElementType_name_feature", "_UI_ElementType_type"),
                 XmeiPackage.Literals.ELEMENT_TYPE__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Scope feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScopePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ElementType_scope_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ElementType_scope_feature", "_UI_ElementType_type"),
                 XmeiPackage.Literals.ELEMENT_TYPE__SCOPE,
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
                 getString("_UI_ElementType_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ElementType_type_feature", "_UI_ElementType_type"),
                 XmeiPackage.Literals.ELEMENT_TYPE__TYPE,
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
            childrenFeatures.add(XmeiPackage.Literals.ELEMENT_TYPE__MODEL);
            childrenFeatures.add(XmeiPackage.Literals.ELEMENT_TYPE__PROPERTIES);
            childrenFeatures.add(XmeiPackage.Literals.ELEMENT_TYPE__PROJECT);
            childrenFeatures.add(XmeiPackage.Literals.ELEMENT_TYPE__CODE);
            childrenFeatures.add(XmeiPackage.Literals.ELEMENT_TYPE__LINKS);
            childrenFeatures.add(XmeiPackage.Literals.ELEMENT_TYPE__ATTRIBUTES);
            childrenFeatures.add(XmeiPackage.Literals.ELEMENT_TYPE__OPERATIONS);
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
     * This returns ElementType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementType"));
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
        String label = ((ElementType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ElementType_type") :
            getString("_UI_ElementType_type") + " " + label;
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

        switch (notification.getFeatureID(ElementType.class))
        {
            case XmeiPackage.ELEMENT_TYPE__IDREF:
            case XmeiPackage.ELEMENT_TYPE__NAME:
            case XmeiPackage.ELEMENT_TYPE__SCOPE:
            case XmeiPackage.ELEMENT_TYPE__TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case XmeiPackage.ELEMENT_TYPE__MODEL:
            case XmeiPackage.ELEMENT_TYPE__PROPERTIES:
            case XmeiPackage.ELEMENT_TYPE__PROJECT:
            case XmeiPackage.ELEMENT_TYPE__CODE:
            case XmeiPackage.ELEMENT_TYPE__LINKS:
            case XmeiPackage.ELEMENT_TYPE__ATTRIBUTES:
            case XmeiPackage.ELEMENT_TYPE__OPERATIONS:
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
                (XmeiPackage.Literals.ELEMENT_TYPE__MODEL,
                 XmeiFactory.eINSTANCE.createModelType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.ELEMENT_TYPE__PROPERTIES,
                 XmeiFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.ELEMENT_TYPE__PROJECT,
                 XmeiFactory.eINSTANCE.createProjectType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.ELEMENT_TYPE__CODE,
                 XmeiFactory.eINSTANCE.createCodeType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.ELEMENT_TYPE__LINKS,
                 XmeiFactory.eINSTANCE.createLinksType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.ELEMENT_TYPE__ATTRIBUTES,
                 XmeiFactory.eINSTANCE.createAttributesType()));

        newChildDescriptors.add
            (createChildParameter
                (XmeiPackage.Literals.ELEMENT_TYPE__OPERATIONS,
                 XmeiFactory.eINSTANCE.createOperationsType()));
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
