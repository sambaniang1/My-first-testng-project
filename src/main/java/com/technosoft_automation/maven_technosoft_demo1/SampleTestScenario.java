package com.technosoft_automation.maven_technosoft_demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SampleTestScenario {

	public static void main(String[] args) {
		//Set chromedriver property 
        System.setProperty("webdriver.chrome.driver", "/Users/new/Downloads/chromedriver");
		//Initilize Webdriver Interface
        WebDriver driver = new ChromeDriver();
        //Goto Facebook URL
        driver.navigate().to("https://www.facebook.com/");
        //Get current URL 
        String actualUrl = driver.getCurrentUrl();
        //Set expected URL
        String expectedURL = "https://www.facebook.com/";
        //Assert the URL 
        //Make sure to add testNG Library to project
        Assert.assertEquals(actualUrl, expectedURL, "URL Assertion Failed ");
        //Quit Driver
        System.out.println("Test Ran successfully");
        driver.quit();
    }
	
		
	}

	


