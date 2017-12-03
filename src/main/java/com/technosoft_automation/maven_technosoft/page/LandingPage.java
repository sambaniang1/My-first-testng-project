package com.technosoft_automation.maven_technosoft.page;

import org.openqa.selenium.By;

import com.technosoft_automation.maven_technosoft_demo1.BasePage;

public class LandingPage extends BasePage{
	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By loginToExistingAccount = By.xpath("//input[@value='Log Into Existing Account']");
	private By verifyForgotAccount = By.linkText("Forgot account?");
	
	
	public void  clickOnLoginButton() {
		clickOn(loginButton);
		
	}
	public void enterYourEmail(String enterYourEmail) {
		sendText (emailTextField, enterYourEmail);
	}
	public void enterYourPassword(String enterYourPassword){
		sendText (passwordTextField, enterYourPassword);
	}
	
	public void clickOnLoginToExistingAccount(){
		clickOn(loginToExistingAccount);
	}
	public boolean verifyEmailAddress(){
		return verifyElement(emailTextField);
	}
	public boolean verifyPassword(){
		return verifyElement(passwordTextField);
	}
	public boolean verifyForgotPassword(){
		return verifyElement(verifyForgotAccount);
	}
	
}



