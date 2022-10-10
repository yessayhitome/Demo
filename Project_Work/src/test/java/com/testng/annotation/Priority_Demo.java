package com.testng.annotation;

import org.testng.annotations.Test;

public class Priority_Demo {
	
	@Test()
	private void ug() {
		
		System.out.println("UG");

	}
	
	@Test(priority = 1)
	private void pg() {
		
		System.out.println("PG");

	}

	@Test(priority = -1)
	
	private void sslc() {
		
		System.out.println("SSLC");

	}
	
	@Test()
	private void hsc() {
		
		System.out.println("HSC");

	}
}
