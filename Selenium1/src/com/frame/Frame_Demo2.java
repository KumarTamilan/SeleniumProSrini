package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/iframe/");
		//Frame:
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("Kumaran");
		driver.switchTo().defaultContent();
		//Alert:
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		//Frame:
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("Muruga");
		
		

	}

}
