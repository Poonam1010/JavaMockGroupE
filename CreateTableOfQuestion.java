package com.test.javaquiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTableOfQuestion {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pankaj@99");
			 ps = con.prepareStatement("insert into questiontable (questions,answers)values(?,?),(?,?),(?,?),(?,?),(?,?),(?,?),(?,?),(?,?),(?,?),(?,?)");
			 ps.setString(1,"Who invented Java Programming?");
			 ps.setString(2, "James Gosling");
			 ps.setString(3, "Which component is used to compile, debug and execute the java programs?");
			 ps.setString(4, "JDK");
			 ps.setString(5, "Which one of the following is not a Java feature?");
			 ps.setString(6, "Use of pointers");
			 ps.setString(7,"Which of these cannot be used for a variable name in Java?");
			 ps.setString(8, "keyword");
			 ps.setString(9, "What is the extension of java code files?");
			 ps.setString(10, ".java");
			 ps.setString(11, "Which environment variable is used to set the java path?");
			 ps.setString(12, "JAVA_HOME");
			 ps.setString(13, "Which of the following is not an OOPS concept in Java?");
			 ps.setString(14, "Compilation");
			 ps.setString(15, "What is the extension of compiled java classes?");
			 ps.setString(16, ".class");
			 ps.setString(17, "Which of these are selection statements in Java?");
			 ps.setString(18, "if()");
			 ps.setString(19, "Which of the following is a superclass of every class in Java?");
			 ps.setString(20, "Object class");
			 
			 int i=ps.executeUpdate();
			 System.out.println("insertion done "+i);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
			ps.close();
		}
	}

}
