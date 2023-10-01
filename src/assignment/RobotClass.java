package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));
		
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		
		ac.moveToElement(news).perform();
		
		Thread.sleep(2000);
		ac.contextClick(news).perform();
		
		Thread.sleep(2000);
		for(int i = 1; i<=10; i++) {
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
