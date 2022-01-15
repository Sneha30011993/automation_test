package Testautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implisite_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		WebElement Create = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		Create.click();
		WebElement firstname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstname.sendKeys("Sneha");
		WebElement latstname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		latstname.sendKeys("Desai");
		
		
	}

}
