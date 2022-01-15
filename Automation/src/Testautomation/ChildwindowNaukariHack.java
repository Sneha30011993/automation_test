package Testautomation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildwindowNaukariHack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =Browser.callbrowser("https://www.naukri.com/");
		ArrayList<String> handles= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(handles.get(0));
		driver.close();
		driver.switchTo().window(handles.get(1));
		driver.close();
		driver.switchTo().window(handles.get(2));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt=\"Tech Mahindra\"]")).click();

	}

}
