package com.java;
import java.util.UUID;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        // Generate a random app name
        String appName = "App_" + UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Random App Name: " + appName);

        // Generate a random bundle ID
        String bundleId = "com.example." + generateRandomString(5) + "." + generateRandomString(5);
        System.out.println("Random Bundle ID: " + bundleId);

        // Generate a random site name
        String siteName = "site_" + generateRandomString(8) + ".com";
        System.out.println("Random Site Name: " + siteName);
    }

    // Helper method to generate a random alphanumeric string of a given length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }
}
