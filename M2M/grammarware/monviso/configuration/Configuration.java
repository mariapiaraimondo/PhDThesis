package monviso.configuration;

import monviso.commons.InputKind;
import monviso.commons.OutputKind;

public interface Configuration {

	public InputKind getInputKind();
	
	public OutputKind getOutputKind();
	
	public String getInputFileName();
	
	public String getOutputFileName();
	
	public String getModelName();
}
