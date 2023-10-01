package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("up window")).click();


		Thread.sleep(2000);

		//use close method to close parent browser
		driver.close();

		Thread.sleep(2000);
		//use quit method to quit all browsers.
		driver.quit();
	}
}