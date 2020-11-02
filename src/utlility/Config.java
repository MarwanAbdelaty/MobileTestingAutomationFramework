package utlility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	Properties prop = new Properties();
	InputStream input = null;
	public Config(){
		try {
			input= getClass().getResourceAsStream("/configuration/config.properties");
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public String getProperty(String propName){

		return prop.getProperty(propName);
	}

	
}
