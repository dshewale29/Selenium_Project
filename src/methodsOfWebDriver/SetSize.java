package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//maximize the web browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//change the size of web driver
		Dimension targetSize = new Dimension(350, 250);
		driver.manage().window().setSize(targetSize);
		
		Thread.sleep(2000);
		driver.close();
	}

}