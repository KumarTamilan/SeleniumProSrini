package com.browserlunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_Fox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kumar\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.techtarget.com/searchapparchitecture/definition/software");
		driver.quit();
		System.out.println("success");
	}

}
