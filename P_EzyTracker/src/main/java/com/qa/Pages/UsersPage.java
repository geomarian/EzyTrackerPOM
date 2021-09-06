package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;


public class UsersPage extends BaseClass {


	
	@FindBy(xpath="//h3[contains(text(),'User List')]")
	WebElement header;
	
	@FindBy(xpath="//a[@title='Add User' and @class='btn bg-gradient-danger add-btn-header ml-2']")
	WebElement addUser;
	
	//HTML dropdown
	@FindBy(xpath="//select[@name='jUserRole']")
	WebElement userRole;
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="address")
	WebElement Addr;
	
	@FindBy(id="mobileNumber")
	WebElement MobNo;
	
	@FindBy(id="password")
	WebElement Pwd;
	
	@FindBy(name="sConfirmPassword")
	WebElement CPassword;
	
	@FindBy(name="submitBtn")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//button[@class='actionIcon actionBtn' and @title='Delete User']")
	WebElement DeleteUser;
	
	@FindBy(xpath="//button[@type='button' and @class='btn btn-danger bootbox-accept']")
	WebElement DeleteUserYes;
	
	
	
	public UsersPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean  verifyHeader() {
		return header.isDisplayed();
	}
	
	public void clickAddUser() {
		addUser.click();
	}
	 

}
