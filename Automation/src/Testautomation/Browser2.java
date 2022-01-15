package Testautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
          
          WebDriver driver=new ChromeDriver();
          driver.get("http://fb.com");
          Dimension size=new Dimension(200,500);
          driver.manage().window().setSize(size);      
          
          Point point=new Point(900,700);
          driver.manage().window().setPosition(point);
          
          Thread.sleep(5000);
          
	}

}
