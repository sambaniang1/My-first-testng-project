package com.technosoft_automation.maven_technosoft.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.technosoft_automation.maven_technosoft_demo1.BasePage;

public class LoginPage  extends BasePage{
	
	
	private By verifyYourEmail = By.id("email");
	public String getVerifyYourEmailText() {
		return getTextFromtElement(verifyYourEmail);
		
	}
	private By verifyYourPassword = By.id("pass");
	public String getVerifyYourPasswordText() {
		return getTextFromtElement(verifyYourPassword);
	}
	private By verifyForgotAccount = By.linkText("Forgot account?");
	public String getVerifyForgotAccountText() {
		return getTextFromtElement(verifyForgotAccount);
	}
	private By signUpForFacebook = By.id("reg-link");
	public void clickOnSignUpForFacebook() {
		clickOn(signUpForFacebook);
	}
	private By recoveryYourAccount = By.xpath(".//*[@id='login_link']/div[1]/a");
	public String getRecoveryYourAccount() {
		return getTextFromtElement(recoveryYourAccount);
		
	}
	
	
	
	

}
