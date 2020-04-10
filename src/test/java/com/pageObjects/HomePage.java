package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
public WebDriver ldriver;
	
	//Constructor
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	 // Home Page 
		// Click on Plugs button after login
		@FindBy(xpath=("//span[@class='w-icons-twoPlugs']"))
		@CacheLookup
		WebElement btnclickplugslanding;
		
				
		public void clickplugslanding()
		{
			btnclickplugslanding.click();
		}
		
		@FindBy(xpath=("//html//body//div[7]//section//div[2]//div//div//ul[2]//li[3]//div[2]//div"))
		@CacheLookup 
		WebElement totalbalanceprofile;	
		
		
		public int TotalBalancecountactual() {
			System.out.println("count eed "+ totalbalanceprofile.getText());
			int actual = Integer.parseInt(totalbalanceprofile.getText());
			return actual;
		}
		
		@FindBy(xpath=("//html//body//div[7]//section//div[2]//div//div//ul[2]//li[3]//div[2]//div"))
		@CacheLookup 
		WebElement totalbalanceprofileexp;	
		
			
		public int TotalBalancecountexpected() {
			System.out.println("count eed "+ totalbalanceprofileexp.getText());
			int expected = Integer.parseInt(totalbalanceprofileexp.getText());
			return expected;
		}		
		
		@FindBy(xpath=("/html[1]/body[1]/div[8]/section[1]/div[2]/div[1]/div[1]/ul[2]/li[3]/div[2]/div[1]"))
			WebElement totalbalanceprofileexpeeds;	
			
		public int TotalBalanceexpeeds() 
		{
			System.out.println("count eed "+ totalbalanceprofileexpeeds.getText());
			int expected = Integer.parseInt(totalbalanceprofileexpeeds.getText());
			return expected;
		}
}