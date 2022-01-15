package Testautomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbloginwithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=Browser.callbrowser("http://fb.com");
		String email=Excel.getdata(0, 0);
		WebElement user =driver.findElement(By.id("email"));
		user.sendKeys(email);
		//password
		double pass=Excel.getdata1(0, 1);  
		WebElement p=driver.findElement(By.id("pass"));
		p.sendKeys(String.valueOf(pass));

	}

}
