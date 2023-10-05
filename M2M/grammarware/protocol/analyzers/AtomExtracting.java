package protocol.analyzers;

import monviso.output.data.Data;
import monviso.output.data.DataStructure;
import monviso.output.data.DataToken;
import protocol.analysis.DepthFirstAdapter;
import protocol.node.AFunctionArgument;
import protocol.node.Node;
import protocol.node.PArgument;
import protocol.node.PFunction;


public abstract class AtomExtracting extends DepthFirstAdapter {
	
	protected Data root;

	public AtomExtracting() {
		this.root = new DataToken();
	}

	public Data getData() {
		return this.root;
	}

	protected void subExtraction(Node arg) {
		ArgumentExtracting aex = new ArgumentExtracting();
		arg.apply(aex);
		Data recursionResult = aex.getData();
		this.root.add(recursionResult);
	}
}
