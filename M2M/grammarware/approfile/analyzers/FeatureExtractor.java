package approfile.analyzers;

public class FeatureExtractor extends Extractor {

	public FeatureExtractor(String ppayload) {
		super(ppayload, new FeatureExtraction());
	}
	
	public String getID() {
		FeatureExtraction temp = (FeatureExtraction) this.extractor;
		return temp.getID();		
	}

	public String getSenderAddress() {
		FeatureExtraction temp = (FeatureExtraction) this.extractor;
		return temp.getSenderAddress();
	}

	public String getSignKey() {
		FeatureExtraction temp = (FeatureExtraction) this.extractor;
		return temp.getSignKey();
	}

	public String getPubKey() {
		FeatureExtraction temp = (FeatureExtraction) this.extractor;
		return temp.getPubKey();		
	}
}
