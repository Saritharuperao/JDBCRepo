package com.createiq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery {
	public static void main(String[] args) {
		
		 Connection connection = null;
	        Statement statement = null;
	        ResultSet rs = null;
	        try {
	            Driver driver = new Driver();
	            DriverManager.registerDriver(driver);
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
           System.out.println(connection);
	            statement = connection.createStatement();
	            rs = statement.executeQuery("select * from employee");
	            while (rs.next()) {
	                System.out.println(rs.getInt(1));
	                System.out.println(rs.getString(2));
	                System.out.println(rs.getDouble(3));
	                System.out.println(rs.getString(4));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                rs.close();
	                statement.close();
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

	        }
	}}
