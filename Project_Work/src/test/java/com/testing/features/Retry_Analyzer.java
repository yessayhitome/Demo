package com.testing.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer{

	int start_Point = 1;
	
	int end_Point = 5;
	
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (start_Point <= end_Point) {
			
			start_Point++;
			
			return true;
			
		}
		
		return false;
		
	}
	
	

}
