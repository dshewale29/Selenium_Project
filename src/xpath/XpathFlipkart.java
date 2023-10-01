// processor , brand ,costomer rating, os
package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		//handle hidden division pop up
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptops");	
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();	
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//div[text() = 'Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
	    Thread.sleep(2000);
	    
	    /*driver.findElement(By.xpath("//div[text() = 'Brand']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@type = 'checkbox']/following-sibling::div[text() = 'DELL']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[text() = 'Operating System']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[@class = '_24_Dny']/following-sibling::div[text() = 'Windows 11']")).click();
	    Thread.sleep(2000);*/
	    
	    
	}
}