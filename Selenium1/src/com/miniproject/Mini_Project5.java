package com.miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project5 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		List<WebElement> onebyone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (WebElement webElement : onebyone) {
			System.out.println(webElement.getText());
		}
		WebElement find = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		Actions a = new Actions(driver);
		a.contextClick(find).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> allid = driver.getWindowHandles();
		System.out.print(allid);

		for (String string : allid) {
			if (!string.equals(parent)) {
				driver.switchTo().window(string);
			}
		}
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source1 = tss.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\FlipKart1.png");
		FileUtils.copyFile(source1, destination1);

		Thread.sleep(6000);
		driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();

		Thread.sleep(10000);
		TakesScreenshot tss2 = (TakesScreenshot) driver;
		File source2 = tss2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\FlipKart2.png");
		FileUtils.copyFile(source2, destination2);

		 driver.close();

	}

}
