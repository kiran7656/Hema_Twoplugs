package com.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
 WebDriver ldriver;

	//Constructor
	
	public SignUpPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	  // SignUp Page 
	
	// Click JOIN NOW FOR FREE button on main page 
	
	@FindBy(xpath="//span[text()='Join Now For Free']")
	public WebElement btnsignuplanding;
	 	
    	//Input user name
		@FindBy(xpath="//input[@id=\"signUpUser\"]")
		@CacheLookup
		WebElement txtsignusername;

		//input email
		@FindBy(xpath="//input[@id='signUpEmail']")
		@CacheLookup
		WebElement txtsignemail;
				
		//input password
		@FindBy(xpath="//input[@id='signUpPassword']")
		@CacheLookup
		WebElement txtsignpassword;
		
		
		// Click SIGN UP after user name,Email and password
		@FindBy (xpath="//span[text()='SIGN UP']")
		@CacheLookup
		WebElement btnSignup;
		
		
		public void clickbtnsignuplanding()
		{
			btnsignuplanding.click();
		}
				
		//method to password
		public void DoLogin(String mypass)
		{ 
			//txtsignusername.sendKeys(myusername);
			//txtsignemail.sendKeys(myemail);
			txtsignpassword.sendKeys("123456789");
			
		}
		public void clickbtnSignup()
		{
			btnSignup.click(); 
		}

		
	} 