package com.datadriven.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static String value;
	
	public static String particular_CellData() throws IOException {

		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project_Work\\Excel.xlsx");
		
		FileInputStream fil = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fil);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(1);
		
		CellType ct = c.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			 value = c.getStringCellValue();
			
			System.out.println(value);
			
		}
		else if (ct.equals(CellType.NUMERIC)) {
			
			double d = c.getNumericCellValue();
			
			//double to int
			
			int a = (int)d;     //narrowing type casting
			
			//int to string
			
			 value = String.valueOf(a);
			 
			 System.out.println(value);
		}
		
		wb.close();
		
		return value;
		
	}
	
public static String all_data() throws IOException {
		
		File f1 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project_Work\\Excel.xlsx");
		
		FileInputStream fi = new FileInputStream(f1);
		
		Workbook wb1 = new XSSFWorkbook(fi);
		
		Sheet s1 = wb1.getSheetAt(0);
		
		int no_of_rows = s1.getPhysicalNumberOfRows();
		
		for (int i = 0; i < no_of_rows ; i++) {
			
			Row r1 = s1.getRow(i);
			
			int no_of_cells = r1.getPhysicalNumberOfCells();
			
			for (int j = 0; j < no_of_cells; j++) {
				
				Cell c1 = r1.getCell(j);
				
				CellType ct1 = c1.getCellType();
				
				if (ct1.equals(CellType.STRING)) {
					
					String value = c1.getStringCellValue();
					
					System.out.println(value);
					
				}
				
				else if (ct1.equals(CellType.NUMERIC)) {
					
					double d = c1.getNumericCellValue();
					
					int a = (int)d;
					
					String value = String.valueOf(a);
					
					System.out.println(value);
				}
			}
		}
		
		    wb1.close();
		     
			return value;
		}
		
    public static String column_Data() throws IOException {
	
	File f2 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project_Work\\Excel.xlsx");
	
	FileInputStream fi2 = new FileInputStream(f2);
	
	Workbook wb2 =new XSSFWorkbook(fi2);
	
	Sheet s2 = wb2.getSheetAt(0);
	
	int no_of_rows = s2.getPhysicalNumberOfRows();
	
	for (int i = 0; i < no_of_rows; i++) {
		
		Row r2 = s2.getRow(i);
		
		Cell c2 = r2.getCell(0);
	
		CellType ct2 = c2.getCellType();
		
		if (ct2.equals(CellType.STRING)) {
			
			String value = c2.getStringCellValue();
			
			System.out.println(value);
			
		}
			else if (ct2.equals(CellType.NUMERIC)) {
				
				double d = c2.getNumericCellValue();
				
				int a = (int)d;
				
				String value = String.valueOf(a);
				
				System.out.println(value);
			}
			
		}
		
	wb2.close();
	
	return value;
	
	}
    
        public static String row_Data() throws IOException {
		
		File f3 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project_Work\\Excel.xlsx");
		
		FileInputStream fi3 = new FileInputStream(f3);
		
		Workbook wb3 = new XSSFWorkbook(fi3);
		
		Sheet s3 = wb3.getSheetAt(0);
		
		Row r3 = s3.getRow(0);
		
		int no_of_cells = r3.getPhysicalNumberOfCells();
		
		for (int i = 0; i < no_of_cells; i++) {
			
			Cell c3 = r3.getCell(i);
			
			CellType ct3 = c3.getCellType();
			
			if (ct3.equals(CellType.STRING)) {
				
				String value = c3.getStringCellValue();
				
				System.out.println(value);
			}
			
			else if (ct3.equals(CellType.NUMERIC)) {
				
				double d = c3.getNumericCellValue();
				
				int a = (int)d;
				
				String value = String.valueOf(a);
				
				System.out.println(value);
			}
		}
		
		wb3.close();
		
		return value;

	}
	
	
	public static void main(String[] args) throws IOException {
		
		String data = particular_CellData();
		
		System.out.println(data);
		
		String data2 = all_data();
		
		System.out.println(data2);
		
        String data3 = column_Data();
		
		System.out.println(data3);
		
        String data4 = row_Data();
		
		System.out.println(data4);
		
	}

}
