package com.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	static WebDriver driver;
	public static void launch () {
		
		System .setProperty("webdriver.chrome.driver","C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement();
		
	
	}
		public static void key_boardactions() throws AWTException {
			
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("amazon");
		Robot d = new Robot();
		d.keyPress(KeyEvent.VK_ENTER);
			
		}
	
	public static void dd_method() {
		driver.findElement(By.xpath("//span[@class='x2VHCd OSrXXb ob9lvb']")).click();
		
	}
	
	public static void innerpath () throws InterruptedException {
		
		WebElement scroll = driver.findElement(By.xpath("//a[@class='nav_a'] "));
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(3000);
		jss.executeScript("window.scrollBy(0,-100)");
	}
	
	
	
		public static void main(String[] args) throws AWTException, InterruptedException {
			launch();
		key_boardactions();
		dd_method();
		innerpath();
		}
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


