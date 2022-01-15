package Testautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\sneha\\sneha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println(row.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
		System.out.println(column.size());

		double textvalue;
		double a=0;
		String Name="";
		
		for(int i=1; i<row.size(); i++)
		
		{
			WebElement c4 = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			WebElement C1=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]"));
			
			String value = c4.getText();
			
			textvalue=Double.parseDouble(value);
			
			if(textvalue>a) {
				a=textvalue;
				Name=C1.getText();
			}
			
		}
		
		System.out.println("max value is"  +a);
		System.out.println("max value is"  +Name);
		
		for(int i=1; i<row.size(); i++)
			
		{
			WebElement c4 = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			WebElement C1=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]"));
			
			String value = c4.getText();
			
			textvalue=Double.parseDouble(value);
			
			if(textvalue<a) {
				a=textvalue;
				Name=C1.getText();
			}
			
		}
		System.out.println("min value is"  +a);
		System.out.println("min value is"  +Name);
	}
	

	
}
