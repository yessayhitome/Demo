package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_MyStore {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement image;
	
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement add_Cart;
	
	public Tshirt_MyStore(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getAdd_Cart() {
		return add_Cart;
	}
	
	

}
