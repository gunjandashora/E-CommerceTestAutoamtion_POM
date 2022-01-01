package com.ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
	WebElement LogoImg;
	
	@FindBy(linkText="Sign in")
	WebElement SignInLink;
	
	public HomePage() {
		 PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		 return driver.getTitle();
	}
	
	public boolean validateLogoImg() {
		return LogoImg.isDisplayed();
	}
	
	public  LoginPage SignIn() {
		SignInLink.click();
		return new LoginPage();
	
	
	}



}
