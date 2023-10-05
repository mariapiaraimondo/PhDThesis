package approfile.analyzers;

import java.util.Hashtable;

import approfile.analysis.DepthFirstAdapter;
import approfile.node.ADigifuncDigitalsignatureName;
import approfile.node.ADigisimpleDigitalsignatureName;
import approfile.node.ASimpleIdName;
import approfile.node.ASimplePubkeyClause;
import approfile.node.ASimpleSenderaddressName;

public class FeatureExtraction extends DepthFirstAdapter {
	
	private static String[] keys = {"id", "senderaddress", "signkey", "pubkey"};
	
	protected Hashtable<String,String> table;

	public FeatureExtraction() {
		super();
		this.table = new Hashtable<String,String>();
		for (String key: FeatureExtraction.keys) {
			this.table.put(key,"");
		}
	}
	
	@Override
	public void inASimpleIdName(ASimpleIdName node) {
		String temp = node.getName().toString().trim();
		this.table.put("id",temp);
	}

	@Override
	public void inASimplePubkeyClause(ASimplePubkeyClause node) {
		String temp = node.getSenderpubkeyName().toString().trim().replaceAll(" ","");
		this.table.put("pubkey",temp);
	}

	@Override
	public void inADigisimpleDigitalsignatureName(ADigisimpleDigitalsignatureName node) {
		String temp = node.getName().toString().trim().replaceAll(" ","");
		this.table.put("signkey",temp);
	}

	@Override
	public void inADigifuncDigitalsignatureName(ADigifuncDigitalsignatureName node) {
		String temp = node.getFuncName().toString().trim().replaceAll(" ","");
		this.table.put("signkey",temp);
	}

	@Override
	public void inASimpleSenderaddressName(ASimpleSenderaddressName node) {
		String temp = node.getName().toString().trim();
		this.table.put("senderaddress",temp);
	}

	public String getID() {
		return this.table.getOrDefault("id",null);
	}

	public String getSenderAddress() {
		return this.table.getOrDefault("senderaddress",null);
	}

	public String getSignKey() {
		return this.table.getOrDefault("signkey",null);
	}

	public String getPubKey() {
		return this.table.getOrDefault("pubkey",null);
	}
}