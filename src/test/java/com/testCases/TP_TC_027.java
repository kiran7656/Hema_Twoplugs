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

public class TP_TC_027 extends BaseClass
{
	LandingPage l;
	PlugsPage p;

	HomePage h;
	@BeforeMethod
public void setup()
	
	{		ReadConfig readconfig = new ReadConfig();
		// Initialization // Logger initiated within the setup method
		logger=Logger.getLogger("TwoPlugs");// Project Name 
		PropertyConfigurator.configure("log4j.properties"); // Added Logger
		
		logger.setLevel(Level.DEBUG); // to get the debug log
		logger.debug("Debug logging has started ");
		
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		//driver = new FirefoxDriver();
		driver.get(baseURL);
		
		// Global implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    
        /*		if(br.equalsIgnoreCase("chrome"))
		{
										//Path from ReadConfig
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver=new ChromeDriver();		//getting Chrome path from readcong and configProperties
		driver.get(baseURL);
		logger.info("Opening base URL - in Chrome");
		
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver=new InternetExplorerDriver();
			driver.get(baseURL);
			logger.info("Opening base URL - in Internet Explorer");
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
			driver.get(baseURL);
			logger.info("Opening base URL - in FireFox");
		}
		
		 */
			
	}
	
	@Test(dataProvider="search")
	
		public void searchTest(String user, String pwd, String searchtext) throws InterruptedException, IOException {
			
		//create object of Landing class
		l=new LandingPage(driver);
		//click login btn
		l.clickloginlandingbtn();
		logger.info("log in btn clicked");
		
		// create Login page object
			LoginPage LoginPage = new LoginPage(driver);
			LoginPage.setUsername(user);
			logger.info("providing user name");
			LoginPage.setPassword(pwd);
			logger.info("providing password");
			LoginPage.clickloginbtn1();
			logger.info("Clicking on login button to access TwoPlugs main home page");
	
			//create object of Home Page
			h=new HomePage(driver);
			h.clickplugslanding();
			logger.info("clicked");
			PlugsPage p=new PlugsPage(driver);
			p.Dosearch(searchtext);
			p.clickbtnSearch();
			logger.info("enteres search text and clicked search btn");
		
		//SoftAssertion
				SoftAssert asrt=new SoftAssert();
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					asrt.assertTrue(true);
					logger.info("search success");
						
				}
				else
				{
					captureScreen(driver,"search");
					logger.error("search is failed : Screen shot taken");
					asrt.assertTrue(false);
				}
				System.out.println(" " + "Page Title  : " + driver.getTitle());
				logger.info("Vaidating title page - search page, after search");
			
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
		return data;
	}
	
}