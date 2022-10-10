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

public class Particular_Row_Data {
	
	public static String value;
	
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
		
		String data = row_Data();
		
		System.out.println(data);
		
	}

}
