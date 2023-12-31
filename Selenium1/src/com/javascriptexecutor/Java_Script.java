package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement connect = driver.findElement(By.xpath("(//div[@class='navFooterColHead'])[2]"));
		jse.executeScript("arguments[0].scrollIntoView();", connect);
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500);");
		jse.executeScript("window.scrollBy(0,-500);");
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9895857648");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9986950699");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		jse.executeScript("window.scrollBy(0,5000);");
		jse.executeScript("window.scrollBy(0,-5000);");
		}

}
