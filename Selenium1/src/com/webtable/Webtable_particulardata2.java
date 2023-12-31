package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_particulardata2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		System.out.println("***************************TASK-1*******************************");
		WebElement findElement = driver.findElement(By.xpath("//table/tbody/tr[61]/td[3]"));
		System.out.println(findElement.getText());

		System.out.println("***************************TASK-2*******************************");
		List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr[85]"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
		System.out.println("***************************TASK-3*******************************");
		WebElement findElement2 = driver.findElement(By.xpath("//table/tbody/tr[132]/td[5]"));
		System.out.println(findElement2 .getText());
		
		System.out.println("***************************TASK-4*******************************");
		WebElement findElement3 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]"));
		System.out.println( findElement3.getText());
		
		System.out.println("***************************TASK-5*******************************");
		WebElement findElement4 = driver.findElement(By.xpath("//table/tbody/tr[197]/td[2]"));
		System.out.println(findElement4.getText());
		System.out.println("******************************************************************");

	}

}
