package commonlyUseMethods_study;

import java.io.IOException;

public class DataREadFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		String value = Test6_usingProepertiesGFile.readDataFromProperties("StudentName");
System.out.println(value);


System.out.println(Test6_usingProepertiesGFile.readDataFromProperties("Age"));
	}

}
