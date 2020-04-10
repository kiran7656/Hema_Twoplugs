package Rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HomePage;
import com.pageObjects.LandingPage;
import com.pageObjects.LoginPage;
import com.pageObjects.PlugsPage;

import com.utilities.XLUtils;

public class TP_TC_029_rough extends BaseClass {

	//WebDriver driver;
	
	@Test
	public void logintest() throws IOException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		login.setUsername("wave@mailinator.com");
		login.setPassword("qatest2plugs");
		login.clickloginbtn1();
			
				//create object of Home Page
				HomePage h=new HomePage(driver);
				h.clickplugslanding();
				logger.info("clicked on Plugs button");
				
				//create object of Plugs page
				
				PlugsPage p=new PlugsPage(driver);
				p.clickSortByDropDown();
							
				p.SortByPrice();
				logger.info("clicked on Price from list");
			
			//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//SoftAssertion for validating eeds after selection price from list
				SoftAssert asrt=new SoftAssert();
				if(driver.getTitle().contains("price"))
				{
					asrt.assertTrue(true);
					logger.info("search success");
			    }
				else
				{	captureScreen(driver,"validationPrice");
					logger.error("Price updation is failed : Screen shot taken");
					asrt.assertTrue(false);
				}
				
				//click on sort by Name
				p.SortByName();
				logger.info("clicked on Name from list");
			
				//SoftAssertion to validate name in alphabet order on selection on Name from list
				SoftAssert asrt1=new SoftAssert();
				if(driver.getTitle().contains("Name"))
				{
					asrt1.assertTrue(true);
					logger.info("search success");
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
				if(driver.getTitle().contains("recentlyupdated"))
				{
					asrt2.assertTrue(true);
					logger.info("search success");
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
				if(driver.getTitle().contains("HighestRating"))
				{
					asrt3.assertTrue(true);
					logger.info("search success");
				}
				else
				{	captureScreen(driver,"validationRating");
				logger.error("Rating is not updated : Screen shot taken");
				asrt3.assertTrue(false);
				}
				asrt3.assertAll();
				logger.info("Completed Rating selection");
	}
	
}