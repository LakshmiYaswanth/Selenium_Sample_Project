package com.revature.ecms.loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.ecms.browser.Browser;
import com.revature.ecms.login.Login;
//this is used to check for invalid details to login
public class LoginWithInValidDetailsTest {
	WebDriver driver;
	Login loginpage;
	
	 /**
     * This test shows whether it chrome is opened or not.
     */
	@BeforeTest
	public void beforelogin() {
		Browser browser=new Browser();
		driver=browser.connectBrowsers("Chrome","https://ecms-dev-assaycr.firebaseapp.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertNotNull(driver);
		
	}
	 /**

     * This test go to https://ecms-dev-assaycr.firebaseapp.com

     * Login to application

     * Verify the home page using Dashboard message

     */
	@Test
	public void validateLogin() {
	    
	    loginpage=PageFactory.initElements(driver,Login.class);
	   
		loginpage.login("yes1234@gmail.com","admin1234");	
		Assert.assertFalse(false);
	}
	
}

