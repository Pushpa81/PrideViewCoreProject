package com.PrideViewPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	@FindBy(name = "username")
	@CacheLookup
	private WebElement LoginID;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement Password;

	@FindBy(css = "button[type='submit']")
	@CacheLookup
	private WebElement loginbutton;
	
		public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {
		LoginID.sendKeys(user);
		Password.sendKeys(pass);
		loginbutton.click();
	}
	
	

}
