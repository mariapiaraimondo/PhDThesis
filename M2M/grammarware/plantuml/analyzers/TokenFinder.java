package plantuml.analyzers;

import plantuml.analysis.DepthFirstAdapter;
import plantuml.node.ASimpleMessage;
import plantuml.node.ASimpleParticipant;
import plantuml.node.Node;
import plantuml.node.Token;

public class TokenFinder extends DepthFirstAdapter {

	private Token token;

	public Token getToken(Node n) {
		this.token = null;
		n.apply(this);
		return this.token;
	}

	public int getLine(Node n) {
		Token t = this.getToken(n);
		int retval = (t == null) ? -1 : t.getLine();
		return retval;
	}

	@Override
	public void inASimpleParticipant(ASimpleParticipant node) {
		this.token = node.getParticipantTok();
	}

	@Override
	public void inASimpleMessage(ASimpleMessage node) {
		this.token = node.getArrow();
	}	
}