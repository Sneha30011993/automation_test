package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		WebElement userid= driver.findElement(By.xpath("(//input[@autocorrect=\"off\"])[1]"));//CSS= tagname[attribute="value"]
		userid.sendKeys("Sneha");                                                   //Xpath by attribute //tagname[@attribute="value"]
		                                                                            //Xpath by contains //tagname[contains(@attributename,partialAttributeValue)]
		                                                                            
	WebElement password= driver.findElement(By.xpath("(//input[@autocorrect=\"off\"])[2]"));//Xpath by attribute //tagname[@attribute="value"]
       password.sendKeys("12");                                                  //Xpath by index // any xpath express[]index
//         
//         
//       
       WebElement login= driver.findElement(By.xpath("//button[contains(@class,button)]"));//Xpath by contains
//         login.click();
//         
       WebElement forgotpassword=driver.findElement(By.xpath("//a[text()=\"Forgot password?\"]"));//Xpath by text
     forgotpassword.click();
     

	}

}
