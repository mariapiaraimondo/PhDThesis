package monviso.translation;

import java.io.IOException;
import java.util.Hashtable;

import monviso.domain.input.InputModel;
import monviso.domain.input.Lifeline;
import monviso.domain.input.Message;
import monviso.domain.input.PlantUmlModel;
import monviso.domain.output.Action;
import monviso.domain.output.Agent;
import monviso.domain.output.AnbxModel;
import monviso.domain.output.Goal;
import monviso.domain.output.OutputModel;

public class Plant2Anbx implements Translator {

	@Override
	public OutputModel transform(InputModel in)  throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException {
		AnbxModel retval =  new AnbxModel(in.getName());
		PlantUmlModel pum = (PlantUmlModel) in;
		Hashtable<String,Agent> agentLookup = new Hashtable<String,Agent>();
		for (Lifeline l: pum.getLifelines()) {
			Agent ag = new Agent(l);
			agentLookup.put(l.getAlias(),ag);
			retval.addAgent(ag);
		}
		Hashtable<Integer,Action> actionLookup = new Hashtable<Integer,Action>();
		for (Message m: pum.getMessages()) {
			Integer line = m.getLine();
			Action a = new Action(m,agentLookup);
			actionLookup.put(line, a);
			Goal g = new Goal(m);
			retval.addGoal(g);
		}
		//TODO: transform lookup table into list ordering the lines
		return retval;
	}
}