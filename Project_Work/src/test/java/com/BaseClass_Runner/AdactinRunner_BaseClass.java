package com.BaseClass_Runner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Base_Utility.Base_Class;

public class AdactinRunner_BaseClass extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = get_Browser("chrome");
		
		get_Url("https://adactinhotelapp.com/index.php");
		
		//UserName
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		send_Keys(username, "mkkarthi");
		
		//Password
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		send_Keys(pwd,"Walte@28");
		
		//Login
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		click_Button(login);
		Thread.sleep(2000);
		
		System.out.println("Login successful");
		
		//Location
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		select_Value(location, "Paris");
		
		//Hotels
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		select_Value(hotel, "Hotel Sunshine");
		
		//Room Type
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		select_Value(room, "Deluxe");
		
		//No of Rooms
		WebElement nor = driver.findElement(By.xpath("//select[@id='room_nos']"));
		select_Value(nor, "1");
		
		//CheckIn
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		send_Keys(checkin, "29/08/2022");
		
		//CheckOut
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		send_Keys(checkout,"30/08/2022");
		
		//Adult per Room
		WebElement apr = driver.findElement(By.xpath("//select[@name='adult_room']"));
		select_Value(apr,"1");
		
		//Children per Room
		WebElement cpr = driver.findElement(By.xpath("//select[@name='child_room']"));
		select_Value(cpr, "0");
		
		//Search
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
        click_Button(search);		
		System.out.println("Searching For Availability");
		
		//Select Hotel
		WebElement sel = driver.findElement(By.xpath("//input[@type='radio']"));
		click_Button(sel);
		
		//Continue
		WebElement cont = driver.findElement(By.xpath("//input[@type='submit']"));
		click_Button(cont);
		System.out.println("Hotel Selected");
		
		//First Name
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		send_Keys(fname, "Karthik");
		
		//Last Name
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		send_Keys(lname, "kk");
		
		//Billing Address
		WebElement bill = driver.findElement(By.xpath("//textarea[@name='address']"));
		send_Keys(bill, "308 Negra Arroyo Lane New Mexico - 87104");
		
		//Credit Card 
		WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
		send_Keys(credit, "5648963247826984");
		
		//Credit Type
		WebElement type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		select_Text(type, "VISA");
		
		//Select Month
		WebElement em = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		select_Text(em, "April");
		
		//Select Year
		WebElement sy = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		select_Text(sy, "2022");
		
		//CVV
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
        send_Keys(cvv, "123");
        
		//Book
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		click_Button(book);
		
		System.out.println("Booking Completed");
		Thread.sleep(5000);
		
		//My Itinerary
		WebElement myit = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		click_Button(myit);
		
		//My Orders
		WebElement order = driver.findElement(By.xpath("//input[@id='check_all']"));
		click_Button(order);
		
		//Cancellation
		WebElement cancel = driver.findElement(By.xpath("//input[@name='cancelall']"));
		click_Button(cancel);
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("Booking Cancelled");
		
		//Logout
		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
		click_Button(logout);
		
		System.out.println("Logout Successful");
			
	}	
}
