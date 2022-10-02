package com.test.javaquiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
	
		Connection connection=null;
		 public static final String JDBC_DRIVER="com.mysql.jdbc.Driver"; 
		 public static final String URL="jdbc:mysql://localhost:3306/javaquiz";
		 public static final String USER="root";
		 public static final String PASS="Poonam@1010";
		 public Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			connection=DriverManager.getConnection(URL, USER, PASS);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection; 
	}

}
