package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://desktop-p1b696p/login.do");
		
		//read the source code
		String loginPageSourceCode = driver.getPageSource();
		System.out.println(loginPageSourceCode);
		
		//or
		//System.out.println(driver.getPageSource());
		driver.close();
	}
}