package com.dynamicxpath;

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

public class Dynamic_Xpath {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("(//h2[contains(text(),'Facebook')]//parent::div//following-sibling::div//"
				+ "child::div//child::div//child::form//child::div//child::div//child::input)[1]")).sendKeys("KumaraN");

		WebElement findElement = driver.findElement(By.xpath(
				"(//a[contains(text(),'Fo')]//parent::div//preceding-sibling::div//child::div//child::input)[2]"));
		findElement.sendKeys("Kumaran12345");

		WebElement findElement2 = driver.findElement(
				By.xpath("(//a[@role='button'])[2]//" + "parent::div//preceding-sibling::div//ancestor::button"));
		findElement2.click();

		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Dynamic.png");
		FileUtils.copyFile(source, destination);

		driver.close();
	}

}
