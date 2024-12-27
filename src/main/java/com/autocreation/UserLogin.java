package com.autocreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class UserLogin {

	String userName = "pubnx@vertoz.com";
	String password = "ixbidder@123";

	public void login(WebDriver Driver) throws InterruptedException {
		
		
		Driver.findElement(By.id("Emailid")).sendKeys(userName);
		Thread.sleep(1000);
		Driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		Driver.findElement(By.className("pubnxLoginBtn")).click();
		Thread.sleep(1000);
		
		//Forgot password
		
		if (password != password) {
		System.out.println(Driver.findElement(By.cssSelector("span#Error")).getText());
		Driver.findElement(By.linkText("Forgot Password?")).click();
		Driver.findElement(By.xpath("//*[@id=\"email3\"]")).sendKeys(userName);
		}
	}
}
