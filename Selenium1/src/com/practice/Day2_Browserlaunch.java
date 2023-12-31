package com.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Browserlaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kumar123");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String source = driver.getPageSource();
		System.out.println(source);
		String title = driver.getTitle();
		System.out.println(title);
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
	}

}
