package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=Browser.callbrowser("https://demoqa.com/text-box");
	    driver.manage().window().maximize();
	    WebElement Uname= driver.findElement(By.xpath("//input[@id=\"userName\"]"));
	    Uname.sendKeys("Sneha Desai");
	    WebElement email= driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
	    email.sendKeys("Sneha@gmail.com");
	    WebElement address= driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
	    address.sendKeys("Madhuban Society,Pune");
	    Actions action= new Actions(driver);
	    
	    //Select all
	    action.keyDown(Keys.CONTROL);
	    action.sendKeys("a");
	    action.keyUp(Keys.CONTROL);
	    action.build().perform();
	    //Copy
	    action.keyDown(Keys.CONTROL);
	    action.sendKeys("c");
	    action.keyUp(Keys.CONTROL);
	    action.build().perform();
	    //Next tab
	    action.sendKeys(Keys.TAB);
	    action.build().perform();
	    //paste
	    
	    action.keyDown(Keys.CONTROL);
	    action.sendKeys("v");
	    action.keyUp(Keys.CONTROL);
	    action.build().perform();
	   
	

	}

	
}
