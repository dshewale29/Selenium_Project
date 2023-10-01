package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		/*
		//single select dropdown
		driver.get("file:///C:/Users/Dhira/Downloads/html%20selenium/Dropdown.html");
		WebElement dropownele1 = driver.findElement(By.id("i1"));

		Select ele1 = new Select(dropownele1);
		Thread.sleep(2000);
		ele1.selectByIndex(1);

		//deleselect the option from single select dropdown
		Thread.sleep(2000);
		ele1.deselectByIndex(1);
		Note = If we try to deselect the option from single select dropdown we will get an excetion call as 
		= UnsupportedOperationException
		*/



		//multi select dropdown
		driver.get("file:///C:/Users/Dhira/Downloads/html%20selenium/MultiSelectDropDown.html");

		//select dropdown
		WebElement dropdownele = driver.findElement(By.id("i1"));

		Select ele = new Select(dropdownele);

		/*//select single option from multiselect dropdown
		Thread.sleep(2000);
		ele.selectByIndex(3);

		//deselect single option from multiselectdropdown
		Thread.sleep(2000);
		ele.deselectByIndex(3);*/

		/* 
		//select multiple options from multiselectdropdown
		for(int i = 0; i <= 2; i++){
			Thread.sleep(2000);
			ele.selectByIndex(i);
		}

		Thread.sleep(2000);

		//deselect multiple options from multiselectdropdown
		for(int i = 0; i <= 4; i++){
			Thread.sleep(2000);
			ele.deselectByIndex(i);
		}
		*/


		//select multiple options by using selectByValue();
		String arr[] = {"v1","v2","v3","v4","v5","v6"};

		for(int i = 0; i < arr.length; i++) {
			Thread.sleep(2000);
			ele.selectByValue(arr[i]);
		}

		ele.deselectAll();

		/*//deselect multiple options by using selectByValue();
		for(int i = 0; i < arr.length; i++) {
			Thread.sleep(2000);
			ele.deselectByValue(arr[i]);
		}*/


		/*
		Thread.sleep(2000);
		ele.selectByVisibleText("poha");

		Thread.sleep(2000);
		ele.deselectByVisibleText("poha");
		*/

		/*
		//select multiple options by using selectByVisibleText()
		String arr[] = {"poha","misal pav","vada pav","dabeli","pakoda","tea"};

		for(int i = 0; i < arr.length; i++) {
			Thread.sleep(2000);
			ele.selectByValue(arr[i]);
		}	

		//deselect multiple options by using selectByVisibleText();
		for(int i = 0; i < arr.length; i++) {
			Thread.sleep(2000);
			ele.deselectByValue(arr[i]);
		}
		*/

		Thread.sleep(3000);
		driver.quit();
	}
}