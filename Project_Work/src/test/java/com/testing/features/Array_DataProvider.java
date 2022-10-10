package com.testing.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array_DataProvider {
	
	@DataProvider
	public String[][] all_Data() {
		
		String[][] data = 
				
			{
				
				{"Ind","Dhoni"},{"Ind","Kohli"},{"Aus","Lee"}
		
			};	
		
		return data;
		
		}

	@Test(dataProvider = "all_Data")
	private void player_Data(String team, String player) {
		
		System.out.println("Team : " + team);
		
		System.out.println("Player : " + player);

	}
	
	
	
	
	}


