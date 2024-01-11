package webDriverMethodsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_ex {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/in/");

		String Exp_Res = "https://www.netflix.com/in/";
		Thread.sleep(1000);

		String url = driver.getCurrentUrl();

		System.out.println("the current url is " + url);

		if (Exp_Res.equals(url)) {
			System.out.println("if both reslt same test case will be pass");

		}

		else {
			System.out.println("if both reslt not same test case will be fail");

		}

	}

}
