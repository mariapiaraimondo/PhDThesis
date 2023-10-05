package plantuml.analyzers;

import plantuml.analysis.DepthFirstAdapter;
import plantuml.node.ASimpleMessageName;
import plantuml.node.ASimplePartAliasName;
import plantuml.node.ASimpleParticipantName;
import plantuml.node.Start;

public class NameExtraction extends DepthFirstAdapter {

	protected String name;
	
	protected String alias;

	@Override
	public void inASimplePartAliasName(ASimplePartAliasName node) {
		this.alias = node.getName().toString().trim();
	}

	@Override
	public void inStart(Start node) {
		this.name = null;
		this.alias = null;
	}

	@Override
	public void inASimpleMessageName(ASimpleMessageName node) {
		this.name = node.getName().toString().trim();
	}

	@Override
	public void inASimpleParticipantName(ASimpleParticipantName node) {
		this.name = node.getName().toString().trim();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAlias() {
		return this.alias;
	}
}