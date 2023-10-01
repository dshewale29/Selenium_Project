package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\" and text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		List<WebElement> laptopList = driver.findElements(By.className("_4rR01T"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));

		for(int i=0;i<laptopList.size();i++)
		{
			String lname = laptopList.get(i).getText();
			for(int j=i;j<=i;j++)
			{
				String lprice = price.get(i).getText();
				System.out.println("name="+lname+"price="+lprice);
				Thread.sleep(2000);
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
}
}
