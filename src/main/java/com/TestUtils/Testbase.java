package com.TestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testbase {

	public WebDriver driver;
	
	public static void Launchtest() throws IOException
	{
	Properties prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\pallavir\\eclipse-workspace\\GitLabRepo\\SerenityCucumber\\src\\main\\java\\com\\TestUtils\\Config.properties");
	prop.load(file);
	
	String brow=prop.getProperty("browser");
	
if(brow.contains("Chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pallavir\\eclipse-workspace\\GitLabRepo\\SerenityCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
}
else if(brow.contains("IE"))
{
	System.setProperty("webdriver.ie.driver", "C:\\Users\\pallavir\\eclipse-workspace\\GitLabRepo\\SerenityCucumber\\src\\test\\resources\\drivers\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();

}

else if(brow.contains("IE"))
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pallavir\\eclipse-workspace\\GitLabRepo\\SerenityCucumber\\src\\test\\resources\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get(prop.getProperty("url"));

	driver.manage().window().maximize();
}

	}
	
		
	}
