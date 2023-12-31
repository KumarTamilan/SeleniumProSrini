package com.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Concept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit Wait

		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Kumarankkk");
		driver.findElement(By.name("password")).sendKeys("Kumar9999");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, 50); //Explicit Wait
		WebElement text = driver.findElement(By.xpath("//input[@value='Hello Kumarankkk!']"));
		wait.until(ExpectedConditions.visibilityOf(text));

		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9578608914");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9964928642");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		WebElement text2 = driver.findElement(By.xpath("//span[text()='Kumarvictar Mettur']"));
		wait1.until(ExpectedConditions.visibilityOf(text2));

		driver.navigate().to("https://in.linkedin.com");
		driver.findElement(By.xpath("(/html/body/main/section/div/div/form/div/div/div/div/input)[1]")).sendKeys("kumarkaruppannan38@gmail.com");
		driver.findElement(By.xpath("/html/body/main/section/div/div/form/div/div[2]/div/div/input")).sendKeys("Karuppannan123");
		driver.findElement(By.xpath("/html/body/main/section/div/div/form/div[2]/button")).click();
		WebDriverWait waitt = new WebDriverWait(driver,50);
		WebElement text3 = driver.findElement(By.xpath("//a[text()='Sign in']"));
		waitt.until(ExpectedConditions.visibilityOf(text3));

	}

}
