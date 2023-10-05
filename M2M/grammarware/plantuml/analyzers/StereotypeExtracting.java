package plantuml.analyzers;

import plantuml.analysis.DepthFirstAdapter;
import plantuml.node.ASimpleContent;

public class StereotypeExtracting extends DepthFirstAdapter {

	private String content;

	@Override
	public void inASimpleContent(ASimpleContent node) {
		this.content = node.getOpaqueexpr().getText().trim();
	}
	
	public String getContent() {
		return this.content;
	}
}
