package popup_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow_ex3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("NewWindow")).click();

       Set<String> allwindoId = driver.getWindowHandles();
       
      Iterator<String> it = allwindoId.iterator();
      
      String mainPageId = it.next();
     String childPageId = it.next();
     
     System.out.println(mainPageId);
     System.out.println(childPageId);
     
     Thread.sleep(2000);
driver.switchTo().window(childPageId);
Thread.sleep(2000);

	}

}
