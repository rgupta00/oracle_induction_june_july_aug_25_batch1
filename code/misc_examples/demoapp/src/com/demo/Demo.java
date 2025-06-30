package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // change if using PDB
		String user = "hr";
		String password = "hr";

		try {
			// Load Oracle JDBC Driver (optional in modern Java)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Establish the connection
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("✅ Connected to Oracle HR schema");

			// Query the employees table
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT first_name, last_name FROM employees");

			// Print result
			while (rs.next()) {
				System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
			}

			// Cleanup
			rs.close();
			stmt.close();
			conn.close();
			System.out.println("✅ Connection closed.");

		} catch (Exception e) {
			System.err.println("❌ Connection failed:");
			e.printStackTrace();
		}
	}
}
