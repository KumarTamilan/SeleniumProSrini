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

public class Mini_Project4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String a = "orange";
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		if (url.contains(a)) {
			WebElement user = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]"));
			System.out.println(user.getText());
			WebElement user1 = driver.findElement(By.xpath("(//label[@class='oxd-label'])[1]"));
			System.out.println(user1.getText());
			String x = "Username : Admin";
			String y = "Username";
			if (x.contains(y)) {
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(x.substring(11));

			}else {
				driver.close();
			}
			WebElement pass = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[2]"));
			System.out.println(pass.getText());
			WebElement pass1 = driver.findElement(By.xpath("(//label[@class='oxd-label'])[2]"));
			System.out.println(pass1.getText());
			String u = "Password : admin123";
			String v = "Password";
			if (u.contains(v)) {
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(u.substring(11));	
			}else {
				driver.close();
			}
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
			Thread.sleep(6000);
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File Destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\orange.png");
			FileUtils.copyFile(source, Destination);
			
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			driver.close();
				
			}

		}
	}


