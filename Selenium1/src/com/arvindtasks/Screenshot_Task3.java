package com.arvindtasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Task3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\kumar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Testing4.png");
		FileUtils.copyFile(source, destination);
		
		driver.navigate().to("https://www.swiggy.com/");
		Thread.sleep(4000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Testing5.png");
		FileUtils.copyFile(source1, destination1);
		
		driver.navigate().to("https://www.zomato.com/india");
		Thread.sleep(4000);
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Testing6.png");
		FileUtils.copyFile(source2, destination2);
		
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		
		
		/*
		 * TakesScreenshot ts3 = (TakesScreenshot) driver; File source3 =
		 * ts3.getScreenshotAs(OutputType.FILE); File destination3 = new
		 * File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Testing7.png"
		 * ); FileUtils.copyFile(source3, destination3);
		 */
		
		
	}

}
