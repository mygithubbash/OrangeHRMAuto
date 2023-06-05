package com.Orange_HRM.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange_HRM.pageObjects.DashBoardPage;
import com.Orange_HRM.pageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass

{
	@Test
	public void loginTest() throws InterruptedException
	{
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
	
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(uname);
		Thread.sleep(2000);
		
		lp.setPwd(pwd);
		Thread.sleep(4000);
		lp.clickSubmit();
		
		Thread.sleep(6000);
		
		
		DashBoardPage db=new DashBoardPage(driver);
		String originalhandle= driver.getWindowHandle();
		driver.switchTo().window(originalhandle);
		db.logdrpdn();
		Thread.sleep(4000);
		db.logout();
		Thread.sleep(4000);
		Assert.assertTrue(true);
	}
	/*@DataProvider(name="LoginData")
	public static String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/Orange_HRM/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path,  "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0; j<colcount;j++) 
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
			}
		}
		return logindata;
	}*/
}
