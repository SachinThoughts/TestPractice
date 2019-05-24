package com.step.definitions;

import com.pageobjects.BasePage;
import com.pageobjects.POHomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FileDownloadStep extends BasePage {

	POHomePage page;


	@When("^I click on 'FileDownloadLink'$")
	public void i_click_on_FileDownloadLink() {
		page.FileDownload();

	}

	@When("^select any file$")
	public void select_any_file() {

	}

	@Then("^file is downloaded$")
	public void file_is_downloaded() {


	}
}
