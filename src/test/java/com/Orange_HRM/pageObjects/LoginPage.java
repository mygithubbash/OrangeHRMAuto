package com.Orange_HRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver rdriver;
	public LoginPage(WebDriver ldriver)
	{
		rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement textUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement textPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement submitBtn;
	
	
	public void setUsername(String usname)
	{
		textUsername.sendKeys(usname);
	}
	public void setPwd(String pawd)
	{
		textPassword.sendKeys(pawd);
	}
	public void clickSubmit()
	{
		submitBtn.click();
	}
	

}
