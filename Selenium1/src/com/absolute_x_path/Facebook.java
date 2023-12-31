package com.absolute_x_path;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"))
		.sendKeys("kumaran");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"))
		.sendKeys("9578608914");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();
		
		TakesScreenshot tsst =(TakesScreenshot) driver;
		File source = tsst.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\Selenium\\src\\Screenshot\\facebook2.png");
		FileUtils.copyFile(source, destination);
	}

}
