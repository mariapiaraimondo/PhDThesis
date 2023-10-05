package monviso.domain.output;

import java.io.IOException;

import monviso.domain.input.Lifeline;

public class Agent {

	protected String id;
	
	protected String address;
	
	protected String pubkey;
	
	protected String signature;
	
	public Agent(Lifeline lifeline) throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException {
		this.address = lifeline.getAlias();
		this.id = "id" + lifeline.getAlias();
		this.pubkey = lifeline.getPubkey();
		this.signature = lifeline.getSignature();
	}

	public String getId() {
		return this.id;
	}

	public String getAddress() {
		return this.address;
	}

	public String getPubkey() {
		return this.pubkey;
	}

	public String getSignature() {
		return this.signature;
	}
}