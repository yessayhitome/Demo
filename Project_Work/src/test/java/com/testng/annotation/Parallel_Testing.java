package com.testng.annotation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base_Utility.Base_Class;

public class Parallel_Testing extends Base_Class{
	
	public static WebDriver driver;
	
	
	@Test
	private void facebook() {
		
		driver = Base_Class.get_Browser("chrome");
		
		get_Url("https://www.facebook.com/");

	}
	
	@Test
	private void instragram() {
		
        driver = Base_Class.get_Browser("chrome");
		
		get_Url("https://www.instagram.com/");

	}

}
