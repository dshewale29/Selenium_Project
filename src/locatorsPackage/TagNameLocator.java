package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dhira/Downloads/html%20selenium/textbox.html");

		//identify Username Textbox by using tagNmae Locator
		//WebElement usn = driver.findElement(By.tagName("input"));
		//usn.sendKeys("admin");


		//directly without up casting
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Manager");
	}
}