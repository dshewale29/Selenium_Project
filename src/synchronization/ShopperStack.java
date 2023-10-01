package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='jacket coat']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		WebElement checkButton = driver.findElement(By.id("Check"));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		explicitWait(driver, 30, checkButton);
		//wait.until(ExpectedConditions.elementToBeClickable(checkButton)).click();
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Check Delivery']")).getText());
		driver.close();
	}
	
	public static WebElement explicitWait(WebDriver driver,int sec,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return el;
	}
}