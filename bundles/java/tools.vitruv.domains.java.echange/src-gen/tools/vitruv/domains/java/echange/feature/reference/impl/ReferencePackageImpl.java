/**
 */
package tools.vitruv.domains.java.echange.feature.reference.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tools.vitruv.domains.java.echange.feature.attribute.impl.AttributePackageImpl;

import tools.vitruv.domains.java.echange.feature.impl.FeaturePackageImpl;

import tools.vitruv.domains.java.echange.feature.reference.JavaInsertEReference;
import tools.vitruv.domains.java.echange.feature.reference.JavaRemoveEReference;
import tools.vitruv.domains.java.echange.feature.reference.JavaReplaceSingleValuedEReference;
import tools.vitruv.domains.java.echange.feature.reference.ReferenceFactory;
import tools.vitruv.domains.java.echange.feature.reference.ReferencePackage;

import tools.vitruv.framework.change.echange.EChangePackage;

import tools.vitruv.framework.change.echange.eobject.EobjectPackage;

import tools.vitruv.framework.change.echange.feature.FeaturePackage;

import tools.vitruv.framework.change.echange.feature.attribute.AttributePackage;

import tools.vitruv.framework.change.echange.feature.list.ListPackage;

import tools.vitruv.framework.change.echange.feature.single.SinglePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencePackageImpl extends EPackageImpl implements ReferencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaInsertEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaRemoveEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaReplaceSingleValuedEReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tools.vitruv.domains.java.echange.feature.reference.ReferencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferencePackageImpl() {
		super(eNS_URI, ReferenceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ReferencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferencePackage init() {
		if (isInited) return (ReferencePackage)EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI);

		// Obtain or create and register package
		ReferencePackageImpl theReferencePackage = (ReferencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReferencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReferencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AttributePackage.eINSTANCE.eClass();
		FeaturePackage.eINSTANCE.eClass();
		EChangePackage.eINSTANCE.eClass();
		ListPackage.eINSTANCE.eClass();
		SinglePackage.eINSTANCE.eClass();
		tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.eINSTANCE.eClass();
		EobjectPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		tools.vitruv.framework.uuid.UuidPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AttributePackageImpl theAttributePackage_1 = (AttributePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tools.vitruv.domains.java.echange.feature.attribute.AttributePackage.eNS_URI) instanceof AttributePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tools.vitruv.domains.java.echange.feature.attribute.AttributePackage.eNS_URI) : tools.vitruv.domains.java.echange.feature.attribute.AttributePackage.eINSTANCE);
		FeaturePackageImpl theFeaturePackage_1 = (FeaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tools.vitruv.domains.java.echange.feature.FeaturePackage.eNS_URI) instanceof FeaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tools.vitruv.domains.java.echange.feature.FeaturePackage.eNS_URI) : tools.vitruv.domains.java.echange.feature.FeaturePackage.eINSTANCE);

		// Create package meta-data objects
		theReferencePackage.createPackageContents();
		theAttributePackage_1.createPackageContents();
		theFeaturePackage_1.createPackageContents();

		// Initialize created meta-data
		theReferencePackage.initializePackageContents();
		theAttributePackage_1.initializePackageContents();
		theFeaturePackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferencePackage.eNS_URI, theReferencePackage);
		return theReferencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaInsertEReference() {
		return javaInsertEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaRemoveEReference() {
		return javaRemoveEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaReplaceSingleValuedEReference() {
		return javaReplaceSingleValuedEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFactory getReferenceFactory() {
		return (ReferenceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		javaInsertEReferenceEClass = createEClass(JAVA_INSERT_EREFERENCE);

		javaRemoveEReferenceEClass = createEClass(JAVA_REMOVE_EREFERENCE);

		javaReplaceSingleValuedEReferenceEClass = createEClass(JAVA_REPLACE_SINGLE_VALUED_EREFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		tools.vitruv.framework.change.echange.feature.reference.ReferencePackage theReferencePackage_1 = (tools.vitruv.framework.change.echange.feature.reference.ReferencePackage)EPackage.Registry.INSTANCE.getEPackage(tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.eNS_URI);
		tools.vitruv.domains.java.echange.feature.FeaturePackage theFeaturePackage_1 = (tools.vitruv.domains.java.echange.feature.FeaturePackage)EPackage.Registry.INSTANCE.getEPackage(tools.vitruv.domains.java.echange.feature.FeaturePackage.eNS_URI);

		// Create type parameters
		ETypeParameter javaInsertEReferenceEClass_A = addETypeParameter(javaInsertEReferenceEClass, "A");
		ETypeParameter javaInsertEReferenceEClass_T = addETypeParameter(javaInsertEReferenceEClass, "T");
		ETypeParameter javaRemoveEReferenceEClass_A = addETypeParameter(javaRemoveEReferenceEClass, "A");
		ETypeParameter javaRemoveEReferenceEClass_T = addETypeParameter(javaRemoveEReferenceEClass, "T");
		ETypeParameter javaReplaceSingleValuedEReferenceEClass_A = addETypeParameter(javaReplaceSingleValuedEReferenceEClass, "A");
		ETypeParameter javaReplaceSingleValuedEReferenceEClass_T = addETypeParameter(javaReplaceSingleValuedEReferenceEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theEcorePackage.getEObject());
		javaInsertEReferenceEClass_A.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		javaInsertEReferenceEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		javaRemoveEReferenceEClass_A.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		javaRemoveEReferenceEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		javaReplaceSingleValuedEReferenceEClass_A.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		javaReplaceSingleValuedEReferenceEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theReferencePackage_1.getInsertEReference());
		EGenericType g2 = createEGenericType(javaInsertEReferenceEClass_A);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(javaInsertEReferenceEClass_T);
		g1.getETypeArguments().add(g2);
		javaInsertEReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFeaturePackage_1.getJavaFeatureEChange());
		g2 = createEGenericType(javaInsertEReferenceEClass_A);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEReference());
		g1.getETypeArguments().add(g2);
		javaInsertEReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theReferencePackage_1.getRemoveEReference());
		g2 = createEGenericType(javaRemoveEReferenceEClass_A);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(javaRemoveEReferenceEClass_T);
		g1.getETypeArguments().add(g2);
		javaRemoveEReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFeaturePackage_1.getJavaFeatureEChange());
		g2 = createEGenericType(javaRemoveEReferenceEClass_A);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEReference());
		g1.getETypeArguments().add(g2);
		javaRemoveEReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theReferencePackage_1.getReplaceSingleValuedEReference());
		g2 = createEGenericType(javaReplaceSingleValuedEReferenceEClass_A);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(javaReplaceSingleValuedEReferenceEClass_T);
		g1.getETypeArguments().add(g2);
		javaReplaceSingleValuedEReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFeaturePackage_1.getJavaFeatureEChange());
		g2 = createEGenericType(javaReplaceSingleValuedEReferenceEClass_A);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEReference());
		g1.getETypeArguments().add(g2);
		javaReplaceSingleValuedEReferenceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(javaInsertEReferenceEClass, JavaInsertEReference.class, "JavaInsertEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaRemoveEReferenceEClass, JavaRemoveEReference.class, "JavaRemoveEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaReplaceSingleValuedEReferenceEClass, JavaReplaceSingleValuedEReference.class, "JavaReplaceSingleValuedEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ReferencePackageImpl
