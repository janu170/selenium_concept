 package com.adaction;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
import com.webelementconcept.Webelement;

public class hotelapp {

	static WebDriver driver;

	public static void browserlaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/SearchHotel.php");

		driver.manage().window().maximize();

	}

	public static void login() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin1122");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bgopi@2109");
		driver.findElement(By.xpath("//input[@name='login']")).click();

	}

	public static void searchhotel() throws InterruptedException {

		driver.findElement(By.xpath("//select[@name='location']"));
	
		
		
		
		
		
		WebElement searchhotels = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(searchhotels);
		s.selectByIndex(5);
		Thread.sleep(1000);

		WebElement SearchHotal = driver.findElement(By.xpath("(//select[@name='hotels'])[1]"));
		Select s1 = new Select(SearchHotal);
		Thread.sleep(1000);
		s1.selectByIndex(2);

		WebElement selectRoomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(selectRoomType);
		s2.selectByVisibleText("Double");
		Thread.sleep(1000);

		WebElement selectRoomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(selectRoomno);
		s3.selectByIndex(6);
		Thread.sleep(1000);

//	driver.findElement(By.xpath("(//input[@type='text'] )[2 ]")).sendKeys("30/7/2024");
//	driver.findElement(By.xpath("(//input[@type='text'] )[3 ]")).sendKeys("04/8/2024");

		WebElement AdultsperRoom = driver.findElement(By.xpath("(//select[@name='adult_room'])[1]"));
		Select s4 = new Select(AdultsperRoom);
		Thread.sleep(1000);
		s4.selectByIndex(3);

		WebElement childrenPerRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(childrenPerRoom);
		s5.selectByVisibleText("4 - Four");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='Submit']")).click();

	}

	public static void selectHotel() {
		driver.findElement(By.xpath("//input[@type='radio']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	public static void BookHotel() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("janani");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("sri");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("vadapalani,chennai");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567891058931");
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6 = new Select(cctype);
		s6.selectByVisibleText("VISA");
		Thread.sleep(1000);

		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7 = new Select(month);
		s7.selectByIndex(6);
		Thread.sleep(1000);

		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8 = new Select(year);
		s8.selectByVisibleText("2030");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("492");
//		driver.findElement(By.xpath("//input[@type='button']")).click();
//		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	}

//	public static void bookingConfirmation() {
//
////		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
//
//	}
//
//	public static void my_Itinerary() throws InterruptedException {
//		driver.findElement(By.xpath("(//input[@id='my_itinerary'])[1]")).click();
//		TakesScreenshot tc = (TakesScreenshot) driver;
//
//		tc.getScreenshotAs(OutputType.FILE);
//		File source = new File("C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Screenshot");
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//input[@name='logout']")).click();
//
//	}
	private static void BookingHotal() throws InterruptedException, IOException {
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(1000);
		TakesScreenshot Tsrc = (TakesScreenshot) driver; // Syntax
		File srsc  = Tsrc.getScreenshotAs(OutputType.FILE);// to take screen shot
		FileUtils.copyFile(srsc,new File("C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Screenshot\\janu18.png") );

	}

	private static void logOutPg() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		Thread.sleep(1000);
		TakesScreenshot Tsc = (TakesScreenshot) driver; // Syntax
		File srSC = Tsc.getScreenshotAs(OutputType.FILE);// to take screen shot
		File srDr = new File("C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Screenshot\\janu17.png");
		FileUtils.copyFile(srSC,new File("C:\\Users\\malat\\eclipse-workspace\\selenium__concept\\Screenshot\\janu18.png") );

		
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		


	}
	public static void main(String[] args) throws InterruptedException, IOException {

		browserlaunch();
		login();
		searchhotel();
		selectHotel();
		BookHotel();
		BookingHotal();
		logOutPg();
		

	}

}
