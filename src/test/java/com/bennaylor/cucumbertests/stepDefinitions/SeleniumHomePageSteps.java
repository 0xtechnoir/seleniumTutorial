package com.bennaylor.cucumbertests.stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import com.bennaylor.seleniumpages.SeleniumHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumHomePageSteps {

	SeleniumHomePage seleniumHomepage = new SeleniumHomePage();
	
	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
	    seleniumHomepage.launchBrowser();;
	}

	@When("I open selenium Homepage")
	public void i_open_Google_Homepage() {
	    seleniumHomepage.openSeleniumURL();;
	}

	@Then("I verify that the header navbar is displayed")
	public void i_verify_that_the_page_displays_search_text_box() {
	    WebElement navbar = seleniumHomepage.getHeaderNavbar();
	    assertTrue(navbar.isDisplayed());
	    
	}

	@Then("the page displays the footer nav links")
	public void the_page_displays_Google_Search_button() {
	    WebElement navLinks = seleniumHomepage.getFooterNavLinks();
	    assertTrue(navLinks.isDisplayed());
	}
}
