package com.sgtesting.test;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {

private static WebDriver Browser=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			//System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			Browser=new FirefoxDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{

			Browser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}


	}
	private static void closeApplication()
	{
		try 
		{
			Browser.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();	
		}
	}

}
		
