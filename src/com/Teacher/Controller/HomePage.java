package com.Teacher.Controller;

import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Personal Data");
		System.out.println("5. Show All Data");
		System.out.println("6.LogOut");
		System.out.println("7. Admin Login ");
		
		System.out.println("---Enter Your Choice : ---");
		
		int key = sc.nextInt();
		
		switch (key) {
		
		case 1: {
			System.out.println("Register:");
			TeacherController.main(args);
			break;
		}
		
		case 2: {
			System.out.println("Login:");
			LoginController.main(args);
			break;
		}
		
		case 3: {
			System.out.println("Register:");
			ForgetController.main(args);
			break;
		}
		
		case 4: {
			System.out.println("Register:");
			PersonalController.main(args);
			break;
		}
		
		case 5: {
			System.out.println("Register:");
			ShowController.main(args);
			break;
		}
		
		case 6: {
			System.out.println("Register:");
			LogOutController.main(args);
			break;
		}
		
		case 7: {
			System.out.println("Admin Login :");
			AdminController.main(args);
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

}
