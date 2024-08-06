package com.Dropdown;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.webelementconcept.Webelement;

import net.bytebuddy.implementation.bytecode.Throw;

public class selenium__Dropdown {
	
	static WebDriver driver ;
	

	

	public static void  launch () {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe") ;
		  driver = new ChromeDriver() ; 
		  driver .get ("https://www.facebook.com/");
		  
	}
		
		public static void DD_method()throws InterruptedException{
		driver.findElement(By.xpath("//a[text()='create new account']")).click()	;
		Thread.sleep(2000);
		  
		
		WebElement month = driver.findElement(By.xpath("//select[@ id =' month']"));
		Select s = new Select (month);
		s.selectByIndex(12);
		Thread.sleep(2000);
		s.selectByValue("5");
		Thread.sleep(2000);
		s.selectByVisibleText("8"); }
		
		
		
		public static void main(String[] args) throws InterruptedException {
			selenium__Dropdown d = new selenium__Dropdown();
			d.launch();
			DD_method();
			
			
			
			
			
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


