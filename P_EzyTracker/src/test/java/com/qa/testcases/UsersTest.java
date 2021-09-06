package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.DashboardPage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.UsersPage;
import com.qa.base.BaseClass;

public class UsersTest extends BaseClass{

	LoginPage loginPage;
	DashboardPage dashboard;
	UsersPage users;
	
	public UsersTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashboard = loginPage.login(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
		users = dashboard.clickOnUsers();
		
	}
	
@Test
	public void click() {
	users.clickAddUser();
}

@AfterMethod
public void f() {
	
}
}