package com.yaswanth.ecms.usermangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Pageination {
	WebDriver driver;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//div[@class='mat-select-arrow-wrapper']")
	WebElement pageitem;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//span[contains(text(),'100')]")
	WebElement page100;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//span[contains(text(),'40')]")
	WebElement page40;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//span[contains(text(),'20')]")
	WebElement page20;
	
	
	public void itemPerPage() throws InterruptedException {
		Thread.sleep(1000);
		pageitem.click();
		Thread.sleep(10);
		page100.click();
		pageitem.click();
        Thread.sleep(10);
		page40.click();
		pageitem.click();
        Thread.sleep(10);
		page20.click();
		
		
	}
}
