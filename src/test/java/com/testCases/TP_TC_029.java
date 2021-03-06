package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HomePage;
import com.pageObjects.LandingPage;
import com.pageObjects.LoginPage;
import com.pageObjects.PlugsPage;
import com.utilities.ExcelConfig;
import com.utilities.ReadConfig;
import com.utilities.XLUtils;

public class TP_TC_029 extends BaseClass {

	//WebDriver driver;
	
		@Test(dataProvider="credentials")
		
		public void logintest(String user, String pwd) throws InterruptedException, IOException 
		{
			//create object of Landing class
			LandingPage l=new LandingPage(driver);
				
			//click login button
					l.clickloginlandingbtn();
					logger.info("log in button clicked");
						
			// create Login page object
						LoginPage LoginPage = new LoginPage(driver);
			
			//Enter user name on Login page
						LoginPage.setUsername(user);
						logger.info("providing user name");
					
			//Enter password on Login page
						LoginPage.setPassword(pwd);
						logger.info("providing password");
						
				//click on login button
						LoginPage.clickloginbtn1();
					logger.info("Clicking on login button to access TwoPlugs main home page");
		
					//create object of Home Page
					HomePage h=new HomePage(driver);
					h.clickplugslanding();
					logger.info("clicked on Plugs button");
					
					//create object of Plugs page
					
					PlugsPage p=new PlugsPage(driver);
					p.clickSortByDropDown();
				
					
					p.SortByPrice();
					logger.info("clicked on Price from list");
				
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					
					//SoftAssertion for validating eeds after selection price from list
					SoftAssert asrt=new SoftAssert();
					if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
					{
						asrt.assertTrue(true);
						logger.info("Test Passed! Price updation Successful!");
					}
					else
					{
						asrt.assertTrue(false);
						logger.error("Updation Failed on Price Page");
						captureScreen(driver,"Price");
					}
					asrt.assertAll();
					logger.info("Completed Updation");
					
					//click on sort by Name
					p.SortByName();
					logger.info("clicked on Name from list");
				
					//SoftAssertion to validate name in alphabet order on selection on Name from list
					SoftAssert asrt1=new SoftAssert();
				//	System.out.println(driver.getTitle());
					if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
					{
						asrt1.assertTrue(true);
						logger.info("Name search success");
					}
					else
					{	captureScreen(driver,"validationName");
						logger.error("Name updation is failed : Screen shot taken");
						asrt.assertTrue(false);
					}
					
					//click on Recently updated from list
					p.SortByRecentlyUpdated();
					logger.info("clicked on Recently Updated from list");
						
					//SoftAssertion for validating updated list after selection Recently Updated from list
					SoftAssert asrt2=new SoftAssert();
					if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
					{
						asrt2.assertTrue(true);
						logger.info("List Updation success");
					}
					else
					{	captureScreen(driver,"validationupdated");
					logger.error("list updation is failed : Screen shot taken");
					asrt2.assertTrue(false);
					}
					
					//click on Highest Rating from list
					p.SortByHighestRating();
					logger.info("clicked on Highest Rating from list");
						
					//SoftAssertion for validating updated rating after selection Recently Updated from list
					SoftAssert asrt3=new SoftAssert();
					if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
					{
						asrt3.assertTrue(true);
						logger.info("Rating success");
					}
					else
					{	captureScreen(driver,"validationRating");
					logger.error("Rating is not updated : Screen shot taken");
					asrt3.assertTrue(false);
					}
					asrt3.assertAll();
					logger.info("Completed Rating selection");
		}
		
		
		
		// Data provider will always return String type of data
			// Two dimensional string type array
			@DataProvider(name="credentials")
			public String [][] getData() throws IOException 
			{		
				String path=System.getProperty("user.dir")+"/src/test/java/com/testData/LoginData.xlsx";
			
				//Read data 
				//no of rows  in the XL data sheet
				int rownum=XLUtils.getRowCount(path, "TP_TC_029");
				// no of columns in the XL data sheet
				int colcount=XLUtils.getCellCount(path,"TP_TC_029",1); 
				String data[][]=new String[rownum][colcount]; 
				for(int i=1;i<=rownum;i++)
				{
					for(int j=0;j<colcount;j++)// Since the col values start from index 0
					{
						
						data[i-1][j]=XLUtils.getCellData(path,"TP_TC_029", i,j);// i is row and j is col
						
					}
					
	       }
				return data;
			}
}