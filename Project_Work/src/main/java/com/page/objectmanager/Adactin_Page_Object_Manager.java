package com.page.objectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Book_Hotel;
import com.pom.adactin.Booked_Itin;
import com.pom.adactin.Booking_Confirmation;
import com.pom.adactin.Search_Hotel;
import com.pom.adactin.Select_Hotel;
import com.pom.adactin.User_Login;

public class Adactin_Page_Object_Manager {
	
	public WebDriver driver;
	
	private User_Login user;
	
	private Search_Hotel search;
	
	private Select_Hotel select;
	
	private Book_Hotel book;
	
	private Booking_Confirmation confirm;
	
	private Booked_Itin booked;

	public Adactin_Page_Object_Manager(WebDriver driver) {
		
		this.driver = driver;
	}

	public User_Login getUser() {
		
		if (user==null) {
			
			user = new User_Login(driver);
		}
		
		return user;
	}

	public Search_Hotel getSearch() {
		
		if (search==null) {
			
			search = new Search_Hotel(driver);
		}
		
		return search;
	}

	public Select_Hotel getSelect() {
		
		if (select==null) {
			
			select = new Select_Hotel(driver);
			
		}
		
		return select;
	}

	public Book_Hotel getBook() {
		
		if (book==null) {
			
			book = new Book_Hotel(driver);
			
		}
		
		return book;
	}

	public Booking_Confirmation getConfirm() {
		
		if (confirm==null) {
			
			confirm = new Booking_Confirmation(driver);
			
		}
		return confirm;
	}

	public Booked_Itin getBooked() {
		
		if (booked==null) {
			
			booked = new Booked_Itin(driver);
		}
		
		return booked;
	}
	
	
	
	
	
	
	
	

}
