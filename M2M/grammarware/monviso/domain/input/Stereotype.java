package monviso.domain.input;

import approfile.analyzers.DirectionExtraction;
import monviso.commons.Direction;

public class Stereotype {
	
	protected approfile.node.Node stereotype;
	
	protected protocol.node.Node data;
	
	protected protocol.node.Node condition;
	
	public Stereotype(approfile.node.Node sstereotype, protocol.node.Node ddata, protocol.node.Node ccondition) {
		this.stereotype = sstereotype;
		this.data = ddata;
		this.condition = ccondition;
	}
	
	public Stereotype(approfile.node.Node sstereotype) {
		this(sstereotype, null, null);
	}
	
	public boolean isOutputAsset() {
		DirectionExtraction dex = new DirectionExtraction();
		this.stereotype.apply(dex);
		boolean retval = dex.getDirection() == Direction.Output;
		return retval;
	}
}
