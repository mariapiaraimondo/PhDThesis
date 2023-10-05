package protocol.analyzers;

import java.util.ArrayList;
import java.util.List;

import monviso.output.data.Data;
import monviso.output.data.DataToken;
import protocol.analysis.DepthFirstAdapter;
import protocol.node.AListAtomicList;
import protocol.node.ASimpleAtomicList;
import protocol.node.PArgument;


public  class AtomListExtracting extends DepthFirstAdapter {
	
	protected List<Data> roots;
	
	protected AtomicListKind canary;

	public AtomListExtracting() {
		this.roots = new ArrayList<Data>();
		this.canary = null;
	}

	public List<Data> getData() {
		return this.roots;
	}

	public void clear() {
		this.roots.clear();
	}

	@Override
	public void inAListAtomicList(AListAtomicList node) {
//		if (this.canary == null) {
//			this.canary = AtomicListKind.Complex;
//		}
//		if (this.canary == AtomicListKind.Complex) {
			PArgument argNode = node.getArgument();
			this.atomManagement(argNode);
//		}
	}

	@Override
	public void inASimpleAtomicList(ASimpleAtomicList node) {
//		if (this.canary == null) {
//			this.canary = AtomicListKind.Simple;
//		}
//		if (this.canary == AtomicListKind.Simple) {
			PArgument argNode = node.getArgument();
			this.atomManagement(argNode);
//		}
	}
	
	protected void atomManagement(PArgument node) {
		ArgumentExtracting aex = new ArgumentExtracting();
		node.apply(aex);
		Data dtt = aex.getData();
		this.roots.add(dtt);		
	}
}
