package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement process_Address;
	
	public Address(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProcess_Address() {
		return process_Address;
	}
	

}
