package monviso.output.data;

public class DataToken implements Data {

	protected String name;
	
	protected Data subToken;
	
	public DataToken() {
		this.name = null;
		this.subToken = null;
	}
	
	public void setName(String nname) {
		this.name = nname;
	}

	@Override
	public void add(Data part) {
		this.subToken = part;
	}

	
	@Override
	public String toString() {
		String payload = (this.subToken == null) ? "" : "(" + subToken.toString() + ")";
		String retval = name + payload;
		return retval;
	}
}