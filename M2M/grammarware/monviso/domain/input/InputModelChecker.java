package monviso.domain.input;

import plantuml.analyzers.UmlChecking;
import plantuml.exceptions.DanglingMessageReferenceUMLException;
import plantuml.exceptions.DanglingNoteReferenceUMLException;
import plantuml.exceptions.DanglingParticipantReferenceUMLException;
import plantuml.exceptions.UniqueNamesUMLException;

public class InputModelChecker {

	/**
	 * 
	 * @author stefa
	 * There are several constraints that a model has to fulfill...
	 * UML level:
	 * 1) all the named items has a unique name
	 * 2) all the references are satisfied and there are no dangling items
	 * @throws DanglingMessageReferenceUMLException 
	 * @throws DanglingNoteReferenceUMLException 
	 * @throws DanglingParticipantReferenceUMLException 
	 * @throws UniqueNamesUMLException 
	 */

	public static boolean check(PlantUmlModel in) throws UniqueNamesUMLException, DanglingParticipantReferenceUMLException, DanglingNoteReferenceUMLException, DanglingMessageReferenceUMLException {
		boolean retval = false;
		// Calling the UML Checking for points 1, 2
		UmlChecking umlchecking = new UmlChecking();
		in.getUml_ast().apply(umlchecking);
		retval = umlchecking.check();
		// for each lifeline, check constraint 3
/*		Enumeration<String> lifelineNames = in.getLifelines().keys();
		while ((retval == true) && (lifelineNames.hasMoreElements())) {
			String lifelineName = lifelineNames.nextElement();
			plantuml.node.Node lifeline = in.getLifelines().get(lifelineName);
	*/		
			
		//}
				
		// for each message, check constraint 4
				
		
		
		
		// TODO Input Model checker
		return retval;
	}

}
