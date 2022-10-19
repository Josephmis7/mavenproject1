package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	static WebDriver driver;
	
	
	
	@BeforeClass
	public static void test1() {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	}
	
	
	@AfterClass
	public static void test2() {
		
		driver.close();
		
		
	}
	@Before
	public void test3() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@After
	public void test4() {
	Date d = new Date();
	System.out.println(d);
	

	}
	
	
	@Test
	public void test5() {
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("greens123@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		
		driver.findElement(By.name("login")).click();

	}
	
		
		
		
		
	}


