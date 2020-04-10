package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {
public WebDriver ldriver;
	
	//Constructor
	
	public MailPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

				// make webElement for Messages
				@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[3]/a")
				@CacheLookup // is used to improve the performance 
				public WebElement messages;
	
				public void ClickMessage()
				{
					messages.click();
				}
				
				//Web Element for confirm order mail from mail box
				@FindBy(xpath="//a[contains(text(),'Confirm Order')]")
				public WebElement confirmmail;
				
				public void ClickConfirmordermail()
				{
					confirmmail.click();
				}
				
				//click on chkbox on confirm order page
				@FindBy(xpath="/html[1]/body[1]/div[7]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/label[1]/div[1]")
				@CacheLookup
				public WebElement chkboxconfirmmail;
				
				public void Clickchkboxconfirmmail() throws InterruptedException
				{
					Thread.sleep(2000);
					chkboxconfirmmail.click();
				}

				//click on Confirm first time on confirm order page
				@FindBy(xpath="//a[@id='seller_confirm_btn']")
				@CacheLookup
				public WebElement confirmfirst;
				
				public void Clickfirstconfirm()
				{
				confirmfirst.click();
				}
				
				//click on confirm delivery mail from mail box
				@FindBy(xpath="//a[contains(text(),'Confirm Delivery')]")
				@CacheLookup
				public WebElement confirmdeliverymail;
				
				public void clickconfirmdeliverymail()
				{
					confirmdeliverymail.click();
				}
				
				//click on confirm delivery mail on second time from mail box
				@FindBy(xpath="/html[1]/body[1]/div[8]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
				@CacheLookup
				public WebElement confirmdeliverymail1;
				
				public void clickconfirmdeliverymail1()
				{
					confirmdeliverymail1.click();
				}
				
				//click on confirm from confirm delivery page
				
				@FindBy(xpath="//a[@class='btn btn-success']")
				@CacheLookup
				public WebElement confirmsecond;
				
				public void clickconfirmsecond()
				{
					confirmsecond.click();
				}
				
				
				//=====WebElement for pagination for Messages Page =======//
				//making webElement for last button on Message page					
				@FindBy (xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/nav[1]/ul[1]/li[12]/a[1]/span[1]")
				@CacheLookup
				 WebElement validatelastmsg;
			
				//making webElement for First button on Message page					
				@FindBy (xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/nav[1]/ul[1]/li[1]/a[1]")
				@CacheLookup
				 WebElement validatefirstmsg;
			
				//making webElement for Previous button on Message page					
				@FindBy (xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
				@CacheLookup
				 WebElement validatepreviousmsg;
			
				//making webElement for Next button on Message page	
				@FindBy (xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/nav[1]/ul[1]/li[13]/a[1]/span[1]")
				@CacheLookup
				 WebElement validatenextmsg;
			
				
			// click on first button to move on first page
			public void SelectFirstMsg()
			{
				validatefirstmsg.click();
			}
			// click on previous button to move on previous page
			public void SelectPreviousMsg()
			{
				validatepreviousmsg.click();
			}
			// click on Next button to move on Next page
			public void SelectNextMsg()
			{
				validatenextmsg.click();
			}
			
			// click on Last button to move on last page
			public void SelectLastMsg()
			{
				validatelastmsg.click();
			}
			

			//making webElement for refund message on Message page	
			@FindBy (xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
			@CacheLookup 
			 WebElement validaterefundmsg;
							
		// click on refund message
		public void SelectRefundMsg()
		{
			validaterefundmsg.click();
		}
		
		//making webElement for refund button inside mail	
		@FindBy (xpath="/html/body/div[7]/section/div/div/div/div/div[2]/div[3]/div[2]/a[1]")
		@CacheLookup 
		public WebElement validaterefundagain;
		
		public void clickRefundbtn() throws InterruptedException
		{
			Thread.sleep(2000);
			validaterefundagain.click();
		}
			
		// make webElement for Messages for refund
		@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[3]/a")
		@CacheLookup // is used to improve the performance 
		public WebElement messagesrefund;

		public void ClickMessageR()
		{
			messagesrefund.click();
		}

		//click on New Bid from mail box
		@FindBy(xpath="//tr[1]//td[2]//a[1]")
		@CacheLookup
		public WebElement newbid;
		
		public void clickNewBidmail()
		{
			newbid.click();
		}
				
		//click on chk box from mail to decline bid
		@FindBy(xpath="/html[1]/body[1]/div[7]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/form[1]/div[4]/label[1]/div[1]")
		@CacheLookup
		public WebElement ckbxmail;
		
		public void clickmailchkbox()
		{
			ckbxmail.click();
		}
		
		//click on Decline Bid  button
		
		@FindBy(xpath="//a[contains(text(),'Decline Bid')]")
		@CacheLookup
		public WebElement declinebid;
		
		public void ClickDeclineBid()
		{
			declinebid.click();
		}
		
		//click on cancelled Bid message from mail
		
				@FindBy(xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
				@CacheLookup
				public WebElement clkbidcancelled;
				
				public void ClickBidCancelledmsg()
				{
					clkbidcancelled.click();
				}
				
				//click on Bid Send message from mail

				@FindBy(xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
				@CacheLookup
				public WebElement clkbidsend;
							
			public void	ClickMessageBidSend()
			{
				clkbidsend.click();
			}
			//making webElement for refund message on Message page	
			@FindBy (xpath="/html[1]/body[1]/div[7]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
			@CacheLookup 
			 WebElement validatebidcancel;
							
		// click on refund message
		public void verifybidcancel()
		{
			validatebidcancel.click();
		}

}
