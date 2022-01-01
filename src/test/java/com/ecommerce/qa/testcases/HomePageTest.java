package com.ecommerce.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.HomePage;
import com.ecommerce.qa.pages.LoginPage;



public class HomePageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod 
		public void SetUP() {
		initialization();
		homePage= new HomePage();
	}
	
	@Test(priority=1)
	public void aboutUsPageTitleTest() {
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	@Test(priority=2)
	public void logoImgTest() {
		boolean flag=homePage.validateLogoImg();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void signInTest() throws InterruptedException {
	          loginPage=homePage.SignIn();
	          Thread.sleep(1000);
	         
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
