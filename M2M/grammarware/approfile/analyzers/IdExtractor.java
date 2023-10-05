package approfile.analyzers;

public class IdExtractor extends Extractor {

	public IdExtractor(String ppayload) {
		super(ppayload, new IDExtraction());
	}
	
	public String getID() {
		IDExtraction temp = (IDExtraction) this.extractor;
		return temp.getID();		
	}
}
