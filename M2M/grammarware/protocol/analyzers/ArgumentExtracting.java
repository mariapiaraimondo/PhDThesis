package protocol.analyzers;

import monviso.output.data.Data;
import protocol.node.AFunctionArgument;
import protocol.node.ARecursiveArgument;
import protocol.node.AVariableArgument;

public class ArgumentExtracting extends AtomExtracting {
	
	protected int canary;
	
	public ArgumentExtracting() {
		super();
		this.canary = 0;
	}

	@Override
	public void inAVariableArgument(AVariableArgument node) {
		if (this.canary == 0) {
			this.canary = node.hashCode();
			this.root.setName(node.getName().toString().trim());
		}
	}

	@Override
	public void outAVariableArgument(AVariableArgument node) {
		if (this.canary == node.hashCode()) {
			this.canary = 0;
		}
	}

	@Override
	public void inAFunctionArgument(AFunctionArgument node) {
		if (this.canary == 0) {
			this.canary = node.hashCode();
			FunctionNaming fna = new FunctionNaming();
			node.apply(fna);
			String returnedName = fna.getFunctionName();
			this.root.setName(returnedName);
			this.subExtraction(node.getFunction());
		}
	}

	@Override
	public void outAFunctionArgument(AFunctionArgument node) {
		if (this.canary == node.hashCode()) {
			this.canary = 0;
		}
	}

	@Override
	public void inARecursiveArgument(ARecursiveArgument node) {
		if (this.canary == 0) {
			this.canary = hashCode();
			StructureExtracting sex = new StructureExtracting();
			node.getDataExpression().apply(sex);
			Data recevied = sex.getData();
			this.root.setName("");
			this.root.add(recevied);
		}
	}
	
	@Override
	public void outARecursiveArgument(ARecursiveArgument node) {
		if (this.canary == node.hashCode()) {
			this.canary = 0;
		}
	}
	
}