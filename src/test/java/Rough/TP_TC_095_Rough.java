package Rough;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.LandingPage;
import com.pageObjects.LoginPage;
import com.utilities.XLUtils;

public class TP_TC_095_Rough extends BaseClass {

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
			
				//click on Create New button
				CreateService cs= new CreateService(driver);
				cs.clkbtnCreateNew();
				logger.info("Clicking on create new button"); 
				
				//click on Service option
				cs.clkbtnService();
				logger.info("Clicking on Service option from Create new button"); 
	
            
				String title = null;
				String desc = null;
				String price = null;
				cs.enterservicedetails(title, desc, price);
				
				//click on category arrow
				cs.Clickfirst();
				logger.info("select Category arrow"); 
				
				//click on Food & Beverage option
				cs.SelectFood();
				logger.info("select Category Food from list"); 
				
				//click on sub category arrow
				cs.Twoplugscategory();
				logger.info("select SubCategory arrow"); 
				
				//click on diet option
				cs.Twoplugsdiet();
				logger.info("click SubCategory Diet");
				
				//click on submit button
				cs.btnSubmitServicePage();
				logger.info("clicked on submit button");
  		
				//SoftAssertion
				SoftAssert asrt=new SoftAssert();
				if(driver.getTitle().contains("Name"))
				{
					asrt.assertTrue(true);
					logger.info("search success");
				}
				else
				{	captureScreen(driver,"validation");
					logger.error("Name selection is failed : Screen shot taken");
					asrt.assertTrue(false);
				}
				System.out.println(" " + "Page Title  : " + driver.getTitle());
				logger.info("Vaidating Name option");
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
