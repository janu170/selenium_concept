package com.actionsconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	
	
	static WebDriver driver ; 
	
	public static void browesrlaunch () {
		
		
	System . setProperty("webdriver.chrome.driver", "C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe" );
		
	driver = new ChromeDriver();
driver.get("https://www.amazon.in/");

Actions  s = new Actions();
			
	
	
	
	}

	
	}
	
	
	


