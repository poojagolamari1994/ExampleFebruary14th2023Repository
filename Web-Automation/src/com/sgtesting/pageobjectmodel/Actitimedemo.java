package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimedemo {
	
	public Actitimedemo(WebDriver oBrowser)
	public static void main(String[] args) {
		SearchContext oBrowser;
		PageFactory.initElements(oBrowser, this);
	
		 private WebElement username;
		 public WebElement getUserName()
		 {
		 return username;
		 }
		 private WebElement pwd;
		 public WebElement getpassword()
	    {
		    return pwd;
	    }
		 @FindBy(xpath="//div[text()='Login']")
		 private WebElement oLogin;
		 
 		 public WebElement getLogin ()
		 {
			 return oLogin;
		 }
		 private WebElement gettingStartedShortCutsPanelId;
		 
		 public WebElement getFlyOutWindow()
		 {
			 return gettingStartedShortCutsPanelId;
		 }
		 @FindBy(linkText="Logout")
		 private WebElement oLogout;
		 
		 public WebElement getLogout()
		 {
			 return oLogout;
		 }
	}


