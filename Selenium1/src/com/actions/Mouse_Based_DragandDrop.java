package com.actions;

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
import org.openqa.selenium.interactions.Actions;

public class Mouse_Based_DragandDrop {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement Drag = driver.findElement(By.xpath("(//img[@draggable='true'])[1]"));
		WebElement Drop = driver.findElement(By.xpath("//div[@class='dragged']"));
		Actions as = new Actions(driver);
		as.dragAndDrop(Drag, Drop).build().perform();
		
		WebElement Drag1 = driver.findElement(By.xpath("(//img[@draggable='true'])[2]"));
		WebElement Drop1 = driver.findElement(By.xpath("//div[@class='dragged']"));
		Actions as1 = new Actions(driver);
		as1.dragAndDrop(Drag1, Drop1).build().perform();
		
		WebElement Drag2 = driver.findElement(By.xpath("(//img[@draggable='true'])[3]"));
		WebElement Drop2 = driver.findElement(By.xpath("//div[@class='dragged']"));
		Actions as2 = new Actions(driver);
		as2.dragAndDrop(Drag2, Drop2).build().perform();
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\Selenium\\src\\Screenshot\\DragandDrop.png");
		FileUtils.copyFile(source, destination);
		
		
	}

}
