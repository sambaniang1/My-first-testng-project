package com.technosoft_automation.maven_technosoft.page;

import org.openqa.selenium.By;

import com.technosoft_automation.maven_technosoft_demo1.BasePage;

public class LandingPage_Old extends BasePage {
	
	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	
	
	public void clickOnLoginButton() {
		clickOn(loginButton);
		
		}
	public void enterYourEmail(String enterYourEmail) {
		sendText (emailTextField, enterYourEmail);
	}
	public void enterYourPassword(String enterYourPassword){
		sendText (passwordTextField, enterYourPassword);
	}

}
