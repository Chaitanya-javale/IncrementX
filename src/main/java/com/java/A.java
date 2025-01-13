package com.java;

import java.util.Scanner;

public class A {
    // Instance variable to store user selection
    private int user;

    // Method to get user input and execute switch case
    public void getUserSelection() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 3): ");
        user = scanner.nextInt();

        switch (user) {
            case 1:
                System.out.println("Case 1 executed in Class A.");
                break;
            case 2:
                System.out.println("Case 2 executed in Class A.");
                break;
            case 3:
                System.out.println("Case 3 executed in Class A.");
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
        scanner.close();
    }

    // Getter to provide access to userSelection
    public int getUserSelectionValue() {
        return user;
    }
}

