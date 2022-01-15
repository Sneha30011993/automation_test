package Testautomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
		
		String email=Excel.getdata(0, 0);
		WebElement userid= driver.findElement(By.xpath("//input[@type=\"text\"]"));
		userid.sendKeys(email);                                                   
		                                                                            
		double pass=Excel.getdata1(0, 1);                                                                          
	WebElement password= driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys(String.valueOf(pass));
	}

}

