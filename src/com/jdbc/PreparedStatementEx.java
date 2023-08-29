package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) {
		final String url = "jdbc:mysql:///tejas";
		final String userName = "root";
		final String password = "#MESSi010";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // instantiate the driver 
			System.out.println("driver class found");
			Connection conn = DriverManager.getConnection(url, userName, password );
			
//			using the prepared statement...
			/*
			int id=1;
			 
			String sql = "select * from employee where Eid=? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setInt(1, id); 			//setting the value for which we need to lookup...
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("the name is "+ rs.getString(2));
			}
			pst.close();
		
			*/
			/*
//			using the prepared statement for the updating the record...
			int id=2;
			
			String sql = "update employee set Ename='sonam' where Eid =? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setInt(1, id);
			pst.executeUpdate();
			ResultSet rs = pst.executeQuery("select * from employee");
			while(rs.next()){
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
			}
			pst.close();
			*/
			/*	
// 		 ---inserting into DB using the prepared statements...
			String name="utkarsh";
			int id=6;
			
			String sql = "insert into employee values (?,?)";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, 6);
			pst.setString(2, "utkarsh");
			pst.executeUpdate();
			
			ResultSet rs = pst.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " +rs.getString(2) );
			}
			pst.close();
		*/
		/*	
//  	---Deleting from the table using the PreparedStatement...
			String sql = "delete from employee where Eid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setInt(1, 5);
			pst.executeUpdate();
			ResultSet rs = pst.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString(2));
			}
			pst.close();
			*/
			/*
//		---Creating a table using a Prepared Statement...
			String create_table = "create table demoPStable ("
									+ " demoID int,"
									+ " demoNAME varchar(40))";
			PreparedStatement pst = conn.prepareStatement(create_table);
			pst.execute();			
			
			pst.close();
			*/
			
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	

	}

}
