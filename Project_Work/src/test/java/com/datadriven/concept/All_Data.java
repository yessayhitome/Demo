package com.datadriven.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	
	public static String value;
	
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
			

	
	
	public static void main(String[] args) throws IOException {
		String data = all_data();
		
		System.out.println(data);
		
	}

}
