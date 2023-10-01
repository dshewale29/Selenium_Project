package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.close();
	}
}
