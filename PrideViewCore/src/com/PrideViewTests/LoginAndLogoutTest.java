package com.PrideViewTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PrideViewPages.Dashboard;
import com.PrideViewPages.LoginPage;
import com.PrideViewPages.UserSettings;

public class LoginAndLogoutTest extends MainTest {
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

	@Test(priority = 2)
	public void verifyLogout() {
		Dashboard db = new Dashboard(driver);
		UserSettings us = new UserSettings(driver);
		db.goToSettings();
		us.logout();
		actTitle2 = driver.getTitle();

		Assert.assertEquals(expTitle1, actTitle1);

		System.out.println("Logout is successful because actualTitle is " + actTitle2);
		// driver.getTitle());
		// if (actTitle2.contentEquals(expTitle2)) {
		// System.out.println("Logout Successful");
		// } else {
		// System.out.println("Logout Failed");
		// }
		// }

	}
}
