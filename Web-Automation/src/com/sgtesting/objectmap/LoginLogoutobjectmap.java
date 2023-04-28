package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutobjectmap {

	private static WebDriver oBrowser=null;
	public static Objectmapdemo om=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		logout();
		

	}
private static void launchBrowser()
{
	try 
	{
		oBrowser=new ChromeDriver();

		om=new Objectmapdemo(".\\objectmap\\objectmap.properties");
		
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try 
	{
		oBrowser.get("http://localhost:81/login.do");
		Thread.sleep(5000);
		
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}

private static void login()
{
	try 
	{
		oBrowser.findElement(om.getLocator("loginpageusername")).sendKeys("admin");
		oBrowser.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
		oBrowser.findElement(om.getLocator("loginpageloginbtn")).click();
		Thread.sleep(5000);
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
private static void minimizeflyoutwindow()
{
	try
	{
	oBrowser.findElement(om.getLocator("homepageflyoutwindow")).click();
	Thread.sleep(5000);
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
private static void logout()
{
	try 
	{
		oBrowser.findElement(om.getLocator("homepagelogoutlink")).click();
		Thread.sleep(2000);
	} catch (Exception e) {
	e.printStackTrace();
	}
}
}
