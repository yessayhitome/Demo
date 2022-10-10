package com.api.testing;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Retrieve_The_Response {
	
	@Test
	public void retrieve() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users/2");
		
		String statusLine = response.getStatusLine();
		
		System.out.println("Status Line : "+statusLine);
		
		String body = response.asString();
		
		System.out.println("Body : "+body);
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Validation Sucessful");
		
		
		

	}

}
