package com.Project_Work;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Base_Utility.Base_Class;
import com.PageObject.Adactin_Using_Page;
import com.helper.files.File_Reader_Manager;
import com.helper.files.Test_Data_Reader;
import com.page.objectmanager.Adactin_Page_Object_Manager;

public class Adactin_Using_Singleton extends Base_Class{
	
public static WebDriver driver = get_Browser("chrome");
	
public static Adactin_Page_Object_Manager manage = new Adactin_Page_Object_Manager(driver);

public static Logger log = Logger.getLogger(Adactin_Using_Page.class);

public static void main(String[] args) throws InterruptedException, IOException {

	PropertyConfigurator.configure("log4j.properties");
	
	String url = File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Url();
	
	get_Url(url);


	// User Login

	//String email = particular_CellData("C:\\Users\\Lenovo\\Desktop\\TestCase.xlsx", 2, 5);
	
	String username = File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Username();
	send_Keys(manage.getUser().getUser_name(), username);

	//String pwd = particular_CellData("C:\\Users\\Lenovo\\Desktop\\TestCase.xlsx", 3, 5);
	String pwd = File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Password();
	send_Keys(manage.getUser().getPass_word(), pwd); // Password

	click_Button(manage.getUser().getLogin_Btn()); // Login
	log.info("Login Successfully");
	Thread.sleep(5000);

	// Search Hotel
	select_Value(manage.getSearch().getLocation(), "Sydney"); // Location
	select_Value(manage.getSearch().getHotel(), "Hotel Creek"); // Hotel
	select_Text(manage.getSearch().getRoom_Type(), "Standard"); // RoomType
	select_Text(manage.getSearch().getNumber_Of_Rooms(), "1 - One"); // Number of Room
	send_Keys(manage.getSearch().getCheck_In(), "19/09/2022"); // CheckIn
	send_Keys(manage.getSearch().getCheck_Out(), "20/09/2022"); // CheckOut
	select_Text(manage.getSearch().getAdult_Rooms(), "1 - One"); // Adult per Room
	select_Text(manage.getSearch().getChild_Room(), "0 - None"); // Child per room
	click_Button(manage.getSearch().getSearch()); // Search

	// Select Hotel
	click_Button(manage.getSelect().getSelect()); // Select
	click_Button(manage.getSelect().getContinue_Click()); // Continue

	// Book Hotel
	send_Keys(manage.getBook().getFirst_Name(), "Walter"); // First Name
	send_Keys(manage.getBook().getLast_Name(), "White"); // Last Name
	send_Keys(manage.getBook().getAddress(), "308 Negra Arroyo Lane New Mexico - 87104"); // Address
	send_Keys(manage.getBook().getCard_No(), "5648963247826984"); // Credit Card No
	select_Value(manage.getBook().getCard_Type(), "AMEX"); // Credit Card Type
	select_Value(manage.getBook().getExpiry_Month(), "9"); // Expiry Month
	select_Text(manage.getBook().getExpiry_Year(), "2022"); // Expiry Year
	send_Keys(manage.getBook().getCc_Cvv(), "123"); // Cvv
	click_Button(manage.getBook().getBook_Now()); // Book
	log.info("Confirmed Hotel Booking");
	Thread.sleep(5000);

	// Logout
	click_Button(manage.getBooked().getLogout());
	

	}

}
