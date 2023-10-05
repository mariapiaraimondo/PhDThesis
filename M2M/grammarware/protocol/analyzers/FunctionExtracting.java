package protocol.analyzers;

import protocol.analysis.DepthFirstAdapter;
import protocol.node.APubkeyDataFunction;
import protocol.node.ASignatureDataFunction;
import protocol.node.ASimplePubkeyClause;
import protocol.node.ASimpleSecretClause;
import protocol.node.ASimpleSignatureClause;
import protocol.node.PArgument;
import protocol.node.Start;


public class FunctionExtracting extends AtomExtracting {
	
	protected boolean cont;
	
	public FunctionExtracting() {
		super();
		this.cont = true;
	}

	@Override
	public void inASimplePubkeyClause(ASimplePubkeyClause node) {
		this.manageClause("pubkey",node.getArgument());
	}

	@Override
	public void inASimpleSignatureClause(ASimpleSignatureClause node) {
		this.manageClause("signkey",node.getArgument());
	}

	protected void manageClause(String key, PArgument subnode) {
		if (this.cont == true) {
			this.root.setName(key);
			this.subExtraction(subnode);
			this.cont = false;
		}		
	}
}
