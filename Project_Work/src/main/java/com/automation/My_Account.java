package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement t_Shirt;
	
	@FindBy(xpath = "//a[@title='Blouses']")
	private WebElement blouses;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
	private WebElement casual_Dress;
	
	public My_Account(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getT_Shirt() {
		return t_Shirt;
	}

	public WebElement getBlouses() {
		return blouses;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasual_Dress() {
		return casual_Dress;
	}
	
	

}
