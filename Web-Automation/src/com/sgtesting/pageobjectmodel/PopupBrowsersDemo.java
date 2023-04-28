package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;

public class PopupBrowsersDemo {

	public static void main(String[] args) {
	private static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		popUpBrowser();
	}
	{
		private static void launchBrowser() {
			try {
				oBrowser = new chromeDriver();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void popupBrowser() {
			try {
				System.out.println("Before click on link, Number of popups:="+getpopupsCount);
			} catch (Exception e) 
			{
			    e.printStackTrace();
			}
		
			}
		}
	}
	}

}
