package com.bennaylor.common;

import org.openqa.selenium.WebDriver;


public class BasePage {
	
	static {
		
		//The below can be used if you want the chromedriver to reside in a directory outside of the project.
		//System.setProperty("webdriver.chrome.driver","/Users/bennaylor/Development/Tools/chromedriver");
		
		//The below allows you to keep the chromedriver within the project, thus making the project more transferrable..
		System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver");
	}
	
	public static WebDriver driver;
}





