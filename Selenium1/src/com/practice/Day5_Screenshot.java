package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.metturdiary.com/2018/03/arulmigu-badrakali-amman-temple-in-mecheri.html");
		driver.findElement(By.xpath("//img[@alt='mecheri arulmigu badrakaliamman temple photos']")).click();
		
		Thread.sleep(6000);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File Source = tss.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Amman.png");
		FileUtils.copyFile(Source, Destination);
		
	}

}
