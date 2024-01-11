package propertiesFile_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFRomPropertiEsFile {
	
	
	public static void main(String args[]) throws IOException
	{
	
	Properties prop=new Properties();
	//FileInputStream myFile=new FileInputStream("C:\\practice programs\\seleniumStudy\\CoverFoxStudy.properties");
	FileInputStream myFile=new FileInputStream(System.getProperty("user.dir")+"\\CoverFoxStudy.properties");

	prop.load(myFile);
     
   String value = prop.getProperty("MobNum");
   System.out.println(value);
}}
