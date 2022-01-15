package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =Browser.callbrowser("https://demoqa.com/frames");
		//driver.switchTo().frame("frame1"); //By id
		//driver.switchTo().frame(1);//By index
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame1\"]")));//Webelement
		WebElement text=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
		System.out.println(text.getText());

	}

}
