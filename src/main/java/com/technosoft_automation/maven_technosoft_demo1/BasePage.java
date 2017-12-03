package com.technosoft_automation.maven_technosoft_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class BasePage {
	
	public void clickOn (By locator) {
		try {
			DriverWrapper.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail ("Element is not found with this locator:" + locator.toString());
			e.printStackTrace();
		}
	}
	
	public void sendText (By locator, String text) {
		try {
			DriverWrapper.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not fount with this locator:" + locator.toString());
			e.printStackTrace();
		}
	}
	
	public String getTextFromtElement (By locator) {
		String text = null;
		try {
			text = DriverWrapper.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator:" + locator.toString());
			e.printStackTrace();
		}
		return text;
	}
	public boolean verifyElement(By by){
		boolean isElementFound=true;
		try{
			DriverWrapper.getDriver().findElement(by);	
		}catch(NoSuchElementException e){
			Assert.fail("Element is not found: " + isElementFound);
			e.printStackTrace();
			//isElementFound=false;
		}
		return isElementFound;
	}

	
}
