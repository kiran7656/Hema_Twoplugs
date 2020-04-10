package com.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceDetailPage {
public WebDriver ldriver;
	
	//Constructor
	
	public ServiceDetailPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// make webElement for I WANT THIS Service button on service details page
		@FindBy(xpath="//*[@id=\"buy_button\"]/span")
		@CacheLookup 
		public WebElement iwantthis;

		public void Clickiwntthis()
		{
			iwantthis.click();
		}
		//make web Element for click on check box buy service pop up
		@FindBy(xpath="//div[@id='chk_buyer_disclaimer-styler']")
		@CacheLookup 
		public WebElement chkbox;
		
		public void Clickchkbox() throws InterruptedException
		{
			//chkbox.isSelected();
			//ldriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(2000);
			chkbox.click();
		}
		
		//make web Element for Buy Button from Buy Service page
		@FindBy(xpath="//span[contains(text(),'Buy')]")
		@CacheLookup 
		public WebElement buy;
		
		public void Clickbuybtn()
		{
			buy.click();
		}		
		
		//confirm transaction page click on OK after Buy Service page
		@FindBy(xpath="//*[@id=\"content\"]/div/div[3]/a")
		@CacheLookup 
		public WebElement okbtn;
		
		public void ClickOk()
		{
			okbtn.click();
		}
		
		
}
