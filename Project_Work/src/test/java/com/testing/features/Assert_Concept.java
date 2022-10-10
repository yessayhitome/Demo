package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	@Test
	private void demo() {
		
		String username = "Smith";
		
		String db_Username = "smith";
		
		System.out.println("Before Assert");
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(username, db_Username);
		
		System.out.println("Validation Success");

	}
	
	

}
