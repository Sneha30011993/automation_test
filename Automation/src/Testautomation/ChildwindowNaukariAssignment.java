package Testautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildwindowNaukariAssignment {
	
	public static void main(String[] args) {
		
	
	WebDriver driver =Browser.callbrowser("https://www.naukri.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()=\"GOT IT\"]")).click();
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/ul/div[1]/ul/li[1]/ul/li[2]/a")).click();
	
	Set<String> handles= driver.getWindowHandles();
	Iterator<String> itr = handles.iterator();
	while(itr.hasNext()==true)
	{
		String
		
	}
 	
}
}