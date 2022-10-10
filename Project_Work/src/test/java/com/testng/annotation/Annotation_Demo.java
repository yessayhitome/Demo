package com.testng.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Demo {
	
	@Test
	private void c_Dress() {
		
		System.out.println("Casual Dress");

	}
	
	@BeforeMethod
	
	private void login() {
		
		System.out.println("Login");

	}
	
	@AfterMethod
	
	private void logout() {
		
		System.out.println("Logout");

	}
	
	@Test
	
	private void t_Shirt() {
		
		System.out.println("T Shirt");
		
	}
	
	@Test
	
	private void s_Dress() {
		
		System.out.println("Summer Dress");

	}
	
	}
	
	
	


