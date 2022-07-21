package com.createiq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Update {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement= null;
		ResultSet rs= null;
		
		
		try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		 connection   = DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
		statement = connection.createStatement();
		 String sql = "update employee set ename = 'sai' WHERE eid  101";
		 statement.executeUpdate(sql);

		        rs = statement.executeQuery("select * from employee");
		         while(rs.next()){
		            //Display values
		            System.out.println("ID: " + rs.getInt("id"));
		            System.out.println(" Age: " + rs.getInt("age"));
		            System.out.println(" First: " + rs.getString("first"));
		            System.out.println(" Last: " + rs.getString("last"));
		         }
		     //    rs.close();
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }finally {
		    	  try {
		    		  statement.close();
		    		  connection.close();
		    		  
		    	  }
		    	  catch (SQLException e) {
				         e.printStackTrace();
		    	  
		    		  
		    	  }
		      }
		   }
	
		
	}


