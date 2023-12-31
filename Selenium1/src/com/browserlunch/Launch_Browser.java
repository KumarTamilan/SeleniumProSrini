package com.browserlunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\kumar\\Downloads\\11Selenium\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.netflix.com/in/");
		driver.get("http://www.kalyanmatrimony.com/");
		driver.get("http://www.tamilmatrimony.com/");
		driver.get("http://www.hotstar.com/");
		driver.get("http://adactinhotelapp.com/");
		System.out.println("success");
	}

}
