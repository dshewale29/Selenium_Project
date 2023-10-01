package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Dhira/Downloads/Selenium/html%20selenium/Disabled%20WebElement.html");
		
		//identify username textbox
		driver.findElement(By.id("id1")).sendKeys("Admin");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('id2').value='Manager'");
	}	
}