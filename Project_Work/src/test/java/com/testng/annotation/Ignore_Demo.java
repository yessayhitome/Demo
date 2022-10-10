package com.testng.annotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {
	
	//Way 01
	
	@Test(dependsOnMethods = "whatsapp")
	private void facebook() {
		
		System.out.println("Facebook");

	}
	
	@Test
	
	private void whatsapp() {
		
		System.out.println("WhatsApp");

	}
	
	@Test
	private void reddit() {
		
		System.out.println("Reddit");

	}
	
	@Test
	private void spotify() {
		
		System.out.println("Spotify");

	}
	
	@Test(enabled = false)
	private void books() {
		
		System.out.println("Books");

	}
	
	@Test
	private void wynk() {
		
		System.out.println("Wynk Music");

	}
	
	//Way 2
	
	@Ignore
	@Test
	private void books1() {
		
    System.out.println("Books1");
    
	}
	
	
	

}
