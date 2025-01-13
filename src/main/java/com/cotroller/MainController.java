package com.cotroller;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Entity.InventoryName;
import com.autocreation.AdunitCreation;
import com.autocreation.InventoryCreation;
import com.autocreation.Mapping;
import com.autocreation.PullTag;
import com.autocreation.UserLogin;


public class MainController {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://consolebeta.incrementx.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		InventoryName invetorysiteName = new InventoryName();

		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
		WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("Emailid")));

		UserLogin newlogin = new UserLogin();
		InventoryCreation Inventory = new InventoryCreation();
		AdunitCreation adunit = new AdunitCreation();

		Mapping mapping = new Mapping();
		PullTag tag = new PullTag();

		System.out.println("login started"
				+ "\n=========================================");
		newlogin.login(Driver);

		System.out.println("login success"
				+ "\n=========================================");
		Thread.sleep(5000);

		System.out.println("create new inventory"
				+ "\n=========================================");

		Inventory.inventory(Driver, invetorysiteName);

		System.out.println("Inventory creationn success"
				+ "\n=========================================");
		Thread.sleep(5000);

		System.out.println("create adnuit start --- "
				+ "\n=========================================");

		if (invetorysiteName.getInventoryName() == null || invetorysiteName.getInventoryName().isEmpty()) {
			System.out.println(invetorysiteName);
			invetorysiteName.setInventoryName("mintsites.com");
			Driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a/b")).click();
		}

		adunit.CreateAdunit(Driver, wait, invetorysiteName, Inventory);
		System.out.println("adunit created successuffly"
				+ "\n=========================================");

		System.out.println("going to mapping page"
				+ "\n=========================================");
		mapping.OptMapping(Driver, wait, invetorysiteName, Inventory);
		System.out.println("mapping complete"
				+ "\n=========================================");

		System.out.println("pull tag process starts"
				+ "\n=========================================");
		tag.GetTag(Driver, wait, invetorysiteName, Inventory);
		System.out.println("Ad rendered");
	}

}
