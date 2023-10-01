package xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/b2c_1a_signup_signin/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&scope=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc%20openid%20profile%20offline_access&redirect_uri=https%3A%2F%2Floyalty.airindia.com%2Fin%2Fen%2Faccount-summary.html&client-request-id=cd279fd1-297d-418d-ae86-e17bf1240475&response_mode=fragment&response_type=code&x-client-SKU=msal.js.browser&x-client-VER=2.31.0&client_info=1&code_challenge=p3AT3HQ4M6hktjXAvDOapDkHqlkW7uiHroSM6-L_KUo&code_challenge_method=S256&nonce=256c28dc-f524-4c73-ba9a-7db1c55d60ce&state=eyJpZCI6Ijk2NGIzNzljLWZjMTEtNDJkMS1iNjlmLTZhODViYjI2ZGFhMSIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3D");
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//input[@id ='signInName']")).sendKeys("shewaledhiraj29@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id ='forgotPasswordButton']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id ='next']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}