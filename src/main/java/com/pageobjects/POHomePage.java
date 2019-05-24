package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class POHomePage extends BasePage {
	
	@FindBy(linkText="Checkboxes")
	WebElementFacade check;
	
	@FindBy(xpath = "//ul/li[a='File Download']")
	WebElementFacade fileDownloadLink;
	
	public void clickCheckboxes()
	{	   
		check.click();
	}
		
	public void FileDownload()
	{
		fileDownloadLink.click();
	}
	

}
