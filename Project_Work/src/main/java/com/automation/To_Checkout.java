package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Checkout {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout_1;
	
	public To_Checkout(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout_1() {
		return checkout_1;
	}
}
