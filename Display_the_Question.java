package com.test.javaquiz;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Display_the_Question {
	static int marks;
	public static void displayQuestion() {
		Connection con =null;
		try {
			Scanner sc=new Scanner(System.in);
			ConnectionDemo cDemo=new ConnectionDemo();
			con=cDemo.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from questiontable");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("id "+rs.getInt(1));
				System.out.println("Question "+rs.getString(2));
				System.out.println("Option A "+rs.getString(3));
				System.out.println("Option B "+rs.getString(4));
				System.out.println("Option C "+rs.getString(5));
				System.out.println("Option D " +rs.getString(6));
				System.out.println();
				System.out.println("Enter Your Choice");
				String selectedOption=sc.nextLine();
				
				
				if(rs.getString(3)==selectedOption ) {
					marks++;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
