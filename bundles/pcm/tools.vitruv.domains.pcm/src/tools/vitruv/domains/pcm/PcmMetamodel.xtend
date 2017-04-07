package tools.vitruv.domains.pcm

import tools.vitruv.framework.metamodel.Metamodel
import tools.vitruv.framework.util.datatypes.VURI
import tools.vitruv.framework.tuid.AttributeTuidCalculatorAndResolver
import org.palladiosimulator.pcm.core.entity.EntityPackage
import de.uka.ipd.sdq.identifier.IdentifierPackage
import static extension tools.vitruv.domains.pcm.PcmNamespace.*;
import org.palladiosimulator.pcm.repository.RepositoryPackage

class PcmMetamodel extends Metamodel {
	package new() {
		super(VURI.getInstance(METAMODEL_NAMESPACE), ROOT_PACKAGE.nsURIsRecursive, 
			generateTuidCalculator(), #[REPOSITORY_FILE_EXTENSION, SYSTEM_FILE_EXTENSION]
		);
	}
	
	def protected static generateTuidCalculator() {
		return new AttributeTuidCalculatorAndResolver(METAMODEL_NAMESPACE, 
			#[IdentifierPackage.Literals.IDENTIFIER__ID.name, EntityPackage.Literals.NAMED_ELEMENT__ENTITY_NAME.name, RepositoryPackage.Literals.PRIMITIVE_DATA_TYPE__TYPE.name]);
	}
	
}