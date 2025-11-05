package com.Teacher.Controller;

import java.util.Scanner;

public class AdminHomepage {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Show All Data");
		System.out.println("2. Delete Any Teacher");
		System.out.println("3. Export PDF");
		
		System.out.println("---Enter Your Choice : ---");
		
		int key = sc.nextInt();
		
		switch (key) {
		
		case 1: {
			System.out.println("---Show All Teachers Data---");
			ShowController.main(args);
			break;
		}
		
		case 2 : {
			System.out.println("---Delete Any Teacher Data---");
			LogOutController.main(args);
			break;
		}
		
		case 4 : {
			System.out.println("Register:");
			LogOutController.main(args);
			break;
		}
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

}
