package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement room_Type;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement number_Of_Rooms;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement check_In;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement check_Out;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private WebElement adult_Rooms;
	
	@FindBy(id = "child_room")
	private WebElement child_Room;
	
	@FindBy(id = "Submit")
	private WebElement search;

	public Search_Hotel(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNumber_Of_Rooms() {
		return number_Of_Rooms;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_Out() {
		return check_Out;
	}

	public WebElement getAdult_Rooms() {
		return adult_Rooms;
	}

	public WebElement getChild_Room() {
		return child_Room;
	}

	public WebElement getSearch() {
		return search;
	}
	
	

}
