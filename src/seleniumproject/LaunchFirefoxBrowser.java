package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
