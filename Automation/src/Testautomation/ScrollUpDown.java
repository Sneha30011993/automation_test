package Testautomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        WebDriver driver= Browser.callbrowser("https://www.amazon.in/");
        driver.manage().window().maximize();
//        WebElement uname=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
//        uname.sendKeys("va@sales.com");
//        
//        WebElement pass=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
//        pass.sendKeys("123456");
//        
//        WebElement login=driver.findElement(By.xpath("//[@type=\"submit\"]"));
//        login.click();
        
      //Identify the WebElement which will appear after scrolling down
        WebElement Backtotop=driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
     // Create instance of Javascript executor
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		// now execute query which actually will scroll until that element is not appeared on page.
		execute.executeScript("arguments[0].scrollIntoView(true)", Backtotop);
		Screenshot.takescreenshot(driver, "Omprakash");
        
	}

}
