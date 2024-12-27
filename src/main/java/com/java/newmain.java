package com.java;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class newmain {
	
	public static void main(String[] args) {
		
		//Invoking browser
		//Chrome - ChromeDriver exten -> method close get
		//FireFox - FirefoxDriver  -> method close get
		//safari - safariDriver exten -> method close get
		//webdriver method + class method
		
		
		
		//chromedriver.exe -> Chrome browser
		//System.setProperty("webdriver.chrome.driver", "/home/vr-lt-182/Downloads/chromedriver-linux64.exe");
		
		//webdriver.chrome.driver -> value of path 
		WebDriver Driver = new ChromeDriver();
		
		
		//firefox launch 
		//geckodriver
		
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "/home/vr-lt-182/Downloads/Geckodriver.exe");
		//WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://consolebeta.incrementx.com/");
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		Driver.close();
		
		
		
	}
	

}
