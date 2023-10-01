package seleniumproject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		//take input from user we user scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser value");
		String browserValue = sc.next();
		
		if (browserValue.equalsIgnoreCase("chrome")) 
		{
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
		}
		else if (browserValue.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
		}
		else if (browserValue.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
		    driver.close();
		}
		else 
		{
			System.out.println("Invalid browser value");
		}
	}
}