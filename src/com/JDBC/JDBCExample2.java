package com.JDBC;
/* Install Oracle DB and run the test case
 * Create a Connection

 * Create a query/statement
 * Execute Statement/Query
 * Close Conneciton
 * 
 */
//Add jdbc client driver to the project and connect to server to run the code

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample2 {
	public static void main(String[] args) throws SQLException {
		
		//Connecte
		Connection con = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521/pdborc1","hr","hr");
		//Create a query
		Statement stmt = con.createStatement();
		//String s = "insert into student values(105, 'john')";
		
		// Execute statement
		stmt.executeQuery(s);
		//close connection
		con.close();
		
		
		String s = "select * from employees";
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next())
		{
			int eid = rs.getInt("EMPLOYEE_ID");
			String fname = rs.getString("FIRST_NAME");
			String lname = rs.getString("LAST_NAME");
			System.out.println(eid + " " + fname + " " + lname);
		}
		
		System.out.println("Program completed");
		
		
	}

}
