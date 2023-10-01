package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("shewaledhiraj1999@gmail.com");
		
		driver.findElement(By.id("id_password")).sendKeys("Rexton1#");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
}
