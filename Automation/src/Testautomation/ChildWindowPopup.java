package Testautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =Browser.callbrowser("https://demo.guru99.com/popup.php");
		WebElement Clickhere= driver.findElement(By.xpath("//a[text()='Click Here']"));
		Clickhere.click();
		 
		Set<String> handles=driver.getWindowHandles();//all the address will set in set
		Iterator<String> itr =handles.iterator();//Helps to iterate value of set
		Iterator<String> itr1 =handles.iterator();//Helps to iterate value of set
		
		for(int i=1; i<=handles.size();i++) {
			
			String handle=itr.next();
			driver.switchTo().window(handle);//will change the focus of selenium to the handle address
			String url=driver.getCurrentUrl();
			String expectedurl="http://demo.guru99.com/articles_popup.php";
			
			System.out.println("in for loop"+i);
			
		}
		
		while(itr1.hasNext()==true)//Will return true till the value is present in set
		{
			
			String handle=itr1.next();
			driver.switchTo().window(handle);//will change the focus of selenium to the handle address
			String url=driver.getCurrentUrl();
			String expectedurl="http://demo.guru99.com/articles_popup.php";
		
			
		
		if(expectedurl.equals(url)){
			driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("Sneha");
		}
		
		else{
			
			driver.close();
		}
		
		
}
	}
}