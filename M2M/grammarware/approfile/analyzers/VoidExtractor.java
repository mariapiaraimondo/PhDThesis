package approfile.analyzers;

import approfile.analysis.DepthFirstAdapter;

public class VoidExtractor extends Extractor {

	public VoidExtractor(String ppayload) {
		super(ppayload, new DepthFirstAdapter());
	}
}