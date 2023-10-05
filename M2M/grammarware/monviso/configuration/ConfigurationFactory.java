package monviso.configuration;

//TODO: a future extension is constituted in generating more configurations. Please write your code here to extend the framework
public class ConfigurationFactory {
	
	private static boolean defaultConfiguration(String[] arguments) {
		return true;
	}
	
	public static Configuration generate(String[] arguments) {
		Configuration retval = null;
		if (ConfigurationFactory.defaultConfiguration(arguments) == true) {
			retval = new DefaultConfiguration(arguments[0], arguments[1]);
		}
		return retval;
	}

}
