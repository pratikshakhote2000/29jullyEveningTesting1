package webDriverMethodsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		String ExpectedResult="https://vctcpune.com/";
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		System.out.println("Url is "+url);
		 if (ExpectedResult.equals(url)) {
			 System.out.println("Both Url matching then TC is Pass");
			
		}
		 else {
			 System.out.println("Both Url not matching then TC is Pass");

			
		}
	}

}
