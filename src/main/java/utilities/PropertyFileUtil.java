package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
public static String getValueForKey(String Key) throws Exception{
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\PropertiesFile\\Enviroment.properties");
		
		p.load(fis);
		
	    return p.getProperty(Key);

	}
}
