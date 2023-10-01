package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

		//open child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);

		//address of all windows
		Set<String> allHandles = driver.getWindowHandles();

		//transfer control to child window
		for(String wh : allHandles) {
			driver.switchTo().window(wh).close();
		}
	}
}