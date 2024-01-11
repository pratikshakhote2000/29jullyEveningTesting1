package commonlyUseMethods_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1_use {
	
	
	
	public static void  takesScreenshot(WebDriver driver,String myfile) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\SeleniumSc\\"+myfile+".png");
		
		FileHandler.copy(src, dest);
		
		
	}

}
