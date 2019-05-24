package com.step.definitions;

import com.pageobjects.BasePage;
import com.pageobjects.POHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps; 

public class HomePageStep extends BasePage {

	POHomePage page;

	@Given("^I navigate to given URL$")
	public void i_navigate_to_given_URL() 
	{
		openBrowser();

	}

	@When("^I click on 'checkbox'$")
	public void i_click_on_checkbox() {

		page.clickCheckboxes();

	}

	@Then("^checkbox is checked$")
	public void checkbox_is_checked() {
		// Write code here that turns the phrase above into concrete actions

	}


}

