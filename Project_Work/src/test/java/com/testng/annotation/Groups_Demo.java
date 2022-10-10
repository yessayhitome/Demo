package com.testng.annotation;

import org.testng.annotations.Test;

public class Groups_Demo {
	
	@Test(groups = "Social Media")
	private void facebook() {
		
		System.out.println("Facebook");

	}
	
	@Test(groups = "Social Media")
	
	private void whatsapp() {
		
		System.out.println("WhatsApp");

	}
	
	@Test(groups = "Social Media")
	private void reddit() {
		
		System.out.println("Reddit");

	}
	
	@Test(groups = "Music")
	private void spotify() {
		
		System.out.println("Spotify");

	}
	
	@Test(groups = "Studies")
	private void books() {
		
		System.out.println("Books");

	}
	
	@Test(groups = "Music")
	private void wynk() {
		
		System.out.println("Wynk");

	}

}
