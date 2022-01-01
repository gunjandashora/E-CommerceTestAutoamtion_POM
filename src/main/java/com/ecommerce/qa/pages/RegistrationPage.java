package com.ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.util.TestUtil;

public class RegistrationPage extends TestBase {
	
	@FindBy(id="id_gender2")
	WebElement Title;
	
	@FindBy(id="customer_firstname")
	WebElement TitleFirstName;
	
	@FindBy(id="customer_lastname")
	WebElement TitleLastName;
	
	@FindBy(id="passwd")
	WebElement TitlePassword;
	
	@FindBy(id="firstname")
	WebElement AddressFirstName;
	
	@FindBy(id="lastname")
	WebElement AddressLastname;
	
	@FindBy(id="address1")
	WebElement Address1;
	
	@FindBy(id="city")
	WebElement AddressCity;
	
	@FindBy(id="id_state")
	WebElement AddressState;
	
	@FindBy(id="postcode")
	WebElement PostalCode;
	
	@FindBy(id="id_country")
	WebElement AddressCountry;
	
	@FindBy(id="phone_mobile")
	WebElement AddressPhoneNo;
	
	@FindBy(id="alias")
	WebElement AddressAlias;
	
	@FindBy(id="submitAccount")
	WebElement RegisterBtn;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	} 
	
	public void createNewUser(String Title,String ftName,String ltName,String pwd, String aftName, String altName, String addrs, String city,String state,String postalCode, String country, String phnNo,String aliasAdd) {
		
		Select select =new Select(AddressState);
		select.selectByVisibleText(state);
		
		Select select1= new Select(AddressCountry);
		select1.selectByVisibleText(country);
		
		TitleFirstName.sendKeys(ftName);
		TitleLastName.sendKeys(ltName);
		TitlePassword.sendKeys(pwd);
		AddressFirstName.sendKeys(aftName);
		AddressLastname.sendKeys(altName);
		Address1.sendKeys(addrs);
		AddressCity.sendKeys(city);
		PostalCode.sendKeys(postalCode);
		AddressPhoneNo.sendKeys(phnNo);
		AddressAlias.sendKeys(aliasAdd);
		//RegisterBtn.click();
		
		
		
		
		
		
		
	}

	
	
	
		
	

}
