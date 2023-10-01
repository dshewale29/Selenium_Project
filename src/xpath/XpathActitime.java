package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-p1b696p/login.do");
		
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name = 'pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id = 'loginButton']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
