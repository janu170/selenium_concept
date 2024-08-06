package com.frames;

import java.sql.ResultSetMetaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Frames {
	static WebDriver driver  ; 
	
	public  static void  launch () {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver . get("https://letcode.in/frame");
		
		
	}
	 
	public static void frames () {
		
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("janu");
		

		
		driver.findElement(By.name("lname")).sendKeys("sri");
		driver.switchTo().frame("innerFrame");
		
	driver.findElement(By.name("email")).sendKeys("malathi2@gmail.com");
	
		
		
	}
	
	public static void main(String[] args) {
		
		launch();
		frames();
	}
	
	
	
	
	
	
	

}
