package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEventAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Browser.callbrowser("https://www.amazon.in/");
		Actions action=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		action.moveToElement(signin);
		action.perform();
		Thread.sleep(2000);
		WebElement prime=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		prime.click();
		
	}

}
