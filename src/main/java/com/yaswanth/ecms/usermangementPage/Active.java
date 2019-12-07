package com.yaswanth.ecms.usermangementPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Active {
	
	WebDriver driver;
	 /**
   * All WebElements are identified by @FindBy annotation
   * @cachelookup is to store data in cache memory
   */
	@CacheLookup
	@FindBy(how=How.XPATH,using="//tr[1]//td[7]//div[1]")
	WebElement Active;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[@class='swal2-cancel btn btn-danger']")
	WebElement Cancel;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[@class='swal2-confirm btn btn-success']")
	WebElement success;
	
	public void Activebutton() throws InterruptedException {
		Thread.sleep(6000);
		Active.click();	
	}
	
	public void Accept() throws InterruptedException {
		Thread.sleep(3000);
		String text=success.getText();
		success.click();
		System.out.println(text);
	}
	public void Cancel() throws InterruptedException {
		Thread.sleep(6000);
		Active.click();
		Thread.sleep(3000);
		String Text=Cancel.getText();
		Cancel.click();
		System.out.println(Text);	
	}
	

}
