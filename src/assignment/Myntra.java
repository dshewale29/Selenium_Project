package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing");

		//Search for shoes
		driver.findElement(By.xpath("//input[@placeholder = 'Search for products, brands and more']")).sendKeys("shoes",Keys.ENTER);

		driver.findElement(By.xpath("//img[@title='U.S. Polo Assn. Men White Clarkin Sneakers']")).click();

		//parent window
		String homeWin = driver.getWindowHandle();

		Set<String> allWin = driver.getWindowHandles();

		for(String wh : allWin) {
			if(!homeWin.equals(wh)) {
				driver.switchTo().window(wh);
			}
		}
		
		Thread.sleep(2000);
		
		//click on shoe size
		driver.findElement(By.xpath("//p[contains(@class,'size-buttons-unified-size') and text()='9']")).click();

		//click on add to bag
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();	
		
		//click on bag 
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		
		//remove popup and click on remove button
		WebElement removeButton = driver.findElement(By.xpath("//button[.='REMOVE']"));

		Actions act = new Actions(driver);
		
		act.doubleClick(removeButton).perform();

		Thread.sleep(2000);
		
		//click on remove button
		driver.findElement(By.xpath("(//button[contains(@class,'inlinebuttonV2-base-actionButton ') and .='REMOVE'])[2]")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}