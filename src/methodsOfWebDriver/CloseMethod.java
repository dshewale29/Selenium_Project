package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		
		Thread.sleep(2000);
		
		//use close method to close parent browser
		driver.close();
		//use quit method to quit all browsers.
		//driver.quit();
	}
}