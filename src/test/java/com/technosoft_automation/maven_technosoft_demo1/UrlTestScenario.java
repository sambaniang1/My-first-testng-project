package com.technosoft_automation.maven_technosoft_demo1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class UrlTestScenario extends DriverWrapper {
	
	@Test
	public void verifyUrl () {
		String actualUrl = getDriver().getCurrentUrl();
		//Set expected URL
		String expectedURL = "https://www.facebook.com";
		//Assert the URL
		//Make sure to add testNG Library to project
		System.setProperty("webdriver.gecko.driver", "/Users/new/Downloads/geckodriver");
		driver = new FirefoxDriver();
		
		
		Assert.assertEquals(actualUrl, expectedURL, "URL Assertion Failed");
	}
}
