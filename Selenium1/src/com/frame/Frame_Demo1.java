package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Java");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		
		WebElement element = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Automation");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Frames");
		driver.switchTo().defaultContent();
		
		
		
	}

}
