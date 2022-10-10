package com.testng.annotation;

public class Array_2D {
	
	static int[] a = {1,5,9,74};
	
	static String[][] d = {{"Ind","7","MSD"},{"Ind","18","VK"}};
	
	
	
	public static void main(String[] args) {
		
		System.out.println(a[0]);
		
		System.out.println(a.length);
		
		System.out.println(d[1][2]);
		
		System.out.println(d.length);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		for (int b : a) {
			System.out.println(b);
		}
		
		for (int i = 0; i < d.length; i++) {
			
			for (int j = 0; j < d.length; j++) {
				
				System.out.println(d[i][j]);
				
			}
			
		}
		
	}

}
