package com.PageObject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Base_Utility.Base_Class;
import com.automation.Address;
import com.automation.Login_MyStore;
import com.automation.My_Account;
import com.automation.My_Store;
import com.automation.Payment;
import com.automation.Payment_Confirm;
import com.automation.Shipping;
import com.automation.Summary;
import com.automation.To_Checkout;
import com.automation.Tshirt_Continue;
import com.automation.Tshirt_MyStore;
import com.page.objectmanager.Page_Object_Manager;

public class Automation_Using_PageObject extends Base_Class {
	
public static WebDriver driver = get_Browser("chrome");
	
	public static Page_Object_Manager manage = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automation_Using_PageObject.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		get_Url("http://automationpractice.com/index.php");
		
		//Sigin
		click_Button(manage.getStore().getSignin());
		
		//Login
		send_Keys(manage.getLogin().getEmail(), "walterwhite20@gamil.com");
		send_Keys(manage.getLogin().getPassword(), "Walte#08");
		click_Button(manage.getLogin().getSign_In());
		log.info("Successfully Logged in");
		Thread.sleep(5000);
		
		//Women
		click_Hold(manage.getAcc().getWomen());
		click_Button(manage.getAcc().getT_Shirt());
		
		//T Shirt
		click_Button(manage.getTs().getImage());
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		
		//Quantity
		click_Button(manage.getTc().getQuantity());
		select_Value(manage.getTc().getSelect_Size(), "2");
		click_Button(manage.getTc().getColor());
		click_Button(manage.getTc().getAdd_Cart());
		log.info("Add to cart Successfully");
		Thread.sleep(5000);
		
		//Checkout 1
		click_Button(manage.getOut().getCheckout_1());
		
		//Summary
		click_Button(manage.getSum().getCheckout_2());
		Thread.sleep(5000);
		
		//Address
		click_Button(manage.getAd().getProcess_Address());
		
		//Shipping
		click_Button(manage.getSh().getAgree());
		click_Button(manage.getSh().getCheckout_3());
		Thread.sleep(5000);
		
		//Payment
		click_Button(manage.getPy().getBank_Wire());
		
		//Confirm
		click_Button(manage.getPc().getConfirm());
		log.info("Order Confirmed");
		
		
		
	}
	

}
