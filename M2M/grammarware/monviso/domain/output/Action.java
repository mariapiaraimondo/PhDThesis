package monviso.domain.output;

import java.util.Hashtable;
import monviso.domain.input.Message;
import monviso.output.data.Data;
import protocol.analyzers.StructureExtracting;

public class Action {

	protected String senderAddress;
	
	protected String receiverAddress;
	
	protected Data data;
	
	public Action(Message m, Hashtable<String, Agent> lookup) {
		String tempName;
		tempName = m.getSenderLifeline().getAlias();
		this.senderAddress = lookup.get(tempName).getAddress();
		tempName = m.getReceiverLifeline().getAlias();
		this.receiverAddress = lookup.get(tempName).getAddress();
		System.out.println(m.getOutgoingData().toString().trim().replaceAll(" ",""));
		StructureExtracting sex = new StructureExtracting();
		m.getOutgoingData().apply(sex);
		this.data = sex.getData();
		System.out.println("----");
	}

}
