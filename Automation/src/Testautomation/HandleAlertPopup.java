package Testautomation;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =Browser.callbrowser("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement alertbox =driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
		alertbox.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		WebElement confirmalertbox =driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]"));
		confirmalertbox.click();
		Thread.sleep(2000);
		a.dismiss();
		WebElement promptalertbox =driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]"));
		promptalertbox.click();
		//Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		String message = a1.getText();
		System.out.println(message);
		a1.sendKeys("Yes");
		Thread.sleep(2000);
		//a.accept();
		//a.getText();
		
		
	}

}
