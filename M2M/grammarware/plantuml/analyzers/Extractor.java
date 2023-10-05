package plantuml.analyzers;

import plantuml.analysis.DepthFirstAdapter;
import plantuml.node.Node;

public abstract class Extractor {
	
	protected Node node;
	
	protected DepthFirstAdapter extraction;
	
	public Extractor(Node nnode, DepthFirstAdapter analyser) {
		this.node = nnode;
		this.extraction = analyser;
	}
	
	public void run() {
		this.node.apply(this.extraction);
	}
}
