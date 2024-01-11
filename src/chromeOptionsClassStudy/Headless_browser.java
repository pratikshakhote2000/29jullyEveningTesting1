package chromeOptionsClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_browser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		ChromeOptions headless = opt.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(headless);
		driver.get("https://www.ajio.com/");

		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("the title is "+title);
		


	}

}
