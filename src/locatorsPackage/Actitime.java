package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-p1b696p/login.do");
	    
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
}
}