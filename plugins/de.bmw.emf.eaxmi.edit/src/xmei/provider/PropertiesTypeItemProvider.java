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

import xmei.PropertiesType;
import xmei.XmeiPackage;

/**
 * This is the item provider adapter for a {@link xmei.PropertiesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesTypeItemProvider
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
    public PropertiesTypeItemProvider(AdapterFactory adapterFactory)
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

            addClassNamePropertyDescriptor(object);
            addDocumentationPropertyDescriptor(object);
            addGenlinksPropertyDescriptor(object);
            addIsAbstractPropertyDescriptor(object);
            addIsActivePropertyDescriptor(object);
            addIsLeafPropertyDescriptor(object);
            addIsRootPropertyDescriptor(object);
            addIsSpecificationPropertyDescriptor(object);
            addScopePropertyDescriptor(object);
            addStereotypePropertyDescriptor(object);
            addSTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Class Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClassNamePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_className_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_className_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__CLASS_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Documentation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDocumentationPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_documentation_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_documentation_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__DOCUMENTATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Genlinks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenlinksPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_genlinks_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_genlinks_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__GENLINKS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_PropertiesType_isAbstract_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_isAbstract_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__IS_ABSTRACT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Active feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsActivePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_isActive_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_isActive_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__IS_ACTIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Leaf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsLeafPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_isLeaf_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_isLeaf_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__IS_LEAF,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Root feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsRootPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_isRoot_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_isRoot_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__IS_ROOT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Specification feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSpecificationPropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_isSpecification_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_isSpecification_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__IS_SPECIFICATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_PropertiesType_scope_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_scope_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__SCOPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_PropertiesType_stereotype_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_stereotype_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__STEREOTYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the SType feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSTypePropertyDescriptor(Object object)
    {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PropertiesType_sType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PropertiesType_sType_feature", "_UI_PropertiesType_type"),
                 XmeiPackage.Literals.PROPERTIES_TYPE__STYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns PropertiesType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertiesType"));
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
        String label = ((PropertiesType)object).getClassName();
        return label == null || label.length() == 0 ?
            getString("_UI_PropertiesType_type") :
            getString("_UI_PropertiesType_type") + " " + label;
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

        switch (notification.getFeatureID(PropertiesType.class))
        {
            case XmeiPackage.PROPERTIES_TYPE__CLASS_NAME:
            case XmeiPackage.PROPERTIES_TYPE__DOCUMENTATION:
            case XmeiPackage.PROPERTIES_TYPE__GENLINKS:
            case XmeiPackage.PROPERTIES_TYPE__IS_ABSTRACT:
            case XmeiPackage.PROPERTIES_TYPE__IS_ACTIVE:
            case XmeiPackage.PROPERTIES_TYPE__IS_LEAF:
            case XmeiPackage.PROPERTIES_TYPE__IS_ROOT:
            case XmeiPackage.PROPERTIES_TYPE__IS_SPECIFICATION:
            case XmeiPackage.PROPERTIES_TYPE__SCOPE:
            case XmeiPackage.PROPERTIES_TYPE__STEREOTYPE:
            case XmeiPackage.PROPERTIES_TYPE__STYPE:
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
