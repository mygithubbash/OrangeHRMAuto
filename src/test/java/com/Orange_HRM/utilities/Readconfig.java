package com.Orange_HRM.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	public Readconfig()
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getusername()
	{
		String userName= pro.getProperty("uname");
		return userName;
	}
	public String getpasswd()
	{
		String passwd= pro.getProperty("pwd");
		return passwd;
	}
	public String getchromepath()
	{
		String cheomePath= pro.getProperty("chromepath");
		return cheomePath;
	}
	public String getfirefoxpath()
	{
		String fireFoxPath= pro.getProperty("firefoxpath");
		return fireFoxPath;
	}
	public String getbrowser()
	{
		String browser= pro.getProperty("browser");
		return browser;
	}
}
