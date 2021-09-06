package com.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.DashboardPage;
import com.qa.Pages.LoginPage;
import com.qa.base.BaseClass;

public class DashboardTest extends BaseClass {
	
	 LoginPage loginPage;
	 DashboardPage dashboard;
	 
	 
	public DashboardTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		//after login > Dashboard will be displayed
		dashboard =loginPage.login(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
	}
	
	
	@Test
	public void verifyHeaderTest() {
		//String dashboardHeader = dashboard.validateCPHeader();
		Assert.assertEquals( "Copyright © 2021 Sales Person Tracking All rights reserved.","No Match found");
	}
	
	
	@Test
	public void verfifyName() {
		Assert.assertTrue(dashboard.validateLoggedInUser());
		
	}
	
	@Test
	public void userClickTest() {
		dashboard.clickOnUsers();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
