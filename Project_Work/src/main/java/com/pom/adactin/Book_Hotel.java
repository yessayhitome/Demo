package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Book_Hotel {
	
	public WebDriver driver;
	
	
	@FindBy(id = "first_name")
	private WebElement first_Name;
	
	@FindBy(id = "last_name")
	private WebElement last_Name;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement card_No;
	
	@FindBy(className = "select_combobox")
	private WebElement card_Type;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiry_Month;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiry_Year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cc_Cvv;
	
	@FindBy(name = "book_now")
	private WebElement book_Now;

	
	public Book_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_No() {
		return card_No;
	}

	public WebElement getCard_Type() {
		return card_Type;
	}

	public WebElement getExpiry_Month() {
		return expiry_Month;
	}

	public WebElement getExpiry_Year() {
		return expiry_Year;
	}

	public WebElement getCc_Cvv() {
		return cc_Cvv;
	}

	public WebElement getBook_Now() {
		return book_Now;
	}

}
