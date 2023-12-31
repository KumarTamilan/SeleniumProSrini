package com.browserlunch;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.netflix.com/in/");
		String amma = driver.getTitle();
		System.out.println(amma);
		String amma1 = driver.getCurrentUrl();
		System.out.println(amma1);

		/*
		 * String source = driver.getPageSource(); 
		 * System.out.println(source);
		 * 
		 * String handle = driver.getWindowHandle();
		 *  System.out.println(handle);
		 */
		Set<String> handles = driver.getWindowHandles();
		System.out.println( handles );
	
	}

}
