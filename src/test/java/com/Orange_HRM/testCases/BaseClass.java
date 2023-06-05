package com.Orange_HRM.testCases;
import java.time.Duration;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Orange_HRM.utilities.Readconfig;

public class BaseClass {
	
	Readconfig readconfig = new Readconfig();
	
	
	public String baseURL=readconfig.getApplicationURL();
	public String uname=readconfig.getusername();
	public String pwd=readconfig.getpasswd();
	public static WebDriver driver;
	public static Logger Logger = LogManager.getLogger(BaseClass.class);
	
	@Parameters("browser")
	
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		driver= new ChromeDriver();
		}
		else
		{
			
			
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
			driver= new FirefoxDriver();
			}

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		
		
		
	}
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
}
