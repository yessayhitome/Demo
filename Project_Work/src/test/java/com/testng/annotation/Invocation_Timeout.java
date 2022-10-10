package com.testng.annotation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base_Utility.Base_Class;

public class Invocation_Timeout extends Base_Class{
	
	public static WebDriver driver;
	
	@Test
	private void browser() {
		
		driver = get_Browser("Chrome");

	}
	
	@Test
	private void url() {
		
		driver.get("https://www.amazon.in/");

	}
	
	@Test(priority = 1,invocationCount = 3,invocationTimeOut = 50000)
	private void refresh() {
		
driver.navigate().refresh();
	}
	

}
