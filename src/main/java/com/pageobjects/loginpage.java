package com.pageobjects;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestUtils.AssertValues;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;


public class loginpage extends BasePage
{
	

@FindBy(xpath="//span[text()='Login']")
WebElement l;

@FindBy(xpath="//input[@type='email']")
WebElement email;

@FindBy(xpath="//input[@type='password']")
WebElement password;

@FindBy(xpath="//input[@type='submit']")
WebElement login;

public void clickloginlink()
{
	l.click();
}

public void entercredentials(String u,String p)
{
	email.sendKeys(u);
	password.sendKeys(p);
	
}

public void clickbutton()
{
	login.click();
}

public  void verifytitle()
{
String expectedV="QaClickAcademy";
String Act=driver.getTitle();
Assert.assertEquals(expectedV, Act);
}
}
