package com.samplePackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;		


public class SampleTest1 {
	private WebDriver driver;
	String baseUrl="http://demo.guru99.com/test/newtours/";
	
	@BeforeTest
	public void beforeTest() {	
		
		String driverPath="C:\\selenium\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();  
	}	
	
	@Test				
	public void testEasy() {	
		driver.get(baseUrl);  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Mercury")); 		
	}	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}		
}	