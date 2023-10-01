package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		// perform moveHover action on watch jewellery
		act.moveToElement(target).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bracelets']")).click();
				
		WebElement filterBy = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		act.moveToElement(filterBy);
		
		Thread.sleep(2000);
		
		for(int i = 1; i <= 2; i++) {
			act.doubleClick().perform();
			act.clickAndHold().perform();
		}
		
		//copy filter by text
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).click();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		driver.findElement(By.name("submit_search")).submit();
		
		Thread.sleep(5000);
		driver.quit();
	}
}