package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNeed {
public WebDriver ldriver;
	
	// Constructor
	public CreateNeed(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//======Create a service=========//
	
			// Selecting create new button to select service need 
			@FindBy(xpath="//span[contains(@class,\"w-icons-caret\")]")
			@CacheLookup // is used to improve the performance
			WebElement btnCreateNew;

			// Selecting Service from drop down list
			@FindBy(xpath="//a[contains(text(),'Need')]")
			@CacheLookup // is used to improve the performance 
			WebElement btnNeed;
			
			public void clkbtnCreateNewneed() throws InterruptedException
			{
				Thread.sleep(3000);
				btnCreateNew.click();
			}
			
			public void clkbtnNeed()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(btnNeed));
				btnNeed.click();
			}
			//==== Completing Add a Need page =====//
			
			// Select category for Need
			@FindBy(xpath="//div[@class='jq-selectbox__select-text placeholder']")
			@CacheLookup 
			WebElement selectCategoryneed;
				
			// Select Automobile from Category list
			@FindBy(xpath="//li[contains(text(),'Automobile')]")
			@CacheLookup 
			WebElement categoryAutomobileneed;
			
			public void selectCategoryFieldneed()
			{
				selectCategoryneed.click();
			}
			public void CategoryAutomobileneed()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(categoryAutomobileneed));
				wait.until(ExpectedConditions.elementToBeClickable(categoryAutomobileneed));
				categoryAutomobileneed.click();
			}
			// Send values to field title for adding title to page "Add a Service"
						@FindBy(xpath="//input[@id='name']")
						@CacheLookup // is used to improve the performance 
						WebElement txtTitle;
						
						// Send values to description field 
						@FindBy(xpath="//textarea[@id='description']")
						@CacheLookup // is used to improve the performance 
						WebElement txtdescription;
						
						
				// Updating price field 
						@FindBy(xpath="//input[@id='price']")
						@CacheLookup
						WebElement txtPrice;
						
						public void txtTitleField(String uvalue)
						{
							WebDriverWait wait = new WebDriverWait(ldriver, 25);
							wait.until(ExpectedConditions.visibilityOf(txtTitle));
							txtTitle.click();
							txtTitle.sendKeys(uvalue);
						}
						public void txtdescriptionField(String description)
						{
							txtdescription.clear();
							txtdescription.sendKeys(description);
						}
						public void txtPriceField(String price)
						{
							//txtPrice1.clear();
							txtPrice.sendKeys(price);
						}
						
						//select sub category for car Wash

						@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
								@CacheLookup
								WebElement subCategorycar1;
								 
								
								// Select from Sub-Category list for Car
								@FindBy(xpath="//div[@id='subcategory_id-styler']//li[contains(text(),'Automobile')]")
								@CacheLookup
								WebElement subCategoryListcar1;

						public void subCategoryFieldcar1() throws InterruptedException
								{
									Thread.sleep(3000);
									subCategorycar1.click();
								}
						public void selectCatergoryList1()
						{
							WebDriverWait wait = new WebDriverWait(ldriver, 40);
						//	subCategoryListcar.getAttribute(catName);
							wait.until(ExpectedConditions.visibilityOf(subCategoryListcar1));
							wait.until(ExpectedConditions.elementToBeClickable(subCategoryListcar1));
							subCategoryListcar1.click();
						}
						
												
						//Click Submit button
						@FindBy (xpath="/html[1]/body[1]/div[7]/div[1]/form[1]/div[4]/div[5]/ul[1]/li[2]/button[1]")
						@CacheLookup
						WebElement btnSubmit1;
						
						public void btnCreateNeedPage()
						{
							btnSubmit1.click();
						}	

						//making webElement for Edit button on Car Wash  	
						@FindBy (xpath="/html/body/div[7]/section/div/div[2]/div[1]/div/div/div/a")
						@CacheLookup
						 public WebElement EditNeed;
						
						public void ClickEditNeed()
						{
							EditNeed.click();
						}

						//making webElement for Save button on update Car Wash Page  	
						@FindBy (xpath="/html/body/div[7]/div[1]/form/div[4]/div[5]/ul/li[2]/button")
						@CacheLookup
						 public WebElement Saveneed;
						
						public void ClickSaveNeed()
						{
							Saveneed.click();
						}
					
						//make an element for youtube url
						@FindBy (xpath="/html/body/div[7]/div[1]/form/div[4]/div[5]/ul/li[2]/button")
						@CacheLookup	
						public WebElement youTubeVideoURL;

						public void EnteryouTubeVideoURL(String description)
						{
							youTubeVideoURL.sendKeys(description);
						}
						
						// Click on Plugs button after login
						@FindBy(xpath=("//span[@class='w-icons-twoPlugs']"))
						@CacheLookup
						WebElement btnclickplugslandingneed;
						
								
						public void clickplugslanding1()
						{
							btnclickplugslandingneed.click();
						}
						
						//making webElement on update Car Wash which is already created on Plugs page  	
						@FindBy (xpath="/html/body/div[7]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/div[1]/a")
						@CacheLookup
						 public WebElement carwash1;
						
						public void Clickcarwash1()
						{
							carwash1.click();
						}
					
						//======== Log out for Ocean user ======//
						@FindBy(xpath="//span[contains(text(),'Hi ocean1')]")
						@CacheLookup
						WebElement dorpDownLogoutOcean;
						
						@FindBy(xpath="//span[contains(text(),'Sign Out')]")
						@CacheLookup
						WebElement btnSignoutOcean;
						
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
							wait.until(ExpectedConditions.visibilityOf(btnSignoutOcean));
							wait.until(ExpectedConditions.elementToBeClickable(btnSignoutOcean));
							btnSignoutOcean.click();
						}


						//======== Log out for WIND user ======//
								@FindBy(xpath="//span[contains(text(),'Hi wind')]")
								WebElement dorpDownLogoutwind;
								
								public void clkdropDownLogoutwind() throws InterruptedException
								{
									WebDriverWait wait = new WebDriverWait(ldriver, 50);
									wait.until(ExpectedConditions.elementToBeClickable(dorpDownLogoutwind));
									Thread.sleep(3000);
									dorpDownLogoutwind.click();
								}
								
								@FindBy(xpath="//span[contains(text(),'Sign Out')]")
								WebElement btnSignoutwind;
								
								public void clksignoutwind() throws InterruptedException
								{
									WebDriverWait wait = new WebDriverWait(ldriver, 50);
									wait.until(ExpectedConditions.elementToBeClickable(btnSignoutwind));
									Thread.sleep(3000);
									btnSignoutwind.click();
								}
						

}

