package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditServicePage {
public WebDriver ldriver;
	
	//Constructor
	
	public EditServicePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	// make webElement for Edit Service bake Muffin
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]/a[1]")
	@CacheLookup 
	public WebElement bakemuffinwithchoclate;

	public void ClickBakeMuffin()
	{
		bakemuffinwithchoclate.click();
	}
	
	
	
}
