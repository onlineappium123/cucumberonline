package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.BaseClass;

public class LoginModule {
	
	public LoginModule(){
	
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	
	@FindBy(xpath="//a[text()='Already Registered?'] ")
	public WebElement abofAlreadyRegisterdOption;
	
	@FindBy(xpath="//span[text()='Sign In/Register']")
	public WebElement abofSignInRegisterLink;
	
	@FindBy(xpath="(//input[@id='sign-in-form-emailAddress'])[2]")
	public WebElement abofLoginEmailTextBox;
	
	@FindBy(xpath="(//input[@id='sign-in-form-password'])[2]")
	public WebElement abofPasswordTextBox;
	
	@FindBy(xpath="(//span[text()='Sign In'])[2]")
	public WebElement abofSignInButton;
	
	@FindBy(xpath="//a[@title='Men']")
	public WebElement abofMenText;
}
