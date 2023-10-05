package protocol.analyzers;

import monviso.output.data.Data;
import monviso.output.data.DataStructure;
import monviso.output.data.DataToken;
import monviso.output.data.EncryptedData;
import protocol.analysis.DepthFirstAdapter;
import protocol.node.ADataDataCondition;
import protocol.node.AListDataClause;
import protocol.node.AListDataExpression;
import protocol.node.ARecursiveArgument;
import protocol.node.ASimpleDataClause;
import protocol.node.Node;
import protocol.node.PAtomicList;
import protocol.node.PDataFunction;

public class StructureExtracting extends DepthFirstAdapter {
	
	protected Data root;
	
	private Data current;
	
	private int level;
	
	public StructureExtracting() {
		this.level = 0;
		this.root = null;
		this.current = null;
	}

	@Override
	public void inAListDataClause(AListDataClause node) {
		if (this.root == null) {
			this.level = 0;
			this.root = new DataStructure();			
		}
	}

	@Override
	public void inAListDataExpression(AListDataExpression node) {
		if (this.root == null) {
			this.level = 0;
			this.root = new DataStructure();			
		}
		if (this.level == 0) {
			EncryptedData enc = new EncryptedData();
			PDataFunction datafunc = node.getDataFunction();
			Data dt = null;
			if (datafunc != null) {
				AtomExtracting fex = new FunctionExtracting();
				datafunc.apply(fex);
				dt = fex.getData();
				enc.setFunction(dt);
			}
			PAtomicList atomlist = node.getAtomicList();
			AtomListExtracting alex = new AtomListExtracting();
			atomlist.apply(alex);
			for (Data adt: alex.getData()) {
				enc.add(adt);
			}
			alex.clear();
			this.current = enc;
			System.out.println(enc.toString());
		}
		this.level++;
	}

	@Override
	public void outAListDataExpression(AListDataExpression node) {
		this.level--;
		if (this.level == 0) {
			if (this.root != null) {
				this.root.add(this.current);
			}
		}
	}

	@Override
	public void inARecursiveArgument(ARecursiveArgument node) {
		if (this.level <= 1) {

		}
		this.level++;
	}

	@Override
	public void outARecursiveArgument(ARecursiveArgument node) {
		this.level--;
	}
//	@Override
//	public void outARecursiveArgument(ARecursiveArgument node) {
//		unlock(node);
//	}



	public Data getData() {
		return this.root;
	}
}
