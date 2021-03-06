package tools.vitruv.domains.java

import static tools.vitruv.domains.java.JavaNamespace.*
import org.eclipse.emf.ecore.resource.Resource
import org.emftext.language.java.resource.JavaSourceOrClassFileResourceFactoryImpl
import java.util.Map
import org.emftext.language.java.resource.java.IJavaOptions
import java.util.List
import tools.vitruv.framework.domains.AbstractVitruvDomain

class JavaDomain extends AbstractVitruvDomain {
	static final String METAMODEL_NAME = "Java"
	boolean shouldTransitivelyPropagateChanges = false
	
	protected new() {
		this(METAMODEL_NAME)
	}
	
	protected new(String name) {
		super(name, ROOT_PACKAGE, List.of(FILE_EXTENSION))
		// Register factory for class and Java files in case of not running as plugin
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaSourceOrClassFileResourceFactoryImpl())
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("class", new JavaSourceOrClassFileResourceFactoryImpl())
		// This is necessary to resolve classes from standard library (e.g. Object, List etc.) 
		JamoppLibraryHelper.registerStdLib
	}
	
	override shouldTransitivelyPropagateChanges() {
		shouldTransitivelyPropagateChanges
	}
	
	/**
	 * Calling this methods enable the per default disabled transitive change propagation.
	 * Should only be called for test purposes!
	 */
	def enableTransitiveChangePropagation() {
		shouldTransitivelyPropagateChanges = true
	}
	
	override getDefaultLoadOptions() {
		Map.of(
			/**
			 * FIXME Layout information currently breaks Vitruv: Because it is created dynamically
			 * when a resource is loaded into a view, there are no create changes for layout information.
			 * Hence, layout information has not UUIDs, and even if it had, it could not be resolved
			 * correctly in the VSUM. Eventually, layout information should be recorded by Vitruv
			 * just like all other model elements. To get there, we should have a mechanism that
			 * creates the correct changes for layout information as well, preferably directly
			 * when the corresponding model objects are created. For the time being, we disable
			 * layout information  
			 */
			IJavaOptions.DISABLE_LAYOUT_INFORMATION_RECORDING, true
		)
	}
}