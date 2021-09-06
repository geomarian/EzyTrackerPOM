package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.DashboardPage;
import com.qa.Pages.LoginPage;
import com.qa.base.BaseClass;

public class LoginTest extends BaseClass{

	LoginPage loginPage;
	DashboardPage dashboard;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "EZY | Login");
	}
	
	@Test(priority=2)
	public void logoTest() {
		boolean flag = loginPage.validateImg();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
	dashboard = loginPage.login(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
