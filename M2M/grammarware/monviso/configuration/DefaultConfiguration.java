package monviso.configuration;

import monviso.commons.InputKind;
import monviso.commons.OutputKind;

public class DefaultConfiguration implements Configuration {

	protected String infile;
	
	protected String outfile;
	
	public DefaultConfiguration(String iinfile, String ooutfile) {
		this.infile = iinfile;
		this.outfile = ooutfile;
	}
	
	@Override
	public InputKind getInputKind() {
		return InputKind.plantuml;
	}

	@Override
	public OutputKind getOutputKind() {
		return OutputKind.anbx;
	}

	@Override
	public String getInputFileName() {
		return this.infile;
	}

	@Override
	public String getOutputFileName() {
		return this.outfile;
	}
	
	@Override
	public String getModelName() {
		int index = this.infile.indexOf('.');
		String retval = this.infile.substring(0, index);
		return retval;
	}
}