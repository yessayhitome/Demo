package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='search_hotel']")
	private WebElement search_Hotel;

	public Booking_Confirmation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch_Hotel() {
		return search_Hotel;
	}
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement my_Itin;

	public WebElement getMy_Itin() {
		return my_Itin;
	}

	

}
