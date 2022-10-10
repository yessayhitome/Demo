package com.testing.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_Parameter {
	
	@Parameters({"user","Pass"}
	)
	@Test
	private void login(String username, String password) {
		
		System.out.println("Username : " + username);
		
		System.out.println("Password : " + password);

	}
	
	@Parameters({"age","Year"})
	@Test
	private void age(int age, String year) {
		
		System.out.println("Age : " + age);
		
		System.out.println("Year : " + year);

	}
	
	
	
	
	

}
