package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://desktop-p1b696p/login.do");
		
		String GetTitle = driver.getTitle();
		
	    driver.findElement(By.name("username")).sendKeys("admin");
	    
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	    driver.findElement(By.id("loginButton")).click();
	    
	    String GetTitleLogIn = driver.getTitle();;
	    
	    if (GetTitle.equals(GetTitleLogIn)) {
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}  
	    driver.quit();
	}
}
