package com.ecommerce.qa.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.HomePage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.RegistrationPage;
import com.ecommerce.qa.util.TestUtil;

public class RegistrationPageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	RegistrationPage registrationpage;
	TestUtil testutil;
	String sheetName="RegistrationPage";
	
	public RegistrationPageTest() {
		super();
		}
		
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		loginPage=homePage.SignIn();
		registrationpage=loginPage.createAccount(prop.getProperty("emailAddress1"));
		
	}
	
	@DataProvider
	public Object[][] getEcommerceTestData() {
		Object data [][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	@Test(priority=1,dataProvider="getEcommerceTestData")
	 public void validateCreateNewUser(String Title,String TitleFirstName,String TitleLastName,String TitlePassword,String AddressFirstName,String AddressLastname,String Address1,String AddressCity,String AddressState,String AddressPostalCode,String AddressCountry,String AddressPhoneNo,String AddressAlias) throws InterruptedException {
		registrationpage.createNewUser(Title, TitleFirstName, TitleLastName, TitlePassword, AddressFirstName, AddressLastname, Address1, AddressCity, AddressState,AddressPostalCode, AddressCountry, AddressPhoneNo,AddressAlias);
		Thread.sleep(3000);
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
