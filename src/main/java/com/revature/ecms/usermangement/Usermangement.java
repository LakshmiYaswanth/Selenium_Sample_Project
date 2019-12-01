package com.revature.ecms.usermangement;
/**
 * @author hp
 * this class show to UserManagement in ECMS application
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Usermangement {
	
	WebDriver driver;
	 /**
    * All WebElements are identified by @FindBy annotation
    * @cachelookup is to store data in cache memory
    */
	@CacheLookup
	@FindBy(how=How.XPATH,using="//p[contains(text(),'User Management')]")
	WebElement userManagement;
	
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-3']")
	WebElement Search;
	
	@CacheLookup
	@ FindBy(how=How.XPATH,using="//i[contains(text(),'archive')]")
	WebElement Downlode;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//tr[1]//td[7]//div[1]")
	WebElement Active;
	
	public void management() throws InterruptedException {
		Thread.sleep(60000);
		userManagement.click();
	
	}

	public void searchField(String search ) throws InterruptedException {
		Thread.sleep(60000);
		Search.sendKeys(search);
		Search.getText();
			
	}
	public void downloadpage() throws InterruptedException {
		Thread.sleep(6000);
		Downlode.click();
	}
	public void Activebutton() throws InterruptedException {
		Thread.sleep(6000);
		Active.click();
		
	}
	
	
}