package com.PrideViewTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MainTest {
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		String baseUrl = "https://prideview-core.traclabs.com/";
		System.setProperty("webdriver.gecko.driver","C:\\Users\\TRACLabs\\Documents\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

//	@AfterTest
//	public void closeBrowser() {
//		driver.quit();
//	}

}
