package Testautomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsZerodha {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");//Call URL
		
		WebElement userid= driver.findElement(By.id("userid"));
		userid.sendKeys("Sneha");
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
		WebElement login= driver.findElement(By.tagName("button"));
	     login.click();
		Thread.sleep(2000);
	     WebElement forgotpassword= driver.findElement(By.linkText("Forgot password?"));
	     forgotpassword.click();
	     
	     Screenshot.takescreenshot(driver, "Abhi");
	}

}
