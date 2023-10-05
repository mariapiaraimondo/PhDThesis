package approfile.analyzers;

import approfile.analysis.DepthFirstAdapter;
import approfile.node.ASimpleAssetRef;

public class IDExtraction extends DepthFirstAdapter {
	
	protected String id;
	
	public IDExtraction() {
		super();
		this.id = null;
	}

	@Override
	public void inASimpleAssetRef(ASimpleAssetRef node) {
		this.id = node.getName().toString().trim();
	}
	
	public String getID() {
		return this.id;
	}
}