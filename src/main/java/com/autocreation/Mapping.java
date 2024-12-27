package com.autocreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Entity.InventoryName;

public class Mapping {
	
		String js = "<a href=\"https://www.connectreseller.com\"><img src=\"https://creative.incrementxserv.com/creative_300x250.jpg\"  width=\"300\" height=\"250\"></a>";
		
		public void OptMapping(WebDriver Driver, WebDriverWait wait, InventoryName invetorysiteName) throws InterruptedException {
			
			Thread.sleep(5000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a/span")).click();
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/ul/li[1]/a[2]")).click();
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div[1]/div[5]/div/table/tbody/tr[1]/td[13]/div/a/img")).click();
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div[1]/div[5]/div/table/tbody/tr[1]/td[13]/div/ul/li[2]/a")).click();
			Thread.sleep(1000);
			
			
			//Edit mapping add remoteJS
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[2]/div[1]/span[4]/input")).click();
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[4]/div/div[2]/div/div/div[3]/div[1]/select")).click();
			Thread.sleep(1000);
			
			//Vertoz-House-Ad partner
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[4]/div/div[2]/div/div/div[3]/div[1]/select/option[128]")).click();
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[4]/div/div[2]/div/div/div[4]/div/div/div/input")).sendKeys(js);
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[6]/div[1]/div/div[2]/div/div/div[8]/div[1]/div/textarea")).sendKeys("test");
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[3]/div[7]/button[1]")).click();
			Thread.sleep(1000);
			
		}
}
