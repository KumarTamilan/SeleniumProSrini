package com.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement singledropdown = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select s = new Select(singledropdown);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("Apple");
		Thread.sleep(2000);
		s.selectByVisibleText("Yahoo");
		Thread.sleep(2000);
		s.selectByIndex(0);
		WebElement singledropdown1 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		Select s1 = new Select(singledropdown1);
		
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByValue("babycat");
		Thread.sleep(2000);
		s1.selectByVisibleText("Big Baby Cat");
		Thread.sleep(2000);
		s1.selectByIndex(3);
		System.out.println("***********This is Single DropDown**********************");
	}

}
