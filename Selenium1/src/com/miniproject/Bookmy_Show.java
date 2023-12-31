package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmy_Show {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\11Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.findElement(By.xpath("//img[@alt='Salaar: Cease Fire - Part 1']")).click();
		
	}
}
