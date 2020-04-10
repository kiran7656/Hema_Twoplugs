package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchNeed {

public WebDriver ldriver;
	
	// Constructor
	public SearchNeed (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	//=== Looking for  Need click on search option on Feed Page==//
	
		// Click on service box after login
		@FindBy(xpath=("//span[@class='w-icons-search']"))
		@CacheLookup
		WebElement searchBox;
		
		public void clicksearchbtn()
		{
			searchBox.click();
		}
	// click on Need created by Wave
		
		@FindBy(xpath=("/html/body/div[7]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/div[1]/a"))
		@CacheLookup
		WebElement clickneed;
		
		public void clickNeed()
		{
			clickneed.click();
		}
	//make Web Element for I Can Do This Button
		
		@FindBy(xpath=("//span[contains(text(),'I can do this')]"))
		@CacheLookup
		WebElement icandothis;
		
		public void clickicandothis()
		{
			icandothis.click();
		}
	
		//Make WebElement for Price, service on Submit your Bid window
		// Updating price field 
		@FindBy(xpath="//input[@id='price']")
		public WebElement txtbidPrice;
		
		public void txtBidPriceField(String price) throws InterruptedException
		{
			Thread.sleep(2000);
			txtbidPrice.clear();
			txtbidPrice.sendKeys(price);
		}
		
		@FindBy(xpath="/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]")
		@CacheLookup
		public WebElement selectdropdown;
		
		public void selectdropdownbid()
		{
			selectdropdown.click();
		}
		
		@FindBy(xpath="/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[1]")
		@CacheLookup
		public WebElement selectdropdownservice;
		
		public void selectdropdownservicebid()
		{
			selectdropdownservice.click();
		}
		
		//WebElement for check box on Submit Your Bid Window
		
		@FindBy(xpath="/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/form[1]/div[5]/div[1]/label[1]/div[1]")
		@CacheLookup
		public WebElement chkbox;
		
		public void clickchkbox()
		{
			chkbox.click();
		}
	
		//WebElement for Send Button
		@FindBy(xpath="//span[contains(text(),'send')]")
		@CacheLookup
		public WebElement sendbutn;
		
		public void clicksendbutn()
		{
			sendbutn.click();
		}
		
		
		//Make WebElement for "OK" Button after sending Bid
		@FindBy(xpath="/html[1]/body[1]/div[7]/section[1]/div[1]/div[3]/a[1]")
		@CacheLookup
		public WebElement okbtn;
		
		public void clickbidsendokbtn()
		{
			okbtn.click();
		}





}
