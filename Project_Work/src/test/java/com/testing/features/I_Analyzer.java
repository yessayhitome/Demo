package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Analyzer {
	
	@Test
	private void demo() {
		
		String user = "Rahul";
		
		String db_User = "Kolhi";
		
	    Assert.assertEquals(user, db_User);
	}
    @Test
     private void pwd() {
    	
    	String pass = "night";
    	
    	String db_pass = "night";
    	
    	Assert.assertEquals(pass, db_pass);
	

}

}
