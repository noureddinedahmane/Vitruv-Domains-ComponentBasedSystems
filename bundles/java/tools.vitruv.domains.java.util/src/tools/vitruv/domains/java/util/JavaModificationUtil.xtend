package tools.vitruv.domains.java.util

import edu.kit.ipd.sdq.activextendannotations.Utility
import org.apache.log4j.Logger
import org.emftext.language.java.types.NamespaceClassifierReference
import org.emftext.language.java.types.TypesFactory
import org.emftext.language.java.parameters.Parameter
import org.emftext.language.java.types.TypeReference
import org.emftext.language.java.parameters.ParametersFactory
import org.emftext.language.java.statements.StatementsFactory
import org.emftext.language.java.expressions.ExpressionsFactory
import org.emftext.language.java.members.Field
import org.emftext.language.java.statements.Statement
import org.emftext.language.java.references.ReferencesFactory
import org.emftext.language.java.literals.LiteralsFactory
import org.emftext.language.java.operators.OperatorsFactory
import org.emftext.language.java.imports.Import
import org.emftext.language.java.classifiers.ConcreteClassifier
import org.emftext.language.java.classifiers.Classifier
import org.emftext.language.java.imports.ImportsFactory
import org.emftext.language.java.containers.CompilationUnit
import org.emftext.language.java.types.PrimitiveType
import org.emftext.language.java.types.Char
import org.emftext.language.java.types.Int
import tools.vitruv.domains.java.util.jamoppparser.JamoppParser
import tools.vitruv.framework.util.datatypes.VURI
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.util.EcoreUtil
import org.emftext.language.java.containers.JavaRoot
import org.emftext.language.java.modifiers.ModifiersFactory
import org.emftext.language.java.imports.ClassifierImport
import org.emftext.language.java.JavaClasspath
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import static tools.vitruv.domains.java.util.JavaQueryUtil.*
import org.emftext.language.java.modifiers.AnnotableAndModifiable
import org.emftext.language.java.annotations.AnnotationsFactory
import org.emftext.language.java.classifiers.ClassifiersFactory
import java.util.List
import org.emftext.language.java.members.Constructor
import org.emftext.language.java.classifiers.Class
import org.emftext.language.java.members.MembersFactory
import org.emftext.language.java.instantiations.NewConstructorCall
import org.emftext.language.java.references.IdentifierReference
import java.util.ArrayList
import org.emftext.language.java.references.ReferenceableElement

@Utility 
class JavaModificationUtil {
	private static val Logger logger = Logger.getLogger(JavaModificationUtil)
	
	def static Parameter createOrdinaryParameter(TypeReference typeReference, String name) {
		val parameter = ParametersFactory.eINSTANCE.createOrdinaryParameter
		parameter.name = name
		parameter.typeReference = typeReference
		return parameter
	}
	
	def static Statement createAssignmentFromParameterToField(Field field, Parameter parameter) {
		val expressionStatement = StatementsFactory.eINSTANCE.createExpressionStatement
		val assigmentExpression = ExpressionsFactory.eINSTANCE.createAssignmentExpression

		// this.
		val selfReference = ReferencesFactory.eINSTANCE.createSelfReference
		selfReference.self = LiteralsFactory.eINSTANCE.createThis
		assigmentExpression.child = selfReference

		// .fieldname
		val fieldReference = ReferencesFactory.eINSTANCE.createIdentifierReference
		fieldReference.target = field
		selfReference.next = fieldReference

		// =
		assigmentExpression.assignmentOperator = OperatorsFactory.eINSTANCE.createAssignment

		// name		
		val identifierReference = ReferencesFactory.eINSTANCE.createIdentifierReference
		identifierReference.target = parameter

		assigmentExpression.value = identifierReference
		expressionStatement.expression = assigmentExpression
		return expressionStatement
	}

	def static NamespaceClassifierReference createNamespaceClassifierReference(ConcreteClassifier concreteClassifier) {
		val namespaceClassifierReference = TypesFactory.eINSTANCE.createNamespaceClassifierReference
		val classifierRef = TypesFactory.eINSTANCE.createClassifierReference
		classifierRef.target = concreteClassifier
		namespaceClassifierReference.classifierReferences.add(classifierRef)

		// namespaceClassifierReference.namespaces.addAll(concreteClassifier.containingCompilationUnit.namespaces)
		return namespaceClassifierReference
	}

	def static Import addImportToCompilationUnitOfClassifier(Classifier classifier,
		ConcreteClassifier classifierToImport) {
		val classifierImport = ImportsFactory.eINSTANCE.createClassifierImport
		if (null !== classifierToImport.containingCompilationUnit) {
			if (null !== classifierToImport.containingCompilationUnit.namespaces) {
				classifierImport.namespaces.addAll(classifierToImport.containingCompilationUnit.namespaces)
			}
			classifier.containingCompilationUnit.imports.add(classifierImport)
		}
		classifierImport.classifier = classifierToImport
		return classifierImport
	}
		
