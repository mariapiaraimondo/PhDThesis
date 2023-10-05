package monviso.output.data;

public class EncryptedData implements Data {
	
	protected DataStructure payload;
	
	protected Data encryption;
	
	public EncryptedData(DataToken function) {
		this.payload = new DataStructure();
		this.encryption = function;
	}
	
	public EncryptedData() {
		this(null);
	}
	
	public void setFunction(Data function) {
		this.encryption = function;		
	}

	@Override
	public void add(Data part) {
		this.payload.add(part);		
	}

	@Override
	public void setName(String name) {}
	
	public String toString() {
		String retval = this.payload.toString() + "|" +  this.encryption.toString();
		return retval;
	}
}
