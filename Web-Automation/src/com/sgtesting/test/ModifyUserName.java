package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserName {
	public static WebDriver oBrowser=null;
	public static ModifyActitime oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizerFlyOutWindow();
		CreateUser();
		AddUser();
		FirstnameUser();
		LastnameUser();
		EmailId();
		Usernames();
		Password();
		Passwordcopy();
		CreateaUser();
		into();
		Modify();
		Renamefield();
		Savechange();
		

	}
	private static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
			oPage=new ModifyActitime(oBrowser);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	private static void navigate()
	{
		try {
			
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();


		}
	}
	private static void login()
	{
		try {
			
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizerFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
 private static void CreateUser()
 {
	 try {
		 oPage.getUser().click();
		 Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 private static void AddUser()
 {
	 try {
		 oPage.getAddUser().click();
		 Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 private static void FirstnameUser()
 {
	 try {
	 oPage.getFirstname().sendKeys("Dhanu");
	 Thread.sleep(2000);
	 } catch (Exception e) {
			e.printStackTrace();
		}
 }
 private static void LastnameUser()
 {
	 
	 try {
		 oPage.getLastname().sendKeys("Shree");
		 Thread.sleep(2000);
		 } catch (Exception e) {
				e.printStackTrace();
			}
 }
 private static void EmailId()
 {
	 try {
		 oPage.getEmail().sendKeys("ab@gmail.com");
		 Thread.sleep(2000);
		 } catch (Exception e) {
				e.printStackTrace();
			}
 }
 private static void Usernames()
 {
	 try {
		 oPage.Username().sendKeys("Dhanu Shree");
		 Thread.sleep(2000);
		 } catch (Exception e) {
				e.printStackTrace();
			}
	 
 }
 private static void Password()
 {
	 try {
		 oPage.getPasswordUser().sendKeys("12345");
		 Thread.sleep(2000);
		 } catch (Exception e) {
				e.printStackTrace();
			}
	 
 }
 private static void Passwordcopy()
 {
	 try {
		 oPage.getpasswordCopy().sendKeys("12345");
		 Thread.sleep(2000);
		 } catch (Exception e) {
				e.printStackTrace();
			}
	 
	 
 }
 private static void CreateaUser()
 {
	 try {
		 oPage.Createuser().click();
		 Thread.sleep(2000);
		 } catch (Exception e) {
				e.printStackTrace();
			}
	 
 }
 private static void into()
 {
	 try {
		 oPage.getinside().click();
		 Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 private static void Modify()
 {
	 try {
		 
		 oPage.getmodify().click();
		 Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
 }
 private static void Renamefield()
 {
	 try {
		 oPage.getRename().clear();
		 Thread.sleep(3000);
		 oPage.getFirstname().sendKeys("Sudha");
		 Thread.sleep(3000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 private static void Savechange()
 {
	 try {
		 oPage.getsavechange().click();
		 Thread.sleep(3000);
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
 }
}