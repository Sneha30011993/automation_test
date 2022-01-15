package Testautomation;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEventPractice {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Browser.callbrowser("http://demo.guru99.com/test/simple_context_menu.html");
		Actions action=new Actions(driver);
		WebElement rc=driver.findElement(By.xpath("//span[text()='right click me']"));
		action.moveToElement(rc).contextClick(rc).build().perform();
		WebElement copy=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span"));
		action.moveToElement(copy).click().perform();
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement DC=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.moveToElement(DC).doubleClick().perform();
		Alert a1=driver.switchTo().alert();
		Thread.sleep(2000);
		String message = a1.getText();
		if(message.equals("You double clicked me.. Thank You.."))
		{
			a1.accept();
	
		}
		
	}

}
