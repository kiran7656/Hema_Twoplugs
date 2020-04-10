package Rough;

import java.io.IOException;

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

public class TP_TC_027_rough extends BaseClass
{
	LandingPage l;
	PlugsPage p;

	HomePage h;
	
	@Test(dataProvider="search")
	
		public void searchTest(String user, String pwd, String searchtext) throws InterruptedException, IOException {
			
		//create object of Landing class
		l=new LandingPage(driver);
		//click login btn
		l.clickloginlandingbtn();
		logger.info("log in btn clicked");
			// create Login page object
			LoginPage LoginPage = new LoginPage(driver);
		
		Thread.sleep(2000);
		LoginPage.setUsername(user);
		logger.info("providing user name");
		
		logger.info("providing password");
		LoginPage.setPassword(pwd);
		
		LoginPage.clickloginbtn1();
		logger.info("Clicking on login button to access TwoPlugs main home page");
		//create object of Home Page
		h=new HomePage(driver);
		h.clickplugslanding();
		logger.info("clicked");
		PlugsPage pp=new PlugsPage(driver);
		pp.Dosearch(searchtext);
		pp.clickbtnSearch();
		logger.info("enteres search text and clicked search btn");
		
SoftAssert softassert = new SoftAssert();
		if(p.getEmptyList().equals("No posts found"))
		{
			softassert.assertTrue(true);
			logger.info("search success");
		}
		else
		{
			softassert.assertTrue(false);
			logger.error("search Failed!");
			captureScreen(driver,"search");
		}
		softassert.assertAll();
		logger.info("Completed Search");
		}
	
	@DataProvider(name="search")
	public Object[][] providedata()
	{
		ExcelConfig config=new ExcelConfig(System.getProperty("user.dir")+"\\src\\test\\java\\com\\testData\\LoginData.xlsx");
		int rows=config.getRowCount("TP_TC_027");
		System.out.println("No. of rows display"+rows);
		Object data[][]=new Object[2][3];
		for(int i=1;i<=2;i++)
		{
		data[i-1][0]=config.getData("TP_TC_027",i,0);
		data[i-1][1]=config.getData("TP_TC_027",i,1);	
		data[i-1][2]=config.getData("TP_TC_027",i,2);	
		System.out.println(data[i-1][0]);
		System.out.println(data[i-1][1]);
		System.out.println(data[i-1][2]);
	
		}
		
	// validating for multiple rows (passwords)	in excel sheets	
	//	Object data[][]=new Object[rows][1];
		
		//for(int i=0;i<rows;i++)
	//	{
		//	data[i][0]=config.getData("Sheet2", i, 0);
		    // validate for multiple column
			//	data[0][i]=config.getData("Sheet2", 0,i);
	//		}
		return data;
	}
	
	
}