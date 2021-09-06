package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name="sAuthCode")
	WebElement AuthCode;
	
	@FindBy(name="sUserName")
	WebElement UserName;
	
	@FindBy(name="sPassword")
	WebElement Password;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/img[1]")
	WebElement EzyTrackerLogo;
	
	@FindBy(name="submitBtn")
	WebElement submit;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateImg() {
		return EzyTrackerLogo.isDisplayed();
	}
	
	public DashboardPage login(String EnterCode, String username, String password) {
		AuthCode.sendKeys(EnterCode);
	UserName.sendKeys(username);
	Password.sendKeys(password);
	submit.click();
	return new DashboardPage();
	}
	
}
