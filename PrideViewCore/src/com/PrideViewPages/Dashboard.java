package com.PrideViewPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PrideViewTests.MainTest;

public class Dashboard extends MainTest {

	private WebDriver driver;
	@FindBy(css = "div.user-label")
	@CacheLookup
	private WebElement Settings;

	@FindBy(xpath = "html/body/div[1]/ul/li[1]/a")
//	@FindBy(linkText = "Available")
	@CacheLookup
	private WebElement AvailableTab;

	@FindBy(xpath = "html/body/div[1]/ul/li[2]/a")
//	@FindBy(linkText = "Running")
	@CacheLookup
	private WebElement RunningTab;

	@FindBy(xpath ="html/body/div[1]/ul/li[3]/a")
//	@FindBy(linkText = "Completed")
	@CacheLookup
	private WebElement CompletedTab;

	@FindBy(xpath = ".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/div/div")
	@CacheLookup
	private WebElement TestingDirectory;
	// This is Testing directory where all test procedures are placed.

	@FindBy(xpath = ".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[9]/div/div/div")
	@CacheLookup
	private WebElement TestFolder;

	// This is JenkinTestFiles;

	@FindBy(xpath = ".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[9]/div/ul/li[17]/div/div/div[1]")
	@CacheLookup
	private WebElement TestProcedure;

	// this is OneOfEachVersion4 procedure

	@FindBy(xpath = ".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[9]/div/ul/li[17]/div/div/div[1]/span[3]")
	// @FindBy (css="div.run-icon context-button fa")
	@CacheLookup
	private WebElement runIcon;

	@FindBy(xpath = ".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[9]/div/ul/li[17]/div/div/div[1]/span[2]")
	// @FindBy (css="div.view-icon context-button fa")
	@CacheLookup
	private WebElement viewIcon;

	@FindBy(xpath = ".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[9]/div/ul/li[17]/div/div/div[1]/span[1]")
	// @FindBy (css="div.checkbox-icon context-button fa fa-lg")
	@CacheLookup
	private WebElement selectIcon;
	
	@FindBy(css= "button[role='button']")
	@CacheLookup
	private WebElement resetButton;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToSettings() {
		Settings.click();
	}

	public void goToAvailableTab() {
		AvailableTab.click();

	}
	
	public void gotoCompletedTab(){
		CompletedTab.click();
	}
	
	public void resetProcedures(){
		resetButton.click();
		
	}
	

	public void runProcedure() {
		AvailableTab.click();
		resetButton.click();
		TestingDirectory.click();
		TestFolder.click();
		TestProcedure.click();
		runIcon.click();
	}
}
