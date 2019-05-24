
package com.pageobjects;

import org.openqa.selenium.WebDriver;


import net.serenitybdd.core.pages.PageObject;


public class BasePage extends PageObject {

	public static WebDriver driver;
	public void openBrowser() 
	{		
		
		getDriver().manage().window().maximize();
		open();
		
	}

}

