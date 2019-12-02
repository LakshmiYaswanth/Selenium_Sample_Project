package com.yaswanth.ecms.usermangement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Action {
	WebDriver driver;
	 /**
   * All WebElements are identified by @FindBy annotation
   * @cachelookup is to store data in cache memory
   */
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//tr[2]//td[8]//mat-icon[1]")
	WebElement update;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Back')]")
	WebElement back;
	
	
	

	public void action() throws InterruptedException {
		Thread.sleep(6000);
		update.click();
		Thread.sleep(6000);
		back.click();
		
	}
}
	


