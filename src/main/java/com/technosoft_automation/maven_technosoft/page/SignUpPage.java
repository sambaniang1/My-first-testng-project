package com.technosoft_automation.maven_technosoft.page;

import org.openqa.selenium.By;

import com.technosoft_automation.maven_technosoft_demo1.BasePage;

public class SignUpPage extends BasePage{
	
	private By loginToExistingAccount = By.xpath("//input[@value='Log Into Existing Account']");
	public void clickOnLoginIntoExistingAccount() {
		clickOn(loginToExistingAccount);
	}

}
