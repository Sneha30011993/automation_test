package Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=Browser.callbrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement Products=driver.findElement(By.xpath("//select[@id='first']"));
		Select sel =new Select(Products);
		sel.selectByVisibleText("Yahoo");
		Thread.sleep(2000);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("Apple");

	}

}
