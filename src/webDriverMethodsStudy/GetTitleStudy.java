package webDriverMethodsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleStudy {

	public static void main(String[] args) throws InterruptedException {
		String ExpectedResult="Velocity | Best Software Training Center";

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println("title is "+title);
		
		if (ExpectedResult.equals(title)) {
			System.out.println("BOTH TITLE ARE MATHICNG THEN TESTCASE IS PASS");
			
		}
		else {
			System.out.println("BOTH TITLE ARE NOT MATHICNG THEN TESTCASE IS FAIL");

			
		}

	}

}
