package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("hudhgu");
		
		driver.findElement(By.name("password")).sendKeys("dsbds");
		
		driver.findElement(By.xpath("//div[text() = 'Log in']")).click();
		
		driver.close();
	}
}
