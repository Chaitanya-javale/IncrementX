package com.autocreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Scanner;
import java.util.UUID;

import com.Entity.InventoryName;
import com.java.locator;


public class InventoryCreation {
	
	private int userNumber;
	private String env;
	
	public void inventory(WebDriver Driver, InventoryName invobject) throws InterruptedException {
		
		//Site & app Section
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		//inventory
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/ul/li[1]/a[2]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[2]/div[4]/a")).click();
		Thread.sleep(1000);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("banner -> 1");
		System.out.println("VAST -> 2");
		System.out.println("S2S -> 3"
				+ "\n=========================================");
		System.out.print("Enter a number (1 to 3): ");
		userNumber = scanner.nextInt();
		
		
		switch (userNumber) {
        case 1:
        	System.out.print("You Entered no. 1 -> Banner"
        			+ "\n=========================================");
			Thread.sleep(1000);

			
			//Create Inventory for website
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[2]/div/div/input")).sendKeys("chaitanya");
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[2]/div/div/ul/li/a")).click();
			Thread.sleep(1000);
			
			WebElement nameField = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[8]/div/input[1]"));
			Thread.sleep(1000);
			String randomWebsiteName = locator.generateRandomWebsiteName();
			
			invobject.setInventoryName(randomWebsiteName);
			
			String randmsetted = invobject.getInventoryName();
			
			nameField.sendKeys(randmsetted);
			
			System.out.println("\nEntered Website Name: " + randmsetted);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[9]/div[1]/input[1]")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[1]/span/span[2]/input")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[2]/span/span[2]/input")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[3]/span/span[2]/input")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[17]/div/div/ul/li/input")).sendKeys("english");
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[17]/div/div/div/ul/li/ul/li/div")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[23]/div/select")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[23]/div/select/option[2]")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[27]/div[4]/div/input")).sendKeys("ingenious");
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[27]/div[4]/div/div[1]/div[3]/span/input")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[36]/div[3]/div/button")).click();
			Thread.sleep(5000);
			
			//System.out.println(Driver.findElement(By.cssSelector("#errmsg")));
			
			//Edit Inventory 
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/table/tbody/tr[1]/td[11]/div/a/img")).click();
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/table/tbody/tr[1]/td[11]/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/div[1]/div[1]/div[30]/div/label/input")).click();
			Thread.sleep(2000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/div[1]/div[3]/div[3]/div/textarea")).sendKeys("Hostname validation off");
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/div[1]/div[5]/button[1]")).click();
			Thread.sleep(5000);
            break;
        case 2:
 
			
			//Create Inventory for VAST\
        	System.out.println("You Entered no. 2 -> VAST"
        			+ "\n=========================================");
			Thread.sleep(1000);
			//client
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[2]/div/div/label[3]/input")).click();
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[2]/div/div/input")).sendKeys("chaitanya");
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[2]/div/div/ul/li/a")).click();
			
			
			Driver.findElement(By.id("vast_env")).click();
			
			//enter environment
			System.out.println("=========== Please enter Environment ===========");
			System.out.println("Video ");
			System.out.println("CTV "
					+ "\n=========================================");
			System.out.print("Enter a Environment here: ");
			env = scanner.next();
			
			 
			 
			if (env.equals("Video")) {
				
			
		        	System.out.println("\nVAST code is executed.");
		            
		        	
		        		//Environment
		        	    Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[7]/div[1]/select/option[2]")).click();
		        	    Thread.sleep(1000);
		        	
		        	    //website name
						WebElement nameField1 = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[8]/div/input[1]"));
						Thread.sleep(1000);
						String randomWebsiteName1 = locator.generateRandomWebsiteName();
						invobject.setInventoryName(randomWebsiteName1);
						String randmsetted1 = invobject.getInventoryName();
						nameField1.sendKeys(randmsetted1);
						System.out.println("Entered Website Name: " + randmsetted1);
						
						//visibilty
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[9]/div[1]/input[1]")).click();
						Thread.sleep(1000);
						
						//category
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[1]/span/span[2]/input")).click();
						Thread.sleep(1000);
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[2]/span/span[2]/input")).click();
						Thread.sleep(1000);
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[3]/span/span[2]/input")).click();
						Thread.sleep(1000);
						
						//language
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[17]/div/div/ul/li/input")).sendKeys("english");
						Thread.sleep(1000);
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[17]/div/div/div/ul/li/ul/li/div")).click();
						Thread.sleep(1000);
						
						//Status
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[23]/div/select")).click();
						Thread.sleep(1000);
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[23]/div/select/option[2]")).click();
						Thread.sleep(1000);
						
						//Demand partner
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[27]/div[4]/div/input")).sendKeys("ingenious");
						Thread.sleep(1000);
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[27]/div[4]/div/div[1]/div[2]/span/input")).click();
						Thread.sleep(1000);
						
						//submit
						Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[36]/div[1]/div/button")).click();
						Thread.sleep(5000);
			}
			else if(env.equals("CTV")){
				
					
		        	System.out.println(" \nMobile App / CTV environment code is executed.");
		        	
		        	//Environment
	        	    Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[7]/div[1]/select/option[3]")).click();
	        	    Thread.sleep(1000);
	        	    
		            // Your CTV-specific code here
		            String appName = "App_" + UUID.randomUUID().toString().substring(0, 8);
		            System.out.println("Random App Name: " + appName);
		            
		            String bundleId = "com.example." + locator.generateRandomString(5) + "." + locator.generateRandomString(5);
		            System.out.println("Random Bundle ID: " + bundleId);
		            
		            
		            //App name
		            Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[7]/div[2]/div/input")).sendKeys(appName);
					Thread.sleep(1000);
		            
					//Bundle ID
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[7]/div[3]/div/input")).sendKeys(bundleId);
					Thread.sleep(1000);
					
					//Site name
					WebElement nameField1 = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[7]/div[4]/div/input[1]"));
					Thread.sleep(1000);
					String randomWebsiteName1 = locator.generateRandomWebsiteName();
					invobject.setInventoryName(randomWebsiteName1);
					String randmsetted1 = invobject.getInventoryName();
					nameField1.sendKeys(randmsetted1);
					System.out.println("Random Site name: " + randmsetted1);
		            
					//visibilty
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[9]/div[1]/input[1]")).click();
					Thread.sleep(1000);
					
					//category
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[1]/span/span[2]/input")).click();
					Thread.sleep(1000);
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[2]/span/span[2]/input")).click();
					Thread.sleep(1000);
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[16]/div/div[1]/div/div[3]/span/span[2]/input")).click();
					Thread.sleep(1000);
					
					//language
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[17]/div/div/ul/li/input")).sendKeys("english");
					Thread.sleep(1000);
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[17]/div/div/div/ul/li/ul/li/div")).click();
					Thread.sleep(1000);
					
					//Status
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[23]/div/select")).click();
					Thread.sleep(1000);
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[23]/div/select/option[2]")).click();
					Thread.sleep(1000);
					
					//Demand partner
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[27]/div[4]/div/input")).sendKeys("ingenious");
					Thread.sleep(1000);
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[27]/div[4]/div/div[1]/div[2]/span/input")).click();
					Thread.sleep(1000);
					
					//submit
					Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[36]/div[1]/div/button")).click();
					Thread.sleep(5000);
		        	
			 }
			else {
				
	            System.out.println("Invalid input.");
	        }
			scanner.close();
			
		
			
			//Edit Inventory 
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/table/tbody/tr[1]/td[11]/div/a/img")).click();
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/table/tbody/tr[1]/td[11]/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
			
			//host off button
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/div[1]/div[1]/div[30]/div/label/input")).click();
			Thread.sleep(2000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/div[1]/div[3]/div[3]/div/textarea")).sendKeys("Hostname validation off");
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/div[1]/div[5]/button[1]")).click();
			Thread.sleep(5000);
            break;
        case 3:
            System.out.println("You selected three."
            		+ "\n=========================================");
            break;
        default:
            System.out.println("Invalid number. Please enter a number between 1 and 3."
            		+ "\n=========================================");
            break;
    }
		scanner.close();
			
	}
	
	 public int getuserNumber(){
	        return userNumber;
	    }
	 public String getenv(){
	        return env;
	    }
	
}
