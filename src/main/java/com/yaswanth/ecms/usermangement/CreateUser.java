package com.yaswanth.ecms.usermangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateUser {
	
	WebDriver driver;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary btn-sm pull-right']")
	WebElement create;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Back')]")
	WebElement backtopage;
	
	public void create() throws InterruptedException {
		create.click();
		Thread.sleep(1000);
		backtopage.click();
		
	}

}
