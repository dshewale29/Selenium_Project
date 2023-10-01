package javaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollToWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.selenium.dev/");
		
		WebElement newsEle = driver.findElement(By.xpath("//h2[text()='News']"));
		
		Thread.sleep(2000);
		Point loc = newsEle.getLocation();
		
		//perform scrolling till newsElement
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		/* 
		//By using logic
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+loc.getX()+","+(loc.getY()-90)+")");
		*/
		Thread.sleep(2000);
		//by passing the input as JS code
		jse.executeScript("arguments[0].scrollIntoView(false)",newsEle);
		
		Thread.sleep(2000);
		File src = newsEle.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/newsEle.png");
		
		Files.copy(src, dest);
	}
}	