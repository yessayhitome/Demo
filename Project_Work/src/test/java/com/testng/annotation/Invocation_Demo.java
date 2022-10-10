package com.testng.annotation;

import org.testng.annotations.Test;

public class Invocation_Demo {
	
	@Test
	private void browser() {
		
		System.out.println("Browser");

	}
	
	@Test
	private void url() {
		
		System.out.println("URl");

	}
	
	@Test(priority = 1,invocationCount = 3)
	private void refresh() {
		
		System.out.println("Refresh");

	}
	
	

}
