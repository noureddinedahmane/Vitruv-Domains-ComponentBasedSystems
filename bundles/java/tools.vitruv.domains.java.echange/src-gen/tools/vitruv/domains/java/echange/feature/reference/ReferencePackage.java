/**
 */
package tools.vitruv.domains.java.echange.feature.reference;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tools.vitruv.domains.java.echange.feature.reference.ReferenceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='Change' basePackage='tools.vitruv.domains.java.echange.feature'"
 * @generated
 */
public interface ReferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tools.vitruv/EChange/Java/Feature/Reference/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reference";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencePackage eINSTANCE = tools.vitruv.domains.java.echange.feature.reference.impl.ReferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link tools.vitruv.domains.java.echange.feature.reference.impl.JavaInsertEReferenceImpl <em>Java Insert EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.domains.java.echange.feature.reference.impl.JavaInsertEReferenceImpl
	 * @see tools.vitruv.domains.java.echange.feature.reference.impl.ReferencePackageImpl#getJavaInsertEReference()
	 * @generated
	 */
	int JAVA_INSERT_EREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Affected Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__AFFECTED_FEATURE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE__AFFECTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Affected EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__AFFECTED_EOBJECT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE__AFFECTED_EOBJECT;

	/**
	 * The feature id for the '<em><b>Affected EObject ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__AFFECTED_EOBJECT_ID = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE__AFFECTED_EOBJECT_ID;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__INDEX = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE__INDEX;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__NEW_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__NEW_VALUE_ID = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE__NEW_VALUE_ID;

	/**
	 * The feature id for the '<em><b>Was Unset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__WAS_UNSET = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE__WAS_UNSET;

	/**
	 * The feature id for the '<em><b>Old Affected EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE__OLD_AFFECTED_EOBJECT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Insert EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE_FEATURE_COUNT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE___IS_RESOLVED = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE___IS_RESOLVED;

	/**
	 * The operation id for the '<em>Get Involved EObjects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE___GET_INVOLVED_EOBJECTS = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE___GET_INVOLVED_EOBJECTS;

	/**
	 * The operation id for the '<em>Get New Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE___GET_NEW_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE___GET_NEW_VALUE;

	/**
	 * The operation id for the '<em>Is Containment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE___IS_CONTAINMENT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE___IS_CONTAINMENT;

	/**
	 * The number of operations of the '<em>Java Insert EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INSERT_EREFERENCE_OPERATION_COUNT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.INSERT_EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.domains.java.echange.feature.reference.impl.JavaRemoveEReferenceImpl <em>Java Remove EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.domains.java.echange.feature.reference.impl.JavaRemoveEReferenceImpl
	 * @see tools.vitruv.domains.java.echange.feature.reference.impl.ReferencePackageImpl#getJavaRemoveEReference()
	 * @generated
	 */
	int JAVA_REMOVE_EREFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Affected Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE__AFFECTED_FEATURE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE__AFFECTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Affected EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE__AFFECTED_EOBJECT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE__AFFECTED_EOBJECT;

	/**
	 * The feature id for the '<em><b>Affected EObject ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE__AFFECTED_EOBJECT_ID = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE__AFFECTED_EOBJECT_ID;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE__INDEX = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE__INDEX;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE__OLD_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE__OLD_VALUE;

	/**
	 * The feature id for the '<em><b>Old Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE__OLD_VALUE_ID = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE__OLD_VALUE_ID;

	/**
	 * The feature id for the '<em><b>Old Affected EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE__OLD_AFFECTED_EOBJECT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Remove EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE_FEATURE_COUNT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE___IS_RESOLVED = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE___IS_RESOLVED;

	/**
	 * The operation id for the '<em>Get Involved EObjects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE___GET_INVOLVED_EOBJECTS = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE___GET_INVOLVED_EOBJECTS;

	/**
	 * The operation id for the '<em>Get Old Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE___GET_OLD_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE___GET_OLD_VALUE;

	/**
	 * The operation id for the '<em>Is Containment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE___IS_CONTAINMENT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE___IS_CONTAINMENT;

	/**
	 * The number of operations of the '<em>Java Remove EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REMOVE_EREFERENCE_OPERATION_COUNT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REMOVE_EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.domains.java.echange.feature.reference.impl.JavaReplaceSingleValuedEReferenceImpl <em>Java Replace Single Valued EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.domains.java.echange.feature.reference.impl.JavaReplaceSingleValuedEReferenceImpl
	 * @see tools.vitruv.domains.java.echange.feature.reference.impl.ReferencePackageImpl#getJavaReplaceSingleValuedEReference()
	 * @generated
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Affected Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__AFFECTED_FEATURE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__AFFECTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Affected EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__AFFECTED_EOBJECT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__AFFECTED_EOBJECT;

	/**
	 * The feature id for the '<em><b>Affected EObject ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__AFFECTED_EOBJECT_ID = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__AFFECTED_EOBJECT_ID;

	/**
	 * The feature id for the '<em><b>Is Unset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__IS_UNSET = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__IS_UNSET;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__NEW_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__NEW_VALUE_ID = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__NEW_VALUE_ID;

	/**
	 * The feature id for the '<em><b>Was Unset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__WAS_UNSET = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__WAS_UNSET;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__OLD_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__OLD_VALUE;

	/**
	 * The feature id for the '<em><b>Old Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__OLD_VALUE_ID = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE__OLD_VALUE_ID;

	/**
	 * The feature id for the '<em><b>Old Affected EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE__OLD_AFFECTED_EOBJECT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Replace Single Valued EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE_FEATURE_COUNT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE___IS_RESOLVED = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE___IS_RESOLVED;

	/**
	 * The operation id for the '<em>Get Involved EObjects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE___GET_INVOLVED_EOBJECTS = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE___GET_INVOLVED_EOBJECTS;

	/**
	 * The operation id for the '<em>Get New Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE___GET_NEW_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE___GET_NEW_VALUE;

	/**
	 * The operation id for the '<em>Get Old Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE___GET_OLD_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE___GET_OLD_VALUE;

	/**
	 * The operation id for the '<em>Is From Non Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE___IS_FROM_NON_DEFAULT_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE___IS_FROM_NON_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Is To Non Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE___IS_TO_NON_DEFAULT_VALUE = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE___IS_TO_NON_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Is Containment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE___IS_CONTAINMENT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE___IS_CONTAINMENT;

	/**
	 * The number of operations of the '<em>Java Replace Single Valued EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REPLACE_SINGLE_VALUED_EREFERENCE_OPERATION_COUNT = tools.vitruv.framework.change.echange.feature.reference.ReferencePackage.REPLACE_SINGLE_VALUED_EREFERENCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tools.vitruv.domains.java.echange.feature.reference.JavaInsertEReference <em>Java Insert EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Insert EReference</em>'.
	 * @see tools.vitruv.domains.java.echange.feature.reference.JavaInsertEReference
	 * @generated
	 */
	EClass getJavaInsertEReference();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.domains.java.echange.feature.reference.JavaRemoveEReference <em>Java Remove EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Remove EReference</em>'.
	 * @see tools.vitruv.domains.java.echange.feature.reference.JavaRemoveEReference
	 * @generated
	 */
	EClass getJavaRemoveEReference();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.domains.java.echange.feature.reference.JavaReplaceSingleValuedEReference <em>Java Replace Single Valued EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Replace Single Valued EReference</em>'.
	 * @see tools.vitruv.domains.java.echange.feature.reference.JavaReplaceSingleValuedEReference
	 * @generated
	 */
	EClass getJavaReplaceSingleValuedEReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferenceFactory getReferenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tools.vitruv.domains.java.echange.feature.reference.impl.JavaInsertEReferenceImpl <em>Java Insert EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.domains.java.echange.feature.reference.impl.JavaInsertEReferenceImpl
		 * @see tools.vitruv.domains.java.echange.feature.reference.impl.ReferencePackageImpl#getJavaInsertEReference()
		 * @generated
		 */
		EClass JAVA_INSERT_EREFERENCE = eINSTANCE.getJavaInsertEReference();

		/**
		 * The meta object literal for the '{@link tools.vitruv.domains.java.echange.feature.reference.impl.JavaRemoveEReferenceImpl <em>Java Remove EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.domains.java.echange.feature.reference.impl.JavaRemoveEReferenceImpl
		 * @see tools.vitruv.domains.java.echange.feature.reference.impl.ReferencePackageImpl#getJavaRemoveEReference()
		 * @generated
		 */
		EClass JAVA_REMOVE_EREFERENCE = eINSTANCE.getJavaRemoveEReference();

		/**
		 * The meta object literal for the '{@link tools.vitruv.domains.java.echange.feature.reference.impl.JavaReplaceSingleValuedEReferenceImpl <em>Java Replace Single Valued EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.domains.java.echange.feature.reference.impl.JavaReplaceSingleValuedEReferenceImpl
		 * @see tools.vitruv.domains.java.echange.feature.reference.impl.ReferencePackageImpl#getJavaReplaceSingleValuedEReference()
		 * @generated
		 */
		EClass JAVA_REPLACE_SINGLE_VALUED_EREFERENCE = eINSTANCE.getJavaReplaceSingleValuedEReference();

	}

} //ReferencePackage
