package plantuml.analyzers;

import java.util.ArrayList;
import java.util.List;

import plantuml.analysis.DepthFirstAdapter;
import plantuml.node.ASimpleMessage;
import plantuml.node.ASimpleParticipant;
import plantuml.node.Node;
import plantuml.node.Start;

public class ElementExtraction extends DepthFirstAdapter {

	protected List<Node> elements;
	
	@Override
	public void inStart(Start node) {
		this.elements = new ArrayList<Node>();
	}

	@Override
	public void inASimpleParticipant(ASimpleParticipant node) {
		this.elements.add(node);
	}

	@Override
	public void inASimpleMessage(ASimpleMessage node) {
		this.elements.add(node);
	}
	
	public List<Node> getElements() {
		return this.elements;
	}
}