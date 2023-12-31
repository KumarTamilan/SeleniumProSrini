package com.arvindtasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Task2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\kumar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Testing2.png");
		FileUtils.copyFile(source, destination);
		
		driver.navigate().to("https://aws.amazon.com/");
		Thread.sleep(10000);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source1 = tss.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Testing3.png");
		FileUtils.copyFile(source1, destination1);
		
	}

}
