package protocol.analyzers;

import protocol.analysis.DepthFirstAdapter;
import protocol.node.AEmptyFunction;
import protocol.node.APubkeyDataFunction;
import protocol.node.ASignatureDataFunction;
import protocol.node.ASimpleFreshClause;
import protocol.node.ASimpleHashClause;
import protocol.node.ASimpleIdClause;
import protocol.node.ASimplePubkeyClause;
import protocol.node.ASimpleSecretClause;
import protocol.node.ASimpleSignatureClause;
import protocol.node.PArgument;
import protocol.node.Start;


public class FunctionNaming extends DepthFirstAdapter {
	
	protected String name;

	@Override
	public void inAEmptyFunction(AEmptyFunction node) {
		this.name = node.getEmptyTok().getText().trim();
	}

	@Override
	public void inASimpleIdClause(ASimpleIdClause node) {
		this.name = node.getIdTok().getText().trim();
	}

	@Override
	public void inASimpleFreshClause(ASimpleFreshClause node) {
		this.name = node.getFreshTok().getText().trim();
	}

	@Override
	public void inASimpleHashClause(ASimpleHashClause node) {
		this.name = node.getHashTok().getText().trim();
	}

	@Override
	public void inASimplePubkeyClause(ASimplePubkeyClause node) {
		this.name = node.getPubkeyTok().getText().trim();
	}

	@Override
	public void inASimpleSignatureClause(ASimpleSignatureClause node) {
		this.name  = node.getSignatureTok().getText().trim();
	}
	
	public String getFunctionName() {
		return this.name;
	}
	
	
}
