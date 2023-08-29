package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementsEx {

	public static void main(String[] args) {
		final String url = "jdbc:mysql:///tejas";
		final String userName = "root";
		final String password = "#MESSi010";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // instantiate the driver 
			System.out.println("driver class found");
			Connection conn = DriverManager.getConnection(url, userName, password );
			/*
//		---retriving from the Statement 	
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			
			while(rs.next()){
	//			int id = rs.getInt(1);
	//			String name = rs.getString(2);
	//			System.out.println(id+ "  "+name);
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
			}
			st.close();
		*/
		
		/*
//		---for the update query using the statement...
			Statement st = conn.createStatement();
			String sql= "Update employee set Ename='re-name' where Eid=2";
			
			int count= st.executeUpdate(sql);
			System.out.println("count "+ count);
			
			ResultSet rs = st.executeQuery("select * from employee");
					
					
			while(rs.next()){
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
			}
			st.close();
			*/
			
//		---insert using the statement...
		/*	
			Statement st = conn.createStatement();
			String sql= "insert into employee value(5,'swathi')";
			st.executeUpdate(sql);
			
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next()){
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
			}
			st.close();
		*/	
			
//   ---creating table and deleting a record from the table using the statement...
	/*		
			Statement st = conn.createStatement();
//			String sql= "CREATE TABLE `tejas`.`student` (`Sid` INT NOT NULL,`Sname` VARCHAR(45) NOT NULL,  PRIMARY KEY (`Sid`));";
//			st.executeUpdate(sql);
			
		//	String sql2= "insert into student value(1,'swathi')";
		//	st.executeUpdate(sql2);

			String sql3= "delete from student where Sid=2";
			st.executeUpdate(sql3);
			
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next()){
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
			}
			st.close();
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
