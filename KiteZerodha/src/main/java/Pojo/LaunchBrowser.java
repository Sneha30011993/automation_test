package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		public static WebDriver callbrowser(String string) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get(string);//Call URL
			
			return driver;
		}
	}

