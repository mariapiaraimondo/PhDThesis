package plantuml.analyzers;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import approfile.analyzers.DirectionExtraction;
import monviso.commons.Direction;
import monviso.commons.StereotypeFactory;
import monviso.commons.StereotypeKind;
import plantuml.analysis.DepthFirstAdapter;
import plantuml.node.ASimpleContent;
import plantuml.node.ASimpleMessageNote;
import plantuml.node.ASimpleParticipantNote;
import plantuml.node.Start;

public class StereotypeFinder extends DepthFirstAdapter {
	
	private StereotypeKind stereoKind = StereotypeKind.None;
	
	private Hashtable<StereotypeKind,List<String>> stereotypes;
	
	protected List<String> getStereotypes(StereotypeKind stk) {
		return this.stereotypes.get(stk);
	}
	
	public List<String> getParticipants() {
		return this.getStereotypes(StereotypeKind.Participant);		
	}
	
	public List<String> getInputAssets() {
		return this.getStereotypes(StereotypeKind.InputAsset);		
	}

	public List<String> getOutputAssets() {
		return this.getStereotypes(StereotypeKind.OutputAsset);		
	}

	public List<String> getStereotypes() {
		List<String> retval = new ArrayList<String>();
		StereotypeKind array[] = {StereotypeKind.InputAsset, StereotypeKind.OutputAsset, StereotypeKind.Participant};
		for (StereotypeKind stk: array) {
			retval.addAll(this.getStereotypes(stk));
		}
		return retval;
	}

	@Override
	public void inStart(Start node) {
		this.stereotypes = new Hashtable<StereotypeKind,List<String>>();
		this.stereotypes.put(StereotypeKind.Participant,new ArrayList<String>());
		this.stereotypes.put(StereotypeKind.InputAsset,new ArrayList<String>());
		this.stereotypes.put(StereotypeKind.OutputAsset,new ArrayList<String>());
	}
	

	@Override
	public void inASimpleContent(ASimpleContent node) {
		String content = node.getOpaqueexpr().getText().trim();
		this.stereotypes.get(this.stereoKind).add(content);
	}

	@Override
	public void inASimpleMessageNote(ASimpleMessageNote node) {
		DirectionExtraction directionChecker = new DirectionExtraction();
		//node.getContent().toString().trim();
		//node.apply(directionChecker);
		Direction dir = directionChecker.getDirection();
		this.stereoKind = StereotypeFactory.getStereotype(dir);
	}

	@Override
	public void inASimpleParticipantNote(ASimpleParticipantNote node) {
		this.stereoKind = StereotypeKind.Participant;
	}
	
	@Override
	public void outASimpleMessageNote(ASimpleMessageNote node) {
		this.stereoKind = StereotypeKind.None;
	}

	@Override
	public void outASimpleParticipantNote(ASimpleParticipantNote node) {
		this.stereoKind = StereotypeKind.None;
	}
}