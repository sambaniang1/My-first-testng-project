package com.technosoft_automation.maven_technosoft_demo1;

import org.testng.annotations.*;

public class TestNGAnnotation {
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("I run before class");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("I run after class");
		
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I run before method");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("I run after method");
	}
	@Test
	public void testScenarioOne() {
		System.out.println("My first Test scenario");
	}
	@Test
	public void testScenarioTwo(){
		System.out.println("My second Test scenario");
	}
		
}
