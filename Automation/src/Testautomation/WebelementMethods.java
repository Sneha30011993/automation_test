package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		Boolean status=option1.isSelected();
		System.out.println(status);
		option1.click();
		
		Boolean status1=option1.isSelected();
		System.out.println(status1);
		
		WebElement  Selenium =driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
		Selenium.click();
		Thread.sleep(3000);
		
//		WebElement  Tabledemo =driver.findElement(By.linkText("Table Demo"));
//		Thread.sleep(2000);
//		Tabledemo.click();
//		
		
		WebElement Radiocheckbox=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a"));
		Boolean status2 =Radiocheckbox.isDisplayed();
		System.out.println(status2);
		
		
		WebElement pagetitle=driver.findElement(By.xpath("//*[@id=\"site-name\"]/a"));
		String name=pagetitle.getText();
		if(name.equals("Demo Site")) {
			System.out.println("Test Passed");
	
		}
		
		else {
			System.out.println("Test Fail");
		}
//		
		}
		
		}


