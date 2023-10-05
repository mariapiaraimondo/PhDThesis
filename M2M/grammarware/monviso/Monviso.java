package monviso;

import monviso.commons.InputKind;
import monviso.commons.OutputKind;
import monviso.configuration.Configuration;
import monviso.configuration.ConfigurationFactory;
import monviso.domain.input.InputModel;
import monviso.domain.input.InputModelFactory;
import monviso.domain.output.OutputModel;
import monviso.translation.Translator;
import monviso.translation.TranslatorFactory;

public class Monviso {
		
	public static void main(String[] args) {
		if (args.length > 1) {
			try {
				// Management of the application configuration
				Configuration conf = ConfigurationFactory.generate(args);
				String infile = conf.getInputFileName();
				String outfile = conf.getOutputFileName();
				InputKind inkind= conf.getInputKind();
				OutputKind outkind = conf.getOutputKind();
				String modelname = conf.getModelName();
				// Extraction of the UML model
				InputModel in = InputModelFactory.generate(inkind,modelname,infile);
				// Checking of the model
				if (in.check() == true) {
					// Generation of the output model
					Translator t = TranslatorFactory.generate(inkind,outkind);
					OutputModel out = t.transform(in);
					// Model-to-text
					out.flush(outfile);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.err.println("usage: java tester_toy inputFile");
			System.exit(1);
		}
	}
}


//TODO: clean the following comments.
//UMLModel umlModel =  new UMLModel(inFilename);
//check = umlModel.check();


//if (check == true) {
//plantuml.node.Start uml_ast = umlModel.getAST();
//// Getting the stereotype texts from the UML model
//plantuml.analyzers.StereotypeMiner stMiner = new plantuml.analyzers.StereotypeMiner();
//uml_ast.apply(stMiner);
//// First grammar check
//List<String> stereotypes = stMiner.getStereotypes();
//check = ModelChecker.checkStereotypeGrammar(stereotypes);
//// Participant check
//List<String> participants = stMiner.getParticipants();
//List<String> ids = new ArrayList<String>();
//for (String p: participants) {
//	
//	
//}
