package monviso.domain.input;

import java.io.IOException;

import monviso.commons.InputKind;

public class InputModelFactory {
	
	public static InputModel generate(InputKind inkind, String modelname, String infilename) throws plantuml.lexer.LexerException, IOException, approfile.parser.ParserException, approfile.lexer.LexerException, plantuml.parser.ParserException, protocol.parser.ParserException, protocol.lexer.LexerException {
		InputModel retval = null;
		if (inkind.equals(InputKind.plantuml) == true) {
			retval = PlantUMLModelFactory.generatePlantUmlModel(modelname,infilename);
		}
		return retval;
	}
}