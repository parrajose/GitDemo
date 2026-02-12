package com.herokuapp.theinternet.base;

import org.openqa.selenium.By;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
	
	protected WebDriver driver; // public to all methods 
	protected Logger log;

	@Parameters({ "browser" })
	@BeforeMethod (alwaysRun = true)
	public void setUp(@Optional("chrome") String browser, ITestContext ctx) {
		String testName = ctx.getCurrentXmlTest().getName();
		
		//log = LogManager.getLogger(testName);
		
		BrowserDriverFactory factory = new BrowserDriverFactory(browser);
		driver = factory.createDriver();

		

//		maximize browser window
		driver.manage().window().maximize();

	}

	
	@AfterMethod (alwaysRun = true)
	private void tearDown() {
		driver.quit();
		
	}


}
