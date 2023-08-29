package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerEx {

	

	public static void main(String[] args) {
		final String url = "jdbc:mysql:///tejas";
		final String userName = "root";
		final String password = "#MESSi010";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // instantiate the driver 
			System.out.println("driver class found");
			Connection conn = DriverManager.getConnection(url, userName, password );
			System.out.println("done "+ conn); //
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	} // end of psvm
} /// end of class
