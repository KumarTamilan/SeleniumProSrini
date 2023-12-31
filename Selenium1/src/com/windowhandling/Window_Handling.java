package com.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement Sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		Actions As = new Actions(driver);
		As.contextClick(Sell).build().perform();
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		String Parentid = driver.getWindowHandle();
		System.out.println(Parentid);
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);

		for (String id : allid) {
			if (!id.equals(Parentid)) {
				driver.switchTo().window(id);
				

		WebElement deals = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		Actions As1 = new Actions(driver);
		As1.contextClick(deals).build().perform()
		;
		Robot rt1 = new Robot();
		
		rt1.keyPress(KeyEvent.VK_DOWN);
		rt1.keyRelease(KeyEvent.VK_DOWN);
		rt1.keyPress(KeyEvent.VK_ENTER);
		rt1.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allid1 = driver.getWindowHandles();
		System.out.println(allid1);

	
			}
		}
	}

}
