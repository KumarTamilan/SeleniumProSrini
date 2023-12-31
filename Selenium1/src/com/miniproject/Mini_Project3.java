package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\11Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String a = "https://www.cowin.gov.in/";
		String b = "CoWiN";
		String tolowercase = b.toLowerCase();
		System.out.println(tolowercase);

		driver.get("https://www.cowin.gov.in/");
		
		if (a.contains(tolowercase)) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			WebElement text = driver.findElement(By.xpath("//h1[text()='Search Your Nearest Vaccination Center']"));
			jse.executeScript("arguments[0].scrollIntoView();", text);
			jse.executeScript("window.scrollBy(0,950);");
		
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='mat-select-value-5']")).click();
			driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("(//mat-select[@role='combobox'])[4]")).click();
			driver.findElement(By.xpath("//span[text()=' Chennai ']")).click();
			
			Thread.sleep(5000);
			TakesScreenshot tss = (TakesScreenshot) driver;
			File source =tss.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Cowin1.png");
			FileUtils.copyFile(source, destination);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Search']")).click();	
			
			Thread.sleep(5000);
			JavascriptExecutor jj = (JavascriptExecutor) driver;
			WebElement date = driver.findElement(By.xpath("(//p[text()=' Mon, 30 Oct '])[2]"));
			jj.executeScript("arguments[0].scrollIntoView();", date);
			jj.executeScript("window.scrollBy(0,650);");
			
			Thread.sleep(5000);
			TakesScreenshot tss1 = (TakesScreenshot) driver;
			File source1 =tss1.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Cowin2.png");
			FileUtils.copyFile(source1, destination1);
			
			driver.close();
			

		}
	}

}
