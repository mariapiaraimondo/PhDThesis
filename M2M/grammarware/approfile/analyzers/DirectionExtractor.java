package approfile.analyzers;

import monviso.commons.Direction;

public class DirectionExtractor extends Extractor {

	public DirectionExtractor(String ppayload) {
		super(ppayload, new DirectionExtraction());
	}
	
	public Direction getDirection() {
		DirectionExtraction temp = (DirectionExtraction) this.extractor;
		return temp.getDirection();		
	}
}
