package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/frame");
		
		//Frame(index):
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("Kumaran");
		driver.switchTo().defaultContent();
		
		//Frame(id):
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Maaran");
		driver.switchTo().defaultContent();
		
		//Frame(WebElement):
		WebElement webelement = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(webelement);
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("12345");
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kumaranharsh123@gmail.com");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("Kumaran");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Maaran");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		
		
		
	}

}
