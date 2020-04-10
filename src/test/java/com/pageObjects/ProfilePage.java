package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
public WebDriver ldriver;
	
	//Constructor
	
	public ProfilePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//span[contains(text(),'Profile')]")
	@CacheLookup
	WebElement btnprofile;
	
	public void clkbtnProfile()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnprofile));
		wait.until(ExpectedConditions.elementToBeClickable(btnprofile));
		btnprofile.click();
	}
	
	//======== Log out for Ocean user ======//
	@FindBy(xpath="//span[contains(text(),'Hi ocean1')]")
	@CacheLookup
	WebElement dorpDownLogoutOcean;
	
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")
	@CacheLookup
	WebElement btnSignoutocean;
	
	
	public void clkdropDownLogoutOcean() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutOcean));
		Thread.sleep(3000);
		dorpDownLogoutOcean.click();
	}
	public void clkbtnSignOutOcean()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnSignoutocean));
		wait.until(ExpectedConditions.elementToBeClickable(btnSignoutocean));
		btnSignoutocean.click();
	}
	
	
	//======= Log out for Wave ======//
			@FindBy(xpath="//span[@class='caret']")
			@CacheLookup
			WebElement dorpDownLogoutwave;
			
			@FindBy(xpath="//span[contains(text(),'Sign Out')]")
			@CacheLookup
			WebElement btnSignoutwave;
	
	public void clkdropDownLogoutWave() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutwave));
		Thread.sleep(3000);
		dorpDownLogoutwave.click();
	}
	public void clkbtnSignOutwave()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnSignoutwave));
		wait.until(ExpectedConditions.elementToBeClickable(btnSignoutwave));
		btnSignoutwave.click();
	}
	
	//======== Log out for Galaxy user ======//
	@FindBy(xpath="//span[contains(text(),'Hi Hi wind')]")
	@CacheLookup
	WebElement dorpDownLogoutwind;
	
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")
	@CacheLookup
	WebElement btnSignoutwind;
	
	public void clkdropDownLogoutwind() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutwind));
		Thread.sleep(3000);
		dorpDownLogoutwind.click();
	}
	public void clkbtnSignOutwind()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnSignoutwind));
		wait.until(ExpectedConditions.elementToBeClickable(btnSignoutwind));
		btnSignoutwind.click();
	}
	
	//======== Log out for WIND user ======//
			@FindBy(xpath="//span[contains(text(),'Hi wind')]")
			@CacheLookup
			WebElement dorpDownLogoutwind2;
			
			public void clkdropDownLogoutwind2() throws InterruptedException
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 50);
				wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutwind2));
				Thread.sleep(3000);
				dorpDownLogoutwind2.click();
			}
			
			@FindBy(xpath="//span[contains(text(),'Profile')]")
			@CacheLookup
			WebElement btnprofilewind;
			
			public void clkbtnProfilew()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(btnprofilewind));
				wait.until(ExpectedConditions.elementToBeClickable(btnprofilewind));
				btnprofilewind.click();
			}
			
						
			@FindBy(xpath="//span[contains(text(),'Profile')]")
			@CacheLookup
			WebElement btnprofilewave;
			
			public void clkbtnProfilewave()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(btnprofilewind));
				wait.until(ExpectedConditions.elementToBeClickable(btnprofilewind));
				btnprofilewave.click();
			}
			
			@FindBy(xpath=("//span[@class='w-icons-profileCtrl2']"))
			@CacheLookup 
			WebElement sendeeds;	
			
			
			public void ClicksendEeds() 
			{
				sendeeds.click();	
			}
			
			@FindBy(xpath=("/html[1]/body[1]/div[7]/nav[1]/div[1]/form[1]/div[1]/div[1]/input[1]"))
			@CacheLookup
			WebElement txtSearchUser;
			
			public void txtSearchUser(String sValue)
			{
				txtSearchUser.sendKeys(sValue);
			}
			
		@FindBy(xpath=("//strong[contains(text(),'Hiten Trivedi')]"))
		@CacheLookup
		WebElement clkwaveuser;
		
		public void ClickWaveUser()
		{
			clkwaveuser.click();
		}
		
		
			
}
