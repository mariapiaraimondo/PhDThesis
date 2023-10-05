package monviso.domain.input;

import java.util.ArrayList;
import java.util.List;

public abstract class PlantUMLModelElement {
	
	protected String name;
	
	protected plantuml.node.Node umlelement;
	
	protected List<Stereotype> stereotypes;
	
	protected int line;
	
	public PlantUMLModelElement(String nname, plantuml.node.Node uumlelement) {
		this.name = nname;
		this.line = -1;
		this.umlelement = uumlelement;
		this.stereotypes = new ArrayList<Stereotype>();
	}
	
	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public void addAllElements(List<Stereotype> sstereotypes) {
		this.stereotypes.addAll(sstereotypes);
	}
}