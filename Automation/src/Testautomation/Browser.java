package Testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		//driver.get("http://fb.com");//Call URL
//		driver.navigate().to("http://fb.com");//Call or navigate URL
//		Thread.sleep(4000);
//		driver.navigate().back();//Navigate to Previous page of browser
//		Thread.sleep(4000);
//		driver.navigate().forward();//Navigate to Next page of browser
//		Thread.sleep(4000);
//		driver.navigate().refresh();//Reload/refresh the page
//		Thread.sleep(4000);
//		driver.manage().window().maximize();//maximise the browser page
//		Thread.sleep(4000);
//		driver.manage().window().minimize();//minimise the browser page
//		Thread.sleep(4000);
//		String title=driver.getTitle();//to get title of current page
//		System.out.println(title);
//		//System.out.println(driver.getTitle());
//		String url=driver.getCurrentUrl();//to get current url of webpage
//		System.out.println(url);
//		//System.out.println(driver.getCurrentUrl());
//		driver.close();//close the webpage
//		
//		
//		
//	}
	

	public static WebDriver callbrowser(String string) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(string);//Call URL
		
		return driver;
	}
	

}
