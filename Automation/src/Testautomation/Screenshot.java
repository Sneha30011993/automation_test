package Testautomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	

	public static void takescreenshot(WebDriver driver,String a) throws IOException {
		// TODO Auto-generated method stub

		
	    File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination= new File("C:\\Users\\admin\\Desktop\\Sneha Study\\Selenium\\"+ a+".png");
	    FileHandler.copy(source, destination);
	    
	    
	}

}
