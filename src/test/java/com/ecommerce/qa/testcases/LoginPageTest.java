package com.ecommerce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.AccountPage;
import com.ecommerce.qa.pages.HomePage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.RegistrationPage;
import com.ecommerce.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	AccountPage accountPage;
	RegistrationPage registrationpage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage=new HomePage();
		 loginPage=homePage.SignIn();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		 String title=loginPage.verifyLoginPageTitle();
		 Assert.assertEquals(title, "Login - My Store","LoginPage title not matched");
	}
     
	@Test(priority=2)
	public void loginTest() {
		accountPage=loginPage.login(prop.getProperty("emailAddress"),prop.getProperty("password"));
	}
	
	
	@Test(priority=3)
	public void createAccountTest() throws InterruptedException {
		registrationpage=loginPage.createAccount(prop.getProperty("emailAddress1"));
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
