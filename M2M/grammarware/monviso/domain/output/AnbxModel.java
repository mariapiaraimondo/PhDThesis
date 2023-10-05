package monviso.domain.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnbxModel implements OutputModel {
	
	protected String name;
	
	protected List<Agent> agents;
	
	protected List<Action> actions;

	protected List<Goal> goals;

	public AnbxModel(String mname) {
		this.name = mname;
		this.agents = new ArrayList<Agent>();
		this.actions = new ArrayList<Action>();
		this.goals = new ArrayList<Goal>();
	}
	
	public void addAgent(Agent a) {
		this.agents.add(a);
	}

	public void flush(String outFilename) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(outFilename));
		String protocolNameBlock = this.generateProtocolNameBlock();
		writer.write(protocolNameBlock);
		writer.close();
	}

	private String generateProtocolNameBlock() {
		String retval = "Protocol:\n\t" + this.name + "\n\n";
		return retval;
	}

	public void addAction(Action a) {
		this.actions.add(a);
	}

	public void addGoal(Goal g) {
		if (g.isNull() == false) {
			this.goals.add(g);
		}
	}	
}
