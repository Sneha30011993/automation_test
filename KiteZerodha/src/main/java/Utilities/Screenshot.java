package Utilities;

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
	    File destination= new File("E:\\sneha\\KiteZerodha\\Screenshots\\"+ a+".png");
	    //E:\sneha\KiteZerodha\Screenshots
	    FileHandler.copy(source, destination);
		
	    
	}
}
