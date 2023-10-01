package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionOrangeHRM {
  @Test
  public void signInPage() throws InterruptedException {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--disable-notifications");
		
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  SoftAssert sa = new SoftAssert(); 
	  sa.assertEquals(driver.getTitle(), "Title");
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	  
	  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	  
	  WebElement logout = driver.findElement(By.xpath("//a[text() = 'Logout']"));
	  
	  Thread.sleep(3000);
	  
	  Assert.assertEquals(logout.isDisplayed(),true);  // Hard Assert
	  
      logout.click();
	  
	  sa.assertAll();
   }
}
