package com.datadriven.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Demo {
	
	public static void write() throws IOException {

		File f = new File("C:\\Users\\Lenovo\\Desktop\\Write.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		
		wb.createSheet("Automation").createRow(0).createCell(0).setCellValue("Email");
		
		wb.getSheet("Automation").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("Automation").createRow(1).createCell(0).setCellValue("walter@gmail");
		
		wb.getSheet("Automation").getRow(1).createCell(1).setCellValue("Walter@20");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		wb.close();
	}

	
	
	public static void main(String[] args) throws IOException {
		
		write();
	}
}
