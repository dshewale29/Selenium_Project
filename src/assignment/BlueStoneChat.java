package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneChat {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(4000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("//div[contains(@class,'d-ho')]")).click();
	}
}