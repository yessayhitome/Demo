package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Login {
	
	public WebDriver driver;
	
	@FindBy(id = "username")
    private WebElement user_name;

	public User_Login(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser_name() {
		return user_name;
	}
	
	@FindBy(name = "password")
	private WebElement pass_word;

	public WebElement getPass_word() {
	return pass_word;
	}
	
	@FindBy(className = "login_button")
	private WebElement login_Btn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}
	
}
