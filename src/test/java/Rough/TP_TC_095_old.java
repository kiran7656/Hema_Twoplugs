package Rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.LandingPage;
import com.pageObjects.LoginPage;
import com.utilities.XLUtils;

public class TP_TC_095_old extends BaseClass {

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
			
					
				// Creating a New Service here->
				
				// creating a object of CreateService Page
						CreateService service = new CreateService(driver);  
						
						//click on create new button
						service.clkbtnCreateNew();
						logger.info("Clicking on Create new tab");
						
						//click on Service
						service.clkbtnService();
						logger.info("Click on Service option");
						
						//Enter title
						service.txtTitleField1("Bake");
						logger.info("Enter Title");
						
						//Enter Description
						service.txtdescriptionField1("Wheat Cake");
						logger.info("Enter Description");
						
						//click on Category
						service.Clickfirst();
						logger.info("Click on category");
						
						//Select Category from list
						service.SelectFood();
						logger.info("Select Category as Food");
						TimeUnit.SECONDS.sleep(3);

						//click on sub category
						service.Twoplugscategory();		
						logger.info("click on subcategory");
						
						//select sub category from list
						service.Twoplugscook();
						logger.info("select subcategory cook");
						
						//enter price
						service.txtPriceField("00");
						logger.info("Enter price as Zero");
						
						//click on submit button
						service.btnSubmitServicePage();
				logger.info("clicked on submit button");
  		
				SoftAssert softassert = new SoftAssert();
				//System.out.println(driver.getTitle());
				
				CreateService csn=new CreateService(driver);
				String msg = csn.validatemsg();
				if(msg.equals("Service has been added"))
				{
					softassert.assertTrue(true);
					logger.info("Test Passed! Updation Successful!");
				}
				else
				{
					softassert.assertTrue(false);
					logger.error("Updation Failed on Edit Page");
					captureScreen(driver,"Edit");
				}
				softassert.assertAll();
				logger.info("Completed Updation");
				
		
	}
	
	
	// Data provider will always return String type of data
		// Two dimensional string type array
		@DataProvider(name="credentials")
		public String [][] getData() throws IOException 
		{		
			String path=System.getProperty("user.dir")+"/src/test/java/com/testData/LoginData.xlsx";
		
			//Read data 
			//no of rows  in the XL data sheet
			int rownum=XLUtils.getRowCount(path, "TP_TC_095");
			// no of columns in the XL data sheet
			int colcount=XLUtils.getCellCount(path,"TP_TC_095",1); 
			String data[][]=new String[rownum][colcount]; 
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)// Since the col values start from index 0
				{
					
					data[i-1][j]=XLUtils.getCellData(path,"TP_TC_095", i,j);// i is row and j is col
					
				}
				
       }
			return data;
		}
}
