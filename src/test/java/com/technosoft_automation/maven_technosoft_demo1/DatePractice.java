package com.technosoft_automation.maven_technosoft_demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DatePractice extends DriverWrapper{
	
	@Test
	public void selectDate() throws InterruptedException {
		
		String selectData = "11/29/2017";
		Date d = new Date(selectData);
		
		SimpleDateFormat dt = new SimpleDateFormat("MMMM/dd/yyyy");
		String date =dt.format(d);
		
		System.out.println(date);
		
		String [] split= date.split("/");
		System.out.println(split[0]+" "+split[1]+" "+split[2]);
		
		String day = split[1];
	    String month = split[0];
		String year = split[2];
		
		System.out.println("day........."+day);
		System.out.println("month......"+month);
		System.out.println("year........"+year);
		
	     driver.findElement(By.xpath("//input[@id='OneWay']")).click();
	     driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
	     Thread.sleep(2000);
	     String currentMonthXpath="//div[@class='monthBlock first']/descendant::span[@class='ui-datepicker-month']";
	     String currentYearXpath="//div[@class='monthBlock first']/descendant::span[@class='ui-datepicker-year']";
	     String requireDateXpath="//div[@class='monthBlock first']//a[text()='<REQ_DATE>']";
	     String currentMonth=driver.findElement(By.xpath(currentMonthXpath)).getText();
	     String currentYear = driver.findElement(By.xpath(currentYearXpath)).getText();
	    
	     while(!(month.equals(currentMonth)  && year.equals(currentYear))) {
	    	 driver.findElement(By.xpath("//a[@data-handler='next']")).click();
	    	 Thread.sleep(500);
	    	 currentMonth=driver.findElement(By.xpath(currentMonthXpath)).getText();
	    	 currentYear = driver.findElement(By.xpath(currentYearXpath)).getText();
	     }
	  
	     driver.findElement(By.xpath(requireDateXpath.replace("<REQ_DATE>", day))).click();

		
	}
	

}
