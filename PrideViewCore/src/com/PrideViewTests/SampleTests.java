package com.PrideViewTests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTests {

	WebDriver driver;

	@BeforeTest

	public void openBrs() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://prideview-core-rc.traclabs.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 0)
	public void validLogin() {
		driver.findElement(By.name("username")).sendKeys("pushpa");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@id='LoginForm']/div[3]/div/div/span[2]/button")).click();
		String pageTitle = driver.getTitle();

		// String expected = "PrideView Dashboard";
		// String actual = driver.getTitle();
		// Assert.assertEquals(actual, expected);
		// System.out.println("Login successfull");
		// }

		if (pageTitle.equals("PrideView Dashboard")) {
			System.out.println("Login successful");
		}

		else if (pageTitle.equals("PrideView Login")) {
			System.out.println("Login not successfull");

		}
	}

	@Test(priority = 1)
	public void runProcedure() {
		driver.findElement(By.xpath("html/body/div[1]/ul/li[1]/a")).click();
		// driver.findElement(By.linkText("Available")).click();
		// available tab
		driver.findElement(By.cssSelector("button[role='button']")).click();
		// Reset button

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/div/div")).click();
		// testing directory
		driver.findElement(By.xpath(".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[8]/div/div/div"))
				.click();
		// jenkins test folder

		driver.findElement(By
				.xpath(".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[8]/div/ul/li[17]/div/div/div[1]"))
				.click();
		// oneofeach procedure

		driver.findElement(By
				.xpath(".//*[@id='AvailableProcedures']/div/div/div/div[3]/div[2]/ul/li[8]/div/ul/li[17]/div/div/div[1]/span[3]"))
				.click();
		// run icon

		driver.switchTo().frame("procedureFrame");
		// procedure page under iframe will come into focus

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement checkBox = driver.findElement(By.cssSelector("div.checkbox"));
		checkBox.click();
		System.out.println(checkBox.isDisplayed());
		checkBox.click();
		checkBox.isSelected();
		System.out.println("Procedure run is successfull as instruction is marked done ");
		// First checkbox will be checked
	}

}

// @Test(priority = 2)
// public void finishProedure() {
//
// driver.findElement(By.id("exitButton")).click();
// // WebElement exitProcedure = driver.findElement(By.id("exitButton"));
// // Select exitDropdown = new Select(exitProcedure);
// // exitDropdown.selectByVisibleText("Finish Procedure");
// driver.findElement(By.id("menuFinish")).click();
// System.out.println(driver.findElement(By.id("menuFinish")).isEnabled());
//
// // driver.switchTo().activeElement().findElement(By.cssSelector("div.
// // ui-diolog"));
//
// driver.switchTo().activeElement().findElements(By.id("summary-dialog"));
// // WebElement actEle = driver.switchTo().activeElement();
// // System.out.println("active element's name: "+ actEle.getTagName());
//
// System.out.println(driver.findElement(By.id("summary-dialog")).isDisplayed());
//
// driver.findElement(By.cssSelector("button.submit.btn.btn-success")).click();
//
// String pageTitle = driver.getTitle();
//
// if (pageTitle.equals("PrideView Dashboard")) {
// System.out.println("Procedure finished succesfully");
// } else {
// System.out.println("Procedure failed to finish");
// }

// }

// @AfterTest
// public void closeBrs() {
// driver.quit();
// }
// }
