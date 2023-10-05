package plantuml.analyzers;

import java.util.ArrayList;
import java.util.List;

import plantuml.analysis.DepthFirstAdapter;
import plantuml.node.ASimpleAliasNote;
import plantuml.node.ASimpleMessageNote;
import plantuml.node.ASimpleMsgnoteLink;
import plantuml.node.ASimpleParticipantNote;
import plantuml.node.ASimpleParticipantRef;
import plantuml.node.Node;
import plantuml.node.Start;

public class NoteFinding extends DepthFirstAdapter {

	protected  List<String> elementsToFind;
	
	protected List<Node> notes;
	
	protected boolean found;
	
	protected Node root;
	
	public NoteFinding(Node rroot,  List<String> names) {
		this.root = rroot;
		this.elementsToFind = names;
		this.found = false;
	}
	
	public NoteFinding() {
		this(null,null);
	}
	
	@Override
	public void inStart(Start node) {
		this.notes = new ArrayList<Node>();
		this.found = false;
	}
	
	public List<Node> getNotes() {
		return this.notes;
	}

	@Override
	public void inASimpleParticipantRef(ASimpleParticipantRef node) {
		String temp = node.getName().toString().trim();
		this.found =this.elementsToFind.contains(temp);
	}

	@Override
	public void inASimpleMsgnoteLink(ASimpleMsgnoteLink node) {
		String msgName = node.getMessageRef().toString().trim();
		if (this.elementsToFind.contains(msgName)) {
			String noteName = node.getNoteRef().toString().trim();
			List<String> names = new ArrayList<String>();
			names.add(noteName);
			NoteFinding downIntoTheRabbithole = new NoteFinding(this.root,names);
			this.root.apply(downIntoTheRabbithole);
			this.notes.addAll(downIntoTheRabbithole.getNotes());
		}
	}

	@Override
	public void inASimpleAliasNote(ASimpleAliasNote node) {
		String temp = node.getName().toString().trim();
		this.found = this.elementsToFind.contains(temp);
	}

	@Override
	public void outASimpleMessageNote(ASimpleMessageNote node) {
		this.addToList(node);
	}

	protected void addToList(Node n) {
		if (this.found == true) {
			this.notes.add(n);
		}
	}

	@Override
	public void outASimpleParticipantNote(ASimpleParticipantNote node) {
		this.addToList(node);
	}
	
	
}