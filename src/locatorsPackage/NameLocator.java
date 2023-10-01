package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("shewaledhiraj29@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Rexton1#");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}