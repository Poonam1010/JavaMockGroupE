package com.test.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParticularRecord {
	
	int flag=0;
	
	public void getParticularRec(String name) throws SQLException {
		
		
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		
		try {
			
			
			ConnectionDemo cDemo=new ConnectionDemo();
			con=cDemo.getConnection();
			ps = con.prepareStatement("select *from studentinfo");
			rs = ps.executeQuery();
			while(rs.next())
			{
					if(name.equalsIgnoreCase(rs.getString(2)))
					{
						flag=0;
						try
						{
							cDemo=new ConnectionDemo();
							con=cDemo.getConnection();
							ps = con.prepareStatement("select studentinfo.id, studentinfo.firstName, studentinfo.lastName, studentinfo.contact, \r\n"
									+ "studentinfo.email, studentinfo.city, markstable.marks, markstable.grade from\r\n"
									+ "studentinfo inner join markstable\r\n"
									+ "on studentinfo.firstname = markstable.firstname where markstable.firstName=?");
							ps.setString(1, name);
						
							rs = ps.executeQuery();
							
							while(rs.next())
								{
									
										System.out.println("");
										System.out.println("Student ID: "+rs.getInt(1)); 
										System.out.println("Student Name: "+rs.getString(2)+" "+rs.getString(3));
										//System.out.println(rs.getString(3)); 
										System.out.println("Contact Number: "+rs.getString(4));
										System.out.println("Email Address: "+rs.getString(5)); 
										System.out.println("City: "+rs.getString(6));
										System.out.println("Marks: "+rs.getInt(7));
										System.out.println("Grade: "+rs.getString(8));
									
								}
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						
					}
					
					else
					{
						flag=1;
					}	
				
					//System.out.println("Student Name: "+rs.getString(2));
					
			}
			
			if(flag==1)
			{
				System.out.println("");
				System.out.println("Student not found. Please choose the option again and enter a valid student.");
			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			
			con.close();
			ps.close();
			rs.close();
		}
		
		
		
	}

}
