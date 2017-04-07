package tools.vitruv.domains.asem

import tools.vitruv.framework.metamodel.Metamodel
import tools.vitruv.framework.tuid.AttributeTuidCalculatorAndResolver
import tools.vitruv.framework.tuid.TuidCalculatorAndResolver
import edu.kit.ipd.sdq.ASEM.base.BasePackage
import tools.vitruv.framework.util.datatypes.VURI
import static tools.vitruv.domains.asem.AsemNamespace.*;

class AsemMetamodel extends Metamodel {
	package new() {
		super(VURI.getInstance(ROOT_PACKAGE.nsURI), ROOT_PACKAGE.nsURIsRecursive, generateTuidCalculator(), FILE_EXTENSION);
	}

	def protected static TuidCalculatorAndResolver generateTuidCalculator() {
		return new AttributeTuidCalculatorAndResolver(METAMODEL_NAMESPACE, 
			#[BasePackage.Literals.IDENTIFIABLE__ID.name, BasePackage.Literals.NAMED__NAME.name]
		);
	}
}