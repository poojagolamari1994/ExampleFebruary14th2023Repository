package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
	
		LaunchBrowser();
		navigate();
		closeApplication();
		
	}
private static void LaunchBrowser()
{
	try 
	{
		oBrowser=new ChromeDriver();
		
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
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
private static void closeApplication()
{
	try 
	{
		oBrowser.close();
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
}