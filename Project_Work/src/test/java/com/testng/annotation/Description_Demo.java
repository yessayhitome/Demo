package com.testng.annotation;

import org.testng.annotations.Test;

public class Description_Demo {
	
	@Test(description = "open browser")
	private void browser() {
		
		System.out.println("Browser");

	}
	
	@Test
	private void url() {
		
		System.out.println("URl");

	}
	
	@Test(priority = 1,invocationCount = 3,description = "Refresh the url"
			)
	private void refresh() {
		
		System.out.println("Refresh");

	}

}
