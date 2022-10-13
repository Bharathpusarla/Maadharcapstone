package com.adh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AadharAdmin {
	static WebDriver webdriver = null;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\Documents\\chrome web drive\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	@Test
	public void TestHome() {
		webdriver.get("http://localhost:4200/home");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/a[3]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.get("http://localhost:4200/adminlogin");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("admin")).sendKeys("Bharath");
		webdriver.findElement(By.id("password")).sendKeys("Bharath@123");
		webdriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		

	}



}