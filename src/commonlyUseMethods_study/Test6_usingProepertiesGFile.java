package commonlyUseMethods_study;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test6_usingProepertiesGFile {
	
	public static String readDataFromProperties(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\practice programs\\seleniumStudy\\CoverFoxStudy.properties");
		prop.load(myFile);
		
		String value = prop.getProperty(key);
		return value;
		
	}

}
