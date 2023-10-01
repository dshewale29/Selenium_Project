package dropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Dhira/Downloads/html%20selenium/MultiSelectDropDown.html");
		
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		//handle dropdown
		Select sel = new Select(dropDownElement);
		
		//remove duplicate using hashset
		HashSet<String> hs = new HashSet();
		
		/*
		//read the options from dropdown
		List<WebElement> allOpts = sel.getOptions();
		
		//read the options
		for(int i = 0; i < allOpts.size(); i++) {
			Thread.sleep(20000);
			String opt = allOpts.get(i).getText();
			hs.add(opt);
		}
		
		for(String op1: hs) {
			System.out.println(op1);
		}
		*/
		
		//remove duplicates from the dropdown using treeset
		TreeSet<String> ts = new TreeSet();
		
		//read the options from dropdown
		List<WebElement> allOps = sel.getOptions();
		
		//read the options
		for(int i = 0;i < allOps.size();i++) {
			//read the options from dropdown
			Thread.sleep(2000);
			String opt = allOps.get(i).getText();
			ts.add(opt);
		}
		
		for(String op : ts) {
			System.out.println(op);
		}
	}
}