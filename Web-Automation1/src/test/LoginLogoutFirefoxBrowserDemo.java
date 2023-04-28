package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFirefoxBrowserDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
	//	minimizeFlyoutWindow();
	//	Logout();
	//Closeapp();
	}
private static void LaunchBrowser()
{
	try {
		oBrowser= new FirefoxDriver();
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
private static void Login()
{
	try 
	{
		oBrowser.findElement(By.id("Username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");	
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(5000);	
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void minimizeFlyoutWindow()
{
	try 
	{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId"));
	} catch (Exception e) {
		
	}
}
}