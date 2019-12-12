package com.yaswanth.ecms.loginpage;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author hp
 * this class show to login in ECMS application
 */
public  class  Login {
	WebDriver driver;
	WebElement element;
	Logger logger = Logger.getLogger("Login.class");
	 /**
     * All WebElements are identified by @FindBy annotation
     * @cachelookup is to store data in cache memory
     */
	@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-0']")
	WebElement userId;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-1']")
	WebElement password;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	WebElement submit;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//i[contains(text(),'exit_to_app')]")
	WebElement back;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Forgot Password')]")
	WebElement forgetpassword;
	
	 /**
	  
     * This POM method will be shown in test case to login in the application

     * @param strUserName

     * @param strPasword
	 * @throws InterruptedException 

     */
	public void login(String username,String pass) throws InterruptedException  {
		userId.sendKeys(username);
		password.sendKeys(pass);
		submit.click();
		Thread.sleep(6000);
	}
	public void invalidLogin(String username,String pass) throws InterruptedException {
		back.click();
		userId.sendKeys(username);
		password.sendKeys(pass);
		submit.click();
		Thread.sleep(6000);
	}
	public void forgotpassword() {
		forgetpassword.click();
		driver.navigate().back();
	}
}
