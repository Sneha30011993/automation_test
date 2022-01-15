package Testautomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class POM1 {
	
	
         public void loginwithvalidcred() throws IOException{
        	 WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
        	 POM pom=new POM(driver);
        	 pom.EnterUsername("Sneha@gmail.com");
        	 pom.EnterPassword("123456");
        	 pom.Clicklogin();
        	 pom.ClickForgotPass();
        	Screenshot.takescreenshot(driver, "A1");
         }
         
         public void loginwithinvaliduname() {
        	 WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
        	 POM pom=new POM(driver);
        	 pom.EnterUsername("Sneha@gmail");
        	 pom.EnterPassword("123456");
        	 pom.Clicklogin();
        	 pom.ClickForgotPass();
         }
         
 public void loginwithinvalidpass() {
	 WebDriver driver=Browser.callbrowser("https://kite.zerodha.com/");
	 POM pom=new POM(driver);
	 pom.EnterUsername("Sneha@gmail.com");
	 pom.EnterPassword("");
	 pom.Clicklogin();
	 pom.ClickForgotPass();
         }
 
 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          POM1 p=new POM1();
          p.loginwithvalidcred();
          p.loginwithinvaliduname();
          p.loginwithinvalidpass();
          
	}

}
