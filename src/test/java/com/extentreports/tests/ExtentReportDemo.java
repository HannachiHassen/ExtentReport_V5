package com.extentreports.tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReportDemo extends BaseTest{
	
	@Test
	public void extentTest() throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("index.html"); 
		extent.attachReporter(spark);
			
		spark.config().setTheme(Theme.STANDARD); 
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Reports Demo"); 
		  		
		ExtentTest test=extent.createTest("First test");
		test.pass("Checking the logs"); 
		
		ExtentTest test1=extent.createTest("Second test");
		test1.fail("Checking the logs in Second test"); 
		
		extent.flush();  
		Desktop.getDesktop().browse(new File("index.html").toURI());  
	}

}
