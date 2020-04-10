package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteService {
	public WebDriver ldriver;
	
	// Constructor
		public DeleteService(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		//======Delete a Need=========//
		
				// Click on Delete to delete Service 
				@FindBy(xpath="//tr[1]//td[4]//ul[1]//li[2]//a[1]//span[1]")
				@CacheLookup // is used to improve the performance
				WebElement deleteservice;

				public void ClickDeleteService()
				{
					deleteservice.click();
					
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
