package com.revature.ecms.login;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author hp
 * this class show to login in ECMS application
 */
public class Login {
	WebDriver driver;
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
	
	
	 /**
	
     * This POM method will be shown in test case to login in the application

     * @param strUserName

     * @param strPasword
	 * @throws InterruptedException 

     */
	public void login(String username,String pass) throws InterruptedException {
		userId.sendKeys(username);
		password.sendKeys(pass);
		submit.click();
		Thread.sleep(5000);
		 Alert alert = driver.switchTo().alert();		
 		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();
		
	}
}
