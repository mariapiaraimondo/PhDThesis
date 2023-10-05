package monviso.domain.input;

import plantuml.node.Node;

public class Message extends PlantUMLModelElement {

	protected Lifeline source;
	
	protected Lifeline target;
	
	public Message(String nname, Node uumlelement) {
		super(nname, uumlelement);
		this.source = null;
		this.target = null;
	}
	
	public void setSource(Lifeline llife) {
		this.source = llife;
	}
	
	public void setTarget(Lifeline llife) {
		this.target= llife;
	}
	
	public Lifeline getSenderLifeline() {
		return this.source;
	}
	
	public Lifeline getReceiverLifeline() {
		return this.target;
	}
	
	//TODO: refactor the method doing the formal research
	public protocol.node.Node getOutgoingData() {
		protocol.node.Node retval = null;
		if (this.stereotypes.get(0).isOutputAsset() == true) {
			retval = this.stereotypes.get(0).data;
		} else if (this.stereotypes.get(1).isOutputAsset() == true) {
			retval = this.stereotypes.get(1).data;			
		}
		return retval;
	} 
}
