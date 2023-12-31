package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9578608914");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9964928642");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
		TakesScreenshot Tsst = (TakesScreenshot) driver;
		File source = Tsst.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\kumar\\Downloads\\Selenium\\src\\Screenshot\\facebook.png");
		FileUtils.copyFile(source, Destination);
	}

}
