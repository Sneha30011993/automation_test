package Testautomation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	
		@Test
		public void loginwithvalidcred() throws IOException{
       	 WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
       	 POM pom=new POM(driver);
       	 pom.EnterUsername("Sneha@gmail.com");
       	 pom.EnterPassword("123456");
       	SoftAssert assertion= new SoftAssert();
       	 //Assert.assertEquals(pom.isloginbuttondisplayed(), true);//hard
       	assertion.assertEquals(pom.isloginbuttondisplayed(), false);
       	 String title = driver.getTitle();
       	 assertion.assertEquals(title, "Kite - Zerodha's fast and elegant flagship trading platform");//soft
       	 Assert.assertEquals(title, "Sneha");//hard
       	 pom.Clicklogin();
       	 pom.ClickForgotPass();
       assertion.assertAll();
        }
	}


