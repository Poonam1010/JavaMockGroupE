package com.test.javaquiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentInfo {
	
	
	public static void getStudentInfo() throws SQLException {
		Connection con =null;
		PreparedStatement ps =null;
		try{
			Student stud = new Student();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Please Enter Your First Name");
			String firstName = sc.next();
			
			System.out.println("Please Enter Your Last Name");
			String lastName = sc.next();
			
			System.out.println("Please Enter Your Contact");
			String contact = sc.next();
			
			System.out.println("Please Enter Your Email Address");
			String email = sc.next();
			
			System.out.println("Please Enter Your City");
			String city = sc.next();
			
			
			//Setting the values by using setter
			
			
			stud.setFirstName(firstName);
			stud.setLastName(lastName);
			stud.setContact(contact);
			stud.setEmail(email);
			stud.setCity(city);
			
			
			ConnectionDemo cDemo=new ConnectionDemo();
			con=cDemo.getConnection();
			ps = con.prepareStatement("insert into studentinfo(firstName,lastName,contact,email,city)values(?,?,?,?,?)");
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, contact);
			ps.setString(4, email);
			ps.setString(5, city);
			
			int i=ps.executeUpdate();
			
			System.out.println("Thank you for registration. You are ready to go...........");
			System.out.println("");
			
			quizquestions.displayQuestion(firstName);
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				con.close();
				ps.close();
			}
		
	}
	/*
	 * public static void main(String[] args) throws SQLException { Scanner sc=new
	 * Scanner(System.in); System.out.println("Welcome to Quize");
	 * System.out.println("Please Enter Your Name"); String studentName=sc.next();
	 * getStudentInfo(studentName); //Display_the_Question.displayQuestion();
	 * //Question_Answers2.getQuestions(); //Trial.displayQuestion(); sc.close(); }
	 */

}
