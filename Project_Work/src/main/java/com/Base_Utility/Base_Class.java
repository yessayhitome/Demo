package com.Base_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static String value;
	
	public static WebDriver get_Browser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lenovo\\eclipse-workspace\\Project_Work\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "");
			
			driver = new FirefoxDriver();
			
		}
		
		else if (type.equalsIgnoreCase("edge")) {
			
		}
			
		return driver;

	}
	
	public static void get_Url(String url) {
		
		driver.get(url);
	}
	
	public static String get_Title() {

		String title = driver.getTitle();
		
		return title;
	}
	
	public static void close() {

		driver.close();
	}
	
	public static void click_Button(WebElement element) {
		
		element.click();
	}
	
	public static void send_Keys(WebElement element,String value) {
		
		element.sendKeys(value);
	}
	
	public static String get_Text(WebElement element) {
    
		String text = element.getText();
		
		return text;
	}
	
    public static void to_Clear(WebElement element) {
    	
    	element.clear();   	
}
    
    public static boolean is_Displayed(WebElement element) {
    	
    	boolean displayed = element.isDisplayed();
    	
    	return displayed;	
	}
    
    public static boolean is_Enabled(WebElement element) {
    	
    	boolean enabled = element.isEnabled();
    	
    	return enabled;
	}
    
    public static boolean is_Selected(WebElement element) {
    	
    	boolean selected = element.isSelected();
    	
    	return selected;
	}
    
    public static void select_Value(WebElement element, String value) {
    	
    	Select a = new Select(element);
    	
    	a.selectByValue(value);

	}
    
    public static void select_Text(WebElement element, String value) {
    	
    	Select a = new Select(element);
    	
    	a.selectByVisibleText(value);
    	
    }
    
   public static void click_Hold(WebElement element) { 
	   Actions a = new Actions(driver);
	   a.clickAndHold(element).build().perform();
	   
   }	
   
   public static void simple_Alert() {
	   driver.switchTo().alert().accept();

}

   public static String particular_CellData(String path, int row, int column) throws IOException {

		File f = new File(path);
		
		FileInputStream fil = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fil);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(column);
		
		CellType ct = c.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			 value = c.getStringCellValue();
			
			//System.out.println(value);
			
		}
		else if (ct.equals(CellType.NUMERIC)) {
			
			double d = c.getNumericCellValue();
			
			//double to int
			
			int a = (int)d;     //narrowing type casting
			
			//int to string
			
			 value = String.valueOf(a);
			 
			// System.out.println(value);
		}
		
		wb.close();
		
		return value;
		
	} 
   
}
