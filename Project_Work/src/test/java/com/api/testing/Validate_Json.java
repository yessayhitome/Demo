package com.api.testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Validate_Json {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project_Work\\src\\test\\java\\com\\api\\testing\\Payload.json");
		
		FileReader reader = new FileReader(f);
		
		JSONParser jsonPraser = new JSONParser();
		
		Object parse = jsonPraser.parse(reader);
		
		JSONObject jsonObj = (JSONObject) parse;
		
		Object object = jsonObj.get("name");
		
		System.out.println(object.toString());
		
		
	}

}
