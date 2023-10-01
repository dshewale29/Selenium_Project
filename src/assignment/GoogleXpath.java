package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoogleXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("Poha");
		Thread.sleep(2000);
		
		List<WebElement> pohasuggestions = driver.findElements(By.xpath("//div[@class = 'wM6W7d']"));
		
		for(int i = 0;i < pohasuggestions.size()-1;i++) {
		System.out.println(pohasuggestions.get(i).getText());
		Thread.sleep(2000);
		}
	}
}