package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Particularcolumn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/table");
		
		WebElement table = driver.findElement(By.id("simpletable"));
		System.out.println("**************HEADING********************");
		List<WebElement> HEADERS=table.findElements(By.tagName("th"));
		for (WebElement header : HEADERS) {
			String text = header.getText();
			System.out.println(text);
			}
		System.out.println("**************ALL ROWS*******************");
		List<WebElement>allrows=table.findElements(By.xpath("(//table/tbody)[2]"));
		int size = allrows.size();
		System.out.println("Row size:"+size);
		if (size == 3) {
			System.out.println("pass");
		}else System.out.println("fail");
		for (WebElement row : allrows) {
			List <WebElement> column =row.findElements(By.tagName("td"));
			WebElement firstcolum = column.get(0);
			System.out.println(firstcolum.getText());
			
		}
			
		}
			
			
		}
			
			
		
			
		
	


