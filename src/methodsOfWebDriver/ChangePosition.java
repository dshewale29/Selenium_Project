package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//maximize the web browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//change the size of web driver
		Dimension targetSize = new Dimension(350, 250);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		//Change the position of browser
		Point tagetPosition = new Point(350, 650);
		driver.manage().window().setPosition(tagetPosition);
		
		Thread.sleep(2000);
		driver.close();
	}
}