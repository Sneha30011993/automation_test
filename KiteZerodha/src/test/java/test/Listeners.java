package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import Utilities.Screenshot;

public class Listeners implements ITestListener {
	public void onTestStart(ITestResult result) {  
		System.out.println("Test is Started"+result.getName());
	} 
	public void onTestSuccess(ITestResult result) {  
	System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	public void onTestFailure(ITestResult result) {  
		
	System.out.println("Hello this failed "+result.getName());
	
	}  
	public void onTestSkipped(ITestResult result) {  
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	}   
	public void onStart(ITestContext context) {  
		System.out.println("Onstart");
	}  
	public void onFinish(ITestContext context) {  
		System.out.println("OnFinish");
	}  
	}