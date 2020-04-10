package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsufficientEedsPage {

	public WebDriver ldriver;
	
	// Constructor
	public InsufficientEedsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='name_on_card']")
	@CacheLookup
	WebElement nameoncard;
	
	public void EnterNameonCard(String uvalue) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(nameoncard));
		Thread.sleep(3000);
		nameoncard.click();
		nameoncard.sendKeys(uvalue);
	}
	
	
	//WebElement for Pay Button
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[5]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
	@CacheLookup
	WebElement paybtn;
	
	public void ClickPayBtn()
	{
		paybtn.click();
	}
	
	//Webelement for OK button after Purchase Succeeded
	@FindBy(xpath="//span[contains(text(),'OK')]")
	@CacheLookup
	WebElement okpurchasebtn;
	
	public void ClickokBtn() throws InterruptedException
	{
		Thread.sleep(2500);
		okpurchasebtn.click();
	}
	
	
	
	// For Credit Card Number
    @FindBy(xpath="//input[@name='cardnumber']")
	 @CacheLookup // is used to improve the performance
    WebElement cardNumber;
    
    // For Credit card expiration date
    @FindBy(xpath="//input[@name='exp-date']")
	 @CacheLookup // is used to improve the performance
    WebElement expDate;
    
    // For Credit Card CVC number
    @FindBy(xpath="//input[@name='cvc']")
	 @CacheLookup // is used to improve the performance
    WebElement cvc;
    
    // For Credit Card Zip Code 
    @FindBy(xpath="//input[@name='postal']")
	 @CacheLookup // is used to improve the performance
    WebElement zip;
    
    @FindBy(name="__privateStripeFrame5")
    public WebElement iFrame;
    

    //Method to Enter Card Details (usying iframe)

    public void EnterCardDetails(String CardNumber,String CardExpdate,String CVCNum,String Zipcode) 
    {
    	 WebDriverWait wait = new WebDriverWait(ldriver, 30);
        // Switching to iframe 
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("__privateStripeFrame5")));
    	 
     // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iFrame"));
    	 
        //ldriver.manage().deleteAllCookies();
        
	     wait.until(ExpectedConditions.visibilityOf(cardNumber)).clear();
        wait.until(ExpectedConditions.elementToBeClickable(cardNumber)).sendKeys(CardNumber);
		
        wait.until(ExpectedConditions.elementToBeClickable(expDate)).sendKeys(CardExpdate);
        wait.until(ExpectedConditions.elementToBeClickable(cvc)).sendKeys(CVCNum);
        
	     wait.until(ExpectedConditions.visibilityOf(zip)).click();
        wait.until(ExpectedConditions.elementToBeClickable(zip)).sendKeys(Zipcode);
        
        // Coming out from the iframe
        ldriver.switchTo().defaultContent();
        
      //  wait.until(ExpectedConditions.visibilityOf(payBtn));
 		// wait.until(ExpectedConditions.elementToBeClickable(payBtn)).click();
    }
    
    
}
