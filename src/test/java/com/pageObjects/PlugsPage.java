package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlugsPage {
public WebDriver ldriver;
	
	//Constructor
	
	public PlugsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	 // Plugs Page 
	@FindBy(xpath="//a[text()='No Posts Found']")
	@CacheLookup
	WebElement nopostfound;//No Posts Found
		
	// Sending values to search in the search box
	@FindBy(id="searchInput")
	@CacheLookup
	WebElement txtsearchvalue;
	
	// Click on search button
	@FindBy(xpath=("//button[@class='btn btn-filter']"))
	@CacheLookup
	WebElement clksearch;

	//making webElement on Eeds displaying on validation page  	
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]")
	@CacheLookup
	WebElement validateEeds;
		
	//click on SortBy drop down
	@FindBy (xpath="/html/body/div[7]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]")
	WebElement sortByDropDown;
	
	//making webElement to select price from drop down list  
	@FindBy (xpath="//li[contains(text(),'Price')]")
	@CacheLookup
    WebElement selectPrice;
		
	//making webElement to select Name from drop down list 	
	@FindBy (xpath="//li[contains(text(),'Name')]")
	@CacheLookup
    WebElement selectName;
	
	//making webElement to select recently updated from drop down list
	@FindBy (xpath="//li[contains(text(),'Recently Updated')]")
	@CacheLookup
    WebElement selectrecentlyupdated;
	
	//making webElement to select HighestRating from drop down list 	
	@FindBy (xpath="/html[1]/body[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[3]")
	@CacheLookup
	WebElement selectHighestRating;
		
	//making webElement on category displaying on validation page  	
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/p[1]/a[1]")
	@CacheLookup
    WebElement validatecategory;

	//making webElement on Date displaying on validation page  	
	@FindBy (xpath="/html/body/div[7]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/p/span")
	@CacheLookup
	 WebElement validatedate;
	
	//making webElement to select highest rating from drop down list
	@FindBy (xpath="/html[1]/body[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[3]")
	@CacheLookup
	 WebElement selecthighestrating;
			
	//making webElement on review displaying on validation page  	
	@FindBy (xpath="/html[1]/body[1]/div[7]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]")
	@CacheLookup
	 WebElement validatereview;
			
	//method to enter service or need
			public void Dosearch(String searchtext)
			{ 
			txtsearchvalue.sendKeys(searchtext);
			}
			public void clickbtnSearch()
			{
				clksearch.click(); 
			}
			
			public String getEmptyList() {
				// TODO Auto-generated method stub
				return nopostfound.getText();
			}
			
			//WebElement for Test case 097
			
			public void clickSortByDropDown() {
				WebDriverWait wait = new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(sortByDropDown));
				wait.until(ExpectedConditions.elementToBeClickable(sortByDropDown));
				sortByDropDown.click();
			}
			
			//WebElement for Test case 097
			public void SortByPrice()
	      {
				WebDriverWait wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(selectPrice));
			wait.until(ExpectedConditions.elementToBeClickable(selectPrice));
			selectPrice.click();
	      	}
			//WebElement for Test case 097
			public void SortByName()
	       	{
				sortByDropDown.click();
				selectName.click();
	     	}
			//WebElement for Test case 097
			public void SortByHighestRating()
			{
				sortByDropDown.click();
				selecthighestrating.click();
			}
			//WebElement for Test case 097
				public void SortByRecentlyUpdated()
	       	{
					sortByDropDown.click();
				selectrecentlyupdated.click();
	       	}
			
				//WebElement for Test case 097

				//making webElement for first page button on plug page					
				@FindBy (xpath="/html/body/div[7]/div/div[2]/div/nav/ul/li[1]/a")
				@CacheLookup
				 WebElement validatefirstbtn;
				
				//making webElement for previous page button on plug page					
					@FindBy (xpath="/html/body/div[7]/div/div[2]/div/nav/ul/li[2]/a")
					@CacheLookup
					 WebElement validatepreviousbtn;
				
				//making webElement for next button on plug page					
						@FindBy (xpath="/html/body/div[7]/div/div[2]/div/nav/ul/li[13]/a")
						@CacheLookup
						 WebElement validatenextbtn;
				
				//making webElement for last button on plug page					
					@FindBy (xpath="/html/body/div[7]/div/div[2]/div/nav/ul/li[12]/a")
					@CacheLookup
					 WebElement validatelastbtn;
				
				
				// click on first button to move on first page
				public void SelectFirstbtn()
				{
					validatefirstbtn.click();
				}
				// click on previous button to move on previous page
				public void SelectPrevioustbtn()
				{
					validatepreviousbtn.click();
				}
				// click on Next button to move on Next page
				public void SelectNextbtn()
				{
					validatenextbtn.click();
				}
				// click on Last button to move on last page
				public void SelectLastbtn()
				{
					validatelastbtn.click();
				}

							
				//making webElement on update Car Wash which is already created on Plugs page  	
				@FindBy (xpath="/html/body/div[7]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/div[1]/a")
				@CacheLookup
				 public WebElement carwash;
				
				public void Clickcarwash()
				{
					carwash.click();
				}
			
				//making webElement for Edit button on Car Wash  	
				@FindBy (xpath="/html/body/div[7]/section/div/div[2]/div[1]/div/div/div/a")
				@CacheLookup
				 public WebElement Edit;
				
				public void ClickEdit()
				{
					Edit.click();
				}
				
				//making webElement for Save button on update Car Wash Page  	
				@FindBy (xpath="/html/body/div[7]/div[1]/form/div[4]/div[5]/ul/li[2]/button/span")
				@CacheLookup
				 public WebElement Save;
				
				public void ClickSave()
				{
					Save.click();
				}

				//======= Log out for Wave ======//
				@FindBy(xpath="//span[@class='caret']")
				@CacheLookup
				WebElement dorpDownLogoutwave;
				
				@FindBy(xpath="//span[contains(text(),'Sign Out')]")
				@CacheLookup
				WebElement btnSignoutwave1;
				
				public void clkdropDownLogoutwave2() throws InterruptedException
				{
					WebDriverWait wait = new WebDriverWait(ldriver, 50);
					wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutwave));
					Thread.sleep(3000);
					dorpDownLogoutwave.click();
				}
				public void clkbtnSignOutwave2()
				{
					WebDriverWait wait = new WebDriverWait(ldriver, 25);
					wait.until(ExpectedConditions.visibilityOf(btnSignoutwave1));
					wait.until(ExpectedConditions.elementToBeClickable(btnSignoutwave1));
					btnSignoutwave1.click();
				}
}
