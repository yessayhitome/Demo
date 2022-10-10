package com.pom.runner;

import org.openqa.selenium.WebDriver;

import com.Base_Utility.Base_Class;
import com.pom.adactin.Book_Hotel;
import com.pom.adactin.Booked_Itin;
import com.pom.adactin.Booking_Confirmation;
import com.pom.adactin.Search_Hotel;
import com.pom.adactin.Select_Hotel;
import com.pom.adactin.User_Login;

public class Adactin_Using_Pom extends Base_Class {
	
	public static WebDriver driver = Base_Class.get_Browser("chrome");
	
	public static User_Login user = new User_Login(driver);
	
	public static Search_Hotel search = new Search_Hotel(driver);
	
	public static Select_Hotel select = new Select_Hotel(driver);
	
	public static Book_Hotel book = new Book_Hotel(driver);
	
	public static Booking_Confirmation confirm = new Booking_Confirmation(driver);
	
	public static Booked_Itin booked = new Booked_Itin(driver);

	public static void main(String[] args) throws InterruptedException {
				
		get_Url("https://adactinhotelapp.com/index.php");
		
		//User Login
		send_Keys(user.getUser_name(), "mkkarthi");          //UserName
		send_Keys(user.getPass_word(), "Walte@28");          //Password
		click_Button(user.getLogin_Btn());                   //Login
		Thread.sleep(5000);                                  
		
		//Search Hotel
		select_Value(search.getLocation(), "Sydney");        //Location 
		select_Value(search.getHotel(), "Hotel Creek");      //Hotel
		select_Text(search.getRoom_Type(), "Standard");      //RoomType
		select_Text(search.getNumber_Of_Rooms(),"1 - One");  //Number of Room
		send_Keys(search.getCheck_In(),"19/09/2022");        //CheckIn
		send_Keys(search.getCheck_Out(), "20/09/2022");      //CheckOut
		select_Text(search.getAdult_Rooms(), "1 - One");     //Adult per Room
		select_Text(search.getChild_Room(), "0 - None");     //Child per room
		click_Button(search.getSearch());                    //Search
		
		//Select Hotel
		click_Button(select.getSelect());                    //Select
		click_Button(select.getContinue_Click());            //Continue
		
		//Book Hotel
		send_Keys(book.getFirst_Name(), "Walter");           //First Name
		send_Keys(book.getLast_Name(), "White");             //Last Name
		send_Keys(book.getAddress(), "308 Negra Arroyo Lane New Mexico - 87104"); //Address
		send_Keys(book.getCard_No(), "5648963247826984");    //Credit Card No
		select_Value(book.getCard_Type(), "AMEX");           //Credit Card Type
		select_Value(book.getExpiry_Month(), "9");           //Expiry Month
		select_Text(book.getExpiry_Year(), "2022");          //Expiry Year
		send_Keys(book.getCc_Cvv(), "123");                  //Cvv
		click_Button(book.getBook_Now());                    //Book
		System.out.println("Booking Completed : 1");
		Thread.sleep(5000);
		
		//Booking Confirmation
		click_Button(confirm.getSearch_Hotel());            //Search Hotel
		
		//Select Hotel 2
		select_Value(search.getLocation(), "London");        //Location 
		select_Value(search.getHotel(), "Hotel Sunshine");   //Hotel
		select_Text(search.getRoom_Type(), "Double");        //RoomType
		select_Text(search.getNumber_Of_Rooms(),"2 - Two");  //Number of Room
		send_Keys(search.getCheck_In(),"21/09/2022");        //CheckIn
		send_Keys(search.getCheck_Out(), "22/09/2022");      //CheckOut
		select_Text(search.getAdult_Rooms(), "2 - Two");     //Adult per Room
		select_Text(search.getChild_Room(), "1 - One");      //Child per room
		click_Button(search.getSearch());                    //Search
		
		// Select Hotel 2
		click_Button(select.getSelect());                   // Select
		click_Button(select.getContinue_Click());           // Continue
		
		// Book Hotel 2
		send_Keys(book.getFirst_Name(), "Otis");          // First Name
		send_Keys(book.getLast_Name(), "Milburn");            // Last Name
		send_Keys(book.getAddress(), "308 Negra Arroyo Lane New Mexico - 87104"); // Address
		send_Keys(book.getCard_No(), "5648963247826984");   // Credit Card No
		select_Value(book.getCard_Type(), "VISA");          // Credit Card Type
		select_Value(book.getExpiry_Month(), "9");          // Expiry Month
		select_Text(book.getExpiry_Year(), "2022");         // Expiry Year
		send_Keys(book.getCc_Cvv(), "456");                 // Cvv
		click_Button(book.getBook_Now());                   // Book
		System.out.println("Booking Completed : 2");
		Thread.sleep(5000);
		
		//Booking Confirmation 2
		click_Button(confirm.getSearch_Hotel());            //Search Hotel
		
		// Select Hotel 3
		select_Value(search.getLocation(), "Los Angeles");       // Location
		select_Value(search.getHotel(), "Hotel Hervey");  // Hotel
		select_Text(search.getRoom_Type(), "Deluxe");       // RoomType
		select_Text(search.getNumber_Of_Rooms(), "3 - Three");// Number of Room
		send_Keys(search.getCheck_In(), "22/09/2022");      // CheckIn
		send_Keys(search.getCheck_Out(), "23/09/2022");     // CheckOut
		select_Text(search.getAdult_Rooms(), "3 - Three");    // Adult per Room
		select_Text(search.getChild_Room(), "2 - Two");     // Child per room
		click_Button(search.getSearch());                   // Search
		
		// Select Hotel 3
		click_Button(select.getSelect());                   // Select
		click_Button(select.getContinue_Click());           // Continue

		// Book Hotel 3
		send_Keys(book.getFirst_Name(), "Jon");           // First Name
		send_Keys(book.getLast_Name(), "Snow");         // Last Name
		send_Keys(book.getAddress(), "308 Negra Arroyo Lane New Mexico - 87104"); // Address
		send_Keys(book.getCard_No(), "5648963247826984");  // Credit Card No
		select_Value(book.getCard_Type(), "MAST");         // Credit Card Type
		select_Value(book.getExpiry_Month(), "9");         // Expiry Month
		select_Text(book.getExpiry_Year(), "2022");        // Expiry Year
		send_Keys(book.getCc_Cvv(), "789");                // Cvv
		click_Button(book.getBook_Now());                  // Book
		System.out.println("Booking Completed : 3");
		Thread.sleep(5000);
		
		//Booking Confirmation
		click_Button(confirm.getMy_Itin());                // My Itinerary
		
		//Booded Itinerary
		click_Button(booked.getOrder());                   // Order
		click_Button(booked.getCancel());                  // Cancel
		simple_Alert();
		System.out.println("All Booking Cancelled");
		
		//Logout
		click_Button(booked.getLogout());
		System.out.println("Successfully Logout");
	}

}
