package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Based_MovetoElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\11Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		WebElement Mens = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
	
		Actions as = new Actions(driver);
		
		as.moveToElement(Mens).build().perform();
		WebElement Tshirts = driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]"));
		as.click(Tshirts).build().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement Men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		as.moveToElement(Men).build().perform();
		WebElement casual = driver.findElement(By.xpath("//a[text()='Casual Shirts']"));
		as.click( casual ).build().perform();
	}

}
