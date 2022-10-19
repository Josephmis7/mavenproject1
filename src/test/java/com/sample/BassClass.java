package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
	
	static WebDriver driver;
	static WebElement findElement;
	
	
public static void browserLaunch(String browserName) {
		
	switch (browserName) {
	
	case"chrome":
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		break;
		
		
	case"firefox":
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		break;
		
		
		
	case"edge":
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		
		break;
	}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
}

	
       public static void launchUrl(String url) {
    	   
    	   driver.get(url);
    	   
       
       }
       
       public static WebElement locators(String locatorName, String Value){
    	   
    	   switch(locatorName) {
    	   
    	   case"id":
    		   
    		   findElement = driver.findElement(By.id(Value));
    		   
    		   break;
    		   
    		   
    	   case"name":
    		   
    		   findElement = driver.findElement(By.name(Value));
    		   
    		   break;
    		   
    	   case "xpath":
    		   
    		   findElement = driver.findElement(By.xpath(Value));
    		   
    		   break;
    			   
    		   
       }
		return findElement;
       }
		
		public static void typeText(WebElement ref, String data) {
			
			ref.sendKeys(data);
			
			
			
		}
    	   
       public static void btnClick(WebElement ref) {
    	   
    	   ref.click();
       
}


   public void byValue(WebElement ref,String value) {
	   
	   Select s = new Select(ref);
	   
	   s.selectByValue(value);
	   
	   
   }
   
     public void byIndex(WebElement ref, int indexvalue) {
    	 
    	 Select s1= new Select(ref);
    	 s1.selectByIndex(indexvalue);
    	 
    	 
    	 
    	 
    	 
     }
     public void byText(WebElement ref, String value) {
    	 
    	 Select s2= new Select(ref);
    	 s2.selectByVisibleText(value);
    	 
    	 
     }
     
     public static void clear(WebElement ref) {
    	 ref.clear();
     }
}
