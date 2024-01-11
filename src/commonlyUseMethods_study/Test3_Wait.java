package commonlyUseMethods_study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Test3_Wait {

	
	
	public static void ImplicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

}
