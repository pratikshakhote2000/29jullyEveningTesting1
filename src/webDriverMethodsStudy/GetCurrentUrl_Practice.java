package webDriverMethodsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_Practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/movies");
		
		String exp_result="https://www.hotstar.com/in/movies";
		
	 String url= driver.getCurrentUrl();
	 System.out.println("the current url is "+url);
	 
	 if (exp_result.equals(url)) {
		 System.out.println("both url is match then TC will be pass");
		
	}
	 else {
		System.out.println("both url is  not match then TC will be fail");
	}

	}

}
