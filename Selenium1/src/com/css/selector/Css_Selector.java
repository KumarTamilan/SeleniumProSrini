package com.css.selector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("[id^='em']")).sendKeys("9867586756");
		driver.findElement(By.cssSelector("[name$='ss']")).sendKeys("9759686758");
		driver.findElement(By.cssSelector("[type*='ubm']")).click();

		driver.navigate().to("https://in.linkedin.com");
		driver.findElement(By.cssSelector("[name$='key']")).sendKeys("Kumaran666");
		driver.findElement(By.cssSelector("[autocomplete^='curr']")).sendKeys("95786089");
		driver.findElement(By.cssSelector("[type*='bmit']")).click();

		driver.navigate().to("https://adactinhotelapp.com/");
		driver.findElement(By.cssSelector("[name*='ser']")).sendKeys("Kumaran66");
		driver.findElement(By.cssSelector("[type^='pas']")).sendKeys("Kumaran555");
		driver.findElement(By.cssSelector("[type$='it']")).click();

	}

}
