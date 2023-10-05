package monviso.domain.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import plantuml.analyzers.NameExtraction;
import plantuml.analyzers.TokenFinder;
import plantuml.lexer.LexerException;
import plantuml.parser.ParserException;

public class PlantUMLModelFactory {
	
	protected PlantUmlModel model;
	
	public PlantUMLModelFactory(String modelname) {
		this.newModel(modelname);
	}

	public void newModel(String modelname) {
		this.model = new PlantUmlModel(modelname);		
	}
	
	public PlantUmlModel getModel() {
		this.compile();
		return this.model;
	}

	private void compile() {
		// Removing unstereotyped elements
		List<PlantUMLModelElement> toremove = new ArrayList<PlantUMLModelElement>();
		for (PlantUMLModelElement pume: this.model.modelelements) {
			if (pume.stereotypes.size() == 0) {
				toremove.add(pume);
			}
		}
		this.model.modelelements.removeAll(toremove);
		// Linking lifelines with messages
		for (PlantUMLModelElement pume: this.model.modelelements) {
			if (pume instanceof Message) {
				Message m = (Message) pume;
				plantuml.node.ASimpleMessage node = (plantuml.node.ASimpleMessage) m.umlelement;
				String sourcename = node.getSender().toString().trim();
				Lifeline source = (Lifeline) this.model.search(sourcename);
				m.setSource(source);
				String targetname = node.getReceiver().toString().trim();
				Lifeline target = (Lifeline) this.model.search(targetname);
				m.setTarget(target);
			}
		}
	}
	
	public void setAST(plantuml.node.Start ast) {
		this.model.setUml_ast(ast);
	}

	public void addModelElement(String nname, plantuml.node.Node uumlelement, List<Stereotype> sstereotypes) throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException {
		PlantUMLModelElement toAdd = null;
		TokenFinder tfnd = new TokenFinder();
		if (uumlelement instanceof plantuml.node.ASimpleParticipant) {
			toAdd = new Lifeline(nname, uumlelement);
		} else if (uumlelement instanceof plantuml.node.ASimpleMessage) {
			toAdd = new Message(nname, uumlelement);
		}
		int line = tfnd.getLine(uumlelement);
		toAdd.setLine(line);
		toAdd.addAllElements(sstereotypes);
		this.model.addElement(toAdd);
	}
	
	protected static InputModel generatePlantUmlModel(String modelname, String infilename) throws plantuml.lexer.LexerException, IOException, approfile.parser.ParserException, approfile.lexer.LexerException, plantuml.parser.ParserException, protocol.parser.ParserException, protocol.lexer.LexerException {
		PlantUMLModelFactory factory = new PlantUMLModelFactory(modelname);
		plantuml.node.Start umlAst = PlantUMLModelFactory.umlModelParsing(infilename);
		factory.setAST(umlAst);
		// Extraction of UML model elements
		plantuml.analyzers.ElementExtractor extractor = new plantuml.analyzers.ElementExtractor(umlAst);
		extractor.run();
		// Extracting elements and stereotypes
		Enumeration<String> keys = extractor.getElements().keys();
		while (keys.hasMoreElements() == true) {
			String key = keys.nextElement();
			plantuml.node.Node umlNode  = extractor.getElements().get(key);
			List<Stereotype> stereotypes = new ArrayList<Stereotype>();
			// Finding notes
			List<plantuml.node.Node> notes = PlantUMLModelFactory.noteExtraction(umlAst, key, umlNode);
			for (plantuml.node.Node nn: notes) {
				// Extraction of stereotype structure from note
				plantuml.analyzers.StereotypeExtractor stExtractor = new plantuml.analyzers.StereotypeExtractor(nn);
				stExtractor.run();
				String stContent = stExtractor.getContent();
				//System.out.println(stContent);
				approfile.analyzers.VoidExtractor astExtractor = new approfile.analyzers.VoidExtractor(stContent);
				astExtractor.run();
				approfile.node.Start appAst = astExtractor.getAST();
				// Going at third level
				protocol.node.Node data = PlantUMLModelFactory.protocolDataParsing(stContent);
				protocol.node.Node condition = PlantUMLModelFactory.protocolConditionParsing(stContent);
				Stereotype stereotype = new Stereotype(appAst,data,condition);
				stereotypes.add(stereotype);
			}
			factory.addModelElement(key, umlNode, stereotypes);
		}
		PlantUmlModel retval = factory.getModel();
		return retval;
	}

	private static protocol.node.Node protocolDataParsing(String stContent) throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException, protocol.parser.ParserException, protocol.lexer.LexerException {
		approfile.analyzers.PayloadExtractor pext = new approfile.analyzers.PayloadExtractor(stContent);
		pext.run();
		// Getting and analyzing the data
		String dataStr = pext.getData();
		return protocolElementExtractor(dataStr);
	}

	private static protocol.node.Node protocolConditionParsing(String stContent) throws approfile.parser.ParserException, approfile.lexer.LexerException, IOException, protocol.parser.ParserException, protocol.lexer.LexerException {
		approfile.analyzers.PayloadExtractor pext = new approfile.analyzers.PayloadExtractor(stContent);
		pext.run();
		// Getting and analyzing condition
		String conditionStr = pext.getCondition();
		return protocolElementExtractor(conditionStr);
	}

	private static protocol.node.Node protocolElementExtractor(String stringToAnalyze) throws protocol.parser.ParserException, protocol.lexer.LexerException, IOException {
		protocol.node.Node retval = null;
		//System.out.println(stringToAnalyze);
		if (stringToAnalyze != null) {
			protocol.analyzers.VoidExtractor analyzer = new protocol.analyzers.VoidExtractor(stringToAnalyze);
			analyzer.run();
			retval = analyzer.getAST();
		}
		return retval;
	}

	private static List<plantuml.node.Node> noteExtraction(plantuml.node.Start umlAst, String key, plantuml.node.Node umlNode) {
		List<String> aliases = new ArrayList<String>();
		aliases.add(key);
		NameExtraction ne = new NameExtraction();
		umlNode.apply(ne);
		String alias = ne.getAlias();
		if (alias != null) {
			aliases.add(alias);
		}
		plantuml.analyzers.NoteFinder nfinder = new plantuml.analyzers.NoteFinder(umlAst,aliases);
		nfinder.run();
		List<plantuml.node.Node> notes = nfinder.getNotes();
		return notes;
	}

	private static plantuml.node.Start umlModelParsing(String infilename) throws FileNotFoundException, ParserException, LexerException, IOException {
		// Initial parsing of the UML model
		plantuml.lexer.Lexer lexer = new plantuml.lexer.Lexer (new PushbackReader(new FileReader(infilename), 1024));
		plantuml.parser.Parser parser = new plantuml.parser.Parser(lexer);
		plantuml.node.Start umlAst = parser.parse();
		return umlAst;
	}
}