package plantuml.analyzers;

import plantuml.node.Node;

public class StereotypeExtractor extends Extractor {

	public StereotypeExtractor(Node nnode) {
		super(nnode, new StereotypeExtracting());
	}
	
	public String getContent() {
		StereotypeExtracting temp = (StereotypeExtracting) this.extraction;
		return temp.getContent();
	}
}