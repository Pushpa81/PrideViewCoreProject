package com.PrideViewTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PrideViewPages.Dashboard;
import com.PrideViewPages.LoginPage;

public class TrialTests extends MainTest {

	String actTitle1 = "";
	String expTitle1 = "PrideView Dashboard";
	String actTitle2 = "";
	String expTitle2 = "PrideView Login";

	@Test(priority = 1)
	public void verifyLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.login("test", "test");
		actTitle1 = driver.getTitle();

		// if (actTitle1.contentEquals(expTitle1)) {
		// System.out.println("Login Successfull");
		// } else {
		// System.out.println("Login Failed");
		// }

		// Assert.assertEquals(actualTitle, expectedTitle);

		Assert.assertEquals(expTitle1, actTitle1);
		System.out.println("Login is successfull because Acutual Title is " + actTitle1);
		// (driver.getTitle());

	}

//	@Test(priority = 2)
//
//	public void testAvailable() {
//		Dashboard db = new Dashboard(driver);
//		db.goToAvailableTab();
//	}

//	@Test(priority =3)
//	public void verifyRunProcedure() {
//		Dashboard db = new Dashboard(driver);
//		db.runProcedure();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id(("11__checkbox-3a334303-5f11-4b0b-8fac-171e99fab355"))).click();
//
//	}

	@Test(priority=4)
	public void finishProcedure(){
		Dashboard db = new Dashboard(driver);
		db.runProcedure();
		driver.switchTo().frame("procedureFrame");
		driver.findElement(By.id("exitButton")).click();
		driver.findElement(By.id("menuFinish")).click();
		driver.findElement(By.cssSelector("button.submit btn btn-success")).click();
		String pageTitle = driver.getTitle();
		
		if (pageTitle.equals("PrideView Dashboard")) {
			 System.out.println("Procedure finished succesfully");
			 } else {
			 System.out.println("Procedure failed to finish");
			 }
		
	}
// @Test(priority=3)
// public void verifyLogout() {
// Dashboard db = new Dashboard(driver);
// UserSettings us = new UserSettings(driver);
// db.goToSettings();
// us.logout();
// actTitle2 = driver.getTitle();
//
// Assert.assertEquals(expTitle1, actTitle1);
//
// System.out.println("Logout is successful because actualTitle is " +
// actTitle2);
// //driver.getTitle());

// if (actTitle2.contentEquals(expTitle2)) {
// System.out.println("Logout Successful");
// } else {
// System.out.println("Logout Failed");
// }

// }
	
//	this is to check all the checkboxes in the procedure
//	private void ClickAllCheckboxes()
//	{
//	    foreach (IWebElement e in driver.FindElements(By.xpath("//input[@type='checkbox']")))
//	    {
//	        if(!e.Selected)
//	            e.Click();
//	    }
//	}

 }
