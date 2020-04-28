package com.AccountCreation.DAO;
import java.sql.*;

public class ConnectionDAO 
{

	static Connection con;
	public static Connection dbConnection()
	{
		
		try
		{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","{username}","{project}");
	
		}
		catch(ClassNotFoundException es)
			{
			  System.out.print("error in Driver " +es.toString());
			}
		catch(SQLException ess)
		{
			  System.out.print("error in   Connection " +ess.toString());
		}
		
 return con; 
		
	 }
	
	
	
	
	
	
	
	

}

