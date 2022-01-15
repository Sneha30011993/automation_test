package Testautomation;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
//		MutableCapabilities caps = null;
//		caps.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver =Browser.callbrowser("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Sneha");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
	//	String currentwindow = driver.getWindowHandle();
		
	//driver.findElement(By.xpath("")).click();
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
	//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div[2]/iframe")));
	//driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
//		Alert a = driver.switchTo().alert();
//		a.dismiss();
		
	}

	}


