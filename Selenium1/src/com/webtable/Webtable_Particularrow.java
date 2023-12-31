package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Particularrow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");
		System.out.println("**********************PARTICULAR ROW*************************");
		List<WebElement> findelements =driver.findElements(By.xpath("(//table/tbody)[2]/tr[2]"));
		for (WebElement webElement : findelements) {
			System.out.println( webElement.getText());
	}

}
}
