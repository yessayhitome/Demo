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

public class Particular_Column_data {
	
	public static String value;
	
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
	
	public static void main(String[] args) throws IOException {
		
		String data = column_Data();
		
		System.out.println(data);
		
	}

}
