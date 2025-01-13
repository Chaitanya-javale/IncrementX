package com.autocreation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Entity.InventoryName;


public class AdunitCreation {
	public void CreateAdunit(WebDriver Driver, WebDriverWait wait, InventoryName invetorysiteName, InventoryCreation inventory) throws InterruptedException {

		Thread.sleep(6000);
		
		//list ad unit
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/ul/li[2]/a[2]")).click();
		Thread.sleep(5000);
		//click new ad unit
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[2]/div[4]/a")).click();
		Thread.sleep(5000);
		
		//client
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[1]/div/div/input")).sendKeys("chaitanya");
		Thread.sleep(1000);
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		
		//select website
		WebElement nameField1 = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[3]/div/div/input"));
		Thread.sleep(1000);
		String randomString = invetorysiteName.getInventoryName();
		nameField1.sendKeys(randomString);
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[3]/div/div/ul/li/a")).click();
		
		
		int selection = inventory.getuserNumber();
		
		switch (selection) {
        case 1:
            System.out.println("Create Banner ad unit"
            		+ "\n=========================================");
          //product type
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[6]/div/select")).click();
    		Thread.sleep(1000);
    		
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[6]/div/select/option[2]")).click();
    		Thread.sleep(1000);

    		// backup ad
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[1]/div[1]/input")).click();
    		Thread.sleep(1000);

    		// auto refresh
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/input")).clear();
    		Thread.sleep(1000);
    		System.out.println(Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/div/span")).getText());
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/input")).sendKeys("10");
    		Thread.sleep(1000);
    		System.out.println(Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/div/span")).getText());
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/input")).clear();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/input")).sendKeys("40.20");
    		Thread.sleep(1000);
    		System.out.println(Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/div/span")).getText());
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/input")).clear();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[2]/div[3]/input")).sendKeys("40");

    		// tag management
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[4]/div[1]/input")).click();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[4]/div[2]/input")).sendKeys("0");
    		Thread.sleep(1000);
    		System.out.println(Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[4]/div[2]/input")).getText());
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[10]/div/a")).click();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[4]/div[2]/input")).sendKeys("21");
    		Thread.sleep(1000);
    		System.out.println(Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[4]/div[2]/input")).getText());
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[10]/div/a")).click();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[4]/div[2]/input")).sendKeys("1");
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/div[1]/div[1]/div[4]/div[3]/input")).click();
    		
    		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[5]/ul/li[1]/input")));
    		((JavascriptExecutor) Driver).executeScript("arguments[0].scrollIntoView(true);", element);
    		wait.until(ExpectedConditions.elementToBeClickable(element));
    		((JavascriptExecutor) Driver).executeScript("arguments[0].click();", element);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[6]/div[11]/button")).click();
    		Thread.sleep(1000);
            break;
        case 2:
            System.out.println("VAST ad unit Creation starts."
            		+ "\n=========================================");
            
            //product type
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[6]/div/select")).click();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[6]/div/select/option[2]")).click();
    		Thread.sleep(1000);
    		
    		//select vast version
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[1]/div[2]/ul/li[2]/a")).click();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[1]/div[2]/ul/li[2]/input")).click();
    		Thread.sleep(1000);
    		

    		// tag management
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[1]/div[2]/div[3]/div[1]/div/div/div[1]/input")).click();
    		Thread.sleep(1000);
    		//quantity
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/input")).sendKeys("1");
    		Thread.sleep(1000);
    		//submit button
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div/div/div[11]/div[1]/div[5]/button")).click();
    		
    	
    		
            break;
        case 3:
            System.out.println("S2S ad unit created."
            		+ "\n=========================================");
            // Code to create S2S ad unit
            break;
	        default:
	            System.out.println("Invalid inventory selection."
	            		+ "\n=========================================");
	            break;
      }
		
	}

}
