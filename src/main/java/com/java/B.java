package com.java;

public class B {
    // Method to execute based on Class A's selection
    public void executeBasedOnSelection(int user) {
        switch (user) {
            case 1:
                System.out.println("Executing dependent code for case 1 in Class B.");
                break;
            case 2:
                System.out.println("Executing dependent code for case 2 in Class B.");
                break;
            case 3:
                System.out.println("Executing dependent code for case 3 in Class B.");
                break;
            default:
                System.out.println("No dependent code for invalid selection.");
                break;
        }
    }
}

