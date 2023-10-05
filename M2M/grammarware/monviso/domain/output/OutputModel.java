package monviso.domain.output;

import java.io.IOException;

public interface OutputModel {

	public void flush(String outFilename) throws IOException;

}
