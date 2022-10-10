package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
	public WebDriver driver;

	@FindBy(id = "cgv")
	private WebElement agree;
	

	
	public WebElement getAgree() {
		return agree;
	}

	public WebElement getCheckout_3() {
		return checkout_3;
	}

	public Shipping(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement checkout_3;
}
