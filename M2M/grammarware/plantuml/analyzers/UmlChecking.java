package plantuml.analyzers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import plantuml.analysis.DepthFirstAdapter;
import plantuml.exceptions.DanglingMessageReferenceUMLException;
import plantuml.exceptions.DanglingNoteReferenceUMLException;
import plantuml.exceptions.DanglingParticipantReferenceUMLException;
import plantuml.exceptions.UniqueNamesUMLException;
import plantuml.node.ASimpleAliasNote;
import plantuml.node.ASimpleMessageName;
import plantuml.node.ASimpleMessageRef;
import plantuml.node.ASimpleNoteRef;
import plantuml.node.ASimplePartAliasName;
import plantuml.node.ASimpleParticipantName;
import plantuml.node.ASimpleParticipantRef;
import plantuml.node.ASimpleReceiver;
import plantuml.node.ASimpleSender;
import plantuml.node.PName;
import plantuml.node.Start;

public class UmlChecking extends DepthFirstAdapter {
	
	private static final String[] keywords = new String [] {"participant_name", 
			"part_alias_name", "participant_ref", "sender", 
			"receiver", "note_alias", "message_name", "message_ref", "note_ref"}; 

	private static final String[] uniqueness = new String [] {"participant_name", 
			"part_alias_name", "note_alias", "message_name"}; 

	protected Hashtable<String,List<String>> elements;
	
	/**
	 * 
	 * @author stefa
	 * This method checks the following constraints (major number refers to general constrains numbering
	 * 1) all the named items has a unique name
	 * 2.1) there are no dangling references to a participant
	 * 2.2) there are no dangling references to a note
	 * 2.3) there are no dangling references to a message
	 * @throws DanglingMessageReferenceUMLException 
	 * @throws DanglingNoteReferenceUMLException 
	 * @throws DanglingParticipantReferenceUMLException 
	 * @throws UniqueNamesUMLException 
	 */
	public boolean check() throws UniqueNamesUMLException, DanglingParticipantReferenceUMLException, DanglingNoteReferenceUMLException, DanglingMessageReferenceUMLException {
		boolean retval = false;
		retval = this.uniqueNames(); // constraint 1
		retval = retval && this.noDanglingParticipantReference(); // constraint 2.1
		retval = retval && this.noDanglingNoteReference(); // constraint 2.2
		retval = retval && this.noDanglingMessageReference(); // con
		return retval;
	}
	
	private boolean noDanglingMessageReference() throws DanglingMessageReferenceUMLException {
		String tocheck[] = new String[] {"message_ref"};
		String references = "message_name"; 
		boolean retval = this.existenceCheck(tocheck,references);
		if (retval == false) {
			throw new DanglingMessageReferenceUMLException();
		}
		return retval;
	}

	private boolean noDanglingNoteReference() throws DanglingNoteReferenceUMLException {
		String tocheck[] = new String[] {"note_ref"};
		String references = "note_alias"; 
		boolean retval = this.existenceCheck(tocheck,references);
		if (retval == false) {
			throw new DanglingNoteReferenceUMLException();
		}
		return retval;
	}

	private boolean noDanglingParticipantReference() throws DanglingParticipantReferenceUMLException {
		String tocheck[] = new String[] {"participant_ref", "sender", "receiver"};
		String references = "part_alias_name"; 
		boolean retval = this.existenceCheck(tocheck,references);
		if (retval == false) {
			throw new DanglingParticipantReferenceUMLException();
		}
		return retval;
	}

	private boolean existenceCheck(String[] pointers, String references) {
		boolean retval = true;
		List<String> referenceList = this.elements.get(references);
		int listCounter = 0;
		int elementCounter = 0;
		while ((retval == true) && (listCounter < pointers.length)) {
			elementCounter = 0;
			List<String> pointerList = this.elements.get(pointers[listCounter]);
			while ((retval == true) && (elementCounter < pointerList.size())) {
				String temp = pointerList.get(elementCounter);
				retval = referenceList.indexOf(temp) >= 0;
				elementCounter++;
			}
			listCounter++;
		}
		return retval;
	}

	private boolean uniqueNames() throws UniqueNamesUMLException {
		boolean retval = false;
		int counter = 0;
		Set<String> names = new HashSet<String>();
		for (String key: UmlChecking.uniqueness) {
			List<String> temp = this.elements.get(key);
			counter += temp.size();
			names.addAll(temp);
		}
		retval = (counter == names.size());
		if (retval == false) {
			throw new UniqueNamesUMLException();
		}
		return retval;
	}

	@Override
	public void inStart(Start node) {
		this.elements = new Hashtable<String,List<String>>();
		for (String key: UmlChecking.keywords) {
			this.elements.put(key,new ArrayList<String>());
		}
	}
	
    @Override
	public void inASimplePartAliasName(ASimplePartAliasName node) {
    	this.storeName(node.getName(), "part_alias_name");
	}

    @Override
	public void inASimpleParticipantName(ASimpleParticipantName node) {
    	this.storeName(node.getName(), "participant_name");
	}

	@Override
	public void inASimpleParticipantRef(ASimpleParticipantRef node) {
    	this.storeName(node.getName(), "participant_ref");
    }

	@Override
	public void inASimpleSender(ASimpleSender node) {
    	this.storeName(node.getName(), "sender");
	}

	@Override
	public void inASimpleReceiver(ASimpleReceiver node) {
    	this.storeName(node.getName(), "receiver");
	}

	@Override
	public void inASimpleAliasNote(ASimpleAliasNote node) {
    	this.storeName(node.getName(), "note_alias");
	}

	@Override
	public void inASimpleMessageName(ASimpleMessageName node) {
    	this.storeName(node.getName(), "message_name");
	}

	@Override
	public void inASimpleMessageRef(ASimpleMessageRef node) {
    	this.storeName(node.getName(), "message_ref");
	}

	@Override
	public void inASimpleNoteRef(ASimpleNoteRef node) {
    	this.storeName(node.getName(), "note_ref");
	}

	private void storeName(PName node, String key) {
		String name = node.toString();
		this.elements.get(key).add(name.trim());
	}
}