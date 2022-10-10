package com.Project_Work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Runner {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\eclipse-workspace\\Project_Work\\Driver\\chromedriver.exe");	
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		//UserName
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("mkkarthi");
		
		//Password
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Walte@28");
		
		//Login
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		Thread.sleep(2000);
		
		System.out.println("Login successful");
		
		//Location
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select l1 = new Select(location);
		l1.selectByValue("Paris");
		
		//Hotels
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select h1 = new Select(hotel);
		h1.selectByValue("Hotel Sunshine");
		
		//Room Type
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select r1 = new Select(room);
		r1.selectByValue("Deluxe");
		
		//No of Rooms
		WebElement nor = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select r2 = new Select(nor);
		r2.selectByValue("1");
		
		//CheckIn
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin.sendKeys("29/08/2022");
		
		//CheckOut
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkout.sendKeys("30/08/2022");
		
		//Adult per Room
		WebElement apr = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select ar = new Select(apr);
		ar.selectByValue("1");
		
		//Children per Room
		WebElement cpr = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select cr = new Select(cpr);
		cr.selectByValue("0");
		
		//Search
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
		System.out.println("Searching For Availability");
		
		//Select Hotel
		WebElement sel = driver.findElement(By.xpath("//input[@type='radio']"));
		sel.click();
		
		//Continue
		WebElement cont = driver.findElement(By.xpath("//input[@type='submit']"));
		cont.click();
		
		System.out.println("Hotel Selected");
		
		//First Name
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.sendKeys("Karthik");
		
		//Last Name
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.sendKeys("kk");
		
		//Billing Address
		WebElement bill = driver.findElement(By.xpath("//textarea[@name='address']"));
		bill.sendKeys("308 Negra Arroyo Lane New Mexico - 87104");
		
		//Credit Card 
		WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
		credit.sendKeys("5648963247826984");
		
		//Credit Type
		WebElement type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select ty = new Select(type);
		ty.selectByVisibleText("VISA");
		
		//Select Month
		WebElement em = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select em1 = new Select(em);
		em1.selectByVisibleText("April");
		
		//Select Year
		WebElement sy = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select sy1 = new Select(sy);
		sy1.selectByVisibleText("2022");
		
		//CVV
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("123");
		
		//Book
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();
		
		System.out.println("Booking Completed");
		Thread.sleep(5000);
		
		//My Itinerary
		WebElement myit = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		myit.click();
		
		//My Orders
		WebElement order = driver.findElement(By.xpath("//input[@id='check_all']"));
		order.click();
		
		//Cancellation
		WebElement cancel = driver.findElement(By.xpath("//input[@name='cancelall']"));
		cancel.click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		System.out.println("Booking Cancelled");
		
		//Logout
		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
		logout.click();
		
		System.out.println("Logout Successful");
		
}
}
