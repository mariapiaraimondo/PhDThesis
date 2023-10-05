package approfile.analyzers;

import java.util.Hashtable;

import approfile.analysis.DepthFirstAdapter;
import monviso.commons.Direction;

public class AppChecker extends DepthFirstAdapter {

	private plantuml.analyzers.UmlChecking umlchecker;
	
	private Hashtable<String,Hashtable<Direction,String>> transaction2asset;
	
	public AppChecker(plantuml.analyzers.UmlChecking umlc) {
		super();
		this.umlchecker = umlc;
	}
	
	public boolean check() {
		boolean retval = false;
		//TODO: old code on App Checker - to frame in the new code
		// to implement the following check:
		//1) verify that the output and input assets for each transaction exists and are correct
		//2) verifty that provenance and destinations for each asset are coherent with the UML model (see the message)
		return retval;
	}

	
	
}
