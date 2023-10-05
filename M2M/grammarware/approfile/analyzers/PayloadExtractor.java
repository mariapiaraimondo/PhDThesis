package approfile.analyzers;

public class PayloadExtractor extends Extractor {

	public PayloadExtractor(String ppayload) {
		super(ppayload, new PayloadExtraction());
	}
	
	public String getData() {
		PayloadExtraction temp = (PayloadExtraction) this.extractor;
		return temp.getData();
	}
	
	public String getCondition() {
		PayloadExtraction temp = (PayloadExtraction) this.extractor;
		return temp.getCondition();
	}
}