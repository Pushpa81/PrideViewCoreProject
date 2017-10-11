package com.PrideViewTests;

import org.testng.annotations.Test;

import com.PrideViewPages.LoginPage;

public class InvalidLoginTest extends MainTest {
	@Test
	public void veifylogin() {
		LoginPage lp = new LoginPage(driver);
		lp.login("test", "test1");
	}

}
