package setSizeDimention;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_ex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		

Dimension defaultSize = driver.manage().window().getSize();

System.out.println(defaultSize);

Dimension d=new Dimension(500, 100);

driver.manage().window().setSize(d);
	}
	
	

}

