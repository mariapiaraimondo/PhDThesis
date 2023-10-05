package plantuml.analyzers;

import java.util.List;

import plantuml.node.Node;

public class NoteFinder extends Extractor {

	public NoteFinder(Node nnode, List<String> nameToSearch) {
		super(nnode, new NoteFinding(nnode,nameToSearch));
	}
	
	public List<Node> getNotes() {
		NoteFinding temp = (NoteFinding) this.extraction;
		List<Node> retval = temp.getNotes();
		return retval;
	}
}