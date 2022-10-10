package com.testng.annotation;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	
	
	@Test(priority = 1)
	private void zeb() {
		
		System.out.println("zebronics");

	}
	
	@Test(priority = 2)
	private void laptop() {
		
		System.out.println("Laptop");

	}
	
	@Test(dependsOnMethods = "laptop")
	private void offer() {
		
		System.out.println("Offer");

	}
	
	

}
