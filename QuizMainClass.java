package com.test.javaquiz;

import java.sql.SQLException;
import java.util.Scanner;

public class QuizMainClass {
	public static void main(String [] args) throws SQLException {
		
		char ch;
		do
		{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("");
		System.out.println("Welcome to the Java Quiz");
		System.out.println("");
		System.out.println("Enter the appropriate option");
		System.out.println("");
		System.out.println("1 ➤ Start the Quiz");
		System.out.println("2 ➤ Check the scores for all the students");
		System.out.println("3 ➤ Check the Merit list");
		System.out.println("4 ➤ To check particular record");
		
		
		GradeSystem gs = new GradeSystem();
		ParticularRecord pr = new ParticularRecord();
		
		int num=sc.nextInt(); 
		switch(num) {
		
		case 1 :
				StudentInfo.getStudentInfo();
				break;
		
		case 2: 
				gs.marksheet();
				break;
		
		case 3 : 
				gs.meritlist();
				break;
		case 4 :
				System.out.println("Please enter the name which record you want");
				String name= sc.next();
				pr.getParticularRec(name);
				
				break;
		
			
		default:
				break;
			
			
		}
		
		System.out.println("");
		System.out.println("Do you want to continue??...If yes press Y");
		ch=sc.next().charAt(0);
		
		
		}while(ch=='Y'|| ch=='y');
		
		
	}

}
