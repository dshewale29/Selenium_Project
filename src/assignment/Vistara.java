package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Vistara{
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);	
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("Pune",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City' and (@aria-label='Search destination')]")).sendKeys("Mumbai",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='departCalendar' and (@placeholder='Select Departure Date')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='31']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()=' Aug 'and (@monthname='Aug')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select Passengers and Cabin Class ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'col-xs-12 d')and (text()='Done')]")).click();
		
		driver.findElement(By.xpath("//button[@id='book-flight-widget' and (text()='Search Flights')]")).click();	
	}

}