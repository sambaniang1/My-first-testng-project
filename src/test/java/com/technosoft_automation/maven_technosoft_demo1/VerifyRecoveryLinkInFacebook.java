package com.technosoft_automation.maven_technosoft_demo1;

/*Test Scenario one: Verify Recover you account button
1. Enter invalid username 
2. Enter invalid password 
3. Click on login button 
4. Verify Recover your account is displayed 
*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.technosoft_automation.maven_technosoft.page.LandingPage;
import com.technosoft_automation.maven_technosoft.page.LoginPage;

public class VerifyRecoveryLinkInFacebook extends DriverWrapper {

	WebDriver driver;

	@Test
	public void loginToFacebook() {
		try {
			LandingPage landing = new LandingPage();
			landing.enterYourEmail("lilniangsamba9@gmail.com");
			landing.enterYourPassword("password");
			landing.clickOnLoginButton();
			
			LoginPage login = new LoginPage();
		    String actual = login.getRecoveryYourAccount();
			String expected = "Recover Your Account";
			Assert.assertEquals(actual, expected);
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}

/*
  Test Scenario one: Verify Recover you account button
  1. Enter invalid username 
  2. Enter invalid password 
  3. Click on login button 
  4. Verify Recover your account is displayed 
*/