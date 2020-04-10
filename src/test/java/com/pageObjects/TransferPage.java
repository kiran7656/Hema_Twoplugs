package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPage {

	public WebDriver ldriver;
	public TransferPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@id='transferAmount']")
	@CacheLookup
	WebElement amounttxt;
	
	public void EnterAmount(String amount)
	{
	amounttxt.sendKeys(amount);
	}
	
	@FindBy(xpath="//span[contains(text(),'TRANSFER')]")
	@CacheLookup
	WebElement btntransfer;
	
	public void clkbtnTransfer()
	{
		btntransfer.click();
	}
	
	@FindBy(xpath="//a[@id='btn_transfer']//span[@class='help'][contains(text(),'Transfer')]")
	@CacheLookup
	WebElement btntransfer2;
	
	public void clkbtnTransfer2() throws InterruptedException
	{
		Thread.sleep(2000);
		btntransfer2.click();
	}
	
	
	
}
