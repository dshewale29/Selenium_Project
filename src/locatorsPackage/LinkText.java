package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Open a popup window")).click();


		Thread.sleep(2000);

		//close method to close parent browser
		//driver.close();

		Thread.sleep(2000);
		//quit method to quit all browsers.
		driver.quit();
	}
}