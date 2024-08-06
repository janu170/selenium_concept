package com.login;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	static WebDriver driver ;
	public static void browserlaunch() {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window() .maximize();
	driver.get("https://www.facebook.com/");
	
		
	}
	
   public static void input () {
	
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("janu");
	   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("janu3030");
}
	public static void submit() {
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	public static void main(String[] args) {
		browserlaunch();
		input();
		submit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
