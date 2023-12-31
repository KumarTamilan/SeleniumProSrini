package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Hotel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Kumarankkk");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Kumar9999");
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		driver.findElement(By.xpath("//select[@name='location']")).sendKeys("Newyark");
		
	}

}
