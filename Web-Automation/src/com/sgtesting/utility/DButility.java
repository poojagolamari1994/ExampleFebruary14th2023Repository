package com.sgtesting.utility;

import java.sql.Connection;

public class DButility 
{
	/**
	 * Verify the DB Connection
	 * Return Value: boolean
	 * 
	 */
public static boolean getDatabaseConnection()

{
	boolean boolStatus=false;
	Connection conn=null;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521XE","system","tiger");
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
