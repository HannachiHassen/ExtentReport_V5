package com.extentreports.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import driver.DriverManager;

public final class ExtentReportDemo extends BaseTest{
	
	@Test
	public void firstTest() throws IOException {
		String title=DriverManager.getDriver().getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void secondTest() throws IOException {
		Assert.assertTrue(false);
	}
}
