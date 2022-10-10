package com.testng.annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base_Utility.Base_Class;

public class TimeOut_Demo extends Base_Class {
	
	public static WebDriver driver;
	
	@BeforeSuite
	
	private void setup() {
		
		driver = Base_Class.get_Browser("chrome");

	}
	
	@Test(timeOut = 10000)
	private void facebook() throws InterruptedException {
		
		get_Url("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("timeout@gmail.com");

	}

}
