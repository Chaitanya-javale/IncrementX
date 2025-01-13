package com.autocreation;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Entity.InventoryName;


public class PullTag {

	public void GetTag(WebDriver Driver, WebDriverWait wait, InventoryName invetorysiteName, InventoryCreation inventory)
			throws InterruptedException {

		Thread.sleep(5000);

		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);

		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/ul/li[2]/a[2]")).click();
		Thread.sleep(1000);

		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/table/tbody/tr[1]/td[15]/div/a/img")).click();
		Thread.sleep(1000);

		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[4]/div/table/tbody/tr[1]/td[15]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);

		int selection2 = inventory.getuserNumber();
		switch (selection2) {
        case 1:
        	
        	System.out.println("Banner pull tag process start"
        			+ "\n=========================================\n");
        	String copiedValue = null;
    		try {
    			// copy tag from pull tag
    			WebElement copyButton1 = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[7]/div/div[2]/div[9]/div/button"));
    			copyButton1.click();
    			Thread.sleep(1000);

    			Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
    			copiedValue = (String) clipboard1.getData(DataFlavor.stringFlavor);
    		} catch (UnsupportedFlavorException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

    		System.out.println("Copied Value: " + copiedValue);

    		// close button
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[7]/div/div[2]/div[16]/button[3]"))
    				.click();
    		Thread.sleep(1000);

    		// Step 1: Open a new tab using JavaScript
    		((JavascriptExecutor) Driver).executeScript("window.open();");

    		// Step 2: Get all the open tabs
    		ArrayList<String> tabs = new ArrayList<String>(Driver.getWindowHandles());

    		// Step 3: Switch to the new tab (last tab in the list)
    		Driver.switchTo().window(tabs.get(tabs.size() - 1));

    		// Step 4: Perform the next execution in the new tab
    		Driver.get("https://test-a-tag.com/");
    		Thread.sleep(1000);
    		
    		String html1 = "<!DOCTYPE html>\n"
    				+ "<html>\n"
    				+ "<head>\n"
    				+ "<title>Page Title</title>\n"
    				+ "</head>\n"
    				+ "<body>\n"
    				+ "\n"
    				+ "";
    		
    		String html2 = "\n"
    				+ "</body>\n"
    				+ "</html>";
    		
    		
    		
    		// test-a-tag
    		Driver.findElement(By.xpath("/html/body/div/div/div[1]/textarea")).sendKeys(html1 + copiedValue + html2);
    		Thread.sleep(1000);
    		
    		Driver.findElement(By.xpath("/html/body/div/ul/li[2]/button")).click();
    		Thread.sleep(1000);
    		
    		Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/i")).click();
    		Thread.sleep(1000);
        	break;
        	
        case 2:
        	System.out.println("VAST pull tag process start"
        			+ "\n=========================================");
        	
        	
        	//secure tag
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[8]/div/div[2]/div[5]/div/select")).click();
    		Thread.sleep(1000);
    		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[8]/div/div[2]/div[5]/div/select/option[2]")).click();
    		Thread.sleep(1000);
    		
    		//copy VAST TAG
    		WebElement copy = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[8]/div/div[2]/div[5]/div/textarea"));
    		Thread.sleep(1000);
    		
    		//modify vast tag 
    		String inputValue = copy.getAttribute("value");
            System.out.println("Value from the input field: " + inputValue);
            String randomString = invetorysiteName.getInventoryName();
            String updatedUrl = inputValue
                    .replace("{cb}", "1234")
                    .replace("{pageUrl}", randomString)
                    .replace("{width}", "250")
                    .replace("{height}", "300");
            
            
            System.out.println(updatedUrl);
           

    		// Step 1: Open a new tab using JavaScript
    		((JavascriptExecutor) Driver).executeScript("window.open();");

    		// Step 2: Get all the open tabs
    		ArrayList<String> tabs1 = new ArrayList<String>(Driver.getWindowHandles());

    		// Step 3: Switch to the new tab (last tab in the list)
    		Driver.switchTo().window(tabs1.get(tabs1.size() - 1));

    		// Step 4: Perform the next execution in the new tab
    		Driver.get("https://tools.springserve.com/tagtest");
    		Thread.sleep(1000);
    		
    		//paste updated script
    		Driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[1]/textarea")).sendKeys(updatedUrl);
    		Thread.sleep(1000);
    		
    		//submit button
    		Driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[3]/div[1]/button")).click();
    		Thread.sleep(1000);
    
        	break;
        	
        case 3:
        	break;
        	
        default:
            System.out.println("Invalid pull tag selection."
            		+ "\n=========================================");
            break;
        	
		}

	}

}
