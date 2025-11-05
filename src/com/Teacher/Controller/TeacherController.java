package com.Teacher.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Teacher.DAO.TeacherDAO;
import com.Teacher.bean.Teacher;

public class TeacherController {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Teacher t = new Teacher();
		
		
		System.out.println("Enter a ID : ");
		t.setId(sc.nextInt());
		
		System.out.println("Enter the Name :");
		t.setName(sc.next());
		
		System.out.println("Enter the City :");
		t.setCity(sc.next());
		
		System.out.println("Enter the College :");
		t.setCollege(sc.next());
		
		System.out.println("Enter the Age :");
		t.setAge(sc.nextInt());
		
		System.out.println("Enter the Email :");
		t.setEmail(sc.next());
		
		System.out.println("Enter the Password :");
		t.setPassword(sc.next());
		
		System.out.println("Enter the Gender :");
		t.setGender(sc.next());
		
		System.out.println("Enter the BloodGroup :");
		t.setBloodgroup(sc.next());
		
		System.out.println("Enter the Contact :");
		t.setContact(sc.next());
		
		
		TeacherDAO td = new TeacherDAO();
		try {
			boolean result = td.insert(t);
			
			{
				if(result==true) {
					
					System.out.println("Data Insert Successfully...");
				}else {
					
					System.out.println("Please try Again...");
				}
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
