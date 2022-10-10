package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itin {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='check_all']")
	private WebElement order;
	
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancel;
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	public Booked_Itin(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	public WebElement getLogout() {
		return logout;
	}

}
