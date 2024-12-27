package com.autocreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Entity.InventoryName;
import com.java.locator;

public class InventoryCreation {
	public void inventory(WebDriver Driver, InventoryName invetorysiteName) throws InterruptedException {
		
		
		
		//site & app section 
				System.out.println("inv----------------------------------==================");
				Thread.sleep(1000);
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				//inventory
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/ul/li[1]/a[2]")).click();
				Thread.sleep(1000);
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[2]/div[4]/a")).click();
				Thread.sleep(1000);
				
				//Create Inventory for website
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[2]/div/div/input")).sendKeys("chaitanya");
				Thread.sleep(1000);
				Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[2]/div/div/ul/li/a")).click();
				Thread.sleep(1000);
				
				WebElement nameField = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[1]/div[3]/div[8]/div/input[1]"));
				Thread.sleep(1000);
				String randomWebsiteName = locator.generateRandomWebsiteName();
				
				invetorysiteName.setInventoryName(randomWebsiteName);
				
				String randmsetted = invetorysiteName.getInventoryName();
				
				nameField.sendKeys(randmsetted);
				
				System.out.println("Entered Website Name: " + randmsetted);
				
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
				
	}
}
