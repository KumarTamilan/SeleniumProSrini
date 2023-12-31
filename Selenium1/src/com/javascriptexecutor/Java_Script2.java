package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://moviesda8.net/");
		
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		jc.executeScript("arguments[0].scrollIntoView();", contact);
		Thread.sleep(2000);
		jc.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(2000);
		jc.executeScript("window.scrollBy(0,1000);");
			
	}

}
