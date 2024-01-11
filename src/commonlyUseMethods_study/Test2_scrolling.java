package commonlyUseMethods_study;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test2_scrolling {
	
	
	public static void ScrollintoView(WebDriver driver,WebElement element )
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		 js.executeScript("argument[0].scrollIntoView();",element);

	}

}
