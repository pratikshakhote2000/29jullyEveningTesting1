package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTEXT1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		//String exp_result="Find your dream job now";
		
		String act_result = driver.findElement(By.className("qsb-title")).getText();
		System.out.println("the actual result is "+act_result);
		
//	if (exp_result.equals(act_result)) {
//		System.out.println("text is match then Tc will passs");
//		
//	}
//	else {
//		System.out.println("text is not match then Tc will fail");
//
//		
//	}
//		
		
		
		
			

	}

}
