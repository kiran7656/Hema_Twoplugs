package com.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateService 
{
	public WebDriver ldriver;
	
	// Constructor
	public CreateService(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"subcategory_id-styler\"]/div[1]/div[2]/div")
	@CacheLookup
	WebElement subCategory;
	
		
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[6]")
	@CacheLookup
	public WebElement Diet;
	
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]")
	@CacheLookup
	public WebElement cook;
	
	
	public void Twoplugscategory()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(subCategory));
		wait.until(ExpectedConditions.elementToBeClickable(subCategory));
		subCategory.click();
	}
	
	public void Twoplugsdiet()
	{
		
		Diet.click();
	}
	public void Twoplugscook()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(cook));
		wait.until(ExpectedConditions.elementToBeClickable(cook));
		cook.click();
	}	
	
	// Select category for Automobile
				@FindBy(xpath="//div[@class='jq-selectbox__select-text placeholder']")
				@CacheLookup 
				WebElement selectCategoryAutomobile;
					
				// Select Automobile from Category list
				@FindBy(xpath="//li[contains(text(),'Automobile')]")
				@CacheLookup
				WebElement categoryAutomobile;
				
				public void selectCategoryFieldAutomobile()
				{
					selectCategoryAutomobile.click();
				}
				public void CategoryAutomobile()
				{
					WebDriverWait wait = new WebDriverWait(ldriver, 60);
					wait.until(ExpectedConditions.visibilityOf(categoryAutomobile));
					wait.until(ExpectedConditions.elementToBeClickable(categoryAutomobile));
					categoryAutomobile.click();
				}
				public void txtTitleField1(String uvalue)
				{
					WebDriverWait wait = new WebDriverWait(ldriver, 25);
					wait.until(ExpectedConditions.visibilityOf(txtTitle1));
					txtTitle1.click();
					txtTitle1.sendKeys(uvalue);
				}
				public void txtdescriptionField1(String description)
				{
					txtdescription1.clear();
					txtdescription1.sendKeys(description);
				}
				public void txtPriceField1(String price)
				{
					//txtPrice1.clear();
					txtPrice1.sendKeys(price);
				}
				
				
	//select sub category for car Wash

	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
			@CacheLookup
			WebElement subCategorycar;
			 
			
			// Select from Sub-Category list for Car
			@FindBy(xpath="//div[@id='subcategory_id-styler']//li[contains(text(),'Automobile')]")
			@CacheLookup
			WebElement subCategoryListcar;

	public void subCategoryFieldcar() throws InterruptedException
			{
				Thread.sleep(3000);
				subCategorycar.click();
			}
	public void selectCatergoryList()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 40);
	//	subCategoryListcar.getAttribute(catName);
		wait.until(ExpectedConditions.visibilityOf(subCategoryListcar));
		wait.until(ExpectedConditions.elementToBeClickable(subCategoryListcar));
		subCategoryListcar.click();
	}
	
	
	// Send values to field title for adding title to page "Add a Service"
			@FindBy(xpath="//input[@id='name']")
			@CacheLookup // is used to improve the performance 
			WebElement txtTitle1;
			
			// Send values to description field 
			@FindBy(xpath="//textarea[@id='description']")
			@CacheLookup // is used to improve the performance 
			WebElement txtdescription1;
			
			
	// Updating price field 
			@FindBy(xpath="//input[@id='price']")
			@CacheLookup
			WebElement txtPrice1;
			
	//======Create a service=========//
	
		// Selecting create new button to select service need 
		@FindBy(xpath="//span[contains(@class,\"w-icons-caret\")]")
		@CacheLookup // is used to improve the performance
		WebElement btnCreateNew;

		// Selecting Service from drop down list
		@FindBy(xpath="//a[contains(text(),'Service')]")
		@CacheLookup // is used to improve the performance 
		WebElement btnService;
		
		//==== Completing Add a service page =====//
		
		// Send values to field title for adding title to page "Add a Service"
		@FindBy(xpath="//input[@id='name']")
		@CacheLookup // is used to improve the performance 
		WebElement txtTitle;
		
		// Send values to description field 
		@FindBy(xpath="//textarea[@id='description']")
		@CacheLookup // is used to improve the performance 
		WebElement txtdescription;
		
		
		// Select category 
		@FindBy(xpath="//*[@id=\"category_id-styler\"]/div[1]/div[2]")
		@CacheLookup 
		WebElement selectCategory;
		
		// Select from Category list for Food & Beverage
		@FindBy(xpath="//li[contains(text(),'Food & Beverage')]")
		@CacheLookup
		WebElement CategoryList;
		
		
		// Select Sub-category field
	 
			
		// Updating price field 
		@FindBy(xpath="//input[@id='price']")
		@CacheLookup
		WebElement txtPrice;
		
		// Refund Bar
		@FindBy(xpath="//div[@id='slider-range-max3']")
		@CacheLookup
		WebElement sliderBar;
		
		//Refund valid field
		@FindBy (xpath="//input[@id='refund_valid']")
		@CacheLookup
		WebElement txtrefundValid;
		
		//Click Submit button
		@FindBy (xpath="//button[contains(@type,'submit')]")
		@CacheLookup
		WebElement btnSubmit;
		
		
		//======= Log out for Wave ======//
		@FindBy(xpath="//span[@class='caret']")
		WebElement dorpDownLogout;
		
		@FindBy(xpath="//span[contains(text(),'Sign Out')]")
		WebElement btnSignout;
		
		//======== Log out for Ocean user ======//
		@FindBy(xpath="//span[contains(text(),'Hi ocean1')]")
		@CacheLookup
		WebElement dorpDownLogout1;
		
		@FindBy(xpath="//span[contains(text(),'Sign Out')]")
		@CacheLookup
		WebElement btnSignout1;
		
		//======== Log out for Galaxy user ======//
		@FindBy(xpath="//span[contains(text(),'Hi galaxy')]")
		@CacheLookup
		WebElement dorpDownLogoutgalaxy1;
		
		public void clkdropDownLogoutgalaxy1() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutgalaxy1));
			Thread.sleep(3000);
			dorpDownLogoutgalaxy1.click();
		}
		
		//======== Log out for WIND user ======//
		@FindBy(xpath="//span[contains(text(),'Hi wind')]")
		WebElement dorpDownLogoutwind1;
		
		public void clkdropDownLogoutwind1() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutwind1));
			Thread.sleep(3000);
			dorpDownLogoutwind1.click();
		}
		
		@FindBy(xpath="//span[contains(text(),'Sign Out')]")
		WebElement btnSignoutw1;
		
		public void clksignoutwind1() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(btnSignoutw1));
			Thread.sleep(3000);
			btnSignoutw1.click();
		}
		
		//======== Log out for WIND user 2nd id ======//
				@FindBy(xpath="//span[contains(text(),'Hi wind')]")
				WebElement dorpDownLogoutwind2;
				
				public void clkdropDownLogoutwind2() throws InterruptedException
				{
					WebDriverWait wait = new WebDriverWait(ldriver, 50);
					wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutwind2));
					Thread.sleep(3000);
					dorpDownLogoutwind2.click();
				}
				
				@FindBy(xpath="//span[contains(text(),'Sign Out')]")
				WebElement btnSignoutw2;
				
				public void clksignoutwindw2() throws InterruptedException
				{
					WebDriverWait wait = new WebDriverWait(ldriver, 50);
					wait.until(ExpectedConditions.elementToBeClickable(btnSignoutw2));
					Thread.sleep(3000);
					btnSignoutw2.click();
				}
		
		//========================================================================//
		
		public void clkbtnCreateNew()
		{
			btnCreateNew.click();
		}
		
		public void clkbtnService()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(btnService));
			btnService.click();
		}
		public void txtTitleField(String uvalue)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(txtTitle));
			txtTitle.click();
			txtTitle.sendKeys(uvalue);
		}
		public void txtdescriptionField(String description)
		{
			
			txtdescription.sendKeys(description);
		}
		public void Clickfirst()
		{
			selectCategory.click();
		}


		public void SelectFood()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(CategoryList));
			wait.until(ExpectedConditions.elementToBeClickable(CategoryList));
			CategoryList.click();
		}
		
	
		public void txtPriceField(String price)
		{
			txtPrice.sendKeys(price);
		}
		public void SilderBarMaxLimit()
		{
			// Sectecting the maximum option in the slider bar
			WebElement ele=sliderBar;
			Actions act=new Actions(ldriver);
			act.moveToElement(ele).dragAndDropBy(ele, 200, 0).build().perform();
			
		}
		public void refundValidField (String days)
		{
			txtrefundValid.clear();
			txtrefundValid.sendKeys(days);
		}
		public void btnSubmitServicePage()
		{
			btnSubmit.click();
		}	
		
		public void enterservicedetails(String title, String desc, String price)
		{
			
	     	txtTitle.sendKeys("BakeCake");
			txtdescription.sendKeys("Bake with wheat dough");
			txtPrice.sendKeys("0");
		}
		
		@FindBy(xpath="//*[@id=\"dismiss\"]/div/div")
		@CacheLookup
		WebElement updationmsg;
		
		public String validatemsg()
		{
			 return updationmsg.getText();
		}
		
		// ===============Log out====================== //
		public void clkdropDownLogout() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogout));
			Thread.sleep(3000);
			dorpDownLogout.click();
		}
		public void clkbtnSignOut()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(btnSignout));
			wait.until(ExpectedConditions.elementToBeClickable(btnSignout));
			btnSignout.click();
		}
		
		public void clkdropDownLogout1() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogout1));
			Thread.sleep(3000);
			dorpDownLogout1.click();
		}
		public void clkbtnSignOut1()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(btnSignout1));
			wait.until(ExpectedConditions.elementToBeClickable(btnSignout1));
			btnSignout1.click();
		}
		
	}