package com.testing.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional_Demo {
	
	@Parameters({"age","year"})
	@Test
	private void age(@Optional("18") int age, String year) {
		
		System.out.println("Age : " + age);
		
		System.out.println("Year : " + year);

	}

}
