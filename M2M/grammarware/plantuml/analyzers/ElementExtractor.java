package plantuml.analyzers;

import java.util.Hashtable;
import java.util.List;

import plantuml.node.Node;

public class ElementExtractor extends Extractor {

	public ElementExtractor(Node nnode) {
		super(nnode, new ElementExtraction());
	}
	
	protected Hashtable<String,Node> list2hash(List<Node> list) {
		Hashtable<String,Node> retval = new Hashtable<String,Node>();
		NameExtraction nameExtraction = new NameExtraction();
		for (Node n: list) {
			n.apply(nameExtraction);
			String name = nameExtraction.getName();
			retval.put(name, n);
		}
		return retval;
	}
	
	public Hashtable<String,Node> getElements() {
		ElementExtraction temp = (ElementExtraction) this.extraction;
		List<Node> list = temp.getElements();
		Hashtable<String,Node> retval = this.list2hash(list);
		return retval;
	}
}