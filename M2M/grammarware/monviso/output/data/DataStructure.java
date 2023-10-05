package monviso.output.data;

import java.util.ArrayList;
import java.util.List;

public class DataStructure implements Data {
	
	protected List<Data> listed;
	
	public DataStructure() {
		this.listed = new ArrayList<Data>();
	}
	
	public Data getPart(int i) {
		return this.listed.get(i);
	}
	
	public void add(Data part) {
		this.listed.add(part);
	}
	
	public int getPartNumber() {
		return this.listed.size();				
	}

	public String toString() {
		String retval = "";
		for (Data d: this.listed) {
			retval += d.toString() + "/";
		}
		return retval.substring(0,retval.length()-1);
	}


	@Override
	public void setName(String name) {}
}