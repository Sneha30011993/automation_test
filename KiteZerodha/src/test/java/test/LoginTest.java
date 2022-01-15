package test;



import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.LoginPage;
import Pojo.LaunchBrowser;





public class LoginTest {
static Logger log =Logger.getLogger(LoginTest.class.getName());
	@Test(invocationCount = 1)

	public void loginwithvalidcred(){
		log.info("Get Stareted");
		 WebDriver driver=LaunchBrowser.callbrowser("https://kite.zerodha.com/");
		
		LoginPage p =new LoginPage(driver);
		p.EnterUsername("s.m@gmail.com");
		p.EnterPassword("123456");
		p.Clicklogin();
		p.ClickForgotPass();
		log.info("Success");
		//	driver.close();
}
}
