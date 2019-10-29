package org.eclipse.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class MyConnection 
{
//	private static String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//	private static String utilisateur = "root";
//	private static String motDePasse = "root";
	private static Connection connexion = null;

	private MyConnection() 
	{

		try 
		{
			//Class.forName("com.mysql.jdbc.Driver");
			connexion = MyDataSourceFactory.getMySQLDataSource().getConnection();
		} 
		catch ( Exception e ) 
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() 
	{
		if (connexion == null) 
		{
			new MyConnection();
		}
		return connexion;
	}
	public static void stop() 
	{
		if (connexion != null) 
		{
			try 
			{
				connexion.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}


}
