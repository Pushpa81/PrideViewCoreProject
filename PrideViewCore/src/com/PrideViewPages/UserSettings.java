package com.PrideViewPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PrideViewTests.MainTest;

public class UserSettings extends MainTest {
	
	private WebDriver driver;
	@FindBy(linkText = "Logout")
	@CacheLookup
	private WebElement logout;
	
	public UserSettings(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout(){
		logout.click();
	}

}
