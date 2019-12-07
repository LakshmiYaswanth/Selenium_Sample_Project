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
import com.yaswanth.ecms.usermangementPage.Action;
import com.yaswanth.ecms.usermangementPage.Active;
import com.yaswanth.ecms.usermangementPage.CreateUser;
import com.yaswanth.ecms.usermangementPage.Pageination;
import com.yaswanth.ecms.usermangementPage.Usermangement;



public class LoginWithValidDetailsTest {
	WebDriver driver;
	Login loginpage;
	Usermangement usermangement;
	Active ACTIVE;
	CreateUser createuser;
	Action ACTION;
	Pageination PAGE;
	private static Properties properties = Baseclass.getProperties();
	 public final static String URL = properties.getProperty("url");
	 public final static String BROWSER = properties.getProperty("browser");
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

     * This test go to https://ecms-dev-assaycr.firebaseapp.com

     * Login to application

     * Verify the home page using Dashboard message

     */
	@Test
	public void validateLogin() {
	
	    loginpage=PageFactory.initElements(driver,Login.class);
	    try {
			loginpage.login("admin@gmail.com","admin");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(loginpage);
	}
	@Test(dependsOnMethods="validateLogin")
	public void usermanagementpageTest() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		usermangement=PageFactory.initElements(driver,Usermangement.class);
		
		try {
			usermangement.management();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		Assert.assertNotNull(usermangement);
		
	}
		@Test(dependsOnMethods="usermanagementpageTest")
	public void searchFieldTest() {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			usermangement=PageFactory.initElements(driver,Usermangement.class);
			
			try {
				usermangement.searchField("Dr Mukesh");
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			Assert.assertNotNull(usermangement);
	}
	@Test(dependsOnMethods="searchFieldTest")
	public void downlodeTest() {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			usermangement=PageFactory.initElements(driver,Usermangement.class);
			try {
				usermangement.downloadpage();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Assert.assertNotNull(usermangement);
	}
	@Test(dependsOnMethods="downlodeTest")
		public void activeTest() {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			ACTIVE=PageFactory.initElements(driver,Active.class);
				try {
					ACTIVE.Activebutton();
					ACTIVE.Accept();
					ACTIVE.Cancel();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Assert.assertNotNull(ACTIVE);	
		}
	@Test(dependsOnMethods="activeTest")
		public void updateTest() {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			ACTION=PageFactory.initElements(driver,Action.class);
				try {
					ACTION.action();	
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Assert.assertNotNull(ACTIVE);	
		}
	@Test(dependsOnMethods="updateTest")
	public void pageTest() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PAGE=PageFactory.initElements(driver,Pageination.class);
			try {
				PAGE.itemPerPage();	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Assert.assertNotNull(PAGE);	
	}
	@Test(dependsOnMethods="pageTest")
	public void Createuser() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		createuser=PageFactory.initElements(driver,CreateUser.class);
			try {
			createuser.create();	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Assert.assertNotNull(PAGE);	
	}
}
	

