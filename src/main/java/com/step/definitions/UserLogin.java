package com.step.definitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.TestUtils.AssertValues;
import com.pageobjects.BasePage;
import com.pageobjects.loginpage;

@RunWith(Cucumber.class)
public class UserLogin extends BasePage{

	loginpage page;
	WebDriver driver;
	
	@Given("^that User is on the site$")
	public void that_user_is_on_the_site()  {
		openBrowser();
		page.clickloginlink();
	}

	

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String Email, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		page.entercredentials(Email,Password);
	}
	
	@When("^user clicks on login button$")
	public void clicklogin()
	{
		page.clickbutton();
	}

	@Then("^user is on the Home page$")
	public void user_is_on_the_home_page() {
		
	page.verifytitle();
		//System.out.println(BasePage.driver.getTitle());
	}

}