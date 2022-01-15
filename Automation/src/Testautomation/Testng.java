package Testautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Testng {
	
	@BeforeClass
	public void BeforeClass() 
	{
		System.out.println("Beforeclass");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Afterclass");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	
	
	@BeforeMethod
	

	public void BeforeMethode() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethode() {
		System.out.println("AfterMethod");
	}
	
	
	@Test(invocationCount = 1)

	public void loginwithvalidcred(){
		 WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
		POM p =new POM(driver);
		p.EnterUsername("s.m@gmail.com");
		p.EnterPassword("123456");
		p.Clicklogin();
		p.ClickForgotPass();
		driver.close();
}

	@Test(priority=1,invocationCount = 1)
	public void logininvalid() {
		
		WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
		POM p =new POM(driver);
		p.EnterUsername("sneha.m@gmail.com");
		p.EnterPassword("123456");
		p.Clicklogin();
		p.ClickForgotPass();
		driver.close();
	}	
		@Test(enabled = false)
		public void logninvalid1() {
			
//			WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
//			POM p =new POM(driver);
//			p.EnterUsername("sneha.m@gmail.com");
//			p.EnterPassword("1");
//			p.Clicklogin();
//			p.ClickForgotPass();
			System.out.println("sneha");
		}
		
		@Test(timeOut = 1000)
		public void logninvalid2() throws InterruptedException {
			Thread.sleep(2000);
			WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
			POM p =new POM(driver);
			p.EnterUsername("sneha.m@gmail.com");
			p.EnterPassword("1");
			p.Clicklogin();
			p.ClickForgotPass();
		}
		
		@Test(dependsOnMethods = {"logninvalid2"})
		public void login() {
			System.out.println("Login");
		}
		
		
		@Test()
		public void logout(){
			System.out.println("logout");
		}
			
//		@Test()
//		@Parameters({"a","b"})
//		public void login(int a,int b) {
//			System.out.println(a+b);
//		}
//		
		@DataProvider(name="mydata")
		public Object[][] Credentials(){
		
		return new Object[][]{{"Sneha"},{"Abhijeet"}};
		}
		@Test(dataProvider="mydata")
		public void div(String name) {
			System.out.println(name);
		}
	
	}

