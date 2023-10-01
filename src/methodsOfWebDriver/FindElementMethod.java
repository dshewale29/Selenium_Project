package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-p1b696p/login.do");
		Thread.sleep(2000);
		
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		
		usernameTextBox.sendKeys("admin"); 
	}
}