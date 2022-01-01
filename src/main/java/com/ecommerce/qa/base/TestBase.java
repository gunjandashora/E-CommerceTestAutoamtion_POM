package com.ecommerce.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ecommerce.qa.util.TestUtil;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		 try {
			  prop=new Properties();
			  FileInputStream ip= new FileInputStream("C:\\SP\\SeleniumCode\\E-CommerceTest\\src\\main\\java\\com\\ecommerce\\qa\\config\\config.properties");
			  prop.load(ip);
		 }catch(FileNotFoundException e) {
			 e.printStackTrace();
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
	}
	
	public static void initialization() {
		  String browserName=prop.getProperty("browser");
		  if(browserName.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver","C:\\SP\\chromedriver_win32 (2)/chromeDriver.exe");
			  driver=new ChromeDriver();
			  
		  }
		  
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		  
		  driver.get(prop.getProperty("url"));
	}

}
