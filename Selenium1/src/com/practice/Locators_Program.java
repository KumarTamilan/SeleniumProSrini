package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Program {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("Kumarankkk");
		driver.findElement(By.id("password")).sendKeys("Kumar9999");
		driver.findElement(By.id("login")).click();

		driver.findElement(By.name("username")).sendKeys("Kumarankkk");
		driver.findElement(By.name("password")).sendKeys("Kumar9999");
		driver.findElement(By.name("login")).click();

		driver.findElement(By.className("login_input")).sendKeys("Kumarankkk");
		driver.findElement(By.name("password")).sendKeys("Kumar9999");
		driver.findElement(By.className("login_button")).click();

	}

}
