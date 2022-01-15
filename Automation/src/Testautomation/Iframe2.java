package Testautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iframe2 {
	public static void main(String[] args) {
		
		WebDriver driver =Browser.callbrowser("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[1]")).click();
//		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Sneha");
		
	}

}
