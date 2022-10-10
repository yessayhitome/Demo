package com.testng.annotation;

import org.testng.annotations.Test;

public class Excepted_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator() {
		
		System.out.println(10/0);

	}

}
