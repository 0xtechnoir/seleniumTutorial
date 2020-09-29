package com.bennaylor.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bennaylor.common.BasePage;

public class SeleniumHomePage extends BasePage{
	
	Long timeOutInSeconds = 10L;
	// This is the actual Selenium code
	
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	
	public void openSeleniumURL() {
		driver.get("https://www.selenium.dev/");
	}
	
	public WebElement getHeaderNavbar() {
		
		WebElement navbar = new WebDriverWait(driver, 10L).until(ExpectedConditions.presenceOfElementLocated(By.id("navbar")));
		return navbar;
	}
	
	public WebElement getFooterNavLinks() {
		
		WebElement navLinks = new WebDriverWait(driver, 10L).until(ExpectedConditions.presenceOfElementLocated(By.id("navLinks")));
		return navLinks;
	}

}
