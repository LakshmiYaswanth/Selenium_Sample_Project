package com.yaswanth.ecms.testcase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.yaswanth.ecms.configuration.Baseclass;
import com.yaswanth.ecms.configuration.Browser;
import com.yaswanth.ecms.loginpage.Login;


//this is used to check for invalid details to login
public class LoginWithInValidDetailsTest {
	WebDriver driver;
	Login loginpage;
	
	 private static Properties properties =Baseclass.getProperties();
	 public final  String URL = properties.getProperty("url");
	 public final  String BROWSER = properties.getProperty("browser");
	 /**
     * This test shows whether it chrome is opened or not.
     */
	
	@Test
	public void beforelogin() {
		Browser browser=new Browser();
		driver=browser.connectBrowsers(BROWSER,URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertNotNull(driver);
		
	}
	 /**

     * This test go to https://apollo-ecms.firebaseapp.com

     * Login to application

     * Verify the home page using Dashboard message

     */
	@Test
	public void validateLogin() {
	    loginpage=PageFactory.initElements(driver,Login.class);
		try {
			loginpage.login("yes1234@gmail.com","admin1234");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		Assert.assertFalse(false);
	}
	 
	@Test(dependsOnMethods="invalidCredentials")
	public void forgotpassword() {
		loginpage.forgotpassword();
		//logger.info("Forgot password page is opened");
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		Assert.assertEquals(CurrentUrl,"https://apollo-ecms.firebaseapp.com");
	}	
}

