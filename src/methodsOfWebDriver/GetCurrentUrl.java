package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://desktop-p1b696p/login.do");

		//read the url of current web page
		String urlOfLoginPage = driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);

		//or
		//System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}