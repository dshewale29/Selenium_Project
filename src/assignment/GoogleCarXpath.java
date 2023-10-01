package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoogleCarXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("car");
		Thread.sleep(2000);
		
		List<WebElement> carsuggestions = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		
		/*for(int i = 0;i < carsuggestions.size()-1;i++) {
		System.out.println(carsuggestions.get(i).getText());
		Thread.sleep(2000);
		}*/
		//by using for each loop
		for(WebElement car : carsuggestions) {
			System.out.println(car.getText());
		}
	}
}