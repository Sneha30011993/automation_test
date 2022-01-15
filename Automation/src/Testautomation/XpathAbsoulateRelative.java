package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAbsoulateRelative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\\\sneha\\\\sneha\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		WebElement Userid=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/input")); //Absoulate xpath
		Userid.sendKeys("ABCD");
		Thread.sleep(2000);
		Userid.clear();
		Thread.sleep(2000);
		Userid.sendKeys("pqrs");
		
		WebElement Password=driver.findElement(By.xpath("(//html//body//form//input)[2]"));// Relative Xpath
		Password.sendKeys("1234");
		
		WebElement login= driver.findElement(By.xpath("//button[contains(@class,button)]"));//Xpath by contains
        login.click();
        
        WebElement forgotpassword= driver.findElement(By.linkText("Forgot password?"));
	    forgotpassword.click();
	}

}


