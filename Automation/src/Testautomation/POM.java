package Testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

		@FindBy(xpath="//input[@type=\"text\"]") private WebElement UserName;
		@FindBy(xpath="//input[@type=\"password\"]") private WebElement Password;
		@FindBy(xpath="//button[@type=\"submit\"]") private WebElement Login;
		@FindBy(xpath="//a[text()='Forgot password?']") private WebElement ForgotPass;
		
		public POM(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void EnterUsername(String Name ) {
			UserName.sendKeys(Name);
	}
        public void EnterPassword(String pass) {
        	Password.sendKeys(pass);
        }
        
        public void Clicklogin() {
        	Login.click();
        }
        
        public  boolean isloginbuttondisplayed() {
        	Boolean status =Login.isDisplayed();
        	
			return status;
        }
        public void ClickForgotPass() {
        	ForgotPass.click();
        }
        

}