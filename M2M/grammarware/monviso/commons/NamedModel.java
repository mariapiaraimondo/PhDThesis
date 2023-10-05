package monviso.commons;

public abstract class NamedModel {

	protected String name;
	
	public void setName(String nname) {
		this.name = nname;
	}
	
	public String getName() {
		return this.name;
	}
}