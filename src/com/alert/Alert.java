package com.alert;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
static WebDriver driver ;
		public  static void launch() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
		
	}
	 public static void alert_methods() throws InterruptedException {
//		driver.findElement(By.className("")).click();
		 driver.findElement(By.xpath("//a[text ()='Alert with Textbox ']")).click();
//		 driver . findElement(By. xpath("//button [@onclick = 'alertbox()']")).click();
//		 Thread.sleep(2000);
//	driver.switchTo() .alert() ;
	
	
	
	
	}
	
		
	
	public static void main(String[] args) throws InterruptedException {
		launch();
		alert_methods();
	}
	
	
	
	
	
	
}
