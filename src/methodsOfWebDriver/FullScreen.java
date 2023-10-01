package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();	
	}
}