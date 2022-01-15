package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =Browser.callbrowser("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Sneha");
	}

}
