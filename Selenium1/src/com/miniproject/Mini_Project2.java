package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project2 {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\11Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String a = "https://www.facebook.com/";
		String b = "FaceBoOK";
		String equal = b.toLowerCase();
		System.out.println(equal);
		boolean cont = a.contains(equal);
		System.out.println(cont);

		driver.get("https://www.facebook.com/");
		if (a.contains(equal)) {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ffutfu");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kyufukc345");
			driver.findElement(By.xpath("//button[@name='login']")).click();
		} else {

		}
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\FB1.png");
		FileUtils.copyFile(source, destination);

		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		driver.findElement(By.xpath("//div[text()='Sign Up']"));
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		WebElement signUp1 = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		String text = signUp1.getText();
		System.out.println(text);
		
		WebElement signUp2 = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		String text2 = signUp2.getText();
		System.out.println(text2);
		
		if (text.equals(text2)) {
			
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("hdjsjfkd");
			driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("lkjhgfd");
			WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select s = new Select(day);
			s.selectByIndex(10);
			WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select s1 = new Select(month);
			s1.selectByIndex(10);
			WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select s2 = new Select(year);
			s2.selectByIndex(10);
			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
			driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
			Thread.sleep(5000);
			TakesScreenshot tss = (TakesScreenshot) driver;
			File source1 = tss.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\FBB1.png");
			FileUtils.copyFile(source1, destination1);

			driver.findElement(By.xpath("//img[@height='24']")).click();
			driver.close();

		}else {
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("jdhfg");
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("kjfhfj");
		} 
		}

	}
