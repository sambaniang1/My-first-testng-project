package com.technosoft_automation.maven_technosoft_demo1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;



public class ScreenShotTest extends DriverWrapper{
	
	@Test
	public void screenShot1() {
		driver.get("https://www.hotels.com/");
		String currentDataTime = new SimpleDateFormat("dd-M-yyyy_hh-mm-ss-a").format(new Date());
		takeScreenshot("screenshot1_"+currentDataTime);
	}
	
	@Test
	public void screenShot2() {
		driver.get("https://www.delta.com/");
		String currentDataTime = new SimpleDateFormat("dd-M-yyyy_hh-mm-ss-a").format(new Date());
		takeScreenshot("screenshot2_"+currentDataTime);
	}
	
	public String takeScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile= ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("MyScreenShot/"+fileName+".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destFile.getAbsolutePath();
	}
	

}
