package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	static WebDriver driver;
	
	public void launch() {
		System.setProperty("wedriver.chrome.driver",
				"C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
//		takescreenshot - lower interface
//		getscreenshot - method - outputtype - interface.file 
//		file - class
		
		
		
		
		
	}
	
	public static void scrsht ()  throws IOException{
		
		
		TakesScreenshot s = (TakesScreenshot) driver ;
		
		File source = s.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\screens");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
