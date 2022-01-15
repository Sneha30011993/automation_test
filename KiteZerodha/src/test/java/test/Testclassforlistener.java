package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.LoginPage;
import Pojo.LaunchBrowser;
import Utilities.Screenshot;



@Listeners(test.Listeners.class)

public class Testclassforlistener {
WebDriver driver;
@BeforeMethod
public void Browser() {
	driver=LaunchBrowser.callbrowser("https://kite.zerodha.com/");
}




//	@Test
//	public void Aest() {
//		System.out.println("Hi");
//	}
//
//	@Test
//	public void Login() {
//		System.out.println("Sneha");
//		
//	}
	
	@Test(timeOut=50000)
	public void Logout() throws InterruptedException, IOException {
		
		
		System.out.println("Atharv");
		 driver=LaunchBrowser.callbrowser("https://kite.zerodha.com/");
			
			LoginPage p =new LoginPage(driver);
			p.EnterUsername("s.m@gmail.com");
			p.EnterPassword("123456");
			p.Clicklogin();
			p.ClickForgotPass();
			
			Thread.currentThread().sleep(20);
			//	driver.close();
	
		
	}
	
	@Test(dependsOnMethods = {"Logout"})
	public void Checkout() {
		System.out.println("Abhi");		
		
	}
	
	@AfterMethod
	public  void screenshot(ITestResult result) throws IOException 
	{
		
		try {
		if(result.getStatus()==ITestResult.FAILURE) {
			Screenshot.takescreenshot(driver, "ABC");
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	
}
