package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {
			// Store the database URL in a string
			String serverName = "localhost";
			String portNumber = "3306";
			String sid = "userdb";
			String dbUrl = "jdbc:mysql://" + serverName + "/" + sid;
			try {
			Class.forName("com.mysql.jdbc.Driver");
			// set the url, username and password for the database
			connection = DriverManager.getConnection(dbUrl, "system", "system");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}