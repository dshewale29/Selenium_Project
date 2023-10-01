package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMsEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {

	//launch EdgeBrowser	
	WebDriver driver = new EdgeDriver();
	
	//maximize the browser
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.close();
	}
}