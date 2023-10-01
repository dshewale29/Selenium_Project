package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[(@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy') and (@role = 'button')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname'and @aria-label='name']")).sendKeys("Dhiraj");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shewale");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("shewaledhiraj29@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("shewaledhiraj29@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Rexton1#");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[@value='29']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//font[text() = 'Sept']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@aria-label='year']/descendant::option[@value='1999']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio' and @id='u_2_5_24']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//font[text() = 'Sign up']")).click();
		Thread.sleep(2000);
	}
}