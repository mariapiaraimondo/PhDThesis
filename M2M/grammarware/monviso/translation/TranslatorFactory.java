package monviso.translation;

import monviso.commons.InputKind;
import monviso.commons.OutputKind;

//TODO: a future extension is constituted in generating more transformations. Please write your code here to extend the framework
public class TranslatorFactory {
	
	protected static boolean plant2anbx(InputKind ink, OutputKind outk) {
		boolean inFlag = ink.equals(InputKind.plantuml); 
		boolean outFlag = outk.equals(OutputKind.anbx);
		return inFlag && outFlag;
	}
	
	public static Translator generate(InputKind ink, OutputKind outk) {
		Translator retval = null;
		if (TranslatorFactory.plant2anbx(ink,outk) == true) {
			retval = new Plant2Anbx();
		}
		return retval;
	}

}
