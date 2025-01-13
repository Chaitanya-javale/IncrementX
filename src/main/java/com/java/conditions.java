package com.java;

import java.util.Scanner;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number (1 to 3): ");
        int userNumber = scanner.nextInt();

        // Use switch statement to perform different actions based on the number
        switch (userNumber) {
            case 1:
                System.out.println("You selected one.");
                break;
            case 2:
                System.out.println("You selected two.");
                break;
            case 3:
                System.out.println("You selected three.");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 3.");
                break;
        }

        scanner.close();
		
	}

}
