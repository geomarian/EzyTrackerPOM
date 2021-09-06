package com.qa.Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class DashboardPage extends BaseClass{

	@FindBy(xpath="//strong[contains(text(),'Copyright © 2021 Sales Person Tracking')]")
	WebElement copyrightHeader;
	
	@FindBy(xpath="//span[@id='spnUserName']")
	WebElement loggedInuser;
	
	@FindBy(xpath="//p[contains(text(),'User')]")
	WebElement clickUser;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateCPHeader() {
		 return copyrightHeader.isDisplayed();
	}
	
	public boolean validateLoggedInUser() {
		return  loggedInuser.isDisplayed();
		 
	}
	public UsersPage clickOnUsers() {
		clickUser.click();
		// will return UserPage object
		return new UsersPage();
	}

}
