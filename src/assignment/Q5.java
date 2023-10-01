package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		String parentWindow = driver.getWindowHandle();

		//open child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);

		//get address of all windows
		Set<String> allWindows = driver.getWindowHandles();

		//transfer control to child window
		for(String wh : allWindows) {
			if(!parentWindow.equals(wh)) {
				Thread.sleep(2000);
				driver.switchTo().window(wh).manage().window().maximize();
			}
		}
	}
}