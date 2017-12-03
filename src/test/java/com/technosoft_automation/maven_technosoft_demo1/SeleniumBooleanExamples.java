package com.technosoft_automation.maven_technosoft_demo1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SeleniumBooleanExamples extends DriverWrapper{
	
	@Test
	public void isElementExample() {
		boolean maleRadioButton = getDriver().findElement(By.id("u.0.8")).isSelected();
		System.out.println("Male button is : " + maleRadioButton);
		
		boolean createAccount = getDriver().findElement(By.id("u_0_s")).isDisplayed();
		System.out.println("Create account button is displayed: " + createAccount);
		
		boolean selectGender = getDriver().findElement(By.id("u_0_x")).isSelected();
		System.out.println("Male gender is displayed: " + selectGender);
		
		boolean loginButton = getDriver().findElement(By.id("loginbutton")).isEnabled();
		System.out.println("Login buton is enabled: " + loginButton);
	}

}
