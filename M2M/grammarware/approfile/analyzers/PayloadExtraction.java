package approfile.analyzers;

import approfile.analysis.DepthFirstAdapter;
import approfile.node.ASimpleConditionPayload;
import approfile.node.ASimpleDataPayload;

public class PayloadExtraction extends DepthFirstAdapter {
	
	protected String data;

	protected String condition;

	public PayloadExtraction() {
		super();
		this.data = null;
		this.condition = null;
	}

	@Override
	public void inASimpleDataPayload(ASimpleDataPayload node) {
		String temp = node.getOpaqueexpr().getText().trim();
		this.data = temp;
	}

	@Override
	public void inASimpleConditionPayload(ASimpleConditionPayload node) {
		String temp = node.getOpaqueexpr().getText().trim();
		this.condition = temp;
	}
	
	public String getData() {
		return this.data;
	}
	
	public String getCondition() {
		return this.condition;
	}
	
}