package methodsOfWebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//maximize the web browser
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();
	}
}
