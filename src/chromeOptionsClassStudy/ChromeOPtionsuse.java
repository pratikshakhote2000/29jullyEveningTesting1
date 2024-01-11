package chromeOptionsClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOPtionsuse {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("incognito");      //at a time we can run only one option
		// opt.addArguments("start-maximized"); //maximized window
		// opt.addArguments("--headless"); //without going browser only see result
		// opt.addArguments("make-default-browser");
		// opt.addArguments("-disable-notifications");
		// opt.addArguments("version");

		ArrayList<String> al = new ArrayList<>(); // we can use all option at a time using array list
		// al.add("disable-popup-blocking");
		// al.add("disable-notifications");

		al.add("incognito");
		al.add("start-maximized");
		al.add("-disable-notifications");
		// al.add("disable-popup-blocking");
		// al.add("disable-infobars");

		opt.addArguments(al);
		WebDriver driver = new ChromeDriver(opt);
		// driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

}
