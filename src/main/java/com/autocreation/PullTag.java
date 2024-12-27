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

	public void GetTag(WebDriver Driver, WebDriverWait wait, InventoryName invetorysiteName)
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

		String copiedValue = null;
		try {
			// copy tag from pull tag
			WebElement copyButton1 = Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[7]/div/div[2]/div[8]/div/button"));
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
		Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form[1]/div/div/div[7]/div/div[2]/div[15]/button[3]"))
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
		Driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/textarea")).sendKeys(html1 + copiedValue + html2);
		Thread.sleep(1000);
		
		
		Driver.findElement(By.xpath("/html/body/div[2]/ul/li[4]/button/span[2]")).click();
		Thread.sleep(1000);

	}

}
