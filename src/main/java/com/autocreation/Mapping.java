package com.autocreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Entity.InventoryName;

public class Mapping {
	
		String js = "<a href=\"https://www.connectreseller.com\"><img src=\"https://creative.incrementxserv.com/creative_300x250.jpg\"  width=\"300\" height=\"250\"></a>";
		String vastjs = "https://assets.incrementxserv.com/streax.xml";
		public void OptMapping(WebDriver Driver, WebDriverWait wait, InventoryName invetorysiteName, InventoryCreation inventory) throws InterruptedException {
			
			Thread.sleep(5000);
			//mapping section
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a/span")).click();
			Thread.sleep(1000);
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/ul/li[1]/a[2]")).click();
			Thread.sleep(1000);
			
			//click on action button
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div[1]/div[5]/div/table/tbody/tr[1]/td[13]/div/a/img")).click();
			Thread.sleep(1000);
			//click on edit button
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div[1]/div[5]/div/table/tbody/tr[1]/td[13]/div/ul/li[2]/a")).click();
			Thread.sleep(1000);
			
			int selection1 = inventory.getuserNumber();
			
			switch (selection1) {
	        case 1:
	        	//click remoteJS option
	        	System.out.println("banner mapping start"
	        			+ "\n=========================================");
	        	Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[2]/div[1]/span[4]/input")).click();
				Thread.sleep(1000);
				
				//demand partner JS
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[4]/div/div[2]/div/div/div[3]/div[1]/select")).click();
				Thread.sleep(1000);
				
				//Vertoz-In-House-ads partner
				Driver.findElement(By.xpath("//option[@value='81']")).click();
				Thread.sleep(1000);
				
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[4]/div/div[2]/div/div/div[4]/div/div/div/input")).sendKeys(js);
				Thread.sleep(1000);
				
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[1]/div/div[2]/div/div/div[8]/div[1]/div/textarea")).sendKeys("test");
				Thread.sleep(1000);
				
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[7]/button[1]")).click();
				Thread.sleep(1000);
	        	break;
	        	
	        case 2:
	        	System.out.println("VAST mapping start"
	        			+ "\n=========================================");
	        	//click remoteJS option
	        	Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[2]/div[1]/span[4]/input")).click();
				Thread.sleep(1000);
				
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[4]/div/div[2]/div/div/div[3]/div[1]/select")).click();
				Thread.sleep(1000);
				
				////Vertoz-In-House VAST partner
				Driver.findElement(By.xpath("//option[@value='1014']")).click();
				Thread.sleep(1000);
				
				//vast creative
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[4]/div/div[2]/div/div/div[4]/div/div/div/input")).sendKeys(vastjs);
				Thread.sleep(1000);
				
				//comment
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[1]/div/div[2]/div/div/div[8]/div[1]/div/textarea")).sendKeys("test");
				Thread.sleep(1000);
				
				//submit
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[7]/button[1]")).click();
				Thread.sleep(1000);
	        	break;
	        
	        default:
	            System.out.println("Invalid mapping selection."
	            		+ "n=========================================");
	            break;
			}
			
		}
}
