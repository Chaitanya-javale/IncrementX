package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class DynamicWebsiteNameAutomation {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the webpage
            driver.get("http://yourwebsite.com"); // Replace with your website URL

            // Maximize the browser window
            driver.manage().window().maximize();

            // Locate the name field (adjust the locator as needed)
            WebElement nameField = driver.findElement(By.id("nameFieldId")); // Replace with the correct locator

            // Generate a random website name
            String randomWebsiteName = generateRandomWebsiteName();

            // Enter the random website name into the field
            nameField.sendKeys(randomWebsiteName);

            // Optionally, submit the form or perform other actions
            // WebElement submitButton = driver.findElement(By.ID("submitButtonId"));
            // submitButton.click();

            // Print the random name entered
            System.out.println("Entered Website Name: " + randomWebsiteName);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Method to generate a random website name
    public static String generateRandomWebsiteName() {
        String[] adjectives = {"Fast", "Amazing", "Secure", "Reliable", "Dynamic"};
        String[] nouns = {"Tech", "Cloud", "Site", "Hub", "Portal"};
        String domain = ".com";

        Random random = new Random();
        String adjective = adjectives[random.nextInt(adjectives.length)];
        String noun = nouns[random.nextInt(nouns.length)];

        return adjective + noun + domain;
    }
}
