package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransHistoryPage {
public WebDriver ldriver;
	
	//Constructor
	
	public TransHistoryPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//make web Element for Transaction Button
			@FindBy(xpath="//span[contains(text(),'Transactions')]")
			@CacheLookup 
			public WebElement transactionbtn;
			
			public void Clicktransactionbtn() throws InterruptedException
			{
				Thread.sleep(2000);
				transactionbtn.click();
			}
			
			//=====Making WebElement for Pagination for Transaction====//
			
			//making webElement for last button on Transaction page					
			@FindBy (xpath="//span[contains(text(),'»I')]")
			@CacheLookup
			 WebElement validatelasttransaction;
		
			//making webElement for First button on Transaction page					
			@FindBy (xpath="//span[contains(text(),'I«')]")
			@CacheLookup
			 WebElement validatefirsttransaction;
		
			//making webElement for Previous button on Transaction page					
			@FindBy (xpath="//nav[@class='text-center']//li[2]//a[1]//span[1]")
			@CacheLookup
			 WebElement validateprevioustransaction;
		
			//making webElement for Next button on Transaction page	
			@FindBy (xpath="//li[11]//a[1]//span[1]")
			@CacheLookup
			 WebElement validatenexttransaction;
		
			
		// click on first button to move on first page
		public void SelectFirstTxn()
		{
			validatefirsttransaction.click();
		}
		// click on previous button to move on previous page
		public void SelectPreviousTxn()
		{
			validateprevioustransaction.click();
		}
		// click on Next button to move on Next page
		public void SelectNextTxn()
		{
			validatenexttransaction.click();
		}
		
		// click on Last button to move on last page
		public void SelectLastTxn()
		{
			validatelasttransaction.click();
		}
		
		//=== to click on Refund===//
		@FindBy (xpath="/html/body/div[7]/div[1]/table[2]/tbody/tr[1]/td[7]/a[1]/i")
		@CacheLookup
		 WebElement refund;
		
		public void ClickRefund()
		{
			refund.click();
		}
		
		//=== I WANT REFUND===//
		@FindBy (xpath="//span[contains(text(),'I want a refund')]")
		@CacheLookup
		public WebElement iwntrefund;
		
		public void ClickiwntRfnd() throws InterruptedException
		{
			Thread.sleep(2000);
			iwntrefund.click();
		}
		
}

