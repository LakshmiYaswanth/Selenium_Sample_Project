package com.yaswanth.ecms.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;


/**
 * @author yaswanth
 *
 */
public class Browser {
	
  WebDriver driver;
   String chromedriver="webdriver.chrome.driver";
   String location="F:\\chromedriver_win32\\chromedriver.exe";
	public  WebDriver connectBrowsers(String browserName,String url) {
		if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		
		}
		else if(browserName.equalsIgnoreCase("Chrome")) {
		    System.setProperty(chromedriver,location);
		    driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Safari")) {
			 driver=new SafariDriver();
			
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
		
		}
		else if(browserName.equalsIgnoreCase("Opera")) {
			 driver=new OperaDriver();
			
		}
	    driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}


