package Testautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousedraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=Browser.callbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(iframe);
		Actions action=new Actions(driver);
		List<WebElement> source=driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
		WebElement trash=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		for(int i=0;i<source.size();i++) {
		action.dragAndDrop(source.get(i), trash);
		action.perform();
	}
		List<WebElement> recycle=driver.findElements(By.xpath("//a[text()=\"Recycle image\"]"));
	    // List<WebElement> recycle=driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
	    // WebElement source1= driver.findElement(By.xpath("//*[@id=\"gallery\"]"));
		 for(int j=0;j<recycle.size();j++) {
		 recycle.get(j).click();
		//action.click(recycle.get(j)).perform();	 
	     //action.dragAndDrop(recycle.get(j),source1);
		// action.perform();
		 Thread.sleep(1000);
//			
		}

}

}
