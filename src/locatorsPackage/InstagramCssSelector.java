package locatorsPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramCssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);

		//driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("9763906919");
		//Thread.sleep(2000);

		//driver.findElement(By.cssSelector("input[name^='p']")).sendKeys("9763906919");
		//Thread.sleep(2000);

		//driver.findElement(By.cssSelector("input[name*='ss']")).sendKeys("9763906919");
		//Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[name$='rd']")).sendKeys("9763906919");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name$='rd']")).sendKeys("9763906919");
		Thread.sleep(2000);

		driver.quit();
	}
}