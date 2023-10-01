package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromeBrowser{

	public static void main(String[] args) throws InterruptedException {

	//launch EdgeBrowser	
	WebDriver driver = new ChromeDriver();
	
	//maximize the browser
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	//close the browser
	driver.close();
	}
}