	def static createNamespaceClassifierReference(NamespaceClassifierReference namespaceClassifierReference,
		ConcreteClassifier concreteClassifier) {
		val classifierRef = TypesFactory.eINSTANCE.createClassifierReference
		classifierRef.target = concreteClassifier
		namespaceClassifierReference.classifierReferences.add(classifierRef)

	// namespaceClassifierReference.namespaces.addAll(concreteClassifier.containingCompilationUnit.namespaces)
	}

	def static CompilationUnit createCompilationUnit(String name, String content) {
		return createJavaRoot(name, content) as CompilationUnit
	}

	/**
     * Creates a JavaRoot Object with the given content
     * 
     */
	def static JavaRoot createJavaRoot(String name, String content) {
		// TODO Implement this without parsing by creating the model itself
		val JamoppParser jaMoPPParser = new JamoppParser
		val inStream = new ByteArrayInputStream(content.bytes)
		val javaRoot = jaMoPPParser.parseCompilationUnitFromInputStream(VURI.getInstance(name + ".java").getEMFUri,
			inStream)
		javaRoot.name = name + ".java"
		EcoreUtil.remove(javaRoot)
		return javaRoot
	}

	def static createPrivateField(Field field, TypeReference reference, String name) {
		field.typeReference = EcoreUtil.copy(reference)
		field.annotationsAndModifiers.add(ModifiersFactory.eINSTANCE.createPrivate)
		var String fieldName = name
		if (fieldName.nullOrEmpty) {
			fieldName = "field_" + getNameFromJaMoPPType(reference)
		}
		field.name = fieldName
	}
	
