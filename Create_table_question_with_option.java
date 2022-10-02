package com.test.javaquiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create_table_question_with_option {
	public void addQuestion() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			ConnectionDemo cDemo=new ConnectionDemo();
			con=cDemo.getConnection();
			 
			 ps = con.prepareStatement("insert into questiontable (questions,answers,option1,option2,option3)values(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?),(?,?,?,?,?)");
			 ps.setString(1,"Who invented Java Programming?");
			 ps.setString(2, "James Gosling");
			 ps.setString(3,"Guido van Rossum" );
			 ps.setString(4,"Dennis Ritchie" );
			 ps.setString(5, "Bjarne Stroustrup");
			 ps.setString(6, "Which component is used to compile, debug and execute the java programs?");
			 ps.setString(7, "JDK");
			 ps.setString(8,"JRE" );
			 ps.setString(9,"JIT" );
			 ps.setString(10, "JVM");
			 ps.setString(11, "Which one of the following is not a Java feature?");
			 ps.setString(12, "Use of pointers");
			 ps.setString(13,"Object-oriented" );
			 ps.setString(14,"Portable" );
			 ps.setString(15, "Dynamic and Extensible");
			 ps.setString(16,"Which of these cannot be used for a variable name in Java?");
			 ps.setString(17, "keyword");
			 ps.setString(18,"identifier & keyword" );
			 ps.setString(19, "identifier");
			 ps.setString(20,"none of the mentioned" );
			 ps.setString(21, "What is the extension of java code files?");
			 ps.setString(22, ".java");
			 ps.setString(23,".js" ); 
			 ps.setString(24,".Class" );
			 ps.setString(25, ".txt");
			 ps.setString(26, "Which environment variable is used to set the java path?");
			 ps.setString(27, "JAVA_HOME");
			 ps.setString(28,"MAVEN_Path" );
			 ps.setString(29,"JavaPATH" );
			 ps.setString(30, "JAVA");
			 ps.setString(31, "Which of the following is not an OOPS concept in Java?");
			 ps.setString(32, "Compilation");
			 ps.setString(33,"Encapsulation" );
			 ps.setString(34,"Abstraction" );
			 ps.setString(35, "Inheritance");
			 ps.setString(36, "What is the extension of compiled java classes?");
			 ps.setString(37, ".class");
			 ps.setString(38,".java" );
			 ps.setString(39,".js" );
			 ps.setString(40, ".txt");
			 ps.setString(41, "Which of these are selection statements in Java?");
			 ps.setString(42, "if()");
			 ps.setString(43,"break" );
			 ps.setString(44,"continue" );
			 ps.setString(45, "for()");
			 ps.setString(46, "Which of the following is a superclass of every class in Java?");
			 ps.setString(47, "Object class");
			 ps.setString(48,"ArrayList" );
			 ps.setString(49, "Abstract class");
			 ps.setString(50,"String" );
			 
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
