package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i = 0;i <= 2;i++) {
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(-1000,0)");
		}
	}
}