	/**
	 * returns the class object for a primitive type, e.g, Integer for int
	 */
	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(PrimitiveType type) {
		logger.warn("no dispatch method found for type: " + type)
		return null
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Boolean type) {
		createNamespaceClassifierReferenceForName("java.lang", "Boolean")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Byte type) {
		createNamespaceClassifierReferenceForName("java.lang", "Byte")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Char type) {
		createNamespaceClassifierReferenceForName("java.lang", "Character")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Double type) {
		createNamespaceClassifierReferenceForName("java.lang", "Double")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Float type) {
		createNamespaceClassifierReferenceForName("java.lang", "Float")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Int type) {
		createNamespaceClassifierReferenceForName("java.lang", "Integer")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Long type) {
		createNamespaceClassifierReferenceForName("java.lang", "Long")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(Short type) {
		createNamespaceClassifierReferenceForName("java.lang", "Short")
	}

	def dispatch static TypeReference getWrapperTypeReferenceForPrimitiveType(
		org.emftext.language.java.types.Void type) {
		createNamespaceClassifierReferenceForName("java.lang", "Void")
	}

	/**
     * Creates a Java-ClassifierImport from a qualified name
     */
	def static ClassifierImport createJavaClassImport(String name) {
		val classifier = loadClassiferFromStdLib(name);
		val classifierImport = ImportsFactory.eINSTANCE.createClassifierImport();
		classifierImport.classifier = classifier;
		return classifierImport
	}

	def static NamespaceClassifierReference createNamespaceClassifierReferenceForName(String namespace,
		String name) {
		val classifier = loadClassiferFromStdLib(namespace + "." + name)
		val classifierReference = TypesFactory.eINSTANCE.createClassifierReference
		classifierReference.setTarget(classifier)
		val namespaceClassifierReference = TypesFactory.eINSTANCE.createNamespaceClassifierReference
		namespaceClassifierReference.classifierReferences.add(classifierReference)
		if (!namespace.nullOrEmpty) {
			namespaceClassifierReference.namespaces.addAll(namespace.split("."))
		} else {
			namespaceClassifierReference.namespaces.add("")
		}
		return namespaceClassifierReference
	}

	private def static ConcreteClassifier loadClassiferFromStdLib(String name) {
		// This requires stlib to be registered (JavaClasspath.get().registerStdLib). Should be done by domain
		var classifier = JavaClasspath.get().getClassifier(name) as ConcreteClassifier
		val resourceSet = new ResourceSetImpl();
		classifier = EcoreUtil.resolve(classifier, resourceSet) as ConcreteClassifier
	}
	
	def static addAnnotationToAnnotableAndModifiable(AnnotableAndModifiable annotableAndModifiable,
		String annotationName) {
		val newAnnotation = AnnotationsFactory.eINSTANCE.createAnnotationInstance()
		val jaMoPPClass = ClassifiersFactory.eINSTANCE.createClass
		jaMoPPClass.setName(annotationName);
		newAnnotation.setAnnotation(jaMoPPClass)
		annotableAndModifiable.getAnnotationsAndModifiers().add(newAnnotation)
	}

	public def static addImportToClassFromString(ConcreteClassifier jaMoPPClass, List<String> namespaceArray,
		String entityToImport) {
		for (Import import : jaMoPPClass.containingCompilationUnit.imports) {
			if ((import as ClassifierImport).classifier.name == entityToImport) {
				return // Import has already been added (in the case of inject.Inject could be from javax.inject package)
			}
		}
		val guiceImport = ImportsFactory.eINSTANCE.createClassifierImport
		val ConcreteClassifier cl = ClassifiersFactory.eINSTANCE.createClass
		cl.name = entityToImport
		guiceImport.classifier = cl
		guiceImport.namespaces.addAll(namespaceArray)
		jaMoPPClass.containingCompilationUnit.imports.add(guiceImport)
	}
	
	def static addConstructorToClass(Class javaClass) {
		val Constructor constructor = MembersFactory.eINSTANCE.createConstructor
		addConstructorToClass(constructor, javaClass)
	}

	
	def static addConstructorToClass(Constructor constructor, Class javaClass) {
		constructor.name = javaClass.name
		constructor.annotationsAndModifiers.add(ModifiersFactory.eINSTANCE.createPublic)
		javaClass.members.add(constructor)
		return constructor
	}

	def static addImportToCompilationUnitOfClassifier(ClassifierImport classifierImport, Classifier classifier,
		ConcreteClassifier classifierToImport) {
		if (null !== classifierToImport.containingCompilationUnit) {
			if (null !== classifierToImport.containingCompilationUnit.namespaces) {
				classifierImport.namespaces.addAll(classifierToImport.containingCompilationUnit.namespaces)
			}
			classifier.containingCompilationUnit.imports.add(classifierImport)
		}
		classifierImport.classifier = classifierToImport
	}

	def static createNewForFieldInConstructor(NewConstructorCall newConstructorCall, Constructor constructor,
		Field field) {
		val classifier = field.containingConcreteClassifier
		if (!(classifier instanceof Class)) {
			return null
		}
		val jaMoPPClass = classifier as Class

		addNewStatementToConstructor(newConstructorCall, constructor, field, jaMoPPClass.fields, constructor.parameters)
	}
	
	def static addNewStatementToConstructor(NewConstructorCall newConstructorCall, Constructor constructor, Field field,
		Field[] fieldsToUseAsArgument, Parameter[] parametersToUseAsArgument) {
		val expressionStatement = StatementsFactory.eINSTANCE.createExpressionStatement
		val assigmentExpression = ExpressionsFactory.eINSTANCE.createAssignmentExpression

		// this.
		val selfReference = ReferencesFactory.eINSTANCE.createSelfReference
		selfReference.self = LiteralsFactory.eINSTANCE.createThis
		assigmentExpression.child = selfReference

		// .fieldname
		val fieldReference = ReferencesFactory.eINSTANCE.createIdentifierReference
		fieldReference.target = field
		selfReference.next = EcoreUtil.copy(fieldReference)

		// =
		assigmentExpression.assignmentOperator = OperatorsFactory.eINSTANCE.createAssignment

		// new fieldType
		newConstructorCall.typeReference = EcoreUtil.copy(field.typeReference)

		// get order of type references of the constructor
		updateArgumentsOfConstructorCall(field, fieldsToUseAsArgument, parametersToUseAsArgument, newConstructorCall)

		assigmentExpression.value = newConstructorCall
		expressionStatement.expression = assigmentExpression
		constructor.statements.add(expressionStatement)
	}
	
	private def static updateArgumentsOfConstructorCall(Field field, Field[] fieldsToUseAsArgument,
		Parameter[] parametersToUseAsArgument, NewConstructorCall newConstructorCall) {
		val List<TypeReference> typeListForConstructor = new ArrayList<TypeReference>
		if (null !== field.typeReference && null !== field.typeReference.pureClassifierReference &&
			null !== field.typeReference.pureClassifierReference.target) {
			val classifier = field.typeReference.pureClassifierReference.target
			if (classifier instanceof Class) {
				val jaMoPPClass = classifier as Class
				val constructorsForClass = jaMoPPClass.members.filter(typeof(Constructor))
				if (!constructorsForClass.nullOrEmpty) {
					val constructorForClass = constructorsForClass.get(0)
					for (parameter : constructorForClass.parameters) {
						typeListForConstructor.add(parameter.typeReference)
					}
				}
			}
		}

		// find type with same name in fields or parameters (start with parameter)
		for (typeRef : typeListForConstructor) {
			val refElement = typeRef.findMatchingTypeInParametersOrFields(fieldsToUseAsArgument,
				parametersToUseAsArgument)
			if (refElement !== null) {
				val IdentifierReference identifierReference = ReferencesFactory.eINSTANCE.createIdentifierReference
				identifierReference.target = refElement
			} else {
				newConstructorCall.arguments.add(LiteralsFactory.eINSTANCE.createNullLiteral)
			}
		}
	}
	
	private def static ReferenceableElement findMatchingTypeInParametersOrFields(TypeReference typeReferenceToFind,
		Field[] fieldsToUseAsArgument, Parameter[] parametersToUseAsArgument) {
		for (parameter : parametersToUseAsArgument) {
			if (parameter.typeReference.target == typeReferenceToFind.target) {
				return parameter
			}
		}
		for (field : fieldsToUseAsArgument) {
			if (field.typeReference.target == typeReferenceToFind.target) {
				return field
			}
		}
		return null
	}
}