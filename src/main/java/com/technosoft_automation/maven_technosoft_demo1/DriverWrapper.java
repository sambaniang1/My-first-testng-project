package com.technosoft_automation.maven_technosoft_demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {
	protected static WebDriver driver = null;
	private static final String URL = "https://facebook.com/";
	private static final String URL1="https://www.cleartrip.com/";
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public void initializeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/new/Downloads/chromedriver");
		
		ChromeOptions cOptions = new ChromeOptions();
		Map<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting_values.notifications", 2);
		 chromePrefs.put("credentials_enable_service", false);
		 cOptions.setExperimentalOption("prefs", chromePrefs);
		 cOptions.addArguments("disable-infobars");
		 driver = new ChromeDriver(cOptions);
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL1);
		
	}
	@AfterClass
	public void tearDown() {
		if(driver !=null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}
	
	

}
