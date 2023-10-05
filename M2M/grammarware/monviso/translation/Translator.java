package monviso.translation;

import java.io.IOException;

import approfile.lexer.LexerException;
import approfile.parser.ParserException;
import monviso.domain.input.InputModel;
import monviso.domain.output.OutputModel;

public interface Translator {
	
	public OutputModel transform(InputModel in) throws ParserException, LexerException, IOException;

}