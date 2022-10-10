package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Continue {

	public WebDriver driver;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement select_Size;
	
	@FindBy(xpath = "//a[@id='color_14']")
	private WebElement color;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement add_Cart;
	
	public Tshirt_Continue(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSelect_Size() {
		return select_Size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAdd_Cart() {
		return add_Cart;
	}
}
