package com.technosoft_automation.maven_technosoft.page;

import org.openqa.selenium.By;

import com.technosoft_automation.maven_technosoft_demo1.BasePage;

public class LoginPage_Old extends BasePage{
	
	private By recoveryAccount = By.xpath(".//*[@id='login_link']/div[1]/a");
	public String getRecoveryAccountText() {
		return getTextFromtElement(recoveryAccount);
	}

}
