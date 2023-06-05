package com.Orange_HRM.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange_HRM.testCases.BaseClass;

public class DashBoardPage extends BaseClass {
	WebDriver rrdriver;
	public DashBoardPage(WebDriver ldriver)
	{
		rrdriver=ldriver;
		PageFactory.initElements(rrdriver, this);
	}
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	@CacheLookup
	WebElement logoutdropdown;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	@CacheLookup
	WebElement logout;
	
	public void logdrpdn()
	{
		logoutdropdown.click();
	}
	public void logout()
	{
		logout.click();
	}

}
