package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteNeed {
public WebDriver ldriver;
	
	// Constructor
	public DeleteNeed(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//======Delete a Need=========//
	
			// Click on Delete to delete Need 
			@FindBy(xpath="//tr[1]//td[2]//ul[1]//li[2]//a[1]//span[1]")
			@CacheLookup // is used to improve the performance
			WebElement delete;

			public void ClickDelete()
			{
				delete.click();
				
			}
			//WebElement for I want Delete button
			@FindBy(xpath="//span[contains(text(),'I want to delete')]")
			@CacheLookup // is used to improve the performance
			WebElement iwntdelete;
			
			public void clickIWntDeletebtn() throws InterruptedException
			{
				Thread.sleep(2500);
				iwntdelete.click();
			}
	
	
}
