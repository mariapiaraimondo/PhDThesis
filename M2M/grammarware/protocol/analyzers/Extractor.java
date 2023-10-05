package protocol.analyzers;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import protocol.analysis.DepthFirstAdapter;
import protocol.lexer.Lexer;
import protocol.lexer.LexerException;
import protocol.node.Start;
import protocol.parser.Parser;
import protocol.parser.ParserException;

public abstract class Extractor {
	
	protected String payload;
	
	protected Start ast;
	
	protected DepthFirstAdapter extractor;
	
	public Extractor(String ppayload, DepthFirstAdapter analyser) {
		this.payload = ppayload.substring(1,ppayload.length() - 1);
		this.extractor = analyser;
		this.ast = null;
	}
	
	public void run() throws ParserException, LexerException, IOException {
		PushbackReader pbReader = new PushbackReader(new StringReader(this.payload),1024);
		Lexer appLexer = new Lexer(pbReader);
		Parser appParser = new Parser(appLexer);
		this.ast = appParser.parse();
		this.ast.apply(extractor);
	}
	
	public Start getAST() {
		return this.ast;
	}
}
