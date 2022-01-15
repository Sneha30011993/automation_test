package Testautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildWindowPopUpNaukari {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =Browser.callbrowser("https://www.naukri.com/");
		driver.manage().window().maximize();
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		
		while(itr.hasNext()==true) {
			
			driver.switchTo().window(itr.next());
			//String expectedTitle="IQVIA";
			String expectedurl="https://company.naukri.com/popups/techmahindra/9dec2021/index.html";
			//String currentTitle=driver.getTitle();
			String currenturl=driver.getCurrentUrl();		
			Thread.sleep(2000);
			if(expectedurl.equals(currenturl)) 
			{
				//driver.manage().window().maximize();
				//driver.findElement(By.xpath("//img[@alt=\"IQVIA\"]")).click();
				driver.findElement(By.xpath("//img[@alt=\"Tech Mahindra\"]")).click();
				
			}
			else
			{
				driver.close();
			}
		
		}
		

	}

}
