package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
public WebDriver ldriver;
	
	//Constructor
	
	public LandingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// landing Page 
	
		// Click login button on landing page 
			// click action on login button
			@FindBy(xpath="//body[@class='main-template']/div[@class='wrapper']/header/div[@class='container']/ul[@class='control-bar']/li/a[@class='btn border']/span[1]")
			@CacheLookup // is used to improve the performance 
			WebElement btnloginlanding;
			
			public void clickloginlandingbtn()
			{
				btnloginlanding.click();
			}
}
