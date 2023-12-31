package com.screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Kumarankkk");
		driver.findElement(By.xpath("(//input[contains(@class,'login_input')])[2]")).sendKeys("Kumar9999");
		driver.findElement(By.xpath("//input[contains(@class,'login_button')]")).click();

		TakesScreenshot tss = (TakesScreenshot) driver;
		File inception = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\kumar\\Downloads\\Selenium\\src\\Screenshot\\adactin.png");
		FileUtils.copyFile(inception, dest);
	

		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File destination = new File("");
		 * FileUtils.copyFile(source, destination);
		 */
	}

}
