package seleniumUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlAssi {

	public static void main(String[] args) throws InterruptedException {
		String ExpectedResult = " https://vctcpune.com/";
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
	//	String ExpectedResult =driver.get("https://vctcpune.com");

		//driver.get(" https://vctcpune.com/");
		
		 Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		System.out.println("url is "+url);
		// Thread.sleep(2000);

		if (ExpectedResult.equals(url)) {
			System.out.println(" Both Url is matching then TC will be pass");
		} else {
			System.out.println(" Both Url is not matching then TC will be fail");
		}
	}

}
