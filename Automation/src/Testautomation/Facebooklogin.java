package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webDriver.gecko.driver", "E:\\sneha\\sneha\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://fb.com");
		//username
		WebElement user =driver.findElement(By.id("email"));
		user.sendKeys("Sneha@gmail.com");
		//password
		WebElement p=driver.findElement(By.id("pass"));
		p.sendKeys("13445");
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"u_0_d_AN\"]"));
		btn.click();

	}

}
