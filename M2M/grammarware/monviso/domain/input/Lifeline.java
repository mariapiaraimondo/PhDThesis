package monviso.domain.input;

import java.io.IOException;

import approfile.analyzers.FeatureExtractor;
import plantuml.analyzers.NameExtraction;

public class Lifeline extends PlantUMLModelElement {
	
	protected String alias;

	public Lifeline(String nname, plantuml.node.Node uumlelement) throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException {
		super(nname, uumlelement);
		NameExtraction ne = new NameExtraction();
		uumlelement.apply(ne);
		this.alias = ne.getAlias();
	}
	
	public String getAlias() {
		return this.alias;
	}
	
	private FeatureExtractor getFeatureExtraction() throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException {
		String toanalyze = "$" + this.stereotypes.get(0).stereotype.toString() + "$";
		FeatureExtractor fe = new FeatureExtractor(toanalyze);
		fe.run();
		return fe;
	}
	
	public String getPubkey() throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException {
		FeatureExtractor fex = this.getFeatureExtraction();
		return fex.getPubKey();
	}
	
	public String getSignature() throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException {
		FeatureExtractor fex = this.getFeatureExtraction();
		return fex.getSignKey();
	}
}