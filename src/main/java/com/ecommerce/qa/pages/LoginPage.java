package com.ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="email")
	WebElement EmailAddress;
	
	@FindBy(id="passwd")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	WebElement SignInBtn;
	
	@FindBy(id="email_create")
	WebElement emailAddress1;
	
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]")
	WebElement CreateAccount;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	
	public AccountPage login(String email, String pwd) {
		EmailAddress.sendKeys(email);
		Password.sendKeys(pwd);
		SignInBtn.click();
		
		return new AccountPage();
	}
	public RegistrationPage createAccount(String email1) {
		emailAddress1.sendKeys(email1);
		CreateAccount.click();
		return new RegistrationPage();
		
		
	}

}
