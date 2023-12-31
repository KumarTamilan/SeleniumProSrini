package com.draganddrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\SeleniumProject\\Chromedriver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	
	 WebElement MultipleDropDown=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
	 Select s3 = new Select(MultipleDropDown);
	 boolean multiple=s3.isMultiple();
	 System.out.println(multiple);
	 System.out.println("GetOptions");
	 Thread.sleep(2000);
	 s3.selectByIndex(3);
	 Thread.sleep(2000);
	 s3.selectByValue("burger");
	 Thread.sleep(2000);
	 s3.selectByVisibleText("Donut");
	 List<WebElement> options=s3.getOptions();
	 for (WebElement OnebyOne : options) {
		 System.out.println(OnebyOne.getText());
		}
	 System.out.println("GetAllSelectedOptions");
	 List<WebElement>allselectedoptions=s3.getAllSelectedOptions();
	 for (WebElement multipleoption : allselectedoptions) {
		 System.out.println(multipleoption.getText());
		}
	 System.out.println("GetFirstSelectedOption");
	WebElement firstselectedoption=s3.getFirstSelectedOption();
	System.out.println(firstselectedoption.getText());
	s3.deselectByValue("burger");
	System.out.println("************************Multiple DropDown Completed*************************");
	 }

}


