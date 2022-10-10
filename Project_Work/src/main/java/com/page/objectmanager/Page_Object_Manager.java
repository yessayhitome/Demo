package com.page.objectmanager;

import org.openqa.selenium.WebDriver;

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

public class Page_Object_Manager{
	
	public WebDriver driver;
	
	private My_Store store;
	
	private Login_MyStore login;
	
	private My_Account acc;
	
	private Tshirt_MyStore ts;
	
	private Tshirt_Continue tc;
	
	private To_Checkout out;
	
	private Summary sum;
	
	private Address ad;
	
	private Shipping sh;
	
	private Payment py;
	
	private Payment_Confirm pc;

	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;

	}

	public My_Store getStore() {
		
		if (store==null) {
			
			store = new My_Store(driver);
			
		}
		
		return store;
	}

	public Login_MyStore getLogin() {
		
		if (login==null) {
			
			login = new Login_MyStore(driver);
		}
		
		return login;
	}

	public My_Account getAcc() {
		
		if (acc==null) {
		
			acc = new My_Account(driver);

		}
		
		return acc;
	}

	public Tshirt_MyStore getTs() {
		
		if (ts==null) {
			
			ts = new Tshirt_MyStore(driver);
		}
		
		return ts;
	}

	public Tshirt_Continue getTc() {
		
		if (tc==null) {
			
			tc = new Tshirt_Continue(driver);
		}
		
		return tc;
	}

	public To_Checkout getOut() {
		
		if (out==null) {
			
			out = new To_Checkout(driver);
		}
		
		return out;
	}

	public Summary getSum() {
		
		if (sum==null) {
			
			sum = new Summary(driver);
		}
		
		return sum;
	}

	public Address getAd() {
		
		if (ad==null) {
		
			ad = new Address(driver);
		}
		
		return ad;
	}

	public Shipping getSh() {
		
		if (sh==null) {
			
			sh = new Shipping(driver);
		}
		
		return sh;
	}

	public Payment getPy() {
		
		if (py==null) {
			
			py = new Payment(driver);
		}
		
		return py;
	}

	public Payment_Confirm getPc() {
		
		if (pc==null) {
			
			pc = new Payment_Confirm(driver);
		}
		
		return pc;
	}
	

}
