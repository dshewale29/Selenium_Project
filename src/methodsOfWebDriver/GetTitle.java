package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	//it is use to get the
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instgram.com");
		
		//read the title
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		
		//or
		//System.out.println(driver.getTitle());
		driver.close();
	}
}