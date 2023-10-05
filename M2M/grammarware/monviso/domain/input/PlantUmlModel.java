package monviso.domain.input;

import java.util.ArrayList;
import java.util.List;

import monviso.commons.NamedModel;

public class PlantUmlModel extends NamedModel implements InputModel {
	
	protected plantuml.node.Start uml_ast;

	protected List<PlantUMLModelElement> modelelements;

	public PlantUmlModel(String modelname, plantuml.node.Start root) {
		this.setName(modelname);
		this.uml_ast = root;
		this.modelelements= new ArrayList<PlantUMLModelElement>();
	}
	
	public PlantUmlModel(String modelname) {
		this(modelname,null);
	}
	
	public void addElement(PlantUMLModelElement pume) {
		this.modelelements.add(pume);		
	}
	
	public void setElements(List<PlantUMLModelElement> list) {
		this.modelelements = list;
	}
	
	public List<PlantUMLModelElement> getModelElements() {
		return this.modelelements;		
	}

	public List<Lifeline> getLifelines() {
		List<Lifeline> retval = new ArrayList<Lifeline>();
		for (PlantUMLModelElement ime: this.modelelements) {
			if (ime instanceof Lifeline) {
				retval.add((Lifeline)ime);
			}
		}
		return retval;
	}

	public List<Message> getMessages() {
		List<Message> retval = new ArrayList<Message>();
		for (PlantUMLModelElement ime: this.modelelements) {
			if (ime instanceof Message) {
				retval.add((Message)ime);
			}
		}
		return retval;
	}

	public plantuml.node.Start getUml_ast() {
		return uml_ast;
	}

	public void setUml_ast(plantuml.node.Start uml_ast) {
		this.uml_ast = uml_ast;
	}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public PlantUMLModelElement search(String name_alias) {
		PlantUMLModelElement retval = null;
		int counter  = 0;
		boolean found = false;
		while ((found == false) && (counter < this.modelelements.size())) {
			PlantUMLModelElement temp = this.modelelements.get(counter);
			if (temp.name.equals(name_alias) == true) {
				retval = temp;
				found = true;
			} else if (temp instanceof Lifeline) {
				Lifeline l = (Lifeline) temp;
				if (l.getAlias().equals(name_alias)  == true) {
					retval = temp;
					found = true;					
				}
			}
			counter++;
		}
		return retval;
	}
}
