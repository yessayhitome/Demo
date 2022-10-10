package com.pom.runner;

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

public class Automation_Using_Pom extends Base_Class {
	
	public static WebDriver driver = get_Browser("chrome");
	
	public static My_Store store = new My_Store(driver);
	
	public static Login_MyStore login = new Login_MyStore(driver);
	
	public static My_Account acc = new My_Account(driver);
	
	public static Tshirt_MyStore ts = new Tshirt_MyStore(driver);
	
	public static Tshirt_Continue tc = new Tshirt_Continue(driver);
	
	public static To_Checkout out = new To_Checkout(driver);
	
	public static Summary sum = new Summary(driver);
	
	public static Address ad = new Address(driver);
	
	public static Shipping sh = new Shipping(driver);
	
	public static Payment py = new Payment(driver);
	
	public static Payment_Confirm pc = new Payment_Confirm(driver);

	
	public static void main(String[] args) throws InterruptedException {
		
		get_Url("http://automationpractice.com/index.php");
		
		//Sigin
		click_Button(store.getSignin());
		
		//Login
		send_Keys(login.getEmail(), "walterwhite20@gamil.com");
		send_Keys(login.getPassword(), "Walte#08");
		click_Button(login.getSign_In());
		Thread.sleep(5000);
		
		//Women
		click_Hold(acc.getWomen());
		click_Button(acc.getT_Shirt());
		
		//T Shirt
		click_Button(ts.getImage());
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		
		//Quantity
		click_Button(tc.getQuantity());
		select_Value(tc.getSelect_Size(), "2");
		click_Button(tc.getColor());
		click_Button(tc.getAdd_Cart());
		Thread.sleep(5000);
		
		//Checkout 1
		click_Button(out.getCheckout_1());
		
		//Summary
		click_Button(sum.getCheckout_2());
		Thread.sleep(5000);
		
		//Address
		click_Button(ad.getProcess_Address());
		
		//Shipping
		click_Button(sh.getAgree());
		click_Button(sh.getCheckout_3());
		Thread.sleep(5000);
		
		//Payment
		click_Button(py.getBank_Wire());
		
		//Confirm
		click_Button(pc.getConfirm());
		
		
		
	}

}
