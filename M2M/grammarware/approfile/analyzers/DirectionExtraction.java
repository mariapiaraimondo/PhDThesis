package approfile.analyzers;

import approfile.analysis.DepthFirstAdapter;
import approfile.node.ASimpleInputassetSt;
import approfile.node.ASimpleOutputassetSt;
import monviso.commons.Direction;

public class DirectionExtraction extends DepthFirstAdapter {
	
	protected Direction currentDirection;

	public Direction getDirection() {
		return this.currentDirection;
	}

	@Override
	public void inASimpleOutputassetSt(ASimpleOutputassetSt node) {
		this.currentDirection = Direction.Output;
	}

	@Override
	public void inASimpleInputassetSt(ASimpleInputassetSt node) {
		this.currentDirection = Direction.Input;
	}
}