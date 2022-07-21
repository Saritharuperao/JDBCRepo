package com.createiq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Insert {
public static void main(String[] args) throws SQLException {
	String insertQuery = " insert into employee values(100, 'balu', 32000.00, 'balu@gmail.com')";
Driver driver = new Driver();
DriverManager.registerDriver(driver);
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
System.out.println(connection);
Statement statement = connection.createStatement();
// execute query
int result = statement.executeUpdate(insertQuery);
System.out.println("inserted " + result + " row successfully...!");
statement.close();
connection.close();


}
}
