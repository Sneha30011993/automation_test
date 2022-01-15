package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicite_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement Create = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		Create.click();
		
		WebDriverWait wait= new WebDriverWait(driver, 5);
		
		WebElement firstname =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\\\"firstname\\\"]")));
		firstname.sendKeys("Sneha");
		
		WebElement latstname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		latstname.sendKeys("Desai");
		
	}

}
