package com.test.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class quizquestions {
	static int marks;
	public static void displayQuestion(String firstName) throws SQLException {
		Connection con =null;
		PreparedStatement ps = null;
		try {
			
			String fName = firstName;
			Scanner sc=new Scanner(System.in);
			ConnectionDemo cDemo=new ConnectionDemo();
			con=cDemo.getConnection();
			//PreparedStatement ps = con.prepareStatement("select * from questiontable");
			ps = con.prepareStatement("SELECT * FROM questiontable ORDER BY RAND();");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				//System.out.println("id "+rs.getInt(1));
				System.out.println("Question "+rs.getString(2));
				System.out.println("Option A "+rs.getString(4));
				System.out.println("Option B "+rs.getString(5));
				System.out.println("Option C "+rs.getString(6));
				System.out.println("Option D " +rs.getString(7));
				System.out.println();
				System.out.println("Enter Your Choice");
				String selectedOption=sc.nextLine();
				
				
				if(rs.getString(3).equalsIgnoreCase(selectedOption) ) {
					marks++;
				}
			
			}
			
			System.out.println("Obtained marks are "+marks);
			
			quizquestions.insertmarks(marks, fName);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			con.close();
			ps.close();
		}
	}
	
	public static void insertmarks(int marks, String fName) throws SQLException
	{
		Connection con =null;
		PreparedStatement ps = null;
		try {
		
			ConnectionDemo cDemo=new ConnectionDemo();
			con=cDemo.getConnection();
			
			//Student stud = new Student();
			//String firstName=stud.getFirstName();
			
			String grade;
			
			if(marks>=8)
				grade="A";
			else if(marks>=6 && marks<=7)
				grade="B";
			else if(marks==5)
				grade="C";
			else
				grade="FAIL";
			
			
			
			ps=con.prepareStatement("insert into markstable(firstName,marks,grade)values(?,?,?)");
			ps.setString(1, fName);
			ps.setInt(2, marks);
			ps.setString(3, grade);
			ps.executeUpdate();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
			ps.close();
		}
		
		
	}
	
	
	
	
	
	}


