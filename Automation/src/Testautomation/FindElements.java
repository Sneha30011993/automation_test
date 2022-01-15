package Testautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
		
		List<WebElement> input=driver.findElements(By.xpath("(//input[@autocorrect=\"off\"])"));
         input.get(0).sendKeys("abcd");
         input.get(1).sendKeys("qwer");
	}

}
