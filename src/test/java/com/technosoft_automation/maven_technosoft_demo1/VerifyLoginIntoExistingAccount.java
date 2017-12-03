package com.technosoft_automation.maven_technosoft_demo1;
/*Test Scenario two: Verify system displays login details once user clicks on Login to existing account
1. Enter invalid username 
2. Enter invalid password 
3. Click on login button 
4. Click on on signup for facebook link
5. Click on Loginto existing account button
6. Verify email, password, forgot account? and login element is displayed. 
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
import com.technosoft_automation.maven_technosoft.page.SignUpPage;

public class VerifyLoginIntoExistingAccount extends DriverWrapper{
	@Test
  public void loginToFacebook() {
	  try {
		    LandingPage landing = new LandingPage();
			landing.enterYourEmail("niangsamba90@hotmail.com");
			landing.enterYourPassword("password");
			landing.clickOnLoginButton();
			
			LoginPage login = new LoginPage();
			login.clickOnSignUpForFacebook();
			SignUpPage  signUp = new SignUpPage();
			signUp.clickOnLoginIntoExistingAccount();
			
			
			Assert.assertTrue(landing.verifyEmailAddress());
			Assert.assertTrue(landing. verifyPassword());
			Assert.assertTrue(landing.verifyForgotPassword());
		
		   
		    
		    
			
			Thread.sleep(3000);
		    } catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

	 /* Test Scenario two: Verify system displays login details once user clicks on Login to existing account
       1. Enter invalid username 
       2. Enter invalid password 
       3. Click on login button 
       4. Click on on signup for facebook link
       5. Click on Loginto existing account button
       6. Verify email, password, forgot account? and login element is displayed
     */